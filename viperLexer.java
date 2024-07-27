// Generated from /home/guilherme/Desktop/viper-lang/viper.g4 by ANTLR 4.13.1
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
		T__0=1, TIPO=2, FUNC=3, PROC=4, ATRTO=5, AP=6, FP=7, AC=8, FC=9, WR=10, 
		CONCAT=11, OPARIT=12, OPRELA=13, WHILE=14, IF=15, ELSE=16, ID=17, NUM=18, 
		WS=19, ErrorChar=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TIPO", "FUNC", "PROC", "ATRTO", "AP", "FP", "AC", "FC", "WR", 
			"CONCAT", "OPARIT", "OPRELA", "WHILE", "IF", "ELSE", "LETRA", "NUMERO", 
			"ID", "NUM", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'function'", "'procedure'", "'='", "'('", "')'", 
			"'{'", "'}'", "'out'", "'.'", null, null, "'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "FUNC", "PROC", "ATRTO", "AP", "FP", "AC", "FC", 
			"WR", "CONCAT", "OPARIT", "OPRELA", "WHILE", "IF", "ELSE", "ID", "NUM", 
			"WS", "ErrorChar"
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
		"\u0004\u0000\u0014\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\fp\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0087"+
		"\b\u0012\n\u0012\f\u0012\u008a\t\u0012\u0001\u0013\u0004\u0013\u008d\b"+
		"\u0013\u000b\u0013\f\u0013\u008e\u0001\u0013\u0001\u0013\u0004\u0013\u0093"+
		"\b\u0013\u000b\u0013\f\u0013\u0094\u0003\u0013\u0097\b\u0013\u0001\u0014"+
		"\u0004\u0014\u009a\b\u0014\u000b\u0014\f\u0014\u009b\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000"+
		"#\u0000%\u0011\'\u0012)\u0013+\u0014\u0001\u0000\u0005\u0004\u0000%%*"+
		"+--//\u0002\u0000<<>>\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u00ab\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000"+
		"\u0000\u0007J\u0001\u0000\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000b"+
		"V\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000"+
		"\u0000\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000"+
		"\u0000\u0015b\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019"+
		"o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001dw\u0001"+
		"\u0000\u0000\u0000\u001fz\u0001\u0000\u0000\u0000!\u007f\u0001\u0000\u0000"+
		"\u0000#\u0081\u0001\u0000\u0000\u0000%\u0083\u0001\u0000\u0000\u0000\'"+
		"\u008c\u0001\u0000\u0000\u0000)\u0099\u0001\u0000\u0000\u0000+\u009f\u0001"+
		"\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0002\u0001\u0000\u0000\u0000"+
		"/0\u0005i\u0000\u000001\u0005n\u0000\u00001@\u0005t\u0000\u000023\u0005"+
		"f\u0000\u000034\u0005l\u0000\u000045\u0005o\u0000\u000056\u0005a\u0000"+
		"\u00006@\u0005t\u0000\u000078\u0005c\u0000\u000089\u0005h\u0000\u0000"+
		"9:\u0005a\u0000\u0000:@\u0005r\u0000\u0000;<\u0005b\u0000\u0000<=\u0005"+
		"o\u0000\u0000=>\u0005o\u0000\u0000>@\u0005l\u0000\u0000?/\u0001\u0000"+
		"\u0000\u0000?2\u0001\u0000\u0000\u0000?7\u0001\u0000\u0000\u0000?;\u0001"+
		"\u0000\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000"+
		"BC\u0005u\u0000\u0000CD\u0005n\u0000\u0000DE\u0005c\u0000\u0000EF\u0005"+
		"t\u0000\u0000FG\u0005i\u0000\u0000GH\u0005o\u0000\u0000HI\u0005n\u0000"+
		"\u0000I\u0006\u0001\u0000\u0000\u0000JK\u0005p\u0000\u0000KL\u0005r\u0000"+
		"\u0000LM\u0005o\u0000\u0000MN\u0005c\u0000\u0000NO\u0005e\u0000\u0000"+
		"OP\u0005d\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005r\u0000\u0000RS\u0005"+
		"e\u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005=\u0000\u0000U\n\u0001"+
		"\u0000\u0000\u0000VW\u0005(\u0000\u0000W\f\u0001\u0000\u0000\u0000XY\u0005"+
		")\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005{\u0000\u0000[\u0010"+
		"\u0001\u0000\u0000\u0000\\]\u0005}\u0000\u0000]\u0012\u0001\u0000\u0000"+
		"\u0000^_\u0005o\u0000\u0000_`\u0005u\u0000\u0000`a\u0005t\u0000\u0000"+
		"a\u0014\u0001\u0000\u0000\u0000bc\u0005.\u0000\u0000c\u0016\u0001\u0000"+
		"\u0000\u0000de\u0007\u0000\u0000\u0000e\u0018\u0001\u0000\u0000\u0000"+
		"fg\u0005=\u0000\u0000gp\u0005=\u0000\u0000hi\u0005!\u0000\u0000ip\u0005"+
		"=\u0000\u0000jp\u0007\u0001\u0000\u0000kl\u0005>\u0000\u0000lp\u0005="+
		"\u0000\u0000mn\u0005<\u0000\u0000np\u0005=\u0000\u0000of\u0001\u0000\u0000"+
		"\u0000oh\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000p\u001a\u0001\u0000\u0000\u0000"+
		"qr\u0005w\u0000\u0000rs\u0005h\u0000\u0000st\u0005i\u0000\u0000tu\u0005"+
		"l\u0000\u0000uv\u0005e\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005"+
		"i\u0000\u0000xy\u0005f\u0000\u0000y\u001e\u0001\u0000\u0000\u0000z{\u0005"+
		"e\u0000\u0000{|\u0005l\u0000\u0000|}\u0005s\u0000\u0000}~\u0005e\u0000"+
		"\u0000~ \u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0002\u0000\u0000\u0080"+
		"\"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0003\u0000\u0000\u0082$"+
		"\u0001\u0000\u0000\u0000\u0083\u0088\u0003!\u0010\u0000\u0084\u0087\u0003"+
		"!\u0010\u0000\u0085\u0087\u0003#\u0011\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089&\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0003#\u0011\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0096\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0005,\u0000\u0000\u0091\u0093\u0003#\u0011\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097(\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0004"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0006\u0014"+
		"\u0000\u0000\u009e*\u0001\u0000\u0000\u0000\u009f\u00a0\t\u0000\u0000"+
		"\u0000\u00a0,\u0001\u0000\u0000\u0000\t\u0000?o\u0086\u0088\u008e\u0094"+
		"\u0096\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}