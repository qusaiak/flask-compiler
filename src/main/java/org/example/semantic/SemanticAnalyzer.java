package org.example.semantic;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;
import org.example.ast.jinja2.JinjaExprNode;
import org.example.ast.jinja2.JinjaBlockNode;
import org.example.ast.jinja2.JinjaForNode;
import org.example.ast.jinja2.JinjaIfNode;
import org.example.ast.jinja2.JinjaSetNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SemanticAnalyzer implements ASTVisitor {
    private final SymbolTable symbolTable;
    private final List<String> semanticErrors = new ArrayList<>();

    private static final List<String> VALID_FILTERS = Arrays.asList(
            "upper", "lower", "length", "trim", "safe", "default", "capitalize", "title", "striptags", "join", "first", "last", "replace", "truncate"

    );

    private static final List<String> GLOBAL_CONTEXT_VARS = Arrays.asList(
            "products", "product", "user", "users", "item", "items", "title", "data", "id", "name", "price", "image"
    );

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void visit(ASTNode node) {
        if (node == null) return;

        String nodeType = node.getNodeType();

        if ("JinjaExpr".equals(nodeType) && node instanceof JinjaExprNode) {
            JinjaExprNode jinjaExpr = (JinjaExprNode) node;
            ASTNode expr = jinjaExpr.getExpression();

            if (expr != null) {
                String rawName = expr.getValue();
                processVariableUsage(rawName, node.getLineNumber());
            }
        }

        else if ("JinjaSet".equals(nodeType) && node instanceof JinjaSetNode) {
            JinjaSetNode setNode = (JinjaSetNode) node;

            if (setNode.getValueNode() != null) {
                visit(setNode.getValueNode());
            }

            String varName = setNode.getVarName();
            if (varName != null && !varName.isEmpty()) {
                symbolTable.define(varName, "SET_VAR", node.getLineNumber());
            }
        }

        else if ("JinjaFor".equals(nodeType) && node instanceof JinjaForNode) {
            JinjaForNode forNode = (JinjaForNode) node;

            ASTNode iterable = forNode.getIterable();
            if (iterable != null) {
                String listName = iterable.getValue();
                if (listName != null && !listName.isEmpty()) {
                    processVariableUsage(listName, node.getLineNumber());
                }
            }

            symbolTable.enterScope();

            ASTNode varNode = forNode.getVariable();
            String loopVarName = (varNode != null) ? varNode.getValue() : "product";

            if (loopVarName != null && !loopVarName.isEmpty()) {
                symbolTable.define(loopVarName, "LOOP_VARIABLE", node.getLineNumber());
            } else {
                symbolTable.define("product", "LOOP_VARIABLE", node.getLineNumber());
            }

            if (forNode.getChildren() != null) {
                for (ASTNode child : forNode.getChildren()) {
                    visit(child);
                }
            }

            symbolTable.exitScope();
            return;
        }
        else if ("JinjaIf".equals(nodeType) || "JinjaElif".equals(nodeType) || "JinjaElse".equals(nodeType)) {
            if (node instanceof JinjaIfNode) {
                JinjaIfNode ifNode = (JinjaIfNode) node;
                ASTNode condition = ifNode.getCondition();
                if (condition != null) {
                    String condVar = condition.getValue();
                    if (condVar != null && !condVar.isEmpty()) {
                        if (!condVar.matches("true|false|\\d+")) {
                            processVariableUsage(condVar, node.getLineNumber());
                        }
                    }
                    visit(condition);
                }
            }

            symbolTable.enterScope();
            if (node.getChildren() != null) {
                for (ASTNode child : node.getChildren()) {
                    visit(child);
                }
            }
            symbolTable.exitScope();
            return;
        }

        else if ("JinjaBlock".equals(nodeType) && node instanceof JinjaBlockNode) {
            JinjaBlockNode blockNode = (JinjaBlockNode) node;

            String blockName = blockNode.getValue();
            if (blockName != null && !blockName.isEmpty()) {
                if (symbolTable.isDefinedLocally(blockName)) {
                    String error = "Semantic Error [5]: Block '" + blockName + "' is already defined in this scope at line " + node.getLineNumber();
                    semanticErrors.add(error);
                    System.err.println(error);
                } else {
                    symbolTable.define(blockName, "TEMPLATE_BLOCK", node.getLineNumber());
                }
            }

            symbolTable.enterScope();
            if (blockNode.getChildren() != null) {
                for (ASTNode child : blockNode.getChildren()) {
                    visit(child);
                }
            }
            symbolTable.exitScope();
            return;
        }

        if (node.getChildren() != null) {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }

    public void processVariableUsage(String rawName, int line) {
        if (rawName == null || rawName.isEmpty()) return;

        String varName = rawName.trim();

        if (varName.contains("|")) {
            String[] parts = varName.split("\\|");
            varName = parts[0].trim();
            for (int index = 1; index < parts.length; index++) {
                String filterSpec = parts[index].trim();
                int argumentStart = filterSpec.indexOf('(');
                String filterName = argumentStart >= 0
                        ? filterSpec.substring(0, argumentStart).trim()
                        : filterSpec;

                if (!VALID_FILTERS.contains(filterName)) {
                    String error = "Semantic Error [7]: Unknown Jinja filter '" + filterName + "' used at line " + line;
                    semanticErrors.add(error);
                    System.err.println(error);
                }
            }
        }

        if (varName.contains(".")) {
            varName = varName.substring(0, varName.indexOf('.'));
        }

        if (symbolTable.lookup(varName) != null) {
            return;
        }

        if (GLOBAL_CONTEXT_VARS.contains(varName)) {
            return;
        }

        if (symbolTable.isExpiredLoopVar(varName)) {
            String error = "Semantic Error [9]: Loop variable '" + varName + "' used outside its For loop scope at line " + line;
            semanticErrors.add(error);
            System.err.println(error);
        } else {
            String error = "Semantic Error: Variable '" + varName + "' is used at line " + line + " but never defined!";
            semanticErrors.add(error);
            System.err.println(error);
        }
    }

    public void finishAnalysis() {
        symbolTable.checkUnusedVariables();
    }
}