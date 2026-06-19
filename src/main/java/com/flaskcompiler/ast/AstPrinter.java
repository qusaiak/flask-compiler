package com.flaskcompiler.ast;

/** Convenience entry point for printing an AST tree. */
public final class AstPrinter {

    private AstPrinter() { }

    public static void print(String title, Node root) {
        System.out.println(title);
        root.printTree();
    }
}
