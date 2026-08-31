package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AugmentedAssignmentNode extends ASTNode {
    private final ASTNode target;  // المتغير المستهدف (IdentifierNode أو AttributeNode...)
    private final String operator; // رمز العملية المركبة (+=, -=, *=, /= ...)
    private final ASTNode value;   // القيمة/التعبير الأيمن

    public AugmentedAssignmentNode(ASTNode target, String operator, ASTNode value, int line, int col) {
        super("AugmentedAssignmentNode", line, col);
        this.target = target;
        this.operator = operator;
        this.value = value;

        // ربط الطرفين كأبناء في الشجرة
        this.addChild(target);
        this.addChild(value);
    }

    @Override
    public String getNodeType() {
        return "AugAssign";
    }

    @Override
    public String getValue() {
        return operator;
    }

    // Getters
    public ASTNode getTarget() {
        return target;
    }

    public String getOperator() {
        return operator;
    }

    public ASTNode getValueNode() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}