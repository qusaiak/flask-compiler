package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class UnaryOpNode extends ASTNode {
    private final String operator;
    private final ASTNode operand;

    public UnaryOpNode(String operator, ASTNode operand, int line, int col) {
        super("UnaryOpNode", line, col);
        this.operator = operator;
        this.operand = operand;

        if (operand != null) {
            this.addChild(operand);
        }
    }

    @Override
    public String getNodeType() {
        return "UnaryOp";
    }

    @Override
    public String getValue() {
        return operator;
    }

    public String getOperator() {
        return operator;
    }

    public ASTNode getOperand() {
        return operand;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}