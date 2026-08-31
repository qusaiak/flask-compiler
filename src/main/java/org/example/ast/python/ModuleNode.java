package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ModuleNode extends ASTNode {
    private final List<ASTNode> body; // العبارات البرمجية العليا (Top-level statements) في ملف بايثون

    public ModuleNode(int line, int col) {
        super("ModuleNode", line, col);
        this.body = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Module";
    }

    @Override
    public String getValue() {
        return "";
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}