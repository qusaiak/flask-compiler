package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class JinjaSetNode extends ASTNode {
    private final String varName;
    private final ASTNode value;

    public JinjaSetNode(String varName, ASTNode value, int line, int col) {
        super("JinjaSetNode", line, col);
        this.varName = varName;
        this.value = value;

        if (value != null) {
            this.addChild(value);
        }
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getValueNode() {
        return value;
    }

    @Override
    public String getNodeType() {
        return "JinjaSet";
    }

    @Override
    public String getValue() {
        return varName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}