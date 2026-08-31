package org.example.semantic;

public class Symbol {
    private final String name;
    private final String category;
    private final int line;
    private final String scope;
    private boolean isUsed;
    private int usageCount;

    public Symbol(String name, String category, int line) {
        this(name, category, line, "global");
    }

    public Symbol(String name, String category, int line, String scope) {
        this.name = name;
        this.category = category;
        this.line = line;
        this.scope = scope == null || scope.isBlank() ? "global" : scope;
        this.isUsed = false;
        this.usageCount = 0;
    }

    public void markUsed() {
        this.isUsed = true;
        this.usageCount++;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getLine() {
        return line;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return "Symbol{name='" + name + "', category='" + category
                + "', line=" + line + ", scope='" + scope
                + "', used=" + isUsed + ", usageCount=" + usageCount + "}";
    }
}