package org.example.ast;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    protected String nodeName;
    protected int lineNumber;
    protected int columnNumber; // إضافة رقم العمود
    public List<ASTNode> children = new ArrayList<>();

    public ASTNode(String nodeName, int lineNumber, int columnNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }


    public int getLineNumber() { return lineNumber; }
    public int getColumnNumber() { return columnNumber; }

    public void addChild(ASTNode child) {
        if (child != null) children.add(child);
    }


    public abstract String getNodeType();
    public abstract String getValue();

    public void printFullTree() {
        printTreeRecursive(this, "", true);
    }

    private void printTreeRecursive(ASTNode node, String prefix, boolean isTail) {
        String info = String.format("%s %s [Line:%d, Col:%d]",
                node.nodeName, node.getValue(), node.lineNumber, node.columnNumber);
        System.out.println(prefix + (isTail ? "└── " : "├── ") + info);

        for (int i = 0; i < node.children.size(); i++) {
            printTreeRecursive(node.children.get(i),
                    prefix + (isTail ? "    " : "│   "),
                    i == node.children.size() - 1);
        }
    }


    public List<ASTNode> getChildren() {
        return children;
    }

    protected int line;
    protected int col;

    // الباني (Constructor) إن لم يكن موجوداً بهذا الشكل


    // الدوال التي يعترض عليها الكومبايلر:
    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }


    public abstract void accept(ASTVisitor visitor);
}