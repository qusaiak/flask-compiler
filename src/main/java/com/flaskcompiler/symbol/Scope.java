package com.flaskcompiler.symbol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** A lexical scope holding symbols and nested child scopes. */
public class Scope {

    private final String scopeName;
    private final Scope parent;
    private final List<Scope> children = new ArrayList<>();
    private final Map<String, Symbol> symbols = new LinkedHashMap<>();

    public Scope(String scopeName, Scope parent) {
        this.scopeName = scopeName;
        this.parent = parent;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    /** Define a symbol in this scope. Returns false if the name already exists. */
    public boolean define(Symbol symbol) {
        if (symbols.containsKey(symbol.getName())) {
            return false;
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }

    /** Resolve a name in this scope, walking up to parent scopes. */
    public Symbol resolve(String name) {
        Symbol local = symbols.get(name);
        if (local != null) {
            return local;
        }
        return (parent != null) ? parent.resolve(name) : null;
    }

    public String getScopeName() { return scopeName; }
    public Scope getParent() { return parent; }
    public List<Scope> getChildren() { return children; }
    public Map<String, Symbol> getSymbols() { return symbols; }

    /** Print the subtree rooted at this scope. */
    public void print() {
        System.out.println(scopeName);
        SymbolTablePrinter.printScopeBody(this, "");
    }
}
