package com.flaskcompiler.ast.jinja;

public class VariableReferenceNode extends JinjaNode {
    public VariableReferenceNode(String path, int line) {
        super("Ref:" + path, line);
    }
}
