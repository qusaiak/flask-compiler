package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class LiteralNode extends ASTNode {
    private final String type;  // نوع القيمة: "int", "float", "string", "bool", "None"
    private final String value; // القيمة الفعلية كنص

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
        // دمج النوع مع القيمة لطباعتها بشكل أوضح في الشجرة (مثل: string: "test")
        return type + ": " + value;
    }

    // Getters
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