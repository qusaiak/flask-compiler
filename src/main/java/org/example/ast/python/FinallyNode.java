package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FinallyNode extends ASTNode {
    private final List<ASTNode> body;

    public FinallyNode(int line, int col) {
        super("FinallyNode", line, col);
        this.body = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Finally";
    }

    @Override
    public String getValue() {
        return "finally";
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}