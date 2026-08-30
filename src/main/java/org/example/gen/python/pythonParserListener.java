// Generated from pythonParser.g4 by ANTLR 4.13.1
package org.example.gen.python;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(pythonParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(pythonParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(pythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(pythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#fromImportStmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(pythonParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#fromImportStmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(pythonParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#importNames}.
	 * @param ctx the parse tree
	 */
	void enterImportNames(pythonParser.ImportNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#importNames}.
	 * @param ctx the parse tree
	 */
	void exitImportNames(pythonParser.ImportNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(pythonParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(pythonParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(pythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(pythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(pythonParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(pythonParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#augAssignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignStmt(pythonParser.AugAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#augAssignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignStmt(pythonParser.AugAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(pythonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(pythonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(pythonParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(pythonParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(pythonParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(pythonParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(pythonParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(pythonParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStmt(pythonParser.NonlocalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStmt(pythonParser.NonlocalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#passStmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(pythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#passStmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(pythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(pythonParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(pythonParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(pythonParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(pythonParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(pythonParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(pythonParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(pythonParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(pythonParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decoratedDef}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedDef(pythonParser.DecoratedDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decoratedDef}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedDef(pythonParser.DecoratedDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(pythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(pythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#asyncFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterAsyncFuncDef(pythonParser.AsyncFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#asyncFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitAsyncFuncDef(pythonParser.AsyncFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(pythonParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(pythonParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(pythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(pythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 */
	void enterKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 */
	void exitKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(pythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(pythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#baseList}.
	 * @param ctx the parse tree
	 */
	void enterBaseList(pythonParser.BaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#baseList}.
	 * @param ctx the parse tree
	 */
	void exitBaseList(pythonParser.BaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(pythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(pythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#withItem}.
	 * @param ctx the parse tree
	 */
	void enterWithItem(pythonParser.WithItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#withItem}.
	 * @param ctx the parse tree
	 */
	void exitWithItem(pythonParser.WithItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(pythonParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(pythonParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#exceptClause}.
	 * @param ctx the parse tree
	 */
	void enterExceptClause(pythonParser.ExceptClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#exceptClause}.
	 * @param ctx the parse tree
	 */
	void exitExceptClause(pythonParser.ExceptClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(pythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(pythonParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(pythonParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(pythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(pythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(pythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(pythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(pythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(pythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(pythonParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(pythonParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArith(pythonParser.ArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArith(pythonParser.ArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(pythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(pythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#awaitExpr}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpr(pythonParser.AwaitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#awaitExpr}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpr(pythonParser.AwaitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 */
	void enterComprehension(pythonParser.ComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 */
	void exitComprehension(pythonParser.ComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(pythonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(pythonParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictComprehension}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 */
	void enterDictComprehension(pythonParser.DictComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictComprehension}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 */
	void exitDictComprehension(pythonParser.DictComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictLiteral}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(pythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictLiteral}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(pythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compFor}.
	 * @param ctx the parse tree
	 */
	void enterCompFor(pythonParser.CompForContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compFor}.
	 * @param ctx the parse tree
	 */
	void exitCompFor(pythonParser.CompForContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compIf}.
	 * @param ctx the parse tree
	 */
	void enterCompIf(pythonParser.CompIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compIf}.
	 * @param ctx the parse tree
	 */
	void exitCompIf(pythonParser.CompIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void enterDictItem(pythonParser.DictItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void exitDictItem(pythonParser.DictItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(pythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(pythonParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(pythonParser.ArgumentContext ctx);
}