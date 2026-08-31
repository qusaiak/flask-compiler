package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class NonlocalNode extends ASTNode {
    private final List<ASTNode> names; // الأسماء المحددة كـ nonlocal (تكون عادة IdentifierNode)

    public NonlocalNode(int line, int col) {
        super("NonlocalNode", line, col);
        this.names = new ArrayList<>();
    }

    /**
     * إضافة اسم متغير غير محلي (Nonlocal Name) وربطه كابن في الشجرة
     */
    public void addName(ASTNode name) {
        if (name != null) {
            this.names.add(name);
            this.addChild(name);
        }
    }

    @Override
    public String getNodeType() {
        return "Nonlocal";
    }

    @Override
    public String getValue() {
        return "nonlocal";
    }

    // Getter
    public List<ASTNode> getNames() {
        return names;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}