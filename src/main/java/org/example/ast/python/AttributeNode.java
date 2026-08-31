package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AttributeNode extends ASTNode {
    private final ASTNode objectNode;
    private final String attributeName;

    public AttributeNode(ASTNode objectNode, String attributeName, int line, int col) {
        super("AttributeNode", line, col);
        this.objectNode = objectNode;
        this.attributeName = attributeName;

        this.addChild(objectNode);
    }

    @Override
    public String getNodeType() {
        return "Attribute";
    }

    @Override
    public String getValue() {
        return "." + attributeName;
    }

    public ASTNode getObjectNode() {
        return objectNode;
    }

    public String getAttributeName() {
        return attributeName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}