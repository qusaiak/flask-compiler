package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DecoratorNode extends ASTNode {
    private final String decoratorName;  // اسم الـ Decorator (مثل route أو login_required)
    private final List<ASTNode> arguments; // وسائط الـ Decorator (مثل المسارات '/' أو المعاملات)

    public DecoratorNode(String name, int line, int col) {
        super("DecoratorNode", line, col);
        this.decoratorName = name;
        this.arguments = new ArrayList<>();
    }

    /**
     * إضافة وسيط (Argument) للـ Decorator وربطه كابن في الشجرة
     */
    public void addArgument(ASTNode arg) {
        if (arg != null) {
            this.arguments.add(arg);
            this.addChild(arg);
        }
    }

    @Override
    public String getNodeType() {
        return "Decorator";
    }

    @Override
    public String getValue() {
        return "@" + decoratorName;
    }

    // Getters
    public String getDecoratorName() {
        return decoratorName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}