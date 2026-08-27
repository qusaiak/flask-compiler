package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class AssertNode extends ASTNode {
    private final String condition;
    private final String message;

    public AssertNode(String condition, String message, int line, int col) {
        super("Assert", line, col);
        this.condition = condition;
        this.message = message;
    }

    @Override
    public String getNodeType() {
        return "Assert";
    }

    @Override
    public String getValue() {
        return message == null ? condition : condition + ", " + message;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}