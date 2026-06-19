package com.flaskcompiler.ast;

import com.flaskcompiler.ast.jinja.JinjaNode;
import com.flaskcompiler.ast.python.PythonNode;

/**
 * Minimal visitor over the two AST families plus a generic fallback.
 */
public interface Visitor {
    void visitPython(PythonNode node);
    void visitJinja(JinjaNode node);
    void visitGeneric(Node node);
}
