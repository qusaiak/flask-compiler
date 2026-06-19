package com.flaskcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for every AST node (Python AST and Jinja AST).
 *
 * Demonstrates the OOP requirements:
 *  - inheritance   : PythonNode / JinjaNode and their concrete subclasses extend this
 *  - polymorphism  : accept(Visitor) is dispatched dynamically per subtype
 *  - node name     : every node stores a human-readable name
 *  - line number   : every node stores its source line
 */
public abstract class Node {

    protected String nodeName;
    protected int line;
    protected final List<Node> children = new ArrayList<>();

    protected Node(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
    }

    public String getNodeName() { return nodeName; }
    public int getLine() { return line; }
    public List<Node> getChildren() { return children; }

    /** Add a child (ignores null for convenience). Returns this for chaining. */
    public Node add(Node child) {
        if (child != null) {
            children.add(child);
        }
        return this;
    }

    /** Polymorphic dispatch to a visitor. */
    public abstract void accept(Visitor visitor);

    protected String label() {
        return nodeName + "(line=" + line + ")";
    }

    /** Print only this node's label. */
    public void printNode() {
        System.out.println(label());
    }

    /** Print the immediate children's labels. */
    public void printChildren() {
        for (Node child : children) {
            child.printNode();
        }
    }

    /** Print the full subtree rooted at this node, as an indented tree. */
    public void printTree() {
        printTree("", true, true);
    }

    private void printTree(String prefix, boolean isRoot, boolean isLast) {
        if (isRoot) {
            System.out.println(label());
        } else {
            System.out.println(prefix + (isLast ? "\u2514\u2500\u2500 " : "\u251c\u2500\u2500 ") + label());
        }
        String childPrefix = isRoot ? "" : prefix + (isLast ? "    " : "\u2502   ");
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printTree(childPrefix, false, i == children.size() - 1);
        }
    }
}
