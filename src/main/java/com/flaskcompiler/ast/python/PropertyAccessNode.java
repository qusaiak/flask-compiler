package com.flaskcompiler.ast.python;

/** Property access (a.b) or subscription (a[b]); leaf carrying its source text. */
public class PropertyAccessNode extends PythonNode {
    public PropertyAccessNode(String path, int line) {
        super("Property:" + path, line);
    }
}
