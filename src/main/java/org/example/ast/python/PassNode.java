package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class PassNode extends ASTNode {

    public PassNode(int line, int col) {
        super("PassNode", line, col);
    }

    @Override
    public String getNodeType() {
        return "Pass";
    }

    @Override
    public String getValue() {
        return "";
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}