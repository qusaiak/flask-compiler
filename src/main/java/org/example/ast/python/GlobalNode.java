package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class GlobalNode extends ASTNode {
    private final List<ASTNode> names; // الأسماء المحددة كـ global (تكون عادة IdentifierNode)

    public GlobalNode(int line, int col) {
        super("GlobalNode", line, col);
        this.names = new ArrayList<>();
    }

    /**
     * إضافة اسم متغير عام (Global Name) وربطه كابن في الشجرة
     */
    public void addName(ASTNode name) {
        if (name != null) {
            this.names.add(name);
            this.addChild(name);
        }
    }

    @Override
    public String getNodeType() {
        return "Global";
    }

    @Override
    public String getValue() {
        return "global";
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