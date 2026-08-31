package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class YieldNode extends ASTNode {
    private final ASTNode value;

    public YieldNode(ASTNode value, int line, int col) {
        super("YieldNode", line, col);
        this.value = value;

        if (value != null) {
            this.addChild(value);
        }
    }

    @Override
    public String getNodeType() {
        return "Yield";
    }

    @Override
    public String getValue() {
        return "yield";
    }

    public ASTNode getYieldValue() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}