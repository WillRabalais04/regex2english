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
		LPAREN=1, RPAREN=2, LBRACKET=3, RBRACKET=4, DOUBLE_AMPERSAND=5, PIPE=6, 
		CAPTURE_GROUP=7, ASTERISK=8, QMARK=9, PLUS=10, MIN_QUANTIFIER=11, RANGE_QUANTIFIER=12, 
		BACKSLASH=13, OCTAL_1=14, OCTAL_2=15, OCTAL_3=16, HEXA_2=17, HEXA_4=18, 
		CODE_POINT=19, CARRIAGE_RETURN=20, TAB=21, FORM_FEED=22, ALERT=23, ESC=24, 
		LETTER_RANGE=25, NUMBER_RANGE=26, WILDCARD=27, DIGIT=28, NON_DIGIT=29, 
		HORIZONTAL_WS=30, NON_HORIZONTAL_WS=31, WS=32, NON_WS=33, VERTICAL_WS=34, 
		NON_VERTICAL_WS=35, WORD=36, NON_WORD=37, CARET=38, DOLLAR_SIGN=39, WORD_BOUNDARY=40, 
		NON_WORD_BOUNDARY=41, INPUT_START=42, END_OF_MATCH=43, INPUT_END=44, INPUT_END_INC_NEWLINE=45, 
		LINEBREAK_MATCHER=46, NUMBER=47, LETTER=48, LOWERCASE_PO6=49, UPPERCASE_PO6=50, 
		ASCII_PO6=51, ALPHA_PO6=52, NUM_PO6=53, ALNUM_PO6=54, PUNCT_PO6=55, GLYPH_PO6=56, 
		PRINTABLE_PO6=57, BLANK_PO6=58, CTRL_PO6=59, HEXADECIMAL_PO6=60, WS_PO6=61, 
		CHAR_CLASS_LC=62, CHAR_CLASS_UC=63, CHAR_CLASS_WS=64, CHAR_CLASS_MIRRORED=65, 
		UNICODE_CLASS_LATIN=66, UNICODE_CLASS_GREEK=67, UNICODE_CLASS_UC=68, UNICODE_CLASS_ALPHA=69, 
		UNICODE_CLASS_CURR=70, UNICODE_CLASS_NOT_GREEK=71, UNICODE_CLASS_NOT_UC=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "DOUBLE_AMPERSAND", "PIPE", 
			"CAPTURE_GROUP", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", 
			"BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", 
			"CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", "LETTER_RANGE", 
			"NUMBER_RANGE", "WILDCARD", "DIGIT", "NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", 
			"WS", "NON_WS", "VERTICAL_WS", "NON_VERTICAL_WS", "WORD", "NON_WORD", 
			"CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", 
			"END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", 
			"NUMBER", "LETTER", "LOWERCASE_PO6", "UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", 
			"NUM_PO6", "ALNUM_PO6", "PUNCT_PO6", "GLYPH_PO6", "PRINTABLE_PO6", "BLANK_PO6", 
			"CTRL_PO6", "HEXADECIMAL_PO6", "WS_PO6", "CHAR_CLASS_LC", "CHAR_CLASS_UC", 
			"CHAR_CLASS_WS", "CHAR_CLASS_MIRRORED", "UNICODE_CLASS_LATIN", "UNICODE_CLASS_GREEK", 
			"UNICODE_CLASS_UC", "UNICODE_CLASS_ALPHA", "UNICODE_CLASS_CURR", "UNICODE_CLASS_NOT_GREEK", 
			"UNICODE_CLASS_NOT_UC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'&&'", "'|'", null, "'*'", "'?'", 
			"'+'", null, null, "'\\'", null, null, null, null, null, null, "'\\r'", 
			"'\\t'", "'\\f'", "'\\a'", "'\\e'", null, null, "'.'", "'\\d'", "'\\D'", 
			"'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", 
			"'^'", "'$'", "'\\b'", "'\\B'", "'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'", 
			null, null, "'\\p{Lower}'", "'\\p{Upper}'", "'\\p{ASCII}'", "'\\p{Alpha}'", 
			"'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", "'\\p{Graph}'", "'\\p{Print}'", 
			"'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", "'\\p{Space}'", "'\\p{javaLowerCase}'", 
			"'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", "'\\p{javaMirrored}'", 
			"'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", "'\\p{IsAlphabetic}'", 
			"'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "DOUBLE_AMPERSAND", 
			"PIPE", "CAPTURE_GROUP", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", 
			"RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", 
			"HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", 
			"ESC", "LETTER_RANGE", "NUMBER_RANGE", "WILDCARD", "DIGIT", "NON_DIGIT", 
			"HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "NUMBER", "LETTER", "LOWERCASE_PO6", "UPPERCASE_PO6", 
			"ASCII_PO6", "ALPHA_PO6", "NUM_PO6", "ALNUM_PO6", "PUNCT_PO6", "GLYPH_PO6", 
			"PRINTABLE_PO6", "BLANK_PO6", "CTRL_PO6", "HEXADECIMAL_PO6", "WS_PO6", 
			"CHAR_CLASS_LC", "CHAR_CLASS_UC", "CHAR_CLASS_WS", "CHAR_CLASS_MIRRORED", 
			"UNICODE_CLASS_LATIN", "UNICODE_CLASS_GREEK", "UNICODE_CLASS_UC", "UNICODE_CLASS_ALPHA", 
			"UNICODE_CLASS_CURR", "UNICODE_CLASS_NOT_GREEK", "UNICODE_CLASS_NOT_UC"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			CODE_POINT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CODE_POINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			4,5
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u026a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u00a3"+
		"\n\b\f\b\16\b\u00a6\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f"+
		"\u00b2\n\f\3\f\3\f\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00e6\n\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\6\60\u013c\n\60\r\60"+
		"\16\60\u013d\3\60\3\60\6\60\u0142\n\60\r\60\16\60\u0143\5\60\u0146\n\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39"+
		"\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\2\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\t\3\2++\3\2\62;\3\2\62"+
		"9\3\2\62\65\5\2\62;CHch\3\2\63\63\4\2C\\c|\2\u0271\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0095\3\2\2\2\7\u0097\3\2\2\2\t\u0099"+
		"\3\2\2\2\13\u009b\3\2\2\2\r\u009e\3\2\2\2\17\u00a0\3\2\2\2\21\u00a9\3"+
		"\2\2\2\23\u00ab\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b5\3\2"+
		"\2\2\33\u00bf\3\2\2\2\35\u00c1\3\2\2\2\37\u00c6\3\2\2\2!\u00cc\3\2\2\2"+
		"#\u00d3\3\2\2\2%\u00d8\3\2\2\2\'\u00e0\3\2\2\2)\u00ea\3\2\2\2+\u00ed\3"+
		"\2\2\2-\u00f0\3\2\2\2/\u00f3\3\2\2\2\61\u00f6\3\2\2\2\63\u00f9\3\2\2\2"+
		"\65\u00fd\3\2\2\2\67\u0101\3\2\2\29\u0103\3\2\2\2;\u0106\3\2\2\2=\u0109"+
		"\3\2\2\2?\u010c\3\2\2\2A\u010f\3\2\2\2C\u0112\3\2\2\2E\u0115\3\2\2\2G"+
		"\u0118\3\2\2\2I\u011b\3\2\2\2K\u011e\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u012e\3\2\2\2Y\u0131"+
		"\3\2\2\2[\u0134\3\2\2\2]\u0137\3\2\2\2_\u013b\3\2\2\2a\u0147\3\2\2\2c"+
		"\u0149\3\2\2\2e\u0153\3\2\2\2g\u015d\3\2\2\2i\u0167\3\2\2\2k\u0171\3\2"+
		"\2\2m\u017b\3\2\2\2o\u0185\3\2\2\2q\u018f\3\2\2\2s\u0199\3\2\2\2u\u01a3"+
		"\3\2\2\2w\u01ad\3\2\2\2y\u01b7\3\2\2\2{\u01c2\3\2\2\2}\u01cc\3\2\2\2\177"+
		"\u01de\3\2\2\2\u0081\u01f0\3\2\2\2\u0083\u0203\3\2\2\2\u0085\u0214\3\2"+
		"\2\2\u0087\u0220\3\2\2\2\u0089\u022c\3\2\2\2\u008b\u0233\3\2\2\2\u008d"+
		"\u0244\3\2\2\2\u008f\u024b\3\2\2\2\u0091\u0257\3\2\2\2\u0093\u0094\7*"+
		"\2\2\u0094\4\3\2\2\2\u0095\u0096\7+\2\2\u0096\6\3\2\2\2\u0097\u0098\7"+
		"]\2\2\u0098\b\3\2\2\2\u0099\u009a\7_\2\2\u009a\n\3\2\2\2\u009b\u009c\7"+
		"(\2\2\u009c\u009d\7(\2\2\u009d\f\3\2\2\2\u009e\u009f\7~\2\2\u009f\16\3"+
		"\2\2\2\u00a0\u00a4\7*\2\2\u00a1\u00a3\n\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8\20\3\2\2\2\u00a9\u00aa"+
		"\7,\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7A\2\2\u00ac\24\3\2\2\2\u00ad\u00ae"+
		"\7-\2\2\u00ae\26\3\2\2\2\u00af\u00b1\7}\2\2\u00b0\u00b2\t\3\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\177"+
		"\2\2\u00b4\30\3\2\2\2\u00b5\u00b7\7}\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7.\2\2\u00ba"+
		"\u00bc\t\3\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7\177\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7^\2\2\u00c0\34"+
		"\3\2\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\t\4\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c8\7\62\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb\t\4\2\2\u00cb "+
		"\3\2\2\2\u00cc\u00cd\7^\2\2\u00cd\u00ce\7\62\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\t\5\2\2\u00d0\u00d1\t\4\2\2\u00d1\u00d2\t\4\2\2\u00d2\"\3\2\2\2"+
		"\u00d3\u00d4\7^\2\2\u00d4\u00d5\7z\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\t\6\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7^\2\2\u00d9\u00da\7z\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\t\6\2\2\u00dc\u00dd\t\6\2\2\u00dd\u00de\t\6\2\2\u00de"+
		"\u00df\t\6\2\2\u00df&\3\2\2\2\u00e0\u00e1\7W\2\2\u00e1\u00e2\7^\2\2\u00e2"+
		"\u00e3\7-\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\t\7\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\t\6\2\2\u00e8"+
		"\u00e9\b\24\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"*\3\2\2\2\u00ed\u00ee\7^\2\2\u00ee\u00ef\7v\2\2\u00ef,\3\2\2\2\u00f0\u00f1"+
		"\7^\2\2\u00f1\u00f2\7h\2\2\u00f2.\3\2\2\2\u00f3\u00f4\7^\2\2\u00f4\u00f5"+
		"\7c\2\2\u00f5\60\3\2\2\2\u00f6\u00f7\7^\2\2\u00f7\u00f8\7g\2\2\u00f8\62"+
		"\3\2\2\2\u00f9\u00fa\t\b\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\t\b\2\2\u00fc"+
		"\64\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100\t\3\2\2"+
		"\u0100\66\3\2\2\2\u0101\u0102\7\60\2\2\u01028\3\2\2\2\u0103\u0104\7^\2"+
		"\2\u0104\u0105\7f\2\2\u0105:\3\2\2\2\u0106\u0107\7^\2\2\u0107\u0108\7"+
		"F\2\2\u0108<\3\2\2\2\u0109\u010a\7^\2\2\u010a\u010b\7j\2\2\u010b>\3\2"+
		"\2\2\u010c\u010d\7^\2\2\u010d\u010e\7J\2\2\u010e@\3\2\2\2\u010f\u0110"+
		"\7^\2\2\u0110\u0111\7u\2\2\u0111B\3\2\2\2\u0112\u0113\7^\2\2\u0113\u0114"+
		"\7U\2\2\u0114D\3\2\2\2\u0115\u0116\7^\2\2\u0116\u0117\7x\2\2\u0117F\3"+
		"\2\2\2\u0118\u0119\7^\2\2\u0119\u011a\7X\2\2\u011aH\3\2\2\2\u011b\u011c"+
		"\7^\2\2\u011c\u011d\7y\2\2\u011dJ\3\2\2\2\u011e\u011f\7^\2\2\u011f\u0120"+
		"\7Y\2\2\u0120L\3\2\2\2\u0121\u0122\7`\2\2\u0122N\3\2\2\2\u0123\u0124\7"+
		"&\2\2\u0124P\3\2\2\2\u0125\u0126\7^\2\2\u0126\u0127\7d\2\2\u0127R\3\2"+
		"\2\2\u0128\u0129\7^\2\2\u0129\u012a\7D\2\2\u012aT\3\2\2\2\u012b\u012c"+
		"\7^\2\2\u012c\u012d\7C\2\2\u012dV\3\2\2\2\u012e\u012f\7^\2\2\u012f\u0130"+
		"\7I\2\2\u0130X\3\2\2\2\u0131\u0132\7^\2\2\u0132\u0133\7|\2\2\u0133Z\3"+
		"\2\2\2\u0134\u0135\7^\2\2\u0135\u0136\7\\\2\2\u0136\\\3\2\2\2\u0137\u0138"+
		"\7^\2\2\u0138\u0139\7T\2\2\u0139^\3\2\2\2\u013a\u013c\4\62;\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0145\3\2\2\2\u013f\u0141\7\60\2\2\u0140\u0142\4\62;\2\u0141\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0146\3\2\2\2\u0146`\3\2\2\2"+
		"\u0147\u0148\t\b\2\2\u0148b\3\2\2\2\u0149\u014a\7^\2\2\u014a\u014b\7r"+
		"\2\2\u014b\u014c\7}\2\2\u014c\u014d\7N\2\2\u014d\u014e\7q\2\2\u014e\u014f"+
		"\7y\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2\u0151\u0152\7\177\2\2\u0152"+
		"d\3\2\2\2\u0153\u0154\7^\2\2\u0154\u0155\7r\2\2\u0155\u0156\7}\2\2\u0156"+
		"\u0157\7W\2\2\u0157\u0158\7r\2\2\u0158\u0159\7r\2\2\u0159\u015a\7g\2\2"+
		"\u015a\u015b\7t\2\2\u015b\u015c\7\177\2\2\u015cf\3\2\2\2\u015d\u015e\7"+
		"^\2\2\u015e\u015f\7r\2\2\u015f\u0160\7}\2\2\u0160\u0161\7C\2\2\u0161\u0162"+
		"\7U\2\2\u0162\u0163\7E\2\2\u0163\u0164\7K\2\2\u0164\u0165\7K\2\2\u0165"+
		"\u0166\7\177\2\2\u0166h\3\2\2\2\u0167\u0168\7^\2\2\u0168\u0169\7r\2\2"+
		"\u0169\u016a\7}\2\2\u016a\u016b\7C\2\2\u016b\u016c\7n\2\2\u016c\u016d"+
		"\7r\2\2\u016d\u016e\7j\2\2\u016e\u016f\7c\2\2\u016f\u0170\7\177\2\2\u0170"+
		"j\3\2\2\2\u0171\u0172\7^\2\2\u0172\u0173\7r\2\2\u0173\u0174\7}\2\2\u0174"+
		"\u0175\7F\2\2\u0175\u0176\7k\2\2\u0176\u0177\7i\2\2\u0177\u0178\7k\2\2"+
		"\u0178\u0179\7v\2\2\u0179\u017a\7\177\2\2\u017al\3\2\2\2\u017b\u017c\7"+
		"^\2\2\u017c\u017d\7r\2\2\u017d\u017e\7}\2\2\u017e\u017f\7C\2\2\u017f\u0180"+
		"\7n\2\2\u0180\u0181\7p\2\2\u0181\u0182\7w\2\2\u0182\u0183\7o\2\2\u0183"+
		"\u0184\7\177\2\2\u0184n\3\2\2\2\u0185\u0186\7^\2\2\u0186\u0187\7r\2\2"+
		"\u0187\u0188\7}\2\2\u0188\u0189\7R\2\2\u0189\u018a\7w\2\2\u018a\u018b"+
		"\7p\2\2\u018b\u018c\7e\2\2\u018c\u018d\7v\2\2\u018d\u018e\7\177\2\2\u018e"+
		"p\3\2\2\2\u018f\u0190\7^\2\2\u0190\u0191\7r\2\2\u0191\u0192\7}\2\2\u0192"+
		"\u0193\7I\2\2\u0193\u0194\7t\2\2\u0194\u0195\7c\2\2\u0195\u0196\7r\2\2"+
		"\u0196\u0197\7j\2\2\u0197\u0198\7\177\2\2\u0198r\3\2\2\2\u0199\u019a\7"+
		"^\2\2\u019a\u019b\7r\2\2\u019b\u019c\7}\2\2\u019c\u019d\7R\2\2\u019d\u019e"+
		"\7t\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"\u01a2\7\177\2\2\u01a2t\3\2\2\2\u01a3\u01a4\7^\2\2\u01a4\u01a5\7r\2\2"+
		"\u01a5\u01a6\7}\2\2\u01a6\u01a7\7D\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9"+
		"\7c\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7m\2\2\u01ab\u01ac\7\177\2\2\u01ac"+
		"v\3\2\2\2\u01ad\u01ae\7^\2\2\u01ae\u01af\7r\2\2\u01af\u01b0\7}\2\2\u01b0"+
		"\u01b1\7E\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7t\2\2"+
		"\u01b4\u01b5\7n\2\2\u01b5\u01b6\7\177\2\2\u01b6x\3\2\2\2\u01b7\u01b8\7"+
		"^\2\2\u01b8\u01b9\7r\2\2\u01b9\u01ba\7}\2\2\u01ba\u01bb\7Z\2\2\u01bb\u01bc"+
		"\7F\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7i\2\2\u01be\u01bf\7k\2\2\u01bf"+
		"\u01c0\7v\2\2\u01c0\u01c1\7\177\2\2\u01c1z\3\2\2\2\u01c2\u01c3\7^\2\2"+
		"\u01c3\u01c4\7r\2\2\u01c4\u01c5\7}\2\2\u01c5\u01c6\7U\2\2\u01c6\u01c7"+
		"\7r\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7g\2\2\u01ca"+
		"\u01cb\7\177\2\2\u01cb|\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01ce\7r\2\2"+
		"\u01ce\u01cf\7}\2\2\u01cf\u01d0\7l\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2"+
		"\7x\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7N\2\2\u01d4\u01d5\7q\2\2\u01d5"+
		"\u01d6\7y\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7t\2\2\u01d8\u01d9\7E\2\2"+
		"\u01d9\u01da\7c\2\2\u01da\u01db\7u\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd"+
		"\7\177\2\2\u01dd~\3\2\2\2\u01de\u01df\7^\2\2\u01df\u01e0\7r\2\2\u01e0"+
		"\u01e1\7}\2\2\u01e1\u01e2\7l\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7x\2\2"+
		"\u01e4\u01e5\7c\2\2\u01e5\u01e6\7W\2\2\u01e6\u01e7\7r\2\2\u01e7\u01e8"+
		"\7r\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7E\2\2\u01eb"+
		"\u01ec\7c\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7\177"+
		"\2\2\u01ef\u0080\3\2\2\2\u01f0\u01f1\7^\2\2\u01f1\u01f2\7r\2\2\u01f2\u01f3"+
		"\7}\2\2\u01f3\u01f4\7l\2\2\u01f4\u01f5\7c\2\2\u01f5\u01f6\7x\2\2\u01f6"+
		"\u01f7\7c\2\2\u01f7\u01f8\7Y\2\2\u01f8\u01f9\7j\2\2\u01f9\u01fa\7k\2\2"+
		"\u01fa\u01fb\7v\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7u\2\2\u01fd\u01fe"+
		"\7r\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7e\2\2\u0200\u0201\7g\2\2\u0201"+
		"\u0202\7\177\2\2\u0202\u0082\3\2\2\2\u0203\u0204\7^\2\2\u0204\u0205\7"+
		"r\2\2\u0205\u0206\7}\2\2\u0206\u0207\7l\2\2\u0207\u0208\7c\2\2\u0208\u0209"+
		"\7x\2\2\u0209\u020a\7c\2\2\u020a\u020b\7O\2\2\u020b\u020c\7k\2\2\u020c"+
		"\u020d\7t\2\2\u020d\u020e\7t\2\2\u020e\u020f\7q\2\2\u020f\u0210\7t\2\2"+
		"\u0210\u0211\7g\2\2\u0211\u0212\7f\2\2\u0212\u0213\7\177\2\2\u0213\u0084"+
		"\3\2\2\2\u0214\u0215\7^\2\2\u0215\u0216\7r\2\2\u0216\u0217\7}\2\2\u0217"+
		"\u0218\7K\2\2\u0218\u0219\7u\2\2\u0219\u021a\7N\2\2\u021a\u021b\7c\2\2"+
		"\u021b\u021c\7v\2\2\u021c\u021d\7k\2\2\u021d\u021e\7p\2\2\u021e\u021f"+
		"\7\177\2\2\u021f\u0086\3\2\2\2\u0220\u0221\7^\2\2\u0221\u0222\7r\2\2\u0222"+
		"\u0223\7}\2\2\u0223\u0224\7K\2\2\u0224\u0225\7p\2\2\u0225\u0226\7I\2\2"+
		"\u0226\u0227\7t\2\2\u0227\u0228\7g\2\2\u0228\u0229\7g\2\2\u0229\u022a"+
		"\7m\2\2\u022a\u022b\7\177\2\2\u022b\u0088\3\2\2\2\u022c\u022d\7^\2\2\u022d"+
		"\u022e\7r\2\2\u022e\u022f\7}\2\2\u022f\u0230\7N\2\2\u0230\u0231\7w\2\2"+
		"\u0231\u0232\7\177\2\2\u0232\u008a\3\2\2\2\u0233\u0234\7^\2\2\u0234\u0235"+
		"\7r\2\2\u0235\u0236\7}\2\2\u0236\u0237\7K\2\2\u0237\u0238\7u\2\2\u0238"+
		"\u0239\7C\2\2\u0239\u023a\7n\2\2\u023a\u023b\7r\2\2\u023b\u023c\7j\2\2"+
		"\u023c\u023d\7c\2\2\u023d\u023e\7d\2\2\u023e\u023f\7g\2\2\u023f\u0240"+
		"\7v\2\2\u0240\u0241\7k\2\2\u0241\u0242\7e\2\2\u0242\u0243\7\177\2\2\u0243"+
		"\u008c\3\2\2\2\u0244\u0245\7^\2\2\u0245\u0246\7r\2\2\u0246\u0247\7}\2"+
		"\2\u0247\u0248\7U\2\2\u0248\u0249\7e\2\2\u0249\u024a\7\177\2\2\u024a\u008e"+
		"\3\2\2\2\u024b\u024c\7^\2\2\u024c\u024d\7R\2\2\u024d\u024e\7}\2\2\u024e"+
		"\u024f\7K\2\2\u024f\u0250\7p\2\2\u0250\u0251\7I\2\2\u0251\u0252\7t\2\2"+
		"\u0252\u0253\7g\2\2\u0253\u0254\7g\2\2\u0254\u0255\7m\2\2\u0255\u0256"+
		"\7\177\2\2\u0256\u0090\3\2\2\2\u0257\u0258\7]\2\2\u0258\u0259\7^\2\2\u0259"+
		"\u025a\7r\2\2\u025a\u025b\7}\2\2\u025b\u025c\7N\2\2\u025c\u025d\7\177"+
		"\2\2\u025d\u025e\7(\2\2\u025e\u025f\7(\2\2\u025f\u0260\7]\2\2\u0260\u0261"+
		"\7`\2\2\u0261\u0262\7^\2\2\u0262\u0263\7r\2\2\u0263\u0264\7}\2\2\u0264"+
		"\u0265\7N\2\2\u0265\u0266\7w\2\2\u0266\u0267\7\177\2\2\u0267\u0268\7_"+
		"\2\2\u0268\u0269\7_\2\2\u0269\u0092\3\2\2\2\13\2\u00a4\u00b1\u00b7\u00bb"+
		"\u00e5\u013d\u0143\u0145\3\3\24\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}