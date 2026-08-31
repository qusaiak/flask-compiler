package org.example.ast.python;

import org.example.ast.ASTNode;
import org.example.ast.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ImportNode extends ASTNode {
    private final List<ASTNode> modules;

    public ImportNode(int line, int col) {
        super("ImportNode", line, col);
        this.modules = new ArrayList<>();
    }


    public void addModule(ASTNode module) {
        if (module != null) {
            this.modules.add(module);
            this.addChild(module);
        }
    }

    @Override
    public String getNodeType() {
        return "Import";
    }

    @Override
    public String getValue() {
        return "import";
    }

    public List<ASTNode> getModules() {
        return modules;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}