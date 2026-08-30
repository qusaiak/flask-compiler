// Generated from D:/compiler_project_finally/FlaskJinjaCompilerUnifiedDynamic/FlaskJinjaCompilerUnifiedDynamic/src/main/java/org/example/gen/FlaskParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlaskParser}.
 */
public interface FlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlaskParser#flaskTemplate}.
	 * @param ctx the parse tree
	 */
	void enterFlaskTemplate(FlaskParser.FlaskTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#flaskTemplate}.
	 * @param ctx the parse tree
	 */
	void exitFlaskTemplate(FlaskParser.FlaskTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementNode(FlaskParser.HtmlElementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElementNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementNode(FlaskParser.HtmlElementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2StmtNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterJ2StmtNode(FlaskParser.J2StmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2StmtNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitJ2StmtNode(FlaskParser.J2StmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarNode(FlaskParser.J2VarNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarNode(FlaskParser.J2VarNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2CommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterJ2CommentNode(FlaskParser.J2CommentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2CommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitJ2CommentNode(FlaskParser.J2CommentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doctypeNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeNode(FlaskParser.DoctypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doctypeNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeNode(FlaskParser.DoctypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlCommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentNode(FlaskParser.HtmlCommentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlCommentNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentNode(FlaskParser.HtmlCommentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlTextNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextNode(FlaskParser.HtmlTextNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlTextNode}
	 * labeled alternative in {@link FlaskParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextNode(FlaskParser.HtmlTextNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(FlaskParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(FlaskParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(FlaskParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(FlaskParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterCssElement(FlaskParser.CssElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssElement}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitCssElement(FlaskParser.CssElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptEl}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptEl(FlaskParser.ScriptElContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptEl}
	 * labeled alternative in {@link FlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptEl(FlaskParser.ScriptElContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(FlaskParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(FlaskParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(FlaskParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(FlaskParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#selfCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfCloseTag(FlaskParser.SelfCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#selfCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfCloseTag(FlaskParser.SelfCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(FlaskParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(FlaskParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(FlaskParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(FlaskParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FlaskParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FlaskParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterDqAttrVal(FlaskParser.DqAttrValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitDqAttrVal(FlaskParser.DqAttrValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterSqAttrVal(FlaskParser.SqAttrValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqAttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitSqAttrVal(FlaskParser.SqAttrValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2AttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterJ2AttrVal(FlaskParser.J2AttrValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2AttrVal}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitJ2AttrVal(FlaskParser.J2AttrValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2AttrValInTag}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterJ2AttrValInTag(FlaskParser.J2AttrValInTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2AttrValInTag}
	 * labeled alternative in {@link FlaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitJ2AttrValInTag(FlaskParser.J2AttrValInTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VariableInTag}.
	 * @param ctx the parse tree
	 */
	void enterJ2VariableInTag(FlaskParser.J2VariableInTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VariableInTag}.
	 * @param ctx the parse tree
	 */
	void exitJ2VariableInTag(FlaskParser.J2VariableInTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheet(FlaskParser.CssStylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheet(FlaskParser.CssStylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssItem}.
	 * @param ctx the parse tree
	 */
	void enterCssItem(FlaskParser.CssItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssItem}.
	 * @param ctx the parse tree
	 */
	void exitCssItem(FlaskParser.CssItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(FlaskParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(FlaskParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorList(FlaskParser.CssSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorList(FlaskParser.CssSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(FlaskParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(FlaskParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void enterChildComb(FlaskParser.ChildCombContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void exitChildComb(FlaskParser.ChildCombContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adjacentComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void enterAdjacentComb(FlaskParser.AdjacentCombContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adjacentComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void exitAdjacentComb(FlaskParser.AdjacentCombContext ctx);
	/**
	 * Enter a parse tree produced by the {@code siblingComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void enterSiblingComb(FlaskParser.SiblingCombContext ctx);
	/**
	 * Exit a parse tree produced by the {@code siblingComb}
	 * labeled alternative in {@link FlaskParser#cssCombinator}.
	 * @param ctx the parse tree
	 */
	void exitSiblingComb(FlaskParser.SiblingCombContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeselectorwithmodifiers}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeselectorwithmodifiers(FlaskParser.TypeselectorwithmodifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeselectorwithmodifiers}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeselectorwithmodifiers(FlaskParser.TypeselectorwithmodifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justClassIdAttrpseudowithouttype}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 */
	void enterJustClassIdAttrpseudowithouttype(FlaskParser.JustClassIdAttrpseudowithouttypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justClassIdAttrpseudowithouttype}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeq}.
	 * @param ctx the parse tree
	 */
	void exitJustClassIdAttrpseudowithouttype(FlaskParser.JustClassIdAttrpseudowithouttypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(FlaskParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(FlaskParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 */
	void enterUniversalSelector(FlaskParser.UniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link FlaskParser#cssBaseSelector}.
	 * @param ctx the parse tree
	 */
	void exitUniversalSelector(FlaskParser.UniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(FlaskParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(FlaskParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(FlaskParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(FlaskParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelectorHex}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectorHex(FlaskParser.IdSelectorHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelectorHex}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectorHex(FlaskParser.IdSelectorHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelector(FlaskParser.PseudoClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelector(FlaskParser.PseudoClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElementSelector(FlaskParser.PseudoElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElementSelector(FlaskParser.PseudoElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttrSelector(FlaskParser.AttrSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrSelector}
	 * labeled alternative in {@link FlaskParser#cssSubSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttrSelector(FlaskParser.AttrSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssAttrOperator}.
	 * @param ctx the parse tree
	 */
	void enterCssAttrOperator(FlaskParser.CssAttrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssAttrOperator}.
	 * @param ctx the parse tree
	 */
	void exitCssAttrOperator(FlaskParser.CssAttrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFunctionArgs}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionArgs(FlaskParser.CssFunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFunctionArgs}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionArgs(FlaskParser.CssFunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationBlock(FlaskParser.CssDeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationBlock(FlaskParser.CssDeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(FlaskParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(FlaskParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(FlaskParser.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(FlaskParser.CssValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentValue(FlaskParser.IdentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentValue(FlaskParser.IdentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterDimensionValue(FlaskParser.DimensionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitDimensionValue(FlaskParser.DimensionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(FlaskParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(FlaskParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterHexColorValue(FlaskParser.HexColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexColorValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitHexColorValue(FlaskParser.HexColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterDqStringValue(FlaskParser.DqStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitDqStringValue(FlaskParser.DqStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterSqStringValue(FlaskParser.SqStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqStringValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitSqStringValue(FlaskParser.SqStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterUrlValue(FlaskParser.UrlValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitUrlValue(FlaskParser.UrlValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(FlaskParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(FlaskParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterSlashValue(FlaskParser.SlashValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitSlashValue(FlaskParser.SlashValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCommaValue(FlaskParser.CommaValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCommaValue(FlaskParser.CommaValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterFuncValue(FlaskParser.FuncValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcValue}
	 * labeled alternative in {@link FlaskParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitFuncValue(FlaskParser.FuncValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(FlaskParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(FlaskParser.CssFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRule(FlaskParser.CssAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRule(FlaskParser.CssAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaRule}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaRule(FlaskParser.CssMediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaRule}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaRule(FlaskParser.CssMediaRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQuery(FlaskParser.CssMediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQuery(FlaskParser.CssMediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaQueryTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueryTerm(FlaskParser.CssMediaQueryTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaQueryTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueryTerm(FlaskParser.CssMediaQueryTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframesRule(FlaskParser.CssKeyframesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframesRule(FlaskParser.CssKeyframesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframeBlock(FlaskParser.CssKeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframeBlock(FlaskParser.CssKeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframeSelector(FlaskParser.CssKeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframeSelector(FlaskParser.CssKeyframeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssImportRule}.
	 * @param ctx the parse tree
	 */
	void enterCssImportRule(FlaskParser.CssImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssImportRule}.
	 * @param ctx the parse tree
	 */
	void exitCssImportRule(FlaskParser.CssImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssCharsetRule}.
	 * @param ctx the parse tree
	 */
	void enterCssCharsetRule(FlaskParser.CssCharsetRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssCharsetRule}.
	 * @param ctx the parse tree
	 */
	void exitCssCharsetRule(FlaskParser.CssCharsetRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSupportsRule}.
	 * @param ctx the parse tree
	 */
	void enterCssSupportsRule(FlaskParser.CssSupportsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSupportsRule}.
	 * @param ctx the parse tree
	 */
	void exitCssSupportsRule(FlaskParser.CssSupportsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSupportsCondition}.
	 * @param ctx the parse tree
	 */
	void enterCssSupportsCondition(FlaskParser.CssSupportsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSupportsCondition}.
	 * @param ctx the parse tree
	 */
	void exitCssSupportsCondition(FlaskParser.CssSupportsConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFontFaceRule}.
	 * @param ctx the parse tree
	 */
	void enterCssFontFaceRule(FlaskParser.CssFontFaceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFontFaceRule}.
	 * @param ctx the parse tree
	 */
	void exitCssFontFaceRule(FlaskParser.CssFontFaceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssStylesheetInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheetInStyle(FlaskParser.CssStylesheetInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssStylesheetInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheetInStyle(FlaskParser.CssStylesheetInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssItemInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssItemInStyle(FlaskParser.CssItemInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssItemInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssItemInStyle(FlaskParser.CssItemInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleInStyle(FlaskParser.CssRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleInStyle(FlaskParser.CssRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSelectorListInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorListInStyle(FlaskParser.CssSelectorListInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSelectorListInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorListInStyle(FlaskParser.CssSelectorListInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorInStyle(FlaskParser.CssSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorInStyle(FlaskParser.CssSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterChildCombInStyle(FlaskParser.ChildCombInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitChildCombInStyle(FlaskParser.ChildCombInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adjacentCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterAdjacentCombInStyle(FlaskParser.AdjacentCombInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adjacentCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitAdjacentCombInStyle(FlaskParser.AdjacentCombInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code siblingCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterSiblingCombInStyle(FlaskParser.SiblingCombInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code siblingCombInStyle}
	 * labeled alternative in {@link FlaskParser#cssCombinatorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitSiblingCombInStyle(FlaskParser.SiblingCombInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelectorWithModifiersInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelectorWithModifiersInStyle(FlaskParser.TypeSelectorWithModifiersInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelectorWithModifiersInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelectorWithModifiersInStyle(FlaskParser.TypeSelectorWithModifiersInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justClassIdAttrPseudoInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 */
	void enterJustClassIdAttrPseudoInStyle(FlaskParser.JustClassIdAttrPseudoInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justClassIdAttrPseudoInStyle}
	 * labeled alternative in {@link FlaskParser#cssSimpleSelectorSeqInStyle}.
	 * @param ctx the parse tree
	 */
	void exitJustClassIdAttrPseudoInStyle(FlaskParser.JustClassIdAttrPseudoInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelectorInStyle(FlaskParser.TypeSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelectorInStyle(FlaskParser.TypeSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code universalSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterUniversalSelectorInStyle(FlaskParser.UniversalSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code universalSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssBaseSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitUniversalSelectorInStyle(FlaskParser.UniversalSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterClassSelectorInStyle(FlaskParser.ClassSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitClassSelectorInStyle(FlaskParser.ClassSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectorInStyle(FlaskParser.IdSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectorInStyle(FlaskParser.IdSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelectorHexInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectorHexInStyle(FlaskParser.IdSelectorHexInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelectorHexInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectorHexInStyle(FlaskParser.IdSelectorHexInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelectorInStyle(FlaskParser.PseudoClassSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelectorInStyle(FlaskParser.PseudoClassSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoElementSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElementSelectorInStyle(FlaskParser.PseudoElementSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoElementSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElementSelectorInStyle(FlaskParser.PseudoElementSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterAttrSelectorInStyle(FlaskParser.AttrSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrSelectorInStyle}
	 * labeled alternative in {@link FlaskParser#cssSubSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitAttrSelectorInStyle(FlaskParser.AttrSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssAttrOperatorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssAttrOperatorInStyle(FlaskParser.CssAttrOperatorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssAttrOperatorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssAttrOperatorInStyle(FlaskParser.CssAttrOperatorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFunctionArgsInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionArgsInStyle(FlaskParser.CssFunctionArgsInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFunctionArgsInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionArgsInStyle(FlaskParser.CssFunctionArgsInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssDeclarationBlockInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationBlockInStyle(FlaskParser.CssDeclarationBlockInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssDeclarationBlockInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationBlockInStyle(FlaskParser.CssDeclarationBlockInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssDeclarationInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationInStyle(FlaskParser.CssDeclarationInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssDeclarationInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationInStyle(FlaskParser.CssDeclarationInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssValueListInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssValueListInStyle(FlaskParser.CssValueListInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssValueListInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssValueListInStyle(FlaskParser.CssValueListInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterIdentValueInStyle(FlaskParser.IdentValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitIdentValueInStyle(FlaskParser.IdentValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterDimensionValueInStyle(FlaskParser.DimensionValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitDimensionValueInStyle(FlaskParser.DimensionValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterNumberValueInStyle(FlaskParser.NumberValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitNumberValueInStyle(FlaskParser.NumberValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexColorValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterHexColorValueInStyle(FlaskParser.HexColorValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexColorValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitHexColorValueInStyle(FlaskParser.HexColorValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterDqStringValueInStyle(FlaskParser.DqStringValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitDqStringValueInStyle(FlaskParser.DqStringValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterSqStringValueInStyle(FlaskParser.SqStringValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqStringValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitSqStringValueInStyle(FlaskParser.SqStringValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urlValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterUrlValueInStyle(FlaskParser.UrlValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urlValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitUrlValueInStyle(FlaskParser.UrlValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterVarValueInStyle(FlaskParser.VarValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitVarValueInStyle(FlaskParser.VarValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterSlashValueInStyle(FlaskParser.SlashValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitSlashValueInStyle(FlaskParser.SlashValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCommaValueInStyle(FlaskParser.CommaValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCommaValueInStyle(FlaskParser.CommaValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void enterFuncValueInStyle(FlaskParser.FuncValueInStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcValueInStyle}
	 * labeled alternative in {@link FlaskParser#cssValueInStyle}.
	 * @param ctx the parse tree
	 */
	void exitFuncValueInStyle(FlaskParser.FuncValueInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFunctionInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionInStyle(FlaskParser.CssFunctionInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFunctionInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionInStyle(FlaskParser.CssFunctionInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssAtRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRuleInStyle(FlaskParser.CssAtRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssAtRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRuleInStyle(FlaskParser.CssAtRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaRuleInStyle(FlaskParser.CssMediaRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaRuleInStyle(FlaskParser.CssMediaRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaQueryInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueryInStyle(FlaskParser.CssMediaQueryInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaQueryInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueryInStyle(FlaskParser.CssMediaQueryInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssMediaQueryTermInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueryTermInStyle(FlaskParser.CssMediaQueryTermInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssMediaQueryTermInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueryTermInStyle(FlaskParser.CssMediaQueryTermInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframesRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframesRuleInStyle(FlaskParser.CssKeyframesRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframesRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframesRuleInStyle(FlaskParser.CssKeyframesRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframeBlockInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframeBlockInStyle(FlaskParser.CssKeyframeBlockInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframeBlockInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframeBlockInStyle(FlaskParser.CssKeyframeBlockInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssKeyframeSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyframeSelectorInStyle(FlaskParser.CssKeyframeSelectorInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssKeyframeSelectorInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyframeSelectorInStyle(FlaskParser.CssKeyframeSelectorInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssImportRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssImportRuleInStyle(FlaskParser.CssImportRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssImportRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssImportRuleInStyle(FlaskParser.CssImportRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssCharsetRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssCharsetRuleInStyle(FlaskParser.CssCharsetRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssCharsetRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssCharsetRuleInStyle(FlaskParser.CssCharsetRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSupportsRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssSupportsRuleInStyle(FlaskParser.CssSupportsRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSupportsRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssSupportsRuleInStyle(FlaskParser.CssSupportsRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssSupportsConditionInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssSupportsConditionInStyle(FlaskParser.CssSupportsConditionInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssSupportsConditionInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssSupportsConditionInStyle(FlaskParser.CssSupportsConditionInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#cssFontFaceRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssFontFaceRuleInStyle(FlaskParser.CssFontFaceRuleInStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#cssFontFaceRuleInStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssFontFaceRuleInStyle(FlaskParser.CssFontFaceRuleInStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2Statement}.
	 * @param ctx the parse tree
	 */
	void enterJ2Statement(FlaskParser.J2StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2Statement}.
	 * @param ctx the parse tree
	 */
	void exitJ2Statement(FlaskParser.J2StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ForStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2ForStmt(FlaskParser.J2ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ForStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2ForStmt(FlaskParser.J2ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ForTarget}.
	 * @param ctx the parse tree
	 */
	void enterJ2ForTarget(FlaskParser.J2ForTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ForTarget}.
	 * @param ctx the parse tree
	 */
	void exitJ2ForTarget(FlaskParser.J2ForTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2IfStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2IfStmt(FlaskParser.J2IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2IfStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2IfStmt(FlaskParser.J2IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ElifClause}.
	 * @param ctx the parse tree
	 */
	void enterJ2ElifClause(FlaskParser.J2ElifClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ElifClause}.
	 * @param ctx the parse tree
	 */
	void exitJ2ElifClause(FlaskParser.J2ElifClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ElseClause}.
	 * @param ctx the parse tree
	 */
	void enterJ2ElseClause(FlaskParser.J2ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ElseClause}.
	 * @param ctx the parse tree
	 */
	void exitJ2ElseClause(FlaskParser.J2ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ExtendsStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2ExtendsStmt(FlaskParser.J2ExtendsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ExtendsStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2ExtendsStmt(FlaskParser.J2ExtendsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2BlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2BlockStmt(FlaskParser.J2BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2BlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2BlockStmt(FlaskParser.J2BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2IncludeStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2IncludeStmt(FlaskParser.J2IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2IncludeStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2IncludeStmt(FlaskParser.J2IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSetStmt(FlaskParser.SimpleSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSetStmt(FlaskParser.SimpleSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockSetStmt(FlaskParser.BlockSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockSetStmt}
	 * labeled alternative in {@link FlaskParser#j2SetStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockSetStmt(FlaskParser.BlockSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2MacroStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2MacroStmt(FlaskParser.J2MacroStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2MacroStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2MacroStmt(FlaskParser.J2MacroStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2MacroArgs}.
	 * @param ctx the parse tree
	 */
	void enterJ2MacroArgs(FlaskParser.J2MacroArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2MacroArgs}.
	 * @param ctx the parse tree
	 */
	void exitJ2MacroArgs(FlaskParser.J2MacroArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2MacroArg}.
	 * @param ctx the parse tree
	 */
	void enterJ2MacroArg(FlaskParser.J2MacroArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2MacroArg}.
	 * @param ctx the parse tree
	 */
	void exitJ2MacroArg(FlaskParser.J2MacroArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ImportStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2ImportStmt(FlaskParser.J2ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ImportStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2ImportStmt(FlaskParser.J2ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2FromImportStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2FromImportStmt(FlaskParser.J2FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2FromImportStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2FromImportStmt(FlaskParser.J2FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ImportName}.
	 * @param ctx the parse tree
	 */
	void enterJ2ImportName(FlaskParser.J2ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ImportName}.
	 * @param ctx the parse tree
	 */
	void exitJ2ImportName(FlaskParser.J2ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2WithStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2WithStmt(FlaskParser.J2WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2WithStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2WithStmt(FlaskParser.J2WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2WithAssignment}.
	 * @param ctx the parse tree
	 */
	void enterJ2WithAssignment(FlaskParser.J2WithAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2WithAssignment}.
	 * @param ctx the parse tree
	 */
	void exitJ2WithAssignment(FlaskParser.J2WithAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2CallStmt}.
	 * @param ctx the parse tree
	 */
	void enterJ2CallStmt(FlaskParser.J2CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2CallStmt}.
	 * @param ctx the parse tree
	 */
	void exitJ2CallStmt(FlaskParser.J2CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2Variable}.
	 * @param ctx the parse tree
	 */
	void enterJ2Variable(FlaskParser.J2VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2Variable}.
	 * @param ctx the parse tree
	 */
	void exitJ2Variable(FlaskParser.J2VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarExpr(FlaskParser.J2VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarExpr(FlaskParser.J2VarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarPipeExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarPipeExpr(FlaskParser.J2VarPipeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarPipeExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarPipeExpr(FlaskParser.J2VarPipeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2Filter}.
	 * @param ctx the parse tree
	 */
	void enterJ2Filter(FlaskParser.J2FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2Filter}.
	 * @param ctx the parse tree
	 */
	void exitJ2Filter(FlaskParser.J2FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarArgList}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarArgList(FlaskParser.J2VarArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarArgList}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarArgList(FlaskParser.J2VarArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarOrExpr(FlaskParser.J2VarOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarOrExpr(FlaskParser.J2VarOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarAndExpr(FlaskParser.J2VarAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarAndExpr(FlaskParser.J2VarAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarNotOp}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarNotOp(FlaskParser.J2VarNotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarNotOp}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarNotOp(FlaskParser.J2VarNotOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarComparePassThru(FlaskParser.J2VarComparePassThruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2VarNotExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarComparePassThru(FlaskParser.J2VarComparePassThruContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarCompareExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarCompareExpr(FlaskParser.J2VarCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarCompareExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarCompareExpr(FlaskParser.J2VarCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarAddExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarAddExpr(FlaskParser.J2VarAddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarAddExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarAddExpr(FlaskParser.J2VarAddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarMulExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarMulExpr(FlaskParser.J2VarMulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarMulExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarMulExpr(FlaskParser.J2VarMulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarNeg}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarNeg(FlaskParser.J2VarNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarNeg}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarNeg(FlaskParser.J2VarNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarPos}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarPos(FlaskParser.J2VarPosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarPos}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarPos(FlaskParser.J2VarPosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarPostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarPostfixPassThru(FlaskParser.J2VarPostfixPassThruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarPostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2VarUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarPostfixPassThru(FlaskParser.J2VarPostfixPassThruContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarPostfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarPostfixExpr(FlaskParser.J2VarPostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarPostfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarPostfixExpr(FlaskParser.J2VarPostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarPostfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarPostfixSuffix(FlaskParser.J2VarPostfixSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarPostfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarPostfixSuffix(FlaskParser.J2VarPostfixSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarId}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarId(FlaskParser.J2VarIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarId}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarId(FlaskParser.J2VarIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarInt}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarInt(FlaskParser.J2VarIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarInt}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarInt(FlaskParser.J2VarIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarFloat}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarFloat(FlaskParser.J2VarFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarFloat}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarFloat(FlaskParser.J2VarFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarString}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarString(FlaskParser.J2VarStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarString}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarString(FlaskParser.J2VarStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarTrue}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarTrue(FlaskParser.J2VarTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarTrue}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarTrue(FlaskParser.J2VarTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarFalse}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarFalse(FlaskParser.J2VarFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarFalse}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarFalse(FlaskParser.J2VarFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarNone}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarNone(FlaskParser.J2VarNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarNone}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarNone(FlaskParser.J2VarNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarParen}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarParen(FlaskParser.J2VarParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarParen}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarParen(FlaskParser.J2VarParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarList}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarList(FlaskParser.J2VarListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarList}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarList(FlaskParser.J2VarListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2VarDict}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarDict(FlaskParser.J2VarDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2VarDict}
	 * labeled alternative in {@link FlaskParser#j2VarPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarDict(FlaskParser.J2VarDictContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2VarDictPair}.
	 * @param ctx the parse tree
	 */
	void enterJ2VarDictPair(FlaskParser.J2VarDictPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2VarDictPair}.
	 * @param ctx the parse tree
	 */
	void exitJ2VarDictPair(FlaskParser.J2VarDictPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2Expr}.
	 * @param ctx the parse tree
	 */
	void enterJ2Expr(FlaskParser.J2ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2Expr}.
	 * @param ctx the parse tree
	 */
	void exitJ2Expr(FlaskParser.J2ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2PipeExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2PipeExpr(FlaskParser.J2PipeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2PipeExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2PipeExpr(FlaskParser.J2PipeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2StmtFilter}.
	 * @param ctx the parse tree
	 */
	void enterJ2StmtFilter(FlaskParser.J2StmtFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2StmtFilter}.
	 * @param ctx the parse tree
	 */
	void exitJ2StmtFilter(FlaskParser.J2StmtFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2OrExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2OrExpr(FlaskParser.J2OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2OrExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2OrExpr(FlaskParser.J2OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2AndExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2AndExpr(FlaskParser.J2AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2AndExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2AndExpr(FlaskParser.J2AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2NotOp}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2NotOp(FlaskParser.J2NotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2NotOp}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2NotOp(FlaskParser.J2NotOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2ComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2ComparePassThru(FlaskParser.J2ComparePassThruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2ComparePassThru}
	 * labeled alternative in {@link FlaskParser#j2NotExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2ComparePassThru(FlaskParser.J2ComparePassThruContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2CompareExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2CompareExpr(FlaskParser.J2CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2CompareExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2CompareExpr(FlaskParser.J2CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2AddExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2AddExpr(FlaskParser.J2AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2AddExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2AddExpr(FlaskParser.J2AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2MulExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2MulExpr(FlaskParser.J2MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2MulExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2MulExpr(FlaskParser.J2MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2NegExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2NegExpr(FlaskParser.J2NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2NegExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2NegExpr(FlaskParser.J2NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2PosExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2PosExpr(FlaskParser.J2PosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2PosExpr}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2PosExpr(FlaskParser.J2PosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2PostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2PostfixPassThru(FlaskParser.J2PostfixPassThruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2PostfixPassThru}
	 * labeled alternative in {@link FlaskParser#j2UnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2PostfixPassThru(FlaskParser.J2PostfixPassThruContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2PostfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterJ2PostfixExpr(FlaskParser.J2PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2PostfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitJ2PostfixExpr(FlaskParser.J2PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2PostfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterJ2PostfixSuffix(FlaskParser.J2PostfixSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2PostfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitJ2PostfixSuffix(FlaskParser.J2PostfixSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2ArgList}.
	 * @param ctx the parse tree
	 */
	void enterJ2ArgList(FlaskParser.J2ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2ArgList}.
	 * @param ctx the parse tree
	 */
	void exitJ2ArgList(FlaskParser.J2ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2Arg}.
	 * @param ctx the parse tree
	 */
	void enterJ2Arg(FlaskParser.J2ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2Arg}.
	 * @param ctx the parse tree
	 */
	void exitJ2Arg(FlaskParser.J2ArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2IdPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2IdPrimary(FlaskParser.J2IdPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2IdPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2IdPrimary(FlaskParser.J2IdPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2IntPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2IntPrimary(FlaskParser.J2IntPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2IntPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2IntPrimary(FlaskParser.J2IntPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2FloatPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2FloatPrimary(FlaskParser.J2FloatPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2FloatPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2FloatPrimary(FlaskParser.J2FloatPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2StringPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2StringPrimary(FlaskParser.J2StringPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2StringPrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2StringPrimary(FlaskParser.J2StringPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2TruePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2TruePrimary(FlaskParser.J2TruePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2TruePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2TruePrimary(FlaskParser.J2TruePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2FalsePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2FalsePrimary(FlaskParser.J2FalsePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2FalsePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2FalsePrimary(FlaskParser.J2FalsePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2NonePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2NonePrimary(FlaskParser.J2NonePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2NonePrimary}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2NonePrimary(FlaskParser.J2NonePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2ParenExpr}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2ParenExpr(FlaskParser.J2ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2ParenExpr}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2ParenExpr(FlaskParser.J2ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2ListLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2ListLiteral(FlaskParser.J2ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2ListLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2ListLiteral(FlaskParser.J2ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j2DictLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void enterJ2DictLiteral(FlaskParser.J2DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j2DictLiteral}
	 * labeled alternative in {@link FlaskParser#j2Primary}.
	 * @param ctx the parse tree
	 */
	void exitJ2DictLiteral(FlaskParser.J2DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2DictPair}.
	 * @param ctx the parse tree
	 */
	void enterJ2DictPair(FlaskParser.J2DictPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2DictPair}.
	 * @param ctx the parse tree
	 */
	void exitJ2DictPair(FlaskParser.J2DictPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#j2StringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJ2StringLiteral(FlaskParser.J2StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#j2StringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJ2StringLiteral(FlaskParser.J2StringLiteralContext ctx);
}