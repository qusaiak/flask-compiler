package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AugmentedAssignmentNode extends ASTNode {
    private final ASTNode target;
    private final String operator;
    private final ASTNode value;

    public AugmentedAssignmentNode(ASTNode target, String operator, ASTNode value, int line, int col) {
        super("AugmentedAssignmentNode", line, col);
        this.target = target;
        this.operator = operator;
        this.value = value;

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