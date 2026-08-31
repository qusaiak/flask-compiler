package org.example.ast.css;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class CssSelectorNode extends ASTNode {
    private final String selectorText;

    public CssSelectorNode(String selectorText, int line, int col) {
        super("CssSelectorNode", line, col);
        this.selectorText = selectorText;
    }

    public String getSelectorText() {
        return selectorText;
    }

    @Override
    public String getNodeType() {
        return "CssSelector";
    }

    @Override
    public String getValue() {
        return selectorText;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}