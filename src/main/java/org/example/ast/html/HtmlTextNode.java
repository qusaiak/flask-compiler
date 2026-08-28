package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class HtmlTextNode extends ASTNode {
    private final String text; // محتوى النص داخل صفحة الويب

    public HtmlTextNode(String text, int line, int col) {
        super("HtmlTextNode", line, col);
        this.text = text != null ? text.trim() : "";
    }

    public String getText() {
        return text;
    }

    @Override
    public String getNodeType() {
        return "HtmlText";
    }

    @Override
    public String getValue() {
        return text;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}