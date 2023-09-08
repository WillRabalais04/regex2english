// Generated from /Users/willrabalais/Code/Projects/regex2english/app/src/main/regex2english.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regex2englishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PIPE=6, CAPTURE_GROUP=7, ASTERISK=8, 
		QMARK=9, PLUS=10, MIN_QUANTIFIER=11, RANGE_QUANTIFIER=12, BACKSLASH=13, 
		OCTAL_ONE=14, OCTAL_TWO=15, OCTAL_THREE=16, HEXA_TWO=17, HEXA_FOUR=18, 
		CARRIAGE_RETURN=19, TAB=20, FORM_FEED=21, ALERT=22, ESC=23, WILDCARD=24, 
		DIGIT=25, NON_DIGIT=26, HORIZONTAL_WS=27, NON_HORIZONTAL_WS=28, WS=29, 
		NON_WS=30, VERTICAL_WS=31, NON_VERTICAL_WS=32, WORD=33, NON_WORD=34, CARET=35, 
		DOLLAR_SIGN=36, WORD_BOUNDARY=37, INPUT_START=38, END_OF_MATCH=39, INPUT_END=40, 
		INPUT_END_INC_NEWLINE=41, LINEBREAK_MATCHER=42, NUMBER=43, LETTERS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "PIPE", "CAPTURE_GROUP", "ASTERISK", 
			"QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_ONE", 
			"OCTAL_TWO", "OCTAL_THREE", "HEXA_TWO", "HEXA_FOUR", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "WILDCARD", "DIGIT", "NON_DIGIT", 
			"HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "NUMBER", "LETTERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "')'", "'/'", "'%'", "'|'", null, "'*'", "'?'", "'+'", 
			null, null, "'\\'", null, null, null, null, null, "'\\r'", "'\\t'", "'\\f'", 
			"'\\a'", "'\\e'", "'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", 
			"'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", "'^'", "'$'", "'\\b'", "'\\A'", 
			"'\\G'", "'\\z'", "'\\Z'", "'\\R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PIPE", "CAPTURE_GROUP", "ASTERISK", 
			"QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_ONE", 
			"OCTAL_TWO", "OCTAL_THREE", "HEXA_TWO", "HEXA_FOUR", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "WILDCARD", "DIGIT", "NON_DIGIT", 
			"HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "NUMBER", "LETTERS"
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


	public regex2englishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "regex2english.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b"+
		"j\n\b\f\b\16\bm\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\fy\n"+
		"\f\3\f\3\f\3\r\3\r\5\r\177\n\r\3\r\3\r\5\r\u0083\n\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\6,\u00ee\n,\r,\16,\u00ef\3,\3,\6,\u00f4\n,\r,\16"+
		",\u00f5\5,\u00f8\n,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\3"+
		"\2++\3\2\62;\3\2\629\3\2\62\65\5\2\62;CHch\3\2c|\2\u0101\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2"+
		"\2\2\re\3\2\2\2\17g\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3"+
		"\2\2\2\31|\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2\2"+
		"!\u0093\3\2\2\2#\u009a\3\2\2\2%\u009f\3\2\2\2\'\u00a7\3\2\2\2)\u00aa\3"+
		"\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61\u00b6\3\2\2\2\63"+
		"\u00b8\3\2\2\2\65\u00bb\3\2\2\2\67\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00ca\3\2\2\2A\u00cd\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d6\3\2\2\2I\u00d8\3\2\2\2K\u00da\3\2\2\2M\u00dd\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u00e3\3\2\2\2S\u00e6\3\2\2\2U\u00e9\3\2\2\2W\u00ed"+
		"\3\2\2\2Y\u00f9\3\2\2\2[\\\7/\2\2\\\4\3\2\2\2]^\7*\2\2^\6\3\2\2\2_`\7"+
		"+\2\2`\b\3\2\2\2ab\7\61\2\2b\n\3\2\2\2cd\7\'\2\2d\f\3\2\2\2ef\7~\2\2f"+
		"\16\3\2\2\2gk\7*\2\2hj\n\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ln\3\2\2\2mk\3\2\2\2no\7+\2\2o\20\3\2\2\2pq\7,\2\2q\22\3\2\2\2rs\7A\2"+
		"\2s\24\3\2\2\2tu\7-\2\2u\26\3\2\2\2vx\7}\2\2wy\t\3\2\2xw\3\2\2\2xy\3\2"+
		"\2\2yz\3\2\2\2z{\7\177\2\2{\30\3\2\2\2|~\7}\2\2}\177\t\3\2\2~}\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\7.\2\2\u0081\u0083\t\3\2\2"+
		"\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\7\177\2\2\u0085\32\3\2\2\2\u0086\u0087\7^\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7^\2\2\u0089\u008a\7\62\2\2\u008a\u008b\3\2\2\2\u008b\u008c\t\4"+
		"\2\2\u008c\36\3\2\2\2\u008d\u008e\7^\2\2\u008e\u008f\7\62\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\t\4\2\2\u0091\u0092\t\4\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\7^\2\2\u0094\u0095\7\62\2\2\u0095\u0096\3\2\2\2\u0096\u0097\t\5"+
		"\2\2\u0097\u0098\t\4\2\2\u0098\u0099\t\4\2\2\u0099\"\3\2\2\2\u009a\u009b"+
		"\7^\2\2\u009b\u009c\7z\2\2\u009c\u009d\3\2\2\2\u009d\u009e\t\6\2\2\u009e"+
		"$\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1\7z\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\t\6\2\2\u00a3\u00a4\t\6\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00a6\t\6"+
		"\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7^\2\2\u00a8\u00a9\7t\2\2\u00a9(\3\2\2"+
		"\2\u00aa\u00ab\7^\2\2\u00ab\u00ac\7v\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7"+
		"^\2\2\u00ae\u00af\7h\2\2\u00af,\3\2\2\2\u00b0\u00b1\7^\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\7g\2\2\u00b5\60"+
		"\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7^\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7^\2\2\u00bc\u00bd\7F\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7^\2\2\u00bf\u00c0\7j\2\2\u00c08\3\2\2\2\u00c1"+
		"\u00c2\7^\2\2\u00c2\u00c3\7J\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7^\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\u00c9\7U\2\2\u00c9"+
		">\3\2\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cc\7x\2\2\u00cc@\3\2\2\2\u00cd\u00ce"+
		"\7^\2\2\u00ce\u00cf\7X\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d2"+
		"\7y\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7^\2\2\u00d4\u00d5\7Y\2\2\u00d5F\3"+
		"\2\2\2\u00d6\u00d7\7`\2\2\u00d7H\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9J\3\2"+
		"\2\2\u00da\u00db\7^\2\2\u00db\u00dc\7d\2\2\u00dcL\3\2\2\2\u00dd\u00de"+
		"\7^\2\2\u00de\u00df\7C\2\2\u00dfN\3\2\2\2\u00e0\u00e1\7^\2\2\u00e1\u00e2"+
		"\7I\2\2\u00e2P\3\2\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e5\7|\2\2\u00e5R\3"+
		"\2\2\2\u00e6\u00e7\7^\2\2\u00e7\u00e8\7\\\2\2\u00e8T\3\2\2\2\u00e9\u00ea"+
		"\7^\2\2\u00ea\u00eb\7T\2\2\u00ebV\3\2\2\2\u00ec\u00ee\4\62;\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f7\3\2\2\2\u00f1\u00f3\7\60\2\2\u00f2\u00f4\4\62;\2\u00f3\u00f2\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8X\3\2\2\2"+
		"\u00f9\u00fa\t\7\2\2\u00faZ\3\2\2\2\n\2kx~\u0082\u00ef\u00f5\u00f7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}