package org.example.visitor;

import org.example.ast.ASTNode;
import org.example.ast.html.*;
import org.example.ast.jinja2.*;
import org.example.ast.css.*;
import org.example.gen.FlaskParser;
import org.example.gen.FlaskParserBaseVisitor;

public class ASTBuilder extends FlaskParserBaseVisitor<ASTNode> {


    @Override
    public ASTNode visit(org.antlr.v4.runtime.tree.ParseTree tree) {
        if (tree == null) return null;
        ASTNode result = super.visit(tree);


        return result;
    }




    private String stripQuotes(String text) {
        if (text == null || text.length() < 2) return text;
        if ((text.startsWith("\"") && text.endsWith("\"")) ||
                (text.startsWith("'") && text.endsWith("'"))) {
            return text.substring(1, text.length() - 1);
        }
        return text;
    }

    private String rebuildTextWithOriginalSpacing(org.antlr.v4.runtime.ParserRuleContext ctx) {
        if (ctx == null) return "";
        java.util.List<org.antlr.v4.runtime.Token> leafTokens = new java.util.ArrayList<>();
        collectLeafTokens(ctx, leafTokens);

        StringBuilder sb = new StringBuilder();
        org.antlr.v4.runtime.Token prev = null;
        for (org.antlr.v4.runtime.Token t : leafTokens) {
            if (prev != null && t.getStartIndex() > prev.getStopIndex() + 1) {
                sb.append(' ');
            }
            sb.append(t.getText());
            prev = t;
        }
        return sb.toString();
    }

    private void collectLeafTokens(org.antlr.v4.runtime.tree.ParseTree node,
                                   java.util.List<org.antlr.v4.runtime.Token> out) {
        if (node == null) return;
        if (node instanceof org.antlr.v4.runtime.tree.TerminalNode) {
            out.add(((org.antlr.v4.runtime.tree.TerminalNode) node).getSymbol());
            return;
        }
        for (int i = 0; i < node.getChildCount(); i++) {
            collectLeafTokens(node.getChild(i), out);
        }
    }

    @Override
    public ASTNode visitFlaskTemplate(FlaskParser.FlaskTemplateContext ctx) {
        HtmlFileNode root = new HtmlFileNode(
                "template",
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );
        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode node = visit(child);
                if (node != null) {
                    root.addChildElement(node);
                }
            }
        }
        return root;
    }

    @Override
    public ASTNode visitHtmlElementNode(FlaskParser.HtmlElementNodeContext ctx) {
        return ctx.htmlElement() != null ? visit(ctx.htmlElement()) : null;
    }

    @Override
    public ASTNode visitJ2StmtNode(FlaskParser.J2StmtNodeContext ctx) {
        return ctx.j2Statement() != null ? visit(ctx.j2Statement()) : null;
    }

    @Override
    public ASTNode visitJ2VarNode(FlaskParser.J2VarNodeContext ctx) {
        return ctx.j2Variable() != null ? visit(ctx.j2Variable()) : null;
    }

    @Override
    public ASTNode visitDoctypeNode(FlaskParser.DoctypeNodeContext ctx) {
        return new HtmlDoctypeNode(
                "html",
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );
    }

    @Override
    public ASTNode visitHtmlTextNode(FlaskParser.HtmlTextNodeContext ctx) {
        if (ctx.HTML_TEXT() == null) return null;
        String text = ctx.HTML_TEXT().getText().trim();
        if (text.isEmpty()) return null;
        return new HtmlTextNode(
                text,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );
    }

    @Override
    public ASTNode visitHtmlCommentNode(FlaskParser.HtmlCommentNodeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitJ2CommentNode(FlaskParser.J2CommentNodeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNormalElement(FlaskParser.NormalElementContext ctx) {
        if (ctx.openTag() == null || ctx.openTag().HTML_OPEN_TAG() == null) return null;

        String tagToken = ctx.openTag().HTML_OPEN_TAG().getText();
        String tag = tagToken.startsWith("<") ? tagToken.substring(1) : tagToken;

        HtmlElementNode node = new HtmlElementNode(
                tag, false,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        if (ctx.openTag().attribute() != null) {
            for (FlaskParser.AttributeContext attr : ctx.openTag().attribute()) {
                if (attr.ATTR_NAME() == null) continue;
                String attrName = attr.ATTR_NAME().getText();
                String attrValueStr = "";

                if (attr.attrValue() != null) {
                    FlaskParser.AttrValueContext valCtx = attr.attrValue();
                    if (valCtx instanceof FlaskParser.DqAttrValContext || valCtx instanceof FlaskParser.SqAttrValContext) {
                        attrValueStr = stripQuotes(valCtx.getText());
                    } else {
                        attrValueStr = valCtx.getText();
                    }
                }

                ASTNode valueNode = new HtmlTextNode(
                        attrValueStr,
                        attr.getStart().getLine(),
                        attr.getStart().getCharPositionInLine()
                );

                node.addAttribute(new HtmlAttributeNode(
                        attrName,
                        valueNode,
                        attr.getStart().getLine(),
                        attr.getStart().getCharPositionInLine()
                ));
            }
        }

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode childNode = visit(child);
                if (childNode != null) {
                    node.addChildElement(childNode);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitVoidElement(FlaskParser.VoidElementContext ctx) {
        if (ctx.selfCloseTag() == null || ctx.selfCloseTag().HTML_OPEN_TAG() == null) return null;

        String tagToken = ctx.selfCloseTag().HTML_OPEN_TAG().getText();
        String tag = tagToken.startsWith("<") ? tagToken.substring(1) : tagToken;

        HtmlElementNode node = new HtmlElementNode(
                tag, true,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        if (ctx.selfCloseTag().attribute() != null) {
            for (FlaskParser.AttributeContext attr : ctx.selfCloseTag().attribute()) {
                if (attr.ATTR_NAME() == null) continue;
                String attrName = attr.ATTR_NAME().getText();
                String attrValueStr = "";

                if (attr.attrValue() != null) {
                    FlaskParser.AttrValueContext valCtx = attr.attrValue();
                    if (valCtx instanceof FlaskParser.DqAttrValContext || valCtx instanceof FlaskParser.SqAttrValContext) {
                        attrValueStr = stripQuotes(valCtx.getText());
                    } else {
                        attrValueStr = valCtx.getText();
                    }
                }

                ASTNode valueNode = new HtmlTextNode(
                        attrValueStr,
                        attr.getStart().getLine(),
                        attr.getStart().getCharPositionInLine()
                );

                node.addAttribute(new HtmlAttributeNode(
                        attrName,
                        valueNode,
                        attr.getStart().getLine(),
                        attr.getStart().getCharPositionInLine()
                ));
            }
        }

        return node;
    }

    @Override
    public ASTNode visitCssElement(FlaskParser.CssElementContext ctx) {
        HtmlElementNode node = new HtmlElementNode(
                "style", false,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        FlaskParser.StyleElementContext styleCtx = ctx.styleElement();
        if (styleCtx != null && styleCtx.cssStylesheetInStyle() != null) {
            for (FlaskParser.CssItemInStyleContext item : styleCtx.cssStylesheetInStyle().cssItemInStyle()) {
                ASTNode child = visitCssItemInStyleNode(item);
                if (child != null) node.addChildElement(child);
            }
        }

        return node;
    }
    @Override
    public ASTNode visitJ2IfStmt(FlaskParser.J2IfStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String condStr = (ctx.j2Expr() != null) ? ctx.j2Expr().getText() : "";
        ASTNode condNode = new HtmlTextNode(condStr, line, col);

        JinjaIfNode node = new JinjaIfNode(condNode, line, col);


        if (ctx.children != null) {
            for (org.antlr.v4.runtime.tree.ParseTree child : ctx.children) {
                if (child instanceof FlaskParser.HtmlNodeContext) {
                    ASTNode c = visit(child);
                    if (c != null) node.addChildElement(c);
                }
            }
        }

        if (ctx.j2ElifClause() != null) {
            for (FlaskParser.J2ElifClauseContext elifCtx : ctx.j2ElifClause()) {
                ASTNode elifNode = visit(elifCtx);
                if (elifNode != null) node.addChildElement(elifNode);
            }
        }

        if (ctx.j2ElseClause() != null) {
            ASTNode elseNode = visit(ctx.j2ElseClause());
            if (elseNode != null) node.addChildElement(elseNode);
        }

        return node;
    }
    @Override
    public ASTNode visitJ2ElifClause(FlaskParser.J2ElifClauseContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String condStr = (ctx.j2Expr() != null) ? ctx.j2Expr().getText() : "";
        ASTNode condNode = new HtmlTextNode(condStr, line, col);

        JinjaIfNode elifNode = new JinjaIfNode("elif", condNode, line, col);

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) elifNode.addChildElement(c);
            }
        }

        return elifNode;
    }
    @Override
    public ASTNode visitJ2ElseClause(FlaskParser.J2ElseClauseContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        JinjaIfNode elseNode = new JinjaIfNode("else", null, line, col);

        if (ctx.children != null) {
            for (org.antlr.v4.runtime.tree.ParseTree child : ctx.children) {
                if (child instanceof FlaskParser.HtmlNodeContext) {
                    ASTNode c = visit(child);
                    if (c != null) {
                        elseNode.addChildElement(c);
                    }
                }
            }
        }

        return elseNode;
    }
    private ASTNode visitCssItemInStyleNode(FlaskParser.CssItemInStyleContext ctx) {
        if (ctx == null) return null;
        if (ctx.cssRuleInStyle() != null) {
            return buildCssRuleNode(ctx.cssRuleInStyle());
        }
        if (ctx.cssAtRuleInStyle() != null) {
            return buildCssAtRuleNode(ctx.cssAtRuleInStyle());
        }
        return null;
    }

    private ASTNode buildCssRuleNode(FlaskParser.CssRuleInStyleContext ctx) {
        String fullSelectorText = rebuildTextWithOriginalSpacing(ctx.cssSelectorListInStyle());

        CssRuleNode ruleNode = new CssRuleNode(
                fullSelectorText,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        if (ctx.cssSelectorListInStyle() != null && ctx.cssSelectorListInStyle().cssSelectorInStyle() != null) {
            for (FlaskParser.CssSelectorInStyleContext sel : ctx.cssSelectorListInStyle().cssSelectorInStyle()) {
                ruleNode.addChild(new CssSelectorNode(
                        rebuildTextWithOriginalSpacing(sel),
                        sel.getStart().getLine(),
                        sel.getStart().getCharPositionInLine()
                ));
            }
        }

        if (ctx.cssDeclarationBlockInStyle() != null && ctx.cssDeclarationBlockInStyle().cssDeclarationInStyle() != null) {
            for (FlaskParser.CssDeclarationInStyleContext decl : ctx.cssDeclarationBlockInStyle().cssDeclarationInStyle()) {
                ruleNode.addChild(buildCssDeclarationNode(decl));
            }
        }

        return ruleNode;
    }

    private ASTNode buildCssDeclarationNode(FlaskParser.CssDeclarationInStyleContext ctx) {
        String property = (ctx.CSS_MODE_IDENT() != null) ? ctx.CSS_MODE_IDENT().getText() : "";
        String valueStr = rebuildTextWithOriginalSpacing(ctx.cssValueListInStyle());

        ASTNode valueNode = new HtmlTextNode(
                valueStr,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        return new CssDeclarationNode(
                property,
                valueNode,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );
    }

    private ASTNode buildCssAtRuleNode(FlaskParser.CssAtRuleInStyleContext ctx) {
        if (ctx.cssMediaRuleInStyle() != null) {
            FlaskParser.CssMediaRuleInStyleContext mediaCtx = ctx.cssMediaRuleInStyle();
            int line = mediaCtx.getStart().getLine();
            int col  = mediaCtx.getStart().getCharPositionInLine();

            String exprStr = rebuildTextWithOriginalSpacing(mediaCtx.cssMediaQueryInStyle());
            ASTNode exprNode = new HtmlTextNode(exprStr, line, col);

            CssAtRuleNode atNode = new CssAtRuleNode("media", exprNode, line, col);

            if (mediaCtx.cssItemInStyle() != null) {
                for (FlaskParser.CssItemInStyleContext item : mediaCtx.cssItemInStyle()) {
                    ASTNode child = visitCssItemInStyleNode(item);
                    if (child != null) atNode.addChild(child);
                }
            }
            return atNode;
        }

        if (ctx.cssKeyframesRuleInStyle() != null) {
            FlaskParser.CssKeyframesRuleInStyleContext kfCtx = ctx.cssKeyframesRuleInStyle();
            int line = kfCtx.getStart().getLine();
            int col  = kfCtx.getStart().getCharPositionInLine();

            String name = (kfCtx.CSS_MODE_IDENT() != null) ? kfCtx.CSS_MODE_IDENT().getText() : "";
            ASTNode nameNode = new HtmlTextNode(name, line, col);

            return new CssAtRuleNode("keyframes", nameNode, line, col);
        }

        if (ctx.cssImportRuleInStyle() != null) {
            FlaskParser.CssImportRuleInStyleContext impCtx = ctx.cssImportRuleInStyle();
            int line = impCtx.getStart().getLine();
            int col  = impCtx.getStart().getCharPositionInLine();

            String exprStr = rebuildTextWithOriginalSpacing(impCtx);
            ASTNode exprNode = new HtmlTextNode(exprStr, line, col);

            return new CssAtRuleNode("import", exprNode, line, col);
        }

        if (ctx.cssCharsetRuleInStyle() != null) {
            FlaskParser.CssCharsetRuleInStyleContext chCtx = ctx.cssCharsetRuleInStyle();
            int line = chCtx.getStart().getLine();
            int col  = chCtx.getStart().getCharPositionInLine();

            String exprStr = rebuildTextWithOriginalSpacing(chCtx);
            ASTNode exprNode = new HtmlTextNode(exprStr, line, col);

            return new CssAtRuleNode("charset", exprNode, line, col);
        }

        if (ctx.cssSupportsRuleInStyle() != null) {
            FlaskParser.CssSupportsRuleInStyleContext supCtx = ctx.cssSupportsRuleInStyle();
            int line = supCtx.getStart().getLine();
            int col  = supCtx.getStart().getCharPositionInLine();

            String exprStr = rebuildTextWithOriginalSpacing(supCtx.cssSupportsConditionInStyle());
            ASTNode exprNode = new HtmlTextNode(exprStr, line, col);

            CssAtRuleNode atNode = new CssAtRuleNode("supports", exprNode, line, col);

            if (supCtx.cssItemInStyle() != null) {
                for (FlaskParser.CssItemInStyleContext item : supCtx.cssItemInStyle()) {
                    ASTNode child = visitCssItemInStyleNode(item);
                    if (child != null) atNode.addChild(child);
                }
            }
            return atNode;
        }

        if (ctx.cssFontFaceRuleInStyle() != null) {
            FlaskParser.CssFontFaceRuleInStyleContext ffCtx = ctx.cssFontFaceRuleInStyle();
            int line = ffCtx.getStart().getLine();
            int col  = ffCtx.getStart().getCharPositionInLine();

            ASTNode emptyNode = new HtmlTextNode("", line, col);
            CssAtRuleNode atNode = new CssAtRuleNode("font-face", emptyNode, line, col);

            if (ffCtx.cssDeclarationBlockInStyle() != null && ffCtx.cssDeclarationBlockInStyle().cssDeclarationInStyle() != null) {
                for (FlaskParser.CssDeclarationInStyleContext decl : ffCtx.cssDeclarationBlockInStyle().cssDeclarationInStyle()) {
                    atNode.addChild(buildCssDeclarationNode(decl));
                }
            }
            return atNode;
        }

        return null;
    }

    @Override
    public ASTNode visitScriptEl(FlaskParser.ScriptElContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        HtmlElementNode script = new HtmlElementNode("script", false, line, col);

        FlaskParser.ScriptElementContext scriptContext = ctx.scriptElement();
        String openTag = scriptContext.SCRIPT_OPEN().getText();
        java.util.regex.Matcher srcMatcher = java.util.regex.Pattern
                .compile("(?i)\\bsrc\\s*=\\s*([\\\"'][^\\\"']*[\\\"']|[^\\s>]+)")
                .matcher(openTag);
        if (srcMatcher.find()) {
            String src = stripQuotes(srcMatcher.group(1));
            script.addAttribute(new HtmlAttributeNode(
                    "src", new HtmlTextNode(src, line, col), line, col));
        }

        StringBuilder scriptText = new StringBuilder();
        for (org.antlr.v4.runtime.tree.TerminalNode token : scriptContext.SCRIPT_TEXT()) {
            scriptText.append(token.getText());
        }
        if (!scriptText.isEmpty()) {
            script.addChildElement(new HtmlTextNode(scriptText.toString(), line, col));
        }
        return script;
    }

    @Override
    public ASTNode visitJ2ForStmt(FlaskParser.J2ForStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String targetStr = (ctx.j2ForTarget() != null) ? ctx.j2ForTarget().getText() : "";
        String exprStr   = (ctx.j2Expr(0) != null) ? ctx.j2Expr(0).getText() : "";

        ASTNode varNode  = new HtmlTextNode(targetStr, line, col);
        ASTNode iterNode = new HtmlTextNode(exprStr, line, col);

        JinjaForNode node = new JinjaForNode(varNode, iterNode, line, col);

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChildElement(c);
            }
        }
        return node;
    }



    @Override
    public ASTNode visitJ2BlockStmt(FlaskParser.J2BlockStmtContext ctx) {
        int line = ctx.start.getLine();
        String blockName = (ctx.J2S_ID(0) != null) ? ctx.J2S_ID(0).getText() : "";

        JinjaBlockNode node = new JinjaBlockNode(
                blockName,
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );
        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChildElement(c);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitJ2ExtendsStmt(FlaskParser.J2ExtendsStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String templateStr = (ctx.j2StringLiteral() != null) ? ctx.j2StringLiteral().getText() : "";
        templateStr = stripQuotes(templateStr);

        ASTNode templateNode = new HtmlTextNode(templateStr, line, col);
        return new JinjaExtendsNode(templateNode, line, col);
    }

    @Override
    public ASTNode visitJ2Variable(FlaskParser.J2VariableContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String varExprText = (ctx.j2VarExpr() != null) ? ctx.j2VarExpr().getText() : "";
        ASTNode exprNode = new HtmlTextNode(varExprText, line, col);
        return new JinjaExprNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitJ2IncludeStmt(FlaskParser.J2IncludeStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String template = (ctx.j2StringLiteral() != null) ? ctx.j2StringLiteral().getText() : "";
        template = stripQuotes(template);

        ASTNode exprNode = new HtmlTextNode("include '" + template + "'", line, col);
        return new JinjaExprNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitSimpleSetStmt(FlaskParser.SimpleSetStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String varName = (ctx.J2S_ID() != null) ? ctx.J2S_ID().getText() : "";
        String valText = (ctx.j2Expr() != null) ? ctx.j2Expr().getText() : "";
        ASTNode valueNode = new HtmlTextNode(valText, line, col);

        return new JinjaSetNode(varName, valueNode, line, col);
    }

    @Override
    public ASTNode visitBlockSetStmt(FlaskParser.BlockSetStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String varName = (ctx.J2S_ID() != null) ? ctx.J2S_ID().getText() : "";
        JinjaSetNode node = new JinjaSetNode(varName, null, line, col);

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChild(c);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitJ2MacroStmt(FlaskParser.J2MacroStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String macroName = (ctx.J2S_ID() != null) ? ctx.J2S_ID().getText() : "";
        String args = (ctx.j2MacroArgs() != null) ? ctx.j2MacroArgs().getText() : "";
        ASTNode exprNode = new HtmlTextNode("macro " + macroName + "(" + args + ")", line, col);

        JinjaExprNode node = new JinjaExprNode(exprNode, line, col);
        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChild(c);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitJ2ImportStmt(FlaskParser.J2ImportStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String template = (ctx.j2StringLiteral() != null) ? ctx.j2StringLiteral().getText() : "";
        template = stripQuotes(template);
        String alias = (ctx.J2S_ID() != null) ? ctx.J2S_ID().getText() : "";

        ASTNode exprNode = new HtmlTextNode("import '" + template + "' as " + alias, line, col);
        return new JinjaExprNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitJ2FromImportStmt(FlaskParser.J2FromImportStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String template = (ctx.j2StringLiteral() != null) ? ctx.j2StringLiteral().getText() : "";
        template = stripQuotes(template);

        ASTNode exprNode = new HtmlTextNode("from '" + template + "' import", line, col);
        return new JinjaExprNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitJ2WithStmt(FlaskParser.J2WithStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        ASTNode exprNode = new HtmlTextNode("with", line, col);
        JinjaExprNode node = new JinjaExprNode(exprNode, line, col);

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChild(c);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitJ2CallStmt(FlaskParser.J2CallStmtContext ctx) {
        int line = ctx.getStart().getLine();
        int col  = ctx.getStart().getCharPositionInLine();

        String exprText = (ctx.j2Expr() != null) ? ctx.j2Expr().getText() : "";
        ASTNode exprNode = new HtmlTextNode("call " + exprText, line, col);
        JinjaExprNode node = new JinjaExprNode(exprNode, line, col);

        if (ctx.htmlNode() != null) {
            for (FlaskParser.HtmlNodeContext child : ctx.htmlNode()) {
                ASTNode c = visit(child);
                if (c != null) node.addChild(c);
            }
        }
        return node;
    }
}