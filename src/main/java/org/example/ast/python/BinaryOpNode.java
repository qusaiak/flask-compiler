package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class BinaryOpNode extends ASTNode {
    private final ASTNode left;     // المعامل الأيسر (قد يكون Literal, Identifier, أو BinaryOpNode آخر)
    private final String operator;  // رمز العملية (+, -, *, /, %, ==, and ...)
    private final ASTNode right;    // المعامل الأيمن

    public BinaryOpNode(ASTNode left, String operator, ASTNode right, int line, int col) {
        super("BinaryOpNode", line, col);
        this.left = left;
        this.operator = operator;
        this.right = right;

        // ربط المعاملين الأيسر والأيمن كأبناء في الشجرة
        this.addChild(left);
        this.addChild(right);
    }

    @Override
    public String getNodeType() {
        return "BinOp";
    }

    @Override
    public String getValue() {
        return operator;
    }

    // Getters
    public ASTNode getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public ASTNode getRight() {
        return right;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}