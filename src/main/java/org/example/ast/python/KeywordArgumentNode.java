package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

/**
 * Preserves the name-to-value binding in a keyword argument, such as
 * products=items in render_template(...), for template context extraction.
 */
public class KeywordArgumentNode extends ASTNode {
    private final String name;
    private final ASTNode argumentValue;

    public KeywordArgumentNode(String name, ASTNode argumentValue, int line, int col) {
        super("KeywordArgumentNode", line, col);
        this.name = name;
        this.argumentValue = argumentValue;
        if (argumentValue != null) {
            this.addChild(argumentValue);
        }
    }

    @Override
    public String getNodeType() {
        return "KeywordArgument";
    }

    @Override
    public String getValue() {
        return name + "=";
    }

    public String getName() {
        return name;
    }

    /** عقدة القيمة المُمرَّرة للمعامل (قد تكون Identifier أو Literal أو Dict أو List أو استدعاء دالة...). */
    public ASTNode getArgumentValue() {
        return argumentValue;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
