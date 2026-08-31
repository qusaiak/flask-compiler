package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class LiteralNode extends ASTNode {
    private final String type;  // "int", "float", "string", "bool", or "None".
    private final String value; // Literal value stored as text.

    public LiteralNode(String type, String value, int line, int col) {
        super("LiteralNode", line, col);
        this.type = type;
        this.value = value;
    }

    @Override
    public String getNodeType() {
        return "Literal";
    }

    @Override
    public String getValue() {
        return type + ": " + value;
    }

    public String getType() {
        return type;
    }

    public String getRawValue() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}