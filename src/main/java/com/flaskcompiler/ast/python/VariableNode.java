package com.flaskcompiler.ast.python;

public class VariableNode extends PythonNode {
    public VariableNode(String name, int line) {
        super("Var:" + name, line);
    }
}
