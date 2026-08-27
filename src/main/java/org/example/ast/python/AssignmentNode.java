package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AssignmentNode extends ASTNode {
    private final ASTNode target; // قد يكون IdentifierNode أو AttributeAccessNode...
    private final ASTNode value;  // قد يكون LiteralNode أو BinaryOpNode أو FunctionCallNode...

    public AssignmentNode(ASTNode target, ASTNode value, int line, int col) {
        super("AssignmentNode", line, col);
        this.target = target;
        this.value = value;

        // ربط الأبناء بالشجرة
        this.addChild(target);
        this.addChild(value);
    }

    @Override
    public String getNodeType() {
        return "Assignment";
    }

    @Override
    public String getValue() {
        return "=";
    }

    // getters لاستخدامها لاحقاً في Semantic Analysis والـ Code Generation
    public ASTNode getTarget() {
        return target;
    }

    public ASTNode getValueNode() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}