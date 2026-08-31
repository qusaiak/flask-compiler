package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class RouteNode extends ASTNode {
    private final ASTNode path;
    private final List<String> methods;

    public RouteNode(ASTNode path, List<String> methods, int line, int col) {
        super("RouteNode", line, col);
        this.path = path;
        this.methods = methods != null ? methods : new ArrayList<>();


        if (path != null) {
            this.addChild(path);
        }
    }

    @Override
    public String getNodeType() {
        return "Route";
    }

    @Override
    public String getValue() {
        return "route";
    }

    public ASTNode getPath() {
        return path;
    }

    public List<String> getMethods() {
        return methods;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}