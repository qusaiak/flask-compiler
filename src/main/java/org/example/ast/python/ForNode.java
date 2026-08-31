package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForNode extends ASTNode {
    private final ASTNode target;
    private final ASTNode iterable;
    private final List<ASTNode> body;
    private final List<ASTNode> orelse;

    public ForNode(ASTNode target, ASTNode iterable, int line, int col) {
        super("ForNode", line, col);
        this.target = target;
        this.iterable = iterable;
        this.body = new ArrayList<>();
        this.orelse = new ArrayList<>();

        if (target != null) {
            this.addChild(target);
        }
        if (iterable != null) {
            this.addChild(iterable);
        }
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    public void addElseStatement(ASTNode statement) {
        if (statement != null) {
            this.orelse.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "For";
    }

    @Override
    public String getValue() {
        return "in";
    }

    public ASTNode getTarget() {
        return target;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getOrElse() {
        return orelse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}