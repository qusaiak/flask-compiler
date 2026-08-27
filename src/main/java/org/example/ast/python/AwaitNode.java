package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AwaitNode extends ASTNode {
    private final ASTNode expression; // التعبير المنتظر (قد يكون FunctionCallNode أو IdentifierNode...)

    public AwaitNode(ASTNode expression, int line, int col) {
        super("AwaitNode", line, col);
        this.expression = expression;

        // ربط التعبير التابع كابن في الشجرة
        this.addChild(expression);
    }

    @Override
    public String getNodeType() {
        return "Await";
    }

    @Override
    public String getValue() {
        return "await";
    }

    // Getter للحصول على التعبير
    public ASTNode getExpression() {
        return expression;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}