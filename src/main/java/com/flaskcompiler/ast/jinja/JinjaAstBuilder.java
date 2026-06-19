package com.flaskcompiler.ast.jinja;

import com.flaskcompiler.ast.Node;
import com.flaskcompiler.grammar.JinjaParser;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Builds the Jinja AST from an ANTLR parse tree (JinjaParser.TemplateContext).
 * {% extends %} is folded into the TemplateNode (no dedicated node type).
 */
public class JinjaAstBuilder {

    public TemplateNode build(JinjaParser.TemplateContext ctx) {
        TemplateNode template = new TemplateNode(line(ctx));
        for (JinjaParser.NodeContext n : ctx.node()) {
            if (n.extendsTag() != null) {
                template.setExtends(stripQuotes(n.extendsTag().STRING().getText()));
            } else {
                template.add(buildNode(n));
            }
        }
        return template;
    }

    private Node buildNode(JinjaParser.NodeContext ctx) {
        if (ctx.blockTag() != null) return block(ctx.blockTag());
        if (ctx.forTag() != null) return forTag(ctx.forTag());
        if (ctx.ifTag() != null) return ifTag(ctx.ifTag());
        if (ctx.expression() != null) return expression(ctx.expression());
        if (ctx.content() != null) return content(ctx.content());
        return null;
    }

    private Node block(JinjaParser.BlockTagContext ctx) {
        BlockNode node = new BlockNode(ctx.NAME().getText(), line(ctx));
        for (JinjaParser.NodeContext n : ctx.node()) node.add(buildNode(n));
        return node;
    }

    private Node forTag(JinjaParser.ForTagContext ctx) {
        ForNode node = new ForNode(ctx.NAME().getText(), ctx.variableRef().getText(), line(ctx));
        for (JinjaParser.NodeContext n : ctx.node()) node.add(buildNode(n));
        return node;
    }

    private Node ifTag(JinjaParser.IfTagContext ctx) {
        IfNode node = new IfNode(ctx.condition().getText(), line(ctx));
        for (JinjaParser.NodeContext n : ctx.node()) node.add(buildNode(n));
        return node;
    }

    private Node expression(JinjaParser.ExpressionContext ctx) {
        ExpressionNode node = new ExpressionNode(line(ctx));
        node.add(new VariableReferenceNode(ctx.variableRef().getText(), line(ctx)));
        return node;
    }

    private Node content(JinjaParser.ContentContext ctx) {
        String text = ctx.TEXT().getText();
        if (text.trim().isEmpty()) return null;   // skip whitespace-only content
        return new HtmlContentNode(text, line(ctx));
    }

    private static int line(ParserRuleContext ctx) {
        return ctx.getStart().getLine();
    }

    private static String stripQuotes(String s) {
        return (s.length() >= 2) ? s.substring(1, s.length() - 1) : s;
    }
}
