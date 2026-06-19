package com.flaskcompiler.ast.python;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.grammar.PythonParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

/**
 * Builds the Python AST from an ANTLR parse tree (PythonParser.File_inputContext).
 */
public class PythonAstBuilder {

    public ProgramNode build(PythonParser.File_inputContext ctx) {
        ProgramNode program = new ProgramNode(line(ctx));
        for (PythonParser.StatementContext s : ctx.statement()) {
            program.add(statement(s));
        }
        return program;
    }

    private Node statement(PythonParser.StatementContext ctx) {
        if (ctx.import_stmt() != null) return importStmt(ctx.import_stmt());
        if (ctx.function_def() != null) return functionDef(ctx.function_def());
        if (ctx.simple_stmt() != null) return simpleStmt(ctx.simple_stmt());
        return null;
    }

    private Node importStmt(PythonParser.Import_stmtContext ctx) {
        String module = ctx.dotted_name().getText();
        String desc = (ctx.FROM() != null)
                ? "from " + module + " import " + ctx.import_list().getText()
                : "import " + module;
        return new ImportNode(desc, line(ctx));
    }

    private Node functionDef(PythonParser.Function_defContext ctx) {
        String name = ctx.NAME().getText();
        String params = ctx.parameters().param_list() != null
                ? ctx.parameters().param_list().getText() : "";
        String signature = name + "(" + params + ")";

        String routePath = routePath(ctx);
        FunctionNode fn = (routePath != null)
                ? new RouteNode(routePath, signature, line(ctx))
                : new FunctionNode(signature, line(ctx));

        for (PythonParser.StatementContext s : ctx.suite().statement()) {
            fn.add(statement(s));
        }
        if (ctx.suite().simple_stmt() != null) {
            fn.add(simpleStmt(ctx.suite().simple_stmt()));
        }
        return fn;
    }

    /** Returns the route path if a @app.route decorator is present, else null. */
    private String routePath(PythonParser.Function_defContext ctx) {
        for (PythonParser.DecoratorContext d : ctx.decorator()) {
            if (d.dotted_name().getText().endsWith("route")) {
                if (d.arglist() != null && !d.arglist().argument().isEmpty()) {
                    return stripQuotes(d.arglist().argument(0).getText());
                }
                return "";
            }
        }
        return null;
    }

    private Node simpleStmt(PythonParser.Simple_stmtContext ctx) {
        return smallStmt(ctx.small_stmt());
    }

    private Node smallStmt(PythonParser.Small_stmtContext ctx) {
        if (ctx.assignment() != null) {
            PythonParser.AssignmentContext a = ctx.assignment();
            AssignmentNode node = new AssignmentNode(a.NAME().getText(), line(a));
            node.add(expr(a.expr()));
            return node;
        }
        if (ctx.return_stmt() != null) {
            PythonParser.Return_stmtContext r = ctx.return_stmt();
            ReturnNode node = new ReturnNode(line(r));
            if (r.expr() != null) node.add(expr(r.expr()));
            return node;
        }
        if (ctx.expr() != null) return expr(ctx.expr());
        return null;
    }

    private Node expr(PythonParser.ExprContext ctx) {
        return additive(ctx.additive());
    }

    private Node additive(PythonParser.AdditiveContext ctx) {
        if (ctx.multiplicative().size() == 1) return multiplicative(ctx.multiplicative(0));
        return new LiteralNode(ctx.getText(), line(ctx));
    }

    private Node multiplicative(PythonParser.MultiplicativeContext ctx) {
        if (ctx.postfix().size() == 1) return postfix(ctx.postfix(0));
        return new LiteralNode(ctx.getText(), line(ctx));
    }

    private Node postfix(PythonParser.PostfixContext ctx) {
        List<PythonParser.TrailerContext> trailers = ctx.trailer();
        if (trailers.isEmpty()) return atom(ctx.atom());

        PythonParser.TrailerContext last = trailers.get(trailers.size() - 1);
        if (last.OPEN_PAREN() != null) {
            String full = ctx.getText();
            String callee = full.contains("(") ? full.substring(0, full.indexOf('(')) : full;
            CallNode call = new CallNode(callee, line(ctx));
            if (last.arglist() != null) {
                for (PythonParser.ArgumentContext arg : last.arglist().argument()) {
                    call.add(argument(arg));
                }
            }
            return call;
        }
        // property access (.x) or subscription ([i]) -> leaf carrying full text
        return new PropertyAccessNode(ctx.getText(), line(ctx));
    }

    private Node argument(PythonParser.ArgumentContext ctx) {
        if (ctx.ASSIGN() != null) {
            AssignmentNode kw = new AssignmentNode(ctx.NAME().getText(), line(ctx));
            kw.add(expr(ctx.expr()));
            return kw;
        }
        return expr(ctx.expr());
    }

    private Node atom(PythonParser.AtomContext ctx) {
        if (ctx.expr() != null) return expr(ctx.expr());
        if (ctx.list_literal() != null) return listLiteral(ctx.list_literal());
        if (ctx.dict_literal() != null) return dictLiteral(ctx.dict_literal());
        if (ctx.NAME() != null) return new VariableNode(ctx.NAME().getText(), line(ctx));
        return new LiteralNode(ctx.getText(), line(ctx));
    }

    private Node listLiteral(PythonParser.List_literalContext ctx) {
        ListNode node = new ListNode(line(ctx));
        for (PythonParser.ExprContext e : ctx.expr()) node.add(expr(e));
        return node;
    }

    private Node dictLiteral(PythonParser.Dict_literalContext ctx) {
        DictNode node = new DictNode(line(ctx));
        for (PythonParser.Dict_entryContext entry : ctx.dict_entry()) {
            node.add(expr(entry.expr(0)));   // key
            node.add(expr(entry.expr(1)));   // value
        }
        return node;
    }

    private static int line(ParserRuleContext ctx) {
        return ctx.getStart().getLine();
    }

    private static String stripQuotes(String s) {
        if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
