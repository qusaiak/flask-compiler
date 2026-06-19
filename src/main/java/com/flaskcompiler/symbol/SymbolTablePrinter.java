package com.flaskcompiler.symbol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Renders a symbol table as an indented tree. */
public final class SymbolTablePrinter {

    private SymbolTablePrinter() { }

    public static void printSymbolTable(SymbolTable table) {
        Scope global = table.getGlobalScope();
        System.out.println(global.getScopeName());
        printScopeBody(global, "");
    }

    /** Print the symbols and nested scopes of a scope. */
    static void printScopeBody(Scope scope, String prefix) {
        Map<String, Scope> childByName = new LinkedHashMap<>();
        for (Scope child : scope.getChildren()) {
            childByName.put(child.getScopeName(), child);
        }

        // Ordered names: symbols first (insertion order), then any child scope
        // names that are not also symbols.
        List<String> names = new ArrayList<>(scope.getSymbols().keySet());
        for (String childName : childByName.keySet()) {
            if (!names.contains(childName)) {
                names.add(childName);
            }
        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            boolean last = (i == names.size() - 1);
            String branch = last ? "\u2514\u2500\u2500 " : "\u251c\u2500\u2500 ";

            Symbol symbol = scope.getSymbols().get(name);
            String typeStr = (symbol != null) ? " : " + symbol.getType() : "";
            System.out.println(prefix + branch + name + typeStr);

            Scope child = childByName.get(name);
            if (child != null) {
                String childPrefix = prefix + (last ? "    " : "\u2502   ");
                printScopeBody(child, childPrefix);
            }
        }
    }
}
