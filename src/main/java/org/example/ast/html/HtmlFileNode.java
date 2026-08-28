package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlFileNode extends ASTNode {
    private final String fileName;       // اسم أو مسار ملف الـ HTML
    private final List<ASTNode> children; // العناصر الجذرية داخل الملف (مثل Doctype وعنصر html الرئيسي)

    public HtmlFileNode(String fileName, int line, int col) {
        super("HtmlFileNode", line, col);
        this.fileName = fileName;
        this.children = new ArrayList<>();
    }

    /**
     * إضافة عنصر جذري جديد للملف وربطه في الشجرة الهرمية
     */
    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        return "HtmlFile";
    }

    @Override
    public String getValue() {
        return fileName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}