package com.flaskcompiler.transfer;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.jinja.ExpressionNode;
import com.flaskcompiler.ast.jinja.ForNode;
import com.flaskcompiler.ast.jinja.TemplateNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Binds a ContextModel's variables to the Jinja AST: walks the template and
 * records which for-loops and expressions reference the transferred context
 * (directly or via a loop variable introduced from a bound iterable).
 * No rendering - only reference binding.
 */
public class JinjaContextBinder {

    public BoundTemplate bind(ContextModel model, TemplateNode template) {
        BoundTemplate bound = new BoundTemplate(template, model.getVariables());
        walk(template, model.getVariables().keySet(), new HashSet<>(), bound);
        return bound;
    }

    private void walk(Node node, Set<String> context, Set<String> loopVars, BoundTemplate bound) {
        for (Node child : node.getChildren()) {
            if (child instanceof ForNode forNode) {
                String spec = strip(forNode.getNodeName(), "For:");      // "item in items"
                String[] parts = spec.split(" in ", 2);
                String loopVar = parts[0].trim();
                String iterable = (parts.length > 1) ? parts[1].trim() : "";
                String iterableRoot = dottedRoot(iterable);

                if (context.contains(iterableRoot) || loopVars.contains(iterableRoot)) {
                    bound.addBoundNode("For(" + loopVar + " in " + iterable + ")");
                    Set<String> inner = new HashSet<>(loopVars);
                    inner.add(loopVar);
                    walk(forNode, context, inner, bound);
                } else {
                    walk(forNode, context, loopVars, bound);
                }
            } else if (child instanceof ExpressionNode expr) {
                if (!expr.getChildren().isEmpty()) {
                    String ref = strip(expr.getChildren().get(0).getNodeName(), "Ref:");
                    String root = dottedRoot(ref);
                    if (context.contains(root) || loopVars.contains(root)) {
                        bound.addBoundNode("Expression(" + ref + ")");
                    }
                }
            } else {
                walk(child, context, loopVars, bound);
            }
        }
    }

    private static String dottedRoot(String s) {
        int dot = s.indexOf('.');
        return (dot >= 0) ? s.substring(0, dot) : s;
    }

    private static String strip(String s, String prefix) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
    }
}
