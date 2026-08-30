package org.example.reporting;

import org.example.ast.ASTNode;
import org.example.semantic.Symbol;
import org.example.semantic.SymbolTable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * يجمع أدلة مراحل المترجم أثناء التشغيل كاملاً (كل ملفات app.py وJinja معاً)
 * ثم يكتبها دفعة واحدة في نهاية التشغيل داخل compiler_output/ بالأسماء التالية
 * (مطابقة تماماً لما ورد في وصف المشروع):
 *   - ast_python.json      : شجرة AST لملف app.py وحده.
 *   - ast_jinja.json        : شجرة AST لكل قوالب Jinja التي عُولجت (مصفوفة واحدة).
 *   - semantic_report.txt   : تقرير موحّد لجدول الرموز والأخطاء الدلالية لكل الملفات.
 *   - generation_log.txt    : سجل خطوات مرحلة Code Generation (توليد HTML ونسخ الملفات الداعمة).
 *
 * لا يغيّر التحليل أو التوليد؛ وظيفته توثيق AST والرموز والأخطاء وخطوات التوليد فقط.
 */
public final class CompilerReportWriter {
    private CompilerReportWriter() {
    }

    private static String pythonInputPath;
    private static ASTNode pythonAst;

    private static final List<String> jinjaInputPaths = new ArrayList<>();
    private static final List<ASTNode> jinjaAsts = new ArrayList<>();

    private static final StringBuilder semanticReport = new StringBuilder();
    private static final List<String> generationLogLines = new ArrayList<>();

    /** يسجّل نتائج تحليل ملف app.py (استدعاء واحد لكل تشغيل عادةً). */
    public static void recordPython(
            String inputPath,
            ASTNode ast,
            SymbolTable symbolTable,
            List<String> semanticErrors
    ) {
        pythonInputPath = inputPath;
        pythonAst = ast;
        appendSemanticSection("Python — " + inputPath, symbolTable, semanticErrors);
    }

    /** يسجّل نتائج تحليل قالب Jinja واحد؛ يُستدعى مرة لكل ملف قالب تتم معالجته. */
    public static void recordJinja(
            String inputPath,
            ASTNode ast,
            SymbolTable symbolTable,
            List<String> semanticErrors
    ) {
        jinjaInputPaths.add(inputPath);
        jinjaAsts.add(ast);
        appendSemanticSection("Jinja — " + inputPath, symbolTable, semanticErrors);
    }

    /** يضيف سطراً إلى سجل مرحلة التوليد (generation_log.txt). */
    public static void logGeneration(String line) {
        generationLogLines.add(line);
    }

    private static void appendSemanticSection(String title, SymbolTable symbolTable, List<String> semanticErrors) {
        semanticReport.append("=== ").append(title).append(" ===\n");

        semanticReport.append("--- Symbol Table ---\n");
        if (symbolTable == null || symbolTable.getAllDefinedSymbols().isEmpty()) {
            semanticReport.append("(no symbols)\n");
        } else {
            for (Symbol symbol : symbolTable.getAllDefinedSymbols()) {
                semanticReport.append("- ").append(symbol.getName())
                        .append(" | ").append(symbol.getCategory())
                        .append(" | line ").append(symbol.getLine())
                        .append(" | used=").append(symbol.isUsed())
                        .append("\n");
            }
        }

        semanticReport.append("--- Semantic Analysis ---\n");
        if (semanticErrors == null || semanticErrors.isEmpty()) {
            semanticReport.append("0 semantic errors\n");
        } else {
            for (String error : semanticErrors) {
                semanticReport.append("- ").append(error).append("\n");
            }
        }
        semanticReport.append("\n");
    }

    /** يكتب كل ملفات compiler_output/ دفعة واحدة. يُستدعى مرة واحدة في نهاية main(). */
    public static void flush() {
        try {
            Path outputDir = Path.of("compiler_output");
            Files.createDirectories(outputDir);

            Files.writeString(
                    outputDir.resolve("ast_python.json"),
                    buildSingleAstJson(pythonInputPath, pythonAst),
                    StandardCharsets.UTF_8
            );
            Files.writeString(
                    outputDir.resolve("ast_jinja.json"),
                    buildMultiAstJson(jinjaInputPaths, jinjaAsts),
                    StandardCharsets.UTF_8
            );
            Files.writeString(
                    outputDir.resolve("semantic_report.txt"),
                    semanticReport.toString(),
                    StandardCharsets.UTF_8
            );
            Files.writeString(
                    outputDir.resolve("generation_log.txt"),
                    String.join("\n", generationLogLines) + "\n",
                    StandardCharsets.UTF_8
            );
        } catch (IOException exception) {
            System.err.println("  [!] Could not write compiler report: " + exception.getMessage());
        }
    }

    private static String buildSingleAstJson(String inputPath, ASTNode ast) {
        StringBuilder json = new StringBuilder();
        json.append("{\n  \"input\": \"").append(escape(inputPath)).append("\",\n");
        json.append("  \"ast\": ");
        appendJsonNode(json, ast);
        json.append("\n}\n");
        return json.toString();
    }

    private static String buildMultiAstJson(List<String> inputPaths, List<ASTNode> asts) {
        StringBuilder json = new StringBuilder();
        json.append("{\n  \"templates\": [");
        for (int index = 0; index < asts.size(); index++) {
            if (index > 0) json.append(",");
            json.append("\n    {\n      \"input\": \"").append(escape(inputPaths.get(index))).append("\",\n");
            json.append("      \"ast\": ");
            appendJsonNode(json, asts.get(index));
            json.append("\n    }");
        }
        if (!asts.isEmpty()) json.append("\n  ");
        json.append("]\n}\n");
        return json.toString();
    }

    private static void appendJsonNode(StringBuilder json, ASTNode node) {
        if (node == null) {
            json.append("null");
            return;
        }
        json.append("{\"type\": \"").append(escape(node.getNodeType()))
                .append("\", \"value\": \"").append(escape(node.getValue()))
                .append("\", \"line\": ").append(node.getLineNumber())
                .append(", \"children\": [");
        List<ASTNode> children = node.getChildren();
        for (int index = 0; index < children.size(); index++) {
            if (index > 0) json.append(", ");
            appendJsonNode(json, children.get(index));
        }
        json.append("]}");
    }

    private static String escape(String value) {
        if (value == null) return "";
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r");
    }
}
