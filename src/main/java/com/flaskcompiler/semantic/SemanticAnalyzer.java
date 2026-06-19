package com.flaskcompiler.semantic;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.ast.jinja.ExpressionNode;
import com.flaskcompiler.ast.jinja.ForNode;
import com.flaskcompiler.ast.jinja.BlockNode;
import com.flaskcompiler.ast.jinja.TemplateNode;
import com.flaskcompiler.ast.python.AssignmentNode;
import com.flaskcompiler.ast.python.CallNode;
import com.flaskcompiler.ast.python.FunctionNode;
import com.flaskcompiler.ast.python.LiteralNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PropertyAccessNode;
import com.flaskcompiler.ast.python.RouteNode;
import com.flaskcompiler.ast.python.VariableNode;
import com.flaskcompiler.symbol.Scope;
import com.flaskcompiler.symbol.Symbol;
import com.flaskcompiler.symbol.SymbolTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Semantic analysis over the AST + symbol tables (never the parse tree).
 *
 * Implements:
 *   1. Undefined variable          (Python)
 *   2. Duplicate route             (Python)
 *   3. Missing template            (Python)
 *   4. Undefined template variable (Jinja)
 *   5. Loop over non-iterable      (Jinja)
 * Bonus:
 *   - Duplicate parameter          (Python)
 *   - Duplicate block              (Jinja)
 *
 * All errors are collected; analysis never stops at the first failure.
 */
public class SemanticAnalyzer {

    private static final Set<String> BUILTINS = Set.of(
            "__name__", "len", "range", "print", "str", "int", "float", "bool",
            "list", "dict", "set", "tuple", "enumerate", "True", "False", "None", "self");

    private final List<SemanticError> errors = new ArrayList<>();

    public List<SemanticError> analyze(ProgramNode pythonAst, TemplateNode jinjaAst,
                                       SymbolTable pythonTable, SymbolTable jinjaTable,
                                       Set<String> knownTemplates,
                                       Set<String> templateContext,
                                       Map<String, String> contextTypes) {
        errors.clear();
        if (pythonAst != null) {
            checkUndefinedVariables(pythonAst, pythonTable);
            checkDuplicateRoutes(pythonAst);
            checkMissingTemplates(pythonAst, knownTemplates);
            checkDuplicateParameters(pythonAst);
        }
        if (jinjaAst != null) {
            checkUndefinedTemplateVariables(jinjaAst, jinjaTable, templateContext);
            checkInvalidLoopSource(jinjaAst, contextTypes);
            checkDuplicateBlocks(jinjaAst);
        }
        return new ArrayList<>(errors);
    }

    // ---------------- 1. Undefined variable ----------------
    private void checkUndefinedVariables(ProgramNode program, SymbolTable table) {
        Scope global = table.getGlobalScope();
        Set<String> globalNames = new HashSet<>(global.getSymbols().keySet());
        globalNames.addAll(importNames(program));
        globalNames.addAll(BUILTINS);

        Map<String, Scope> funcScopes = new LinkedHashMap<>();
        for (Scope child : global.getChildren()) {
            funcScopes.put(child.getScopeName(), child);
        }

        for (Node child : program.getChildren()) {
            if (child instanceof FunctionNode fn) {
                Set<String> local = new HashSet<>(globalNames);
                Scope fs = funcScopes.get(funcName(signatureOf(fn)));
                if (fs != null) local.addAll(fs.getSymbols().keySet());
                for (Node body : fn.getChildren()) analyzeReads(body, local);
            } else if (child instanceof AssignmentNode) {
                analyzeReads(child, globalNames);
            }
        }
    }

    private void analyzeReads(Node node, Set<String> names) {
        if (node instanceof VariableNode v) {
            String name = strip(v.getNodeName(), "Var:");
            if (!names.contains(name)) {
                errors.add(new SemanticError("Undefined variable: " + name, v.getLine(), name));
            }
        } else if (node instanceof PropertyAccessNode p) {
            String root = identifierRoot(strip(p.getNodeName(), "Property:"));
            if (!names.contains(root)) {
                errors.add(new SemanticError("Undefined variable: " + root, p.getLine(), root));
            }
        }
        for (Node c : node.getChildren()) analyzeReads(c, names);
    }

    // ---------------- 2. Duplicate route ----------------
    private void checkDuplicateRoutes(ProgramNode program) {
        Set<String> seen = new HashSet<>();
        for (Node child : program.getChildren()) {
            if (child instanceof RouteNode route) {
                String path = routePath(route.getNodeName());
                if (!seen.add(path)) {
                    errors.add(new SemanticError("Duplicate route: " + path, route.getLine(), path));
                }
            }
        }
    }

    // ---------------- 3. Missing template ----------------
    private void checkMissingTemplates(ProgramNode program, Set<String> knownTemplates) {
        for (CallNode call : findRenderCalls(program)) {
            String template = renderTemplateName(call);
            if (template == null) continue;
            if (knownTemplates == null || !knownTemplates.contains(template)) {
                errors.add(new SemanticError("Missing template: " + template, call.getLine(), "render_template"));
            }
        }
    }

    private List<CallNode> findRenderCalls(Node node) {
        List<CallNode> calls = new ArrayList<>();
        if (node instanceof CallNode call && "render_template".equals(strip(call.getNodeName(), "Call:"))) {
            calls.add(call);
        }
        for (Node c : node.getChildren()) calls.addAll(findRenderCalls(c));
        return calls;
    }

    private String renderTemplateName(CallNode call) {
        if (call.getChildren().isEmpty()) return null;
        Node first = call.getChildren().get(0);
        if (first instanceof LiteralNode lit) {
            return stripQuotes(strip(lit.getNodeName(), "Literal:"));
        }
        return null;
    }

    // ---------------- bonus: duplicate parameter ----------------
    private void checkDuplicateParameters(ProgramNode program) {
        for (Node child : program.getChildren()) {
            if (child instanceof FunctionNode fn) {
                Set<String> seen = new HashSet<>();
                for (String p : paramList(signatureOf(fn))) {
                    if (!seen.add(p.trim())) {
                        errors.add(new SemanticError("Duplicate parameter: " + p.trim(),
                                fn.getLine(), funcName(signatureOf(fn))));
                    }
                }
            }
        }
    }

    // ---------------- 4. Undefined template variable ----------------
    private void checkUndefinedTemplateVariables(TemplateNode template, SymbolTable jinjaTable,
                                                 Set<String> context) {
        Set<String> allowed = new HashSet<>();
        if (context != null) allowed.addAll(context);
        if (jinjaTable != null) {
            for (Symbol s : jinjaTable.getGlobalScope().getSymbols().values()) {
                if ("loop_variable".equals(s.getType())) allowed.add(s.getName());
            }
        }
        forEachExpression(template, allowed);
    }

    private void forEachExpression(Node node, Set<String> allowed) {
        if (node instanceof ExpressionNode expr && !expr.getChildren().isEmpty()) {
            String ref = strip(expr.getChildren().get(0).getNodeName(), "Ref:");
            String root = dottedRoot(ref);
            if (!allowed.contains(root)) {
                errors.add(new SemanticError("Undefined template variable: " + root, expr.getLine(), root));
            }
        }
        for (Node c : node.getChildren()) forEachExpression(c, allowed);
    }

    // ---------------- 5. Loop over non-iterable ----------------
    private void checkInvalidLoopSource(Node node, Map<String, String> contextTypes) {
        if (node instanceof ForNode forNode) {
            String spec = strip(forNode.getNodeName(), "For:");      // "item in items"
            String[] parts = spec.split(" in ", 2);
            if (parts.length > 1) {
                String iterable = dottedRoot(parts[1].trim());
                String type = (contextTypes != null) ? contextTypes.get(iterable) : null;
                if (!"list".equals(type)) {
                    errors.add(new SemanticError("Invalid loop source: " + iterable + " (not iterable)",
                            forNode.getLine(), iterable));
                }
            }
        }
        for (Node c : node.getChildren()) checkInvalidLoopSource(c, contextTypes);
    }

    // ---------------- bonus: duplicate block ----------------
    private void checkDuplicateBlocks(Node node) {
        collectBlocks(node, new HashSet<>());
    }

    private void collectBlocks(Node node, Set<String> seen) {
        if (node instanceof BlockNode block) {
            String name = strip(block.getNodeName(), "Block:");
            if (!seen.add(name)) {
                errors.add(new SemanticError("Duplicate block: " + name, block.getLine(), name));
            }
        }
        for (Node c : node.getChildren()) collectBlocks(c, seen);
    }

    // ---------------- helpers ----------------
    private Set<String> importNames(ProgramNode program) {
        Set<String> names = new HashSet<>();
        for (Node child : program.getChildren()) {
            String n = child.getNodeName();
            if (!n.startsWith("Import:")) continue;
            String desc = strip(n, "Import:");
            if (desc.startsWith("from ")) {
                int idx = desc.indexOf(" import ");
                if (idx >= 0) {
                    for (String name : desc.substring(idx + " import ".length()).split(",")) {
                        names.add(name.trim());
                    }
                }
            } else if (desc.startsWith("import ")) {
                String mod = desc.substring("import ".length()).trim();
                names.add(mod.contains(".") ? mod.substring(0, mod.indexOf('.')) : mod);
            }
        }
        return names;
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

    private static List<String> paramList(String signature) {
        int i = signature.indexOf('(');
        int j = signature.lastIndexOf(')');
        if (i < 0 || j < 0 || j <= i + 1) return List.of();
        String inner = signature.substring(i + 1, j).trim();
        return inner.isEmpty() ? List.of() : List.of(inner.split(","));
    }

    private static String routePath(String nodeName) {
        int a = nodeName.indexOf('[');
        int b = nodeName.indexOf("]:");
        return (a >= 0 && b > a) ? nodeName.substring(a + 1, b) : nodeName;
    }

    private static String identifierRoot(String s) {
        int i = 0;
        while (i < s.length() && (Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i) == '_')) i++;
        return (i > 0) ? s.substring(0, i) : s;
    }

    private static String dottedRoot(String s) {
        int dot = s.indexOf('.');
        return (dot >= 0) ? s.substring(0, dot) : s;
    }

    private static String strip(String s, String prefix) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
    }

    private static String stripQuotes(String s) {
        if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
