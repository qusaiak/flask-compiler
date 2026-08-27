package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class SubscriptNode extends ASTNode {
    private final ASTNode object; // الكائن الأساسي المراد الوصول إليه (مثل IdentifierNode أو SubscriptNode آخر)
    private final ASTNode index;  // الفهرس أو المفتاح داخل الأقواس (مثل LiteralNode أو BinaryOpNode)

    public SubscriptNode(ASTNode object, ASTNode index, int line, int col) {
        super("SubscriptNode", line, col);
        this.object = object;
        this.index = index;

        // ربط الكائن والفهرس كأبناء في الشجرة الهرمية
        if (object != null) {
            this.addChild(object);
        }
        if (index != null) {
            this.addChild(index);
        }
    }

    @Override
    public String getNodeType() {
        return "Subscript";
    }

    @Override
    public String getValue() {
        return "[]";
    }

    // Getters
    public ASTNode getObject() {
        return object;
    }

    public ASTNode getIndex() {
        return index;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}