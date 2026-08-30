package org.example;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.ast.ASTNode;
import org.example.gen.FlaskLexer;
import org.example.gen.FlaskParser;
import org.example.gen.python.pythonLexer;
import org.example.gen.python.pythonParser;
import org.example.semantic.PythonSemanticAnalyzer;
import org.example.semantic.SemanticAnalyzer;
import org.example.semantic.SymbolTable;
import org.example.visitor.ASTBuilder;
import org.example.visitor.PythonASTBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** اختبار مستقل لكل طبقات الأخطاء: Python وHTML وCSS وJinja. */
public class SemanticTestRunner {
    private static final String PYTHON_FILE = "testFiles/semantic_python_errors.py";
    private static final String HTML_FILE = "testFiles/semantic_html_errors.html";
    private static final String CSS_FILE = "testFiles/semantic_css_errors.css";
    private static final String JINJA_FILE = "testFiles/templates/semantic_v3.html";

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("   Semantic Error Handling Test");
        System.out.println("   Python + HTML + CSS + Jinja");
        System.out.println("   This test does not modify output/");
        System.out.println("============================================================\n");

        List<String> report = new ArrayList<>();
        int total = 0;
        total += testPython(report);
        total += testHtml(report);
        total += testCss(report);
        total += testJinja(report);

        Path reportPath = Path.of("compiler_output", "semantic_test_report.txt");
        try {
            Files.createDirectories(reportPath.getParent());
            Files.writeString(reportPath, String.join(System.lineSeparator(), report));
        } catch (IOException e) {
            System.err.println("Could not write report: " + e.getMessage());
        }

        System.out.println("\n============================================================");
        System.out.println("Semantic test complete");
        System.out.println("Total errors detected: " + total);
        System.out.println("Report: compiler_output/semantic_test_report.txt");
        System.out.println("output/ was not modified");
        System.out.println("============================================================");
    }

    private static int testPython(List<String> report) {
        System.out.println("\n--- [PYTHON] " + PYTHON_FILE + " ---");
        report.add("[PYTHON] " + PYTHON_FILE);
        try {
            String code = Files.readString(Path.of(PYTHON_FILE));
            pythonLexer lexer = new pythonLexer(CharStreams.fromString(code));
            lexer.removeErrorListeners();
            pythonParser parser = new pythonParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            ASTNode ast = new PythonASTBuilder().visit(parser.program());
            SymbolTable table = new SymbolTable();
            List<String> errors = new PythonSemanticAnalyzer(table).analyze(ast);
            return printErrors(errors, report, "Python semantic errors");
        } catch (IOException e) {
            return fileError(report, e);
        }
    }

    private static int testJinja(List<String> report) {
        System.out.println("\n--- [JINJA] " + JINJA_FILE + " ---");
        report.add("[JINJA] " + JINJA_FILE);
        try {
            String code = Files.readString(Path.of(JINJA_FILE)).replace("\r\n", "\n");
            FlaskLexer lexer = new FlaskLexer(CharStreams.fromString(code));
            lexer.removeErrorListeners();
            FlaskParser parser = new FlaskParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            ASTNode ast = new ASTBuilder().visit(parser.flaskTemplate());
            SymbolTable table = new SymbolTable();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(table);
            analyzer.visit(ast);
            analyzer.finishAnalysis();
            return printErrors(analyzer.getSemanticErrors(), report, "Jinja semantic errors");
        } catch (IOException e) {
            return fileError(report, e);
        }
    }

    private static int testHtml(List<String> report) {
        System.out.println("\n--- [HTML] " + HTML_FILE + " ---");
        report.add("[HTML] " + HTML_FILE);
        try {
            String code = Files.readString(Path.of(HTML_FILE));
            List<String> errors = new ArrayList<>();
            Set<String> ids = new HashSet<>();
            Matcher idMatcher = Pattern.compile("\\bid\\s*=\\s*[\\\"']([^\\\"']+)[\\\"']").matcher(code);
            while (idMatcher.find()) {
                if (!ids.add(idMatcher.group(1))) {
                    errors.add("HTML semantic error: duplicate id '" + idMatcher.group(1) + "'");
                }
            }
            int divOpen = count(code, "<div");
            int divClose = count(code, "</div>");
            if (divOpen != divClose) {
                errors.add("HTML semantic error: unbalanced div tags (open=" + divOpen + ", close=" + divClose + ")");
            }
            return printErrors(errors, report, "HTML semantic errors");
        } catch (IOException e) {
            return fileError(report, e);
        }
    }

    private static int testCss(List<String> report) {
        System.out.println("\n--- [CSS] " + CSS_FILE + " ---");
        report.add("[CSS] " + CSS_FILE);
        try {
            String code = Files.readString(Path.of(CSS_FILE));
            List<String> errors = new ArrayList<>();
            Matcher selectorMatcher = Pattern.compile("(?m)^\\s*([.#][A-Za-z_-][A-Za-z0-9_-]*)\\s*\\{").matcher(code);
            Set<String> selectors = new HashSet<>();
            while (selectorMatcher.find()) {
                String selector = selectorMatcher.group(1);
                if (!selectors.add(selector)) {
                    errors.add("CSS semantic error: selector '" + selector + "' is declared more than once");
                }
            }
            Matcher propertyMatcher = Pattern.compile("(?m)^\\s*([A-Za-z-]+)\\s*:").matcher(code);
            Set<String> valid = Set.of("color", "background", "background-color", "font-size", "margin", "padding", "display", "width", "height");
            while (propertyMatcher.find()) {
                String property = propertyMatcher.group(1);
                if (!valid.contains(property)) {
                    errors.add("CSS semantic error: unknown property '" + property + "'");
                }
            }
            return printErrors(errors, report, "CSS semantic errors");
        } catch (IOException e) {
            return fileError(report, e);
        }
    }

    private static int count(String text, String token) {
        int result = 0, index = 0;
        while ((index = text.indexOf(token, index)) >= 0) { result++; index += token.length(); }
        return result;
    }

    private static int printErrors(List<String> errors, List<String> report, String label) {
        if (errors.isEmpty()) {
            System.out.println("FAIL: no errors detected");
            report.add("FAIL: no errors detected");
            return 0;
        }
        System.out.println("PASS: detected " + errors.size() + " " + label);
        report.add("PASS: detected " + errors.size() + " " + label);
        for (String error : errors) {
            System.out.println("  - " + error);
            report.add("  - " + error);
        }
        return errors.size();
    }

    private static int fileError(List<String> report, IOException e) {
        String error = "File error: " + e.getMessage();
        System.out.println(error);
        report.add(error);
        return 0;
    }
}
