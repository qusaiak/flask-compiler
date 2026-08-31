package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class RaiseNode extends ASTNode {
    private final ASTNode exception;
    private final ASTNode cause;

    public RaiseNode(ASTNode exception, ASTNode cause, int line, int col) {
        super("RaiseNode", line, col);
        this.exception = exception;
        this.cause = cause;

        if (exception != null) {
            this.addChild(exception);
        }
        if (cause != null) {
            this.addChild(cause);
        }
    }

    @Override
    public String getNodeType() {
        return "Raise";
    }

    @Override
    public String getValue() {
        return "raise";
    }

    public ASTNode getException() {
        return exception;
    }

    public ASTNode getCause() {
        return cause;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}