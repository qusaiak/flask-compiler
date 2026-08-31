package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class JinjaExtendsNode extends ASTNode {
    private final ASTNode template;

    public JinjaExtendsNode(ASTNode template, int line, int col) {
        super("JinjaExtendsNode", line, col);
        this.template = template;

        if (template != null) {
            this.addChild(template);
        }
    }

    public ASTNode getTemplate() {
        return template;
    }

    @Override
    public String getNodeType() {
        return "JinjaExtends";
    }

    @Override
    public String getValue() {
        return "Jinja Extends";
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}