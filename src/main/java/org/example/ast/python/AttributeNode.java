package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AttributeNode extends ASTNode {
    private final ASTNode objectNode;   // الكائن الأساسي (قد يكون IdentifierNode أو FunctionCallNode أو AttributeNode)
    private final String attributeName; // اسم الحقل/الميزة المطلوبة بعد النقطة

    public AttributeNode(ASTNode objectNode, String attributeName, int line, int col) {
        super("AttributeNode", line, col);
        this.objectNode = objectNode;
        this.attributeName = attributeName;

        // ربط الكائن بالشجرة ليتم طبع أجزائه عبر printFullTree
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

    // Getters لاستخدامها لاحقاً
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