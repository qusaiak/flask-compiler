// Generated from pythonParser.g4 by ANTLR 4.13.1
package org.example.gen.python;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(pythonParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(pythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#fromImportStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(pythonParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#importNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNames(pythonParser.ImportNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(pythonParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(pythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(pythonParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#augAssignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignStmt(pythonParser.AugAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(pythonParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(pythonParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(pythonParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#globalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(pythonParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocalStmt(pythonParser.NonlocalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#passStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStmt(pythonParser.PassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStmt(pythonParser.RaiseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(pythonParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(pythonParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(pythonParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decoratedDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedDef(pythonParser.DecoratedDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(pythonParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#asyncFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncFuncDef(pythonParser.AsyncFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(pythonParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(pythonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(pythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#baseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseList(pythonParser.BaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(pythonParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#withItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItem(pythonParser.WithItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(pythonParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#exceptClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptClause(pythonParser.ExceptClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pythonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(pythonParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(pythonParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(pythonParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(pythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(pythonParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith(pythonParser.ArithContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(pythonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(pythonParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(pythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#awaitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpr(pythonParser.AwaitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(pythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehension(pythonParser.ComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link pythonParser#listContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(pythonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictComprehension}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictComprehension(pythonParser.DictComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictLiteral}
	 * labeled alternative in {@link pythonParser#dictContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(pythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompFor(pythonParser.CompForContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompIf(pythonParser.CompIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dictItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictItem(pythonParser.DictItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(pythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(pythonParser.ArgumentContext ctx);
}