package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

public class JinjaSetNode extends ASTNode {
    private final String varName;   // اسم المتغير المراد إسناد القيمة إليه (مثل title, total)
    private final ASTNode value;    // القيمة أو التعبير المسند للمتغير (مثل LiteralNode أو تعبير حسابي)

    public JinjaSetNode(String varName, ASTNode value, int line, int col) {
        super("JinjaSetNode", line, col);
        this.varName = varName;
        this.value = value;

        // ربط القيمة المسندة كابن في الشجرة الهرمية إن وجدت
        if (value != null) {
            this.addChild(value);
        }
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getValueNode() {
        return value;
    }

    @Override
    public String getNodeType() {
        return "JinjaSet";
    }

    @Override
    public String getValue() {
        return varName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}