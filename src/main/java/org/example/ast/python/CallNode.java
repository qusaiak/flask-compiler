package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CallNode extends ASTNode {
    private final ASTNode functionNode;
    private final List<ASTNode> arguments;

    public CallNode(ASTNode functionNode, int line, int col) {
        super("CallNode", line, col);
        this.functionNode = functionNode;
        this.arguments = new ArrayList<>();


        this.addChild(functionNode);
    }

    public void addArgument(ASTNode arg) {
        if (arg != null) {
            this.arguments.add(arg);
            this.addChild(arg);
        }
    }

    @Override
    public String getNodeType() {
        return "Call";
    }

    @Override
    public String getValue() {
        return "()";
    }

    public ASTNode getFunctionNode() {
        return functionNode;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}