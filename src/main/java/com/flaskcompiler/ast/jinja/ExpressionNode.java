package com.flaskcompiler.ast.jinja;

/** A {{ ... }} interpolation. */
public class ExpressionNode extends JinjaNode {
    public ExpressionNode(int line) {
        super("Expression", line);
    }
}
