package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class TryNode extends ASTNode {
    private final List<ASTNode> body;
    private final List<ASTNode> handlers;
    private final List<ASTNode> orElse;
    private final List<ASTNode> finalBody;

    public TryNode(int line, int col) {
        super("TryNode", line, col);
        this.body = new ArrayList<>();
        this.handlers = new ArrayList<>();
        this.orElse = new ArrayList<>();
        this.finalBody = new ArrayList<>();
    }

    public void addBodyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.body.add(stmt);
            this.addChild(stmt);
        }
    }

    public void addHandler(ASTNode handler) {
        if (handler != null) {
            this.handlers.add(handler);
            this.addChild(handler);
        }
    }

    public void addElseStatement(ASTNode stmt) {
        if (stmt != null) {
            this.orElse.add(stmt);
            this.addChild(stmt);
        }
    }

    public void addFinallyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.finalBody.add(stmt);
            this.addChild(stmt);
        }
    }

    @Override
    public String getNodeType() {
        return "Try";
    }

    @Override
    public String getValue() {
        return "try";
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getHandlers() {
        return handlers;
    }

    public List<ASTNode> getOrElse() {
        return orElse;
    }

    public List<ASTNode> getFinalBody() {
        return finalBody;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}