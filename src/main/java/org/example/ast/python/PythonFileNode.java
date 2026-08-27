package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class PythonFileNode extends ASTNode {
    private final String fileName; // اسم أو مسار ملف البايثون

    public PythonFileNode(String fileName, int line, int col) {
        super("PythonFileNode", line, col);
        this.fileName = fileName;
    }

    @Override
    public String getNodeType() {
        return "PythonFile";
    }

    @Override
    public String getValue() {
        return fileName;
    }

    // Getter
    public String getFileName() {
        return fileName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}