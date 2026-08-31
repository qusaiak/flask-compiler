package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class RaiseNode extends ASTNode {
    private final ASTNode exception; // تعبير الاستثناء المُثار (مثل CallNode أو IdentifierNode)
    private final ASTNode cause;     // التعبير المسبب (اللاحقة الاختيارية from ...)

    public RaiseNode(ASTNode exception, ASTNode cause, int line, int col) {
        super("RaiseNode", line, col);
        this.exception = exception;
        this.cause = cause;

        // ربط الاستثناء كابن في الشجرة
        if (exception != null) {
            this.addChild(exception);
        }
        // ربط السبب الاختياري كابن في الشجرة إن وجد
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

    // Getters
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