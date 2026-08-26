// Generated from C:/Users/DELL/AndroidStudioProjects/flask-compiler/src/main/antlr4/com/flaskcompiler/grammar/CssLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, COLON=3, SEMI=4, COMMA=5, CLASS=6, COLOR=7, HASH_ID=8, 
		STRING=9, PERCENTAGE=10, DIMENSION=11, NUMBER=12, IDENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "CLASS", "COLOR", "HASH_ID", 
			"STRING", "PERCENTAGE", "DIMENSION", "NUMBER", "IDENT", "WS", "NUM", 
			"HEX", "NMSTART", "NMCHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", "CLASS", "COLOR", 
			"HASH_ID", "STRING", "PERCENTAGE", "DIMENSION", "NUMBER", "IDENT", "WS"
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


	public CssLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CssLexer.g4"; }

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
		"\u0004\u0000\u000e\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u00053\b\u0005\n\u0005\f\u00056\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0004\u0006:\b\u0006\u000b\u0006\f\u0006;\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007A\b\u0007\n\u0007\f\u0007D\t\u0007\u0001"+
		"\b\u0001\b\u0005\bH\b\b\n\b\f\bK\t\b\u0001\b\u0001\b\u0001\b\u0005\bP"+
		"\b\b\n\b\f\bS\t\b\u0001\b\u0003\bV\b\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0004\n]\b\n\u000b\n\f\n^\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\fe\b\f\n\f\f\fh\t\f\u0001\r\u0004\rk\b\r\u000b\r\f\rl\u0001\r"+
		"\u0001\r\u0001\u000e\u0004\u000er\b\u000e\u000b\u000e\f\u000es\u0001\u000e"+
		"\u0001\u000e\u0004\u000ex\b\u000e\u000b\u000e\f\u000ey\u0003\u000e|\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u0000!\u0000#\u0000\u0001\u0000"+
		"\b\u0001\u0000\"\"\u0001\u0000\'\'\u0002\u0000AZaz\u0003\u0000\t\n\r\r"+
		"  \u0001\u000009\u0003\u000009AFaf\u0003\u0000AZ__az\u0005\u0000--09A"+
		"Z__az\u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005"+
		")\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000"+
		"\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013W"+
		"\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017`\u0001\u0000"+
		"\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000"+
		"\u001dq\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u007f"+
		"\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%&\u0005{\u0000"+
		"\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005}\u0000\u0000(\u0004\u0001"+
		"\u0000\u0000\u0000)*\u0005:\u0000\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+,\u0005;\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005,\u0000\u0000"+
		".\n\u0001\u0000\u0000\u0000/0\u0005.\u0000\u000004\u0003!\u0010\u0000"+
		"13\u0003#\u0011\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\f\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000079\u0005#\u0000\u00008:\u0003\u001f\u000f"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<\u000e\u0001\u0000\u0000\u0000"+
		"=>\u0005#\u0000\u0000>B\u0003!\u0010\u0000?A\u0003#\u0011\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EI\u0005\"\u0000\u0000FH\b\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LV\u0005\"\u0000\u0000MQ\u0005\'\u0000\u0000NP\b\u0001\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TV\u0005\'\u0000\u0000UE\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000"+
		"\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0003\u001d\u000e\u0000XY\u0005"+
		"%\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z\\\u0003\u001d\u000e\u0000"+
		"[]\u0007\u0002\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0016\u0001"+
		"\u0000\u0000\u0000`a\u0003\u001d\u000e\u0000a\u0018\u0001\u0000\u0000"+
		"\u0000bf\u0003!\u0010\u0000ce\u0003#\u0011\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000g\u001a\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0007"+
		"\u0003\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0006\r\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pr\u0007\u0004"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t{\u0001\u0000\u0000\u0000"+
		"uw\u0005.\u0000\u0000vx\u0007\u0004\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0007\u0005\u0000\u0000"+
		"~ \u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0006\u0000\u0000\u0080\""+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0007\u0000\u0000\u0082$\u0001"+
		"\u0000\u0000\u0000\r\u00004;BIQU^flsy{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}