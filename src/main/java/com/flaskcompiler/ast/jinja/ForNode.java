package com.flaskcompiler.ast.jinja;

public class ForNode extends JinjaNode {
    public ForNode(String loopVar, String iterable, int line) {
        super("For:" + loopVar + " in " + iterable, line);
    }
}
