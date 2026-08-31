package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class ReturnNode extends ASTNode {
    private final ASTNode value; // التعبير المُعاد (اختياري، قد يكون null في حالة return الفارغة)

    public ReturnNode(ASTNode value, int line, int col) {
        super("ReturnNode", line, col);
        this.value = value;

        // ربط التعبير المُعاد كابن في الشجرة إن وجد
        if (value != null) {
            this.addChild(value);
        }
    }

    @Override
    public String getNodeType() {
        return "Return";
    }

    @Override
    public String getValue() {
        return "return";
    }

    // Getter
    public ASTNode getReturnValue() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}