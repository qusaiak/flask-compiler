package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForNode extends ASTNode {
    private final ASTNode target;     // المتغير أو الهيكل المستهدف (مثل IdentifierNode أو TupleNode)
    private final ASTNode iterable;   // التعبير القابل للتكرار (مثل CallNode كـ range(10) أو ListNode)
    private final List<ASTNode> body;     // العبارات البرمجية داخل جسم الحلقة
    private final List<ASTNode> orelse;   // العبارات البرمجية داخل فرع else الاختياري

    public ForNode(ASTNode target, ASTNode iterable, int line, int col) {
        super("ForNode", line, col);
        this.target = target;
        this.iterable = iterable;
        this.body = new ArrayList<>();
        this.orelse = new ArrayList<>();

        // ربط المتغير والتعبير القابل للتكرار كأبناء في الشجرة
        if (target != null) {
            this.addChild(target);
        }
        if (iterable != null) {
            this.addChild(iterable);
        }
    }

    /**
     * إضافة عبارة برمجية داخل جسم حلقة for وربطها كابن في الشجرة
     */
    public void addStatement(ASTNode statement) {
        if (statement != null) {
            this.body.add(statement);
            this.addChild(statement);
        }
    }

    /**
     * إضافة عبارة برمجية داخل فرع else التابع لحلقة for (اختياري في بايثون)
     */
    public void addElseStatement(ASTNode statement) {
        if (statement != null) {
            this.orelse.add(statement);
            this.addChild(statement);
        }
    }

    @Override
    public String getNodeType() {
        return "For";
    }

    @Override
    public String getValue() {
        return "in";
    }

    // Getters
    public ASTNode getTarget() {
        return target;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public List<ASTNode> getOrElse() {
        return orelse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}