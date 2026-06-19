package com.flaskcompiler.symbol;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.python.AssignmentNode;
import com.flaskcompiler.ast.python.DictNode;
import com.flaskcompiler.ast.python.FunctionNode;
import com.flaskcompiler.ast.python.ListNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.RouteNode;

import java.util.Arrays;
import java.util.List;

/**
 * Builds a symbol table from the Python AST.
 * Collects: variables, functions, routes and parameters.
 */
public class PythonSymbolCollector {

    public SymbolTable collect(ProgramNode program) {
        SymbolTable table = new SymbolTable("GLOBAL");
        for (Node child : program.getChildren()) {
            if (child instanceof RouteNode route) {
                collectFunction(table, route, "route");
            } else if (child instanceof FunctionNode function) {
                collectFunction(table, function, "function");
            } else if (child instanceof AssignmentNode assignment) {
                table.define(new Symbol(target(assignment), inferType(assignment), assignment.getLine()));
            }
            // imports and other top-level nodes are ignored here
        }
        return table;
    }

    private void collectFunction(SymbolTable table, FunctionNode fn, String type) {
        String signature = signatureOf(fn);
        table.define(new Symbol(funcName(signature), type, fn.getLine()));

        table.enterScope(funcName(signature));
        for (String param : params(signature)) {
            table.define(new Symbol(param.trim(), "parameter", fn.getLine()));
        }
        for (Node bodyChild : fn.getChildren()) {
            if (bodyChild instanceof AssignmentNode assignment) {
                table.define(new Symbol(target(assignment), inferType(assignment), assignment.getLine()));
            }
        }
        table.exitScope();
    }

    private String target(AssignmentNode a) {
        return strip(a.getNodeName(), "Assign:");
    }

    private String inferType(AssignmentNode a) {
        if (!a.getChildren().isEmpty()) {
            Node value = a.getChildren().get(0);
            if (value instanceof ListNode) return "list";
            if (value instanceof DictNode) return "dict";
        }
        return "variable";
    }

    private String signatureOf(FunctionNode fn) {
        String n = fn.getNodeName();
        if (n.startsWith("Function:")) return n.substring("Function:".length());
        int k = n.indexOf("]:");
        return (k >= 0) ? n.substring(k + 2) : n;
    }

    private String funcName(String signature) {
        int i = signature.indexOf('(');
        return (i >= 0) ? signature.substring(0, i) : signature;
    }

    private List<String> params(String signature) {
        int i = signature.indexOf('(');
        int j = signature.lastIndexOf(')');
        if (i < 0 || j < 0 || j <= i + 1) return List.of();
        String inner = signature.substring(i + 1, j).trim();
        return inner.isEmpty() ? List.of() : Arrays.asList(inner.split(","));
    }

    private static String strip(String s, String prefix) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
    }
}
