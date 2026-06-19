package com.flaskcompiler.ast.python;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.Visitor;

/** Base class for all Python AST nodes. */
public abstract class PythonNode extends Node {
    protected PythonNode(String nodeName, int line) {
        super(nodeName, line);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPython(this);
    }
}
