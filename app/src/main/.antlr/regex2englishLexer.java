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
		CARET=1, LETTERS_INSIDE_CHAR_CLASS=2, LETTER_RANGE=3, NUMBER_RANGE=4, 
		DOUBLE_AMPERSAND=5, PIPE_ESCAPED=6, BACKSLASH_ESCAPED=7, LPAREN_ESCAPED=8, 
		RPAREN_ESCAPED=9, LBRACKET_ESCAPED=10, RBRACKET_ESCAPED=11, DOT_ESCAPED=12, 
		CARET_ESCAPED=13, QMARK_ESCAPED=14, ASTERISK_ESCAPED=15, DOLLAR_SIGN_ESCAPED=16, 
		HYPHEN_ESCAPED=17, LBRACKET=18, RBRACKET=19, LPAREN=20, RPAREN=21, LETTERS_OUTSIDE_CHAR_CLASS=22, 
		PIPE=23, ASTERISK=24, QMARK=25, PLUS=26, MIN_QUANTIFIER=27, RANGE_QUANTIFIER=28, 
		BACKSLASH=29, OCTAL_1=30, OCTAL_2=31, OCTAL_3=32, HEXA_2=33, HEXA_4=34, 
		CODE_POINT=35, CARRIAGE_RETURN=36, TAB=37, FORM_FEED=38, ALERT=39, ESC=40, 
		WILDCARD=41, DIGIT=42, NON_DIGIT=43, HORIZONTAL_WS=44, NON_HORIZONTAL_WS=45, 
		WS=46, NON_WS=47, VERTICAL_WS=48, NON_VERTICAL_WS=49, WORD=50, NON_WORD=51, 
		DOLLAR_SIGN=52, WORD_BOUNDARY=53, NON_WORD_BOUNDARY=54, INPUT_START=55, 
		END_OF_MATCH=56, INPUT_END=57, INPUT_END_INC_NEWLINE=58, LINEBREAK_MATCHER=59, 
		LOWERCASE_PO6=60, UPPERCASE_PO6=61, ASCII_PO6=62, ALPHA_PO6=63, NUM_PO6=64, 
		ALNUM_PO6=65, PUNCT_PO6=66, GLYPH_PO6=67, PRINTABLE_PO6=68, BLANK_PO6=69, 
		CTRL_PO6=70, HEXADECIMAL_PO6=71, WS_PO6=72, CHAR_CLASS_LC=73, CHAR_CLASS_UC=74, 
		CHAR_CLASS_WS=75, CHAR_CLASS_MIRRORED=76, UNICODE_CLASS_LATIN=77, UNICODE_CLASS_GREEK=78, 
		UNICODE_CLASS_UC=79, UNICODE_CLASS_ALPHA=80, UNICODE_CLASS_CURR=81, UNICODE_CLASS_NOT_GREEK=82, 
		UNICODE_CLASS_NOT_UC=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CARET", "LETTERS_INSIDE_CHAR_CLASS", "LETTER_RANGE", "NUMBER_RANGE", 
			"DOUBLE_AMPERSAND", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", "LPAREN_ESCAPED", 
			"RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", "DOT_ESCAPED", 
			"CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", 
			"HYPHEN_ESCAPED", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "LETTERS_OUTSIDE_CHAR_CLASS", 
			"PIPE", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", 
			"BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", 
			"CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", "WILDCARD", "DIGIT", 
			"NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "LOWERCASE_PO6", "UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", 
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
			null, "'^'", null, null, null, "'&&'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", 
			"'\\]'", "'\\['", "'\\.'", "'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", 
			"'['", "']'", "'('", "')'", null, "'|'", "'*'", "'?'", "'+'", null, null, 
			"'\\'", null, null, null, null, null, null, "'\\r'", "'\\t'", "'\\f'", 
			"'\\a'", "'\\e'", "'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", 
			"'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", "'$'", "'\\b'", "'\\B'", 
			"'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'R'", "'\\p{Lower}'", "'\\p{Upper}'", 
			"'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", 
			"'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", 
			"'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CARET", "LETTERS_INSIDE_CHAR_CLASS", "LETTER_RANGE", "NUMBER_RANGE", 
			"DOUBLE_AMPERSAND", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", "LPAREN_ESCAPED", 
			"RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", "DOT_ESCAPED", 
			"CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", 
			"HYPHEN_ESCAPED", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "LETTERS_OUTSIDE_CHAR_CLASS", 
			"PIPE", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", 
			"BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", 
			"CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", "WILDCARD", "DIGIT", 
			"NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "LOWERCASE_PO6", "UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", 
			"NUM_PO6", "ALNUM_PO6", "PUNCT_PO6", "GLYPH_PO6", "PRINTABLE_PO6", "BLANK_PO6", 
			"CTRL_PO6", "HEXADECIMAL_PO6", "WS_PO6", "CHAR_CLASS_LC", "CHAR_CLASS_UC", 
			"CHAR_CLASS_WS", "CHAR_CLASS_MIRRORED", "UNICODE_CLASS_LATIN", "UNICODE_CLASS_GREEK", 
			"UNICODE_CLASS_UC", "UNICODE_CLASS_ALPHA", "UNICODE_CLASS_CURR", "UNICODE_CLASS_NOT_GREEK", 
			"UNICODE_CLASS_NOT_UC"
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
		case 34:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u028f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34\u00f1\n\34\3\34\3\34"+
		"\3\35\3\35\5\35\u00f7\n\35\3\35\3\35\5\35\u00fb\n\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0125\n$"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R"+
		"\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\3T\2\2U\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\3\2\n\f\2##%&((,,."+
		";AAC\\^^c|~~\4\2C\\c|\3\2\62;\t\2##%%((..\61;C\\c|\3\2\629\3\2\62\65\5"+
		"\2\62;CHch\3\2\63\63\2\u0292\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2"+
		"\2\t\u00b1\3\2\2\2\13\u00b5\3\2\2\2\r\u00b8\3\2\2\2\17\u00bb\3\2\2\2\21"+
		"\u00be\3\2\2\2\23\u00c1\3\2\2\2\25\u00c4\3\2\2\2\27\u00c7\3\2\2\2\31\u00ca"+
		"\3\2\2\2\33\u00cd\3\2\2\2\35\u00d0\3\2\2\2\37\u00d3\3\2\2\2!\u00d6\3\2"+
		"\2\2#\u00d9\3\2\2\2%\u00dc\3\2\2\2\'\u00de\3\2\2\2)\u00e0\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2"+
		"\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f4\3\2\2\2;\u00fe\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0105\3\2\2\2A\u010b\3\2\2\2C\u0112\3\2\2\2E\u0117\3\2\2\2G"+
		"\u011f\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2\2\2M\u012f\3\2\2\2O\u0132\3\2"+
		"\2\2Q\u0135\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2\2\2W\u013d\3\2\2\2Y\u0140"+
		"\3\2\2\2[\u0143\3\2\2\2]\u0146\3\2\2\2_\u0149\3\2\2\2a\u014c\3\2\2\2c"+
		"\u014f\3\2\2\2e\u0152\3\2\2\2g\u0155\3\2\2\2i\u0158\3\2\2\2k\u015a\3\2"+
		"\2\2m\u015d\3\2\2\2o\u0160\3\2\2\2q\u0163\3\2\2\2s\u0166\3\2\2\2u\u0169"+
		"\3\2\2\2w\u016c\3\2\2\2y\u016e\3\2\2\2{\u0178\3\2\2\2}\u0182\3\2\2\2\177"+
		"\u018c\3\2\2\2\u0081\u0196\3\2\2\2\u0083\u01a0\3\2\2\2\u0085\u01aa\3\2"+
		"\2\2\u0087\u01b4\3\2\2\2\u0089\u01be\3\2\2\2\u008b\u01c8\3\2\2\2\u008d"+
		"\u01d2\3\2\2\2\u008f\u01dc\3\2\2\2\u0091\u01e7\3\2\2\2\u0093\u01f1\3\2"+
		"\2\2\u0095\u0203\3\2\2\2\u0097\u0215\3\2\2\2\u0099\u0228\3\2\2\2\u009b"+
		"\u0239\3\2\2\2\u009d\u0245\3\2\2\2\u009f\u0251\3\2\2\2\u00a1\u0258\3\2"+
		"\2\2\u00a3\u0269\3\2\2\2\u00a5\u0270\3\2\2\2\u00a7\u027c\3\2\2\2\u00a9"+
		"\u00aa\7`\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\6\3\2\2\2\u00ad"+
		"\u00ae\t\3\2\2\u00ae\u00af\7/\2\2\u00af\u00b0\t\3\2\2\u00b0\b\3\2\2\2"+
		"\u00b1\u00b2\t\4\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\t\4\2\2\u00b4\n\3"+
		"\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7(\2\2\u00b7\f\3\2\2\2\u00b8\u00b9"+
		"\7^\2\2\u00b9\u00ba\7~\2\2\u00ba\16\3\2\2\2\u00bb\u00bc\7^\2\2\u00bc\u00bd"+
		"\7^\2\2\u00bd\20\3\2\2\2\u00be\u00bf\7^\2\2\u00bf\u00c0\7*\2\2\u00c0\22"+
		"\3\2\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c3\7+\2\2\u00c3\24\3\2\2\2\u00c4"+
		"\u00c5\7^\2\2\u00c5\u00c6\7_\2\2\u00c6\26\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8"+
		"\u00c9\7]\2\2\u00c9\30\3\2\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cc\7\60\2\2"+
		"\u00cc\32\3\2\2\2\u00cd\u00ce\7^\2\2\u00ce\u00cf\7`\2\2\u00cf\34\3\2\2"+
		"\2\u00d0\u00d1\7^\2\2\u00d1\u00d2\7A\2\2\u00d2\36\3\2\2\2\u00d3\u00d4"+
		"\7^\2\2\u00d4\u00d5\7,\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7^\2\2\u00d7\u00d8"+
		"\7&\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00db\7/\2\2\u00db$\3"+
		"\2\2\2\u00dc\u00dd\7]\2\2\u00dd&\3\2\2\2\u00de\u00df\7_\2\2\u00df(\3\2"+
		"\2\2\u00e0\u00e1\7*\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7+\2\2\u00e3,\3\2\2"+
		"\2\u00e4\u00e5\t\5\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7\60\3\2"+
		"\2\2\u00e8\u00e9\7,\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7A\2\2\u00eb\64\3"+
		"\2\2\2\u00ec\u00ed\7-\2\2\u00ed\66\3\2\2\2\u00ee\u00f0\7}\2\2\u00ef\u00f1"+
		"\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7\177\2\2\u00f38\3\2\2\2\u00f4\u00f6\7}\2\2\u00f5\u00f7\t\4\2\2"+
		"\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\7.\2\2\u00f9\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7^\2\2"+
		"\u00ff<\3\2\2\2\u0100\u0101\7^\2\2\u0101\u0102\7\62\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\t\6\2\2\u0104>\3\2\2\2\u0105\u0106\7^\2\2\u0106\u0107"+
		"\7\62\2\2\u0107\u0108\3\2\2\2\u0108\u0109\t\6\2\2\u0109\u010a\t\6\2\2"+
		"\u010a@\3\2\2\2\u010b\u010c\7^\2\2\u010c\u010d\7\62\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010f\t\7\2\2\u010f\u0110\t\6\2\2\u0110\u0111\t\6\2\2\u0111"+
		"B\3\2\2\2\u0112\u0113\7^\2\2\u0113\u0114\7z\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\t\b\2\2\u0116D\3\2\2\2\u0117\u0118\7^\2\2\u0118\u0119\7z\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\t\b\2\2\u011b\u011c\t\b\2\2\u011c\u011d\t\b"+
		"\2\2\u011d\u011e\t\b\2\2\u011eF\3\2\2\2\u011f\u0120\7W\2\2\u0120\u0121"+
		"\7^\2\2\u0121\u0122\7-\2\2\u0122\u0124\3\2\2\2\u0123\u0125\t\t\2\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\t\b"+
		"\2\2\u0127\u0128\b$\2\2\u0128H\3\2\2\2\u0129\u012a\7^\2\2\u012a\u012b"+
		"\7t\2\2\u012bJ\3\2\2\2\u012c\u012d\7^\2\2\u012d\u012e\7v\2\2\u012eL\3"+
		"\2\2\2\u012f\u0130\7^\2\2\u0130\u0131\7h\2\2\u0131N\3\2\2\2\u0132\u0133"+
		"\7^\2\2\u0133\u0134\7c\2\2\u0134P\3\2\2\2\u0135\u0136\7^\2\2\u0136\u0137"+
		"\7g\2\2\u0137R\3\2\2\2\u0138\u0139\7\60\2\2\u0139T\3\2\2\2\u013a\u013b"+
		"\7^\2\2\u013b\u013c\7f\2\2\u013cV\3\2\2\2\u013d\u013e\7^\2\2\u013e\u013f"+
		"\7F\2\2\u013fX\3\2\2\2\u0140\u0141\7^\2\2\u0141\u0142\7j\2\2\u0142Z\3"+
		"\2\2\2\u0143\u0144\7^\2\2\u0144\u0145\7J\2\2\u0145\\\3\2\2\2\u0146\u0147"+
		"\7^\2\2\u0147\u0148\7u\2\2\u0148^\3\2\2\2\u0149\u014a\7^\2\2\u014a\u014b"+
		"\7U\2\2\u014b`\3\2\2\2\u014c\u014d\7^\2\2\u014d\u014e\7x\2\2\u014eb\3"+
		"\2\2\2\u014f\u0150\7^\2\2\u0150\u0151\7X\2\2\u0151d\3\2\2\2\u0152\u0153"+
		"\7^\2\2\u0153\u0154\7y\2\2\u0154f\3\2\2\2\u0155\u0156\7^\2\2\u0156\u0157"+
		"\7Y\2\2\u0157h\3\2\2\2\u0158\u0159\7&\2\2\u0159j\3\2\2\2\u015a\u015b\7"+
		"^\2\2\u015b\u015c\7d\2\2\u015cl\3\2\2\2\u015d\u015e\7^\2\2\u015e\u015f"+
		"\7D\2\2\u015fn\3\2\2\2\u0160\u0161\7^\2\2\u0161\u0162\7C\2\2\u0162p\3"+
		"\2\2\2\u0163\u0164\7^\2\2\u0164\u0165\7I\2\2\u0165r\3\2\2\2\u0166\u0167"+
		"\7^\2\2\u0167\u0168\7|\2\2\u0168t\3\2\2\2\u0169\u016a\7^\2\2\u016a\u016b"+
		"\7\\\2\2\u016bv\3\2\2\2\u016c\u016d\7T\2\2\u016dx\3\2\2\2\u016e\u016f"+
		"\7^\2\2\u016f\u0170\7r\2\2\u0170\u0171\7}\2\2\u0171\u0172\7N\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7y\2\2\u0174\u0175\7g\2\2\u0175\u0176\7t\2\2"+
		"\u0176\u0177\7\177\2\2\u0177z\3\2\2\2\u0178\u0179\7^\2\2\u0179\u017a\7"+
		"r\2\2\u017a\u017b\7}\2\2\u017b\u017c\7W\2\2\u017c\u017d\7r\2\2\u017d\u017e"+
		"\7r\2\2\u017e\u017f\7g\2\2\u017f\u0180\7t\2\2\u0180\u0181\7\177\2\2\u0181"+
		"|\3\2\2\2\u0182\u0183\7^\2\2\u0183\u0184\7r\2\2\u0184\u0185\7}\2\2\u0185"+
		"\u0186\7C\2\2\u0186\u0187\7U\2\2\u0187\u0188\7E\2\2\u0188\u0189\7K\2\2"+
		"\u0189\u018a\7K\2\2\u018a\u018b\7\177\2\2\u018b~\3\2\2\2\u018c\u018d\7"+
		"^\2\2\u018d\u018e\7r\2\2\u018e\u018f\7}\2\2\u018f\u0190\7C\2\2\u0190\u0191"+
		"\7n\2\2\u0191\u0192\7r\2\2\u0192\u0193\7j\2\2\u0193\u0194\7c\2\2\u0194"+
		"\u0195\7\177\2\2\u0195\u0080\3\2\2\2\u0196\u0197\7^\2\2\u0197\u0198\7"+
		"r\2\2\u0198\u0199\7}\2\2\u0199\u019a\7F\2\2\u019a\u019b\7k\2\2\u019b\u019c"+
		"\7i\2\2\u019c\u019d\7k\2\2\u019d\u019e\7v\2\2\u019e\u019f\7\177\2\2\u019f"+
		"\u0082\3\2\2\2\u01a0\u01a1\7^\2\2\u01a1\u01a2\7r\2\2\u01a2\u01a3\7}\2"+
		"\2\u01a3\u01a4\7C\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7"+
		"\7w\2\2\u01a7\u01a8\7o\2\2\u01a8\u01a9\7\177\2\2\u01a9\u0084\3\2\2\2\u01aa"+
		"\u01ab\7^\2\2\u01ab\u01ac\7r\2\2\u01ac\u01ad\7}\2\2\u01ad\u01ae\7R\2\2"+
		"\u01ae\u01af\7w\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2"+
		"\7v\2\2\u01b2\u01b3\7\177\2\2\u01b3\u0086\3\2\2\2\u01b4\u01b5\7^\2\2\u01b5"+
		"\u01b6\7r\2\2\u01b6\u01b7\7}\2\2\u01b7\u01b8\7I\2\2\u01b8\u01b9\7t\2\2"+
		"\u01b9\u01ba\7c\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7j\2\2\u01bc\u01bd"+
		"\7\177\2\2\u01bd\u0088\3\2\2\2\u01be\u01bf\7^\2\2\u01bf\u01c0\7r\2\2\u01c0"+
		"\u01c1\7}\2\2\u01c1\u01c2\7R\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7k\2\2"+
		"\u01c4\u01c5\7p\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7\177\2\2\u01c7\u008a"+
		"\3\2\2\2\u01c8\u01c9\7^\2\2\u01c9\u01ca\7r\2\2\u01ca\u01cb\7}\2\2\u01cb"+
		"\u01cc\7D\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7p\2\2"+
		"\u01cf\u01d0\7m\2\2\u01d0\u01d1\7\177\2\2\u01d1\u008c\3\2\2\2\u01d2\u01d3"+
		"\7^\2\2\u01d3\u01d4\7r\2\2\u01d4\u01d5\7}\2\2\u01d5\u01d6\7E\2\2\u01d6"+
		"\u01d7\7p\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7n\2\2"+
		"\u01da\u01db\7\177\2\2\u01db\u008e\3\2\2\2\u01dc\u01dd\7^\2\2\u01dd\u01de"+
		"\7r\2\2\u01de\u01df\7}\2\2\u01df\u01e0\7Z\2\2\u01e0\u01e1\7F\2\2\u01e1"+
		"\u01e2\7k\2\2\u01e2\u01e3\7i\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7v\2\2"+
		"\u01e5\u01e6\7\177\2\2\u01e6\u0090\3\2\2\2\u01e7\u01e8\7^\2\2\u01e8\u01e9"+
		"\7r\2\2\u01e9\u01ea\7}\2\2\u01ea\u01eb\7U\2\2\u01eb\u01ec\7r\2\2\u01ec"+
		"\u01ed\7c\2\2\u01ed\u01ee\7e\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7\177"+
		"\2\2\u01f0\u0092\3\2\2\2\u01f1\u01f2\7^\2\2\u01f2\u01f3\7r\2\2\u01f3\u01f4"+
		"\7}\2\2\u01f4\u01f5\7l\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7x\2\2\u01f7"+
		"\u01f8\7c\2\2\u01f8\u01f9\7N\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7y\2\2"+
		"\u01fb\u01fc\7g\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7E\2\2\u01fe\u01ff"+
		"\7c\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7g\2\2\u0201\u0202\7\177\2\2\u0202"+
		"\u0094\3\2\2\2\u0203\u0204\7^\2\2\u0204\u0205\7r\2\2\u0205\u0206\7}\2"+
		"\2\u0206\u0207\7l\2\2\u0207\u0208\7c\2\2\u0208\u0209\7x\2\2\u0209\u020a"+
		"\7c\2\2\u020a\u020b\7W\2\2\u020b\u020c\7r\2\2\u020c\u020d\7r\2\2\u020d"+
		"\u020e\7g\2\2\u020e\u020f\7t\2\2\u020f\u0210\7E\2\2\u0210\u0211\7c\2\2"+
		"\u0211\u0212\7u\2\2\u0212\u0213\7g\2\2\u0213\u0214\7\177\2\2\u0214\u0096"+
		"\3\2\2\2\u0215\u0216\7^\2\2\u0216\u0217\7r\2\2\u0217\u0218\7}\2\2\u0218"+
		"\u0219\7l\2\2\u0219\u021a\7c\2\2\u021a\u021b\7x\2\2\u021b\u021c\7c\2\2"+
		"\u021c\u021d\7Y\2\2\u021d\u021e\7j\2\2\u021e\u021f\7k\2\2\u021f\u0220"+
		"\7v\2\2\u0220\u0221\7g\2\2\u0221\u0222\7u\2\2\u0222\u0223\7r\2\2\u0223"+
		"\u0224\7c\2\2\u0224\u0225\7e\2\2\u0225\u0226\7g\2\2\u0226\u0227\7\177"+
		"\2\2\u0227\u0098\3\2\2\2\u0228\u0229\7^\2\2\u0229\u022a\7r\2\2\u022a\u022b"+
		"\7}\2\2\u022b\u022c\7l\2\2\u022c\u022d\7c\2\2\u022d\u022e\7x\2\2\u022e"+
		"\u022f\7c\2\2\u022f\u0230\7O\2\2\u0230\u0231\7k\2\2\u0231\u0232\7t\2\2"+
		"\u0232\u0233\7t\2\2\u0233\u0234\7q\2\2\u0234\u0235\7t\2\2\u0235\u0236"+
		"\7g\2\2\u0236\u0237\7f\2\2\u0237\u0238\7\177\2\2\u0238\u009a\3\2\2\2\u0239"+
		"\u023a\7^\2\2\u023a\u023b\7r\2\2\u023b\u023c\7}\2\2\u023c\u023d\7K\2\2"+
		"\u023d\u023e\7u\2\2\u023e\u023f\7N\2\2\u023f\u0240\7c\2\2\u0240\u0241"+
		"\7v\2\2\u0241\u0242\7k\2\2\u0242\u0243\7p\2\2\u0243\u0244\7\177\2\2\u0244"+
		"\u009c\3\2\2\2\u0245\u0246\7^\2\2\u0246\u0247\7r\2\2\u0247\u0248\7}\2"+
		"\2\u0248\u0249\7K\2\2\u0249\u024a\7p\2\2\u024a\u024b\7I\2\2\u024b\u024c"+
		"\7t\2\2\u024c\u024d\7g\2\2\u024d\u024e\7g\2\2\u024e\u024f\7m\2\2\u024f"+
		"\u0250\7\177\2\2\u0250\u009e\3\2\2\2\u0251\u0252\7^\2\2\u0252\u0253\7"+
		"r\2\2\u0253\u0254\7}\2\2\u0254\u0255\7N\2\2\u0255\u0256\7w\2\2\u0256\u0257"+
		"\7\177\2\2\u0257\u00a0\3\2\2\2\u0258\u0259\7^\2\2\u0259\u025a\7r\2\2\u025a"+
		"\u025b\7}\2\2\u025b\u025c\7K\2\2\u025c\u025d\7u\2\2\u025d\u025e\7C\2\2"+
		"\u025e\u025f\7n\2\2\u025f\u0260\7r\2\2\u0260\u0261\7j\2\2\u0261\u0262"+
		"\7c\2\2\u0262\u0263\7d\2\2\u0263\u0264\7g\2\2\u0264\u0265\7v\2\2\u0265"+
		"\u0266\7k\2\2\u0266\u0267\7e\2\2\u0267\u0268\7\177\2\2\u0268\u00a2\3\2"+
		"\2\2\u0269\u026a\7^\2\2\u026a\u026b\7r\2\2\u026b\u026c\7}\2\2\u026c\u026d"+
		"\7U\2\2\u026d\u026e\7e\2\2\u026e\u026f\7\177\2\2\u026f\u00a4\3\2\2\2\u0270"+
		"\u0271\7^\2\2\u0271\u0272\7R\2\2\u0272\u0273\7}\2\2\u0273\u0274\7K\2\2"+
		"\u0274\u0275\7p\2\2\u0275\u0276\7I\2\2\u0276\u0277\7t\2\2\u0277\u0278"+
		"\7g\2\2\u0278\u0279\7g\2\2\u0279\u027a\7m\2\2\u027a\u027b\7\177\2\2\u027b"+
		"\u00a6\3\2\2\2\u027c\u027d\7]\2\2\u027d\u027e\7^\2\2\u027e\u027f\7r\2"+
		"\2\u027f\u0280\7}\2\2\u0280\u0281\7N\2\2\u0281\u0282\7\177\2\2\u0282\u0283"+
		"\7(\2\2\u0283\u0284\7(\2\2\u0284\u0285\7]\2\2\u0285\u0286\7`\2\2\u0286"+
		"\u0287\7^\2\2\u0287\u0288\7r\2\2\u0288\u0289\7}\2\2\u0289\u028a\7N\2\2"+
		"\u028a\u028b\7w\2\2\u028b\u028c\7\177\2\2\u028c\u028d\7_\2\2\u028d\u028e"+
		"\7_\2\2\u028e\u00a8\3\2\2\2\7\2\u00f0\u00f6\u00fa\u0124\3\3$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}