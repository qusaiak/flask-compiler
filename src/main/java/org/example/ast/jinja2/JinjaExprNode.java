package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class JinjaExprNode extends ASTNode {
    private final ASTNode expression; // التعبير البرمجي أو المتغير المراد تقييمه وعرضه (مثل VariableNode أو FunctionCallNode)

    public JinjaExprNode(ASTNode expression, int line, int col) {
        super("JinjaExprNode", line, col);
        this.expression = expression;


        if (expression != null) {
            this.addChild(expression);
        }
    }

    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public String getNodeType() {
        return "JinjaExpr";
    }

    @Override
    public String getValue() {
        return "Jinja Expression";
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}