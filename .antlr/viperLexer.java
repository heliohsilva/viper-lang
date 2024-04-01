// Generated from /home/heliohsilva/Projects/viper-lang/viper.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class viperLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TIPO=2, FUNC=3, PROC=4, ATRTO=5, AP=6, FP=7, WR=8, CONCAT=9, OPARIT=10, 
		OPRELA=11, ID=12, NUM=13, WS=14, ErrorChar=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TIPO", "FUNC", "PROC", "ATRTO", "AP", "FP", "WR", "CONCAT", 
			"OPARIT", "OPRELA", "LETRA", "NUMERO", "ID", "NUM", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'`'", null, "'function'", "'procedure'", "'='", "'('", "')'", 
			"'out'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "FUNC", "PROC", "ATRTO", "AP", "FP", "WR", "CONCAT", 
			"OPARIT", "OPRELA", "ID", "NUM", "WS", "ErrorChar"
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


	public viperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "viper.g4"; }

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
		"\u0004\u0000\u000f\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nb\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0005\rk\b\r\n\r\f\rn\t\r\u0001\u000e\u0004"+
		"\u000eq\b\u000e\u000b\u000e\f\u000er\u0001\u000e\u0001\u000e\u0004\u000e"+
		"w\b\u000e\u000b\u000e\f\u000ex\u0003\u000e{\b\u000e\u0001\u000f\u0004"+
		"\u000f~\b\u000f\u000b\u000f\f\u000f\u007f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\u0000\u0019\u0000\u001b\f\u001d\r\u001f\u000e!\u000f\u0001"+
		"\u0000\u0005\u0004\u0000%%*+--//\u0002\u0000<<>>\u0002\u0000AZaz\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u008f\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000"+
		"\u0007@\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bL\u0001"+
		"\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000"+
		"\u0000\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015"+
		"a\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019e\u0001"+
		"\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000"+
		"\u0000\u001f}\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#"+
		"$\u0005`\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005i\u0000\u0000"+
		"&\'\u0005n\u0000\u0000\'6\u0005t\u0000\u0000()\u0005f\u0000\u0000)*\u0005"+
		"l\u0000\u0000*+\u0005o\u0000\u0000+,\u0005a\u0000\u0000,6\u0005t\u0000"+
		"\u0000-.\u0005c\u0000\u0000./\u0005h\u0000\u0000/0\u0005a\u0000\u0000"+
		"06\u0005r\u0000\u000012\u0005b\u0000\u000023\u0005o\u0000\u000034\u0005"+
		"o\u0000\u000046\u0005l\u0000\u00005%\u0001\u0000\u0000\u00005(\u0001\u0000"+
		"\u0000\u00005-\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u00006\u0004"+
		"\u0001\u0000\u0000\u000078\u0005f\u0000\u000089\u0005u\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005c\u0000\u0000;<\u0005t\u0000\u0000<=\u0005i\u0000"+
		"\u0000=>\u0005o\u0000\u0000>?\u0005n\u0000\u0000?\u0006\u0001\u0000\u0000"+
		"\u0000@A\u0005p\u0000\u0000AB\u0005r\u0000\u0000BC\u0005o\u0000\u0000"+
		"CD\u0005c\u0000\u0000DE\u0005e\u0000\u0000EF\u0005d\u0000\u0000FG\u0005"+
		"u\u0000\u0000GH\u0005r\u0000\u0000HI\u0005e\u0000\u0000I\b\u0001\u0000"+
		"\u0000\u0000JK\u0005=\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005("+
		"\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005)\u0000\u0000O\u000e\u0001"+
		"\u0000\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005u\u0000\u0000RS\u0005t"+
		"\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005.\u0000\u0000U\u0012"+
		"\u0001\u0000\u0000\u0000VW\u0007\u0000\u0000\u0000W\u0014\u0001\u0000"+
		"\u0000\u0000XY\u0005=\u0000\u0000Yb\u0005=\u0000\u0000Z[\u0005!\u0000"+
		"\u0000[b\u0005=\u0000\u0000\\b\u0007\u0001\u0000\u0000]^\u0005>\u0000"+
		"\u0000^b\u0005=\u0000\u0000_`\u0005<\u0000\u0000`b\u0005=\u0000\u0000"+
		"aX\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\u0016\u0001"+
		"\u0000\u0000\u0000cd\u0007\u0002\u0000\u0000d\u0018\u0001\u0000\u0000"+
		"\u0000ef\u0007\u0003\u0000\u0000f\u001a\u0001\u0000\u0000\u0000gl\u0003"+
		"\u0017\u000b\u0000hk\u0003\u0019\f\u0000ik\u0003\u0017\u000b\u0000jh\u0001"+
		"\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u001c\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0003\u0019\f\u0000po\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sz\u0001\u0000\u0000\u0000tv\u0005,\u0000\u0000uw\u0003"+
		"\u0019\f\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zt\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u001e\u0001\u0000"+
		"\u0000\u0000|~\u0007\u0004\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006"+
		"\u000f\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084\t\u0000"+
		"\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\t\u00005ajlrxz\u007f\u0001"+
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