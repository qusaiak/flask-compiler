package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ClassDefNode extends ASTNode {
    private final String className;
    private final List<ASTNode> bases;
    private final List<ASTNode> body;

    public ClassDefNode(String className, int line, int col) {
        super("ClassDefNode", line, col);
        this.className = className;
        this.bases = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public void addBase(ASTNode base) {
        if (base != null) {
            this.bases.add(base);
            this.addChild(base);
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
        return "ClassDef";
    }

    @Override
    public String getValue() {
        return className;
    }

    public String getClassName() {
        return className;
    }

    public List<ASTNode> getBases() {
        return bases;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}