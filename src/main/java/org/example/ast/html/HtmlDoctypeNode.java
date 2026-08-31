package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class HtmlDoctypeNode extends ASTNode {
    private final String doctype;

    public HtmlDoctypeNode(String doctype, int line, int col) {
        super("HtmlDoctypeNode", line, col);
        this.doctype = doctype;
    }

    public String getDoctype() {
        return doctype;
    }

    @Override
    public String getNodeType() {
        return "HtmlDoctype";
    }

    @Override
    public String getValue() {
        return doctype;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}