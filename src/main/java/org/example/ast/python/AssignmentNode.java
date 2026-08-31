package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AssignmentNode extends ASTNode {
    private final ASTNode target;
    private final ASTNode value;

    public AssignmentNode(ASTNode target, ASTNode value, int line, int col) {
        super("AssignmentNode", line, col);
        this.target = target;
        this.value = value;

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