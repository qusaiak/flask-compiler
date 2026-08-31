package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DecoratorNode extends ASTNode {
    private final String decoratorName;
    private final List<ASTNode> arguments;

    public DecoratorNode(String name, int line, int col) {
        super("DecoratorNode", line, col);
        this.decoratorName = name;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(ASTNode arg) {
        if (arg != null) {
            this.arguments.add(arg);
            this.addChild(arg);
        }
    }

    @Override
    public String getNodeType() {
        return "Decorator";
    }

    @Override
    public String getValue() {
        return "@" + decoratorName;
    }

    public String getDecoratorName() {
        return decoratorName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}