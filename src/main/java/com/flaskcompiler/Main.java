package com.flaskcompiler;

import com.flaskcompiler.grammar.JinjaLexer;
import com.flaskcompiler.grammar.JinjaParser;
import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Flask Compiler entry point.
 *
 * M1: parse Python (minimal Flask subset) and print its parse tree.
 * M2: parse Jinja templates (HTML kept as embedded TEXT) and print their parse trees.
 * Later milestones add: HTML/CSS grammars, AST, symbol table, semantic analysis,
 * data transfer and Flask code generation.
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path projectRoot = Paths.get("examples", "input-project");
        Path pySource = projectRoot.resolve("app.py");
        Path templatesDir = projectRoot.resolve("templates");

        // ---- Python (M1) ----
        banner("M1 :: Python lexer + parser");
        System.out.println("Parsing: " + pySource.toAbsolutePath());
        CharStream pyInput = CharStreams.fromPath(pySource);
        PythonLexer pyLexer = new PythonLexer(pyInput);
        PythonParser pyParser = new PythonParser(new CommonTokenStream(pyLexer));
        ParseTree pyTree = pyParser.file_input();
        report(pyParser, pyTree);

        // ---- Jinja (M2) ----
        banner("M2 :: Jinja lexer + parser");
        try (Stream<Path> files = Files.list(templatesDir)) {
            List<Path> templates = files
                    .filter(p -> p.toString().endsWith(".html"))
                    .sorted()
                    .toList();
            for (Path template : templates) {
                System.out.println();
                System.out.println("Parsing: " + template.getFileName());
                System.out.println("-".repeat(60));
                CharStream tplInput = CharStreams.fromPath(template);
                JinjaLexer jLexer = new JinjaLexer(tplInput);
                JinjaParser jParser = new JinjaParser(new CommonTokenStream(jLexer));
                ParseTree jTree = jParser.template();
                report(jParser, jTree);
            }
        }
    }

    private static void banner(String title) {
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(title);
        System.out.println("=".repeat(60));
    }

    private static void report(Parser parser, ParseTree tree) {
        int errors = parser.getNumberOfSyntaxErrors();
        System.out.println("Syntax errors: " + errors);
        System.out.println("PARSE TREE:");
        System.out.print(prettyTree(tree, parser, 0));
        if (errors > 0) {
            System.exit(1);
        }
    }

    /** Indented, human-readable parse-tree printer. */
    private static String prettyTree(ParseTree tree, Parser parser, int depth) {
        StringBuilder sb = new StringBuilder();
        String text = Trees.getNodeText(tree, Arrays.asList(parser.getRuleNames()));
        String trimmed = text.replace("\r", "\\r").replace("\n", "\\n");
        sb.append("  ".repeat(depth)).append(trimmed).append(System.lineSeparator());
        for (int i = 0; i < tree.getChildCount(); i++) {
            sb.append(prettyTree(tree.getChild(i), parser, depth + 1));
        }
        return sb.toString();
    }
}
