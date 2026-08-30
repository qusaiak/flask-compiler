package org.example.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SymbolTable {

    // بنية داخلية لتمثيل النطاق (Scope) وربطه بالنطاق الأب
    private static class Scope {
        private final Map<String, Symbol> symbols = new HashMap<>();
        private final Scope parent;

        public Scope(Scope parent) {
            this.parent = parent;
        }
    }

    private Scope currentScope;
    // سجل العرض يحفظ الرموز حتى بعد الخروج من النطاق المحلي، مثل product في JinjaFor.
    private final List<Symbol> allDefinedSymbols = new ArrayList<>();
    // 👈 لتتبع متغيرات For التي انتهى نطاقها (الخطأ 9)
    private final Set<String> expiredLoopVars = new HashSet<>();

    public SymbolTable() {
        // تهيئة النطاق العام (Global Scope) عند البدء
        this.currentScope = new Scope(null);
    }

    /**
     * الدخول إلى نطاق محلي جديد (يستدعى عند دخول For, If, Block)
     */
    public void enterScope() {
        currentScope = new Scope(currentScope);
    }

    /**
     * الخروج من النطاق الحالي والعودة للنطاق الأب
     */
    public void exitScope() {
        if (currentScope != null) {
            // حفظ اسم متغير الحلقة قبل تدمير نطاقه لكشف استخدامه الخارجي لاحقاً (الخطأ 9)
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

    /**
     * فحص هل المتغير كان متغير حلقة وانتهى نطاقه (الخطأ 9)
     */
    public boolean isExpiredLoopVar(String name) {
        return expiredLoopVars.contains(name);
    }

    /**
     * تعريف متغير جديد في النطاق الحالي
     */
    public boolean define(String name, String category, int line) {
        // 👇 الخطأ الدلالي رقم 6: منع إعادة تعريف متغيرات النظام المحجوزة في Flask و Jinja2
        String[] flaskReserved = {"request", "session", "config", "g", "super"};
        for (String fr : flaskReserved) {
            if (fr.equalsIgnoreCase(name)) {
                System.err.println("Semantic Error [6]: Cannot override built-in Flask/Jinja variable '" + name + "' at line " + line);
                return false;
            }
        }

        if (isDefinedLocally(name)) {
            System.err.println("Semantic Error: Variable '" + name + "' is already defined in this scope at line " + line);
            return false;
        }
        Symbol symbol = new Symbol(name, category, line);
        currentScope.symbols.put(name, symbol);
        allDefinedSymbols.add(symbol);
        return true;
    }

    /**
     * البحث عن متغير (يبحث في النطاق الحالي، وإذا لم يجده يصعد تدريجياً للنطاقات العليا)
     */
    public Symbol lookup(String name) {
        Scope tempScope = currentScope;
        while (tempScope != null) {
            if (tempScope.symbols.containsKey(name)) {
                Symbol sym = tempScope.symbols.get(name);
                sym.markUsed(); // 👈 تعليم المتغير كـ "مُستخدم" عند قراءته (الخطأ 8)
                return sym;
            }
            tempScope = tempScope.parent;
        }
        return null; // المتغير غير معرف نهائياً
    }

    /**
     * 👈 دالة جديدة: فحص المتغيرات التي تم إعلانها ولم تُستدعَ أبداً (الخطأ 8)
     */
    public void checkUnusedVariables() {
        Scope tempScope = currentScope;
        while (tempScope != null) {
            for (Symbol sym : tempScope.symbols.values()) {
                if (!sym.isUsed() && "SET_VAR".equalsIgnoreCase(sym.getCategory())) {
                    System.err.println("Semantic Error [8]: Variable '" + sym.getName() + "' defined at line " + sym.getLine() + " is never used!");
                }
            }
            tempScope = tempScope.parent;
        }
    }

    /**
     * التحقق مما إذا كان المتغير معرّفاً في النطاق الحالي فقط (دون الصعود للأب)
     */
    public boolean isDefinedLocally(String name) {
        return currentScope.symbols.containsKey(name);
    }

        /**
     * يعيد نسخة للقراءة فقط من جميع الرموز التي عُرّفت أثناء التحليل،
     * بما فيها رموز النطاقات التي انتهت، لاستخدامها في تقارير المترجم.
     */
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