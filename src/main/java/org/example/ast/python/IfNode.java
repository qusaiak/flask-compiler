package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends ASTNode {
    private final ASTNode condition;       // شرط الـ if (قد يكون CompareNode, BinaryOpNode...)
    private final List<ASTNode> body;       // العبارات البرمجية داخل جسم الـ if
    private final List<ASTNode> elifNodes;  // كتل elif الملحقة (عقد ElifNode)
    private ASTNode elseNode;              // كتلة else الملحقة (عقدة ElseNode)

    public IfNode(ASTNode condition, int line, int col) {
        super("IfNode", line, col);
        this.condition = condition;
        this.body = new ArrayList<>();
        this.elifNodes = new ArrayList<>();
        this.elseNode = null;

        // ربط الشرط كأول ابن في شجرة الـ AST
        if (condition != null) {
            this.addChild(condition);
        }
    }

    /**
     * إضافة عبارة برمجية داخل جسم الـ if وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    /**
     * إضافة كتلة elif (عقدة ElifNode) وربطها كابن في الشجرة
     */
    public void addElif(ASTNode elifNode) {
        if (elifNode != null) {
            this.elifNodes.add(elifNode);
            this.addChild(elifNode);
        }
    }

    /**
     * تعيين كتلة else (عقدة ElseNode) وربطها كابن في الشجرة
     */
    public void setElseNode(ASTNode elseNode) {
        this.elseNode = elseNode;
        if (elseNode != null) {
            this.addChild(elseNode);
        }
    }

    @Override
    public String getNodeType() {
        return "If";
    }

    @Override
    public String getValue() {
        return "if";
    }

    // Getters
    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getElifNodes() {
        return elifNodes;
    }

    public ASTNode getElseNode() {
        return elseNode;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}