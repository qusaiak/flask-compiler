package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefNode extends ASTNode {
    private final String name;              // اسم الدالة
    private final boolean isAsync;          // هل الدالة غير متزامنة (async def)
    private final List<ASTNode> parameters; // معاملات الدالة (مثل ParameterNode أو IdentifierNode)
    private final List<ASTNode> body;       // العبارات البرمجية داخل جسم الدالة
    private ASTNode returnType;             // نوع القيمة المرجعة (Type Annotation مثل -> int)

    public FunctionDefNode(String name, boolean isAsync, int line, int col) {
        super("FunctionDefNode", line, col);
        this.name = name;
        this.isAsync = isAsync;
        this.parameters = new ArrayList<>();
        this.body = new ArrayList<>();
        this.returnType = null;
    }

    /**
     * إضافة معامل (Parameter) للدالة وربطه كابن في الشجرة
     */
    public void addParameter(ASTNode param) {
        if (param != null) {
            this.parameters.add(param);
            this.addChild(param);
        }
    }

    /**
     * تحديد نوع القيمة المرجعة (Return Type Hint) وربطه كابن في الشجرة
     */
    public void setReturnType(ASTNode returnType) {
        this.returnType = returnType;
        if (returnType != null) {
            this.addChild(returnType);
        }
    }

    /**
     * إضافة عبارة برمجية داخل جسم الدالة وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return isAsync ? "AsyncFunctionDef" : "FunctionDef";
    }

    @Override
    public String getValue() {
        return name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean isAsync() {
        return isAsync;
    }

    public List<ASTNode> getParameters() {
        return parameters;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public ASTNode getReturnType() {
        return returnType;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}