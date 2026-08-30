package org.example.gen;
// Generated from C:/Users/DELL/Desktop/Downloads/demo/cmpiler2Projectv2/src/main/java/org/example/gen/FlaskParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlaskParser#flaskTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskTemplate(FlaskParser.FlaskTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementNode(FlaskParser.HtmlElementNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2StmtNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2StmtNode(FlaskParser.J2StmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarNode(FlaskParser.J2VarNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2CommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2CommentNode(FlaskParser.J2CommentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doctypeNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeNode(FlaskParser.DoctypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlCommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentNode(FlaskParser.HtmlCommentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlTextNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextNode(FlaskParser.HtmlTextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(FlaskParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(FlaskParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElement(FlaskParser.CssElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptEl}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptEl(FlaskParser.ScriptElContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(FlaskParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(FlaskParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#selfCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfCloseTag(FlaskParser.SelfCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(FlaskParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#scriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(FlaskParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(FlaskParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqAttrVal(FlaskParser.DqAttrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqAttrVal(FlaskParser.SqAttrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2AttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2AttrVal(FlaskParser.J2AttrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2AttrValInTag}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2AttrValInTag(FlaskParser.J2AttrValInTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VariableInTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VariableInTag(FlaskParser.J2VariableInTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssStylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheet(FlaskParser.CssStylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssItem(FlaskParser.CssItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(FlaskParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSelectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorList(FlaskParser.CssSelectorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(FlaskParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildComb(FlaskParser.ChildCombContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adjacentComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjacentComb(FlaskParser.AdjacentCombContext ctx);
	/**
	 * Visit a parse tree produced by the {@code siblingComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiblingComb(FlaskParser.SiblingCombContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeselectorwithmodifiers}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeselectorwithmodifiers(FlaskParser.TypeselectorwithmodifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justClassIdAttrpseudowithouttype}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustClassIdAttrpseudowithouttype(FlaskParser.JustClassIdAttrpseudowithouttypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(FlaskParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalSelector(FlaskParser.UniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(FlaskParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(FlaskParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelectorHex}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectorHex(FlaskParser.IdSelectorHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelector(FlaskParser.PseudoClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElementSelector(FlaskParser.PseudoElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSelector(FlaskParser.AttrSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssAttrOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAttrOperator(FlaskParser.CssAttrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFunctionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionArgs(FlaskParser.CssFunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssDeclarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationBlock(FlaskParser.CssDeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(FlaskParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(FlaskParser.CssValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentValue(FlaskParser.IdentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionValue(FlaskParser.DimensionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(FlaskParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorValue(FlaskParser.HexColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqStringValue(FlaskParser.DqStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqStringValue(FlaskParser.SqStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlValue(FlaskParser.UrlValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(FlaskParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashValue(FlaskParser.SlashValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValue(FlaskParser.CommaValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncValue(FlaskParser.FuncValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(FlaskParser.CssFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssAtRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRule(FlaskParser.CssAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaRule(FlaskParser.CssMediaRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQuery(FlaskParser.CssMediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaQueryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueryTerm(FlaskParser.CssMediaQueryTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframesRule(FlaskParser.CssKeyframesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframeBlock(FlaskParser.CssKeyframeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframeSelector(FlaskParser.CssKeyframeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssImportRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportRule(FlaskParser.CssImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssCharsetRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCharsetRule(FlaskParser.CssCharsetRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSupportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSupportsRule(FlaskParser.CssSupportsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSupportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSupportsCondition(FlaskParser.CssSupportsConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontFaceRule(FlaskParser.CssFontFaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssStylesheetInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheetInStyle(FlaskParser.CssStylesheetInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssItemInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssItemInStyle(FlaskParser.CssItemInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleInStyle(FlaskParser.CssRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSelectorListInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorListInStyle(FlaskParser.CssSelectorListInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorInStyle(FlaskParser.CssSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildCombInStyle(FlaskParser.ChildCombInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adjacentCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjacentCombInStyle(FlaskParser.AdjacentCombInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code siblingCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiblingCombInStyle(FlaskParser.SiblingCombInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSelectorWithModifiersInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelectorWithModifiersInStyle(FlaskParser.TypeSelectorWithModifiersInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justClassIdAttrPseudoInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustClassIdAttrPseudoInStyle(FlaskParser.JustClassIdAttrPseudoInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelectorInStyle(FlaskParser.TypeSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code universalSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalSelectorInStyle(FlaskParser.UniversalSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelectorInStyle(FlaskParser.ClassSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectorInStyle(FlaskParser.IdSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelectorHexInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectorHexInStyle(FlaskParser.IdSelectorHexInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelectorInStyle(FlaskParser.PseudoClassSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoElementSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElementSelectorInStyle(FlaskParser.PseudoElementSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSelectorInStyle(FlaskParser.AttrSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssAttrOperatorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAttrOperatorInStyle(FlaskParser.CssAttrOperatorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFunctionArgsInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionArgsInStyle(FlaskParser.CssFunctionArgsInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssDeclarationBlockInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationBlockInStyle(FlaskParser.CssDeclarationBlockInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssDeclarationInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationInStyle(FlaskParser.CssDeclarationInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssValueListInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueListInStyle(FlaskParser.CssValueListInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentValueInStyle(FlaskParser.IdentValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionValueInStyle(FlaskParser.DimensionValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValueInStyle(FlaskParser.NumberValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexColorValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorValueInStyle(FlaskParser.HexColorValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDqStringValueInStyle(FlaskParser.DqStringValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqStringValueInStyle(FlaskParser.SqStringValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlValueInStyle(FlaskParser.UrlValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValueInStyle(FlaskParser.VarValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashValueInStyle(FlaskParser.SlashValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValueInStyle(FlaskParser.CommaValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncValueInStyle(FlaskParser.FuncValueInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFunctionInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionInStyle(FlaskParser.CssFunctionInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssAtRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRuleInStyle(FlaskParser.CssAtRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaRuleInStyle(FlaskParser.CssMediaRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaQueryInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueryInStyle(FlaskParser.CssMediaQueryInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssMediaQueryTermInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueryTermInStyle(FlaskParser.CssMediaQueryTermInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframesRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframesRuleInStyle(FlaskParser.CssKeyframesRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframeBlockInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframeBlockInStyle(FlaskParser.CssKeyframeBlockInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssKeyframeSelectorInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyframeSelectorInStyle(FlaskParser.CssKeyframeSelectorInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssImportRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportRuleInStyle(FlaskParser.CssImportRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssCharsetRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCharsetRuleInStyle(FlaskParser.CssCharsetRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSupportsRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSupportsRuleInStyle(FlaskParser.CssSupportsRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssSupportsConditionInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSupportsConditionInStyle(FlaskParser.CssSupportsConditionInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#cssFontFaceRuleInStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontFaceRuleInStyle(FlaskParser.CssFontFaceRuleInStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2Statement(FlaskParser.J2StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ForStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ForStmt(FlaskParser.J2ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ForTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ForTarget(FlaskParser.J2ForTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2IfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2IfStmt(FlaskParser.J2IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ElifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ElifClause(FlaskParser.J2ElifClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ElseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ElseClause(FlaskParser.J2ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ExtendsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ExtendsStmt(FlaskParser.J2ExtendsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2BlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2BlockStmt(FlaskParser.J2BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2IncludeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2IncludeStmt(FlaskParser.J2IncludeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSetStmt(FlaskParser.SimpleSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSetStmt(FlaskParser.BlockSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2MacroStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2MacroStmt(FlaskParser.J2MacroStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2MacroArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2MacroArgs(FlaskParser.J2MacroArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2MacroArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2MacroArg(FlaskParser.J2MacroArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ImportStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ImportStmt(FlaskParser.J2ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2FromImportStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2FromImportStmt(FlaskParser.J2FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ImportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ImportName(FlaskParser.J2ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2WithStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2WithStmt(FlaskParser.J2WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2WithAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2WithAssignment(FlaskParser.J2WithAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2CallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2CallStmt(FlaskParser.J2CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2Variable(FlaskParser.J2VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarExpr(FlaskParser.J2VarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarPipeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarPipeExpr(FlaskParser.J2VarPipeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2Filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2Filter(FlaskParser.J2FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarArgList(FlaskParser.J2VarArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarOrExpr(FlaskParser.J2VarOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarAndExpr(FlaskParser.J2VarAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarNotOp}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarNotOp(FlaskParser.J2VarNotOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarComparePassThru(FlaskParser.J2VarComparePassThruContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarCompareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarCompareExpr(FlaskParser.J2VarCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarAddExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarAddExpr(FlaskParser.J2VarAddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarMulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarMulExpr(FlaskParser.J2VarMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarNeg}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarNeg(FlaskParser.J2VarNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarPos}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarPos(FlaskParser.J2VarPosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarPostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarPostfixPassThru(FlaskParser.J2VarPostfixPassThruContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarPostfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarPostfixExpr(FlaskParser.J2VarPostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarPostfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarPostfixSuffix(FlaskParser.J2VarPostfixSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarId}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarId(FlaskParser.J2VarIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarInt}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarInt(FlaskParser.J2VarIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarFloat}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarFloat(FlaskParser.J2VarFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarString}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarString(FlaskParser.J2VarStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarTrue}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarTrue(FlaskParser.J2VarTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarFalse}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarFalse(FlaskParser.J2VarFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarNone}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarNone(FlaskParser.J2VarNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarParen}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarParen(FlaskParser.J2VarParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarList}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarList(FlaskParser.J2VarListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2VarDict}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarDict(FlaskParser.J2VarDictContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2VarDictPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2VarDictPair(FlaskParser.J2VarDictPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2Expr(FlaskParser.J2ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2PipeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2PipeExpr(FlaskParser.J2PipeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2StmtFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2StmtFilter(FlaskParser.J2StmtFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2OrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2OrExpr(FlaskParser.J2OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2AndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2AndExpr(FlaskParser.J2AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2NotOp}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2NotOp(FlaskParser.J2NotOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2ComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ComparePassThru(FlaskParser.J2ComparePassThruContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2CompareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2CompareExpr(FlaskParser.J2CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2AddExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2AddExpr(FlaskParser.J2AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2MulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2MulExpr(FlaskParser.J2MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2NegExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2NegExpr(FlaskParser.J2NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2PosExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2PosExpr(FlaskParser.J2PosExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2PostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2PostfixPassThru(FlaskParser.J2PostfixPassThruContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2PostfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2PostfixExpr(FlaskParser.J2PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2PostfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2PostfixSuffix(FlaskParser.J2PostfixSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2ArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ArgList(FlaskParser.J2ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2Arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2Arg(FlaskParser.J2ArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2IdPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2IdPrimary(FlaskParser.J2IdPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2IntPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2IntPrimary(FlaskParser.J2IntPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2FloatPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2FloatPrimary(FlaskParser.J2FloatPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2StringPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2StringPrimary(FlaskParser.J2StringPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2TruePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2TruePrimary(FlaskParser.J2TruePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2FalsePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2FalsePrimary(FlaskParser.J2FalsePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2NonePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2NonePrimary(FlaskParser.J2NonePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2ParenExpr}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ParenExpr(FlaskParser.J2ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2ListLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2ListLiteral(FlaskParser.J2ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j2DictLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2DictLiteral(FlaskParser.J2DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2DictPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2DictPair(FlaskParser.J2DictPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#j2StringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ2StringLiteral(FlaskParser.J2StringLiteralContext ctx);
}