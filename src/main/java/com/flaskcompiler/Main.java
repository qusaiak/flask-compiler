package com.flaskcompiler;

import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Flask Compiler entry point.
 *
 * M1: parse a Python (minimal Flask subset) source file and print its parse tree.
 * Later milestones add: Jinja/HTML/CSS grammars (M2-M4), AST (M5), symbol table (M6),
 * semantic analysis (M7), data transfer (M8) and Flask code generation (M9).
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path source = args.length > 0
                ? Paths.get(args[0])
                : Paths.get("examples", "input-project", "app.py");

        System.out.println("flask-compiler :: M1 (Python lexer + parser)");
        System.out.println("Parsing: " + source.toAbsolutePath());
        System.out.println("-".repeat(60));

        CharStream input = CharStreams.fromPath(source);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        ParseTree tree = parser.file_input();

        int errors = parser.getNumberOfSyntaxErrors();
        System.out.println("Syntax errors: " + errors);
        System.out.println("-".repeat(60));
        System.out.println("PARSE TREE:");
        System.out.println(prettyTree(tree, parser, 0));

        if (errors > 0) {
            System.exit(1);
        }
    }

    /** Indented, human-readable parse-tree printer. */
    private static String prettyTree(ParseTree tree, PythonParser parser, int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append("  ".repeat(depth));
        sb.append(Trees.getNodeText(tree, java.util.Arrays.asList(parser.getRuleNames())));
        sb.append(System.lineSeparator());
        for (int i = 0; i < tree.getChildCount(); i++) {
            sb.append(prettyTree(tree.getChild(i), parser, depth + 1));
        }
        return sb.toString();
    }
}
