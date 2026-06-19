package com.flaskcompiler;

import com.flaskcompiler.ast.AstPrinter;
import com.flaskcompiler.ast.jinja.JinjaAstBuilder;
import com.flaskcompiler.ast.jinja.TemplateNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PythonAstBuilder;
import com.flaskcompiler.grammar.CssLexer;
import com.flaskcompiler.grammar.CssParser;
import com.flaskcompiler.grammar.HtmlLexer;
import com.flaskcompiler.grammar.HtmlParser;
import com.flaskcompiler.grammar.JinjaLexer;
import com.flaskcompiler.grammar.JinjaParser;
import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Flask Compiler entry point.
 *
 * M1-M4: lexers/parsers for Python, Jinja, HTML, CSS (grammar validation).
 * M5: build and print the two AST trees -> Python AST (app.py) and Jinja AST (products.html).
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path root = Paths.get("examples", "input-project");
        Path appPy = root.resolve("app.py");
        Path templates = root.resolve("templates");
        Path productsTpl = templates.resolve("products.html");
        Path sampleHtml = root.resolve("static").resolve("sample.html");
        Path styleCss = root.resolve("static").resolve("style.css");

        // ---- Grammar validation (M1-M4): parse everything, report error counts ----
        banner("Grammar validation (M1-M4)");
        validatePython(appPy);
        validateJinja(templates.resolve("base.html"));
        validateJinja(productsTpl);
        validateJinja(templates.resolve("add_product.html"));
        validateJinja(templates.resolve("product_details.html"));
        validateJinja(templates.resolve("delete_product.html"));
        validateHtml(sampleHtml);
        validateCss(styleCss);

        // ---- M5: Python AST ----
        banner("M5 :: Python AST  (source: app.py)");
        ProgramNode program = new PythonAstBuilder().build(pythonParser(appPy).file_input());
        AstPrinter.print("PYTHON AST:", program);

        // ---- M5: Jinja AST ----
        banner("M5 :: Jinja AST  (source: products.html)");
        TemplateNode template = new JinjaAstBuilder().build(jinjaParser(productsTpl).template());
        AstPrinter.print("JINJA AST:", template);
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

    // ---------- validation helpers (parse + print error count) ----------
    private static void validatePython(Path file) throws Exception {
        PythonParser p = pythonParser(file);
        p.file_input();
        printCount(file, p.getNumberOfSyntaxErrors());
    }

    private static void validateJinja(Path file) throws Exception {
        JinjaParser p = jinjaParser(file);
        p.template();
        printCount(file, p.getNumberOfSyntaxErrors());
    }

    private static void validateHtml(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        HtmlParser p = new HtmlParser(new CommonTokenStream(new HtmlLexer(in)));
        p.document();
        printCount(file, p.getNumberOfSyntaxErrors());
    }

    private static void validateCss(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        CssParser p = new CssParser(new CommonTokenStream(new CssLexer(in)));
        p.stylesheet();
        printCount(file, p.getNumberOfSyntaxErrors());
    }

    private static void printCount(Path file, int errors) {
        System.out.printf("  %-24s %d syntax error(s)%n", file.getFileName(), errors);
    }

    private static void banner(String title) {
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(title);
        System.out.println("=".repeat(60));
    }
}
