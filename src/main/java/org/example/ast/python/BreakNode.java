package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class BreakNode extends ASTNode {

    public BreakNode(int line, int col) {
        super("BreakNode", line, col);
    }

    @Override
    public String getNodeType() {
        return "Break";
    }

    @Override
    public String getValue() {
        return "break";
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}