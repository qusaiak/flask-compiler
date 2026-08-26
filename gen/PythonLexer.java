// Generated from C:/Users/DELL/AndroidStudioProjects/flask-compiler/src/main/antlr4/com/flaskcompiler/grammar/PythonLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, FROM=3, IMPORT=4, DEF=5, RETURN=6, TRUE=7, FALSE=8, 
		NONE=9, ASSIGN=10, PLUS=11, MINUS=12, STAR=13, SLASH=14, DOT=15, COMMA=16, 
		COLON=17, AT=18, OPEN_PAREN=19, CLOSE_PAREN=20, OPEN_BRACK=21, CLOSE_BRACK=22, 
		OPEN_BRACE=23, CLOSE_BRACE=24, STRING=25, FLOAT_NUMBER=26, INTEGER=27, 
		NAME=28, COMMENT=29, NEWLINE=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "IMPORT", "DEF", "RETURN", "TRUE", "FALSE", "NONE", "ASSIGN", 
			"PLUS", "MINUS", "STAR", "SLASH", "DOT", "COMMA", "COLON", "AT", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", 
			"STRING", "FLOAT_NUMBER", "INTEGER", "NAME", "DIGITS", "SPACES", "COMMENT", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'from'", "'import'", "'def'", "'return'", "'True'", 
			"'False'", "'None'", "'='", "'+'", "'-'", "'*'", "'/'", "'.'", "','", 
			"':'", "'@'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "FROM", "IMPORT", "DEF", "RETURN", "TRUE", 
			"FALSE", "NONE", "ASSIGN", "PLUS", "MINUS", "STAR", "SLASH", "DOT", "COMMA", 
			"COLON", "AT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "STRING", "FLOAT_NUMBER", "INTEGER", "NAME", 
			"COMMENT", "NEWLINE", "WS"
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


	    // Buffer of extra tokens (INDENT/DEDENT/NEWLINE) to emit.
	    private final java.util.LinkedList<Token> pendingTokens = new java.util.LinkedList<>();
	    // Indentation level stack.
	    private final java.util.Deque<Integer> indents = new java.util.ArrayDeque<>();
	    // Depth of () [] {} so newlines inside brackets are ignored.
	    private int opened = 0;

	    @Override
	    public void emit(Token t) {
	        super.setToken(t);
	        pendingTokens.offer(t);
	    }

	    @Override
	    public Token nextToken() {
	        if (_input.LA(1) == EOF && !indents.isEmpty()) {
	            for (int i = pendingTokens.size() - 1; i >= 0; i--) {
	                if (pendingTokens.get(i).getType() == EOF) {
	                    pendingTokens.remove(i);
	                }
	            }
	            emit(makeToken(NEWLINE, "\n"));
	            while (!indents.isEmpty()) {
	                emit(makeToken(DEDENT, ""));
	                indents.pop();
	            }
	            emit(makeToken(EOF, "<EOF>"));
	        }
	        Token next = super.nextToken();
	        return pendingTokens.isEmpty() ? next : pendingTokens.poll();
	    }

	    private Token makeToken(int type, String text) {
	        int stop = getCharIndex() - 1;
	        int start = text.isEmpty() ? stop : stop - text.length() + 1;
	        return new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	    }

	    private static int indentWidth(String spaces) {
	        int count = 0;
	        for (char ch : spaces.toCharArray()) {
	            count += (ch == '\t') ? 8 - (count % 8) : 1;
	        }
	        return count;
	    }

	    private boolean atStartOfInput() {
	        return getCharPositionInLine() == 0 && getLine() == 1;
	    }


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			OPEN_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			CLOSE_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 opened++; 
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 opened--; 
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 opened++; 
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 opened--; 
			break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 opened++; 
			break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 opened--; 
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			        String text = getText();
			        String spaces = text.replaceAll("[\r\n\f]+", "");
			        int next = _input.LA(1);
			        if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
			            skip();
			        } else {
			            emit(makeToken(NEWLINE, "\n"));
			            int indent = indentWidth(spaces);
			            int previous = indents.isEmpty() ? 0 : indents.peek();
			            if (indent == previous) {
			                skip();
			            } else if (indent > previous) {
			                indents.push(indent);
			                emit(makeToken(INDENT, spaces));
			            } else {
			                while (!indents.isEmpty() && indents.peek() > indent) {
			                    emit(makeToken(DEDENT, ""));
			                    indents.pop();
			                }
			            }
			        }
			      
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00d7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u008f\b\u0016\n\u0016\f\u0016\u0092\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0099\b\u0016\n\u0016"+
		"\f\u0016\u009c\t\u0016\u0001\u0016\u0003\u0016\u009f\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u00a9\b\u0019\n\u0019\f\u0019\u00ac\t\u0019\u0001"+
		"\u001a\u0004\u001a\u00af\b\u001a\u000b\u001a\f\u001a\u00b0\u0001\u001b"+
		"\u0004\u001b\u00b4\b\u001b\u000b\u001b\f\u001b\u00b5\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u00ba\b\u001c\n\u001c\f\u001c\u00bd\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00c4\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u00c8\b\u001d\u0001\u001d\u0003\u001d"+
		"\u00cb\b\u001d\u0003\u001d\u00cd\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0004\u001e\u00d2\b\u001e\u000b\u001e\f\u001e\u00d3\u0001\u001e"+
		"\u0001\u001e\u0000\u0000\u001f\u0001\u0003\u0003\u0004\u0005\u0005\u0007"+
		"\u0006\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b\u0013\f\u0015\r\u0017\u000e"+
		"\u0019\u000f\u001b\u0010\u001d\u0011\u001f\u0012!\u0013#\u0014%\u0015"+
		"\'\u0016)\u0017+\u0018-\u0019/\u001a1\u001b3\u001c5\u00007\u00009\u001d"+
		";\u001e=\u001f\u0001\u0000\u0007\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000"+
		"\n\n\r\r\'\'\\\\\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002"+
		"\u0000\t\t  \u0002\u0000\n\n\f\r\u00e2\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001"+
		"?\u0001\u0000\u0000\u0000\u0003D\u0001\u0000\u0000\u0000\u0005K\u0001"+
		"\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\tV\u0001\u0000\u0000"+
		"\u0000\u000b[\u0001\u0000\u0000\u0000\ra\u0001\u0000\u0000\u0000\u000f"+
		"f\u0001\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000\u0013j\u0001"+
		"\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n\u0001\u0000\u0000"+
		"\u0000\u0019p\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001d"+
		"t\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000!x\u0001\u0000"+
		"\u0000\u0000#{\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000\u0000\'\u0081"+
		"\u0001\u0000\u0000\u0000)\u0084\u0001\u0000\u0000\u0000+\u0087\u0001\u0000"+
		"\u0000\u0000-\u009e\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000\u0000"+
		"1\u00a4\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u00005\u00ae"+
		"\u0001\u0000\u0000\u00007\u00b3\u0001\u0000\u0000\u00009\u00b7\u0001\u0000"+
		"\u0000\u0000;\u00cc\u0001\u0000\u0000\u0000=\u00d1\u0001\u0000\u0000\u0000"+
		"?@\u0005f\u0000\u0000@A\u0005r\u0000\u0000AB\u0005o\u0000\u0000BC\u0005"+
		"m\u0000\u0000C\u0002\u0001\u0000\u0000\u0000DE\u0005i\u0000\u0000EF\u0005"+
		"m\u0000\u0000FG\u0005p\u0000\u0000GH\u0005o\u0000\u0000HI\u0005r\u0000"+
		"\u0000IJ\u0005t\u0000\u0000J\u0004\u0001\u0000\u0000\u0000KL\u0005d\u0000"+
		"\u0000LM\u0005e\u0000\u0000MN\u0005f\u0000\u0000N\u0006\u0001\u0000\u0000"+
		"\u0000OP\u0005r\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005r\u0000\u0000TU\u0005n\u0000\u0000U\b\u0001"+
		"\u0000\u0000\u0000VW\u0005T\u0000\u0000WX\u0005r\u0000\u0000XY\u0005u"+
		"\u0000\u0000YZ\u0005e\u0000\u0000Z\n\u0001\u0000\u0000\u0000[\\\u0005"+
		"F\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005l\u0000\u0000^_\u0005s\u0000"+
		"\u0000_`\u0005e\u0000\u0000`\f\u0001\u0000\u0000\u0000ab\u0005N\u0000"+
		"\u0000bc\u0005o\u0000\u0000cd\u0005n\u0000\u0000de\u0005e\u0000\u0000"+
		"e\u000e\u0001\u0000\u0000\u0000fg\u0005=\u0000\u0000g\u0010\u0001\u0000"+
		"\u0000\u0000hi\u0005+\u0000\u0000i\u0012\u0001\u0000\u0000\u0000jk\u0005"+
		"-\u0000\u0000k\u0014\u0001\u0000\u0000\u0000lm\u0005*\u0000\u0000m\u0016"+
		"\u0001\u0000\u0000\u0000no\u0005/\u0000\u0000o\u0018\u0001\u0000\u0000"+
		"\u0000pq\u0005.\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005,\u0000"+
		"\u0000s\u001c\u0001\u0000\u0000\u0000tu\u0005:\u0000\u0000u\u001e\u0001"+
		"\u0000\u0000\u0000vw\u0005@\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005"+
		"(\u0000\u0000yz\u0006\u0010\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005"+
		")\u0000\u0000|}\u0006\u0011\u0001\u0000}$\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005[\u0000\u0000\u007f\u0080\u0006\u0012\u0002\u0000\u0080&\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005]\u0000\u0000\u0082\u0083\u0006\u0013\u0003"+
		"\u0000\u0083(\u0001\u0000\u0000\u0000\u0084\u0085\u0005{\u0000\u0000\u0085"+
		"\u0086\u0006\u0014\u0004\u0000\u0086*\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005}\u0000\u0000\u0088\u0089\u0006\u0015\u0005\u0000\u0089,\u0001\u0000"+
		"\u0000\u0000\u008a\u0090\u0005\"\u0000\u0000\u008b\u008c\u0005\\\u0000"+
		"\u0000\u008c\u008f\t\u0000\u0000\u0000\u008d\u008f\b\u0000\u0000\u0000"+
		"\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u009f\u0005\"\u0000\u0000\u0094"+
		"\u009a\u0005\'\u0000\u0000\u0095\u0096\u0005\\\u0000\u0000\u0096\u0099"+
		"\t\u0000\u0000\u0000\u0097\u0099\b\u0001\u0000\u0000\u0098\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0005\'\u0000\u0000\u009e\u008a\u0001\u0000"+
		"\u0000\u0000\u009e\u0094\u0001\u0000\u0000\u0000\u009f.\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u00035\u001a\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a2"+
		"\u00a3\u00035\u001a\u0000\u00a30\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003"+
		"5\u001a\u0000\u00a52\u0001\u0000\u0000\u0000\u00a6\u00aa\u0007\u0002\u0000"+
		"\u0000\u00a7\u00a9\u0007\u0003\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab4\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0004\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b16\u0001\u0000\u0000\u0000\u00b2\u00b4\u0007\u0005\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"8\u0001\u0000\u0000\u0000\u00b7\u00bb\u0005#\u0000\u0000\u00b8\u00ba\b"+
		"\u0006\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0006\u001c\u0006\u0000\u00bf:\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0004\u001d\u0000\u0000\u00c1\u00cd\u00037\u001b"+
		"\u0000\u00c2\u00c4\u0005\r\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0005\n\u0000\u0000\u00c6\u00c8\u0002\f\r\u0000\u00c7\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u00037\u001b\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006"+
		"\u001d\u0007\u0000\u00cf<\u0001\u0000\u0000\u0000\u00d0\u00d2\u0007\u0005"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\u001e"+
		"\u0006\u0000\u00d6>\u0001\u0000\u0000\u0000\u000f\u0000\u008e\u0090\u0098"+
		"\u009a\u009e\u00aa\u00b0\u00b5\u00bb\u00c3\u00c7\u00ca\u00cc\u00d3\b\u0001"+
		"\u0010\u0000\u0001\u0011\u0001\u0001\u0012\u0002\u0001\u0013\u0003\u0001"+
		"\u0014\u0004\u0001\u0015\u0005\u0006\u0000\u0000\u0001\u001d\u0006";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}