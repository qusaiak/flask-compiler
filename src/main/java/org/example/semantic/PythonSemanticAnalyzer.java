package org.example.semantic;

import org.example.ast.ASTNode;
import org.example.ast.python.AssignmentNode;
import org.example.ast.python.CallNode;
import org.example.ast.python.ClassDefNode;
import org.example.ast.python.ForNode;
import org.example.ast.python.FunctionCallNode;
import org.example.ast.python.FunctionDefNode;
import org.example.ast.python.IdentifierNode;
import org.example.ast.python.ReturnNode;
import org.example.ast.python.BreakNode;
import org.example.ast.python.ContinueNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * تحليل دلالي تعليمي لمسار Python AST.
 * يدعم نطاق module/function/for ويكشف إعادة التعريف واستدعاء دالة غير معرّفة.
 */
public final class PythonSemanticAnalyzer {
    private static final Set<String> BUILTIN_CALLS = Set.of(
            "Flask", "render_template", "redirect", "url_for", "jsonify",
            "range", "max", "next", "float", "int", "str", "len",
            "list", "dict", "print", "enumerate", "sum", "min", "abs"
    );

    private final SymbolTable symbolTable;
    private final List<String> errors = new java.util.ArrayList<>();
    private final Deque<Set<String>> scopes = new ArrayDeque<>();
    private final Set<String> knownFunctions = new HashSet<>(BUILTIN_CALLS);
    private int functionDepth;
    private int loopDepth;

    public PythonSemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> analyze(ASTNode module) {
        scopes.clear();
        knownFunctions.retainAll(BUILTIN_CALLS);
        errors.clear();
        functionDepth = 0;
        loopDepth = 0;
        enterScope();
        predeclareTopLevelFunctions(module);
        visit(module);
        exitScope();
        return List.copyOf(errors);
    }

    private void predeclareTopLevelFunctions(ASTNode module) {
        if (module == null) return;
        for (ASTNode child : module.getChildren()) {
            if (child instanceof FunctionDefNode function) {
                knownFunctions.add(function.getName());
            }
        }
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof AssignmentNode assignment) {
            visit(assignment.getValueNode());
            defineTarget(assignment.getTarget(), scopes.size() == 1 ? "PYTHON_VAR" : "PYTHON_LOCAL");
            return;
        }

        if (node instanceof FunctionDefNode function) {
            defineName(function.getName(), "PYTHON_FUNC", function.getLineNumber());
            knownFunctions.add(function.getName());
            enterScope();
            functionDepth++;
            for (ASTNode parameter : function.getParameters()) {
                defineTarget(parameter, "PYTHON_PARAMETER");
            }
            // بعض عقد ASTBuilder تحفظ جسم الدالة ضمن children مباشرة؛
            // لذلك نمر على children الفعليين ونتجاوز معاملات الدالة المعالجة أعلاه.
            for (ASTNode child : function.getChildren()) {
                if (!function.getParameters().contains(child)) {
                    visit(child);
                }
            }
            functionDepth--;
            exitScope();
            return;
        }

        if (node instanceof ReturnNode returnNode) {
            if (functionDepth == 0) {
                addError("Semantic Error [P4]: return is used outside a function at line " + returnNode.getLineNumber() + ".");
            }
            for (ASTNode child : returnNode.getChildren()) visit(child);
            return;
        }

        if (node instanceof BreakNode breakNode) {
            if (loopDepth == 0) {
                addError("Semantic Error [P5]: break is used outside a loop at line " + breakNode.getLineNumber() + ".");
            }
            return;
        }

        if (node instanceof ContinueNode continueNode) {
            if (loopDepth == 0) {
                addError("Semantic Error [P6]: continue is used outside a loop at line " + continueNode.getLineNumber() + ".");
            }
            return;
        }

        if (node instanceof ClassDefNode classDef) {
            defineName(classDef.getValue(), "PYTHON_CLASS", classDef.getLineNumber());
            enterScope();
            for (ASTNode child : classDef.getChildren()) {
                visit(child);
            }
            exitScope();
            return;
        }

        if (node instanceof ForNode forNode) {
            visit(forNode.getIterable());
            enterScope();
            loopDepth++;
            defineTarget(forNode.getTarget(), "PYTHON_LOOP_VARIABLE");
            for (ASTNode statement : forNode.getBody()) {
                visit(statement);
            }
            for (ASTNode statement : forNode.getOrElse()) {
                visit(statement);
            }
            loopDepth--;
            exitScope();
            return;
        }

        if (node instanceof FunctionCallNode call) {
            checkFunctionCall(call.getFunctionName(), call.getLineNumber());
            for (ASTNode argument : call.getArguments()) {
                visit(argument);
            }
            return;
        }

        if (node instanceof CallNode call) {
            ASTNode functionNode = call.getFunctionNode();
            if (functionNode instanceof IdentifierNode identifier) {
                checkFunctionCall(identifier.getValue(), call.getLineNumber());
            } else {
                visit(functionNode);
            }
            for (ASTNode argument : call.getArguments()) {
                visit(argument);
            }
            return;
        }

        for (ASTNode child : node.getChildren()) {
            visit(child);
        }
    }

    private void defineTarget(ASTNode target, String category) {
        if (target instanceof IdentifierNode identifier) {
            defineName(identifier.getValue(), category, identifier.getLineNumber());
        }
    }

    private void defineName(String name, String category, int line) {
        if (name == null || name.isBlank()) return;
        Set<String> currentScope = scopes.peek();
        if (currentScope != null && currentScope.contains(name)) {
            addError("Semantic Error [P2]: Python symbol '" + name
                    + "' is already defined in this scope at line " + line + ".");
            return;
        }
        if (currentScope != null) currentScope.add(name);
        symbolTable.define(name, category, line);
    }

    private void checkFunctionCall(String functionName, int line) {
        if (isBareFunctionName(functionName) && !knownFunctions.contains(functionName)) {
            addError("Semantic Error [P3]: Function '" + functionName
                    + "' is called at line " + line + " but is never defined.");
        }
    }

    private boolean isBareFunctionName(String name) {
        return name != null && name.matches("[A-Za-z_]\\w*");
    }

    private void addError(String error) {
        errors.add(error);
        System.err.println(error);
    }

    private void enterScope() {
        scopes.push(new HashSet<>());
        symbolTable.enterScope();
    }

    private void exitScope() {
        if (!scopes.isEmpty()) scopes.pop();
        symbolTable.exitScope();
    }
}
