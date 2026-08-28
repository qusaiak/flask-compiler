package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class JinjaElifNode extends ASTNode {
    private final String condition;
    public JinjaElifNode(String condition, int line, int col) {
        super("JinjaElif", line, col);
        this.condition = condition;
    }
    public String getCondition() { return condition; }
    @Override public String getNodeType() { return "JinjaElif"; }
    @Override public String getValue()    { return condition; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}