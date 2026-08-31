package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class SubscriptNode extends ASTNode {
    private final ASTNode object;
    private final ASTNode index;

    public SubscriptNode(ASTNode object, ASTNode index, int line, int col) {
        super("SubscriptNode", line, col);
        this.object = object;
        this.index = index;

        if (object != null) {
            this.addChild(object);
        }
        if (index != null) {
            this.addChild(index);
        }
    }

    @Override
    public String getNodeType() {
        return "Subscript";
    }

    @Override
    public String getValue() {
        return "[]";
    }

    public ASTNode getObject() {
        return object;
    }

    public ASTNode getIndex() {
        return index;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}