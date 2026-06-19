package com.flaskcompiler.transfer;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.python.AssignmentNode;
import com.flaskcompiler.ast.python.CallNode;
import com.flaskcompiler.ast.python.DictNode;
import com.flaskcompiler.ast.python.FunctionNode;
import com.flaskcompiler.ast.python.ListNode;
import com.flaskcompiler.ast.python.LiteralNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PropertyAccessNode;
import com.flaskcompiler.ast.python.RouteNode;
import com.flaskcompiler.ast.python.VariableNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Extracts the data context from the Python AST: for each render_template(...)
 * call it produces a ContextModel, resolving keyword arguments against the
 * global data arrays/literals. No execution or evaluation - structure only.
 */
public class DataExtractor {

    public List<ContextModel> extract(ProgramNode program) {
        // 1) collect global assignments (name -> structured value)
        Map<String, Object> globals = new LinkedHashMap<>();
        for (Node child : program.getChildren()) {
            if (child instanceof AssignmentNode a) {
                globals.put(target(a), evalValue(firstChild(a)));
            }
        }

        // 2) for each route, extract its render_template contexts
        List<ContextModel> models = new ArrayList<>();
        for (Node child : program.getChildren()) {
            if (child instanceof RouteNode route) {
                String routeName = funcName(signatureOf(route));
                for (CallNode call : findRenderCalls(route)) {
                    String template = templateName(call);
                    Map<String, Object> vars = new LinkedHashMap<>();
                    for (Node arg : call.getChildren()) {
                        if (arg instanceof AssignmentNode kw) {           // keyword argument
                            vars.put(target(kw), resolveArg(firstChild(kw), globals));
                        }
                    }
                    models.add(new ContextModel(routeName, template, vars));
                }
            }
        }
        return models;
    }

    // ---- value resolution ----
    private Object resolveArg(Node node, Map<String, Object> globals) {
        if (node instanceof VariableNode v) {
            String name = strip(v.getNodeName(), "Var:");
            return globals.containsKey(name) ? globals.get(name) : new ContextModel.Ref(name);
        }
        return evalValue(node);
    }

    private Object evalValue(Node node) {
        if (node == null) return null;
        if (node instanceof ListNode) {
            List<Object> list = new ArrayList<>();
            for (Node c : node.getChildren()) list.add(evalValue(c));
            return list;
        }
        if (node instanceof DictNode) {
            Map<String, Object> map = new LinkedHashMap<>();
            List<Node> kv = node.getChildren();
            for (int i = 0; i + 1 < kv.size(); i += 2) {
                map.put(literalText(kv.get(i)), evalValue(kv.get(i + 1)));
            }
            return map;
        }
        if (node instanceof LiteralNode l) {
            return parseLiteral(strip(l.getNodeName(), "Literal:"));
        }
        if (node instanceof VariableNode v) {
            return new ContextModel.Ref(strip(v.getNodeName(), "Var:"));
        }
        if (node instanceof PropertyAccessNode p) {
            return new ContextModel.Ref(strip(p.getNodeName(), "Property:"));
        }
        return new ContextModel.Ref(node.getNodeName());
    }

    private Object parseLiteral(String raw) {
        if (raw.length() >= 2 && (raw.charAt(0) == '"' || raw.charAt(0) == '\'')) {
            return raw.substring(1, raw.length() - 1);
        }
        try {
            return Integer.valueOf(raw);
        } catch (NumberFormatException ex) {
            return raw;
        }
    }

    private String literalText(Node node) {
        if (node instanceof LiteralNode l) {
            return String.valueOf(parseLiteral(strip(l.getNodeName(), "Literal:")));
        }
        return node.getNodeName();
    }

    // ---- render_template discovery ----
    private List<CallNode> findRenderCalls(Node node) {
        List<CallNode> calls = new ArrayList<>();
        if (node instanceof CallNode call && "render_template".equals(strip(call.getNodeName(), "Call:"))) {
            calls.add(call);
        }
        for (Node c : node.getChildren()) calls.addAll(findRenderCalls(c));
        return calls;
    }

    private String templateName(CallNode call) {
        if (!call.getChildren().isEmpty() && call.getChildren().get(0) instanceof LiteralNode lit) {
            Object v = parseLiteral(strip(lit.getNodeName(), "Literal:"));
            return String.valueOf(v);
        }
        return null;
    }

    // ---- helpers ----
    private static Node firstChild(Node n) {
        return n.getChildren().isEmpty() ? null : n.getChildren().get(0);
    }

    private static String target(AssignmentNode a) {
        return strip(a.getNodeName(), "Assign:");
    }

    private static String signatureOf(FunctionNode fn) {
        String n = fn.getNodeName();
        if (n.startsWith("Function:")) return n.substring("Function:".length());
        int k = n.indexOf("]:");
        return (k >= 0) ? n.substring(k + 2) : n;
    }

    private static String funcName(String signature) {
        int i = signature.indexOf('(');
        return (i >= 0) ? signature.substring(0, i) : signature;
    }

    private static String strip(String s, String prefix) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
    }
}
