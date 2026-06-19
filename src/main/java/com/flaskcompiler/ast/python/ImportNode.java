package com.flaskcompiler.ast.python;

public class ImportNode extends PythonNode {
    public ImportNode(String description, int line) {
        super("Import:" + description, line);
    }
}
