package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class ProgramNode extends ASTNode {
    public ProgramNode(int line, int col) {
        super("Program", line, col);
    }
    @Override public String getNodeType() { return "Program"; }
    @Override public String getValue()    { return "program"; }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}