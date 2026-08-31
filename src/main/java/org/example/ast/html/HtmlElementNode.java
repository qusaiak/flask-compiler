package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends ASTNode {
    private final String tagName;
    private final boolean selfClosing;        // هل الوسم مغلق ذاتياً (مثل <br/>)
    private final List<ASTNode> attributes;   // قائمة سمات وخصائص العنصر (مثل class, id)
    private final List<ASTNode> children;
    public HtmlElementNode(String tagName, boolean selfClosing, int line, int col) {
        super("HtmlElementNode", line, col);
        this.tagName = tagName;
        this.selfClosing = selfClosing;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    /**
     * إضافة خاصية (Attribute) جديدة للوسم وربطها كابن في الشجرة
     */
    public void addAttribute(ASTNode attribute) {
        if (attribute != null) {
            this.attributes.add(attribute);
            this.addChild(attribute);
        }
    }

    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public String getTagName() {
        return tagName;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public List<ASTNode> getAttributes() {
        return attributes;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        return "HtmlElement";
    }

    @Override
    public String getValue() {
        return tagName + (selfClosing ? " (self-closing)" : "");
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}