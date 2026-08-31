package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaIfNode extends ASTNode {
    private final ASTNode condition;
    private final List<ASTNode> children;
    private final String kind;

    public JinjaIfNode(ASTNode condition, int line, int col) {
        this("if", condition, line, col);
    }

    public JinjaIfNode(String kind, ASTNode condition, int line, int col) {
        super("JinjaIfNode", line, col);
        this.kind = (kind != null) ? kind : "if";
        this.condition = condition;
        this.children = new ArrayList<>();

        if (condition != null) {
            this.addChildElement(condition);
        }
    }

    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        switch (kind) {
            case "elif": return "JinjaElif";
            case "else": return "JinjaElse";
            default:     return "JinjaIf";
        }
    }

    @Override
    public String getValue() {
        if ("else".equals(kind)) return "Jinja Else Statement";
        String condText = (condition != null) ? condition.getValue() : "";
        return (kind.equals("elif") ? "Jinja Elif: " : "Jinja If: ") + condText;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}