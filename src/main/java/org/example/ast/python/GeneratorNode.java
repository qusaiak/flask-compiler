package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class GeneratorNode extends ASTNode {
    private final ASTNode expression;
    private final ASTNode target;
    private final ASTNode iterable;
    private final ASTNode condition;

    public GeneratorNode(ASTNode expression, ASTNode target, ASTNode iterable, ASTNode condition, int line, int col) {
        super("GeneratorNode", line, col);
        this.expression = expression;
        this.target = target;
        this.iterable = iterable;
        this.condition = condition;

        if (expression != null) {
            this.addChild(expression);
        }
        if (target != null) {
            this.addChild(target);
        }
        if (iterable != null) {
            this.addChild(iterable);
        }
        if (condition != null) {
            this.addChild(condition);
        }
    }

    @Override
    public String getNodeType() {
        return "Generator";
    }

    @Override
    public String getValue() {
        return "generator";
    }

    public ASTNode getExpression() {
        return expression;
    }

    public ASTNode getTarget() {
        return target;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public ASTNode getCondition() {
        return condition;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}