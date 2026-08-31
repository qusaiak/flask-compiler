package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class IdentifierNode extends ASTNode {
    private final String name; // اسم المُعرّف (مثل x, count, calculate_sum)

    public IdentifierNode(String name, int line, int col) {
        super("IdentifierNode", line, col);
        this.name = name;
    }

    @Override
    public String getNodeType() {
        return "Identifier";
    }

    @Override
    public String getValue() {
        return name;
    }

    // Getter
    public String getName() {
        return name;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}