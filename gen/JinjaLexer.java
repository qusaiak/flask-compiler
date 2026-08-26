// Generated from C:/Users/DELL/AndroidStudioProjects/flask-compiler/src/main/antlr4/com/flaskcompiler/grammar/JinjaLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXPR_OPEN=1, STMT_OPEN=2, TEXT=3, EXPR_CLOSE=4, STMT_CLOSE=5, FOR=6, ENDFOR=7, 
		IF=8, ENDIF=9, IN=10, EXTENDS=11, BLOCK=12, ENDBLOCK=13, STRING=14, DOT=15, 
		NAME=16, TAG_WS=17;
	public static final int
		TAG=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EXPR_OPEN", "STMT_OPEN", "TEXT", "EXPR_CLOSE", "STMT_CLOSE", "FOR", 
			"ENDFOR", "IF", "ENDIF", "IN", "EXTENDS", "BLOCK", "ENDBLOCK", "STRING", 
			"DOT", "NAME", "TAG_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", null, "'}}'", "'%}'", "'for'", "'endfor'", "'if'", 
			"'endif'", "'in'", "'extends'", "'block'", "'endblock'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXPR_OPEN", "STMT_OPEN", "TEXT", "EXPR_CLOSE", "STMT_CLOSE", "FOR", 
			"ENDFOR", "IF", "ENDIF", "IN", "EXTENDS", "BLOCK", "ENDBLOCK", "STRING", 
			"DOT", "NAME", "TAG_WS"
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


	public JinjaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JinjaLexer.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u008f\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rp\b"+
		"\r\n\r\f\rs\t\r\u0001\r\u0001\r\u0001\r\u0005\rx\b\r\n\r\f\r{\t\r\u0001"+
		"\r\u0003\r~\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0084\b\u000f\n\u000f\f\u000f\u0087\t\u000f\u0001\u0010\u0004\u0010"+
		"\u008a\b\u0010\u000b\u0010\f\u0010\u008b\u0001\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006"+
		"\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c"+
		"\u000e\u001e\u000f \u0010\"\u0011\u0002\u0000\u0001\u0007\u0002\u0000"+
		"%%{{\u0001\u0000{{\u0001\u0000\"\"\u0001\u0000\'\'\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0094\u0000\u0002\u0001\u0000\u0000"+
		"\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0001\b\u0001\u0000\u0000\u0000\u0001\n\u0001\u0000\u0000\u0000"+
		"\u0001\f\u0001\u0000\u0000\u0000\u0001\u000e\u0001\u0000\u0000\u0000\u0001"+
		"\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0001"+
		"\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0001"+
		"\u0018\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000\u0000\u0001"+
		"\u001c\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0001"+
		" \u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000\u0002$\u0001"+
		"\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b5\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f?\u0001"+
		"\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000"+
		"\u0000\u0012M\u0001\u0000\u0000\u0000\u0014S\u0001\u0000\u0000\u0000\u0016"+
		"V\u0001\u0000\u0000\u0000\u0018^\u0001\u0000\u0000\u0000\u001ad\u0001"+
		"\u0000\u0000\u0000\u001c}\u0001\u0000\u0000\u0000\u001e\u007f\u0001\u0000"+
		"\u0000\u0000 \u0081\u0001\u0000\u0000\u0000\"\u0089\u0001\u0000\u0000"+
		"\u0000$%\u0005{\u0000\u0000%&\u0005{\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0006\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"{\u0000\u0000*+\u0005%\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0006\u0001"+
		"\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005{\u0000\u0000/2\b\u0000"+
		"\u0000\u000002\b\u0001\u0000\u00001.\u0001\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005}\u0000\u0000"+
		"67\u0005}\u0000\u000078\u0001\u0000\u0000\u000089\u0006\u0003\u0001\u0000"+
		"9\t\u0001\u0000\u0000\u0000:;\u0005%\u0000\u0000;<\u0005}\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0006\u0004\u0001\u0000>\u000b\u0001\u0000"+
		"\u0000\u0000?@\u0005f\u0000\u0000@A\u0005o\u0000\u0000AB\u0005r\u0000"+
		"\u0000B\r\u0001\u0000\u0000\u0000CD\u0005e\u0000\u0000DE\u0005n\u0000"+
		"\u0000EF\u0005d\u0000\u0000FG\u0005f\u0000\u0000GH\u0005o\u0000\u0000"+
		"HI\u0005r\u0000\u0000I\u000f\u0001\u0000\u0000\u0000JK\u0005i\u0000\u0000"+
		"KL\u0005f\u0000\u0000L\u0011\u0001\u0000\u0000\u0000MN\u0005e\u0000\u0000"+
		"NO\u0005n\u0000\u0000OP\u0005d\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"f\u0000\u0000R\u0013\u0001\u0000\u0000\u0000ST\u0005i\u0000\u0000TU\u0005"+
		"n\u0000\u0000U\u0015\u0001\u0000\u0000\u0000VW\u0005e\u0000\u0000WX\u0005"+
		"x\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005n\u0000"+
		"\u0000[\\\u0005d\u0000\u0000\\]\u0005s\u0000\u0000]\u0017\u0001\u0000"+
		"\u0000\u0000^_\u0005b\u0000\u0000_`\u0005l\u0000\u0000`a\u0005o\u0000"+
		"\u0000ab\u0005c\u0000\u0000bc\u0005k\u0000\u0000c\u0019\u0001\u0000\u0000"+
		"\u0000de\u0005e\u0000\u0000ef\u0005n\u0000\u0000fg\u0005d\u0000\u0000"+
		"gh\u0005b\u0000\u0000hi\u0005l\u0000\u0000ij\u0005o\u0000\u0000jk\u0005"+
		"c\u0000\u0000kl\u0005k\u0000\u0000l\u001b\u0001\u0000\u0000\u0000mq\u0005"+
		"\"\u0000\u0000np\b\u0002\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000t~\u0005\"\u0000\u0000"+
		"uy\u0005\'\u0000\u0000vx\b\u0003\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0005\'\u0000"+
		"\u0000}m\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000~\u001d\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005.\u0000\u0000\u0080\u001f\u0001\u0000"+
		"\u0000\u0000\u0081\u0085\u0007\u0004\u0000\u0000\u0082\u0084\u0007\u0005"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086!\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0007\u0006\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0006\u0010\u0002\u0000\u008e#\u0001\u0000\u0000\u0000"+
		"\t\u0000\u000113qy}\u0085\u008b\u0003\u0005\u0001\u0000\u0004\u0000\u0000"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}