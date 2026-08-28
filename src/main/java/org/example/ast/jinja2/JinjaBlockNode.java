package org.example.ast.jinja2;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaBlockNode extends ASTNode {
    private final String blockName;      // اسم كتلة القالب (مثل content, header)
    private final List<ASTNode> children;

    public JinjaBlockNode(String blockName, int line, int col) {
        super("JinjaBlockNode", line, col);
        this.blockName = blockName;
        this.children = new ArrayList<>();
    }

    /**
     * إضافة عنصر أو محتوى داخلي جديد داخل كتلة Jinja وربطه في الشجرة الهرمية
     */
    public void addChildElement(ASTNode child) {
        if (child != null) {
            this.children.add(child);
            this.addChild(child);
        }
    }

    public String getBlockName() {
        return blockName;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String getNodeType() {
        return "JinjaBlock";
    }

    @Override
    public String getValue() {
        return blockName;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}