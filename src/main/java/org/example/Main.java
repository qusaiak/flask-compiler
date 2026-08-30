package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.ast.ASTNode;           // ✅ هاد الصح
import org.example.codegen.CodeGenerator;
import org.example.context.PythonContextExtractor;
import org.example.reporting.CompilerReportWriter;
import org.example.semantic.PythonSemanticAnalyzer;
import org.example.semantic.SemanticAnalyzer;
import org.example.semantic.SymbolTable;
import org.example.gen.FlaskLexer;
import org.example.gen.FlaskParser;
import org.example.gen.python.pythonLexer;
import org.example.gen.python.pythonParser;
import org.example.visitor.ASTBuilder;
import org.example.visitor.PythonASTBuilder;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.*;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Main {

    /**
     * Context Data الحقيقية المستخرجة من AST ملف app.py (بعد Semantic Analysis)،
     * مفهرسة باسم ملف القالب كما ورد في استدعاء render_template(...) الفعلي.
     * تُملأ مرة واحدة في compilePython() وتُستخدم لاحقاً عند توليد كل قالب Jinja.
     */
    private static final Map<String, Map<String, Object>> templateContexts = new LinkedHashMap<>();

    // ════════════════════════════════════════════════════════════════
    // نقطة الدخول الرئيسية
    // ════════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.println("   Flask & Jinja2 Compiler — Full Pipeline");
        System.out.println("════════════════════════════════════════════════════════════════════════════════\n");

        // ─── المسارات الرئيسية ───────────────────────────────────────────────────
        String pythonFile = "testFiles/app.py";
        String cssFile = "testFiles/static/style.css";
        String jsFile = "testFiles/static/interactive_addition.js";

        // يبدأ كل تشغيل من output نظيف حتى لا تبقى ملفات من تشغيل سابق.
        cleanOutputDirectory();

        // ─── المرحلة 1: تحليل Python + استخراج Context Data من AST نفسه ────────
        System.out.println("══ [STAGE 1] Python Analysis ══");
        compilePython(pythonFile);
        System.out.println("  Python context keys: " + templateContexts.keySet() + "\n");

        // ─── المرحلة 2: تحليل القوالب النهائية المحددة فقط ───────────────────────
        System.out.println("══ [STAGE 2] Jinja Template Analysis & Code Generation ══");
        for (String template : listJinjaTemplateFiles("testFiles/templates")) {
            compileFlask(template);
        }

        // ─── المرحلة 3: نسخ الملفات الداعمة ────────────────────────────────────
        System.out.println("══ [STAGE 3] Copying Support Files ══");
        copySupportFiles(pythonFile, cssFile, jsFile);

        // ─── كتابة تقارير compiler_output/ دفعة واحدة في نهاية التشغيل ─────────
        CompilerReportWriter.flush();

        System.out.println("\n════════════════════════════════════════════════════════════════════════════════");
        System.out.println("   Compilation Complete!");
        System.out.println("   → output/          : HTML files + app.py + style.css + script.js");
        System.out.println("   → compiler_output/ : ast_python.json, ast_jinja.json, semantic_report.txt, generation_log.txt");
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
    }

    /** يعيد القوالب النهائية المطلوبة فقط وبالترتيب المحدد في إعلان المشروع. */
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

    /** يمسح ملفات output القديمة قبل بدء أي عملية توليد جديدة. */
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

    // ════════════════════════════════════════════════════════════════
    // [1] تحليل Python + استخراج Context Data الحقيقية من AST
    // ════════════════════════════════════════════════════════════════
    private static void compilePython(String filePath) {
        System.out.println("  File: " + filePath);
        try {
            // نظّف Windows line endings
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

                // التحليل الدلالي
                System.out.println("\n  Running Python Semantic Analysis...");
                org.example.semantic.SymbolTable symbolTable = new org.example.semantic.SymbolTable();
                PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer(symbolTable);
                List<String> errors = analyzer.analyze(ast);
                symbolTable.printSymbolTable();
                CompilerReportWriter.recordPython(filePath, ast, symbolTable, errors);
                System.out.println("  Python errors: " + errors.size());

                // استخراج Context Data الحقيقية من AST نفسه (وليس من JSON أو قيم ثابتة).
                Map<String, Map<String, Object>> extractedContexts = PythonContextExtractor.extract(ast, code);
                // لا تدخل صفحات الدعم أو الصفحات غير المطلوبة في مرحلة التوليد النهائي.
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

    // ════════════════════════════════════════════════════════════════
    // [2] تحليل Jinja وتوليد HTML
    // ════════════════════════════════════════════════════════════════
    private static void compileFlask(String filePath) {
        System.out.println("  File: " + filePath);
        long startTime = System.currentTimeMillis();

        try {
            // نظّف Windows line endings عشان الـ Lexer ما يتعثر
            String code = Files.readString(Path.of(filePath))
                    .replace("\r\n", "\n")
                    .replace("\r", "\n");

            // --- Lexer ---
            CharStream cs = CharStreams.fromString(code);
            FlaskLexer lexer = new FlaskLexer(cs);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // --- Parser ---
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

            // --- AST ---
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

            // --- Semantic Analysis ---
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
                // احذف الملف القديم لو موجود، لكن كمّل بقية القوالب (لا تُنهي التشغيل بالكامل).
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

            // --- Code Generation باستخدام Context Data الحقيقية لهذا القالب تحديداً ---
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

    // ════════════════════════════════════════════════════════════════
    // [3] نسخ الملفات الداعمة إلى output/ دون أي معالجة إضافية
    // ════════════════════════════════════════════════════════════════
    private static void copySupportFiles(String pythonFile, String cssFile, String jsFile) {
        try {
            Files.createDirectories(Paths.get("output"));
            copyRuntimeBackend(pythonFile, "output/app.py");
            copyFile(cssFile, "output/style.css");
            copyFile(jsFile, "output/script.js");
        } catch (IOException e) {
            System.err.println("  [!] Error creating output directory: " + e.getMessage());
        }
    }

    /** يجهز backend runtime ليتعامل مع صفحات HTML المولدة الموجودة في output/. */
    private static void copyRuntimeBackend(String src, String dest) {
        try {
            String code = Files.readString(Path.of(src));
            code = code.replace("'index.jinja'", "'index.html'")
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

    // ════════════════════════════════════════════════════════════════
    // helpers
    // ════════════════════════════════════════════════════════════════
    private static String getOutputFileName(String templatePath) {
        String name = Path.of(templatePath).getFileName().toString();
        // استبدل الامتداد بـ .html (يدعم .jinja أيضاً وليس فقط .html)
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
