package com.flaskcompiler.ast.python;

public class ReturnNode extends PythonNode {
    public ReturnNode(int line) {
        super("Return", line);
    }
}
