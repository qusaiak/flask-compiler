package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

/**
 * يمثّل معاملاً مفتاحياً (keyword argument) داخل استدعاء دالة، مثل:
 * render_template('products.html', products=products)
 * حيث products= هو اسم المعامل (name) وproducts (الثانية) هي عقدة القيمة (value).
 * قبل إضافة هذه العقدة كان visitArgument في PythonASTBuilder يتجاهل اسم المعامل
 * ويكتفي بزيارة التعبير، فتُفقد معلومة الربط بين اسم المتغيّر في القالب وقيمته الفعلية.
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
