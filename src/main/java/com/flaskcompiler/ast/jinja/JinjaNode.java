package com.flaskcompiler.ast.jinja;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.Visitor;

/** Base class for all Jinja AST nodes. */
public abstract class JinjaNode extends Node {
    protected JinjaNode(String nodeName, int line) {
        super(nodeName, line);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitJinja(this);
    }
}
