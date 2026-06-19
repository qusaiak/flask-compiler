package com.flaskcompiler.ast.python;

public class LiteralNode extends PythonNode {
    public LiteralNode(String value, int line) {
        super("Literal:" + value, line);
    }
}
