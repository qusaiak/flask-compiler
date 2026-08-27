package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ElifNode extends ASTNode {
    private final ASTNode condition;  // شرط الـ elif (قد يكون CompareNode, BinaryOpNode...)
    private final List<ASTNode> body;  // العبارات البرمجية داخل فرع الـ elif

    public ElifNode(ASTNode condition, int line, int col) {
        super("ElifNode", line, col);
        this.condition = condition;
        this.body = new ArrayList<>();

        // ربط الشرط كأول ابن في شجرة الـ AST
        if (condition != null) {
            this.addChild(condition);
        }
    }

    /**
     * إضافة عبارة برمجة داخل فرع الـ elif وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Elif";
    }

    @Override
    public String getValue() {
        return "elif";
    }

    // Getters
    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}