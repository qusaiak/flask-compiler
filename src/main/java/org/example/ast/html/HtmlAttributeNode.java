package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class HtmlAttributeNode extends ASTNode {
    private final String attrName;
    private final ASTNode attrValue;

    public HtmlAttributeNode(String attrName, ASTNode attrValue, int line, int col) {
        super("HtmlAttributeNode", line, col);
        this.attrName = attrName;
        this.attrValue = attrValue;

        if (attrValue != null) {
            this.addChild(attrValue);
        }
    }

    public String getAttrName() {
        return attrName;
    }

    public ASTNode getAttrValue() {
        return attrValue;
    }

    @Override
    public String getNodeType() {
        return "HtmlAttribute";
    }

    @Override
    public String getValue() {
        return attrName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}