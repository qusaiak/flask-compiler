package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class BinaryOpNode extends ASTNode {
    private final ASTNode left;
    private final String operator;
    private final ASTNode right;

    public BinaryOpNode(ASTNode left, String operator, ASTNode right, int line, int col) {
        super("BinaryOpNode", line, col);
        this.left = left;
        this.operator = operator;
        this.right = right;

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