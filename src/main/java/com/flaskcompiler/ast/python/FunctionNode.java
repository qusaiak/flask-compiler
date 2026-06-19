package com.flaskcompiler.ast.python;

/** A plain function definition (no Flask route decorator). */
public class FunctionNode extends PythonNode {
    public FunctionNode(String signature, int line) {
        super("Function:" + signature, line);
    }
}
