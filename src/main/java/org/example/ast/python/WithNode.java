package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class WithNode extends ASTNode {
    private final List<ASTNode> items; // عناصر وسياقات التنفيذ (مثل تعبيرات open والمتحول الاختياري as)
    private final List<ASTNode>  body;  // الأوامر البرمجية داخل كتلة with

    public WithNode(int line, int col) {
        super("WithNode", line, col);
        this.items = new ArrayList<>();
        this.body  = new ArrayList<>();
    }

    /**
     * إضافة عنصر سياق (Context Item) وربطه كابن في الشجرة
     */
    public void addItem(ASTNode item) {
        if (item != null) {
            this.items.add(item);
            this.addChild(item);
        }
    }

    /**
     * إضافة عبارة برمجية لجسم كتلة with وربطها كابن في الشجرة
     */
    public void addBodyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.body.add(stmt);
            this.addChild(stmt);
        }
    }

    @Override
    public String getNodeType() {
        return "With";
    }

    @Override
    public String getValue() {
        return "with";
    }

    // Getters
    public List<ASTNode> getItems() {
        return items;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}