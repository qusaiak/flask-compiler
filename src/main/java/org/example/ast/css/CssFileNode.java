package org.example.ast.css;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CssFileNode extends ASTNode {
    private final String fileName;       // اسم أو مسار ملف الـ CSS
    private final List<ASTNode> rules;   // القواعد والتوجيهات الداخلية ضمن الملف

    public CssFileNode(String fileName, int line, int col) {
        super("CssFileNode", line, col);
        this.fileName = fileName;
        this.rules = new ArrayList<>();
    }

    /**
     * إضافة قاعدة CSS أو At-Rule جديدة للملف وربطها كابن في الشجرة الهرمية
     */
    public void addRule(ASTNode rule) {
        if (rule != null) {
            this.rules.add(rule);
            this.addChild(rule);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public List<ASTNode> getRules() {
        return rules;
    }

    @Override
    public String getNodeType() {
        return "CssFile";
    }

    @Override
    public String getValue() {
        return fileName;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}