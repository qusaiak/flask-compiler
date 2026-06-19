package com.flaskcompiler.transfer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The data context transferred from a Python route to a template.
 * Produced by DataExtractor from a render_template(...) call.
 */
public class ContextModel {

    private final String routeName;
    private final String templateName;
    private final Map<String, Object> variables;

    public ContextModel(String routeName, String templateName, Map<String, Object> variables) {
        this.routeName = routeName;
        this.templateName = templateName;
        this.variables = (variables != null) ? variables : new LinkedHashMap<>();
    }

    public String getRouteName() { return routeName; }
    public String getTemplateName() { return templateName; }
    public Map<String, Object> getVariables() { return variables; }

    /** An unresolved reference (a variable/expression whose value is not a static literal). */
    public record Ref(String name) {
        @Override
        public String toString() {
            return "Ref(" + name + ")";
        }
    }
}
