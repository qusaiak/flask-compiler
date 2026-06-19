package com.flaskcompiler.ast.python;

public class AssignmentNode extends PythonNode {
    public AssignmentNode(String target, int line) {
        super("Assign:" + target, line);
    }
}
