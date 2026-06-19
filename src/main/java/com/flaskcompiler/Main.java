package com.flaskcompiler;

import com.flaskcompiler.ast.jinja.JinjaAstBuilder;
import com.flaskcompiler.ast.jinja.TemplateNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PythonAstBuilder;
import com.flaskcompiler.grammar.JinjaLexer;
import com.flaskcompiler.grammar.JinjaParser;
import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import com.flaskcompiler.semantic.SemanticAnalyzer;
import com.flaskcompiler.semantic.SemanticError;
import com.flaskcompiler.symbol.JinjaSymbolCollector;
import com.flaskcompiler.symbol.PythonSymbolCollector;
import com.flaskcompiler.symbol.SymbolTable;
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
 * Flask Compiler entry point.
 *
 * M1-M4: lexers/parsers. M5: ASTs. M6: symbol tables.
 * M7: semantic analysis over AST + symbol tables (5 checks + bonus).
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path root = Paths.get("examples", "input-project");
        Path appPy = root.resolve("app.py");
        Path templatesDir = root.resolve("templates");
        Path productsTpl = templatesDir.resolve("products.html");
        Path errors = Paths.get("examples", "errors");

        Set<String> knownTemplates = listTemplates(templatesDir);
        SemanticAnalyzer analyzer = new SemanticAnalyzer();

        // ===== Clean project (expect 0 errors) =====
        banner("M7 :: Semantic analysis - clean project");
        ProgramNode program = new PythonAstBuilder().build(pythonParser(appPy).file_input());
        SymbolTable pyTable = new PythonSymbolCollector().collect(program);
        List<SemanticError> e1 = analyzer.analyze(program, null, pyTable, null, knownTemplates, null, null);

        TemplateNode products = new JinjaAstBuilder().build(jinjaParser(productsTpl).template());
        SymbolTable jinjaTable = new JinjaSymbolCollector().collect(products, "products.html");
        // context derived for products.html: render_template("products.html", products=products), products is a list
        List<SemanticError> e2 = analyzer.analyze(null, products, null, jinjaTable, null,
                Set.of("products"), Map.of("products", "list"));
        reportErrors("app.py + products.html", concat(e1, e2));

        // ===== Error examples (each expected to produce its targeted error) =====
        banner("M7 :: Semantic analysis - error examples");
        analyzePython(analyzer, errors.resolve("undefined_variable.py"), knownTemplates);
        analyzePython(analyzer, errors.resolve("duplicate_route.py"), knownTemplates);
        analyzePython(analyzer, errors.resolve("missing_template.py"), knownTemplates);
        analyzeJinja(analyzer, errors.resolve("invalid_jinja_variable.html"));
        analyzeJinja(analyzer, errors.resolve("invalid_loop.html"));
    }

    // ---------- error-file drivers ----------
    private static void analyzePython(SemanticAnalyzer analyzer, Path file, Set<String> knownTemplates) throws Exception {
        ProgramNode ast = new PythonAstBuilder().build(pythonParser(file).file_input());
        SymbolTable table = new PythonSymbolCollector().collect(ast);
        List<SemanticError> errs = analyzer.analyze(ast, null, table, null, knownTemplates, null, null);
        reportErrors(file.getFileName().toString(), errs);
    }

    private static void analyzeJinja(SemanticAnalyzer analyzer, Path file) throws Exception {
        TemplateNode ast = new JinjaAstBuilder().build(jinjaParser(file).template());
        SymbolTable table = new JinjaSymbolCollector().collect(ast, file.getFileName().toString());
        // standalone templates: no Python context is supplied
        List<SemanticError> errs = analyzer.analyze(null, ast, null, table, null, Set.of(), Map.of());
        reportErrors(file.getFileName().toString(), errs);
    }

    // ---------- reporting ----------
    private static void reportErrors(String label, List<SemanticError> errors) {
        System.out.println();
        System.out.println(">> " + label + "  ->  " + errors.size() + " error(s)");
        for (SemanticError e : errors) {
            System.out.println(e);
        }
    }

    private static List<SemanticError> concat(List<SemanticError> a, List<SemanticError> b) {
        java.util.List<SemanticError> all = new java.util.ArrayList<>(a);
        all.addAll(b);
        return all;
    }

    // ---------- parser factories ----------
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
