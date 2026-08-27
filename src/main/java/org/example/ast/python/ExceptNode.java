package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ExceptNode extends ASTNode {
    private final ASTNode exceptionType; // نوع الاستثناء (قد يكون IdentifierNode أو AttributeNode أو null)
    private final String varName;        // اسم المتغير المقترن بـ as (مثل e في except Exception as e)
    private final List<ASTNode> body;    // العبارات البرمجية المنفذة داخل كتلة except

    public ExceptNode(ASTNode exceptionType, String varName, int line, int col) {
        super("ExceptNode", line, col);
        this.exceptionType = exceptionType;
        this.varName = varName;
        this.body = new ArrayList<>();

        // ربط نوع الاستثناء كابن في الشجرة إن وجد
        if (exceptionType != null) {
            this.addChild(exceptionType);
        }
    }

    /**
     * إضافة عبارة برمجية داخل كتلة except وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "Except";
    }

    @Override
    public String getValue() {
        if (exceptionType == null) {
            return "except";
        }
        return varName != null ? "as " + varName : "except";
    }

    // Getters
    public ASTNode getExceptionType() {
        return exceptionType;
    }

    public String getVarName() {
        return varName;
    }

    public List<ASTNode> getBody() {
        return body;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}