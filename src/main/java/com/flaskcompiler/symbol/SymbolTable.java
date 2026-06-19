package com.flaskcompiler.symbol;

/**
 * Holds the scope tree and a cursor for scope-based construction
 * (enterScope/exitScope). Exists to support later semantic analysis.
 */
public class SymbolTable {

    private final Scope globalScope;
    private Scope current;

    public SymbolTable(String globalName) {
        this.globalScope = new Scope(globalName, null);
        this.current = globalScope;
    }

    public SymbolTable() {
        this("GLOBAL");
    }

    public Scope getGlobalScope() { return globalScope; }
    public Scope getCurrentScope() { return current; }

    /** Create and descend into a new child scope. */
    public Scope enterScope(String name) {
        Scope scope = new Scope(name, current);
        current = scope;
        return scope;
    }

    /** Ascend to the parent scope. */
    public void exitScope() {
        if (current.getParent() != null) {
            current = current.getParent();
        }
    }

    /** Define a symbol in the current scope. */
    public boolean define(Symbol symbol) {
        return current.define(symbol);
    }

    /** Resolve a name starting from the current scope. */
    public Symbol resolve(String name) {
        return current.resolve(name);
    }

    public void print() {
        SymbolTablePrinter.printSymbolTable(this);
    }
}
