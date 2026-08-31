package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.ast.ASTNode;
import org.example.codegen.CodeGenerator;
import org.example.context.PythonContextExtractor;
import org.example.reporting.CompilerReportWriter;
import org.example.semantic.PythonSemanticAnalyzer;


import org.example.gen.FlaskLexer;
import org.example.gen.FlaskParser;
import org.example.gen.python.pythonLexer;
import org.example.gen.python.pythonParser;
import org.example.visitor.ASTBuilder;
import org.example.visitor.PythonASTBuilder;

import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.lang.reflect.Type;
import java.nio.file.*;
import java.nio.file.StandardCopyOption;

import java.time.LocalDateTime;
import java.util.*;

import java.util.stream.Collectors;

public class Main {


    private static final Map<String, Map<String, Object>> templateContexts = new LinkedHashMap<>();


    public static void main(String[] args) {
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.println("   Flask & Jinja2 Compiler — Full Pipeline");
        System.out.println("════════════════════════════════════════════════════════════════════════════════\n");


        String pythonFile = "testFiles/app.py";
        String runtimePythonFile = "testFiles/runtime_app.py";
        String cssFile = "testFiles/static/style.css";
        String jsFile = "testFiles/static/interactive_addition.js";
        String productsJsonFile = resolveProductsJsonPath(args);

        cleanOutputDirectory();


        System.out.println("══ [STAGE 1] Python Analysis ══");
        compilePython(pythonFile);
        loadProductsFromJson(productsJsonFile);
        System.out.println("  Python context keys: " + templateContexts.keySet() + "\n");

        System.out.println("══ [STAGE 2] Jinja Template Analysis & Code Generation ══");
        for (String template : listJinjaTemplateFiles("testFiles/templates")) {
            compileFlask(template);
        }

        System.out.println("══ [STAGE 3] Copying Support Files ══");
        copySupportFiles(runtimePythonFile, cssFile, jsFile, productsJsonFile);

        CompilerReportWriter.flush();

        System.out.println("\n════════════════════════════════════════════════════════════════════════════════");
        System.out.println("   Compilation Complete!");
        System.out.println("   → output/          : HTML files + app.py + style.css + script.js");
        System.out.println("   → compiler_output/ : ast_python.json, ast_jinja.json, semantic_report.txt, generation_log.txt");
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
    }

    private static String resolveProductsJsonPath(String[] args) {
        for (int index = 0; index < args.length - 1; index++) {
            if ("--data".equals(args[index]) || "-data".equals(args[index])) {
                return args[index + 1];
            }
        }
        return "testFiles/products.json";
    }

    private static List<String> listJinjaTemplateFiles(String templatesDirectory) {
        List<String> finalTemplates = List.of(
                "index.jinja",
                "add_product.jinja",
                "edit_product.jinja",
                "product_detail.jinja"
        );
        return finalTemplates.stream()
                .map(name -> Path.of(templatesDirectory, name).toString())
                .filter(name -> Files.isRegularFile(Path.of(name)))
                .collect(Collectors.toList());
    }

    private static void cleanOutputDirectory() {
        Path outputDirectory = Path.of("output");
        try {
            if (Files.exists(outputDirectory)) {
                try (var paths = Files.walk(outputDirectory)) {
                    paths.sorted(Comparator.reverseOrder())
                            .filter(path -> !path.equals(outputDirectory))
                            .forEach(path -> {
                                try {
                                    Files.deleteIfExists(path);
                                } catch (IOException exception) {
                                    throw new UncheckedIOException(exception);
                                }
                            });
                }
            }
            Files.createDirectories(outputDirectory);
            System.out.println("  Cleaned output/ before generation");
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] تنظيف output/ قبل بدء التوليد");
        } catch (IOException | UncheckedIOException exception) {
            System.err.println("  [!] تعذّر تنظيف output/: " + exception.getMessage());
        }
    }

    private static void loadProductsFromJson(String filePath) {
        Path jsonPath = Path.of(filePath);
        if (!Files.isRegularFile(jsonPath)) {
            System.out.println("  [!] JSON data file not found: " + filePath);
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] لم يتم العثور على مصدر البيانات: " + filePath);
            return;
        }

        try (Reader reader = Files.newBufferedReader(jsonPath)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Map<String, Object>>>() {}.getType();
            List<Map<String, Object>> products = gson.fromJson(reader, listType);
            if (products == null) {
                products = new ArrayList<>();
            }

            Map<String, Object> firstProduct = products.isEmpty()
                    ? null
                    : products.get(0);
            for (String templateName : List.of(
                    "index.jinja",
                    "add_product.jinja",
                    "edit_product.jinja",
                    "product_detail.jinja")) {
                Map<String, Object> context = templateContexts.computeIfAbsent(
                        templateName, ignored -> new LinkedHashMap<>());
                context.put("products", products);
                if (firstProduct != null) {
                    context.put("product", firstProduct);
                } else {
                    context.remove("product");
                }
            }

            System.out.println("  Loaded " + products.size()
                    + " product(s) from " + filePath + " (JSON overrides app.py data)");
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] تحميل " + products.size()
                            + " منتج/منتجات من " + filePath
                            + " وربطها مباشرةً بـJinja Context");
        } catch (IOException | JsonParseException | ClassCastException exception) {
            System.err.println("  [!] Invalid products JSON: " + exception.getMessage());
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] فشل قراءة " + filePath
                            + ": " + exception.getMessage());
        }
    }


    private static void compilePython(String filePath) {
        System.out.println("  File: " + filePath);
        try {
            String code = Files.readString(Path.of(filePath))
                    .replace("\r\n", "\n")
                    .replace("\r", "\n");

            CharStream cs = CharStreams.fromString(code);
            pythonLexer lexer = new pythonLexer(cs);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            System.out.println("  [1/3] Lexical Analysis OK");

            pythonParser parser = new pythonParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object sym, int line, int col,
                                        String msg, RecognitionException e) {
                    System.err.println("  [!] Python Syntax Error at line " + line + ":" + col + " — " + msg);
                }
            });

            ParseTree tree = parser.program();
            System.out.println("  [2/3] Parsing OK");

            PythonASTBuilder visitor = new PythonASTBuilder();
            ASTNode ast = visitor.visit(tree);

            if (ast != null) {
                System.out.println("  [3/3] AST Built OK");
                System.out.println("  AST:");
                printTree(ast, "     ", true);

                System.out.println("\n  Running Python Semantic Analysis...");
                org.example.semantic.SymbolTable symbolTable = new org.example.semantic.SymbolTable();
                PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer(symbolTable);
                List<String> errors = analyzer.analyze(ast);
                symbolTable.printSymbolTable();
                CompilerReportWriter.recordPython(filePath, ast, symbolTable, errors);
                System.out.println("  Python errors: " + errors.size());

                Map<String, Map<String, Object>> extractedContexts = PythonContextExtractor.extract(ast, code);
                extractedContexts.entrySet().removeIf(entry -> !Set.of(
                        "index.jinja", "add_product.jinja", "edit_product.jinja", "product_detail.jinja"
                ).contains(entry.getKey()));
                templateContexts.putAll(extractedContexts);
                CompilerReportWriter.logGeneration(
                        "[" + LocalDateTime.now() + "] تحليل " + filePath
                                + ": استُخرجت Context Data من AST لِـ " + extractedContexts.size()
                                + " قالب/قوالب عبر استدعاءات render_template: " + extractedContexts.keySet());
            }
            System.out.println();

        } catch (IOException e) {
            System.err.println("  ERROR: File not found: " + filePath);
        }
    }

    private static void compileFlask(String filePath) {
        System.out.println("  File: " + filePath);
        long startTime = System.currentTimeMillis();

        try {
            String code = Files.readString(Path.of(filePath))
                    .replace("\r\n", "\n")
                    .replace("\r", "\n");

            CharStream cs = CharStreams.fromString(code);
            FlaskLexer lexer = new FlaskLexer(cs);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            FlaskParser parser = new FlaskParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object sym, int line, int col,
                                        String msg, RecognitionException e) {
                    if (msg != null && !msg.contains("extraneous input '<EOF>'")) {
                        System.err.println("  [!] Jinja Error at line " + line + ":" + col + " — " + msg);
                    }
                }
            });

            ParseTree tree = parser.flaskTemplate();

            ASTBuilder visitor = new ASTBuilder();
            ASTNode ast = visitor.visit(tree);

            if (ast == null) {
                System.out.println("  [!] AST is null — skipping");
                CompilerReportWriter.logGeneration(
                        "[" + LocalDateTime.now() + "] تخطّي " + filePath + ": AST is null");
                return;
            }

            System.out.println("  AST:");
            printTree(ast, "     ", true);

            System.out.println("\n  Running Jinja Semantic Analysis...");
            org.example.semantic.SymbolTable symbolTable = new org.example.semantic.SymbolTable();
            org.example.semantic.SemanticAnalyzer analyzer = new org.example.semantic.SemanticAnalyzer(symbolTable);
            analyzer.visit(ast);
            analyzer.finishAnalysis();
            symbolTable.printSymbolTable();

            List<String> semanticErrors = analyzer.getSemanticErrors();
            CompilerReportWriter.recordJinja(filePath, ast, symbolTable, semanticErrors);

            String outFileName = getOutputFileName(filePath);

            if (!semanticErrors.isEmpty()) {
                System.out.println("  [!] " + semanticErrors.size() + " semantic error(s) — skipping code generation");
                try {
                    Files.deleteIfExists(Paths.get("output", outFileName));
                } catch (IOException ignored) {
                }
                CompilerReportWriter.logGeneration(
                        "[" + LocalDateTime.now() + "] تخطّي توليد " + outFileName
                                + " بسبب " + semanticErrors.size()
                                + " خطأ/أخطاء دلالية في " + filePath);
                System.out.println();
                return;
            }

            String templateBaseName = Path.of(filePath).getFileName().toString();
            Map<String, Object> context = templateContexts.getOrDefault(templateBaseName, new LinkedHashMap<>());
            System.out.println("  Context keys for " + templateBaseName + ": " + context.keySet());

            CodeGenerator codeGen = new CodeGenerator(context);
            codeGen.visit(ast);
            codeGen.generateStaticHtmlOutput(outFileName);

            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] توليد output/" + outFileName
                            + " من القالب " + filePath + " بمفاتيح Context: " + context.keySet()
                            + " (" + (System.currentTimeMillis() - startTime) + "ms)");

            System.out.println("  Generated: output/" + outFileName + " in "
                    + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println();

        } catch (IOException e) {
            System.err.println("  ERROR: File not found: " + filePath);
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] فشل " + filePath + ": الملف غير موجود");
        } catch (Exception e) {
            System.err.println("  CRITICAL ERROR: " + e.getMessage());
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] فشل " + filePath + ": " + e.getMessage());
        }
    }

    private static void copySupportFiles(String runtimePythonFile, String cssFile, String jsFile, String productsJsonFile) {
        try {
            Files.createDirectories(Paths.get("output"));
            copyRuntimeBackend(runtimePythonFile, "output/app.py");
            copyFile(cssFile, "output/style.css");
            copyFile(jsFile, "output/script.js");
            copyFile(productsJsonFile, "output/products.json");
        } catch (IOException e) {
            System.err.println("  [!] Error creating output directory: " + e.getMessage());
        }
    }

    private static void copyRuntimeBackend(String src, String dest) {
        try {
            String code = Files.readString(Path.of(src));
            code = code.replace("template_folder=str(APP_ROOT / \"templates\")",
                            "template_folder=str(APP_ROOT)")
                    .replace("static_folder=str(APP_ROOT / \"static\")",
                            "static_folder=str(APP_ROOT), static_url_path=\"\"")
                    .replace("render_template(\"products.html\"", "render_template(\"index.html\"")
                    .replace("render_template('products.html'", "render_template('index.html'")
                    .replace("'index.jinja'", "'index.html'")
                    .replace("'add_product.jinja'", "'add_product.html'")
                    .replace("'edit_product.jinja'", "'edit_product.html'")
                    .replace("'product_detail.jinja'", "'product_detail.html'")
                    .replace("\"index.jinja\"", "\"index.html\"")
                    .replace("\"add_product.jinja\"", "\"add_product.html\"")
                    .replace("\"edit_product.jinja\"", "\"edit_product.html\"")
                    .replace("\"product_detail.jinja\"", "\"product_detail.html\"");
            Files.writeString(Path.of(dest), code);
            System.out.println("  Generated runtime backend: " + dest + " (HTML template references aligned)");
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] تجهيز backend runtime: " + src + " -> " + dest
                            + " مع مواءمة مراجع HTML المولدة");
        } catch (IOException e) {
            System.err.println("  [!] Could not prepare runtime backend " + src + ": " + e.getMessage());
        }
    }

    private static void copyFile(String src, String dest) {
        try {
            Path source = Path.of(src);
            if (!Files.exists(source)) {
                System.out.println("  [!] Skipped (not found): " + src);
                return;
            }
            Files.copy(source, Path.of(dest), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("  Copied: " + src + " → " + dest);
            CompilerReportWriter.logGeneration(
                    "[" + LocalDateTime.now() + "] نسخ ملف داعم دون معالجة: " + src + " -> " + dest);
        } catch (IOException e) {
            System.err.println("  [!] Could not copy " + src + ": " + e.getMessage());
        }
    }

    private static String getOutputFileName(String templatePath) {
        String name = Path.of(templatePath).getFileName().toString();

        int dot = name.lastIndexOf('.');
        if (dot >= 0) name = name.substring(0, dot);
        return name + ".html";
    }

    private static void printTree(ASTNode node, String prefix, boolean isLast) {
        if (node == null) return;
        String connector = isLast ? "└── " : "├── ";
        String info = node.getNodeType()
                + " \"" + node.getValue() + "\""
                + " (line:" + node.getLineNumber() + ")";
        System.out.println(prefix + connector + info);

        String childPrefix = prefix + (isLast ? "    " : "│   ");
        List<ASTNode> children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            printTree(children.get(i), childPrefix, i == children.size() - 1);
        }
    }

    enum FileType { PYTHON, HTML, CSS }
}
