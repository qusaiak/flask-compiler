package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DeleteNode extends ASTNode {
    private final List<ASTNode> targets; // الأهداف المراد حذفها (قد تكون IdentifierNode, AttributeNode, SubscriptNode...)

    public DeleteNode(int line, int col) {
        super("DeleteNode", line, col);
        this.targets = new ArrayList<>();
    }

    /**
     * إضافة هدف مراد حذفه كـ ASTNode وربطه كابن في الشجرة
     */
    public void addTarget(ASTNode target) {
        if (target != null) {
            this.targets.add(target);
            this.addChild(target);
        }
    }

    @Override
    public String getNodeType() {
        return "Delete";
    }

    @Override
    public String getValue() {
        return "del";
    }

    // Getter
    public List<ASTNode> getTargets() {
        return targets;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}