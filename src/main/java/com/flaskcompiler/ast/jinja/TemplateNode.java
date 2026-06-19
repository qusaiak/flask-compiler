package com.flaskcompiler.ast.jinja;

/** Root of the Jinja AST. Records an optional {% extends %} parent. */
public class TemplateNode extends JinjaNode {
    public TemplateNode(int line) {
        super("Template", line);
    }

    public void setExtends(String parent) {
        this.nodeName = "Template(extends=" + parent + ")";
    }
}
