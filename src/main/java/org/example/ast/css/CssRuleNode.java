package org.example.ast.css;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends ASTNode {
    private final String selector;
    private final List<ASTNode> declarations;
    public CssRuleNode(String selector, int line, int col) {
        super("CssRuleNode", line, col);
        this.selector = selector;
        this.declarations = new ArrayList<>();
    }


    public void addDeclaration(ASTNode declaration) {
        if (declaration != null) {
            this.declarations.add(declaration);
            this.addChild(declaration);
        }
    }

    public String getSelector() {
        return selector;
    }

    public List<ASTNode> getDeclarations() {
        return declarations;
    }

    @Override
    public String getNodeType() {
        return "CssRule";
    }

    @Override
    public String getValue() {
        return selector;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}