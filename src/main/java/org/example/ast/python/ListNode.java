package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
    private final List<ASTNode> elements;

    public ListNode(int line, int col) {
        super("ListNode", line, col);
        this.elements = new ArrayList<>();
    }

    public void addElement(ASTNode element) {
        if (element != null) {
            this.elements.add(element);
            this.addChild(element);
        }
    }

    @Override
    public String getNodeType() {
        return "List";
    }

    @Override
    public String getValue() {
        return "[]";
    }

    public List<ASTNode> getElements() {
        return elements;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}