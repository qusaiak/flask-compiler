package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class ExpressionNode extends ASTNode {
    private final ASTNode expression; // التعبير البرمجي الداخلي (قد يكون CallNode أو BinaryOpNode أو LiteralNode...)

    public ExpressionNode(ASTNode expression, int line, int col) {
        super("ExpressionNode", line, col);
        this.expression = expression;

        // ربط التعبير الداخلي كابن في الشجرة
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

    // Getter
    public ASTNode getExpression() {
        return expression;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}