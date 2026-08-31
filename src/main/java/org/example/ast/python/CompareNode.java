package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CompareNode extends ASTNode {
    private final ASTNode left;               // التعبير الأيسر الأساسي
    private final List<String> operators;     // رموز عمليات المقارنة (<, <=, ==, !=, in...)
    private final List<ASTNode> comparators;  // القيم/التعابير المقارنة الجهة اليمنى

    public CompareNode(ASTNode left, int line, int col) {
        super("CompareNode", line, col);
        this.left = left;
        this.operators = new ArrayList<>();
        this.comparators = new ArrayList<>();

        // ربط التعبير الأيسر كأول ابن في الشجرة
        if (left != null) {
            this.addChild(left);
        }
    }

    /**
     * إضافة عملية مقارنة جديدة مع الطرف الأيمن المرفق بها ورسمها في الشجرة
     */
    public void addComparison(String operator, ASTNode comparator) {
        if (operator != null && comparator != null) {
            this.operators.add(operator);
            this.comparators.add(comparator);
            this.addChild(comparator);
        }
    }

    @Override
    public String getNodeType() {
        return "Compare";
    }

    @Override
    public String getValue() {
        return String.join(", ", operators);
    }

    // Getters
    public ASTNode getLeft() {
        return left;
    }

    public List<String> getOperators() {
        return operators;
    }

    public List<ASTNode> getComparators() {
        return comparators;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}