package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ElifNode extends ASTNode {
    private final ASTNode condition;
    private final List<ASTNode> body;

    public ElifNode(ASTNode condition, int line, int col) {
        super("ElifNode", line, col);
        this.condition = condition;
        this.body = new ArrayList<>();

        if (condition != null) {
            this.addChild(condition);
        }
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Elif";
    }

    @Override
    public String getValue() {
        return "elif";
    }

    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}