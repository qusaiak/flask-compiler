package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class WhileNode extends ASTNode {
    private final ASTNode condition;         // شرط الحلقة (مثل CompareNode أو IdentifierNode)
    private final List<ASTNode> body;        // الأوامر البرمجية داخل كتلة while
    private final List<ASTNode> orelse;      // كتل else الاختيارية المرتبطة بالحلقة

    public WhileNode(ASTNode condition, int line, int col) {
        super("WhileNode", line, col);
        this.condition = condition;
        this.body = new ArrayList<>();
        this.orelse = new ArrayList<>();

        // ربط شرط الحلقة كابن في الشجرة الهرمية
        if (condition != null) {
            this.addChild(condition);
        }
    }

    /**
     * إضافة عبارة برمجية لجسم الحلقة وربطها كابن في الشجرة
     */
    public void addBodyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.body.add(stmt);
            this.addChild(stmt);
        }
    }

    /**
     * إضافة عبارة برمجية لكتلة else الاختيارية وربطها كابن في الشجرة
     */
    public void addElseStatement(ASTNode stmt) {
        if (stmt != null) {
            this.orelse.add(stmt);
            this.addChild(stmt);
        }
    }

    @Override
    public String getNodeType() {
        return "While";
    }

    @Override
    public String getValue() {
        return "while";
    }

    // Getters
    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getElse() {
        return orelse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}