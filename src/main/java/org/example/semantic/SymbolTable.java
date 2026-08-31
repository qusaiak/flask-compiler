package org.example.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SymbolTable {

    private static class Scope {
        private final Map<String, Symbol> symbols = new HashMap<>();
        private final Scope parent;

        public Scope(Scope parent) {
            this.parent = parent;
        }
    }

    private Scope currentScope;
    private final List<Symbol> allDefinedSymbols = new ArrayList<>();
    private final Set<String> expiredLoopVars = new HashSet<>();
    private final List<String> semanticErrors = new ArrayList<>();

    public SymbolTable() {
        this.currentScope = new Scope(null);
    }


    public void enterScope() {
        currentScope = new Scope(currentScope);
    }


    public void exitScope() {
        if (currentScope != null) {
            for (Symbol sym : currentScope.symbols.values()) {
                if ("LOOP_VARIABLE".equalsIgnoreCase(sym.getCategory())) {
                    expiredLoopVars.add(sym.getName());
                }
            }
            if (currentScope.parent != null) {
                currentScope = currentScope.parent;
            }
        }
    }


    public boolean isExpiredLoopVar(String name) {
        return expiredLoopVars.contains(name);
    }


    public boolean define(String name, String category, int line) {
        String[] flaskReserved = {"request", "session", "config", "g", "super"};
        for (String fr : flaskReserved) {
            if (fr.equalsIgnoreCase(name)) {
                String error = "Semantic Error [6]: Cannot override built-in Flask/Jinja variable '" + name + "' at line " + line;
                semanticErrors.add(error);
                System.err.println(error);
                return false;
            }
        }

        if (isDefinedLocally(name)) {
            String error = "Semantic Error: Variable '" + name + "' is already defined in this scope at line " + line;
            semanticErrors.add(error);
            System.err.println(error);
            return false;
        }
        Symbol symbol = new Symbol(name, category, line);
        currentScope.symbols.put(name, symbol);
        allDefinedSymbols.add(symbol);
        return true;
    }


    public Symbol lookup(String name) {
        Scope tempScope = currentScope;
        while (tempScope != null) {
            if (tempScope.symbols.containsKey(name)) {
                Symbol sym = tempScope.symbols.get(name);
                sym.markUsed();
                return sym;
            }
            tempScope = tempScope.parent;
        }
        return null;
    }

    public void checkUnusedVariables() {
        Scope tempScope = currentScope;
        while (tempScope != null) {
            for (Symbol sym : tempScope.symbols.values()) {
                if (!sym.isUsed() && "SET_VAR".equalsIgnoreCase(sym.getCategory())) {
                    String error = "Semantic Error [8]: Variable '" + sym.getName() + "' defined at line " + sym.getLine() + " is never used!";
                    semanticErrors.add(error);
                    System.err.println(error);
                }
            }
            tempScope = tempScope.parent;
        }
    }

    public List<String> getSemanticErrors() {
        return List.copyOf(semanticErrors);
    }


    public boolean isDefinedLocally(String name) {
        return currentScope.symbols.containsKey(name);
    }


    public List<Symbol> getAllDefinedSymbols() {
        return List.copyOf(allDefinedSymbols);
    }

    public void printSymbolTable() {

        System.out.println("\n  ╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("  ║                              SYMBOL TABLE                                    ║");
        System.out.println("  ╠══════════════════════════════╦══════════════════════════╦════════════════════╣");
        System.out.println("  ║ Variable Name                ║ Category                 ║ Defined at Line    ║");
        System.out.println("  ╠══════════════════════════════╬══════════════════════════╬════════════════════╣");

        for (Symbol sym : allDefinedSymbols) {
            System.out.println(String.format("  ║ %-28s ║ %-24s ║ %-18d ║",
                    sym.getName(), sym.getCategory(), sym.getLine()));
        }

        System.out.println("  ╚══════════════════════════════╩══════════════════════════╩════════════════════╝\n");
    }
}