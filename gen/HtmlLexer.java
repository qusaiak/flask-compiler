// Generated from C:/Users/DELL/AndroidStudioProjects/flask-compiler/src/main/antlr4/com/flaskcompiler/grammar/HtmlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, HTML_TEXT=2, TAG_SLASH_CLOSE=3, TAG_CLOSE=4, SLASH=5, EQUALS=6, 
		TAG_NAME=7, ATTR_VALUE=8, TAG_WS=9;
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
			"TAG_OPEN", "HTML_TEXT", "TAG_SLASH_CLOSE", "TAG_CLOSE", "SLASH", "EQUALS", 
			"TAG_NAME", "ATTR_VALUE", "TAG_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, "'/>'", "'>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "HTML_TEXT", "TAG_SLASH_CLOSE", "TAG_CLOSE", "SLASH", 
			"EQUALS", "TAG_NAME", "ATTR_VALUE", "TAG_WS"
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


	public HtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlLexer.g4"; }

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
		"\u0004\u0000\tJ\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001"+
		"\f\u0001\u001b\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006-\b\u0006"+
		"\n\u0006\f\u00060\t\u0006\u0001\u0007\u0001\u0007\u0005\u00074\b\u0007"+
		"\n\u0007\f\u00077\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"<\b\u0007\n\u0007\f\u0007?\t\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001"+
		"\b\u0004\bE\b\b\u000b\b\f\bF\u0001\b\u0001\b\u0000\u0000\t\u0002\u0001"+
		"\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012"+
		"\t\u0002\u0000\u0001\u0006\u0001\u0000<<\u0002\u0000AZaz\u0003\u00000"+
		"9AZaz\u0001\u0000\"\"\u0001\u0000\'\'\u0003\u0000\t\n\r\r  N\u0000\u0002"+
		"\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0001\u0006"+
		"\u0001\u0000\u0000\u0000\u0001\b\u0001\u0000\u0000\u0000\u0001\n\u0001"+
		"\u0000\u0000\u0000\u0001\f\u0001\u0000\u0000\u0000\u0001\u000e\u0001\u0000"+
		"\u0000\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000"+
		"\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b\"\u0001\u0000\u0000"+
		"\u0000\n&\u0001\u0000\u0000\u0000\f(\u0001\u0000\u0000\u0000\u000e*\u0001"+
		"\u0000\u0000\u0000\u0010A\u0001\u0000\u0000\u0000\u0012D\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005<\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0006\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\b\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005/\u0000\u0000\u001e\u001f\u0005>\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0006\u0002\u0001\u0000!\u0007\u0001\u0000\u0000"+
		"\u0000\"#\u0005>\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0003\u0001"+
		"\u0000%\t\u0001\u0000\u0000\u0000&\'\u0005/\u0000\u0000\'\u000b\u0001"+
		"\u0000\u0000\u0000()\u0005=\u0000\u0000)\r\u0001\u0000\u0000\u0000*.\u0007"+
		"\u0001\u0000\u0000+-\u0007\u0002\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/\u000f\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000015\u0005"+
		"\"\u0000\u000024\b\u0003\u0000\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008B\u0005\"\u0000\u0000"+
		"9=\u0005\'\u0000\u0000:<\b\u0004\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0005\'\u0000"+
		"\u0000A1\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000\u0000B\u0011\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0005\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HI\u0006\b\u0002\u0000I\u0013\u0001\u0000"+
		"\u0000\u0000\b\u0000\u0001\u001b.5=AF\u0003\u0005\u0001\u0000\u0004\u0000"+
		"\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}