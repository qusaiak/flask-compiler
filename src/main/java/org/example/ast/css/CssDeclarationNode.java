package org.example.ast.css;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class CssDeclarationNode extends ASTNode {
    private final String property;
    private final ASTNode cssValue;
    public CssDeclarationNode(String property, ASTNode cssValue, int line, int col) {
        super("CssDeclarationNode", line, col);
        this.property = property;
        this.cssValue = cssValue;

        if (cssValue != null) {
            this.addChild(cssValue);
        }
    }

    public String getProperty() {
        return property;
    }

    public ASTNode getCssValue() {
        return cssValue;
    }

    @Override
    public String getNodeType() {
        return "CssDeclaration";
    }

    @Override
    public String getValue() {
        return property;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}