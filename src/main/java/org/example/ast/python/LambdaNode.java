package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class LambdaNode extends ASTNode {
    private final List<ASTNode> parameters; // معاملات دالة اللامدا (مثل IdentifierNode)
    private ASTNode body;                   // جسم اللامدا (تعبير برمجي واحد يرجع قيمته)

    public LambdaNode(int line, int col) {
        super("LambdaNode", line, col);
        this.parameters = new ArrayList<>();
        this.body = null;
    }

    /**
     * إضافة معامل (Parameter) لدالة اللامدا وربطه كابن في الشجرة
     */
    public void addParameter(ASTNode param) {
        if (param != null) {
            this.parameters.add(param);
            this.addChild(param);
        }
    }

    /**
     * تحديد التعبير البرمجي الذي يمثل جسم اللامدا وربطه كابن في الشجرة
     */
    public void setBody(ASTNode body) {
        this.body = body;
        if (body != null) {
            this.addChild(body);
        }
    }

    @Override
    public String getNodeType() {
        return "Lambda";
    }

    @Override
    public String getValue() {
        return "lambda";
    }

    // Getters
    public List<ASTNode> getParameters() {
        return parameters;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}