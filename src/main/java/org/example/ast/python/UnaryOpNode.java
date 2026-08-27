package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class UnaryOpNode extends ASTNode {
    private final String operator; // رمز أو كلمة العامل الأحادي (مثل -, +, not, ~)
    private final ASTNode operand; // التعبير المستهدف بالعملية (مثل IdentifierNode أو BinaryOpNode)

    public UnaryOpNode(String operator, ASTNode operand, int line, int col) {
        super("UnaryOpNode", line, col);
        this.operator = operator;
        this.operand = operand;

        // ربط المعامل كابن في الشجرة الهرمية
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

    // Getters
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