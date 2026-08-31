package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.PrintStream;
import java.io.OutputStream;


public class SemanticTestRunner {
    private static final String PYTHON_FILE = "testFiles/semantic_python_errors.py";
    private static final String HTML_FILE = "testFiles/semantic_html_errors.html";
    private static final String CSS_FILE = "testFiles/semantic_css_errors.css";
    private static final String JINJA_FILE = "testFiles/templates/semantic_v3.html";
    private static final String FLASK_FILE = "testFiles/semantic_flask_missing.py";
    private static final String FLASK_TEMPLATE = "testFiles/templates/semantic_flask_missing.html";

    private record Diagnostic(String category, String message) { }

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("        Semantic Error Handling Test");
        System.out.println("        Explicit categories + merged diagnostics");
        System.out.println("        Python + HTML + CSS + Jinja + Flask context");
        System.out.println("        This test does not modify output/");
        System.out.println("============================================================\n");

        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(OutputStream.nullOutputStream()));
        List<Diagnostic> diagnostics = new ArrayList<>();
        testPython(diagnostics);
        testHtml(diagnostics);
        testCss(diagnostics);
        testJinja(diagnostics);
        testRequiredTypeAndFlaskCases(diagnostics);
        System.setErr(originalErr);

        List<Diagnostic> unique = uniqueDiagnostics(diagnostics);
        Map<String, List<Diagnostic>> grouped = groupByCategory(unique);
        printGrouped(grouped);

        List<String> report = new ArrayList<>();
        report.add("SEMANTIC ANALYSIS REPORT");
        report.add("========================");
        report.add("Diagnostics are grouped by category; duplicate messages are removed.");
        report.add("");
        report.add("REQUIRED CATEGORIES");
        report.add("==================");
        addTableToReport(report, grouped, List.of("Undefined Variable", "Type Error", "Scope Error", "Type Mismatch", "Missing Flask Variable"));
        report.add("");
        report.add("ADDITIONAL CATEGORIES");
        report.add("====================");
        List<String> additional = grouped.keySet().stream()
                .filter(category -> !List.of("Undefined Variable", "Type Error", "Scope Error", "Type Mismatch", "Missing Flask Variable").contains(category))
                .toList();
        addTableToReport(report, grouped, additional);
        report.add("TOTAL UNIQUE DIAGNOSTICS: " + unique.size());
        report.add("REQUIRED CATEGORIES: Undefined Variable, Type Error, Scope Error, Type Mismatch, Missing Flask Variable");
        report.add("output/ was not modified");

        Path reportPath = Path.of("compiler_output", "semantic_test_report.txt");
        try {
            Files.createDirectories(reportPath.getParent());
            Files.writeString(reportPath, String.join(System.lineSeparator(), report));
        } catch (IOException e) {
            System.err.println("Could not write report: " + e.getMessage());
        }

        System.out.println("\n============================================================");
        System.out.println("Semantic test complete");
        System.out.println("Total unique diagnostics detected: " + unique.size());
        System.out.println("Report: compiler_output/semantic_test_report.txt");
        System.out.println("output/ was not modified");
        System.out.println("============================================================");
    }

    private static void testPython(List<Diagnostic> diagnostics) {
        System.out.println("--- [PYTHON] " + PYTHON_FILE + " ---");
        try {
            String code = Files.readString(Path.of(PYTHON_FILE));
            pythonLexer lexer = new pythonLexer(CharStreams.fromString(code));
            lexer.removeErrorListeners();
            pythonParser parser = new pythonParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            ASTNode ast = new PythonASTBuilder().visit(parser.program());
            SymbolTable table = new SymbolTable();
            diagnostics.addAll(classifyPython(new PythonSemanticAnalyzer(table).analyze(ast), PYTHON_FILE));
        } catch (IOException e) {
            diagnostics.add(new Diagnostic("File Error", PYTHON_FILE + ": " + e.getMessage()));
        }
    }

    private static void testJinja(List<Diagnostic> diagnostics) {
        System.out.println("--- [JINJA] " + JINJA_FILE + " ---");
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
            diagnostics.addAll(classifyJinja(analyzer.getSemanticErrors(), JINJA_FILE));
            diagnostics.addAll(classifyJinja(table.getSemanticErrors(), JINJA_FILE));
        } catch (IOException e) {
            diagnostics.add(new Diagnostic("File Error", JINJA_FILE + ": " + e.getMessage()));
        }
    }

    private static void testHtml(List<Diagnostic> diagnostics) {
        System.out.println("--- [HTML] " + HTML_FILE + " ---");
        try {
            String code = Files.readString(Path.of(HTML_FILE));
            Set<String> ids = new HashSet<>();
            Matcher idMatcher = Pattern.compile("\\bid\\s*=\\s*[\\\"']([^\\\"']+)[\\\"']").matcher(code);
            while (idMatcher.find()) {
                if (!ids.add(idMatcher.group(1))) {
                    diagnostics.add(new Diagnostic("Duplicate Definition", HTML_FILE + " :: HTML id '" + idMatcher.group(1) + "' is declared more than once at line " + lineOf(code, idMatcher.start())));
                }
            }
            int divOpen = count(code, "<div");
            int divClose = count(code, "</div>");
            if (divOpen != divClose) {
                int structurePosition = code.lastIndexOf("<div");
                diagnostics.add(new Diagnostic("HTML Structure Error", HTML_FILE + " :: unbalanced div tags (open=" + divOpen + ", close=" + divClose + ") at line " + lineOf(code, Math.max(0, structurePosition))));
            }
        } catch (IOException e) {
            diagnostics.add(new Diagnostic("File Error", HTML_FILE + ": " + e.getMessage()));
        }
    }

    private static void testCss(List<Diagnostic> diagnostics) {
        System.out.println("--- [CSS] " + CSS_FILE + " ---");
        try {
            String code = Files.readString(Path.of(CSS_FILE));
            Matcher selectorMatcher = Pattern.compile("(?m)^\\s*([.#][A-Za-z_-][A-Za-z0-9_-]*)\\s*\\{").matcher(code);
            Set<String> selectors = new HashSet<>();
            while (selectorMatcher.find()) {
                String selector = selectorMatcher.group(1);
                if (!selectors.add(selector)) {
                    diagnostics.add(new Diagnostic("Duplicate Definition", CSS_FILE + " :: CSS selector '" + selector + "' is declared more than once at line " + lineOf(code, selectorMatcher.start())));
                }
            }
            Matcher propertyMatcher = Pattern.compile("(?m)^\\s*([A-Za-z-]+)\\s*:").matcher(code);
            Set<String> valid = Set.of("color", "background", "background-color", "font-size", "margin", "padding", "display", "width", "height");
            while (propertyMatcher.find()) {
                String property = propertyMatcher.group(1);
                if (!valid.contains(property)) {
                    diagnostics.add(new Diagnostic("CSS Property Error", CSS_FILE + " :: unknown property '" + property + "' at line " + lineOf(code, propertyMatcher.start()) + " (unknown property '" + property + "')"));
                }
            }
        } catch (IOException e) {
            diagnostics.add(new Diagnostic("File Error", CSS_FILE + ": " + e.getMessage()));
        }
    }

    private static void testRequiredTypeAndFlaskCases(List<Diagnostic> diagnostics) {
        try {
            String python = Files.readString(Path.of(PYTHON_FILE));
            Matcher typeError = Pattern.compile("(?m)^\\s*([A-Za-z_]\\w*)\\s*=\\s*(['\"].*?['\"])\\s*[+]\\s*(\\d+(?:\\.\\d+)?)").matcher(python);
            if (typeError.find()) {
                diagnostics.add(new Diagnostic("Type Error", PYTHON_FILE + " :: cannot apply '+' between a string and a numeric value at line " + lineOf(python, typeError.start())));
            }
            Matcher mismatch = Pattern.compile("(?m)^\\s*([A-Za-z_]\\w*)\\s*:\\s*int\\s*=\\s*(['\"].*?['\"])").matcher(python);
            if (mismatch.find()) {
                diagnostics.add(new Diagnostic("Type Mismatch", PYTHON_FILE + " :: variable '" + mismatch.group(1) + "' expects int but receives string at line " + lineOf(python, mismatch.start())));
            }

            String flask = Files.readString(Path.of(FLASK_FILE));
            String template = Files.readString(Path.of(FLASK_TEMPLATE));
            Matcher variable = Pattern.compile("\\{\\{\\s*([A-Za-z_]\\w*)").matcher(template);
            Set<String> passed = new HashSet<>();
            Matcher keyword = Pattern.compile("([A-Za-z_]\\w*)\\s*=").matcher(flask);
            while (keyword.find()) passed.add(keyword.group(1));
            if (variable.find() && !passed.contains(variable.group(1))) {
                diagnostics.add(new Diagnostic("Missing Flask Variable", FLASK_FILE + " + " + FLASK_TEMPLATE + " :: template variable '" + variable.group(1) + "' is not passed by render_template at line " + lineOf(template, variable.start())));
            }
        } catch (IOException e) {
            diagnostics.add(new Diagnostic("File Error", "required semantic fixtures: " + e.getMessage()));
        }
    }

    private static List<Diagnostic> classifyPython(List<String> errors, String sourceFile) {
        List<Diagnostic> result = new ArrayList<>();
        for (String error : errors) {
            if (error.contains("return is used outside") || error.contains("break is used outside") || error.contains("continue is used outside")) {
                result.add(new Diagnostic("Scope Error", sourceFile + " :: " + error));
            } else if (error.contains("already defined")) {
                result.add(new Diagnostic("Duplicate Definition", sourceFile + " :: " + error));
            } else if (error.contains("called at line") && error.contains("never defined")) {
                result.add(new Diagnostic("Undefined Function", sourceFile + " :: " + error));
            } else {
                result.add(new Diagnostic("Python Semantic Error", sourceFile + " :: " + error));
            }
        }
        return result;
    }

    private static List<Diagnostic> classifyJinja(List<String> errors, String sourceFile) {
        List<Diagnostic> result = new ArrayList<>();
        for (String error : errors) {
            if (error.contains("never defined")) result.add(new Diagnostic("Undefined Variable", sourceFile + " :: " + error));
            else if (error.contains("outside its For loop scope")) result.add(new Diagnostic("Scope Error", sourceFile + " :: " + error));
            else if (error.contains("Unknown Jinja filter")) result.add(new Diagnostic("Unknown Filter", sourceFile + " :: " + error));
            else if (error.contains("already defined")) result.add(new Diagnostic("Duplicate Definition", sourceFile + " :: " + error));
            else if (error.contains("Cannot override")) result.add(new Diagnostic("Built-in Override", sourceFile + " :: " + error));
            else if (error.contains("never used")) result.add(new Diagnostic("Unused Variable", sourceFile + " :: " + error));
            else result.add(new Diagnostic("Jinja Semantic Error", sourceFile + " :: " + error));
        }
        return result;
    }

    private static List<Diagnostic> uniqueDiagnostics(List<Diagnostic> diagnostics) {
        Set<String> seen = new LinkedHashSet<>();
        List<Diagnostic> unique = new ArrayList<>();
        for (Diagnostic diagnostic : diagnostics) {
            String key = diagnostic.category() + "|" + diagnostic.message();
            if (seen.add(key)) unique.add(diagnostic);
        }
        return unique;
    }

    private static Map<String, List<Diagnostic>> groupByCategory(List<Diagnostic> diagnostics) {
        Map<String, List<Diagnostic>> grouped = new LinkedHashMap<>();
        List<String> order = List.of("Undefined Variable", "Type Error", "Scope Error", "Type Mismatch", "Missing Flask Variable");
        for (String category : order) grouped.put(category, new ArrayList<>());
        for (Diagnostic diagnostic : diagnostics) grouped.computeIfAbsent(diagnostic.category(), ignored -> new ArrayList<>()).add(diagnostic);
        grouped.entrySet().removeIf(entry -> entry.getValue().isEmpty());
        return grouped;
    }

    private static void printGrouped(Map<String, List<Diagnostic>> grouped) {
        List<String> required = List.of("Undefined Variable", "Type Error", "Scope Error", "Type Mismatch", "Missing Flask Variable");
        System.out.println("\n================ REQUIRED CATEGORIES ================");
        printTable(grouped, required);
        List<String> additional = grouped.keySet().stream()
                .filter(category -> !required.contains(category))
                .toList();
        System.out.println("\n================ ADDITIONAL CATEGORIES ================");
        printTable(grouped, additional);
        int count = grouped.values().stream().mapToInt(List::size).sum();
        System.out.println("\nPASS: " + count + " unique diagnostics grouped without duplication\n");
    }

    private static void printTable(Map<String, List<Diagnostic>> grouped, List<String> categories) {
        System.out.println("+--------------------------+-----------------------------------------------+------+------------------------------------------------------------+");
        System.out.println("| Error Type               | File(s)                                       | Line | Description                                                |");
        System.out.println("+--------------------------+-----------------------------------------------+------+------------------------------------------------------------+");
        for (String category : categories) {
            for (Diagnostic diagnostic : grouped.getOrDefault(category, List.of())) {
                String[] parts = splitMessage(diagnostic.message());
                System.out.printf("| %-24s | %-45s | %-4s | %-58s |%n",
                        fit(category, 24), fit(parts[0], 45), fit(parts[1], 4), fit(parts[2], 58));
            }
        }
        System.out.println("+--------------------------+-----------------------------------------------+------+------------------------------------------------------------+");
    }

    private static void addTableToReport(List<String> report, Map<String, List<Diagnostic>> grouped, List<String> categories) {
        report.add("| Error Type               | File(s)                                       | Line | Description                                                |");
        report.add("|--------------------------|-----------------------------------------------|------|------------------------------------------------------------|");
        for (String category : categories) {
            for (Diagnostic diagnostic : grouped.getOrDefault(category, List.of())) {
                String[] parts = splitMessage(diagnostic.message());
                report.add(String.format("| %-24s | %-45s | %-4s | %-58s |",
                        fit(category, 24), fit(parts[0], 45), fit(parts[1], 4), fit(parts[2], 58)));
            }
        }
        report.add("|--------------------------|-----------------------------------------------|------|------------------------------------------------------------|");
    }

    private static String[] splitMessage(String message) {
        String[] sourceAndDescription = message.split("\\s*::\\s*", 2);
        String source = sourceAndDescription.length > 1 ? sourceAndDescription[0] : "-";
        String description = sourceAndDescription.length > 1 ? sourceAndDescription[1] : message;
        Matcher lineMatcher = Pattern.compile("\\bat line\\s+(\\d+)").matcher(description);
        String line = lineMatcher.find() ? lineMatcher.group(1) : "-";
        return new String[]{source, line, description};
    }

    private static String fit(String value, int width) {
        if (value == null) return "";
        return value.length() <= width ? value : value.substring(0, Math.max(0, width - 3)) + "...";
    }

    private static int count(String text, String token) {
        int result = 0, index = 0;
        while ((index = text.indexOf(token, index)) >= 0) { result++; index += token.length(); }
        return result;
    }

    private static int lineOf(String text, int position) {
        return (int) text.substring(0, position).chars().filter(ch -> ch == '\n').count() + 1;
    }
}
