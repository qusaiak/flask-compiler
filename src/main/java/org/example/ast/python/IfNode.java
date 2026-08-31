package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends ASTNode {
    private final ASTNode condition;
    private final List<ASTNode> body;
    private final List<ASTNode> elifNodes;
    private ASTNode elseNode;

    public IfNode(ASTNode condition, int line, int col) {
        super("IfNode", line, col);
        this.condition = condition;
        this.body = new ArrayList<>();
        this.elifNodes = new ArrayList<>();
        this.elseNode = null;

        if (condition != null) {
            this.addChild(condition);
        }
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    public void addElif(ASTNode elifNode) {
        if (elifNode != null) {
            this.elifNodes.add(elifNode);
            this.addChild(elifNode);
        }
    }

    public void setElseNode(ASTNode elseNode) {
        this.elseNode = elseNode;
        if (elseNode != null) {
            this.addChild(elseNode);
        }
    }

    @Override
    public String getNodeType() {
        return "If";
    }

    @Override
    public String getValue() {
        return "if";
    }

    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getElifNodes() {
        return elifNodes;
    }

    public ASTNode getElseNode() {
        return elseNode;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}