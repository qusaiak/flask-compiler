package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FromImportNode extends ASTNode {
    private final String module;        // اسم الموديول (مثل math أو os.path)
    private final List<ASTNode> names;  // الأسماء المستوردة (قد تكون IdentifierNode أو AliasNode لـ as أو StarNode)

    public FromImportNode(String module, int line, int col) {
        super("FromImportNode", line, col);
        this.module = module;
        this.names = new ArrayList<>();
    }

    /**
     * إضافة اسم/عنصر مستورد كـ ASTNode وربطه كابن في الشجرة
     */
    public void addName(ASTNode name) {
        if (name != null) {
            this.names.add(name);
            this.addChild(name);
        }
    }

    @Override
    public String getNodeType() {
        return "FromImport";
    }

    @Override
    public String getValue() {
        return "from " + (module != null ? module : "");
    }

    // Getters
    public String getModule() {
        return module;
    }

    public List<ASTNode> getNames() {
        return names;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}