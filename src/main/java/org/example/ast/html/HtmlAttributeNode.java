package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class HtmlAttributeNode extends ASTNode {
    private final String attrName;    // اسم الخاصية (مثل class, id, href, أو سمات Jinja2)
    private final ASTNode attrValue;  // قيمة الخاصية (قد تكون LiteralNode أو تعبير ديناميكي معقد)

    public HtmlAttributeNode(String attrName, ASTNode attrValue, int line, int col) {
        super("HtmlAttributeNode", line, col);
        this.attrName = attrName;
        this.attrValue = attrValue;

        // ربط قيمة الخاصية كابن في الشجرة الهرمية إن وجدت
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