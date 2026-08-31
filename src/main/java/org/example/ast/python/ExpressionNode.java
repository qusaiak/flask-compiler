package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class ExpressionNode extends ASTNode {
    private final ASTNode expression;

    public ExpressionNode(ASTNode expression, int line, int col) {
        super("ExpressionNode", line, col);
        this.expression = expression;

        if (expression != null) {
            this.addChild(expression);
        }
    }

    @Override
    public String getNodeType() {
        return "Expression";
    }

    @Override
    public String getValue() {
        return "";
    }

    public ASTNode getExpression() {
        return expression;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}