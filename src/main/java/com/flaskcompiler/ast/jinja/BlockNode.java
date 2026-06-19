package com.flaskcompiler.ast.jinja;

public class BlockNode extends JinjaNode {
    public BlockNode(String name, int line) {
        super("Block:" + name, line);
    }
}
