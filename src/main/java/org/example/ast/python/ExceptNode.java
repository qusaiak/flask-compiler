package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ExceptNode extends ASTNode {
    private final ASTNode exceptionType;
    private final String varName;
    private final List<ASTNode> body;

    public ExceptNode(ASTNode exceptionType, String varName, int line, int col) {
        super("ExceptNode", line, col);
        this.exceptionType = exceptionType;
        this.varName = varName;
        this.body = new ArrayList<>();

        if (exceptionType != null) {
            this.addChild(exceptionType);
        }
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Except";
    }

    @Override
    public String getValue() {
        if (exceptionType == null) {
            return "except";
        }
        return varName != null ? "as " + varName : "except";
    }

    public ASTNode getExceptionType() {
        return exceptionType;
    }

    public String getVarName() {
        return varName;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}