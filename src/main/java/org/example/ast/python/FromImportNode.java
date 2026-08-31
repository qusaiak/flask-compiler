package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FromImportNode extends ASTNode {
    private final String module;
    private final List<ASTNode> names;

    public FromImportNode(String module, int line, int col) {
        super("FromImportNode", line, col);
        this.module = module;
        this.names = new ArrayList<>();
    }

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