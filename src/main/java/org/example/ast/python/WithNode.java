package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class WithNode extends ASTNode {
    private final List<ASTNode> items;
    private final List<ASTNode>  body;

    public WithNode(int line, int col) {
        super("WithNode", line, col);
        this.items = new ArrayList<>();
        this.body  = new ArrayList<>();
    }

    public void addItem(ASTNode item) {
        if (item != null) {
            this.items.add(item);
            this.addChild(item);
        }
    }


    public void addBodyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.body.add(stmt);
            this.addChild(stmt);
        }
    }

    @Override
    public String getNodeType() {
        return "With";
    }

    @Override
    public String getValue() {
        return "with";
    }

    public List<ASTNode> getItems() {
        return items;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}