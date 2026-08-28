package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaForNode extends ASTNode {
    private final ASTNode variable;
    private final ASTNode iterable;
    private final List<ASTNode> children;

    public JinjaForNode(ASTNode variable, ASTNode iterable, int line, int col) {
        super("JinjaForNode", line, col);
        this.variable = variable;
        this.iterable = iterable;
        this.children = new ArrayList<>();

        if (variable != null) {
            this.addChild(variable);
        }
        if (iterable != null) {
            this.addChild(iterable);
        }
    }


    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public ASTNode getVariable() {
        return variable;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        return "JinjaFor";
    }

    @Override
    public String getValue() {
        String variableName = variable == null ? "?" : variable.getValue();
        String iterableName = iterable == null ? "?" : iterable.getValue();
        return variableName + " in " + iterableName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}