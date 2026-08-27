package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ASTNode {
    private final String functionName;    // اسم الدالة المستدعاة
    private final List<ASTNode> arguments; // قائمة الوسائط كـ ASTNode

    public FunctionCallNode(String functionName, int line, int col) {
        super("FunctionCallNode", line, col);
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
    }

    public FunctionCallNode(String functionName, List<ASTNode> arguments, int line, int col) {
        super("FunctionCallNode", line, col);
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
        if (arguments != null) {
            for (ASTNode arg : arguments) {
                addArgument(arg);
            }
        }
    }

    /**
     * إضافة وسيط (Argument) والدعم التلقائي لربطه بالشجرة
     */
    public void addArgument(ASTNode arg) {
        if (arg != null) {
            this.arguments.add(arg);
            this.addChild(arg);
        }
    }

    @Override
    public String getNodeType() {
        return "FunctionCall";
    }

    @Override
    public String getValue() {
        return functionName;
    }

    // Getters
    public String getFunctionName() {
        return functionName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}