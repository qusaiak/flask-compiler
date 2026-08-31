package org.example.ast.html;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlFileNode extends ASTNode {
    private final String fileName;
    private final List<ASTNode> children;

    public HtmlFileNode(String fileName, int line, int col) {
        super("HtmlFileNode", line, col);
        this.fileName = fileName;
        this.children = new ArrayList<>();
    }

    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        return "HtmlFile";
    }

    @Override
    public String getValue() {
        return fileName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}