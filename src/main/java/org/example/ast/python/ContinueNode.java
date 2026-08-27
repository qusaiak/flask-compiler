package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class ContinueNode extends ASTNode {

    public ContinueNode(int line, int col) {
        super("ContinueNode", line, col);
    }

    @Override
    public String getNodeType() {
        return "Continue";
    }

    @Override
    public String getValue() {
        return "continue";
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}