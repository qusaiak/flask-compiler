
    package org.example.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FlaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PERCENT=2, CSS_COMMENT=3, CSS_AT_MEDIA=4, CSS_AT_KEYFRAMES=5, CSS_AT_IMPORT=6, 
		CSS_AT_CHARSET=7, CSS_AT_SUPPORTS=8, CSS_AT_FONT_FACE=9, CSS_LBRACE=10, 
		CSS_RBRACE=11, CSS_SEMICOLON=12, CSS_DCOLON=13, CSS_COLON=14, CSS_COMMA=15, 
		CSS_STAR=16, CSS_GT=17, CSS_PLUS=18, CSS_TILDE_SEL=19, CSS_SLASH=20, CSS_LPAREN=21, 
		CSS_RPAREN=22, CSS_LBRACKET=23, CSS_RBRACKET=24, CSS_ASSIGN=25, CSS_PIPE=26, 
		CSS_CARET=27, CSS_IMPORTANT=28, CSS_HEX_COLOR=29, CSS_HASH=30, CSS_DOT=31, 
		CSS_DIMENSION=32, CSS_NUMBER=33, CSS_URL=34, CSS_VAR=35, CSS_STRING_DQ=36, 
		CSS_STRING_SQ=37, CSS_IDENT=38, JINJA_STMT_OPEN=39, JINJA_VAR_OPEN=40, 
		JINJA_COMMENT=41, HTML_DOCTYPE=42, HTML_COMMENT=43, STYLE_OPEN=44, SCRIPT_OPEN=45, 
		HTML_OPEN_TAG=46, HTML_CLOSE_TAG=47, HTML_TEXT=48, TAG_WS=49, ATTR_NAME=50, 
		ATTR_EQ=51, ATTR_VAL_DQ=52, ATTR_VAL_SQ=53, TAG_JINJA_VAR_OPEN=54, TAG_JINJA_STMT_OPEN=55, 
		TAG_SELF_CLOSE=56, TAG_CLOSE=57, CSS_MODE_WS=58, STYLE_CLOSE=59, CSS_MODE_COMMENT=60, 
		CSS_MODE_AT_MEDIA=61, CSS_MODE_AT_KEYFRAMES=62, CSS_MODE_AT_IMPORT=63, 
		CSS_MODE_AT_CHARSET=64, CSS_MODE_AT_SUPPORTS=65, CSS_MODE_AT_FONT_FACE=66, 
		CSS_MODE_LBRACE=67, CSS_MODE_RBRACE=68, CSS_MODE_SEMICOLON=69, CSS_MODE_DCOLON=70, 
		CSS_MODE_COLON=71, CSS_MODE_COMMA=72, CSS_MODE_STAR=73, CSS_MODE_GT=74, 
		CSS_MODE_PLUS=75, CSS_MODE_TILDE_SEL=76, CSS_MODE_SLASH=77, CSS_MODE_LPAREN=78, 
		CSS_MODE_RPAREN=79, CSS_MODE_LBRACKET=80, CSS_MODE_RBRACKET=81, CSS_MODE_ASSIGN=82, 
		CSS_MODE_PIPE=83, CSS_MODE_CARET=84, CSS_MODE_IMPORTANT=85, CSS_MODE_HEX_COLOR=86, 
		CSS_MODE_HASH=87, CSS_MODE_DOT=88, CSS_MODE_DIMENSION=89, CSS_MODE_NUMBER=90, 
		CSS_MODE_URL=91, CSS_MODE_VAR=92, CSS_MODE_STRING_DQ=93, CSS_MODE_STRING_SQ=94, 
		CSS_MODE_IDENT=95, SCRIPT_WS=96, SCRIPT_CLOSE=97, SCRIPT_TEXT=98, SCRIPT_LT=99, 
		J2S_WS=100, JINJA_STMT_CLOSE=101, J2S_FOR=102, J2S_ENDFOR=103, J2S_IF=104, 
		J2S_ELIF=105, J2S_ELSE=106, J2S_ENDIF=107, J2S_EXTENDS=108, J2S_BLOCK=109, 
		J2S_ENDBLOCK=110, J2S_INCLUDE=111, J2S_IMPORT=112, J2S_FROM=113, J2S_AS=114, 
		J2S_IN=115, J2S_SET=116, J2S_ENDSET=117, J2S_WITH=118, J2S_ENDWITH=119, 
		J2S_MACRO=120, J2S_ENDMACRO=121, J2S_CALL=122, J2S_ENDCALL=123, J2S_NOT=124, 
		J2S_AND=125, J2S_OR=126, J2S_IS=127, J2S_RECURSIVE=128, J2S_IGNORE_MISSING=129, 
		J2S_TRUE=130, J2S_FALSE=131, J2S_NONE=132, J2S_EQ=133, J2S_NEQ=134, J2S_LTE=135, 
		J2S_GTE=136, J2S_DSTAR=137, J2S_LT=138, J2S_GT=139, J2S_PLUS=140, J2S_MINUS=141, 
		J2S_STAR=142, J2S_SLASH=143, J2S_PERCENT=144, J2S_TILDE=145, J2S_PIPE=146, 
		J2S_ASSIGN=147, J2S_DOT=148, J2S_COMMA=149, J2S_COLON=150, J2S_LPAREN=151, 
		J2S_RPAREN=152, J2S_LBRACKET=153, J2S_RBRACKET=154, J2S_LBRACE=155, J2S_RBRACE=156, 
		J2S_STRING=157, J2S_FLOAT=158, J2S_INT=159, J2S_ID=160, J2V_WS=161, JINJA_VAR_CLOSE=162, 
		J2V_NOT=163, J2V_AND=164, J2V_OR=165, J2V_IN=166, J2V_IS=167, J2V_TRUE=168, 
		J2V_FALSE=169, J2V_NONE=170, J2V_EQ=171, J2V_NEQ=172, J2V_LTE=173, J2V_GTE=174, 
		J2V_DSTAR=175, J2V_LT=176, J2V_GT=177, J2V_PLUS=178, J2V_MINUS=179, J2V_STAR=180, 
		J2V_SLASH=181, J2V_PERCENT=182, J2V_TILDE=183, J2V_PIPE=184, J2V_DOT=185, 
		J2V_COMMA=186, J2V_COLON=187, J2V_LPAREN=188, J2V_RPAREN=189, J2V_LBRACKET=190, 
		J2V_RBRACKET=191, J2V_LBRACE=192, J2V_RBRACE=193, J2V_STRING=194, J2V_FLOAT=195, 
		J2V_INT=196, J2V_ID=197;
	public static final int
		RULE_flaskTemplate = 0, RULE_htmlNode = 1, RULE_htmlElement = 2, RULE_openTag = 3, 
		RULE_closeTag = 4, RULE_selfCloseTag = 5, RULE_styleElement = 6, RULE_scriptElement = 7, 
		RULE_attribute = 8, RULE_attrValue = 9, RULE_j2VariableInTag = 10, RULE_cssStylesheet = 11, 
		RULE_cssItem = 12, RULE_cssRule = 13, RULE_cssSelectorList = 14, RULE_cssSelector = 15, 
		RULE_cssCombinator = 16, RULE_cssSimpleSelectorSeq = 17, RULE_cssBaseSelector = 18, 
		RULE_cssSubSelector = 19, RULE_cssAttrOperator = 20, RULE_cssFunctionArgs = 21, 
		RULE_cssDeclarationBlock = 22, RULE_cssDeclaration = 23, RULE_cssValueList = 24, 
		RULE_cssValue = 25, RULE_cssFunction = 26, RULE_cssAtRule = 27, RULE_cssMediaRule = 28, 
		RULE_cssMediaQuery = 29, RULE_cssMediaQueryTerm = 30, RULE_cssKeyframesRule = 31, 
		RULE_cssKeyframeBlock = 32, RULE_cssKeyframeSelector = 33, RULE_cssImportRule = 34, 
		RULE_cssCharsetRule = 35, RULE_cssSupportsRule = 36, RULE_cssSupportsCondition = 37, 
		RULE_cssFontFaceRule = 38, RULE_cssStylesheetInStyle = 39, RULE_cssItemInStyle = 40, 
		RULE_cssRuleInStyle = 41, RULE_cssSelectorListInStyle = 42, RULE_cssSelectorInStyle = 43, 
		RULE_cssCombinatorInStyle = 44, RULE_cssSimpleSelectorSeqInStyle = 45, 
		RULE_cssBaseSelectorInStyle = 46, RULE_cssSubSelectorInStyle = 47, RULE_cssAttrOperatorInStyle = 48, 
		RULE_cssFunctionArgsInStyle = 49, RULE_cssDeclarationBlockInStyle = 50, 
		RULE_cssDeclarationInStyle = 51, RULE_cssValueListInStyle = 52, RULE_cssValueInStyle = 53, 
		RULE_cssFunctionInStyle = 54, RULE_cssAtRuleInStyle = 55, RULE_cssMediaRuleInStyle = 56, 
		RULE_cssMediaQueryInStyle = 57, RULE_cssMediaQueryTermInStyle = 58, RULE_cssKeyframesRuleInStyle = 59, 
		RULE_cssKeyframeBlockInStyle = 60, RULE_cssKeyframeSelectorInStyle = 61, 
		RULE_cssImportRuleInStyle = 62, RULE_cssCharsetRuleInStyle = 63, RULE_cssSupportsRuleInStyle = 64, 
		RULE_cssSupportsConditionInStyle = 65, RULE_cssFontFaceRuleInStyle = 66, 
		RULE_j2Statement = 67, RULE_j2ForStmt = 68, RULE_j2ForTarget = 69, RULE_j2IfStmt = 70, 
		RULE_j2ElifClause = 71, RULE_j2ElseClause = 72, RULE_j2ExtendsStmt = 73, 
		RULE_j2BlockStmt = 74, RULE_j2IncludeStmt = 75, RULE_j2SetStmt = 76, RULE_j2MacroStmt = 77, 
		RULE_j2MacroArgs = 78, RULE_j2MacroArg = 79, RULE_j2ImportStmt = 80, RULE_j2FromImportStmt = 81, 
		RULE_j2ImportName = 82, RULE_j2WithStmt = 83, RULE_j2WithAssignment = 84, 
		RULE_j2CallStmt = 85, RULE_j2Variable = 86, RULE_j2VarExpr = 87, RULE_j2VarPipeExpr = 88, 
		RULE_j2Filter = 89, RULE_j2VarArgList = 90, RULE_j2VarOrExpr = 91, RULE_j2VarAndExpr = 92, 
		RULE_j2VarNotExpr = 93, RULE_j2VarCompareExpr = 94, RULE_j2VarAddExpr = 95, 
		RULE_j2VarMulExpr = 96, RULE_j2VarUnaryExpr = 97, RULE_j2VarPostfixExpr = 98, 
		RULE_j2VarPostfixSuffix = 99, RULE_j2VarPrimary = 100, RULE_j2VarDictPair = 101, 
		RULE_j2Expr = 102, RULE_j2PipeExpr = 103, RULE_j2StmtFilter = 104, RULE_j2OrExpr = 105, 
		RULE_j2AndExpr = 106, RULE_j2NotExpr = 107, RULE_j2CompareExpr = 108, 
		RULE_j2AddExpr = 109, RULE_j2MulExpr = 110, RULE_j2UnaryExpr = 111, RULE_j2PostfixExpr = 112, 
		RULE_j2PostfixSuffix = 113, RULE_j2ArgList = 114, RULE_j2Arg = 115, RULE_j2Primary = 116, 
		RULE_j2DictPair = 117, RULE_j2StringLiteral = 118;
	private static String[] makeRuleNames() {
		return new String[] {
			"flaskTemplate", "htmlNode", "htmlElement", "openTag", "closeTag", "selfCloseTag", 
			"styleElement", "scriptElement", "attribute", "attrValue", "j2VariableInTag", 
			"cssStylesheet", "cssItem", "cssRule", "cssSelectorList", "cssSelector", 
			"cssCombinator", "cssSimpleSelectorSeq", "cssBaseSelector", "cssSubSelector", 
			"cssAttrOperator", "cssFunctionArgs", "cssDeclarationBlock", "cssDeclaration", 
			"cssValueList", "cssValue", "cssFunction", "cssAtRule", "cssMediaRule", 
			"cssMediaQuery", "cssMediaQueryTerm", "cssKeyframesRule", "cssKeyframeBlock", 
			"cssKeyframeSelector", "cssImportRule", "cssCharsetRule", "cssSupportsRule", 
			"cssSupportsCondition", "cssFontFaceRule", "cssStylesheetInStyle", "cssItemInStyle", 
			"cssRuleInStyle", "cssSelectorListInStyle", "cssSelectorInStyle", "cssCombinatorInStyle", 
			"cssSimpleSelectorSeqInStyle", "cssBaseSelectorInStyle", "cssSubSelectorInStyle", 
			"cssAttrOperatorInStyle", "cssFunctionArgsInStyle", "cssDeclarationBlockInStyle", 
			"cssDeclarationInStyle", "cssValueListInStyle", "cssValueInStyle", "cssFunctionInStyle", 
			"cssAtRuleInStyle", "cssMediaRuleInStyle", "cssMediaQueryInStyle", "cssMediaQueryTermInStyle", 
			"cssKeyframesRuleInStyle", "cssKeyframeBlockInStyle", "cssKeyframeSelectorInStyle", 
			"cssImportRuleInStyle", "cssCharsetRuleInStyle", "cssSupportsRuleInStyle", 
			"cssSupportsConditionInStyle", "cssFontFaceRuleInStyle", "j2Statement", 
			"j2ForStmt", "j2ForTarget", "j2IfStmt", "j2ElifClause", "j2ElseClause", 
			"j2ExtendsStmt", "j2BlockStmt", "j2IncludeStmt", "j2SetStmt", "j2MacroStmt", 
			"j2MacroArgs", "j2MacroArg", "j2ImportStmt", "j2FromImportStmt", "j2ImportName", 
			"j2WithStmt", "j2WithAssignment", "j2CallStmt", "j2Variable", "j2VarExpr", 
			"j2VarPipeExpr", "j2Filter", "j2VarArgList", "j2VarOrExpr", "j2VarAndExpr", 
			"j2VarNotExpr", "j2VarCompareExpr", "j2VarAddExpr", "j2VarMulExpr", "j2VarUnaryExpr", 
			"j2VarPostfixExpr", "j2VarPostfixSuffix", "j2VarPrimary", "j2VarDictPair", 
			"j2Expr", "j2PipeExpr", "j2StmtFilter", "j2OrExpr", "j2AndExpr", "j2NotExpr", 
			"j2CompareExpr", "j2AddExpr", "j2MulExpr", "j2UnaryExpr", "j2PostfixExpr", 
			"j2PostfixSuffix", "j2ArgList", "j2Arg", "j2Primary", "j2DictPair", "j2StringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'/>'", null, null, "'</style>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'</script>'", null, null, null, null, "'for'", "'endfor'", "'if'", 
			"'elif'", "'else'", "'endif'", "'extends'", "'block'", "'endblock'", 
			"'include'", "'import'", "'from'", "'as'", null, "'set'", "'endset'", 
			"'with'", "'endwith'", "'macro'", "'endmacro'", "'call'", "'endcall'", 
			null, null, null, null, "'recursive'", "'ignore missing'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PERCENT", "CSS_COMMENT", "CSS_AT_MEDIA", "CSS_AT_KEYFRAMES", 
			"CSS_AT_IMPORT", "CSS_AT_CHARSET", "CSS_AT_SUPPORTS", "CSS_AT_FONT_FACE", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_SEMICOLON", "CSS_DCOLON", "CSS_COLON", 
			"CSS_COMMA", "CSS_STAR", "CSS_GT", "CSS_PLUS", "CSS_TILDE_SEL", "CSS_SLASH", 
			"CSS_LPAREN", "CSS_RPAREN", "CSS_LBRACKET", "CSS_RBRACKET", "CSS_ASSIGN", 
			"CSS_PIPE", "CSS_CARET", "CSS_IMPORTANT", "CSS_HEX_COLOR", "CSS_HASH", 
			"CSS_DOT", "CSS_DIMENSION", "CSS_NUMBER", "CSS_URL", "CSS_VAR", "CSS_STRING_DQ", 
			"CSS_STRING_SQ", "CSS_IDENT", "JINJA_STMT_OPEN", "JINJA_VAR_OPEN", "JINJA_COMMENT", 
			"HTML_DOCTYPE", "HTML_COMMENT", "STYLE_OPEN", "SCRIPT_OPEN", "HTML_OPEN_TAG", 
			"HTML_CLOSE_TAG", "HTML_TEXT", "TAG_WS", "ATTR_NAME", "ATTR_EQ", "ATTR_VAL_DQ", 
			"ATTR_VAL_SQ", "TAG_JINJA_VAR_OPEN", "TAG_JINJA_STMT_OPEN", "TAG_SELF_CLOSE", 
			"TAG_CLOSE", "CSS_MODE_WS", "STYLE_CLOSE", "CSS_MODE_COMMENT", "CSS_MODE_AT_MEDIA", 
			"CSS_MODE_AT_KEYFRAMES", "CSS_MODE_AT_IMPORT", "CSS_MODE_AT_CHARSET", 
			"CSS_MODE_AT_SUPPORTS", "CSS_MODE_AT_FONT_FACE", "CSS_MODE_LBRACE", "CSS_MODE_RBRACE", 
			"CSS_MODE_SEMICOLON", "CSS_MODE_DCOLON", "CSS_MODE_COLON", "CSS_MODE_COMMA", 
			"CSS_MODE_STAR", "CSS_MODE_GT", "CSS_MODE_PLUS", "CSS_MODE_TILDE_SEL", 
			"CSS_MODE_SLASH", "CSS_MODE_LPAREN", "CSS_MODE_RPAREN", "CSS_MODE_LBRACKET", 
			"CSS_MODE_RBRACKET", "CSS_MODE_ASSIGN", "CSS_MODE_PIPE", "CSS_MODE_CARET", 
			"CSS_MODE_IMPORTANT", "CSS_MODE_HEX_COLOR", "CSS_MODE_HASH", "CSS_MODE_DOT", 
			"CSS_MODE_DIMENSION", "CSS_MODE_NUMBER", "CSS_MODE_URL", "CSS_MODE_VAR", 
			"CSS_MODE_STRING_DQ", "CSS_MODE_STRING_SQ", "CSS_MODE_IDENT", "SCRIPT_WS", 
			"SCRIPT_CLOSE", "SCRIPT_TEXT", "SCRIPT_LT", "J2S_WS", "JINJA_STMT_CLOSE", 
			"J2S_FOR", "J2S_ENDFOR", "J2S_IF", "J2S_ELIF", "J2S_ELSE", "J2S_ENDIF", 
			"J2S_EXTENDS", "J2S_BLOCK", "J2S_ENDBLOCK", "J2S_INCLUDE", "J2S_IMPORT", 
			"J2S_FROM", "J2S_AS", "J2S_IN", "J2S_SET", "J2S_ENDSET", "J2S_WITH", 
			"J2S_ENDWITH", "J2S_MACRO", "J2S_ENDMACRO", "J2S_CALL", "J2S_ENDCALL", 
			"J2S_NOT", "J2S_AND", "J2S_OR", "J2S_IS", "J2S_RECURSIVE", "J2S_IGNORE_MISSING", 
			"J2S_TRUE", "J2S_FALSE", "J2S_NONE", "J2S_EQ", "J2S_NEQ", "J2S_LTE", 
			"J2S_GTE", "J2S_DSTAR", "J2S_LT", "J2S_GT", "J2S_PLUS", "J2S_MINUS", 
			"J2S_STAR", "J2S_SLASH", "J2S_PERCENT", "J2S_TILDE", "J2S_PIPE", "J2S_ASSIGN", 
			"J2S_DOT", "J2S_COMMA", "J2S_COLON", "J2S_LPAREN", "J2S_RPAREN", "J2S_LBRACKET", 
			"J2S_RBRACKET", "J2S_LBRACE", "J2S_RBRACE", "J2S_STRING", "J2S_FLOAT", 
			"J2S_INT", "J2S_ID", "J2V_WS", "JINJA_VAR_CLOSE", "J2V_NOT", "J2V_AND", 
			"J2V_OR", "J2V_IN", "J2V_IS", "J2V_TRUE", "J2V_FALSE", "J2V_NONE", "J2V_EQ", 
			"J2V_NEQ", "J2V_LTE", "J2V_GTE", "J2V_DSTAR", "J2V_LT", "J2V_GT", "J2V_PLUS", 
			"J2V_MINUS", "J2V_STAR", "J2V_SLASH", "J2V_PERCENT", "J2V_TILDE", "J2V_PIPE", 
			"J2V_DOT", "J2V_COMMA", "J2V_COLON", "J2V_LPAREN", "J2V_RPAREN", "J2V_LBRACKET", 
			"J2V_RBRACKET", "J2V_LBRACE", "J2V_RBRACE", "J2V_STRING", "J2V_FLOAT", 
			"J2V_INT", "J2V_ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FlaskParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlaskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlaskTemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FlaskParser.EOF, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public FlaskTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flaskTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFlaskTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFlaskTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFlaskTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlaskTemplateContext flaskTemplate() throws RecognitionException {
		FlaskTemplateContext _localctx = new FlaskTemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flaskTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 421662709252096L) != 0)) {
				{
				{
				setState(238);
				htmlNode();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends ParserRuleContext {
		public HtmlNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlNode; }
	 
		public HtmlNodeContext() { }
		public void copyFrom(HtmlNodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2StmtNodeContext extends HtmlNodeContext {
		public J2StatementContext j2Statement() {
			return getRuleContext(J2StatementContext.class,0);
		}
		public J2StmtNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2StmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2StmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2StmtNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentNodeContext extends HtmlNodeContext {
		public TerminalNode HTML_COMMENT() { return getToken(FlaskParser.HTML_COMMENT, 0); }
		public HtmlCommentNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterHtmlCommentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitHtmlCommentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitHtmlCommentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2CommentNodeContext extends HtmlNodeContext {
		public TerminalNode JINJA_COMMENT() { return getToken(FlaskParser.JINJA_COMMENT, 0); }
		public J2CommentNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2CommentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2CommentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2CommentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementNodeContext extends HtmlNodeContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterHtmlElementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitHtmlElementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitHtmlElementNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeNodeContext extends HtmlNodeContext {
		public TerminalNode HTML_DOCTYPE() { return getToken(FlaskParser.HTML_DOCTYPE, 0); }
		public DoctypeNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDoctypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDoctypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDoctypeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarNodeContext extends HtmlNodeContext {
		public J2VariableContext j2Variable() {
			return getRuleContext(J2VariableContext.class,0);
		}
		public J2VarNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextNodeContext extends HtmlNodeContext {
		public TerminalNode HTML_TEXT() { return getToken(FlaskParser.HTML_TEXT, 0); }
		public HtmlTextNodeContext(HtmlNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterHtmlTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitHtmlTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitHtmlTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlNodeContext htmlNode() throws RecognitionException {
		HtmlNodeContext _localctx = new HtmlNodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlNode);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_OPEN:
			case SCRIPT_OPEN:
			case HTML_OPEN_TAG:
				_localctx = new HtmlElementNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				htmlElement();
				}
				break;
			case JINJA_STMT_OPEN:
				_localctx = new J2StmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				j2Statement();
				}
				break;
			case JINJA_VAR_OPEN:
				_localctx = new J2VarNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				j2Variable();
				}
				break;
			case JINJA_COMMENT:
				_localctx = new J2CommentNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(JINJA_COMMENT);
				}
				break;
			case HTML_DOCTYPE:
				_localctx = new DoctypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(HTML_DOCTYPE);
				}
				break;
			case HTML_COMMENT:
				_localctx = new HtmlCommentNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(HTML_COMMENT);
				}
				break;
			case HTML_TEXT:
				_localctx = new HtmlTextNodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(HTML_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptElContext extends HtmlElementContext {
		public ScriptElementContext scriptElement() {
			return getRuleContext(ScriptElementContext.class,0);
		}
		public ScriptElContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterScriptEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitScriptEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitScriptEl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends HtmlElementContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public NormalElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidElementContext extends HtmlElementContext {
		public SelfCloseTagContext selfCloseTag() {
			return getRuleContext(SelfCloseTagContext.class,0);
		}
		public VoidElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterVoidElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitVoidElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitVoidElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssElementContext extends HtmlElementContext {
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public CssElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				openTag();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 421662709252096L) != 0)) {
					{
					{
					setState(256);
					htmlNode();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				closeTag();
				}
				break;
			case 2:
				_localctx = new VoidElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				selfCloseTag();
				}
				break;
			case 3:
				_localctx = new CssElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				styleElement();
				}
				break;
			case 4:
				_localctx = new ScriptElContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				scriptElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode HTML_OPEN_TAG() { return getToken(FlaskParser.HTML_OPEN_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(FlaskParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(HTML_OPEN_TAG);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTR_NAME) {
				{
				{
				setState(270);
				attribute();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode HTML_CLOSE_TAG() { return getToken(FlaskParser.HTML_CLOSE_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(FlaskParser.TAG_CLOSE, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(HTML_CLOSE_TAG);
			setState(279);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfCloseTagContext extends ParserRuleContext {
		public TerminalNode HTML_OPEN_TAG() { return getToken(FlaskParser.HTML_OPEN_TAG, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(FlaskParser.TAG_SELF_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSelfCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSelfCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSelfCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfCloseTagContext selfCloseTag() throws RecognitionException {
		SelfCloseTagContext _localctx = new SelfCloseTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selfCloseTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(HTML_OPEN_TAG);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTR_NAME) {
				{
				{
				setState(282);
				attribute();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(TAG_SELF_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(FlaskParser.STYLE_OPEN, 0); }
		public CssStylesheetInStyleContext cssStylesheetInStyle() {
			return getRuleContext(CssStylesheetInStyleContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(FlaskParser.STYLE_CLOSE, 0); }
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_styleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(STYLE_OPEN);
			setState(291);
			cssStylesheetInStyle();
			setState(292);
			match(STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptElementContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(FlaskParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(FlaskParser.SCRIPT_CLOSE, 0); }
		public List<TerminalNode> SCRIPT_TEXT() { return getTokens(FlaskParser.SCRIPT_TEXT); }
		public TerminalNode SCRIPT_TEXT(int i) {
			return getToken(FlaskParser.SCRIPT_TEXT, i);
		}
		public List<TerminalNode> SCRIPT_LT() { return getTokens(FlaskParser.SCRIPT_LT); }
		public TerminalNode SCRIPT_LT(int i) {
			return getToken(FlaskParser.SCRIPT_LT, i);
		}
		public ScriptElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitScriptElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptElementContext scriptElement() throws RecognitionException {
		ScriptElementContext _localctx = new ScriptElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scriptElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SCRIPT_OPEN);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCRIPT_TEXT || _la==SCRIPT_LT) {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==SCRIPT_TEXT || _la==SCRIPT_LT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(SCRIPT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTR_NAME() { return getToken(FlaskParser.ATTR_NAME, 0); }
		public TerminalNode ATTR_EQ() { return getToken(FlaskParser.ATTR_EQ, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(ATTR_NAME);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR_EQ) {
				{
				setState(304);
				match(ATTR_EQ);
				setState(305);
				attrValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueContext extends ParserRuleContext {
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
	 
		public AttrValueContext() { }
		public void copyFrom(AttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqAttrValContext extends AttrValueContext {
		public TerminalNode ATTR_VAL_SQ() { return getToken(FlaskParser.ATTR_VAL_SQ, 0); }
		public SqAttrValContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSqAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSqAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSqAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2AttrValInTagContext extends AttrValueContext {
		public J2VariableInTagContext j2VariableInTag() {
			return getRuleContext(J2VariableInTagContext.class,0);
		}
		public J2AttrValInTagContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2AttrValInTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2AttrValInTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2AttrValInTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2AttrValContext extends AttrValueContext {
		public J2VariableContext j2Variable() {
			return getRuleContext(J2VariableContext.class,0);
		}
		public J2AttrValContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2AttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2AttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2AttrVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DqAttrValContext extends AttrValueContext {
		public TerminalNode ATTR_VAL_DQ() { return getToken(FlaskParser.ATTR_VAL_DQ, 0); }
		public DqAttrValContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDqAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDqAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDqAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attrValue);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_VAL_DQ:
				_localctx = new DqAttrValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(ATTR_VAL_DQ);
				}
				break;
			case ATTR_VAL_SQ:
				_localctx = new SqAttrValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ATTR_VAL_SQ);
				}
				break;
			case JINJA_VAR_OPEN:
				_localctx = new J2AttrValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				j2Variable();
				}
				break;
			case TAG_JINJA_VAR_OPEN:
				_localctx = new J2AttrValInTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				j2VariableInTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VariableInTagContext extends ParserRuleContext {
		public TerminalNode TAG_JINJA_VAR_OPEN() { return getToken(FlaskParser.TAG_JINJA_VAR_OPEN, 0); }
		public J2VarExprContext j2VarExpr() {
			return getRuleContext(J2VarExprContext.class,0);
		}
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(FlaskParser.JINJA_VAR_CLOSE, 0); }
		public J2VariableInTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VariableInTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VariableInTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VariableInTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VariableInTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VariableInTagContext j2VariableInTag() throws RecognitionException {
		J2VariableInTagContext _localctx = new J2VariableInTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_j2VariableInTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(TAG_JINJA_VAR_OPEN);
			setState(315);
			j2VarExpr();
			setState(316);
			match(JINJA_VAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssStylesheetContext extends ParserRuleContext {
		public List<CssItemContext> cssItem() {
			return getRuleContexts(CssItemContext.class);
		}
		public CssItemContext cssItem(int i) {
			return getRuleContext(CssItemContext.class,i);
		}
		public CssStylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesheetContext cssStylesheet() throws RecognitionException {
		CssStylesheetContext _localctx = new CssStylesheetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssStylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 278644483056L) != 0)) {
				{
				{
				setState(318);
				cssItem();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssItemContext extends ParserRuleContext {
		public CssRuleContext cssRule() {
			return getRuleContext(CssRuleContext.class,0);
		}
		public CssAtRuleContext cssAtRule() {
			return getRuleContext(CssAtRuleContext.class,0);
		}
		public CssItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssItemContext cssItem() throws RecognitionException {
		CssItemContext _localctx = new CssItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssItem);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_DCOLON:
			case CSS_COLON:
			case CSS_STAR:
			case CSS_LBRACKET:
			case CSS_HEX_COLOR:
			case CSS_HASH:
			case CSS_DOT:
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				cssRule();
				}
				break;
			case CSS_AT_MEDIA:
			case CSS_AT_KEYFRAMES:
			case CSS_AT_IMPORT:
			case CSS_AT_CHARSET:
			case CSS_AT_SUPPORTS:
			case CSS_AT_FONT_FACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				cssAtRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorListContext cssSelectorList() {
			return getRuleContext(CssSelectorListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public CssDeclarationBlockContext cssDeclarationBlock() {
			return getRuleContext(CssDeclarationBlockContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			cssSelectorList();
			setState(329);
			match(CSS_LBRACE);
			setState(330);
			cssDeclarationBlock();
			setState(331);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends ParserRuleContext {
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(FlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(FlaskParser.CSS_COMMA, i);
		}
		public CssSelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorListContext cssSelectorList() throws RecognitionException {
		CssSelectorListContext _localctx = new CssSelectorListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cssSelectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			cssSelector();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(334);
				match(CSS_COMMA);
				setState(335);
				cssSelector();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public List<CssSimpleSelectorSeqContext> cssSimpleSelectorSeq() {
			return getRuleContexts(CssSimpleSelectorSeqContext.class);
		}
		public CssSimpleSelectorSeqContext cssSimpleSelectorSeq(int i) {
			return getRuleContext(CssSimpleSelectorSeqContext.class,i);
		}
		public List<CssCombinatorContext> cssCombinator() {
			return getRuleContexts(CssCombinatorContext.class);
		}
		public CssCombinatorContext cssCombinator(int i) {
			return getRuleContext(CssCombinatorContext.class,i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			cssSimpleSelectorSeq();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				{
				setState(342);
				cssCombinator();
				setState(343);
				cssSimpleSelectorSeq();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCombinatorContext extends ParserRuleContext {
		public CssCombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCombinator; }
	 
		public CssCombinatorContext() { }
		public void copyFrom(CssCombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombContext extends CssCombinatorContext {
		public TerminalNode CSS_GT() { return getToken(FlaskParser.CSS_GT, 0); }
		public ChildCombContext(CssCombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterChildComb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitChildComb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitChildComb(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentCombContext extends CssCombinatorContext {
		public TerminalNode CSS_PLUS() { return getToken(FlaskParser.CSS_PLUS, 0); }
		public AdjacentCombContext(CssCombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAdjacentComb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAdjacentComb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAdjacentComb(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiblingCombContext extends CssCombinatorContext {
		public TerminalNode CSS_TILDE_SEL() { return getToken(FlaskParser.CSS_TILDE_SEL, 0); }
		public SiblingCombContext(CssCombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSiblingComb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSiblingComb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSiblingComb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCombinatorContext cssCombinator() throws RecognitionException {
		CssCombinatorContext _localctx = new CssCombinatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cssCombinator);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_GT:
				_localctx = new ChildCombContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(CSS_GT);
				}
				break;
			case CSS_PLUS:
				_localctx = new AdjacentCombContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(CSS_PLUS);
				}
				break;
			case CSS_TILDE_SEL:
				_localctx = new SiblingCombContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(CSS_TILDE_SEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSimpleSelectorSeqContext extends ParserRuleContext {
		public CssSimpleSelectorSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSimpleSelectorSeq; }
	 
		public CssSimpleSelectorSeqContext() { }
		public void copyFrom(CssSimpleSelectorSeqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JustClassIdAttrpseudowithouttypeContext extends CssSimpleSelectorSeqContext {
		public List<CssSubSelectorContext> cssSubSelector() {
			return getRuleContexts(CssSubSelectorContext.class);
		}
		public CssSubSelectorContext cssSubSelector(int i) {
			return getRuleContext(CssSubSelectorContext.class,i);
		}
		public JustClassIdAttrpseudowithouttypeContext(CssSimpleSelectorSeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJustClassIdAttrpseudowithouttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJustClassIdAttrpseudowithouttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJustClassIdAttrpseudowithouttype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeselectorwithmodifiersContext extends CssSimpleSelectorSeqContext {
		public CssBaseSelectorContext cssBaseSelector() {
			return getRuleContext(CssBaseSelectorContext.class,0);
		}
		public List<CssSubSelectorContext> cssSubSelector() {
			return getRuleContexts(CssSubSelectorContext.class);
		}
		public CssSubSelectorContext cssSubSelector(int i) {
			return getRuleContext(CssSubSelectorContext.class,i);
		}
		public TypeselectorwithmodifiersContext(CssSimpleSelectorSeqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTypeselectorwithmodifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTypeselectorwithmodifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTypeselectorwithmodifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSimpleSelectorSeqContext cssSimpleSelectorSeq() throws RecognitionException {
		CssSimpleSelectorSeqContext _localctx = new CssSimpleSelectorSeqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cssSimpleSelectorSeq);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_STAR:
			case CSS_IDENT:
				_localctx = new TypeselectorwithmodifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				cssBaseSelector();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3766509568L) != 0)) {
					{
					{
					setState(356);
					cssSubSelector();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CSS_DCOLON:
			case CSS_COLON:
			case CSS_LBRACKET:
			case CSS_HEX_COLOR:
			case CSS_HASH:
			case CSS_DOT:
				_localctx = new JustClassIdAttrpseudowithouttypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(362);
					cssSubSelector();
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3766509568L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBaseSelectorContext extends ParserRuleContext {
		public CssBaseSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBaseSelector; }
	 
		public CssBaseSelectorContext() { }
		public void copyFrom(CssBaseSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends CssBaseSelectorContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TypeSelectorContext(CssBaseSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends CssBaseSelectorContext {
		public TerminalNode CSS_STAR() { return getToken(FlaskParser.CSS_STAR, 0); }
		public UniversalSelectorContext(CssBaseSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBaseSelectorContext cssBaseSelector() throws RecognitionException {
		CssBaseSelectorContext _localctx = new CssBaseSelectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cssBaseSelector);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(CSS_IDENT);
				}
				break;
			case CSS_STAR:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(CSS_STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSubSelectorContext extends ParserRuleContext {
		public CssSubSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSubSelector; }
	 
		public CssSubSelectorContext() { }
		public void copyFrom(CssSubSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends CssSubSelectorContext {
		public TerminalNode CSS_HASH() { return getToken(FlaskParser.CSS_HASH, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public IdSelectorContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSelectorContext extends CssSubSelectorContext {
		public TerminalNode CSS_LBRACKET() { return getToken(FlaskParser.CSS_LBRACKET, 0); }
		public List<TerminalNode> CSS_IDENT() { return getTokens(FlaskParser.CSS_IDENT); }
		public TerminalNode CSS_IDENT(int i) {
			return getToken(FlaskParser.CSS_IDENT, i);
		}
		public TerminalNode CSS_RBRACKET() { return getToken(FlaskParser.CSS_RBRACKET, 0); }
		public CssAttrOperatorContext cssAttrOperator() {
			return getRuleContext(CssAttrOperatorContext.class,0);
		}
		public TerminalNode CSS_STRING_DQ() { return getToken(FlaskParser.CSS_STRING_DQ, 0); }
		public TerminalNode CSS_STRING_SQ() { return getToken(FlaskParser.CSS_STRING_SQ, 0); }
		public AttrSelectorContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAttrSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAttrSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAttrSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorHexContext extends CssSubSelectorContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(FlaskParser.CSS_HEX_COLOR, 0); }
		public IdSelectorHexContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdSelectorHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdSelectorHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdSelectorHex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends CssSubSelectorContext {
		public TerminalNode CSS_DOT() { return getToken(FlaskParser.CSS_DOT, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public ClassSelectorContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassSelectorContext extends CssSubSelectorContext {
		public TerminalNode CSS_COLON() { return getToken(FlaskParser.CSS_COLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(FlaskParser.CSS_LPAREN, 0); }
		public CssFunctionArgsContext cssFunctionArgs() {
			return getRuleContext(CssFunctionArgsContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(FlaskParser.CSS_RPAREN, 0); }
		public PseudoClassSelectorContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPseudoClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPseudoClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPseudoClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementSelectorContext extends CssSubSelectorContext {
		public TerminalNode CSS_DCOLON() { return getToken(FlaskParser.CSS_DCOLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public PseudoElementSelectorContext(CssSubSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPseudoElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPseudoElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPseudoElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSubSelectorContext cssSubSelector() throws RecognitionException {
		CssSubSelectorContext _localctx = new CssSubSelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cssSubSelector);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_DOT:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(CSS_DOT);
				setState(374);
				match(CSS_IDENT);
				}
				break;
			case CSS_HASH:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(CSS_HASH);
				setState(376);
				match(CSS_IDENT);
				}
				break;
			case CSS_HEX_COLOR:
				_localctx = new IdSelectorHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(CSS_HEX_COLOR);
				}
				break;
			case CSS_COLON:
				_localctx = new PseudoClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(CSS_COLON);
				setState(379);
				match(CSS_IDENT);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_LPAREN) {
					{
					setState(380);
					match(CSS_LPAREN);
					setState(381);
					cssFunctionArgs();
					setState(382);
					match(CSS_RPAREN);
					}
				}

				}
				break;
			case CSS_DCOLON:
				_localctx = new PseudoElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(CSS_DCOLON);
				setState(387);
				match(CSS_IDENT);
				}
				break;
			case CSS_LBRACKET:
				_localctx = new AttrSelectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				match(CSS_LBRACKET);
				setState(389);
				match(CSS_IDENT);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_ASSIGN || _la==CSS_IDENT) {
					{
					setState(390);
					cssAttrOperator();
					setState(391);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(395);
				match(CSS_RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssAttrOperatorContext extends ParserRuleContext {
		public TerminalNode CSS_ASSIGN() { return getToken(FlaskParser.CSS_ASSIGN, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public CssAttrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAttrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssAttrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssAttrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssAttrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAttrOperatorContext cssAttrOperator() throws RecognitionException {
		CssAttrOperatorContext _localctx = new CssAttrOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cssAttrOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==CSS_ASSIGN || _la==CSS_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionArgsContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(FlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(FlaskParser.CSS_COMMA, i);
		}
		public CssFunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunctionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionArgsContext cssFunctionArgs() throws RecognitionException {
		CssFunctionArgsContext _localctx = new CssFunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssFunctionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			cssValue();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(401);
				match(CSS_COMMA);
				setState(402);
				cssValue();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationBlockContext extends ParserRuleContext {
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(FlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(FlaskParser.CSS_SEMICOLON, i);
		}
		public CssDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationBlockContext cssDeclarationBlock() throws RecognitionException {
		CssDeclarationBlockContext _localctx = new CssDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cssDeclarationBlock);
		int _la;
		try {
			int _alt;
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(408);
						cssDeclaration();
						setState(409);
						match(CSS_SEMICOLON);
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(416);
				cssDeclaration();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_SEMICOLON) {
					{
					setState(417);
					match(CSS_SEMICOLON);
					}
				}

				}
				break;
			case CSS_RBRACE:
			case CSS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_SEMICOLON) {
					{
					{
					setState(420);
					match(CSS_SEMICOLON);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_COLON() { return getToken(FlaskParser.CSS_COLON, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public TerminalNode CSS_IMPORTANT() { return getToken(FlaskParser.CSS_IMPORTANT, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CSS_IDENT);
			setState(429);
			match(CSS_COLON);
			setState(430);
			cssValueList();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_IMPORTANT) {
				{
				setState(431);
				match(CSS_IMPORTANT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueListContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cssValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434);
				cssValue();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 545998798848L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqStringValueContext extends CssValueContext {
		public TerminalNode CSS_STRING_SQ() { return getToken(FlaskParser.CSS_STRING_SQ, 0); }
		public SqStringValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSqStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSqStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSqStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DimensionValueContext extends CssValueContext {
		public TerminalNode CSS_DIMENSION() { return getToken(FlaskParser.CSS_DIMENSION, 0); }
		public DimensionValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDimensionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDimensionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDimensionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarValueContext extends CssValueContext {
		public TerminalNode CSS_VAR() { return getToken(FlaskParser.CSS_VAR, 0); }
		public VarValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueContext extends CssValueContext {
		public TerminalNode CSS_COMMA() { return getToken(FlaskParser.CSS_COMMA, 0); }
		public CommaValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCommaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCommaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCommaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlValueContext extends CssValueContext {
		public TerminalNode CSS_URL() { return getToken(FlaskParser.CSS_URL, 0); }
		public UrlValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterUrlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitUrlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitUrlValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorValueContext extends CssValueContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(FlaskParser.CSS_HEX_COLOR, 0); }
		public HexColorValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterHexColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitHexColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitHexColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DqStringValueContext extends CssValueContext {
		public TerminalNode CSS_STRING_DQ() { return getToken(FlaskParser.CSS_STRING_DQ, 0); }
		public DqStringValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDqStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDqStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDqStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashValueContext extends CssValueContext {
		public TerminalNode CSS_SLASH() { return getToken(FlaskParser.CSS_SLASH, 0); }
		public SlashValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSlashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSlashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSlashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncValueContext extends CssValueContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public FuncValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFuncValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFuncValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFuncValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueContext extends CssValueContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public IdentValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends CssValueContext {
		public TerminalNode CSS_NUMBER() { return getToken(FlaskParser.CSS_NUMBER, 0); }
		public NumberValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cssValue);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(CSS_IDENT);
				}
				break;
			case 2:
				_localctx = new DimensionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(CSS_DIMENSION);
				}
				break;
			case 3:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(CSS_NUMBER);
				}
				break;
			case 4:
				_localctx = new HexColorValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(CSS_HEX_COLOR);
				}
				break;
			case 5:
				_localctx = new DqStringValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(CSS_STRING_DQ);
				}
				break;
			case 6:
				_localctx = new SqStringValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(CSS_STRING_SQ);
				}
				break;
			case 7:
				_localctx = new UrlValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				match(CSS_URL);
				}
				break;
			case 8:
				_localctx = new VarValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(446);
				match(CSS_VAR);
				}
				break;
			case 9:
				_localctx = new SlashValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(447);
				match(CSS_SLASH);
				}
				break;
			case 10:
				_localctx = new CommaValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(448);
				match(CSS_COMMA);
				}
				break;
			case 11:
				_localctx = new FuncValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(449);
				cssFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(FlaskParser.CSS_LPAREN, 0); }
		public CssFunctionArgsContext cssFunctionArgs() {
			return getRuleContext(CssFunctionArgsContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(FlaskParser.CSS_RPAREN, 0); }
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cssFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(CSS_IDENT);
			setState(453);
			match(CSS_LPAREN);
			setState(454);
			cssFunctionArgs();
			setState(455);
			match(CSS_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleContext extends ParserRuleContext {
		public CssMediaRuleContext cssMediaRule() {
			return getRuleContext(CssMediaRuleContext.class,0);
		}
		public CssKeyframesRuleContext cssKeyframesRule() {
			return getRuleContext(CssKeyframesRuleContext.class,0);
		}
		public CssImportRuleContext cssImportRule() {
			return getRuleContext(CssImportRuleContext.class,0);
		}
		public CssCharsetRuleContext cssCharsetRule() {
			return getRuleContext(CssCharsetRuleContext.class,0);
		}
		public CssSupportsRuleContext cssSupportsRule() {
			return getRuleContext(CssSupportsRuleContext.class,0);
		}
		public CssFontFaceRuleContext cssFontFaceRule() {
			return getRuleContext(CssFontFaceRuleContext.class,0);
		}
		public CssAtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleContext cssAtRule() throws RecognitionException {
		CssAtRuleContext _localctx = new CssAtRuleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cssAtRule);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_AT_MEDIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				cssMediaRule();
				}
				break;
			case CSS_AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				cssKeyframesRule();
				}
				break;
			case CSS_AT_IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				cssImportRule();
				}
				break;
			case CSS_AT_CHARSET:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				cssCharsetRule();
				}
				break;
			case CSS_AT_SUPPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				cssSupportsRule();
				}
				break;
			case CSS_AT_FONT_FACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				cssFontFaceRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_MEDIA() { return getToken(FlaskParser.CSS_AT_MEDIA, 0); }
		public CssMediaQueryContext cssMediaQuery() {
			return getRuleContext(CssMediaQueryContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public List<CssItemContext> cssItem() {
			return getRuleContexts(CssItemContext.class);
		}
		public CssItemContext cssItem(int i) {
			return getRuleContext(CssItemContext.class,i);
		}
		public CssMediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaRuleContext cssMediaRule() throws RecognitionException {
		CssMediaRuleContext _localctx = new CssMediaRuleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cssMediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(CSS_AT_MEDIA);
			setState(466);
			cssMediaQuery();
			setState(467);
			match(CSS_LBRACE);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 278644483056L) != 0)) {
				{
				{
				setState(468);
				cssItem();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryContext extends ParserRuleContext {
		public List<CssMediaQueryTermContext> cssMediaQueryTerm() {
			return getRuleContexts(CssMediaQueryTermContext.class);
		}
		public CssMediaQueryTermContext cssMediaQueryTerm(int i) {
			return getRuleContext(CssMediaQueryTermContext.class,i);
		}
		public List<TerminalNode> CSS_IDENT() { return getTokens(FlaskParser.CSS_IDENT); }
		public TerminalNode CSS_IDENT(int i) {
			return getToken(FlaskParser.CSS_IDENT, i);
		}
		public CssMediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryContext cssMediaQuery() throws RecognitionException {
		CssMediaQueryContext _localctx = new CssMediaQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cssMediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			cssMediaQueryTerm();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENT) {
				{
				{
				setState(477);
				match(CSS_IDENT);
				setState(478);
				cssMediaQueryTerm();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryTermContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(FlaskParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_COLON() { return getToken(FlaskParser.CSS_COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(FlaskParser.CSS_RPAREN, 0); }
		public CssMediaQueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQueryTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaQueryTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaQueryTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaQueryTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryTermContext cssMediaQueryTerm() throws RecognitionException {
		CssMediaQueryTermContext _localctx = new CssMediaQueryTermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cssMediaQueryTerm);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(CSS_IDENT);
				}
				break;
			case CSS_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(CSS_LPAREN);
				setState(486);
				match(CSS_IDENT);
				setState(487);
				match(CSS_COLON);
				setState(488);
				cssValue();
				setState(489);
				match(CSS_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframesRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_KEYFRAMES() { return getToken(FlaskParser.CSS_AT_KEYFRAMES, 0); }
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public List<CssKeyframeBlockContext> cssKeyframeBlock() {
			return getRuleContexts(CssKeyframeBlockContext.class);
		}
		public CssKeyframeBlockContext cssKeyframeBlock(int i) {
			return getRuleContext(CssKeyframeBlockContext.class,i);
		}
		public CssKeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframesRuleContext cssKeyframesRule() throws RecognitionException {
		CssKeyframesRuleContext _localctx = new CssKeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cssKeyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(CSS_AT_KEYFRAMES);
			setState(494);
			match(CSS_IDENT);
			setState(495);
			match(CSS_LBRACE);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_DIMENSION || _la==CSS_IDENT) {
				{
				{
				setState(496);
				cssKeyframeBlock();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframeBlockContext extends ParserRuleContext {
		public CssKeyframeSelectorContext cssKeyframeSelector() {
			return getRuleContext(CssKeyframeSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public CssDeclarationBlockContext cssDeclarationBlock() {
			return getRuleContext(CssDeclarationBlockContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public CssKeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframeBlockContext cssKeyframeBlock() throws RecognitionException {
		CssKeyframeBlockContext _localctx = new CssKeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cssKeyframeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			cssKeyframeSelector();
			setState(505);
			match(CSS_LBRACE);
			setState(506);
			cssDeclarationBlock();
			setState(507);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframeSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_DIMENSION() { return getToken(FlaskParser.CSS_DIMENSION, 0); }
		public CssKeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframeSelectorContext cssKeyframeSelector() throws RecognitionException {
		CssKeyframeSelectorContext _localctx = new CssKeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cssKeyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !(_la==CSS_DIMENSION || _la==CSS_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssImportRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_IMPORT() { return getToken(FlaskParser.CSS_AT_IMPORT, 0); }
		public TerminalNode CSS_SEMICOLON() { return getToken(FlaskParser.CSS_SEMICOLON, 0); }
		public TerminalNode CSS_STRING_DQ() { return getToken(FlaskParser.CSS_STRING_DQ, 0); }
		public TerminalNode CSS_STRING_SQ() { return getToken(FlaskParser.CSS_STRING_SQ, 0); }
		public TerminalNode CSS_URL() { return getToken(FlaskParser.CSS_URL, 0); }
		public List<TerminalNode> CSS_IDENT() { return getTokens(FlaskParser.CSS_IDENT); }
		public TerminalNode CSS_IDENT(int i) {
			return getToken(FlaskParser.CSS_IDENT, i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(FlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(FlaskParser.CSS_COMMA, i);
		}
		public CssImportRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssImportRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssImportRuleContext cssImportRule() throws RecognitionException {
		CssImportRuleContext _localctx = new CssImportRuleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssImportRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CSS_AT_IMPORT);
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 223338299392L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_IDENT) {
				{
				setState(513);
				match(CSS_IDENT);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(514);
					match(CSS_COMMA);
					setState(515);
					match(CSS_IDENT);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(523);
			match(CSS_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCharsetRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_CHARSET() { return getToken(FlaskParser.CSS_AT_CHARSET, 0); }
		public TerminalNode CSS_SEMICOLON() { return getToken(FlaskParser.CSS_SEMICOLON, 0); }
		public TerminalNode CSS_STRING_DQ() { return getToken(FlaskParser.CSS_STRING_DQ, 0); }
		public TerminalNode CSS_STRING_SQ() { return getToken(FlaskParser.CSS_STRING_SQ, 0); }
		public CssCharsetRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCharsetRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssCharsetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssCharsetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssCharsetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCharsetRuleContext cssCharsetRule() throws RecognitionException {
		CssCharsetRuleContext _localctx = new CssCharsetRuleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssCharsetRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(CSS_AT_CHARSET);
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==CSS_STRING_DQ || _la==CSS_STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(527);
			match(CSS_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSupportsRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_SUPPORTS() { return getToken(FlaskParser.CSS_AT_SUPPORTS, 0); }
		public CssSupportsConditionContext cssSupportsCondition() {
			return getRuleContext(CssSupportsConditionContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public List<CssItemContext> cssItem() {
			return getRuleContexts(CssItemContext.class);
		}
		public CssItemContext cssItem(int i) {
			return getRuleContext(CssItemContext.class,i);
		}
		public CssSupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSupportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSupportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSupportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSupportsRuleContext cssSupportsRule() throws RecognitionException {
		CssSupportsRuleContext _localctx = new CssSupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cssSupportsRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(CSS_AT_SUPPORTS);
			setState(530);
			cssSupportsCondition();
			setState(531);
			match(CSS_LBRACE);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 278644483056L) != 0)) {
				{
				{
				setState(532);
				cssItem();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSupportsConditionContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(FlaskParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(FlaskParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_COLON() { return getToken(FlaskParser.CSS_COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(FlaskParser.CSS_RPAREN, 0); }
		public CssSupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSupportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSupportsConditionContext cssSupportsCondition() throws RecognitionException {
		CssSupportsConditionContext _localctx = new CssSupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cssSupportsCondition);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(CSS_IDENT);
				}
				break;
			case CSS_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(CSS_LPAREN);
				setState(542);
				match(CSS_IDENT);
				setState(543);
				match(CSS_COLON);
				setState(544);
				cssValue();
				setState(545);
				match(CSS_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFontFaceRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_FONT_FACE() { return getToken(FlaskParser.CSS_AT_FONT_FACE, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(FlaskParser.CSS_LBRACE, 0); }
		public CssDeclarationBlockContext cssDeclarationBlock() {
			return getRuleContext(CssDeclarationBlockContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(FlaskParser.CSS_RBRACE, 0); }
		public CssFontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFontFaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFontFaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFontFaceRuleContext cssFontFaceRule() throws RecognitionException {
		CssFontFaceRuleContext _localctx = new CssFontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssFontFaceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(CSS_AT_FONT_FACE);
			setState(550);
			match(CSS_LBRACE);
			setState(551);
			cssDeclarationBlock();
			setState(552);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssStylesheetInStyleContext extends ParserRuleContext {
		public List<CssItemInStyleContext> cssItemInStyle() {
			return getRuleContexts(CssItemInStyleContext.class);
		}
		public CssItemInStyleContext cssItemInStyle(int i) {
			return getRuleContext(CssItemInStyleContext.class,i);
		}
		public CssStylesheetInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStylesheetInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssStylesheetInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssStylesheetInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssStylesheetInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesheetInStyleContext cssStylesheetInStyle() throws RecognitionException {
		CssStylesheetInStyleContext _localctx = new CssStylesheetInStyleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cssStylesheetInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 17415280191L) != 0)) {
				{
				{
				setState(554);
				cssItemInStyle();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssItemInStyleContext extends ParserRuleContext {
		public CssRuleInStyleContext cssRuleInStyle() {
			return getRuleContext(CssRuleInStyleContext.class,0);
		}
		public CssAtRuleInStyleContext cssAtRuleInStyle() {
			return getRuleContext(CssAtRuleInStyleContext.class,0);
		}
		public CssItemInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssItemInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssItemInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssItemInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssItemInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssItemInStyleContext cssItemInStyle() throws RecognitionException {
		CssItemInStyleContext _localctx = new CssItemInStyleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cssItemInStyle);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_DCOLON:
			case CSS_MODE_COLON:
			case CSS_MODE_STAR:
			case CSS_MODE_LBRACKET:
			case CSS_MODE_HEX_COLOR:
			case CSS_MODE_HASH:
			case CSS_MODE_DOT:
			case CSS_MODE_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				cssRuleInStyle();
				}
				break;
			case CSS_MODE_AT_MEDIA:
			case CSS_MODE_AT_KEYFRAMES:
			case CSS_MODE_AT_IMPORT:
			case CSS_MODE_AT_CHARSET:
			case CSS_MODE_AT_SUPPORTS:
			case CSS_MODE_AT_FONT_FACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				cssAtRuleInStyle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleInStyleContext extends ParserRuleContext {
		public CssSelectorListInStyleContext cssSelectorListInStyle() {
			return getRuleContext(CssSelectorListInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public CssDeclarationBlockInStyleContext cssDeclarationBlockInStyle() {
			return getRuleContext(CssDeclarationBlockInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public CssRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleInStyleContext cssRuleInStyle() throws RecognitionException {
		CssRuleInStyleContext _localctx = new CssRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cssRuleInStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			cssSelectorListInStyle();
			setState(565);
			match(CSS_MODE_LBRACE);
			setState(566);
			cssDeclarationBlockInStyle();
			setState(567);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListInStyleContext extends ParserRuleContext {
		public List<CssSelectorInStyleContext> cssSelectorInStyle() {
			return getRuleContexts(CssSelectorInStyleContext.class);
		}
		public CssSelectorInStyleContext cssSelectorInStyle(int i) {
			return getRuleContext(CssSelectorInStyleContext.class,i);
		}
		public List<TerminalNode> CSS_MODE_COMMA() { return getTokens(FlaskParser.CSS_MODE_COMMA); }
		public TerminalNode CSS_MODE_COMMA(int i) {
			return getToken(FlaskParser.CSS_MODE_COMMA, i);
		}
		public CssSelectorListInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorListInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSelectorListInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSelectorListInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSelectorListInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorListInStyleContext cssSelectorListInStyle() throws RecognitionException {
		CssSelectorListInStyleContext _localctx = new CssSelectorListInStyleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cssSelectorListInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			cssSelectorInStyle();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_MODE_COMMA) {
				{
				{
				setState(570);
				match(CSS_MODE_COMMA);
				setState(571);
				cssSelectorInStyle();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorInStyleContext extends ParserRuleContext {
		public List<CssSimpleSelectorSeqInStyleContext> cssSimpleSelectorSeqInStyle() {
			return getRuleContexts(CssSimpleSelectorSeqInStyleContext.class);
		}
		public CssSimpleSelectorSeqInStyleContext cssSimpleSelectorSeqInStyle(int i) {
			return getRuleContext(CssSimpleSelectorSeqInStyleContext.class,i);
		}
		public List<CssCombinatorInStyleContext> cssCombinatorInStyle() {
			return getRuleContexts(CssCombinatorInStyleContext.class);
		}
		public CssCombinatorInStyleContext cssCombinatorInStyle(int i) {
			return getRuleContext(CssCombinatorInStyleContext.class,i);
		}
		public CssSelectorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorInStyleContext cssSelectorInStyle() throws RecognitionException {
		CssSelectorInStyleContext _localctx = new CssSelectorInStyleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cssSelectorInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			cssSimpleSelectorSeqInStyle();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 7L) != 0)) {
				{
				{
				setState(578);
				cssCombinatorInStyle();
				setState(579);
				cssSimpleSelectorSeqInStyle();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCombinatorInStyleContext extends ParserRuleContext {
		public CssCombinatorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCombinatorInStyle; }
	 
		public CssCombinatorInStyleContext() { }
		public void copyFrom(CssCombinatorInStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombInStyleContext extends CssCombinatorInStyleContext {
		public TerminalNode CSS_MODE_GT() { return getToken(FlaskParser.CSS_MODE_GT, 0); }
		public ChildCombInStyleContext(CssCombinatorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterChildCombInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitChildCombInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitChildCombInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentCombInStyleContext extends CssCombinatorInStyleContext {
		public TerminalNode CSS_MODE_PLUS() { return getToken(FlaskParser.CSS_MODE_PLUS, 0); }
		public AdjacentCombInStyleContext(CssCombinatorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAdjacentCombInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAdjacentCombInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAdjacentCombInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiblingCombInStyleContext extends CssCombinatorInStyleContext {
		public TerminalNode CSS_MODE_TILDE_SEL() { return getToken(FlaskParser.CSS_MODE_TILDE_SEL, 0); }
		public SiblingCombInStyleContext(CssCombinatorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSiblingCombInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSiblingCombInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSiblingCombInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCombinatorInStyleContext cssCombinatorInStyle() throws RecognitionException {
		CssCombinatorInStyleContext _localctx = new CssCombinatorInStyleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cssCombinatorInStyle);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_GT:
				_localctx = new ChildCombInStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(CSS_MODE_GT);
				}
				break;
			case CSS_MODE_PLUS:
				_localctx = new AdjacentCombInStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(CSS_MODE_PLUS);
				}
				break;
			case CSS_MODE_TILDE_SEL:
				_localctx = new SiblingCombInStyleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(CSS_MODE_TILDE_SEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSimpleSelectorSeqInStyleContext extends ParserRuleContext {
		public CssSimpleSelectorSeqInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSimpleSelectorSeqInStyle; }
	 
		public CssSimpleSelectorSeqInStyleContext() { }
		public void copyFrom(CssSimpleSelectorSeqInStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JustClassIdAttrPseudoInStyleContext extends CssSimpleSelectorSeqInStyleContext {
		public List<CssSubSelectorInStyleContext> cssSubSelectorInStyle() {
			return getRuleContexts(CssSubSelectorInStyleContext.class);
		}
		public CssSubSelectorInStyleContext cssSubSelectorInStyle(int i) {
			return getRuleContext(CssSubSelectorInStyleContext.class,i);
		}
		public JustClassIdAttrPseudoInStyleContext(CssSimpleSelectorSeqInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJustClassIdAttrPseudoInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJustClassIdAttrPseudoInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJustClassIdAttrPseudoInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorWithModifiersInStyleContext extends CssSimpleSelectorSeqInStyleContext {
		public CssBaseSelectorInStyleContext cssBaseSelectorInStyle() {
			return getRuleContext(CssBaseSelectorInStyleContext.class,0);
		}
		public List<CssSubSelectorInStyleContext> cssSubSelectorInStyle() {
			return getRuleContexts(CssSubSelectorInStyleContext.class);
		}
		public CssSubSelectorInStyleContext cssSubSelectorInStyle(int i) {
			return getRuleContext(CssSubSelectorInStyleContext.class,i);
		}
		public TypeSelectorWithModifiersInStyleContext(CssSimpleSelectorSeqInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTypeSelectorWithModifiersInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTypeSelectorWithModifiersInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTypeSelectorWithModifiersInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSimpleSelectorSeqInStyleContext cssSimpleSelectorSeqInStyle() throws RecognitionException {
		CssSimpleSelectorSeqInStyleContext _localctx = new CssSimpleSelectorSeqInStyleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cssSimpleSelectorSeqInStyle);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_STAR:
			case CSS_MODE_IDENT:
				_localctx = new TypeSelectorWithModifiersInStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				cssBaseSelectorInStyle();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 459779L) != 0)) {
					{
					{
					setState(592);
					cssSubSelectorInStyle();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CSS_MODE_DCOLON:
			case CSS_MODE_COLON:
			case CSS_MODE_LBRACKET:
			case CSS_MODE_HEX_COLOR:
			case CSS_MODE_HASH:
			case CSS_MODE_DOT:
				_localctx = new JustClassIdAttrPseudoInStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(598);
					cssSubSelectorInStyle();
					}
					}
					setState(601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 459779L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBaseSelectorInStyleContext extends ParserRuleContext {
		public CssBaseSelectorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBaseSelectorInStyle; }
	 
		public CssBaseSelectorInStyleContext() { }
		public void copyFrom(CssBaseSelectorInStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorInStyleContext extends CssBaseSelectorInStyleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TypeSelectorInStyleContext(CssBaseSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTypeSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTypeSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTypeSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorInStyleContext extends CssBaseSelectorInStyleContext {
		public TerminalNode CSS_MODE_STAR() { return getToken(FlaskParser.CSS_MODE_STAR, 0); }
		public UniversalSelectorInStyleContext(CssBaseSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterUniversalSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitUniversalSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitUniversalSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBaseSelectorInStyleContext cssBaseSelectorInStyle() throws RecognitionException {
		CssBaseSelectorInStyleContext _localctx = new CssBaseSelectorInStyleContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cssBaseSelectorInStyle);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_IDENT:
				_localctx = new TypeSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_STAR:
				_localctx = new UniversalSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(CSS_MODE_STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSubSelectorInStyleContext extends ParserRuleContext {
		public CssSubSelectorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSubSelectorInStyle; }
	 
		public CssSubSelectorInStyleContext() { }
		public void copyFrom(CssSubSelectorInStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_HASH() { return getToken(FlaskParser.CSS_MODE_HASH, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public IdSelectorInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassSelectorInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_COLON() { return getToken(FlaskParser.CSS_MODE_COLON, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_LPAREN() { return getToken(FlaskParser.CSS_MODE_LPAREN, 0); }
		public CssFunctionArgsInStyleContext cssFunctionArgsInStyle() {
			return getRuleContext(CssFunctionArgsInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RPAREN() { return getToken(FlaskParser.CSS_MODE_RPAREN, 0); }
		public PseudoClassSelectorInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPseudoClassSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPseudoClassSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPseudoClassSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_DOT() { return getToken(FlaskParser.CSS_MODE_DOT, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public ClassSelectorInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterClassSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitClassSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitClassSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementSelectorInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_DCOLON() { return getToken(FlaskParser.CSS_MODE_DCOLON, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public PseudoElementSelectorInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPseudoElementSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPseudoElementSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPseudoElementSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSelectorInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_LBRACKET() { return getToken(FlaskParser.CSS_MODE_LBRACKET, 0); }
		public List<TerminalNode> CSS_MODE_IDENT() { return getTokens(FlaskParser.CSS_MODE_IDENT); }
		public TerminalNode CSS_MODE_IDENT(int i) {
			return getToken(FlaskParser.CSS_MODE_IDENT, i);
		}
		public TerminalNode CSS_MODE_RBRACKET() { return getToken(FlaskParser.CSS_MODE_RBRACKET, 0); }
		public CssAttrOperatorInStyleContext cssAttrOperatorInStyle() {
			return getRuleContext(CssAttrOperatorInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_STRING_DQ() { return getToken(FlaskParser.CSS_MODE_STRING_DQ, 0); }
		public TerminalNode CSS_MODE_STRING_SQ() { return getToken(FlaskParser.CSS_MODE_STRING_SQ, 0); }
		public AttrSelectorInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAttrSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAttrSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAttrSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorHexInStyleContext extends CssSubSelectorInStyleContext {
		public TerminalNode CSS_MODE_HEX_COLOR() { return getToken(FlaskParser.CSS_MODE_HEX_COLOR, 0); }
		public IdSelectorHexInStyleContext(CssSubSelectorInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdSelectorHexInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdSelectorHexInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdSelectorHexInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSubSelectorInStyleContext cssSubSelectorInStyle() throws RecognitionException {
		CssSubSelectorInStyleContext _localctx = new CssSubSelectorInStyleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cssSubSelectorInStyle);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_DOT:
				_localctx = new ClassSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(CSS_MODE_DOT);
				setState(610);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_HASH:
				_localctx = new IdSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(CSS_MODE_HASH);
				setState(612);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_HEX_COLOR:
				_localctx = new IdSelectorHexInStyleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(CSS_MODE_HEX_COLOR);
				}
				break;
			case CSS_MODE_COLON:
				_localctx = new PseudoClassSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(CSS_MODE_COLON);
				setState(615);
				match(CSS_MODE_IDENT);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MODE_LPAREN) {
					{
					setState(616);
					match(CSS_MODE_LPAREN);
					setState(617);
					cssFunctionArgsInStyle();
					setState(618);
					match(CSS_MODE_RPAREN);
					}
				}

				}
				break;
			case CSS_MODE_DCOLON:
				_localctx = new PseudoElementSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				match(CSS_MODE_DCOLON);
				setState(623);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_LBRACKET:
				_localctx = new AttrSelectorInStyleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(624);
				match(CSS_MODE_LBRACKET);
				setState(625);
				match(CSS_MODE_IDENT);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MODE_ASSIGN || _la==CSS_MODE_IDENT) {
					{
					setState(626);
					cssAttrOperatorInStyle();
					setState(627);
					_la = _input.LA(1);
					if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(631);
				match(CSS_MODE_RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssAttrOperatorInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_ASSIGN() { return getToken(FlaskParser.CSS_MODE_ASSIGN, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public CssAttrOperatorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAttrOperatorInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssAttrOperatorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssAttrOperatorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssAttrOperatorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAttrOperatorInStyleContext cssAttrOperatorInStyle() throws RecognitionException {
		CssAttrOperatorInStyleContext _localctx = new CssAttrOperatorInStyleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cssAttrOperatorInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !(_la==CSS_MODE_ASSIGN || _la==CSS_MODE_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionArgsInStyleContext extends ParserRuleContext {
		public List<CssValueInStyleContext> cssValueInStyle() {
			return getRuleContexts(CssValueInStyleContext.class);
		}
		public CssValueInStyleContext cssValueInStyle(int i) {
			return getRuleContext(CssValueInStyleContext.class,i);
		}
		public List<TerminalNode> CSS_MODE_COMMA() { return getTokens(FlaskParser.CSS_MODE_COMMA); }
		public TerminalNode CSS_MODE_COMMA(int i) {
			return getToken(FlaskParser.CSS_MODE_COMMA, i);
		}
		public CssFunctionArgsInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunctionArgsInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFunctionArgsInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFunctionArgsInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFunctionArgsInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionArgsInStyleContext cssFunctionArgsInStyle() throws RecognitionException {
		CssFunctionArgsInStyleContext _localctx = new CssFunctionArgsInStyleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cssFunctionArgsInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			cssValueInStyle();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_MODE_COMMA) {
				{
				{
				setState(637);
				match(CSS_MODE_COMMA);
				setState(638);
				cssValueInStyle();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationBlockInStyleContext extends ParserRuleContext {
		public List<CssDeclarationInStyleContext> cssDeclarationInStyle() {
			return getRuleContexts(CssDeclarationInStyleContext.class);
		}
		public CssDeclarationInStyleContext cssDeclarationInStyle(int i) {
			return getRuleContext(CssDeclarationInStyleContext.class,i);
		}
		public List<TerminalNode> CSS_MODE_SEMICOLON() { return getTokens(FlaskParser.CSS_MODE_SEMICOLON); }
		public TerminalNode CSS_MODE_SEMICOLON(int i) {
			return getToken(FlaskParser.CSS_MODE_SEMICOLON, i);
		}
		public CssDeclarationBlockInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarationBlockInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssDeclarationBlockInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssDeclarationBlockInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssDeclarationBlockInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationBlockInStyleContext cssDeclarationBlockInStyle() throws RecognitionException {
		CssDeclarationBlockInStyleContext _localctx = new CssDeclarationBlockInStyleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cssDeclarationBlockInStyle);
		int _la;
		try {
			int _alt;
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(644);
						cssDeclarationInStyle();
						setState(645);
						match(CSS_MODE_SEMICOLON);
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(652);
				cssDeclarationInStyle();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MODE_SEMICOLON) {
					{
					setState(653);
					match(CSS_MODE_SEMICOLON);
					}
				}

				}
				break;
			case CSS_MODE_RBRACE:
			case CSS_MODE_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_MODE_SEMICOLON) {
					{
					{
					setState(656);
					match(CSS_MODE_SEMICOLON);
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_COLON() { return getToken(FlaskParser.CSS_MODE_COLON, 0); }
		public CssValueListInStyleContext cssValueListInStyle() {
			return getRuleContext(CssValueListInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_IMPORTANT() { return getToken(FlaskParser.CSS_MODE_IMPORTANT, 0); }
		public CssDeclarationInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarationInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssDeclarationInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssDeclarationInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssDeclarationInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationInStyleContext cssDeclarationInStyle() throws RecognitionException {
		CssDeclarationInStyleContext _localctx = new CssDeclarationInStyleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cssDeclarationInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(CSS_MODE_IDENT);
			setState(665);
			match(CSS_MODE_COLON);
			setState(666);
			cssValueListInStyle();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_MODE_IMPORTANT) {
				{
				setState(667);
				match(CSS_MODE_IMPORTANT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueListInStyleContext extends ParserRuleContext {
		public List<CssValueInStyleContext> cssValueInStyle() {
			return getRuleContexts(CssValueInStyleContext.class);
		}
		public CssValueInStyleContext cssValueInStyle(int i) {
			return getRuleContext(CssValueInStyleContext.class,i);
		}
		public CssValueListInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueListInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssValueListInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssValueListInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssValueListInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListInStyleContext cssValueListInStyle() throws RecognitionException {
		CssValueListInStyleContext _localctx = new CssValueListInStyleContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cssValueListInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(670);
				cssValueInStyle();
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 16662561L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueInStyleContext extends ParserRuleContext {
		public CssValueInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueInStyle; }
	 
		public CssValueInStyleContext() { }
		public void copyFrom(CssValueInStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_SLASH() { return getToken(FlaskParser.CSS_MODE_SLASH, 0); }
		public SlashValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSlashValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSlashValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSlashValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_NUMBER() { return getToken(FlaskParser.CSS_MODE_NUMBER, 0); }
		public NumberValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterNumberValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitNumberValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitNumberValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_COMMA() { return getToken(FlaskParser.CSS_MODE_COMMA, 0); }
		public CommaValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCommaValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCommaValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCommaValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DqStringValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_STRING_DQ() { return getToken(FlaskParser.CSS_MODE_STRING_DQ, 0); }
		public DqStringValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDqStringValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDqStringValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDqStringValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_VAR() { return getToken(FlaskParser.CSS_MODE_VAR, 0); }
		public VarValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterVarValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitVarValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitVarValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DimensionValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_DIMENSION() { return getToken(FlaskParser.CSS_MODE_DIMENSION, 0); }
		public DimensionValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDimensionValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDimensionValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDimensionValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_HEX_COLOR() { return getToken(FlaskParser.CSS_MODE_HEX_COLOR, 0); }
		public HexColorValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterHexColorValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitHexColorValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitHexColorValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqStringValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_STRING_SQ() { return getToken(FlaskParser.CSS_MODE_STRING_SQ, 0); }
		public SqStringValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSqStringValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSqStringValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSqStringValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public IdentValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIdentValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIdentValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIdentValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlValueInStyleContext extends CssValueInStyleContext {
		public TerminalNode CSS_MODE_URL() { return getToken(FlaskParser.CSS_MODE_URL, 0); }
		public UrlValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterUrlValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitUrlValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitUrlValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncValueInStyleContext extends CssValueInStyleContext {
		public CssFunctionInStyleContext cssFunctionInStyle() {
			return getRuleContext(CssFunctionInStyleContext.class,0);
		}
		public FuncValueInStyleContext(CssValueInStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFuncValueInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFuncValueInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFuncValueInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueInStyleContext cssValueInStyle() throws RecognitionException {
		CssValueInStyleContext _localctx = new CssValueInStyleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cssValueInStyle);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new IdentValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(CSS_MODE_IDENT);
				}
				break;
			case 2:
				_localctx = new DimensionValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(CSS_MODE_DIMENSION);
				}
				break;
			case 3:
				_localctx = new NumberValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(CSS_MODE_NUMBER);
				}
				break;
			case 4:
				_localctx = new HexColorValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(CSS_MODE_HEX_COLOR);
				}
				break;
			case 5:
				_localctx = new DqStringValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(CSS_MODE_STRING_DQ);
				}
				break;
			case 6:
				_localctx = new SqStringValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				match(CSS_MODE_STRING_SQ);
				}
				break;
			case 7:
				_localctx = new UrlValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				match(CSS_MODE_URL);
				}
				break;
			case 8:
				_localctx = new VarValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(682);
				match(CSS_MODE_VAR);
				}
				break;
			case 9:
				_localctx = new SlashValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(683);
				match(CSS_MODE_SLASH);
				}
				break;
			case 10:
				_localctx = new CommaValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(684);
				match(CSS_MODE_COMMA);
				}
				break;
			case 11:
				_localctx = new FuncValueInStyleContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(685);
				cssFunctionInStyle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_LPAREN() { return getToken(FlaskParser.CSS_MODE_LPAREN, 0); }
		public CssFunctionArgsInStyleContext cssFunctionArgsInStyle() {
			return getRuleContext(CssFunctionArgsInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RPAREN() { return getToken(FlaskParser.CSS_MODE_RPAREN, 0); }
		public CssFunctionInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunctionInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFunctionInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFunctionInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFunctionInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionInStyleContext cssFunctionInStyle() throws RecognitionException {
		CssFunctionInStyleContext _localctx = new CssFunctionInStyleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cssFunctionInStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(CSS_MODE_IDENT);
			setState(689);
			match(CSS_MODE_LPAREN);
			setState(690);
			cssFunctionArgsInStyle();
			setState(691);
			match(CSS_MODE_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleInStyleContext extends ParserRuleContext {
		public CssMediaRuleInStyleContext cssMediaRuleInStyle() {
			return getRuleContext(CssMediaRuleInStyleContext.class,0);
		}
		public CssKeyframesRuleInStyleContext cssKeyframesRuleInStyle() {
			return getRuleContext(CssKeyframesRuleInStyleContext.class,0);
		}
		public CssImportRuleInStyleContext cssImportRuleInStyle() {
			return getRuleContext(CssImportRuleInStyleContext.class,0);
		}
		public CssCharsetRuleInStyleContext cssCharsetRuleInStyle() {
			return getRuleContext(CssCharsetRuleInStyleContext.class,0);
		}
		public CssSupportsRuleInStyleContext cssSupportsRuleInStyle() {
			return getRuleContext(CssSupportsRuleInStyleContext.class,0);
		}
		public CssFontFaceRuleInStyleContext cssFontFaceRuleInStyle() {
			return getRuleContext(CssFontFaceRuleInStyleContext.class,0);
		}
		public CssAtRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssAtRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssAtRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssAtRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleInStyleContext cssAtRuleInStyle() throws RecognitionException {
		CssAtRuleInStyleContext _localctx = new CssAtRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cssAtRuleInStyle);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_AT_MEDIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				cssMediaRuleInStyle();
				}
				break;
			case CSS_MODE_AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				cssKeyframesRuleInStyle();
				}
				break;
			case CSS_MODE_AT_IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				cssImportRuleInStyle();
				}
				break;
			case CSS_MODE_AT_CHARSET:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				cssCharsetRuleInStyle();
				}
				break;
			case CSS_MODE_AT_SUPPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(697);
				cssSupportsRuleInStyle();
				}
				break;
			case CSS_MODE_AT_FONT_FACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(698);
				cssFontFaceRuleInStyle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_MEDIA() { return getToken(FlaskParser.CSS_MODE_AT_MEDIA, 0); }
		public CssMediaQueryInStyleContext cssMediaQueryInStyle() {
			return getRuleContext(CssMediaQueryInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public List<CssItemInStyleContext> cssItemInStyle() {
			return getRuleContexts(CssItemInStyleContext.class);
		}
		public CssItemInStyleContext cssItemInStyle(int i) {
			return getRuleContext(CssItemInStyleContext.class,i);
		}
		public CssMediaRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaRuleInStyleContext cssMediaRuleInStyle() throws RecognitionException {
		CssMediaRuleInStyleContext _localctx = new CssMediaRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cssMediaRuleInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(CSS_MODE_AT_MEDIA);
			setState(702);
			cssMediaQueryInStyle();
			setState(703);
			match(CSS_MODE_LBRACE);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 17415280191L) != 0)) {
				{
				{
				setState(704);
				cssItemInStyle();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryInStyleContext extends ParserRuleContext {
		public List<CssMediaQueryTermInStyleContext> cssMediaQueryTermInStyle() {
			return getRuleContexts(CssMediaQueryTermInStyleContext.class);
		}
		public CssMediaQueryTermInStyleContext cssMediaQueryTermInStyle(int i) {
			return getRuleContext(CssMediaQueryTermInStyleContext.class,i);
		}
		public List<TerminalNode> CSS_MODE_IDENT() { return getTokens(FlaskParser.CSS_MODE_IDENT); }
		public TerminalNode CSS_MODE_IDENT(int i) {
			return getToken(FlaskParser.CSS_MODE_IDENT, i);
		}
		public CssMediaQueryInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQueryInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaQueryInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaQueryInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaQueryInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryInStyleContext cssMediaQueryInStyle() throws RecognitionException {
		CssMediaQueryInStyleContext _localctx = new CssMediaQueryInStyleContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cssMediaQueryInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			cssMediaQueryTermInStyle();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_MODE_IDENT) {
				{
				{
				setState(713);
				match(CSS_MODE_IDENT);
				setState(714);
				cssMediaQueryTermInStyle();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryTermInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_LPAREN() { return getToken(FlaskParser.CSS_MODE_LPAREN, 0); }
		public TerminalNode CSS_MODE_COLON() { return getToken(FlaskParser.CSS_MODE_COLON, 0); }
		public CssValueInStyleContext cssValueInStyle() {
			return getRuleContext(CssValueInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RPAREN() { return getToken(FlaskParser.CSS_MODE_RPAREN, 0); }
		public CssMediaQueryTermInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQueryTermInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssMediaQueryTermInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssMediaQueryTermInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssMediaQueryTermInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryTermInStyleContext cssMediaQueryTermInStyle() throws RecognitionException {
		CssMediaQueryTermInStyleContext _localctx = new CssMediaQueryTermInStyleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cssMediaQueryTermInStyle);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(CSS_MODE_LPAREN);
				setState(722);
				match(CSS_MODE_IDENT);
				setState(723);
				match(CSS_MODE_COLON);
				setState(724);
				cssValueInStyle();
				setState(725);
				match(CSS_MODE_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframesRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_KEYFRAMES() { return getToken(FlaskParser.CSS_MODE_AT_KEYFRAMES, 0); }
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public List<CssKeyframeBlockInStyleContext> cssKeyframeBlockInStyle() {
			return getRuleContexts(CssKeyframeBlockInStyleContext.class);
		}
		public CssKeyframeBlockInStyleContext cssKeyframeBlockInStyle(int i) {
			return getRuleContext(CssKeyframeBlockInStyleContext.class,i);
		}
		public CssKeyframesRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframesRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframesRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframesRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframesRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframesRuleInStyleContext cssKeyframesRuleInStyle() throws RecognitionException {
		CssKeyframesRuleInStyleContext _localctx = new CssKeyframesRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cssKeyframesRuleInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(CSS_MODE_AT_KEYFRAMES);
			setState(730);
			match(CSS_MODE_IDENT);
			setState(731);
			match(CSS_MODE_LBRACE);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_MODE_DIMENSION || _la==CSS_MODE_IDENT) {
				{
				{
				setState(732);
				cssKeyframeBlockInStyle();
				}
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(738);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframeBlockInStyleContext extends ParserRuleContext {
		public CssKeyframeSelectorInStyleContext cssKeyframeSelectorInStyle() {
			return getRuleContext(CssKeyframeSelectorInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public CssDeclarationBlockInStyleContext cssDeclarationBlockInStyle() {
			return getRuleContext(CssDeclarationBlockInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public CssKeyframeBlockInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframeBlockInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframeBlockInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframeBlockInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframeBlockInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframeBlockInStyleContext cssKeyframeBlockInStyle() throws RecognitionException {
		CssKeyframeBlockInStyleContext _localctx = new CssKeyframeBlockInStyleContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cssKeyframeBlockInStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			cssKeyframeSelectorInStyle();
			setState(741);
			match(CSS_MODE_LBRACE);
			setState(742);
			cssDeclarationBlockInStyle();
			setState(743);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyframeSelectorInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_DIMENSION() { return getToken(FlaskParser.CSS_MODE_DIMENSION, 0); }
		public CssKeyframeSelectorInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyframeSelectorInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssKeyframeSelectorInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssKeyframeSelectorInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssKeyframeSelectorInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyframeSelectorInStyleContext cssKeyframeSelectorInStyle() throws RecognitionException {
		CssKeyframeSelectorInStyleContext _localctx = new CssKeyframeSelectorInStyleContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cssKeyframeSelectorInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !(_la==CSS_MODE_DIMENSION || _la==CSS_MODE_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssImportRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_IMPORT() { return getToken(FlaskParser.CSS_MODE_AT_IMPORT, 0); }
		public TerminalNode CSS_MODE_SEMICOLON() { return getToken(FlaskParser.CSS_MODE_SEMICOLON, 0); }
		public TerminalNode CSS_MODE_STRING_DQ() { return getToken(FlaskParser.CSS_MODE_STRING_DQ, 0); }
		public TerminalNode CSS_MODE_STRING_SQ() { return getToken(FlaskParser.CSS_MODE_STRING_SQ, 0); }
		public TerminalNode CSS_MODE_URL() { return getToken(FlaskParser.CSS_MODE_URL, 0); }
		public List<TerminalNode> CSS_MODE_IDENT() { return getTokens(FlaskParser.CSS_MODE_IDENT); }
		public TerminalNode CSS_MODE_IDENT(int i) {
			return getToken(FlaskParser.CSS_MODE_IDENT, i);
		}
		public List<TerminalNode> CSS_MODE_COMMA() { return getTokens(FlaskParser.CSS_MODE_COMMA); }
		public TerminalNode CSS_MODE_COMMA(int i) {
			return getToken(FlaskParser.CSS_MODE_COMMA, i);
		}
		public CssImportRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssImportRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssImportRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssImportRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssImportRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssImportRuleInStyleContext cssImportRuleInStyle() throws RecognitionException {
		CssImportRuleInStyleContext _localctx = new CssImportRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cssImportRuleInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(CSS_MODE_AT_IMPORT);
			setState(748);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 13L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_MODE_IDENT) {
				{
				setState(749);
				match(CSS_MODE_IDENT);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_MODE_COMMA) {
					{
					{
					setState(750);
					match(CSS_MODE_COMMA);
					setState(751);
					match(CSS_MODE_IDENT);
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(759);
			match(CSS_MODE_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCharsetRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_CHARSET() { return getToken(FlaskParser.CSS_MODE_AT_CHARSET, 0); }
		public TerminalNode CSS_MODE_SEMICOLON() { return getToken(FlaskParser.CSS_MODE_SEMICOLON, 0); }
		public TerminalNode CSS_MODE_STRING_DQ() { return getToken(FlaskParser.CSS_MODE_STRING_DQ, 0); }
		public TerminalNode CSS_MODE_STRING_SQ() { return getToken(FlaskParser.CSS_MODE_STRING_SQ, 0); }
		public CssCharsetRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCharsetRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssCharsetRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssCharsetRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssCharsetRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCharsetRuleInStyleContext cssCharsetRuleInStyle() throws RecognitionException {
		CssCharsetRuleInStyleContext _localctx = new CssCharsetRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cssCharsetRuleInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(CSS_MODE_AT_CHARSET);
			setState(762);
			_la = _input.LA(1);
			if ( !(_la==CSS_MODE_STRING_DQ || _la==CSS_MODE_STRING_SQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(763);
			match(CSS_MODE_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSupportsRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_SUPPORTS() { return getToken(FlaskParser.CSS_MODE_AT_SUPPORTS, 0); }
		public CssSupportsConditionInStyleContext cssSupportsConditionInStyle() {
			return getRuleContext(CssSupportsConditionInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public List<CssItemInStyleContext> cssItemInStyle() {
			return getRuleContexts(CssItemInStyleContext.class);
		}
		public CssItemInStyleContext cssItemInStyle(int i) {
			return getRuleContext(CssItemInStyleContext.class,i);
		}
		public CssSupportsRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSupportsRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSupportsRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSupportsRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSupportsRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSupportsRuleInStyleContext cssSupportsRuleInStyle() throws RecognitionException {
		CssSupportsRuleInStyleContext _localctx = new CssSupportsRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cssSupportsRuleInStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(CSS_MODE_AT_SUPPORTS);
			setState(766);
			cssSupportsConditionInStyle();
			setState(767);
			match(CSS_MODE_LBRACE);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 17415280191L) != 0)) {
				{
				{
				setState(768);
				cssItemInStyle();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSupportsConditionInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_IDENT() { return getToken(FlaskParser.CSS_MODE_IDENT, 0); }
		public TerminalNode CSS_MODE_LPAREN() { return getToken(FlaskParser.CSS_MODE_LPAREN, 0); }
		public TerminalNode CSS_MODE_COLON() { return getToken(FlaskParser.CSS_MODE_COLON, 0); }
		public CssValueInStyleContext cssValueInStyle() {
			return getRuleContext(CssValueInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RPAREN() { return getToken(FlaskParser.CSS_MODE_RPAREN, 0); }
		public CssSupportsConditionInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSupportsConditionInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssSupportsConditionInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssSupportsConditionInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssSupportsConditionInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSupportsConditionInStyleContext cssSupportsConditionInStyle() throws RecognitionException {
		CssSupportsConditionInStyleContext _localctx = new CssSupportsConditionInStyleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cssSupportsConditionInStyle);
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MODE_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(CSS_MODE_IDENT);
				}
				break;
			case CSS_MODE_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(CSS_MODE_LPAREN);
				setState(778);
				match(CSS_MODE_IDENT);
				setState(779);
				match(CSS_MODE_COLON);
				setState(780);
				cssValueInStyle();
				setState(781);
				match(CSS_MODE_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFontFaceRuleInStyleContext extends ParserRuleContext {
		public TerminalNode CSS_MODE_AT_FONT_FACE() { return getToken(FlaskParser.CSS_MODE_AT_FONT_FACE, 0); }
		public TerminalNode CSS_MODE_LBRACE() { return getToken(FlaskParser.CSS_MODE_LBRACE, 0); }
		public CssDeclarationBlockInStyleContext cssDeclarationBlockInStyle() {
			return getRuleContext(CssDeclarationBlockInStyleContext.class,0);
		}
		public TerminalNode CSS_MODE_RBRACE() { return getToken(FlaskParser.CSS_MODE_RBRACE, 0); }
		public CssFontFaceRuleInStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFontFaceRuleInStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCssFontFaceRuleInStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCssFontFaceRuleInStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCssFontFaceRuleInStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFontFaceRuleInStyleContext cssFontFaceRuleInStyle() throws RecognitionException {
		CssFontFaceRuleInStyleContext _localctx = new CssFontFaceRuleInStyleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cssFontFaceRuleInStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(CSS_MODE_AT_FONT_FACE);
			setState(786);
			match(CSS_MODE_LBRACE);
			setState(787);
			cssDeclarationBlockInStyle();
			setState(788);
			match(CSS_MODE_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2StatementContext extends ParserRuleContext {
		public J2ForStmtContext j2ForStmt() {
			return getRuleContext(J2ForStmtContext.class,0);
		}
		public J2IfStmtContext j2IfStmt() {
			return getRuleContext(J2IfStmtContext.class,0);
		}
		public J2ExtendsStmtContext j2ExtendsStmt() {
			return getRuleContext(J2ExtendsStmtContext.class,0);
		}
		public J2BlockStmtContext j2BlockStmt() {
			return getRuleContext(J2BlockStmtContext.class,0);
		}
		public J2IncludeStmtContext j2IncludeStmt() {
			return getRuleContext(J2IncludeStmtContext.class,0);
		}
		public J2SetStmtContext j2SetStmt() {
			return getRuleContext(J2SetStmtContext.class,0);
		}
		public J2MacroStmtContext j2MacroStmt() {
			return getRuleContext(J2MacroStmtContext.class,0);
		}
		public J2ImportStmtContext j2ImportStmt() {
			return getRuleContext(J2ImportStmtContext.class,0);
		}
		public J2FromImportStmtContext j2FromImportStmt() {
			return getRuleContext(J2FromImportStmtContext.class,0);
		}
		public J2WithStmtContext j2WithStmt() {
			return getRuleContext(J2WithStmtContext.class,0);
		}
		public J2CallStmtContext j2CallStmt() {
			return getRuleContext(J2CallStmtContext.class,0);
		}
		public J2StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2StatementContext j2Statement() throws RecognitionException {
		J2StatementContext _localctx = new J2StatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_j2Statement);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				j2ForStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				j2IfStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				j2ExtendsStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				j2BlockStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
				j2IncludeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(795);
				j2SetStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(796);
				j2MacroStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(797);
				j2ImportStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(798);
				j2FromImportStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(799);
				j2WithStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(800);
				j2CallStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ForStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_FOR() { return getToken(FlaskParser.J2S_FOR, 0); }
		public J2ForTargetContext j2ForTarget() {
			return getRuleContext(J2ForTargetContext.class,0);
		}
		public TerminalNode J2S_IN() { return getToken(FlaskParser.J2S_IN, 0); }
		public List<J2ExprContext> j2Expr() {
			return getRuleContexts(J2ExprContext.class);
		}
		public J2ExprContext j2Expr(int i) {
			return getRuleContext(J2ExprContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDFOR() { return getToken(FlaskParser.J2S_ENDFOR, 0); }
		public TerminalNode J2S_IF() { return getToken(FlaskParser.J2S_IF, 0); }
		public TerminalNode J2S_RECURSIVE() { return getToken(FlaskParser.J2S_RECURSIVE, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2ElseClauseContext j2ElseClause() {
			return getRuleContext(J2ElseClauseContext.class,0);
		}
		public J2ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ForStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ForStmtContext j2ForStmt() throws RecognitionException {
		J2ForStmtContext _localctx = new J2ForStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_j2ForStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(JINJA_STMT_OPEN);
			setState(804);
			match(J2S_FOR);
			setState(805);
			j2ForTarget();
			setState(806);
			match(J2S_IN);
			setState(807);
			j2Expr();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_IF) {
				{
				setState(808);
				match(J2S_IF);
				setState(809);
				j2Expr();
				}
			}

			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_RECURSIVE) {
				{
				setState(812);
				match(J2S_RECURSIVE);
				}
			}

			setState(815);
			match(JINJA_STMT_CLOSE);
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					htmlNode();
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(822);
				j2ElseClause();
				}
				break;
			}
			setState(825);
			match(JINJA_STMT_OPEN);
			setState(826);
			match(J2S_ENDFOR);
			setState(827);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ForTargetContext extends ParserRuleContext {
		public List<TerminalNode> J2S_ID() { return getTokens(FlaskParser.J2S_ID); }
		public TerminalNode J2S_ID(int i) {
			return getToken(FlaskParser.J2S_ID, i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2ForTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ForTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ForTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ForTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ForTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ForTargetContext j2ForTarget() throws RecognitionException {
		J2ForTargetContext _localctx = new J2ForTargetContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_j2ForTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(J2S_ID);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_COMMA) {
				{
				{
				setState(830);
				match(J2S_COMMA);
				setState(831);
				match(J2S_ID);
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_IF() { return getToken(FlaskParser.J2S_IF, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDIF() { return getToken(FlaskParser.J2S_ENDIF, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public List<J2ElifClauseContext> j2ElifClause() {
			return getRuleContexts(J2ElifClauseContext.class);
		}
		public J2ElifClauseContext j2ElifClause(int i) {
			return getRuleContext(J2ElifClauseContext.class,i);
		}
		public J2ElseClauseContext j2ElseClause() {
			return getRuleContext(J2ElseClauseContext.class,0);
		}
		public J2IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2IfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2IfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2IfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2IfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2IfStmtContext j2IfStmt() throws RecognitionException {
		J2IfStmtContext _localctx = new J2IfStmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_j2IfStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(JINJA_STMT_OPEN);
			setState(838);
			match(J2S_IF);
			setState(839);
			j2Expr();
			setState(840);
			match(JINJA_STMT_CLOSE);
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(841);
					htmlNode();
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(847);
					j2ElifClause();
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(853);
				j2ElseClause();
				}
				break;
			}
			setState(856);
			match(JINJA_STMT_OPEN);
			setState(857);
			match(J2S_ENDIF);
			setState(858);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ElifClauseContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_ELIF() { return getToken(FlaskParser.J2S_ELIF, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2ElifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ElifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ElifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ElifClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ElifClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ElifClauseContext j2ElifClause() throws RecognitionException {
		J2ElifClauseContext _localctx = new J2ElifClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_j2ElifClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(JINJA_STMT_OPEN);
			setState(861);
			match(J2S_ELIF);
			setState(862);
			j2Expr();
			setState(863);
			match(JINJA_STMT_CLOSE);
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(864);
					htmlNode();
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ElseClauseContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_ELSE() { return getToken(FlaskParser.J2S_ELSE, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ElseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ElseClauseContext j2ElseClause() throws RecognitionException {
		J2ElseClauseContext _localctx = new J2ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_j2ElseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(JINJA_STMT_OPEN);
			setState(871);
			match(J2S_ELSE);
			setState(872);
			match(JINJA_STMT_CLOSE);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(873);
					htmlNode();
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ExtendsStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_EXTENDS() { return getToken(FlaskParser.J2S_EXTENDS, 0); }
		public J2StringLiteralContext j2StringLiteral() {
			return getRuleContext(J2StringLiteralContext.class,0);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public J2ExtendsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ExtendsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ExtendsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ExtendsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ExtendsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ExtendsStmtContext j2ExtendsStmt() throws RecognitionException {
		J2ExtendsStmtContext _localctx = new J2ExtendsStmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_j2ExtendsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(JINJA_STMT_OPEN);
			setState(880);
			match(J2S_EXTENDS);
			setState(881);
			j2StringLiteral();
			setState(882);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2BlockStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_BLOCK() { return getToken(FlaskParser.J2S_BLOCK, 0); }
		public List<TerminalNode> J2S_ID() { return getTokens(FlaskParser.J2S_ID); }
		public TerminalNode J2S_ID(int i) {
			return getToken(FlaskParser.J2S_ID, i);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDBLOCK() { return getToken(FlaskParser.J2S_ENDBLOCK, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2BlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2BlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2BlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2BlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2BlockStmtContext j2BlockStmt() throws RecognitionException {
		J2BlockStmtContext _localctx = new J2BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_j2BlockStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(JINJA_STMT_OPEN);
			setState(885);
			match(J2S_BLOCK);
			setState(886);
			match(J2S_ID);
			setState(887);
			match(JINJA_STMT_CLOSE);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(888);
					htmlNode();
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(894);
			match(JINJA_STMT_OPEN);
			setState(895);
			match(J2S_ENDBLOCK);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_ID) {
				{
				setState(896);
				match(J2S_ID);
				}
			}

			setState(899);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2IncludeStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_INCLUDE() { return getToken(FlaskParser.J2S_INCLUDE, 0); }
		public J2StringLiteralContext j2StringLiteral() {
			return getRuleContext(J2StringLiteralContext.class,0);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public TerminalNode J2S_IGNORE_MISSING() { return getToken(FlaskParser.J2S_IGNORE_MISSING, 0); }
		public J2IncludeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2IncludeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2IncludeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2IncludeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2IncludeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2IncludeStmtContext j2IncludeStmt() throws RecognitionException {
		J2IncludeStmtContext _localctx = new J2IncludeStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_j2IncludeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(JINJA_STMT_OPEN);
			setState(902);
			match(J2S_INCLUDE);
			setState(903);
			j2StringLiteral();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_IGNORE_MISSING) {
				{
				setState(904);
				match(J2S_IGNORE_MISSING);
				}
			}

			setState(907);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2SetStmtContext extends ParserRuleContext {
		public J2SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2SetStmt; }
	 
		public J2SetStmtContext() { }
		public void copyFrom(J2SetStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSetStmtContext extends J2SetStmtContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_SET() { return getToken(FlaskParser.J2S_SET, 0); }
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_ASSIGN() { return getToken(FlaskParser.J2S_ASSIGN, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public SimpleSetStmtContext(J2SetStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSimpleSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSimpleSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSimpleSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSetStmtContext extends J2SetStmtContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_SET() { return getToken(FlaskParser.J2S_SET, 0); }
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDSET() { return getToken(FlaskParser.J2S_ENDSET, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public BlockSetStmtContext(J2SetStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterBlockSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitBlockSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitBlockSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2SetStmtContext j2SetStmt() throws RecognitionException {
		J2SetStmtContext _localctx = new J2SetStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_j2SetStmt);
		try {
			int _alt;
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new SimpleSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(JINJA_STMT_OPEN);
				setState(910);
				match(J2S_SET);
				setState(911);
				match(J2S_ID);
				setState(912);
				match(J2S_ASSIGN);
				setState(913);
				j2Expr();
				setState(914);
				match(JINJA_STMT_CLOSE);
				}
				break;
			case 2:
				_localctx = new BlockSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(JINJA_STMT_OPEN);
				setState(917);
				match(J2S_SET);
				setState(918);
				match(J2S_ID);
				setState(919);
				match(JINJA_STMT_CLOSE);
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(920);
						htmlNode();
						}
						} 
					}
					setState(925);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(926);
				match(JINJA_STMT_OPEN);
				setState(927);
				match(J2S_ENDSET);
				setState(928);
				match(JINJA_STMT_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2MacroStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_MACRO() { return getToken(FlaskParser.J2S_MACRO, 0); }
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_LPAREN() { return getToken(FlaskParser.J2S_LPAREN, 0); }
		public TerminalNode J2S_RPAREN() { return getToken(FlaskParser.J2S_RPAREN, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDMACRO() { return getToken(FlaskParser.J2S_ENDMACRO, 0); }
		public J2MacroArgsContext j2MacroArgs() {
			return getRuleContext(J2MacroArgsContext.class,0);
		}
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2MacroStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2MacroStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2MacroStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2MacroStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2MacroStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2MacroStmtContext j2MacroStmt() throws RecognitionException {
		J2MacroStmtContext _localctx = new J2MacroStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_j2MacroStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(JINJA_STMT_OPEN);
			setState(932);
			match(J2S_MACRO);
			setState(933);
			match(J2S_ID);
			setState(934);
			match(J2S_LPAREN);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_ID) {
				{
				setState(935);
				j2MacroArgs();
				}
			}

			setState(938);
			match(J2S_RPAREN);
			setState(939);
			match(JINJA_STMT_CLOSE);
			setState(943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(940);
					htmlNode();
					}
					} 
				}
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(946);
			match(JINJA_STMT_OPEN);
			setState(947);
			match(J2S_ENDMACRO);
			setState(948);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2MacroArgsContext extends ParserRuleContext {
		public List<J2MacroArgContext> j2MacroArg() {
			return getRuleContexts(J2MacroArgContext.class);
		}
		public J2MacroArgContext j2MacroArg(int i) {
			return getRuleContext(J2MacroArgContext.class,i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2MacroArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2MacroArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2MacroArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2MacroArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2MacroArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2MacroArgsContext j2MacroArgs() throws RecognitionException {
		J2MacroArgsContext _localctx = new J2MacroArgsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_j2MacroArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			j2MacroArg();
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_COMMA) {
				{
				{
				setState(951);
				match(J2S_COMMA);
				setState(952);
				j2MacroArg();
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2MacroArgContext extends ParserRuleContext {
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_ASSIGN() { return getToken(FlaskParser.J2S_ASSIGN, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public J2MacroArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2MacroArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2MacroArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2MacroArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2MacroArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2MacroArgContext j2MacroArg() throws RecognitionException {
		J2MacroArgContext _localctx = new J2MacroArgContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_j2MacroArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(J2S_ID);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_ASSIGN) {
				{
				setState(959);
				match(J2S_ASSIGN);
				setState(960);
				j2Expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ImportStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_IMPORT() { return getToken(FlaskParser.J2S_IMPORT, 0); }
		public J2StringLiteralContext j2StringLiteral() {
			return getRuleContext(J2StringLiteralContext.class,0);
		}
		public TerminalNode J2S_AS() { return getToken(FlaskParser.J2S_AS, 0); }
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public J2ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ImportStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ImportStmtContext j2ImportStmt() throws RecognitionException {
		J2ImportStmtContext _localctx = new J2ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_j2ImportStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(JINJA_STMT_OPEN);
			setState(964);
			match(J2S_IMPORT);
			setState(965);
			j2StringLiteral();
			setState(966);
			match(J2S_AS);
			setState(967);
			match(J2S_ID);
			setState(968);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2FromImportStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(FlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode J2S_FROM() { return getToken(FlaskParser.J2S_FROM, 0); }
		public J2StringLiteralContext j2StringLiteral() {
			return getRuleContext(J2StringLiteralContext.class,0);
		}
		public TerminalNode J2S_IMPORT() { return getToken(FlaskParser.J2S_IMPORT, 0); }
		public List<J2ImportNameContext> j2ImportName() {
			return getRuleContexts(J2ImportNameContext.class);
		}
		public J2ImportNameContext j2ImportName(int i) {
			return getRuleContext(J2ImportNameContext.class,i);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(FlaskParser.JINJA_STMT_CLOSE, 0); }
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2FromImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2FromImportStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2FromImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2FromImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2FromImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2FromImportStmtContext j2FromImportStmt() throws RecognitionException {
		J2FromImportStmtContext _localctx = new J2FromImportStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_j2FromImportStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(JINJA_STMT_OPEN);
			setState(971);
			match(J2S_FROM);
			setState(972);
			j2StringLiteral();
			setState(973);
			match(J2S_IMPORT);
			setState(974);
			j2ImportName();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_COMMA) {
				{
				{
				setState(975);
				match(J2S_COMMA);
				setState(976);
				j2ImportName();
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ImportNameContext extends ParserRuleContext {
		public List<TerminalNode> J2S_ID() { return getTokens(FlaskParser.J2S_ID); }
		public TerminalNode J2S_ID(int i) {
			return getToken(FlaskParser.J2S_ID, i);
		}
		public TerminalNode J2S_AS() { return getToken(FlaskParser.J2S_AS, 0); }
		public J2ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ImportName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ImportNameContext j2ImportName() throws RecognitionException {
		J2ImportNameContext _localctx = new J2ImportNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_j2ImportName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(J2S_ID);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_AS) {
				{
				setState(985);
				match(J2S_AS);
				setState(986);
				match(J2S_ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2WithStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_WITH() { return getToken(FlaskParser.J2S_WITH, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDWITH() { return getToken(FlaskParser.J2S_ENDWITH, 0); }
		public List<J2WithAssignmentContext> j2WithAssignment() {
			return getRuleContexts(J2WithAssignmentContext.class);
		}
		public J2WithAssignmentContext j2WithAssignment(int i) {
			return getRuleContext(J2WithAssignmentContext.class,i);
		}
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2WithStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2WithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2WithStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2WithStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2WithStmtContext j2WithStmt() throws RecognitionException {
		J2WithStmtContext _localctx = new J2WithStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_j2WithStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(JINJA_STMT_OPEN);
			setState(990);
			match(J2S_WITH);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_ID) {
				{
				setState(991);
				j2WithAssignment();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J2S_COMMA) {
					{
					{
					setState(992);
					match(J2S_COMMA);
					setState(993);
					j2WithAssignment();
					}
					}
					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1001);
			match(JINJA_STMT_CLOSE);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1002);
					htmlNode();
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(1008);
			match(JINJA_STMT_OPEN);
			setState(1009);
			match(J2S_ENDWITH);
			setState(1010);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2WithAssignmentContext extends ParserRuleContext {
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_ASSIGN() { return getToken(FlaskParser.J2S_ASSIGN, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public J2WithAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2WithAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2WithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2WithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2WithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2WithAssignmentContext j2WithAssignment() throws RecognitionException {
		J2WithAssignmentContext _localctx = new J2WithAssignmentContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_j2WithAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(J2S_ID);
			setState(1013);
			match(J2S_ASSIGN);
			setState(1014);
			j2Expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2CallStmtContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(FlaskParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(FlaskParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode J2S_CALL() { return getToken(FlaskParser.J2S_CALL, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(FlaskParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(FlaskParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode J2S_ENDCALL() { return getToken(FlaskParser.J2S_ENDCALL, 0); }
		public TerminalNode J2S_LPAREN() { return getToken(FlaskParser.J2S_LPAREN, 0); }
		public TerminalNode J2S_RPAREN() { return getToken(FlaskParser.J2S_RPAREN, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public J2MacroArgsContext j2MacroArgs() {
			return getRuleContext(J2MacroArgsContext.class,0);
		}
		public J2CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2CallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2CallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2CallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2CallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2CallStmtContext j2CallStmt() throws RecognitionException {
		J2CallStmtContext _localctx = new J2CallStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_j2CallStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(JINJA_STMT_OPEN);
			setState(1017);
			match(J2S_CALL);
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1018);
				match(J2S_LPAREN);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J2S_ID) {
					{
					setState(1019);
					j2MacroArgs();
					}
				}

				setState(1022);
				match(J2S_RPAREN);
				}
				break;
			}
			setState(1025);
			j2Expr();
			setState(1026);
			match(JINJA_STMT_CLOSE);
			setState(1030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1027);
					htmlNode();
					}
					} 
				}
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(1033);
			match(JINJA_STMT_OPEN);
			setState(1034);
			match(J2S_ENDCALL);
			setState(1035);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VariableContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_OPEN() { return getToken(FlaskParser.JINJA_VAR_OPEN, 0); }
		public J2VarExprContext j2VarExpr() {
			return getRuleContext(J2VarExprContext.class,0);
		}
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(FlaskParser.JINJA_VAR_CLOSE, 0); }
		public J2VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2Variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VariableContext j2Variable() throws RecognitionException {
		J2VariableContext _localctx = new J2VariableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_j2Variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(JINJA_VAR_OPEN);
			setState(1038);
			j2VarExpr();
			setState(1039);
			match(JINJA_VAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarExprContext extends ParserRuleContext {
		public J2VarPipeExprContext j2VarPipeExpr() {
			return getRuleContext(J2VarPipeExprContext.class,0);
		}
		public J2VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarExprContext j2VarExpr() throws RecognitionException {
		J2VarExprContext _localctx = new J2VarExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_j2VarExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			j2VarPipeExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPipeExprContext extends ParserRuleContext {
		public J2VarOrExprContext j2VarOrExpr() {
			return getRuleContext(J2VarOrExprContext.class,0);
		}
		public List<TerminalNode> J2V_PIPE() { return getTokens(FlaskParser.J2V_PIPE); }
		public TerminalNode J2V_PIPE(int i) {
			return getToken(FlaskParser.J2V_PIPE, i);
		}
		public List<J2FilterContext> j2Filter() {
			return getRuleContexts(J2FilterContext.class);
		}
		public J2FilterContext j2Filter(int i) {
			return getRuleContext(J2FilterContext.class,i);
		}
		public J2VarPipeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarPipeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarPipeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarPipeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarPipeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarPipeExprContext j2VarPipeExpr() throws RecognitionException {
		J2VarPipeExprContext _localctx = new J2VarPipeExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_j2VarPipeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			j2VarOrExpr();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2V_PIPE) {
				{
				{
				setState(1044);
				match(J2V_PIPE);
				setState(1045);
				j2Filter();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2FilterContext extends ParserRuleContext {
		public TerminalNode J2V_ID() { return getToken(FlaskParser.J2V_ID, 0); }
		public TerminalNode J2V_LPAREN() { return getToken(FlaskParser.J2V_LPAREN, 0); }
		public TerminalNode J2V_RPAREN() { return getToken(FlaskParser.J2V_RPAREN, 0); }
		public J2VarArgListContext j2VarArgList() {
			return getRuleContext(J2VarArgListContext.class,0);
		}
		public J2FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2Filter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2FilterContext j2Filter() throws RecognitionException {
		J2FilterContext _localctx = new J2FilterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_j2Filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(J2V_ID);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2V_LPAREN) {
				{
				setState(1052);
				match(J2V_LPAREN);
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 32916996321L) != 0)) {
					{
					setState(1053);
					j2VarArgList();
					}
				}

				setState(1056);
				match(J2V_RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarArgListContext extends ParserRuleContext {
		public List<J2VarOrExprContext> j2VarOrExpr() {
			return getRuleContexts(J2VarOrExprContext.class);
		}
		public J2VarOrExprContext j2VarOrExpr(int i) {
			return getRuleContext(J2VarOrExprContext.class,i);
		}
		public List<TerminalNode> J2V_COMMA() { return getTokens(FlaskParser.J2V_COMMA); }
		public TerminalNode J2V_COMMA(int i) {
			return getToken(FlaskParser.J2V_COMMA, i);
		}
		public J2VarArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarArgListContext j2VarArgList() throws RecognitionException {
		J2VarArgListContext _localctx = new J2VarArgListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_j2VarArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			j2VarOrExpr();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2V_COMMA) {
				{
				{
				setState(1060);
				match(J2V_COMMA);
				setState(1061);
				j2VarOrExpr();
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarOrExprContext extends ParserRuleContext {
		public List<J2VarAndExprContext> j2VarAndExpr() {
			return getRuleContexts(J2VarAndExprContext.class);
		}
		public J2VarAndExprContext j2VarAndExpr(int i) {
			return getRuleContext(J2VarAndExprContext.class,i);
		}
		public List<TerminalNode> J2V_OR() { return getTokens(FlaskParser.J2V_OR); }
		public TerminalNode J2V_OR(int i) {
			return getToken(FlaskParser.J2V_OR, i);
		}
		public J2VarOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarOrExprContext j2VarOrExpr() throws RecognitionException {
		J2VarOrExprContext _localctx = new J2VarOrExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_j2VarOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			j2VarAndExpr();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2V_OR) {
				{
				{
				setState(1068);
				match(J2V_OR);
				setState(1069);
				j2VarAndExpr();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarAndExprContext extends ParserRuleContext {
		public List<J2VarNotExprContext> j2VarNotExpr() {
			return getRuleContexts(J2VarNotExprContext.class);
		}
		public J2VarNotExprContext j2VarNotExpr(int i) {
			return getRuleContext(J2VarNotExprContext.class,i);
		}
		public List<TerminalNode> J2V_AND() { return getTokens(FlaskParser.J2V_AND); }
		public TerminalNode J2V_AND(int i) {
			return getToken(FlaskParser.J2V_AND, i);
		}
		public J2VarAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarAndExprContext j2VarAndExpr() throws RecognitionException {
		J2VarAndExprContext _localctx = new J2VarAndExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_j2VarAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			j2VarNotExpr();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2V_AND) {
				{
				{
				setState(1076);
				match(J2V_AND);
				setState(1077);
				j2VarNotExpr();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarNotExprContext extends ParserRuleContext {
		public J2VarNotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarNotExpr; }
	 
		public J2VarNotExprContext() { }
		public void copyFrom(J2VarNotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarComparePassThruContext extends J2VarNotExprContext {
		public J2VarCompareExprContext j2VarCompareExpr() {
			return getRuleContext(J2VarCompareExprContext.class,0);
		}
		public J2VarComparePassThruContext(J2VarNotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarComparePassThru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarComparePassThru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarComparePassThru(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarNotOpContext extends J2VarNotExprContext {
		public TerminalNode J2V_NOT() { return getToken(FlaskParser.J2V_NOT, 0); }
		public J2VarNotExprContext j2VarNotExpr() {
			return getRuleContext(J2VarNotExprContext.class,0);
		}
		public J2VarNotOpContext(J2VarNotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarNotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarNotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarNotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarNotExprContext j2VarNotExpr() throws RecognitionException {
		J2VarNotExprContext _localctx = new J2VarNotExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_j2VarNotExpr);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2V_NOT:
				_localctx = new J2VarNotOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				match(J2V_NOT);
				setState(1084);
				j2VarNotExpr();
				}
				break;
			case J2V_TRUE:
			case J2V_FALSE:
			case J2V_NONE:
			case J2V_PLUS:
			case J2V_MINUS:
			case J2V_LPAREN:
			case J2V_LBRACKET:
			case J2V_LBRACE:
			case J2V_STRING:
			case J2V_FLOAT:
			case J2V_INT:
			case J2V_ID:
				_localctx = new J2VarComparePassThruContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				j2VarCompareExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarCompareExprContext extends ParserRuleContext {
		public List<J2VarAddExprContext> j2VarAddExpr() {
			return getRuleContexts(J2VarAddExprContext.class);
		}
		public J2VarAddExprContext j2VarAddExpr(int i) {
			return getRuleContext(J2VarAddExprContext.class,i);
		}
		public List<TerminalNode> J2V_EQ() { return getTokens(FlaskParser.J2V_EQ); }
		public TerminalNode J2V_EQ(int i) {
			return getToken(FlaskParser.J2V_EQ, i);
		}
		public List<TerminalNode> J2V_NEQ() { return getTokens(FlaskParser.J2V_NEQ); }
		public TerminalNode J2V_NEQ(int i) {
			return getToken(FlaskParser.J2V_NEQ, i);
		}
		public List<TerminalNode> J2V_LT() { return getTokens(FlaskParser.J2V_LT); }
		public TerminalNode J2V_LT(int i) {
			return getToken(FlaskParser.J2V_LT, i);
		}
		public List<TerminalNode> J2V_GT() { return getTokens(FlaskParser.J2V_GT); }
		public TerminalNode J2V_GT(int i) {
			return getToken(FlaskParser.J2V_GT, i);
		}
		public List<TerminalNode> J2V_LTE() { return getTokens(FlaskParser.J2V_LTE); }
		public TerminalNode J2V_LTE(int i) {
			return getToken(FlaskParser.J2V_LTE, i);
		}
		public List<TerminalNode> J2V_GTE() { return getTokens(FlaskParser.J2V_GTE); }
		public TerminalNode J2V_GTE(int i) {
			return getToken(FlaskParser.J2V_GTE, i);
		}
		public List<TerminalNode> J2V_IN() { return getTokens(FlaskParser.J2V_IN); }
		public TerminalNode J2V_IN(int i) {
			return getToken(FlaskParser.J2V_IN, i);
		}
		public List<TerminalNode> J2V_IS() { return getTokens(FlaskParser.J2V_IS); }
		public TerminalNode J2V_IS(int i) {
			return getToken(FlaskParser.J2V_IS, i);
		}
		public J2VarCompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarCompareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarCompareExprContext j2VarCompareExpr() throws RecognitionException {
		J2VarCompareExprContext _localctx = new J2VarCompareExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_j2VarCompareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			j2VarAddExpr();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 3555L) != 0)) {
				{
				{
				setState(1089);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 3555L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1090);
				j2VarAddExpr();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarAddExprContext extends ParserRuleContext {
		public List<J2VarMulExprContext> j2VarMulExpr() {
			return getRuleContexts(J2VarMulExprContext.class);
		}
		public J2VarMulExprContext j2VarMulExpr(int i) {
			return getRuleContext(J2VarMulExprContext.class,i);
		}
		public List<TerminalNode> J2V_PLUS() { return getTokens(FlaskParser.J2V_PLUS); }
		public TerminalNode J2V_PLUS(int i) {
			return getToken(FlaskParser.J2V_PLUS, i);
		}
		public List<TerminalNode> J2V_MINUS() { return getTokens(FlaskParser.J2V_MINUS); }
		public TerminalNode J2V_MINUS(int i) {
			return getToken(FlaskParser.J2V_MINUS, i);
		}
		public List<TerminalNode> J2V_TILDE() { return getTokens(FlaskParser.J2V_TILDE); }
		public TerminalNode J2V_TILDE(int i) {
			return getToken(FlaskParser.J2V_TILDE, i);
		}
		public J2VarAddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarAddExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarAddExprContext j2VarAddExpr() throws RecognitionException {
		J2VarAddExprContext _localctx = new J2VarAddExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_j2VarAddExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			j2VarMulExpr();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 35L) != 0)) {
				{
				{
				setState(1097);
				_la = _input.LA(1);
				if ( !(((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1098);
				j2VarMulExpr();
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarMulExprContext extends ParserRuleContext {
		public List<J2VarUnaryExprContext> j2VarUnaryExpr() {
			return getRuleContexts(J2VarUnaryExprContext.class);
		}
		public J2VarUnaryExprContext j2VarUnaryExpr(int i) {
			return getRuleContext(J2VarUnaryExprContext.class,i);
		}
		public List<TerminalNode> J2V_STAR() { return getTokens(FlaskParser.J2V_STAR); }
		public TerminalNode J2V_STAR(int i) {
			return getToken(FlaskParser.J2V_STAR, i);
		}
		public List<TerminalNode> J2V_SLASH() { return getTokens(FlaskParser.J2V_SLASH); }
		public TerminalNode J2V_SLASH(int i) {
			return getToken(FlaskParser.J2V_SLASH, i);
		}
		public List<TerminalNode> J2V_PERCENT() { return getTokens(FlaskParser.J2V_PERCENT); }
		public TerminalNode J2V_PERCENT(int i) {
			return getToken(FlaskParser.J2V_PERCENT, i);
		}
		public List<TerminalNode> J2V_DSTAR() { return getTokens(FlaskParser.J2V_DSTAR); }
		public TerminalNode J2V_DSTAR(int i) {
			return getToken(FlaskParser.J2V_DSTAR, i);
		}
		public J2VarMulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarMulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarMulExprContext j2VarMulExpr() throws RecognitionException {
		J2VarMulExprContext _localctx = new J2VarMulExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_j2VarMulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			j2VarUnaryExpr();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 225L) != 0)) {
				{
				{
				setState(1105);
				_la = _input.LA(1);
				if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 225L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1106);
				j2VarUnaryExpr();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarUnaryExprContext extends ParserRuleContext {
		public J2VarUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarUnaryExpr; }
	 
		public J2VarUnaryExprContext() { }
		public void copyFrom(J2VarUnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarNegContext extends J2VarUnaryExprContext {
		public TerminalNode J2V_MINUS() { return getToken(FlaskParser.J2V_MINUS, 0); }
		public J2VarUnaryExprContext j2VarUnaryExpr() {
			return getRuleContext(J2VarUnaryExprContext.class,0);
		}
		public J2VarNegContext(J2VarUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPostfixPassThruContext extends J2VarUnaryExprContext {
		public J2VarPostfixExprContext j2VarPostfixExpr() {
			return getRuleContext(J2VarPostfixExprContext.class,0);
		}
		public J2VarPostfixPassThruContext(J2VarUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarPostfixPassThru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarPostfixPassThru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarPostfixPassThru(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPosContext extends J2VarUnaryExprContext {
		public TerminalNode J2V_PLUS() { return getToken(FlaskParser.J2V_PLUS, 0); }
		public J2VarUnaryExprContext j2VarUnaryExpr() {
			return getRuleContext(J2VarUnaryExprContext.class,0);
		}
		public J2VarPosContext(J2VarUnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarUnaryExprContext j2VarUnaryExpr() throws RecognitionException {
		J2VarUnaryExprContext _localctx = new J2VarUnaryExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_j2VarUnaryExpr);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2V_MINUS:
				_localctx = new J2VarNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(J2V_MINUS);
				setState(1113);
				j2VarUnaryExpr();
				}
				break;
			case J2V_PLUS:
				_localctx = new J2VarPosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(J2V_PLUS);
				setState(1115);
				j2VarUnaryExpr();
				}
				break;
			case J2V_TRUE:
			case J2V_FALSE:
			case J2V_NONE:
			case J2V_LPAREN:
			case J2V_LBRACKET:
			case J2V_LBRACE:
			case J2V_STRING:
			case J2V_FLOAT:
			case J2V_INT:
			case J2V_ID:
				_localctx = new J2VarPostfixPassThruContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1116);
				j2VarPostfixExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPostfixExprContext extends ParserRuleContext {
		public J2VarPrimaryContext j2VarPrimary() {
			return getRuleContext(J2VarPrimaryContext.class,0);
		}
		public List<J2VarPostfixSuffixContext> j2VarPostfixSuffix() {
			return getRuleContexts(J2VarPostfixSuffixContext.class);
		}
		public J2VarPostfixSuffixContext j2VarPostfixSuffix(int i) {
			return getRuleContext(J2VarPostfixSuffixContext.class,i);
		}
		public J2VarPostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarPostfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarPostfixExprContext j2VarPostfixExpr() throws RecognitionException {
		J2VarPostfixExprContext _localctx = new J2VarPostfixExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_j2VarPostfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			j2VarPrimary();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & 41L) != 0)) {
				{
				{
				setState(1120);
				j2VarPostfixSuffix();
				}
				}
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPostfixSuffixContext extends ParserRuleContext {
		public TerminalNode J2V_DOT() { return getToken(FlaskParser.J2V_DOT, 0); }
		public TerminalNode J2V_ID() { return getToken(FlaskParser.J2V_ID, 0); }
		public TerminalNode J2V_LBRACKET() { return getToken(FlaskParser.J2V_LBRACKET, 0); }
		public J2VarOrExprContext j2VarOrExpr() {
			return getRuleContext(J2VarOrExprContext.class,0);
		}
		public TerminalNode J2V_RBRACKET() { return getToken(FlaskParser.J2V_RBRACKET, 0); }
		public TerminalNode J2V_LPAREN() { return getToken(FlaskParser.J2V_LPAREN, 0); }
		public TerminalNode J2V_RPAREN() { return getToken(FlaskParser.J2V_RPAREN, 0); }
		public J2VarArgListContext j2VarArgList() {
			return getRuleContext(J2VarArgListContext.class,0);
		}
		public J2VarPostfixSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarPostfixSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarPostfixSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarPostfixSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarPostfixSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarPostfixSuffixContext j2VarPostfixSuffix() throws RecognitionException {
		J2VarPostfixSuffixContext _localctx = new J2VarPostfixSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_j2VarPostfixSuffix);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2V_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(J2V_DOT);
				setState(1127);
				match(J2V_ID);
				}
				break;
			case J2V_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				match(J2V_LBRACKET);
				setState(1129);
				j2VarOrExpr();
				setState(1130);
				match(J2V_RBRACKET);
				}
				break;
			case J2V_LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				match(J2V_LPAREN);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 32916996321L) != 0)) {
					{
					setState(1133);
					j2VarArgList();
					}
				}

				setState(1136);
				match(J2V_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarPrimaryContext extends ParserRuleContext {
		public J2VarPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarPrimary; }
	 
		public J2VarPrimaryContext() { }
		public void copyFrom(J2VarPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarIntContext extends J2VarPrimaryContext {
		public TerminalNode J2V_INT() { return getToken(FlaskParser.J2V_INT, 0); }
		public J2VarIntContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarFloatContext extends J2VarPrimaryContext {
		public TerminalNode J2V_FLOAT() { return getToken(FlaskParser.J2V_FLOAT, 0); }
		public J2VarFloatContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarTrueContext extends J2VarPrimaryContext {
		public TerminalNode J2V_TRUE() { return getToken(FlaskParser.J2V_TRUE, 0); }
		public J2VarTrueContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarDictContext extends J2VarPrimaryContext {
		public TerminalNode J2V_LBRACE() { return getToken(FlaskParser.J2V_LBRACE, 0); }
		public TerminalNode J2V_RBRACE() { return getToken(FlaskParser.J2V_RBRACE, 0); }
		public List<J2VarDictPairContext> j2VarDictPair() {
			return getRuleContexts(J2VarDictPairContext.class);
		}
		public J2VarDictPairContext j2VarDictPair(int i) {
			return getRuleContext(J2VarDictPairContext.class,i);
		}
		public List<TerminalNode> J2V_COMMA() { return getTokens(FlaskParser.J2V_COMMA); }
		public TerminalNode J2V_COMMA(int i) {
			return getToken(FlaskParser.J2V_COMMA, i);
		}
		public J2VarDictContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarListContext extends J2VarPrimaryContext {
		public TerminalNode J2V_LBRACKET() { return getToken(FlaskParser.J2V_LBRACKET, 0); }
		public TerminalNode J2V_RBRACKET() { return getToken(FlaskParser.J2V_RBRACKET, 0); }
		public List<J2VarOrExprContext> j2VarOrExpr() {
			return getRuleContexts(J2VarOrExprContext.class);
		}
		public J2VarOrExprContext j2VarOrExpr(int i) {
			return getRuleContext(J2VarOrExprContext.class,i);
		}
		public List<TerminalNode> J2V_COMMA() { return getTokens(FlaskParser.J2V_COMMA); }
		public TerminalNode J2V_COMMA(int i) {
			return getToken(FlaskParser.J2V_COMMA, i);
		}
		public J2VarListContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarIdContext extends J2VarPrimaryContext {
		public TerminalNode J2V_ID() { return getToken(FlaskParser.J2V_ID, 0); }
		public J2VarIdContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarStringContext extends J2VarPrimaryContext {
		public TerminalNode J2V_STRING() { return getToken(FlaskParser.J2V_STRING, 0); }
		public J2VarStringContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarFalseContext extends J2VarPrimaryContext {
		public TerminalNode J2V_FALSE() { return getToken(FlaskParser.J2V_FALSE, 0); }
		public J2VarFalseContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarNoneContext extends J2VarPrimaryContext {
		public TerminalNode J2V_NONE() { return getToken(FlaskParser.J2V_NONE, 0); }
		public J2VarNoneContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2VarParenContext extends J2VarPrimaryContext {
		public TerminalNode J2V_LPAREN() { return getToken(FlaskParser.J2V_LPAREN, 0); }
		public J2VarOrExprContext j2VarOrExpr() {
			return getRuleContext(J2VarOrExprContext.class,0);
		}
		public TerminalNode J2V_RPAREN() { return getToken(FlaskParser.J2V_RPAREN, 0); }
		public J2VarParenContext(J2VarPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarPrimaryContext j2VarPrimary() throws RecognitionException {
		J2VarPrimaryContext _localctx = new J2VarPrimaryContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_j2VarPrimary);
		int _la;
		try {
			setState(1174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2V_ID:
				_localctx = new J2VarIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				match(J2V_ID);
				}
				break;
			case J2V_INT:
				_localctx = new J2VarIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				match(J2V_INT);
				}
				break;
			case J2V_FLOAT:
				_localctx = new J2VarFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1141);
				match(J2V_FLOAT);
				}
				break;
			case J2V_STRING:
				_localctx = new J2VarStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1142);
				match(J2V_STRING);
				}
				break;
			case J2V_TRUE:
				_localctx = new J2VarTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1143);
				match(J2V_TRUE);
				}
				break;
			case J2V_FALSE:
				_localctx = new J2VarFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1144);
				match(J2V_FALSE);
				}
				break;
			case J2V_NONE:
				_localctx = new J2VarNoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1145);
				match(J2V_NONE);
				}
				break;
			case J2V_LPAREN:
				_localctx = new J2VarParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1146);
				match(J2V_LPAREN);
				setState(1147);
				j2VarOrExpr();
				setState(1148);
				match(J2V_RPAREN);
				}
				break;
			case J2V_LBRACKET:
				_localctx = new J2VarListContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1150);
				match(J2V_LBRACKET);
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 32916996321L) != 0)) {
					{
					setState(1151);
					j2VarOrExpr();
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==J2V_COMMA) {
						{
						{
						setState(1152);
						match(J2V_COMMA);
						setState(1153);
						j2VarOrExpr();
						}
						}
						setState(1158);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1161);
				match(J2V_RBRACKET);
				}
				break;
			case J2V_LBRACE:
				_localctx = new J2VarDictContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1162);
				match(J2V_LBRACE);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 32916996321L) != 0)) {
					{
					setState(1163);
					j2VarDictPair();
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==J2V_COMMA) {
						{
						{
						setState(1164);
						match(J2V_COMMA);
						setState(1165);
						j2VarDictPair();
						}
						}
						setState(1170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1173);
				match(J2V_RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2VarDictPairContext extends ParserRuleContext {
		public List<J2VarOrExprContext> j2VarOrExpr() {
			return getRuleContexts(J2VarOrExprContext.class);
		}
		public J2VarOrExprContext j2VarOrExpr(int i) {
			return getRuleContext(J2VarOrExprContext.class,i);
		}
		public TerminalNode J2V_COLON() { return getToken(FlaskParser.J2V_COLON, 0); }
		public J2VarDictPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2VarDictPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2VarDictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2VarDictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2VarDictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2VarDictPairContext j2VarDictPair() throws RecognitionException {
		J2VarDictPairContext _localctx = new J2VarDictPairContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_j2VarDictPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			j2VarOrExpr();
			setState(1177);
			match(J2V_COLON);
			setState(1178);
			j2VarOrExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ExprContext extends ParserRuleContext {
		public J2PipeExprContext j2PipeExpr() {
			return getRuleContext(J2PipeExprContext.class,0);
		}
		public J2ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2Expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ExprContext j2Expr() throws RecognitionException {
		J2ExprContext _localctx = new J2ExprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_j2Expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			j2PipeExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2PipeExprContext extends ParserRuleContext {
		public J2OrExprContext j2OrExpr() {
			return getRuleContext(J2OrExprContext.class,0);
		}
		public List<TerminalNode> J2S_PIPE() { return getTokens(FlaskParser.J2S_PIPE); }
		public TerminalNode J2S_PIPE(int i) {
			return getToken(FlaskParser.J2S_PIPE, i);
		}
		public List<J2StmtFilterContext> j2StmtFilter() {
			return getRuleContexts(J2StmtFilterContext.class);
		}
		public J2StmtFilterContext j2StmtFilter(int i) {
			return getRuleContext(J2StmtFilterContext.class,i);
		}
		public J2PipeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2PipeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2PipeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2PipeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2PipeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2PipeExprContext j2PipeExpr() throws RecognitionException {
		J2PipeExprContext _localctx = new J2PipeExprContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_j2PipeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			j2OrExpr();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_PIPE) {
				{
				{
				setState(1183);
				match(J2S_PIPE);
				setState(1184);
				j2StmtFilter();
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2StmtFilterContext extends ParserRuleContext {
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_LPAREN() { return getToken(FlaskParser.J2S_LPAREN, 0); }
		public TerminalNode J2S_RPAREN() { return getToken(FlaskParser.J2S_RPAREN, 0); }
		public J2ArgListContext j2ArgList() {
			return getRuleContext(J2ArgListContext.class,0);
		}
		public J2StmtFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2StmtFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2StmtFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2StmtFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2StmtFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2StmtFilterContext j2StmtFilter() throws RecognitionException {
		J2StmtFilterContext _localctx = new J2StmtFilterContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_j2StmtFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(J2S_ID);
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J2S_LPAREN) {
				{
				setState(1191);
				match(J2S_LPAREN);
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 131667788225L) != 0)) {
					{
					setState(1192);
					j2ArgList();
					}
				}

				setState(1195);
				match(J2S_RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2OrExprContext extends ParserRuleContext {
		public List<J2AndExprContext> j2AndExpr() {
			return getRuleContexts(J2AndExprContext.class);
		}
		public J2AndExprContext j2AndExpr(int i) {
			return getRuleContext(J2AndExprContext.class,i);
		}
		public List<TerminalNode> J2S_OR() { return getTokens(FlaskParser.J2S_OR); }
		public TerminalNode J2S_OR(int i) {
			return getToken(FlaskParser.J2S_OR, i);
		}
		public J2OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2OrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2OrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2OrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2OrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2OrExprContext j2OrExpr() throws RecognitionException {
		J2OrExprContext _localctx = new J2OrExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_j2OrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			j2AndExpr();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_OR) {
				{
				{
				setState(1199);
				match(J2S_OR);
				setState(1200);
				j2AndExpr();
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2AndExprContext extends ParserRuleContext {
		public List<J2NotExprContext> j2NotExpr() {
			return getRuleContexts(J2NotExprContext.class);
		}
		public J2NotExprContext j2NotExpr(int i) {
			return getRuleContext(J2NotExprContext.class,i);
		}
		public List<TerminalNode> J2S_AND() { return getTokens(FlaskParser.J2S_AND); }
		public TerminalNode J2S_AND(int i) {
			return getToken(FlaskParser.J2S_AND, i);
		}
		public J2AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2AndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2AndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2AndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2AndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2AndExprContext j2AndExpr() throws RecognitionException {
		J2AndExprContext _localctx = new J2AndExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_j2AndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			j2NotExpr();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_AND) {
				{
				{
				setState(1207);
				match(J2S_AND);
				setState(1208);
				j2NotExpr();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2NotExprContext extends ParserRuleContext {
		public J2NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2NotExpr; }
	 
		public J2NotExprContext() { }
		public void copyFrom(J2NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2ComparePassThruContext extends J2NotExprContext {
		public J2CompareExprContext j2CompareExpr() {
			return getRuleContext(J2CompareExprContext.class,0);
		}
		public J2ComparePassThruContext(J2NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ComparePassThru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ComparePassThru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ComparePassThru(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2NotOpContext extends J2NotExprContext {
		public TerminalNode J2S_NOT() { return getToken(FlaskParser.J2S_NOT, 0); }
		public J2NotExprContext j2NotExpr() {
			return getRuleContext(J2NotExprContext.class,0);
		}
		public J2NotOpContext(J2NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2NotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2NotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2NotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2NotExprContext j2NotExpr() throws RecognitionException {
		J2NotExprContext _localctx = new J2NotExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_j2NotExpr);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2S_NOT:
				_localctx = new J2NotOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				match(J2S_NOT);
				setState(1215);
				j2NotExpr();
				}
				break;
			case J2S_TRUE:
			case J2S_FALSE:
			case J2S_NONE:
			case J2S_PLUS:
			case J2S_MINUS:
			case J2S_LPAREN:
			case J2S_LBRACKET:
			case J2S_LBRACE:
			case J2S_STRING:
			case J2S_FLOAT:
			case J2S_INT:
			case J2S_ID:
				_localctx = new J2ComparePassThruContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				j2CompareExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2CompareExprContext extends ParserRuleContext {
		public List<J2AddExprContext> j2AddExpr() {
			return getRuleContexts(J2AddExprContext.class);
		}
		public J2AddExprContext j2AddExpr(int i) {
			return getRuleContext(J2AddExprContext.class,i);
		}
		public List<TerminalNode> J2S_EQ() { return getTokens(FlaskParser.J2S_EQ); }
		public TerminalNode J2S_EQ(int i) {
			return getToken(FlaskParser.J2S_EQ, i);
		}
		public List<TerminalNode> J2S_NEQ() { return getTokens(FlaskParser.J2S_NEQ); }
		public TerminalNode J2S_NEQ(int i) {
			return getToken(FlaskParser.J2S_NEQ, i);
		}
		public List<TerminalNode> J2S_LT() { return getTokens(FlaskParser.J2S_LT); }
		public TerminalNode J2S_LT(int i) {
			return getToken(FlaskParser.J2S_LT, i);
		}
		public List<TerminalNode> J2S_GT() { return getTokens(FlaskParser.J2S_GT); }
		public TerminalNode J2S_GT(int i) {
			return getToken(FlaskParser.J2S_GT, i);
		}
		public List<TerminalNode> J2S_LTE() { return getTokens(FlaskParser.J2S_LTE); }
		public TerminalNode J2S_LTE(int i) {
			return getToken(FlaskParser.J2S_LTE, i);
		}
		public List<TerminalNode> J2S_GTE() { return getTokens(FlaskParser.J2S_GTE); }
		public TerminalNode J2S_GTE(int i) {
			return getToken(FlaskParser.J2S_GTE, i);
		}
		public List<TerminalNode> J2S_IN() { return getTokens(FlaskParser.J2S_IN); }
		public TerminalNode J2S_IN(int i) {
			return getToken(FlaskParser.J2S_IN, i);
		}
		public List<TerminalNode> J2S_IS() { return getTokens(FlaskParser.J2S_IS); }
		public TerminalNode J2S_IS(int i) {
			return getToken(FlaskParser.J2S_IS, i);
		}
		public J2CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2CompareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2CompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2CompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2CompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2CompareExprContext j2CompareExpr() throws RecognitionException {
		J2CompareExprContext _localctx = new J2CompareExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_j2CompareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			j2AddExpr();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 29102081L) != 0)) {
				{
				{
				setState(1220);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 29102081L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1221);
				j2AddExpr();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2AddExprContext extends ParserRuleContext {
		public List<J2MulExprContext> j2MulExpr() {
			return getRuleContexts(J2MulExprContext.class);
		}
		public J2MulExprContext j2MulExpr(int i) {
			return getRuleContext(J2MulExprContext.class,i);
		}
		public List<TerminalNode> J2S_PLUS() { return getTokens(FlaskParser.J2S_PLUS); }
		public TerminalNode J2S_PLUS(int i) {
			return getToken(FlaskParser.J2S_PLUS, i);
		}
		public List<TerminalNode> J2S_MINUS() { return getTokens(FlaskParser.J2S_MINUS); }
		public TerminalNode J2S_MINUS(int i) {
			return getToken(FlaskParser.J2S_MINUS, i);
		}
		public List<TerminalNode> J2S_TILDE() { return getTokens(FlaskParser.J2S_TILDE); }
		public TerminalNode J2S_TILDE(int i) {
			return getToken(FlaskParser.J2S_TILDE, i);
		}
		public J2AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2AddExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2AddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2AddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2AddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2AddExprContext j2AddExpr() throws RecognitionException {
		J2AddExprContext _localctx = new J2AddExprContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_j2AddExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			j2MulExpr();
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 35L) != 0)) {
				{
				{
				setState(1228);
				_la = _input.LA(1);
				if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1229);
				j2MulExpr();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2MulExprContext extends ParserRuleContext {
		public List<J2UnaryExprContext> j2UnaryExpr() {
			return getRuleContexts(J2UnaryExprContext.class);
		}
		public J2UnaryExprContext j2UnaryExpr(int i) {
			return getRuleContext(J2UnaryExprContext.class,i);
		}
		public List<TerminalNode> J2S_STAR() { return getTokens(FlaskParser.J2S_STAR); }
		public TerminalNode J2S_STAR(int i) {
			return getToken(FlaskParser.J2S_STAR, i);
		}
		public List<TerminalNode> J2S_SLASH() { return getTokens(FlaskParser.J2S_SLASH); }
		public TerminalNode J2S_SLASH(int i) {
			return getToken(FlaskParser.J2S_SLASH, i);
		}
		public List<TerminalNode> J2S_PERCENT() { return getTokens(FlaskParser.J2S_PERCENT); }
		public TerminalNode J2S_PERCENT(int i) {
			return getToken(FlaskParser.J2S_PERCENT, i);
		}
		public List<TerminalNode> J2S_DSTAR() { return getTokens(FlaskParser.J2S_DSTAR); }
		public TerminalNode J2S_DSTAR(int i) {
			return getToken(FlaskParser.J2S_DSTAR, i);
		}
		public J2MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2MulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2MulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2MulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2MulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2MulExprContext j2MulExpr() throws RecognitionException {
		J2MulExprContext _localctx = new J2MulExprContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_j2MulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			j2UnaryExpr();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 225L) != 0)) {
				{
				{
				setState(1236);
				_la = _input.LA(1);
				if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 225L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1237);
				j2UnaryExpr();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2UnaryExprContext extends ParserRuleContext {
		public J2UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2UnaryExpr; }
	 
		public J2UnaryExprContext() { }
		public void copyFrom(J2UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2NegExprContext extends J2UnaryExprContext {
		public TerminalNode J2S_MINUS() { return getToken(FlaskParser.J2S_MINUS, 0); }
		public J2UnaryExprContext j2UnaryExpr() {
			return getRuleContext(J2UnaryExprContext.class,0);
		}
		public J2NegExprContext(J2UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2NegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2NegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2NegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2PosExprContext extends J2UnaryExprContext {
		public TerminalNode J2S_PLUS() { return getToken(FlaskParser.J2S_PLUS, 0); }
		public J2UnaryExprContext j2UnaryExpr() {
			return getRuleContext(J2UnaryExprContext.class,0);
		}
		public J2PosExprContext(J2UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2PosExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2PosExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2PosExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2PostfixPassThruContext extends J2UnaryExprContext {
		public J2PostfixExprContext j2PostfixExpr() {
			return getRuleContext(J2PostfixExprContext.class,0);
		}
		public J2PostfixPassThruContext(J2UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2PostfixPassThru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2PostfixPassThru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2PostfixPassThru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2UnaryExprContext j2UnaryExpr() throws RecognitionException {
		J2UnaryExprContext _localctx = new J2UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_j2UnaryExpr);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2S_MINUS:
				_localctx = new J2NegExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				match(J2S_MINUS);
				setState(1244);
				j2UnaryExpr();
				}
				break;
			case J2S_PLUS:
				_localctx = new J2PosExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(J2S_PLUS);
				setState(1246);
				j2UnaryExpr();
				}
				break;
			case J2S_TRUE:
			case J2S_FALSE:
			case J2S_NONE:
			case J2S_LPAREN:
			case J2S_LBRACKET:
			case J2S_LBRACE:
			case J2S_STRING:
			case J2S_FLOAT:
			case J2S_INT:
			case J2S_ID:
				_localctx = new J2PostfixPassThruContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				j2PostfixExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2PostfixExprContext extends ParserRuleContext {
		public J2PrimaryContext j2Primary() {
			return getRuleContext(J2PrimaryContext.class,0);
		}
		public List<J2PostfixSuffixContext> j2PostfixSuffix() {
			return getRuleContexts(J2PostfixSuffixContext.class);
		}
		public J2PostfixSuffixContext j2PostfixSuffix(int i) {
			return getRuleContext(J2PostfixSuffixContext.class,i);
		}
		public J2PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2PostfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2PostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2PostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2PostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2PostfixExprContext j2PostfixExpr() throws RecognitionException {
		J2PostfixExprContext _localctx = new J2PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_j2PostfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			j2Primary();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 41L) != 0)) {
				{
				{
				setState(1251);
				j2PostfixSuffix();
				}
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2PostfixSuffixContext extends ParserRuleContext {
		public TerminalNode J2S_DOT() { return getToken(FlaskParser.J2S_DOT, 0); }
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_LBRACKET() { return getToken(FlaskParser.J2S_LBRACKET, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public TerminalNode J2S_RBRACKET() { return getToken(FlaskParser.J2S_RBRACKET, 0); }
		public TerminalNode J2S_LPAREN() { return getToken(FlaskParser.J2S_LPAREN, 0); }
		public TerminalNode J2S_RPAREN() { return getToken(FlaskParser.J2S_RPAREN, 0); }
		public J2ArgListContext j2ArgList() {
			return getRuleContext(J2ArgListContext.class,0);
		}
		public J2PostfixSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2PostfixSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2PostfixSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2PostfixSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2PostfixSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2PostfixSuffixContext j2PostfixSuffix() throws RecognitionException {
		J2PostfixSuffixContext _localctx = new J2PostfixSuffixContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_j2PostfixSuffix);
		int _la;
		try {
			setState(1268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2S_DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(J2S_DOT);
				setState(1258);
				match(J2S_ID);
				}
				break;
			case J2S_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(J2S_LBRACKET);
				setState(1260);
				j2Expr();
				setState(1261);
				match(J2S_RBRACKET);
				}
				break;
			case J2S_LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1263);
				match(J2S_LPAREN);
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 131667788225L) != 0)) {
					{
					setState(1264);
					j2ArgList();
					}
				}

				setState(1267);
				match(J2S_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ArgListContext extends ParserRuleContext {
		public List<J2ArgContext> j2Arg() {
			return getRuleContexts(J2ArgContext.class);
		}
		public J2ArgContext j2Arg(int i) {
			return getRuleContext(J2ArgContext.class,i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2ArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ArgListContext j2ArgList() throws RecognitionException {
		J2ArgListContext _localctx = new J2ArgListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_j2ArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			j2Arg();
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J2S_COMMA) {
				{
				{
				setState(1271);
				match(J2S_COMMA);
				setState(1272);
				j2Arg();
				}
				}
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2ArgContext extends ParserRuleContext {
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public TerminalNode J2S_ASSIGN() { return getToken(FlaskParser.J2S_ASSIGN, 0); }
		public J2ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2Arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2Arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2Arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2ArgContext j2Arg() throws RecognitionException {
		J2ArgContext _localctx = new J2ArgContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_j2Arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1278);
				match(J2S_ID);
				setState(1279);
				match(J2S_ASSIGN);
				}
				break;
			}
			setState(1282);
			j2Expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2PrimaryContext extends ParserRuleContext {
		public J2PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2Primary; }
	 
		public J2PrimaryContext() { }
		public void copyFrom(J2PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2FloatPrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_FLOAT() { return getToken(FlaskParser.J2S_FLOAT, 0); }
		public J2FloatPrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2FloatPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2FloatPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2FloatPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2IdPrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_ID() { return getToken(FlaskParser.J2S_ID, 0); }
		public J2IdPrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2IdPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2IdPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2IdPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2DictLiteralContext extends J2PrimaryContext {
		public TerminalNode J2S_LBRACE() { return getToken(FlaskParser.J2S_LBRACE, 0); }
		public TerminalNode J2S_RBRACE() { return getToken(FlaskParser.J2S_RBRACE, 0); }
		public List<J2DictPairContext> j2DictPair() {
			return getRuleContexts(J2DictPairContext.class);
		}
		public J2DictPairContext j2DictPair(int i) {
			return getRuleContext(J2DictPairContext.class,i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2DictLiteralContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2DictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2DictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2DictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2TruePrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_TRUE() { return getToken(FlaskParser.J2S_TRUE, 0); }
		public J2TruePrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2TruePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2TruePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2TruePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2FalsePrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_FALSE() { return getToken(FlaskParser.J2S_FALSE, 0); }
		public J2FalsePrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2FalsePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2FalsePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2FalsePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2ParenExprContext extends J2PrimaryContext {
		public TerminalNode J2S_LPAREN() { return getToken(FlaskParser.J2S_LPAREN, 0); }
		public J2ExprContext j2Expr() {
			return getRuleContext(J2ExprContext.class,0);
		}
		public TerminalNode J2S_RPAREN() { return getToken(FlaskParser.J2S_RPAREN, 0); }
		public J2ParenExprContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2IntPrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_INT() { return getToken(FlaskParser.J2S_INT, 0); }
		public J2IntPrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2IntPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2IntPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2IntPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2StringPrimaryContext extends J2PrimaryContext {
		public J2StringLiteralContext j2StringLiteral() {
			return getRuleContext(J2StringLiteralContext.class,0);
		}
		public J2StringPrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2StringPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2StringPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2StringPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2NonePrimaryContext extends J2PrimaryContext {
		public TerminalNode J2S_NONE() { return getToken(FlaskParser.J2S_NONE, 0); }
		public J2NonePrimaryContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2NonePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2NonePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2NonePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class J2ListLiteralContext extends J2PrimaryContext {
		public TerminalNode J2S_LBRACKET() { return getToken(FlaskParser.J2S_LBRACKET, 0); }
		public TerminalNode J2S_RBRACKET() { return getToken(FlaskParser.J2S_RBRACKET, 0); }
		public List<J2ExprContext> j2Expr() {
			return getRuleContexts(J2ExprContext.class);
		}
		public J2ExprContext j2Expr(int i) {
			return getRuleContext(J2ExprContext.class,i);
		}
		public List<TerminalNode> J2S_COMMA() { return getTokens(FlaskParser.J2S_COMMA); }
		public TerminalNode J2S_COMMA(int i) {
			return getToken(FlaskParser.J2S_COMMA, i);
		}
		public J2ListLiteralContext(J2PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2ListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2ListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2ListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2PrimaryContext j2Primary() throws RecognitionException {
		J2PrimaryContext _localctx = new J2PrimaryContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_j2Primary);
		int _la;
		try {
			setState(1319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J2S_ID:
				_localctx = new J2IdPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				match(J2S_ID);
				}
				break;
			case J2S_INT:
				_localctx = new J2IntPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				match(J2S_INT);
				}
				break;
			case J2S_FLOAT:
				_localctx = new J2FloatPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1286);
				match(J2S_FLOAT);
				}
				break;
			case J2S_STRING:
				_localctx = new J2StringPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1287);
				j2StringLiteral();
				}
				break;
			case J2S_TRUE:
				_localctx = new J2TruePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1288);
				match(J2S_TRUE);
				}
				break;
			case J2S_FALSE:
				_localctx = new J2FalsePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1289);
				match(J2S_FALSE);
				}
				break;
			case J2S_NONE:
				_localctx = new J2NonePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1290);
				match(J2S_NONE);
				}
				break;
			case J2S_LPAREN:
				_localctx = new J2ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1291);
				match(J2S_LPAREN);
				setState(1292);
				j2Expr();
				setState(1293);
				match(J2S_RPAREN);
				}
				break;
			case J2S_LBRACKET:
				_localctx = new J2ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1295);
				match(J2S_LBRACKET);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 131667788225L) != 0)) {
					{
					setState(1296);
					j2Expr();
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==J2S_COMMA) {
						{
						{
						setState(1297);
						match(J2S_COMMA);
						setState(1298);
						j2Expr();
						}
						}
						setState(1303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1306);
				match(J2S_RBRACKET);
				}
				break;
			case J2S_LBRACE:
				_localctx = new J2DictLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1307);
				match(J2S_LBRACE);
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 131667788225L) != 0)) {
					{
					setState(1308);
					j2DictPair();
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==J2S_COMMA) {
						{
						{
						setState(1309);
						match(J2S_COMMA);
						setState(1310);
						j2DictPair();
						}
						}
						setState(1315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1318);
				match(J2S_RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2DictPairContext extends ParserRuleContext {
		public List<J2ExprContext> j2Expr() {
			return getRuleContexts(J2ExprContext.class);
		}
		public J2ExprContext j2Expr(int i) {
			return getRuleContext(J2ExprContext.class,i);
		}
		public TerminalNode J2S_COLON() { return getToken(FlaskParser.J2S_COLON, 0); }
		public J2DictPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2DictPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2DictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2DictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2DictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2DictPairContext j2DictPair() throws RecognitionException {
		J2DictPairContext _localctx = new J2DictPairContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_j2DictPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			j2Expr();
			setState(1322);
			match(J2S_COLON);
			setState(1323);
			j2Expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J2StringLiteralContext extends ParserRuleContext {
		public TerminalNode J2S_STRING() { return getToken(FlaskParser.J2S_STRING, 0); }
		public J2StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j2StringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterJ2StringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitJ2StringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitJ2StringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J2StringLiteralContext j2StringLiteral() throws RecognitionException {
		J2StringLiteralContext _localctx = new J2StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_j2StringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			match(J2S_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c5\u0530\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0001\u0000"+
		"\u0005\u0000\u00f0\b\u0000\n\u0000\f\u0000\u00f3\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00fe\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0102\b\u0002\n\u0002\f\u0002\u0105\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u010c\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u0110\b\u0003\n\u0003\f\u0003\u0113\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u011c\b\u0005\n\u0005\f\u0005\u011f\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0129\b\u0007\n\u0007\f\u0007\u012c\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0133\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0139\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0005\u000b\u0140\b\u000b\n\u000b\f\u000b\u0143\t\u000b\u0001\f"+
		"\u0001\f\u0003\f\u0147\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0151\b\u000e\n\u000e\f\u000e"+
		"\u0154\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u015a\b\u000f\n\u000f\f\u000f\u015d\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0162\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0166"+
		"\b\u0011\n\u0011\f\u0011\u0169\t\u0011\u0001\u0011\u0004\u0011\u016c\b"+
		"\u0011\u000b\u0011\f\u0011\u016d\u0003\u0011\u0170\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0174\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0181\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u018a\b\u0013\u0001\u0013\u0003\u0013\u018d\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0194\b\u0015\n"+
		"\u0015\f\u0015\u0197\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u019c\b\u0016\n\u0016\f\u0016\u019f\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01a3\b\u0016\u0001\u0016\u0005\u0016\u01a6\b\u0016\n\u0016"+
		"\f\u0016\u01a9\t\u0016\u0003\u0016\u01ab\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01b1\b\u0017\u0001\u0018\u0004\u0018"+
		"\u01b4\b\u0018\u000b\u0018\f\u0018\u01b5\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c3\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01d0\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01d6\b\u001c\n"+
		"\u001c\f\u001c\u01d9\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01e0\b\u001d\n\u001d\f\u001d\u01e3\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01ec\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01f2\b\u001f\n\u001f\f\u001f\u01f5\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0205\b\"\n\"\f\"\u0208\t\""+
		"\u0003\"\u020a\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0005$\u0216\b$\n$\f$\u0219\t$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0224\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0005\'\u022c\b\'\n\'\f\'\u022f\t\'\u0001"+
		"(\u0001(\u0003(\u0233\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0005*\u023d\b*\n*\f*\u0240\t*\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u0246\b+\n+\f+\u0249\t+\u0001,\u0001,\u0001,\u0003,\u024e\b,\u0001-"+
		"\u0001-\u0005-\u0252\b-\n-\f-\u0255\t-\u0001-\u0004-\u0258\b-\u000b-\f"+
		"-\u0259\u0003-\u025c\b-\u0001.\u0001.\u0003.\u0260\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u026d"+
		"\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0276\b/\u0001"+
		"/\u0003/\u0279\b/\u00010\u00010\u00011\u00011\u00011\u00051\u0280\b1\n"+
		"1\f1\u0283\t1\u00012\u00012\u00012\u00052\u0288\b2\n2\f2\u028b\t2\u0001"+
		"2\u00012\u00032\u028f\b2\u00012\u00052\u0292\b2\n2\f2\u0295\t2\u00032"+
		"\u0297\b2\u00013\u00013\u00013\u00013\u00033\u029d\b3\u00014\u00044\u02a0"+
		"\b4\u000b4\f4\u02a1\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u02af\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u02bc\b7\u00018\u0001"+
		"8\u00018\u00018\u00058\u02c2\b8\n8\f8\u02c5\t8\u00018\u00018\u00019\u0001"+
		"9\u00019\u00059\u02cc\b9\n9\f9\u02cf\t9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u02d8\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u02de"+
		"\b;\n;\f;\u02e1\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u02f1\b>\n>\f>\u02f4"+
		"\t>\u0003>\u02f6\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0005@\u0302\b@\n@\f@\u0305\t@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0310\bA\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u0322\bC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u032b\bD\u0001D\u0003D\u032e\bD\u0001D\u0001D\u0005"+
		"D\u0332\bD\nD\fD\u0335\tD\u0001D\u0003D\u0338\bD\u0001D\u0001D\u0001D"+
		"\u0001D\u0001E\u0001E\u0001E\u0005E\u0341\bE\nE\fE\u0344\tE\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0005F\u034b\bF\nF\fF\u034e\tF\u0001F\u0005F\u0351"+
		"\bF\nF\fF\u0354\tF\u0001F\u0003F\u0357\bF\u0001F\u0001F\u0001F\u0001F"+
		"\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u0362\bG\nG\fG\u0365\tG\u0001"+
		"H\u0001H\u0001H\u0001H\u0005H\u036b\bH\nH\fH\u036e\tH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0005J\u037a\bJ\nJ"+
		"\fJ\u037d\tJ\u0001J\u0001J\u0001J\u0003J\u0382\bJ\u0001J\u0001J\u0001"+
		"K\u0001K\u0001K\u0001K\u0003K\u038a\bK\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0005"+
		"L\u039a\bL\nL\fL\u039d\tL\u0001L\u0001L\u0001L\u0003L\u03a2\bL\u0001M"+
		"\u0001M\u0001M\u0001M\u0001M\u0003M\u03a9\bM\u0001M\u0001M\u0001M\u0005"+
		"M\u03ae\bM\nM\fM\u03b1\tM\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0005N\u03ba\bN\nN\fN\u03bd\tN\u0001O\u0001O\u0001O\u0003O\u03c2\bO"+
		"\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u03d2\bQ\nQ\fQ\u03d5\tQ\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0001R\u0003R\u03dc\bR\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0005S\u03e3\bS\nS\fS\u03e6\tS\u0003S\u03e8\bS\u0001S\u0001S\u0005S"+
		"\u03ec\bS\nS\fS\u03ef\tS\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001"+
		"T\u0001T\u0001U\u0001U\u0001U\u0001U\u0003U\u03fd\bU\u0001U\u0003U\u0400"+
		"\bU\u0001U\u0001U\u0001U\u0005U\u0405\bU\nU\fU\u0408\tU\u0001U\u0001U"+
		"\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001X\u0001"+
		"X\u0001X\u0005X\u0417\bX\nX\fX\u041a\tX\u0001Y\u0001Y\u0001Y\u0003Y\u041f"+
		"\bY\u0001Y\u0003Y\u0422\bY\u0001Z\u0001Z\u0001Z\u0005Z\u0427\bZ\nZ\fZ"+
		"\u042a\tZ\u0001[\u0001[\u0001[\u0005[\u042f\b[\n[\f[\u0432\t[\u0001\\"+
		"\u0001\\\u0001\\\u0005\\\u0437\b\\\n\\\f\\\u043a\t\\\u0001]\u0001]\u0001"+
		"]\u0003]\u043f\b]\u0001^\u0001^\u0001^\u0005^\u0444\b^\n^\f^\u0447\t^"+
		"\u0001_\u0001_\u0001_\u0005_\u044c\b_\n_\f_\u044f\t_\u0001`\u0001`\u0001"+
		"`\u0005`\u0454\b`\n`\f`\u0457\t`\u0001a\u0001a\u0001a\u0001a\u0001a\u0003"+
		"a\u045e\ba\u0001b\u0001b\u0005b\u0462\bb\nb\fb\u0465\tb\u0001c\u0001c"+
		"\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u046f\bc\u0001c\u0003"+
		"c\u0472\bc\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d\u0483\bd\nd\fd\u0486"+
		"\td\u0003d\u0488\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d\u048f\b"+
		"d\nd\fd\u0492\td\u0003d\u0494\bd\u0001d\u0003d\u0497\bd\u0001e\u0001e"+
		"\u0001e\u0001e\u0001f\u0001f\u0001g\u0001g\u0001g\u0005g\u04a2\bg\ng\f"+
		"g\u04a5\tg\u0001h\u0001h\u0001h\u0003h\u04aa\bh\u0001h\u0003h\u04ad\b"+
		"h\u0001i\u0001i\u0001i\u0005i\u04b2\bi\ni\fi\u04b5\ti\u0001j\u0001j\u0001"+
		"j\u0005j\u04ba\bj\nj\fj\u04bd\tj\u0001k\u0001k\u0001k\u0003k\u04c2\bk"+
		"\u0001l\u0001l\u0001l\u0005l\u04c7\bl\nl\fl\u04ca\tl\u0001m\u0001m\u0001"+
		"m\u0005m\u04cf\bm\nm\fm\u04d2\tm\u0001n\u0001n\u0001n\u0005n\u04d7\bn"+
		"\nn\fn\u04da\tn\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u04e1\bo\u0001"+
		"p\u0001p\u0005p\u04e5\bp\np\fp\u04e8\tp\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0003q\u04f2\bq\u0001q\u0003q\u04f5\bq\u0001r\u0001"+
		"r\u0001r\u0005r\u04fa\br\nr\fr\u04fd\tr\u0001s\u0001s\u0003s\u0501\bs"+
		"\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0005t\u0514\bt\nt"+
		"\ft\u0517\tt\u0003t\u0519\bt\u0001t\u0001t\u0001t\u0001t\u0001t\u0005"+
		"t\u0520\bt\nt\ft\u0523\tt\u0003t\u0525\bt\u0001t\u0003t\u0528\bt\u0001"+
		"u\u0001u\u0001u\u0001u\u0001v\u0001v\u0001v\u0000\u0000w\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u0000\u0011\u0001\u0000bc\u0001\u0000$&\u0002\u0000"+
		"\u0019\u0019&&\u0002\u0000  &&\u0002\u0000\"\"$%\u0001\u0000$%\u0001\u0000"+
		"]_\u0002\u0000RR__\u0002\u0000YY__\u0002\u0000[[]^\u0001\u0000]^\u0003"+
		"\u0000\u00a6\u00a7\u00ab\u00ae\u00b0\u00b1\u0002\u0000\u00b2\u00b3\u00b7"+
		"\u00b7\u0002\u0000\u00af\u00af\u00b4\u00b6\u0004\u0000ss\u007f\u007f\u0085"+
		"\u0088\u008a\u008b\u0002\u0000\u008c\u008d\u0091\u0091\u0002\u0000\u0089"+
		"\u0089\u008e\u0090\u0588\u0000\u00f1\u0001\u0000\u0000\u0000\u0002\u00fd"+
		"\u0001\u0000\u0000\u0000\u0004\u010b\u0001\u0000\u0000\u0000\u0006\u010d"+
		"\u0001\u0000\u0000\u0000\b\u0116\u0001\u0000\u0000\u0000\n\u0119\u0001"+
		"\u0000\u0000\u0000\f\u0122\u0001\u0000\u0000\u0000\u000e\u0126\u0001\u0000"+
		"\u0000\u0000\u0010\u012f\u0001\u0000\u0000\u0000\u0012\u0138\u0001\u0000"+
		"\u0000\u0000\u0014\u013a\u0001\u0000\u0000\u0000\u0016\u0141\u0001\u0000"+
		"\u0000\u0000\u0018\u0146\u0001\u0000\u0000\u0000\u001a\u0148\u0001\u0000"+
		"\u0000\u0000\u001c\u014d\u0001\u0000\u0000\u0000\u001e\u0155\u0001\u0000"+
		"\u0000\u0000 \u0161\u0001\u0000\u0000\u0000\"\u016f\u0001\u0000\u0000"+
		"\u0000$\u0173\u0001\u0000\u0000\u0000&\u018c\u0001\u0000\u0000\u0000("+
		"\u018e\u0001\u0000\u0000\u0000*\u0190\u0001\u0000\u0000\u0000,\u01aa\u0001"+
		"\u0000\u0000\u0000.\u01ac\u0001\u0000\u0000\u00000\u01b3\u0001\u0000\u0000"+
		"\u00002\u01c2\u0001\u0000\u0000\u00004\u01c4\u0001\u0000\u0000\u00006"+
		"\u01cf\u0001\u0000\u0000\u00008\u01d1\u0001\u0000\u0000\u0000:\u01dc\u0001"+
		"\u0000\u0000\u0000<\u01eb\u0001\u0000\u0000\u0000>\u01ed\u0001\u0000\u0000"+
		"\u0000@\u01f8\u0001\u0000\u0000\u0000B\u01fd\u0001\u0000\u0000\u0000D"+
		"\u01ff\u0001\u0000\u0000\u0000F\u020d\u0001\u0000\u0000\u0000H\u0211\u0001"+
		"\u0000\u0000\u0000J\u0223\u0001\u0000\u0000\u0000L\u0225\u0001\u0000\u0000"+
		"\u0000N\u022d\u0001\u0000\u0000\u0000P\u0232\u0001\u0000\u0000\u0000R"+
		"\u0234\u0001\u0000\u0000\u0000T\u0239\u0001\u0000\u0000\u0000V\u0241\u0001"+
		"\u0000\u0000\u0000X\u024d\u0001\u0000\u0000\u0000Z\u025b\u0001\u0000\u0000"+
		"\u0000\\\u025f\u0001\u0000\u0000\u0000^\u0278\u0001\u0000\u0000\u0000"+
		"`\u027a\u0001\u0000\u0000\u0000b\u027c\u0001\u0000\u0000\u0000d\u0296"+
		"\u0001\u0000\u0000\u0000f\u0298\u0001\u0000\u0000\u0000h\u029f\u0001\u0000"+
		"\u0000\u0000j\u02ae\u0001\u0000\u0000\u0000l\u02b0\u0001\u0000\u0000\u0000"+
		"n\u02bb\u0001\u0000\u0000\u0000p\u02bd\u0001\u0000\u0000\u0000r\u02c8"+
		"\u0001\u0000\u0000\u0000t\u02d7\u0001\u0000\u0000\u0000v\u02d9\u0001\u0000"+
		"\u0000\u0000x\u02e4\u0001\u0000\u0000\u0000z\u02e9\u0001\u0000\u0000\u0000"+
		"|\u02eb\u0001\u0000\u0000\u0000~\u02f9\u0001\u0000\u0000\u0000\u0080\u02fd"+
		"\u0001\u0000\u0000\u0000\u0082\u030f\u0001\u0000\u0000\u0000\u0084\u0311"+
		"\u0001\u0000\u0000\u0000\u0086\u0321\u0001\u0000\u0000\u0000\u0088\u0323"+
		"\u0001\u0000\u0000\u0000\u008a\u033d\u0001\u0000\u0000\u0000\u008c\u0345"+
		"\u0001\u0000\u0000\u0000\u008e\u035c\u0001\u0000\u0000\u0000\u0090\u0366"+
		"\u0001\u0000\u0000\u0000\u0092\u036f\u0001\u0000\u0000\u0000\u0094\u0374"+
		"\u0001\u0000\u0000\u0000\u0096\u0385\u0001\u0000\u0000\u0000\u0098\u03a1"+
		"\u0001\u0000\u0000\u0000\u009a\u03a3\u0001\u0000\u0000\u0000\u009c\u03b6"+
		"\u0001\u0000\u0000\u0000\u009e\u03be\u0001\u0000\u0000\u0000\u00a0\u03c3"+
		"\u0001\u0000\u0000\u0000\u00a2\u03ca\u0001\u0000\u0000\u0000\u00a4\u03d8"+
		"\u0001\u0000\u0000\u0000\u00a6\u03dd\u0001\u0000\u0000\u0000\u00a8\u03f4"+
		"\u0001\u0000\u0000\u0000\u00aa\u03f8\u0001\u0000\u0000\u0000\u00ac\u040d"+
		"\u0001\u0000\u0000\u0000\u00ae\u0411\u0001\u0000\u0000\u0000\u00b0\u0413"+
		"\u0001\u0000\u0000\u0000\u00b2\u041b\u0001\u0000\u0000\u0000\u00b4\u0423"+
		"\u0001\u0000\u0000\u0000\u00b6\u042b\u0001\u0000\u0000\u0000\u00b8\u0433"+
		"\u0001\u0000\u0000\u0000\u00ba\u043e\u0001\u0000\u0000\u0000\u00bc\u0440"+
		"\u0001\u0000\u0000\u0000\u00be\u0448\u0001\u0000\u0000\u0000\u00c0\u0450"+
		"\u0001\u0000\u0000\u0000\u00c2\u045d\u0001\u0000\u0000\u0000\u00c4\u045f"+
		"\u0001\u0000\u0000\u0000\u00c6\u0471\u0001\u0000\u0000\u0000\u00c8\u0496"+
		"\u0001\u0000\u0000\u0000\u00ca\u0498\u0001\u0000\u0000\u0000\u00cc\u049c"+
		"\u0001\u0000\u0000\u0000\u00ce\u049e\u0001\u0000\u0000\u0000\u00d0\u04a6"+
		"\u0001\u0000\u0000\u0000\u00d2\u04ae\u0001\u0000\u0000\u0000\u00d4\u04b6"+
		"\u0001\u0000\u0000\u0000\u00d6\u04c1\u0001\u0000\u0000\u0000\u00d8\u04c3"+
		"\u0001\u0000\u0000\u0000\u00da\u04cb\u0001\u0000\u0000\u0000\u00dc\u04d3"+
		"\u0001\u0000\u0000\u0000\u00de\u04e0\u0001\u0000\u0000\u0000\u00e0\u04e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u04f4\u0001\u0000\u0000\u0000\u00e4\u04f6"+
		"\u0001\u0000\u0000\u0000\u00e6\u0500\u0001\u0000\u0000\u0000\u00e8\u0527"+
		"\u0001\u0000\u0000\u0000\u00ea\u0529\u0001\u0000\u0000\u0000\u00ec\u052d"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\u0002\u0001\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0000\u0000\u0001\u00f5\u0001\u0001\u0000\u0000\u0000\u00f6\u00fe"+
		"\u0003\u0004\u0002\u0000\u00f7\u00fe\u0003\u0086C\u0000\u00f8\u00fe\u0003"+
		"\u00acV\u0000\u00f9\u00fe\u0005)\u0000\u0000\u00fa\u00fe\u0005*\u0000"+
		"\u0000\u00fb\u00fe\u0005+\u0000\u0000\u00fc\u00fe\u00050\u0000\u0000\u00fd"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0003\u0001\u0000\u0000\u0000\u00ff"+
		"\u0103\u0003\u0006\u0003\u0000\u0100\u0102\u0003\u0002\u0001\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0003\b\u0004\u0000\u0107\u010c\u0001\u0000\u0000\u0000\u0108\u010c"+
		"\u0003\n\u0005\u0000\u0109\u010c\u0003\f\u0006\u0000\u010a\u010c\u0003"+
		"\u000e\u0007\u0000\u010b\u00ff\u0001\u0000\u0000\u0000\u010b\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u0005\u0001\u0000\u0000\u0000\u010d\u0111\u0005"+
		".\u0000\u0000\u010e\u0110\u0003\u0010\b\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u00059\u0000"+
		"\u0000\u0115\u0007\u0001\u0000\u0000\u0000\u0116\u0117\u0005/\u0000\u0000"+
		"\u0117\u0118\u00059\u0000\u0000\u0118\t\u0001\u0000\u0000\u0000\u0119"+
		"\u011d\u0005.\u0000\u0000\u011a\u011c\u0003\u0010\b\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u00058\u0000\u0000\u0121\u000b\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		",\u0000\u0000\u0123\u0124\u0003N\'\u0000\u0124\u0125\u0005;\u0000\u0000"+
		"\u0125\r\u0001\u0000\u0000\u0000\u0126\u012a\u0005-\u0000\u0000\u0127"+
		"\u0129\u0007\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005a\u0000\u0000\u012e\u000f"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u00052\u0000\u0000\u0130\u0131\u0005"+
		"3\u0000\u0000\u0131\u0133\u0003\u0012\t\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0011\u0001\u0000"+
		"\u0000\u0000\u0134\u0139\u00054\u0000\u0000\u0135\u0139\u00055\u0000\u0000"+
		"\u0136\u0139\u0003\u00acV\u0000\u0137\u0139\u0003\u0014\n\u0000\u0138"+
		"\u0134\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u0013\u0001\u0000\u0000\u0000\u013a\u013b\u00056\u0000\u0000\u013b\u013c"+
		"\u0003\u00aeW\u0000\u013c\u013d\u0005\u00a2\u0000\u0000\u013d\u0015\u0001"+
		"\u0000\u0000\u0000\u013e\u0140\u0003\u0018\f\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0017\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0003\u001a"+
		"\r\u0000\u0145\u0147\u00036\u001b\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0019\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0003\u001c\u000e\u0000\u0149\u014a\u0005\n\u0000\u0000"+
		"\u014a\u014b\u0003,\u0016\u0000\u014b\u014c\u0005\u000b\u0000\u0000\u014c"+
		"\u001b\u0001\u0000\u0000\u0000\u014d\u0152\u0003\u001e\u000f\u0000\u014e"+
		"\u014f\u0005\u000f\u0000\u0000\u014f\u0151\u0003\u001e\u000f\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u001d\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u015b\u0003\"\u0011\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158"+
		"\u0003\"\u0011\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0156\u0001"+
		"\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u001f\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0162\u0005"+
		"\u0011\u0000\u0000\u015f\u0162\u0005\u0012\u0000\u0000\u0160\u0162\u0005"+
		"\u0013\u0000\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162!\u0001\u0000"+
		"\u0000\u0000\u0163\u0167\u0003$\u0012\u0000\u0164\u0166\u0003&\u0013\u0000"+
		"\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u0170\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u016a\u016c\u0003&\u0013\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f"+
		"\u0163\u0001\u0000\u0000\u0000\u016f\u016b\u0001\u0000\u0000\u0000\u0170"+
		"#\u0001\u0000\u0000\u0000\u0171\u0174\u0005&\u0000\u0000\u0172\u0174\u0005"+
		"\u0010\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0172\u0001"+
		"\u0000\u0000\u0000\u0174%\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u001f"+
		"\u0000\u0000\u0176\u018d\u0005&\u0000\u0000\u0177\u0178\u0005\u001e\u0000"+
		"\u0000\u0178\u018d\u0005&\u0000\u0000\u0179\u018d\u0005\u001d\u0000\u0000"+
		"\u017a\u017b\u0005\u000e\u0000\u0000\u017b\u0180\u0005&\u0000\u0000\u017c"+
		"\u017d\u0005\u0015\u0000\u0000\u017d\u017e\u0003*\u0015\u0000\u017e\u017f"+
		"\u0005\u0016\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017c"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u018d"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0005\r\u0000\u0000\u0183\u018d\u0005"+
		"&\u0000\u0000\u0184\u0185\u0005\u0017\u0000\u0000\u0185\u0189\u0005&\u0000"+
		"\u0000\u0186\u0187\u0003(\u0014\u0000\u0187\u0188\u0007\u0001\u0000\u0000"+
		"\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0005\u0018\u0000\u0000\u018c\u0175\u0001\u0000\u0000\u0000"+
		"\u018c\u0177\u0001\u0000\u0000\u0000\u018c\u0179\u0001\u0000\u0000\u0000"+
		"\u018c\u017a\u0001\u0000\u0000\u0000\u018c\u0182\u0001\u0000\u0000\u0000"+
		"\u018c\u0184\u0001\u0000\u0000\u0000\u018d\'\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0007\u0002\u0000\u0000\u018f)\u0001\u0000\u0000\u0000\u0190\u0195"+
		"\u00032\u0019\u0000\u0191\u0192\u0005\u000f\u0000\u0000\u0192\u0194\u0003"+
		"2\u0019\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000"+
		"\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196+\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0003.\u0017\u0000\u0199\u019a\u0005\f\u0000\u0000"+
		"\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0198\u0001\u0000\u0000\u0000"+
		"\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003.\u0017\u0000\u01a1"+
		"\u01a3\u0005\f\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01ab\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0005\f\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u019d\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001"+
		"\u0000\u0000\u0000\u01ab-\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005&\u0000"+
		"\u0000\u01ad\u01ae\u0005\u000e\u0000\u0000\u01ae\u01b0\u00030\u0018\u0000"+
		"\u01af\u01b1\u0005\u001c\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1/\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b4\u00032\u0019\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b61\u0001\u0000\u0000\u0000\u01b7\u01c3\u0005"+
		"&\u0000\u0000\u01b8\u01c3\u0005 \u0000\u0000\u01b9\u01c3\u0005!\u0000"+
		"\u0000\u01ba\u01c3\u0005\u001d\u0000\u0000\u01bb\u01c3\u0005$\u0000\u0000"+
		"\u01bc\u01c3\u0005%\u0000\u0000\u01bd\u01c3\u0005\"\u0000\u0000\u01be"+
		"\u01c3\u0005#\u0000\u0000\u01bf\u01c3\u0005\u0014\u0000\u0000\u01c0\u01c3"+
		"\u0005\u000f\u0000\u0000\u01c1\u01c3\u00034\u001a\u0000\u01c2\u01b7\u0001"+
		"\u0000\u0000\u0000\u01c2\u01b8\u0001\u0000\u0000\u0000\u01c2\u01b9\u0001"+
		"\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01bb\u0001"+
		"\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2\u01bd\u0001"+
		"\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c33\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005&\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0015\u0000\u0000\u01c6\u01c7\u0003*\u0015\u0000"+
		"\u01c7\u01c8\u0005\u0016\u0000\u0000\u01c85\u0001\u0000\u0000\u0000\u01c9"+
		"\u01d0\u00038\u001c\u0000\u01ca\u01d0\u0003>\u001f\u0000\u01cb\u01d0\u0003"+
		"D\"\u0000\u01cc\u01d0\u0003F#\u0000\u01cd\u01d0\u0003H$\u0000\u01ce\u01d0"+
		"\u0003L&\u0000\u01cf\u01c9\u0001\u0000\u0000\u0000\u01cf\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d07\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0004\u0000"+
		"\u0000\u01d2\u01d3\u0003:\u001d\u0000\u01d3\u01d7\u0005\n\u0000\u0000"+
		"\u01d4\u01d6\u0003\u0018\f\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u000b\u0000\u0000\u01db"+
		"9\u0001\u0000\u0000\u0000\u01dc\u01e1\u0003<\u001e\u0000\u01dd\u01de\u0005"+
		"&\u0000\u0000\u01de\u01e0\u0003<\u001e\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2;\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01ec\u0005&\u0000\u0000\u01e5"+
		"\u01e6\u0005\u0015\u0000\u0000\u01e6\u01e7\u0005&\u0000\u0000\u01e7\u01e8"+
		"\u0005\u000e\u0000\u0000\u01e8\u01e9\u00032\u0019\u0000\u01e9\u01ea\u0005"+
		"\u0016\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e4\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e5\u0001\u0000\u0000\u0000\u01ec=\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005\u0005\u0000\u0000\u01ee\u01ef\u0005&\u0000"+
		"\u0000\u01ef\u01f3\u0005\n\u0000\u0000\u01f0\u01f2\u0003@ \u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0005\u000b\u0000\u0000\u01f7?\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0003B!\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0003,\u0016"+
		"\u0000\u01fb\u01fc\u0005\u000b\u0000\u0000\u01fcA\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0007\u0003\u0000\u0000\u01feC\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005\u0006\u0000\u0000\u0200\u0209\u0007\u0004\u0000\u0000\u0201"+
		"\u0206\u0005&\u0000\u0000\u0202\u0203\u0005\u000f\u0000\u0000\u0203\u0205"+
		"\u0005&\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0208\u0001"+
		"\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0209\u0201\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0005"+
		"\f\u0000\u0000\u020cE\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u0007"+
		"\u0000\u0000\u020e\u020f\u0007\u0005\u0000\u0000\u020f\u0210\u0005\f\u0000"+
		"\u0000\u0210G\u0001\u0000\u0000\u0000\u0211\u0212\u0005\b\u0000\u0000"+
		"\u0212\u0213\u0003J%\u0000\u0213\u0217\u0005\n\u0000\u0000\u0214\u0216"+
		"\u0003\u0018\f\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216\u0219\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0217\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0005\u000b\u0000\u0000\u021bI\u0001\u0000"+
		"\u0000\u0000\u021c\u0224\u0005&\u0000\u0000\u021d\u021e\u0005\u0015\u0000"+
		"\u0000\u021e\u021f\u0005&\u0000\u0000\u021f\u0220\u0005\u000e\u0000\u0000"+
		"\u0220\u0221\u00032\u0019\u0000\u0221\u0222\u0005\u0016\u0000\u0000\u0222"+
		"\u0224\u0001\u0000\u0000\u0000\u0223\u021c\u0001\u0000\u0000\u0000\u0223"+
		"\u021d\u0001\u0000\u0000\u0000\u0224K\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0005\t\u0000\u0000\u0226\u0227\u0005\n\u0000\u0000\u0227\u0228\u0003"+
		",\u0016\u0000\u0228\u0229\u0005\u000b\u0000\u0000\u0229M\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0003P(\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c"+
		"\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022eO\u0001\u0000\u0000\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u0230\u0233\u0003R)\u0000\u0231\u0233\u0003n"+
		"7\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000\u0000"+
		"\u0000\u0233Q\u0001\u0000\u0000\u0000\u0234\u0235\u0003T*\u0000\u0235"+
		"\u0236\u0005C\u0000\u0000\u0236\u0237\u0003d2\u0000\u0237\u0238\u0005"+
		"D\u0000\u0000\u0238S\u0001\u0000\u0000\u0000\u0239\u023e\u0003V+\u0000"+
		"\u023a\u023b\u0005H\u0000\u0000\u023b\u023d\u0003V+\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023fU\u0001"+
		"\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0247\u0003"+
		"Z-\u0000\u0242\u0243\u0003X,\u0000\u0243\u0244\u0003Z-\u0000\u0244\u0246"+
		"\u0001\u0000\u0000\u0000\u0245\u0242\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0001\u0000\u0000\u0000\u0248W\u0001\u0000\u0000\u0000\u0249\u0247\u0001"+
		"\u0000\u0000\u0000\u024a\u024e\u0005J\u0000\u0000\u024b\u024e\u0005K\u0000"+
		"\u0000\u024c\u024e\u0005L\u0000\u0000\u024d\u024a\u0001\u0000\u0000\u0000"+
		"\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000"+
		"\u024eY\u0001\u0000\u0000\u0000\u024f\u0253\u0003\\.\u0000\u0250\u0252"+
		"\u0003^/\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000"+
		"\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000"+
		"\u0000\u0000\u0254\u025c\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000"+
		"\u0000\u0000\u0256\u0258\u0003^/\u0000\u0257\u0256\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000"+
		"\u025b\u024f\u0001\u0000\u0000\u0000\u025b\u0257\u0001\u0000\u0000\u0000"+
		"\u025c[\u0001\u0000\u0000\u0000\u025d\u0260\u0005_\u0000\u0000\u025e\u0260"+
		"\u0005I\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001"+
		"\u0000\u0000\u0000\u0260]\u0001\u0000\u0000\u0000\u0261\u0262\u0005X\u0000"+
		"\u0000\u0262\u0279\u0005_\u0000\u0000\u0263\u0264\u0005W\u0000\u0000\u0264"+
		"\u0279\u0005_\u0000\u0000\u0265\u0279\u0005V\u0000\u0000\u0266\u0267\u0005"+
		"G\u0000\u0000\u0267\u026c\u0005_\u0000\u0000\u0268\u0269\u0005N\u0000"+
		"\u0000\u0269\u026a\u0003b1\u0000\u026a\u026b\u0005O\u0000\u0000\u026b"+
		"\u026d\u0001\u0000\u0000\u0000\u026c\u0268\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0001\u0000\u0000\u0000\u026d\u0279\u0001\u0000\u0000\u0000\u026e"+
		"\u026f\u0005F\u0000\u0000\u026f\u0279\u0005_\u0000\u0000\u0270\u0271\u0005"+
		"P\u0000\u0000\u0271\u0275\u0005_\u0000\u0000\u0272\u0273\u0003`0\u0000"+
		"\u0273\u0274\u0007\u0006\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000"+
		"\u0275\u0272\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0005Q\u0000\u0000\u0278"+
		"\u0261\u0001\u0000\u0000\u0000\u0278\u0263\u0001\u0000\u0000\u0000\u0278"+
		"\u0265\u0001\u0000\u0000\u0000\u0278\u0266\u0001\u0000\u0000\u0000\u0278"+
		"\u026e\u0001\u0000\u0000\u0000\u0278\u0270\u0001\u0000\u0000\u0000\u0279"+
		"_\u0001\u0000\u0000\u0000\u027a\u027b\u0007\u0007\u0000\u0000\u027ba\u0001"+
		"\u0000\u0000\u0000\u027c\u0281\u0003j5\u0000\u027d\u027e\u0005H\u0000"+
		"\u0000\u027e\u0280\u0003j5\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280"+
		"\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282c\u0001\u0000\u0000\u0000\u0283\u0281"+
		"\u0001\u0000\u0000\u0000\u0284\u0285\u0003f3\u0000\u0285\u0286\u0005E"+
		"\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000\u0287\u0284\u0001\u0000"+
		"\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001\u0000"+
		"\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028e\u0003f3\u0000"+
		"\u028d\u028f\u0005E\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0297\u0001\u0000\u0000\u0000\u0290"+
		"\u0292\u0005E\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292\u0295"+
		"\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293"+
		"\u0001\u0000\u0000\u0000\u0296\u0289\u0001\u0000\u0000\u0000\u0296\u0293"+
		"\u0001\u0000\u0000\u0000\u0297e\u0001\u0000\u0000\u0000\u0298\u0299\u0005"+
		"_\u0000\u0000\u0299\u029a\u0005G\u0000\u0000\u029a\u029c\u0003h4\u0000"+
		"\u029b\u029d\u0005U\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0001\u0000\u0000\u0000\u029dg\u0001\u0000\u0000\u0000\u029e\u02a0"+
		"\u0003j5\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a2i\u0001\u0000\u0000\u0000\u02a3\u02af\u0005_\u0000\u0000"+
		"\u02a4\u02af\u0005Y\u0000\u0000\u02a5\u02af\u0005Z\u0000\u0000\u02a6\u02af"+
		"\u0005V\u0000\u0000\u02a7\u02af\u0005]\u0000\u0000\u02a8\u02af\u0005^"+
		"\u0000\u0000\u02a9\u02af\u0005[\u0000\u0000\u02aa\u02af\u0005\\\u0000"+
		"\u0000\u02ab\u02af\u0005M\u0000\u0000\u02ac\u02af\u0005H\u0000\u0000\u02ad"+
		"\u02af\u0003l6\u0000\u02ae\u02a3\u0001\u0000\u0000\u0000\u02ae\u02a4\u0001"+
		"\u0000\u0000\u0000\u02ae\u02a5\u0001\u0000\u0000\u0000\u02ae\u02a6\u0001"+
		"\u0000\u0000\u0000\u02ae\u02a7\u0001\u0000\u0000\u0000\u02ae\u02a8\u0001"+
		"\u0000\u0000\u0000\u02ae\u02a9\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02afk\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005_\u0000\u0000\u02b1\u02b2\u0005N\u0000\u0000"+
		"\u02b2\u02b3\u0003b1\u0000\u02b3\u02b4\u0005O\u0000\u0000\u02b4m\u0001"+
		"\u0000\u0000\u0000\u02b5\u02bc\u0003p8\u0000\u02b6\u02bc\u0003v;\u0000"+
		"\u02b7\u02bc\u0003|>\u0000\u02b8\u02bc\u0003~?\u0000\u02b9\u02bc\u0003"+
		"\u0080@\u0000\u02ba\u02bc\u0003\u0084B\u0000\u02bb\u02b5\u0001\u0000\u0000"+
		"\u0000\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000\u0000"+
		"\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bco\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0005=\u0000\u0000\u02be\u02bf\u0003r9\u0000\u02bf\u02c3"+
		"\u0005C\u0000\u0000\u02c0\u02c2\u0003P(\u0000\u02c1\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005D\u0000"+
		"\u0000\u02c7q\u0001\u0000\u0000\u0000\u02c8\u02cd\u0003t:\u0000\u02c9"+
		"\u02ca\u0005_\u0000\u0000\u02ca\u02cc\u0003t:\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ces\u0001\u0000"+
		"\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d8\u0005_\u0000"+
		"\u0000\u02d1\u02d2\u0005N\u0000\u0000\u02d2\u02d3\u0005_\u0000\u0000\u02d3"+
		"\u02d4\u0005G\u0000\u0000\u02d4\u02d5\u0003j5\u0000\u02d5\u02d6\u0005"+
		"O\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d1\u0001\u0000\u0000\u0000\u02d8u\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0005>\u0000\u0000\u02da\u02db\u0005_\u0000\u0000\u02db"+
		"\u02df\u0005C\u0000\u0000\u02dc\u02de\u0003x<\u0000\u02dd\u02dc\u0001"+
		"\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005"+
		"D\u0000\u0000\u02e3w\u0001\u0000\u0000\u0000\u02e4\u02e5\u0003z=\u0000"+
		"\u02e5\u02e6\u0005C\u0000\u0000\u02e6\u02e7\u0003d2\u0000\u02e7\u02e8"+
		"\u0005D\u0000\u0000\u02e8y\u0001\u0000\u0000\u0000\u02e9\u02ea\u0007\b"+
		"\u0000\u0000\u02ea{\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005?\u0000\u0000"+
		"\u02ec\u02f5\u0007\t\u0000\u0000\u02ed\u02f2\u0005_\u0000\u0000\u02ee"+
		"\u02ef\u0005H\u0000\u0000\u02ef\u02f1\u0005_\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02ed\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0005E\u0000\u0000\u02f8}\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0005@\u0000\u0000\u02fa\u02fb\u0007\n\u0000\u0000"+
		"\u02fb\u02fc\u0005E\u0000\u0000\u02fc\u007f\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0005A\u0000\u0000\u02fe\u02ff\u0003\u0082A\u0000\u02ff\u0303\u0005"+
		"C\u0000\u0000\u0300\u0302\u0003P(\u0000\u0301\u0300\u0001\u0000\u0000"+
		"\u0000\u0302\u0305\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0306\u0001\u0000\u0000"+
		"\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0306\u0307\u0005D\u0000\u0000"+
		"\u0307\u0081\u0001\u0000\u0000\u0000\u0308\u0310\u0005_\u0000\u0000\u0309"+
		"\u030a\u0005N\u0000\u0000\u030a\u030b\u0005_\u0000\u0000\u030b\u030c\u0005"+
		"G\u0000\u0000\u030c\u030d\u0003j5\u0000\u030d\u030e\u0005O\u0000\u0000"+
		"\u030e\u0310\u0001\u0000\u0000\u0000\u030f\u0308\u0001\u0000\u0000\u0000"+
		"\u030f\u0309\u0001\u0000\u0000\u0000\u0310\u0083\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0005B\u0000\u0000\u0312\u0313\u0005C\u0000\u0000\u0313\u0314"+
		"\u0003d2\u0000\u0314\u0315\u0005D\u0000\u0000\u0315\u0085\u0001\u0000"+
		"\u0000\u0000\u0316\u0322\u0003\u0088D\u0000\u0317\u0322\u0003\u008cF\u0000"+
		"\u0318\u0322\u0003\u0092I\u0000\u0319\u0322\u0003\u0094J\u0000\u031a\u0322"+
		"\u0003\u0096K\u0000\u031b\u0322\u0003\u0098L\u0000\u031c\u0322\u0003\u009a"+
		"M\u0000\u031d\u0322\u0003\u00a0P\u0000\u031e\u0322\u0003\u00a2Q\u0000"+
		"\u031f\u0322\u0003\u00a6S\u0000\u0320\u0322\u0003\u00aaU\u0000\u0321\u0316"+
		"\u0001\u0000\u0000\u0000\u0321\u0317\u0001\u0000\u0000\u0000\u0321\u0318"+
		"\u0001\u0000\u0000\u0000\u0321\u0319\u0001\u0000\u0000\u0000\u0321\u031a"+
		"\u0001\u0000\u0000\u0000\u0321\u031b\u0001\u0000\u0000\u0000\u0321\u031c"+
		"\u0001\u0000\u0000\u0000\u0321\u031d\u0001\u0000\u0000\u0000\u0321\u031e"+
		"\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0320"+
		"\u0001\u0000\u0000\u0000\u0322\u0087\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0005\'\u0000\u0000\u0324\u0325\u0005f\u0000\u0000\u0325\u0326\u0003"+
		"\u008aE\u0000\u0326\u0327\u0005s\u0000\u0000\u0327\u032a\u0003\u00ccf"+
		"\u0000\u0328\u0329\u0005h\u0000\u0000\u0329\u032b\u0003\u00ccf\u0000\u032a"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032d\u0001\u0000\u0000\u0000\u032c\u032e\u0005\u0080\u0000\u0000\u032d"+
		"\u032c\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0333\u0005e\u0000\u0000\u0330\u0332"+
		"\u0003\u0002\u0001\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0335"+
		"\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0334"+
		"\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333"+
		"\u0001\u0000\u0000\u0000\u0336\u0338\u0003\u0090H\u0000\u0337\u0336\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001"+
		"\u0000\u0000\u0000\u0339\u033a\u0005\'\u0000\u0000\u033a\u033b\u0005g"+
		"\u0000\u0000\u033b\u033c\u0005e\u0000\u0000\u033c\u0089\u0001\u0000\u0000"+
		"\u0000\u033d\u0342\u0005\u00a0\u0000\u0000\u033e\u033f\u0005\u0095\u0000"+
		"\u0000\u033f\u0341\u0005\u00a0\u0000\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u008b\u0001\u0000\u0000"+
		"\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0346\u0005\'\u0000\u0000"+
		"\u0346\u0347\u0005h\u0000\u0000\u0347\u0348\u0003\u00ccf\u0000\u0348\u034c"+
		"\u0005e\u0000\u0000\u0349\u034b\u0003\u0002\u0001\u0000\u034a\u0349\u0001"+
		"\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c\u034a\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u0352\u0001"+
		"\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f\u0351\u0003"+
		"\u008eG\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000"+
		"\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000"+
		"\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000"+
		"\u0000\u0000\u0355\u0357\u0003\u0090H\u0000\u0356\u0355\u0001\u0000\u0000"+
		"\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\u0005\'\u0000\u0000\u0359\u035a\u0005k\u0000\u0000"+
		"\u035a\u035b\u0005e\u0000\u0000\u035b\u008d\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0005\'\u0000\u0000\u035d\u035e\u0005i\u0000\u0000\u035e\u035f"+
		"\u0003\u00ccf\u0000\u035f\u0363\u0005e\u0000\u0000\u0360\u0362\u0003\u0002"+
		"\u0001\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000"+
		"\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u008f\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0005\'\u0000\u0000\u0367\u0368\u0005j\u0000"+
		"\u0000\u0368\u036c\u0005e\u0000\u0000\u0369\u036b\u0003\u0002\u0001\u0000"+
		"\u036a\u0369\u0001\u0000\u0000\u0000\u036b\u036e\u0001\u0000\u0000\u0000"+
		"\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000"+
		"\u036d\u0091\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000"+
		"\u036f\u0370\u0005\'\u0000\u0000\u0370\u0371\u0005l\u0000\u0000\u0371"+
		"\u0372\u0003\u00ecv\u0000\u0372\u0373\u0005e\u0000\u0000\u0373\u0093\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0005\'\u0000\u0000\u0375\u0376\u0005m"+
		"\u0000\u0000\u0376\u0377\u0005\u00a0\u0000\u0000\u0377\u037b\u0005e\u0000"+
		"\u0000\u0378\u037a\u0003\u0002\u0001\u0000\u0379\u0378\u0001\u0000\u0000"+
		"\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e\u0001\u0000\u0000"+
		"\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037e\u037f\u0005\'\u0000\u0000"+
		"\u037f\u0381\u0005n\u0000\u0000\u0380\u0382\u0005\u00a0\u0000\u0000\u0381"+
		"\u0380\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0005e\u0000\u0000\u0384\u0095"+
		"\u0001\u0000\u0000\u0000\u0385\u0386\u0005\'\u0000\u0000\u0386\u0387\u0005"+
		"o\u0000\u0000\u0387\u0389\u0003\u00ecv\u0000\u0388\u038a\u0005\u0081\u0000"+
		"\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0005e\u0000\u0000"+
		"\u038c\u0097\u0001\u0000\u0000\u0000\u038d\u038e\u0005\'\u0000\u0000\u038e"+
		"\u038f\u0005t\u0000\u0000\u038f\u0390\u0005\u00a0\u0000\u0000\u0390\u0391"+
		"\u0005\u0093\u0000\u0000\u0391\u0392\u0003\u00ccf\u0000\u0392\u0393\u0005"+
		"e\u0000\u0000\u0393\u03a2\u0001\u0000\u0000\u0000\u0394\u0395\u0005\'"+
		"\u0000\u0000\u0395\u0396\u0005t\u0000\u0000\u0396\u0397\u0005\u00a0\u0000"+
		"\u0000\u0397\u039b\u0005e\u0000\u0000\u0398\u039a\u0003\u0002\u0001\u0000"+
		"\u0399\u0398\u0001\u0000\u0000\u0000\u039a\u039d\u0001\u0000\u0000\u0000"+
		"\u039b\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000"+
		"\u039c\u039e\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0005\'\u0000\u0000\u039f\u03a0\u0005u\u0000\u0000\u03a0"+
		"\u03a2\u0005e\u0000\u0000\u03a1\u038d\u0001\u0000\u0000\u0000\u03a1\u0394"+
		"\u0001\u0000\u0000\u0000\u03a2\u0099\u0001\u0000\u0000\u0000\u03a3\u03a4"+
		"\u0005\'\u0000\u0000\u03a4\u03a5\u0005x\u0000\u0000\u03a5\u03a6\u0005"+
		"\u00a0\u0000\u0000\u03a6\u03a8\u0005\u0097\u0000\u0000\u03a7\u03a9\u0003"+
		"\u009cN\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\u0098"+
		"\u0000\u0000\u03ab\u03af\u0005e\u0000\u0000\u03ac\u03ae\u0003\u0002\u0001"+
		"\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000"+
		"\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000"+
		"\u0000\u03b2\u03b3\u0005\'\u0000\u0000\u03b3\u03b4\u0005y\u0000\u0000"+
		"\u03b4\u03b5\u0005e\u0000\u0000\u03b5\u009b\u0001\u0000\u0000\u0000\u03b6"+
		"\u03bb\u0003\u009eO\u0000\u03b7\u03b8\u0005\u0095\u0000\u0000\u03b8\u03ba"+
		"\u0003\u009eO\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bd\u0001"+
		"\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001"+
		"\u0000\u0000\u0000\u03bc\u009d\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001"+
		"\u0000\u0000\u0000\u03be\u03c1\u0005\u00a0\u0000\u0000\u03bf\u03c0\u0005"+
		"\u0093\u0000\u0000\u03c0\u03c2\u0003\u00ccf\u0000\u03c1\u03bf\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u009f\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c4\u0005\'\u0000\u0000\u03c4\u03c5\u0005p\u0000"+
		"\u0000\u03c5\u03c6\u0003\u00ecv\u0000\u03c6\u03c7\u0005r\u0000\u0000\u03c7"+
		"\u03c8\u0005\u00a0\u0000\u0000\u03c8\u03c9\u0005e\u0000\u0000\u03c9\u00a1"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005\'\u0000\u0000\u03cb\u03cc\u0005"+
		"q\u0000\u0000\u03cc\u03cd\u0003\u00ecv\u0000\u03cd\u03ce\u0005p\u0000"+
		"\u0000\u03ce\u03d3\u0003\u00a4R\u0000\u03cf\u03d0\u0005\u0095\u0000\u0000"+
		"\u03d0\u03d2\u0003\u00a4R\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d5\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d6\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005e\u0000\u0000\u03d7\u00a3"+
		"\u0001\u0000\u0000\u0000\u03d8\u03db\u0005\u00a0\u0000\u0000\u03d9\u03da"+
		"\u0005r\u0000\u0000\u03da\u03dc\u0005\u00a0\u0000\u0000\u03db\u03d9\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u00a5\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0005\'\u0000\u0000\u03de\u03e7\u0005v"+
		"\u0000\u0000\u03df\u03e4\u0003\u00a8T\u0000\u03e0\u03e1\u0005\u0095\u0000"+
		"\u0000\u03e1\u03e3\u0003\u00a8T\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e6\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e8\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e7\u03df\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000"+
		"\u03e9\u03ed\u0005e\u0000\u0000\u03ea\u03ec\u0003\u0002\u0001\u0000\u03eb"+
		"\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed"+
		"\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u03f0\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0"+
		"\u03f1\u0005\'\u0000\u0000\u03f1\u03f2\u0005w\u0000\u0000\u03f2\u03f3"+
		"\u0005e\u0000\u0000\u03f3\u00a7\u0001\u0000\u0000\u0000\u03f4\u03f5\u0005"+
		"\u00a0\u0000\u0000\u03f5\u03f6\u0005\u0093\u0000\u0000\u03f6\u03f7\u0003"+
		"\u00ccf\u0000\u03f7\u00a9\u0001\u0000\u0000\u0000\u03f8\u03f9\u0005\'"+
		"\u0000\u0000\u03f9\u03ff\u0005z\u0000\u0000\u03fa\u03fc\u0005\u0097\u0000"+
		"\u0000\u03fb\u03fd\u0003\u009cN\u0000\u03fc\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000"+
		"\u03fe\u0400\u0005\u0098\u0000\u0000\u03ff\u03fa\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0003\u00ccf\u0000\u0402\u0406\u0005e\u0000\u0000\u0403\u0405"+
		"\u0003\u0002\u0001\u0000\u0404\u0403\u0001\u0000\u0000\u0000\u0405\u0408"+
		"\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0406\u0407"+
		"\u0001\u0000\u0000\u0000\u0407\u0409\u0001\u0000\u0000\u0000\u0408\u0406"+
		"\u0001\u0000\u0000\u0000\u0409\u040a\u0005\'\u0000\u0000\u040a\u040b\u0005"+
		"{\u0000\u0000\u040b\u040c\u0005e\u0000\u0000\u040c\u00ab\u0001\u0000\u0000"+
		"\u0000\u040d\u040e\u0005(\u0000\u0000\u040e\u040f\u0003\u00aeW\u0000\u040f"+
		"\u0410\u0005\u00a2\u0000\u0000\u0410\u00ad\u0001\u0000\u0000\u0000\u0411"+
		"\u0412\u0003\u00b0X\u0000\u0412\u00af\u0001\u0000\u0000\u0000\u0413\u0418"+
		"\u0003\u00b6[\u0000\u0414\u0415\u0005\u00b8\u0000\u0000\u0415\u0417\u0003"+
		"\u00b2Y\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0417\u041a\u0001\u0000"+
		"\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000"+
		"\u0000\u0000\u0419\u00b1\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000"+
		"\u0000\u0000\u041b\u0421\u0005\u00c5\u0000\u0000\u041c\u041e\u0005\u00bc"+
		"\u0000\u0000\u041d\u041f\u0003\u00b4Z\u0000\u041e\u041d\u0001\u0000\u0000"+
		"\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000"+
		"\u0000\u0420\u0422\u0005\u00bd\u0000\u0000\u0421\u041c\u0001\u0000\u0000"+
		"\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u00b3\u0001\u0000\u0000"+
		"\u0000\u0423\u0428\u0003\u00b6[\u0000\u0424\u0425\u0005\u00ba\u0000\u0000"+
		"\u0425\u0427\u0003\u00b6[\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0427"+
		"\u042a\u0001\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0428"+
		"\u0429\u0001\u0000\u0000\u0000\u0429\u00b5\u0001\u0000\u0000\u0000\u042a"+
		"\u0428\u0001\u0000\u0000\u0000\u042b\u0430\u0003\u00b8\\\u0000\u042c\u042d"+
		"\u0005\u00a5\u0000\u0000\u042d\u042f\u0003\u00b8\\\u0000\u042e\u042c\u0001"+
		"\u0000\u0000\u0000\u042f\u0432\u0001\u0000\u0000\u0000\u0430\u042e\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u00b7\u0001"+
		"\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0433\u0438\u0003"+
		"\u00ba]\u0000\u0434\u0435\u0005\u00a4\u0000\u0000\u0435\u0437\u0003\u00ba"+
		"]\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u043a\u0001\u0000\u0000"+
		"\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000"+
		"\u0000\u0439\u00b9\u0001\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000"+
		"\u0000\u043b\u043c\u0005\u00a3\u0000\u0000\u043c\u043f\u0003\u00ba]\u0000"+
		"\u043d\u043f\u0003\u00bc^\u0000\u043e\u043b\u0001\u0000\u0000\u0000\u043e"+
		"\u043d\u0001\u0000\u0000\u0000\u043f\u00bb\u0001\u0000\u0000\u0000\u0440"+
		"\u0445\u0003\u00be_\u0000\u0441\u0442\u0007\u000b\u0000\u0000\u0442\u0444"+
		"\u0003\u00be_\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444\u0447\u0001"+
		"\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001"+
		"\u0000\u0000\u0000\u0446\u00bd\u0001\u0000\u0000\u0000\u0447\u0445\u0001"+
		"\u0000\u0000\u0000\u0448\u044d\u0003\u00c0`\u0000\u0449\u044a\u0007\f"+
		"\u0000\u0000\u044a\u044c\u0003\u00c0`\u0000\u044b\u0449\u0001\u0000\u0000"+
		"\u0000\u044c\u044f\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u00bf\u0001\u0000\u0000"+
		"\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u0450\u0455\u0003\u00c2a\u0000"+
		"\u0451\u0452\u0007\r\u0000\u0000\u0452\u0454\u0003\u00c2a\u0000\u0453"+
		"\u0451\u0001\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455"+
		"\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456"+
		"\u00c1\u0001\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0458"+
		"\u0459\u0005\u00b3\u0000\u0000\u0459\u045e\u0003\u00c2a\u0000\u045a\u045b"+
		"\u0005\u00b2\u0000\u0000\u045b\u045e\u0003\u00c2a\u0000\u045c\u045e\u0003"+
		"\u00c4b\u0000\u045d\u0458\u0001\u0000\u0000\u0000\u045d\u045a\u0001\u0000"+
		"\u0000\u0000\u045d\u045c\u0001\u0000\u0000\u0000\u045e\u00c3\u0001\u0000"+
		"\u0000\u0000\u045f\u0463\u0003\u00c8d\u0000\u0460\u0462\u0003\u00c6c\u0000"+
		"\u0461\u0460\u0001\u0000\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000"+
		"\u0463\u0461\u0001\u0000\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000"+
		"\u0464\u00c5\u0001\u0000\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000"+
		"\u0466\u0467\u0005\u00b9\u0000\u0000\u0467\u0472\u0005\u00c5\u0000\u0000"+
		"\u0468\u0469\u0005\u00be\u0000\u0000\u0469\u046a\u0003\u00b6[\u0000\u046a"+
		"\u046b\u0005\u00bf\u0000\u0000\u046b\u0472\u0001\u0000\u0000\u0000\u046c"+
		"\u046e\u0005\u00bc\u0000\u0000\u046d\u046f\u0003\u00b4Z\u0000\u046e\u046d"+
		"\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470"+
		"\u0001\u0000\u0000\u0000\u0470\u0472\u0005\u00bd\u0000\u0000\u0471\u0466"+
		"\u0001\u0000\u0000\u0000\u0471\u0468\u0001\u0000\u0000\u0000\u0471\u046c"+
		"\u0001\u0000\u0000\u0000\u0472\u00c7\u0001\u0000\u0000\u0000\u0473\u0497"+
		"\u0005\u00c5\u0000\u0000\u0474\u0497\u0005\u00c4\u0000\u0000\u0475\u0497"+
		"\u0005\u00c3\u0000\u0000\u0476\u0497\u0005\u00c2\u0000\u0000\u0477\u0497"+
		"\u0005\u00a8\u0000\u0000\u0478\u0497\u0005\u00a9\u0000\u0000\u0479\u0497"+
		"\u0005\u00aa\u0000\u0000\u047a\u047b\u0005\u00bc\u0000\u0000\u047b\u047c"+
		"\u0003\u00b6[\u0000\u047c\u047d\u0005\u00bd\u0000\u0000\u047d\u0497\u0001"+
		"\u0000\u0000\u0000\u047e\u0487\u0005\u00be\u0000\u0000\u047f\u0484\u0003"+
		"\u00b6[\u0000\u0480\u0481\u0005\u00ba\u0000\u0000\u0481\u0483\u0003\u00b6"+
		"[\u0000\u0482\u0480\u0001\u0000\u0000\u0000\u0483\u0486\u0001\u0000\u0000"+
		"\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000"+
		"\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000"+
		"\u0000\u0487\u047f\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000\u0000"+
		"\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u0497\u0005\u00bf\u0000"+
		"\u0000\u048a\u0493\u0005\u00c0\u0000\u0000\u048b\u0490\u0003\u00cae\u0000"+
		"\u048c\u048d\u0005\u00ba\u0000\u0000\u048d\u048f\u0003\u00cae\u0000\u048e"+
		"\u048c\u0001\u0000\u0000\u0000\u048f\u0492\u0001\u0000\u0000\u0000\u0490"+
		"\u048e\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491"+
		"\u0494\u0001\u0000\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0493"+
		"\u048b\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494"+
		"\u0495\u0001\u0000\u0000\u0000\u0495\u0497\u0005\u00c1\u0000\u0000\u0496"+
		"\u0473\u0001\u0000\u0000\u0000\u0496\u0474\u0001\u0000\u0000\u0000\u0496"+
		"\u0475\u0001\u0000\u0000\u0000\u0496\u0476\u0001\u0000\u0000\u0000\u0496"+
		"\u0477\u0001\u0000\u0000\u0000\u0496\u0478\u0001\u0000\u0000\u0000\u0496"+
		"\u0479\u0001\u0000\u0000\u0000\u0496\u047a\u0001\u0000\u0000\u0000\u0496"+
		"\u047e\u0001\u0000\u0000\u0000\u0496\u048a\u0001\u0000\u0000\u0000\u0497"+
		"\u00c9\u0001\u0000\u0000\u0000\u0498\u0499\u0003\u00b6[\u0000\u0499\u049a"+
		"\u0005\u00bb\u0000\u0000\u049a\u049b\u0003\u00b6[\u0000\u049b\u00cb\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0003\u00ceg\u0000\u049d\u00cd\u0001\u0000"+
		"\u0000\u0000\u049e\u04a3\u0003\u00d2i\u0000\u049f\u04a0\u0005\u0092\u0000"+
		"\u0000\u04a0\u04a2\u0003\u00d0h\u0000\u04a1\u049f\u0001\u0000\u0000\u0000"+
		"\u04a2\u04a5\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000"+
		"\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u00cf\u0001\u0000\u0000\u0000"+
		"\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u04ac\u0005\u00a0\u0000\u0000"+
		"\u04a7\u04a9\u0005\u0097\u0000\u0000\u04a8\u04aa\u0003\u00e4r\u0000\u04a9"+
		"\u04a8\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa"+
		"\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ad\u0005\u0098\u0000\u0000\u04ac"+
		"\u04a7\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad"+
		"\u00d1\u0001\u0000\u0000\u0000\u04ae\u04b3\u0003\u00d4j\u0000\u04af\u04b0"+
		"\u0005~\u0000\u0000\u04b0\u04b2\u0003\u00d4j\u0000\u04b1\u04af\u0001\u0000"+
		"\u0000\u0000\u04b2\u04b5\u0001\u0000\u0000\u0000\u04b3\u04b1\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u00d3\u0001\u0000"+
		"\u0000\u0000\u04b5\u04b3\u0001\u0000\u0000\u0000\u04b6\u04bb\u0003\u00d6"+
		"k\u0000\u04b7\u04b8\u0005}\u0000\u0000\u04b8\u04ba\u0003\u00d6k\u0000"+
		"\u04b9\u04b7\u0001\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000\u0000"+
		"\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000"+
		"\u04bc\u00d5\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000"+
		"\u04be\u04bf\u0005|\u0000\u0000\u04bf\u04c2\u0003\u00d6k\u0000\u04c0\u04c2"+
		"\u0003\u00d8l\u0000\u04c1\u04be\u0001\u0000\u0000\u0000\u04c1\u04c0\u0001"+
		"\u0000\u0000\u0000\u04c2\u00d7\u0001\u0000\u0000\u0000\u04c3\u04c8\u0003"+
		"\u00dam\u0000\u04c4\u04c5\u0007\u000e\u0000\u0000\u04c5\u04c7\u0003\u00da"+
		"m\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c7\u04ca\u0001\u0000\u0000"+
		"\u0000\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000"+
		"\u0000\u04c9\u00d9\u0001\u0000\u0000\u0000\u04ca\u04c8\u0001\u0000\u0000"+
		"\u0000\u04cb\u04d0\u0003\u00dcn\u0000\u04cc\u04cd\u0007\u000f\u0000\u0000"+
		"\u04cd\u04cf\u0003\u00dcn\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04cf"+
		"\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000\u0000\u0000\u04d0"+
		"\u04d1\u0001\u0000\u0000\u0000\u04d1\u00db\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d8\u0003\u00deo\u0000\u04d4\u04d5"+
		"\u0007\u0010\u0000\u0000\u04d5\u04d7\u0003\u00deo\u0000\u04d6\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000\u0000\u04d8\u04d6\u0001"+
		"\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9\u00dd\u0001"+
		"\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04db\u04dc\u0005"+
		"\u008d\u0000\u0000\u04dc\u04e1\u0003\u00deo\u0000\u04dd\u04de\u0005\u008c"+
		"\u0000\u0000\u04de\u04e1\u0003\u00deo\u0000\u04df\u04e1\u0003\u00e0p\u0000"+
		"\u04e0\u04db\u0001\u0000\u0000\u0000\u04e0\u04dd\u0001\u0000\u0000\u0000"+
		"\u04e0\u04df\u0001\u0000\u0000\u0000\u04e1\u00df\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e6\u0003\u00e8t\u0000\u04e3\u04e5\u0003\u00e2q\u0000\u04e4\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e5\u04e8\u0001\u0000\u0000\u0000\u04e6\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7\u00e1"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e9\u04ea"+
		"\u0005\u0094\u0000\u0000\u04ea\u04f5\u0005\u00a0\u0000\u0000\u04eb\u04ec"+
		"\u0005\u0099\u0000\u0000\u04ec\u04ed\u0003\u00ccf\u0000\u04ed\u04ee\u0005"+
		"\u009a\u0000\u0000\u04ee\u04f5\u0001\u0000\u0000\u0000\u04ef\u04f1\u0005"+
		"\u0097\u0000\u0000\u04f0\u04f2\u0003\u00e4r\u0000\u04f1\u04f0\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f5\u0005\u0098\u0000\u0000\u04f4\u04e9\u0001\u0000"+
		"\u0000\u0000\u04f4\u04eb\u0001\u0000\u0000\u0000\u04f4\u04ef\u0001\u0000"+
		"\u0000\u0000\u04f5\u00e3\u0001\u0000\u0000\u0000\u04f6\u04fb\u0003\u00e6"+
		"s\u0000\u04f7\u04f8\u0005\u0095\u0000\u0000\u04f8\u04fa\u0003\u00e6s\u0000"+
		"\u04f9\u04f7\u0001\u0000\u0000\u0000\u04fa\u04fd\u0001\u0000\u0000\u0000"+
		"\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000"+
		"\u04fc\u00e5\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000"+
		"\u04fe\u04ff\u0005\u00a0\u0000\u0000\u04ff\u0501\u0005\u0093\u0000\u0000"+
		"\u0500\u04fe\u0001\u0000\u0000\u0000\u0500\u0501\u0001\u0000\u0000\u0000"+
		"\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0503\u0003\u00ccf\u0000\u0503"+
		"\u00e7\u0001\u0000\u0000\u0000\u0504\u0528\u0005\u00a0\u0000\u0000\u0505"+
		"\u0528\u0005\u009f\u0000\u0000\u0506\u0528\u0005\u009e\u0000\u0000\u0507"+
		"\u0528\u0003\u00ecv\u0000\u0508\u0528\u0005\u0082\u0000\u0000\u0509\u0528"+
		"\u0005\u0083\u0000\u0000\u050a\u0528\u0005\u0084\u0000\u0000\u050b\u050c"+
		"\u0005\u0097\u0000\u0000\u050c\u050d\u0003\u00ccf\u0000\u050d\u050e\u0005"+
		"\u0098\u0000\u0000\u050e\u0528\u0001\u0000\u0000\u0000\u050f\u0518\u0005"+
		"\u0099\u0000\u0000\u0510\u0515\u0003\u00ccf\u0000\u0511\u0512\u0005\u0095"+
		"\u0000\u0000\u0512\u0514\u0003\u00ccf\u0000\u0513\u0511\u0001\u0000\u0000"+
		"\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000"+
		"\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0519\u0001\u0000\u0000"+
		"\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0510\u0001\u0000\u0000"+
		"\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000"+
		"\u0000\u051a\u0528\u0005\u009a\u0000\u0000\u051b\u0524\u0005\u009b\u0000"+
		"\u0000\u051c\u0521\u0003\u00eau\u0000\u051d\u051e\u0005\u0095\u0000\u0000"+
		"\u051e\u0520\u0003\u00eau\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u0520"+
		"\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0521"+
		"\u0522\u0001\u0000\u0000\u0000\u0522\u0525\u0001\u0000\u0000\u0000\u0523"+
		"\u0521\u0001\u0000\u0000\u0000\u0524\u051c\u0001\u0000\u0000\u0000\u0524"+
		"\u0525\u0001\u0000\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526"+
		"\u0528\u0005\u009c\u0000\u0000\u0527\u0504\u0001\u0000\u0000\u0000\u0527"+
		"\u0505\u0001\u0000\u0000\u0000\u0527\u0506\u0001\u0000\u0000\u0000\u0527"+
		"\u0507\u0001\u0000\u0000\u0000\u0527\u0508\u0001\u0000\u0000\u0000\u0527"+
		"\u0509\u0001\u0000\u0000\u0000\u0527\u050a\u0001\u0000\u0000\u0000\u0527"+
		"\u050b\u0001\u0000\u0000\u0000\u0527\u050f\u0001\u0000\u0000\u0000\u0527"+
		"\u051b\u0001\u0000\u0000\u0000\u0528\u00e9\u0001\u0000\u0000\u0000\u0529"+
		"\u052a\u0003\u00ccf\u0000\u052a\u052b\u0005\u0096\u0000\u0000\u052b\u052c"+
		"\u0003\u00ccf\u0000\u052c\u00eb\u0001\u0000\u0000\u0000\u052d\u052e\u0005"+
		"\u009d\u0000\u0000\u052e\u00ed\u0001\u0000\u0000\u0000\u0086\u00f1\u00fd"+
		"\u0103\u010b\u0111\u011d\u012a\u0132\u0138\u0141\u0146\u0152\u015b\u0161"+
		"\u0167\u016d\u016f\u0173\u0180\u0189\u018c\u0195\u019d\u01a2\u01a7\u01aa"+
		"\u01b0\u01b5\u01c2\u01cf\u01d7\u01e1\u01eb\u01f3\u0206\u0209\u0217\u0223"+
		"\u022d\u0232\u023e\u0247\u024d\u0253\u0259\u025b\u025f\u026c\u0275\u0278"+
		"\u0281\u0289\u028e\u0293\u0296\u029c\u02a1\u02ae\u02bb\u02c3\u02cd\u02d7"+
		"\u02df\u02f2\u02f5\u0303\u030f\u0321\u032a\u032d\u0333\u0337\u0342\u034c"+
		"\u0352\u0356\u0363\u036c\u037b\u0381\u0389\u039b\u03a1\u03a8\u03af\u03bb"+
		"\u03c1\u03d3\u03db\u03e4\u03e7\u03ed\u03fc\u03ff\u0406\u0418\u041e\u0421"+
		"\u0428\u0430\u0438\u043e\u0445\u044d\u0455\u045d\u0463\u046e\u0471\u0484"+
		"\u0487\u0490\u0493\u0496\u04a3\u04a9\u04ac\u04b3\u04bb\u04c1\u04c8\u04d0"+
		"\u04d8\u04e0\u04e6\u04f1\u04f4\u04fb\u0500\u0515\u0518\u0521\u0524\u0527";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}