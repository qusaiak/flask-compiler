package com.flaskcompiler.symbol;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.jinja.BlockNode;
import com.flaskcompiler.ast.jinja.ExpressionNode;
import com.flaskcompiler.ast.jinja.ForNode;
import com.flaskcompiler.ast.jinja.IfNode;
import com.flaskcompiler.ast.jinja.TemplateNode;

/**
 * Builds a symbol table from the Jinja AST.
 * Collects: template variables, loop variables and block names.
 */
public class JinjaSymbolCollector {

    public SymbolTable collect(TemplateNode template, String templateName) {
        SymbolTable table = new SymbolTable("TEMPLATE(" + templateName + ")");
        walk(template, table);
        return table;
    }

    private void walk(Node node, SymbolTable table) {
        for (Node child : node.getChildren()) {
            handle(child, table);
        }
    }

    private void handle(Node node, SymbolTable table) {
        if (node instanceof BlockNode block) {
            table.define(new Symbol(strip(block.getNodeName(), "Block:"), "block", block.getLine()));
            walk(block, table);
        } else if (node instanceof ForNode forNode) {
            String spec = strip(forNode.getNodeName(), "For:");       // "item in items"
            String[] parts = spec.split(" in ", 2);
            table.define(new Symbol(parts[0].trim(), "loop_variable", forNode.getLine()));
            if (parts.length > 1) {
                table.define(new Symbol(root(parts[1].trim()), "variable", forNode.getLine()));
            }
            walk(forNode, table);
        } else if (node instanceof IfNode ifNode) {
            table.define(new Symbol(root(strip(ifNode.getNodeName(), "If:")), "variable", ifNode.getLine()));
            walk(ifNode, table);
        } else if (node instanceof ExpressionNode expr) {
            if (!expr.getChildren().isEmpty()) {
                String ref = strip(expr.getChildren().get(0).getNodeName(), "Ref:");
                table.define(new Symbol(root(ref), "variable", expr.getLine()));
            }
        }
        // HtmlContentNode and others carry no symbols
    }

    /** Root of a dotted reference: "product.name" -> "product". */
    private static String root(String reference) {
        int dot = reference.indexOf('.');
        return (dot >= 0) ? reference.substring(0, dot) : reference;
    }

    private static String strip(String s, String prefix) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
    }
}
