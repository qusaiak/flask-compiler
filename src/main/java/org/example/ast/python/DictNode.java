package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DictNode extends ASTNode {
    private final List<ASTNode> keys;   // قائمة المفاتيح (قد تكون LiteralNode أو IdentifierNode...)
    private final List<ASTNode> values; // قائمة القيم (قد تكون FunctionCallNode أو BinaryOpNode...)

    public DictNode(int line, int col) {
        super("DictNode", line, col);
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    /**
     * إضافة زوج (مفتاح وقيمة) كـ ASTNode وربطهما بالشجرة
     */
    public void addPair(ASTNode key, ASTNode value) {
        if (key != null && value != null) {
            this.keys.add(key);
            this.values.add(value);

            // إضافة المفتاح والقيمة كأبناء لطباعتهم في الشجرة
            this.addChild(key);
            this.addChild(value);
        }
    }

    @Override
    public String getNodeType() {
        return "Dict";
    }

    @Override
    public String getValue() {
        return "{}";
    }

    // Getters
    public List<ASTNode> getKeys() {
        return keys;
    }

    public List<ASTNode> getValues() {
        return values;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}