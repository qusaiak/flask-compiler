package org.example.semantic;

public class Symbol {
    private final String name;
    private final String category;
    private final int line;
    private boolean isUsed = false;
    public Symbol(String name, String category, int line) {
        this.name = name;
        this.category = category;
        this.line = line;
    }
    public void markUsed() {
        this.isUsed = true;
    }
    public boolean isUsed() {
        return isUsed;
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

    @Override
    public String toString() {
        return "Symbol{name='" + name + "', category='" + category + "', line=" + line + "}";
    }
}