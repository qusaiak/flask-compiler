package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefNode extends ASTNode {
    private final String name;
    private final boolean isAsync;
    private final List<ASTNode> parameters;
    private final List<ASTNode> body;
    private ASTNode returnType;

    public FunctionDefNode(String name, boolean isAsync, int line, int col) {
        super("FunctionDefNode", line, col);
        this.name = name;
        this.isAsync = isAsync;
        this.parameters = new ArrayList<>();
        this.body = new ArrayList<>();
        this.returnType = null;
    }

    public void addParameter(ASTNode param) {
        if (param != null) {
            this.parameters.add(param);
            this.addChild(param);
        }
    }

    public void setReturnType(ASTNode returnType) {
        this.returnType = returnType;
        if (returnType != null) {
            this.addChild(returnType);
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
        return isAsync ? "AsyncFunctionDef" : "FunctionDef";
    }

    @Override
    public String getValue() {
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean isAsync() {
        return isAsync;
    }

    public List<ASTNode> getParameters() {
        return parameters;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public ASTNode getReturnType() {
        return returnType;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}