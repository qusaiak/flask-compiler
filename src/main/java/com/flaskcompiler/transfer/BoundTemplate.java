package com.flaskcompiler.transfer;

import com.flaskcompiler.ast.jinja.TemplateNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A Jinja template bound to a Python data context.
 */
public class BoundTemplate {

    private final TemplateNode template;
    private final Map<String, Object> context;
    private final List<String> boundNodes = new ArrayList<>();

    public BoundTemplate(TemplateNode template, Map<String, Object> context) {
        this.template = template;
        this.context = context;
    }

    public TemplateNode getTemplate() { return template; }
    public Map<String, Object> getContext() { return context; }
    public List<String> getBoundNodes() { return boundNodes; }

    public void addBoundNode(String description) {
        boundNodes.add(description);
    }

    /** Print the binding: template name, context values and the bound nodes. */
    public void printBinding(String templateName) {
        System.out.println("Template:");
        System.out.println("  " + templateName);
        System.out.println("Context:");
        for (Map.Entry<String, Object> entry : context.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + describe(entry.getValue()));
        }
        System.out.println("Bound Nodes:");
        for (String bound : boundNodes) {
            System.out.println("  " + bound);
        }
    }

    /** Human-readable summary of a context value. */
    public static String describe(Object value) {
        if (value instanceof List<?> list) return "List(size=" + list.size() + ")";
        if (value instanceof Map<?, ?> map) return "Dict(size=" + map.size() + ")";
        if (value instanceof String s) return "\"" + s + "\"";
        return String.valueOf(value);
    }
}
