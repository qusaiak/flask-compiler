package com.flaskcompiler.ast.jinja;

public class IfNode extends JinjaNode {
    public IfNode(String condition, int line) {
        super("If:" + condition, line);
    }
}
