package org.example.ast.css;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CssAtRuleNode extends ASTNode {
    private final String keyword;        // الكلمة المفتاحية (مثل media, keyframes, import)
    private final ASTNode condition;     // الشرط أو النطاق (مثل LiteralNode أو تعبير معقد)
    private final List<ASTNode> body;    // الأقسام أو القواعد الفرعية الداخلية (مثل قواعد CSS داخل @media)

    public CssAtRuleNode(String keyword, ASTNode condition, int line, int col) {
        super("CssAtRuleNode", line, col);
        this.keyword = keyword;
        this.condition = condition;
        this.body = new ArrayList<>();

        // ربط الشرط أو المعامل كابن في الشجرة إن وجد
        if (condition != null) {
            this.addChild(condition);
        }
    }

    /**
     * إضافة قاعدة أو عنصر فرعي داخل نطاق الـ At-Rule (مثل قواعد CSS داخل استعلام الوسائط)
     */
    public void addBodyStatement(ASTNode stmt) {
        if (stmt != null) {
            this.body.add(stmt);
            this.addChild(stmt);
        }
    }

    public String getKeyword() {
        return keyword;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public boolean isMedia() {
        return "media".equals(keyword);
    }

    @Override
    public String getNodeType() {
        return "CssAtRule";
    }

    @Override
    public String getValue() {
        return "@" + keyword;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}