package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ElseNode extends ASTNode {
    private final List<ASTNode> body; // العبارات البرمجية المنفذة داخل فرع الـ else

    public ElseNode(int line, int col) {
        super("ElseNode", line, col);
        this.body = new ArrayList<>();
    }

    /**
     * إضافة عبارة برمجية داخل فرع الـ else وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Else";
    }

    @Override
    public String getValue() {
        return "else";
    }

    // Getter
    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}