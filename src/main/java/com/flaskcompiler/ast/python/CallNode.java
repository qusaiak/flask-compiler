package com.flaskcompiler.ast.python;

public class CallNode extends PythonNode {
    public CallNode(String callee, int line) {
        super("Call:" + callee, line);
    }
}
