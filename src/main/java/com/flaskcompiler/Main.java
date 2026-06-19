package com.flaskcompiler;

import com.flaskcompiler.ast.jinja.JinjaAstBuilder;
import com.flaskcompiler.ast.jinja.TemplateNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PythonAstBuilder;
import com.flaskcompiler.codegen.FlaskGenerator;
import com.flaskcompiler.grammar.JinjaLexer;
import com.flaskcompiler.grammar.JinjaParser;
import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import com.flaskcompiler.semantic.SemanticAnalyzer;
import com.flaskcompiler.semantic.SemanticError;
import com.flaskcompiler.symbol.JinjaSymbolCollector;
import com.flaskcompiler.symbol.PythonSymbolCollector;
import com.flaskcompiler.symbol.SymbolTable;
import com.flaskcompiler.transfer.BoundTemplate;
import com.flaskcompiler.transfer.ContextModel;
import com.flaskcompiler.transfer.DataExtractor;
import com.flaskcompiler.transfer.JinjaContextBinder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Flask Compiler - full pipeline:
 *   Input -> Lexer -> Parser -> AST -> Symbol Table -> Semantic Analysis
 *         -> Data Transfer -> Code Generation -> Generated Flask Project
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path root = Paths.get("examples", "input-project");
        Path appPy = root.resolve("app.py");
        Path templatesDir = root.resolve("templates");
        Path productsTpl = templatesDir.resolve("products.html");
        Path outDir = Paths.get("generated");

        banner("Flask Compiler pipeline");

        // 1) Lexer + Parser
        PythonParser pythonParser = pythonParser(appPy);
        JinjaParser jinjaParser = jinjaParser(productsTpl);
        System.out.println("[1] Lexer + Parser     : app.py, products.html parsed");

        // 2) AST
        ProgramNode program = new PythonAstBuilder().build(pythonParser.file_input());
        TemplateNode template = new JinjaAstBuilder().build(jinjaParser.template());
        System.out.println("[2] AST                : Python AST + Jinja AST built");

        // 3) Symbol tables
        SymbolTable pyTable = new PythonSymbolCollector().collect(program);
        SymbolTable jinjaTable = new JinjaSymbolCollector().collect(template, "products.html");
        System.out.println("[3] Symbol Table       : Python + Jinja symbol tables built");

        // 4) Semantic analysis
        Set<String> knownTemplates = listTemplates(templatesDir);
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        List<SemanticError> errors = analyzer.analyze(program, null, pyTable, null, knownTemplates, null, null);
        errors.addAll(analyzer.analyze(null, template, null, jinjaTable, null,
                Set.of("products"), Map.of("products", "list")));
        System.out.println("[4] Semantic Analysis  : " + errors.size() + " error(s)");
        if (!errors.isEmpty()) {
            errors.forEach(System.out::println);
            System.out.println("Aborting code generation due to semantic errors.");
            return;
        }

        // 5) Data transfer
        List<ContextModel> contexts = new DataExtractor().extract(program);
        ContextModel productsModel = contexts.stream()
                .filter(m -> "products.html".equals(m.getTemplateName()))
                .findFirst().orElseThrow();
        BoundTemplate bound = new JinjaContextBinder().bind(productsModel, template);
        System.out.println("[5] Data Transfer      : products -> "
                + BoundTemplate.describe(bound.getContext().get("products")));

        // 6) Code generation
        FlaskGenerator generator = new FlaskGenerator();
        generator.generate(outDir, program, template, bound);
        System.out.println("[6] Code Generation    : Flask project written to " + outDir + "/");

        banner("Generated project");
        generator.printGeneratedFiles(outDir);
    }

    private static PythonParser pythonParser(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        return new PythonParser(new CommonTokenStream(new PythonLexer(in)));
    }

    private static JinjaParser jinjaParser(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        return new JinjaParser(new CommonTokenStream(new JinjaLexer(in)));
    }

    private static Set<String> listTemplates(Path dir) throws Exception {
        Set<String> names = new TreeSet<>();
        try (Stream<Path> files = Files.list(dir)) {
            files.filter(p -> p.toString().endsWith(".html"))
                 .forEach(p -> names.add(p.getFileName().toString()));
        }
        return names;
    }

    private static void banner(String title) {
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(title);
        System.out.println("=".repeat(60));
    }
}
