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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CARET=38, 
		LETTER=39, EXTRA_LETTER_ALLOWED_INSIDE=40, LEFT_QUOTE=41, RIGHT_QUOTE=42, 
		LETTER_RANGE=43, NUMBER_RANGE=44, DOUBLE_AMPERSAND=45, PIPE=46, PLUS_ESCAPED=47, 
		LBRACE_ESCAPED=48, PIPE_ESCAPED=49, BACKSLASH_ESCAPED=50, LPAREN_ESCAPED=51, 
		RPAREN_ESCAPED=52, LBRACKET_ESCAPED=53, RBRACKET_ESCAPED=54, DOT_ESCAPED=55, 
		CARET_ESCAPED=56, QMARK_ESCAPED=57, ASTERISK_ESCAPED=58, DOLLAR_SIGN_ESCAPED=59, 
		HYPHEN_ESCAPED=60, DIGIT=61, N_OCCURRANCES=62, MAX_QUANTIFIER=63, MIN_QUANTIFIER=64, 
		RANGE_QUANTIFIER=65, LBRACKET=66, RBRACKET=67, LPAREN=68, RPAREN=69, BACKSLASH=70, 
		OCTAL_1=71, OCTAL_2=72, OCTAL_3=73, HEXA_2=74, HEXA_4=75, CODE_POINT=76, 
		CARRIAGE_RETURN=77, TAB=78, FORM_FEED=79, ALERT=80, ESC=81, DOLLAR_SIGN=82, 
		WORD_BOUNDARY=83, NON_WORD_BOUNDARY=84, INPUT_START=85, END_OF_MATCH=86, 
		INPUT_END=87, INPUT_END_INC_NEWLINE=88, LINEBREAK_MATCHER=89, N_TH_CAPTURE_GROUP=90, 
		NAMED_CAPTURE_GROUP_MATCH=91;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", 
			"LEFT_QUOTE", "RIGHT_QUOTE", "LETTER_RANGE", "NUMBER_RANGE", "DOUBLE_AMPERSAND", 
			"PIPE", "PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "DIGIT", "N_OCCURRANCES", "MAX_QUANTIFIER", 
			"MIN_QUANTIFIER", "RANGE_QUANTIFIER", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", 
			"CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "N_TH_CAPTURE_GROUP", 
			"NAMED_CAPTURE_GROUP_MATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'+'", "'*'", "'?'", "'\\p{Lower}'", "'\\p{Upper}'", 
			"'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", 
			"'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", 
			"'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'^'", null, null, "'\\Q'", "'\\E'", null, null, "'&&'", "'|'", "'\\+'", 
			"'\\{'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", "'\\['", "'\\.'", 
			"'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", "'\\d'", null, null, null, 
			null, "'['", "']'", "'('", "')'", "'\\'", null, null, null, null, null, 
			null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", "'$'", "'\\b'", "'\\B'", 
			"'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'", "'\\[0-9]+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LEFT_QUOTE", 
			"RIGHT_QUOTE", "LETTER_RANGE", "NUMBER_RANGE", "DOUBLE_AMPERSAND", "PIPE", 
			"PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "DIGIT", "N_OCCURRANCES", "MAX_QUANTIFIER", 
			"MIN_QUANTIFIER", "RANGE_QUANTIFIER", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", 
			"CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "N_TH_CAPTURE_GROUP", 
			"NAMED_CAPTURE_GROUP_MATCH"
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
		case 75:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u02cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\5@\u024c\n@\3@\3@\3A\3A\5A\u0252\nA\3A\3A\3A\3B\3B\5B\u0259"+
		"\nB\3B\3B\5B\u025d\nB\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3M\3M\3M\3M\3M\5M\u028f\nM\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P"+
		"\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X"+
		"\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\6"+
		"\\\u02c7\n\\\r\\\16\\\u02c8\3\\\3\\\2\2]\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\3\2\n\t\2##%%((..\61;C\\"+
		"c|\b\2&&,,/\60AA^^~~\4\2C\\c|\3\2\62;\3\2\629\3\2\62\65\5\2\62;CHch\3"+
		"\2\63\63\2\u02d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\3\u00b9\3\2\2\2\5\u00bb\3\2\2\2\7\u00be\3\2\2\2\t\u00c1\3\2\2\2\13"+
		"\u00c4\3\2\2\2\r\u00c7\3\2\2\2\17\u00ca\3\2\2\2\21\u00cd\3\2\2\2\23\u00d0"+
		"\3\2\2\2\25\u00d3\3\2\2\2\27\u00d6\3\2\2\2\31\u00d8\3\2\2\2\33\u00da\3"+
		"\2\2\2\35\u00dc\3\2\2\2\37\u00e6\3\2\2\2!\u00f0\3\2\2\2#\u00fa\3\2\2\2"+
		"%\u0104\3\2\2\2\'\u010e\3\2\2\2)\u0118\3\2\2\2+\u0122\3\2\2\2-\u012c\3"+
		"\2\2\2/\u0136\3\2\2\2\61\u0140\3\2\2\2\63\u014a\3\2\2\2\65\u0155\3\2\2"+
		"\2\67\u015f\3\2\2\29\u0171\3\2\2\2;\u0183\3\2\2\2=\u0196\3\2\2\2?\u01a7"+
		"\3\2\2\2A\u01b3\3\2\2\2C\u01bf\3\2\2\2E\u01c6\3\2\2\2G\u01d7\3\2\2\2I"+
		"\u01de\3\2\2\2K\u01ea\3\2\2\2M\u01fd\3\2\2\2O\u01ff\3\2\2\2Q\u0201\3\2"+
		"\2\2S\u0203\3\2\2\2U\u0206\3\2\2\2W\u0209\3\2\2\2Y\u020d\3\2\2\2[\u0211"+
		"\3\2\2\2]\u0214\3\2\2\2_\u0216\3\2\2\2a\u0219\3\2\2\2c\u021c\3\2\2\2e"+
		"\u021f\3\2\2\2g\u0222\3\2\2\2i\u0225\3\2\2\2k\u0228\3\2\2\2m\u022b\3\2"+
		"\2\2o\u022e\3\2\2\2q\u0231\3\2\2\2s\u0234\3\2\2\2u\u0237\3\2\2\2w\u023a"+
		"\3\2\2\2y\u023d\3\2\2\2{\u0240\3\2\2\2}\u0243\3\2\2\2\177\u0247\3\2\2"+
		"\2\u0081\u024f\3\2\2\2\u0083\u0256\3\2\2\2\u0085\u0260\3\2\2\2\u0087\u0262"+
		"\3\2\2\2\u0089\u0264\3\2\2\2\u008b\u0266\3\2\2\2\u008d\u0268\3\2\2\2\u008f"+
		"\u026a\3\2\2\2\u0091\u026f\3\2\2\2\u0093\u0275\3\2\2\2\u0095\u027c\3\2"+
		"\2\2\u0097\u0281\3\2\2\2\u0099\u0289\3\2\2\2\u009b\u0293\3\2\2\2\u009d"+
		"\u0296\3\2\2\2\u009f\u0299\3\2\2\2\u00a1\u029c\3\2\2\2\u00a3\u029f\3\2"+
		"\2\2\u00a5\u02a2\3\2\2\2\u00a7\u02a4\3\2\2\2\u00a9\u02a7\3\2\2\2\u00ab"+
		"\u02aa\3\2\2\2\u00ad\u02ad\3\2\2\2\u00af\u02b0\3\2\2\2\u00b1\u02b3\3\2"+
		"\2\2\u00b3\u02b6\3\2\2\2\u00b5\u02b9\3\2\2\2\u00b7\u02c1\3\2\2\2\u00b9"+
		"\u00ba\7\60\2\2\u00ba\4\3\2\2\2\u00bb\u00bc\7^\2\2\u00bc\u00bd\7F\2\2"+
		"\u00bd\6\3\2\2\2\u00be\u00bf\7^\2\2\u00bf\u00c0\7j\2\2\u00c0\b\3\2\2\2"+
		"\u00c1\u00c2\7^\2\2\u00c2\u00c3\7J\2\2\u00c3\n\3\2\2\2\u00c4\u00c5\7^"+
		"\2\2\u00c5\u00c6\7u\2\2\u00c6\f\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\u00c9"+
		"\7U\2\2\u00c9\16\3\2\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cc\7x\2\2\u00cc\20"+
		"\3\2\2\2\u00cd\u00ce\7^\2\2\u00ce\u00cf\7X\2\2\u00cf\22\3\2\2\2\u00d0"+
		"\u00d1\7^\2\2\u00d1\u00d2\7y\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7^\2\2\u00d4"+
		"\u00d5\7Y\2\2\u00d5\26\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7\30\3\2\2\2\u00d8"+
		"\u00d9\7,\2\2\u00d9\32\3\2\2\2\u00da\u00db\7A\2\2\u00db\34\3\2\2\2\u00dc"+
		"\u00dd\7^\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7}\2\2\u00df\u00e0\7N\2\2"+
		"\u00e0\u00e1\7q\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7\177\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7^\2\2\u00e7"+
		"\u00e8\7r\2\2\u00e8\u00e9\7}\2\2\u00e9\u00ea\7W\2\2\u00ea\u00eb\7r\2\2"+
		"\u00eb\u00ec\7r\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7\177\2\2\u00ef \3\2\2\2\u00f0\u00f1\7^\2\2\u00f1\u00f2\7r\2\2\u00f2"+
		"\u00f3\7}\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\7U\2\2\u00f5\u00f6\7E\2\2"+
		"\u00f6\u00f7\7K\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9\7\177\2\2\u00f9\"\3"+
		"\2\2\2\u00fa\u00fb\7^\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7}\2\2\u00fd"+
		"\u00fe\7C\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7j\2\2"+
		"\u0101\u0102\7c\2\2\u0102\u0103\7\177\2\2\u0103$\3\2\2\2\u0104\u0105\7"+
		"^\2\2\u0105\u0106\7r\2\2\u0106\u0107\7}\2\2\u0107\u0108\7F\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b\7k\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7\177\2\2\u010d&\3\2\2\2\u010e\u010f\7^\2\2\u010f\u0110\7r\2\2"+
		"\u0110\u0111\7}\2\2\u0111\u0112\7C\2\2\u0112\u0113\7n\2\2\u0113\u0114"+
		"\7p\2\2\u0114\u0115\7w\2\2\u0115\u0116\7o\2\2\u0116\u0117\7\177\2\2\u0117"+
		"(\3\2\2\2\u0118\u0119\7^\2\2\u0119\u011a\7r\2\2\u011a\u011b\7}\2\2\u011b"+
		"\u011c\7R\2\2\u011c\u011d\7w\2\2\u011d\u011e\7p\2\2\u011e\u011f\7e\2\2"+
		"\u011f\u0120\7v\2\2\u0120\u0121\7\177\2\2\u0121*\3\2\2\2\u0122\u0123\7"+
		"^\2\2\u0123\u0124\7r\2\2\u0124\u0125\7}\2\2\u0125\u0126\7I\2\2\u0126\u0127"+
		"\7t\2\2\u0127\u0128\7c\2\2\u0128\u0129\7r\2\2\u0129\u012a\7j\2\2\u012a"+
		"\u012b\7\177\2\2\u012b,\3\2\2\2\u012c\u012d\7^\2\2\u012d\u012e\7r\2\2"+
		"\u012e\u012f\7}\2\2\u012f\u0130\7R\2\2\u0130\u0131\7t\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134\u0135\7\177\2\2\u0135"+
		".\3\2\2\2\u0136\u0137\7^\2\2\u0137\u0138\7r\2\2\u0138\u0139\7}\2\2\u0139"+
		"\u013a\7D\2\2\u013a\u013b\7n\2\2\u013b\u013c\7c\2\2\u013c\u013d\7p\2\2"+
		"\u013d\u013e\7m\2\2\u013e\u013f\7\177\2\2\u013f\60\3\2\2\2\u0140\u0141"+
		"\7^\2\2\u0141\u0142\7r\2\2\u0142\u0143\7}\2\2\u0143\u0144\7E\2\2\u0144"+
		"\u0145\7p\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148\7n\2\2"+
		"\u0148\u0149\7\177\2\2\u0149\62\3\2\2\2\u014a\u014b\7^\2\2\u014b\u014c"+
		"\7r\2\2\u014c\u014d\7}\2\2\u014d\u014e\7Z\2\2\u014e\u014f\7F\2\2\u014f"+
		"\u0150\7k\2\2\u0150\u0151\7i\2\2\u0151\u0152\7k\2\2\u0152\u0153\7v\2\2"+
		"\u0153\u0154\7\177\2\2\u0154\64\3\2\2\2\u0155\u0156\7^\2\2\u0156\u0157"+
		"\7r\2\2\u0157\u0158\7}\2\2\u0158\u0159\7U\2\2\u0159\u015a\7r\2\2\u015a"+
		"\u015b\7c\2\2\u015b\u015c\7e\2\2\u015c\u015d\7g\2\2\u015d\u015e\7\177"+
		"\2\2\u015e\66\3\2\2\2\u015f\u0160\7^\2\2\u0160\u0161\7r\2\2\u0161\u0162"+
		"\7}\2\2\u0162\u0163\7l\2\2\u0163\u0164\7c\2\2\u0164\u0165\7x\2\2\u0165"+
		"\u0166\7c\2\2\u0166\u0167\7N\2\2\u0167\u0168\7q\2\2\u0168\u0169\7y\2\2"+
		"\u0169\u016a\7g\2\2\u016a\u016b\7t\2\2\u016b\u016c\7E\2\2\u016c\u016d"+
		"\7c\2\2\u016d\u016e\7u\2\2\u016e\u016f\7g\2\2\u016f\u0170\7\177\2\2\u0170"+
		"8\3\2\2\2\u0171\u0172\7^\2\2\u0172\u0173\7r\2\2\u0173\u0174\7}\2\2\u0174"+
		"\u0175\7l\2\2\u0175\u0176\7c\2\2\u0176\u0177\7x\2\2\u0177\u0178\7c\2\2"+
		"\u0178\u0179\7W\2\2\u0179\u017a\7r\2\2\u017a\u017b\7r\2\2\u017b\u017c"+
		"\7g\2\2\u017c\u017d\7t\2\2\u017d\u017e\7E\2\2\u017e\u017f\7c\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7g\2\2\u0181\u0182\7\177\2\2\u0182:\3\2\2\2"+
		"\u0183\u0184\7^\2\2\u0184\u0185\7r\2\2\u0185\u0186\7}\2\2\u0186\u0187"+
		"\7l\2\2\u0187\u0188\7c\2\2\u0188\u0189\7x\2\2\u0189\u018a\7c\2\2\u018a"+
		"\u018b\7Y\2\2\u018b\u018c\7j\2\2\u018c\u018d\7k\2\2\u018d\u018e\7v\2\2"+
		"\u018e\u018f\7g\2\2\u018f\u0190\7u\2\2\u0190\u0191\7r\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\7e\2\2\u0193\u0194\7g\2\2\u0194\u0195\7\177\2\2\u0195"+
		"<\3\2\2\2\u0196\u0197\7^\2\2\u0197\u0198\7r\2\2\u0198\u0199\7}\2\2\u0199"+
		"\u019a\7l\2\2\u019a\u019b\7c\2\2\u019b\u019c\7x\2\2\u019c\u019d\7c\2\2"+
		"\u019d\u019e\7O\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1"+
		"\7t\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7t\2\2\u01a3\u01a4\7g\2\2\u01a4"+
		"\u01a5\7f\2\2\u01a5\u01a6\7\177\2\2\u01a6>\3\2\2\2\u01a7\u01a8\7^\2\2"+
		"\u01a8\u01a9\7r\2\2\u01a9\u01aa\7}\2\2\u01aa\u01ab\7K\2\2\u01ab\u01ac"+
		"\7u\2\2\u01ac\u01ad\7N\2\2\u01ad\u01ae\7c\2\2\u01ae\u01af\7v\2\2\u01af"+
		"\u01b0\7k\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7\177\2\2\u01b2@\3\2\2\2"+
		"\u01b3\u01b4\7^\2\2\u01b4\u01b5\7r\2\2\u01b5\u01b6\7}\2\2\u01b6\u01b7"+
		"\7K\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7I\2\2\u01b9\u01ba\7t\2\2\u01ba"+
		"\u01bb\7g\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7m\2\2\u01bd\u01be\7\177"+
		"\2\2\u01beB\3\2\2\2\u01bf\u01c0\7^\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2"+
		"\7}\2\2\u01c2\u01c3\7N\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5\7\177\2\2\u01c5"+
		"D\3\2\2\2\u01c6\u01c7\7^\2\2\u01c7\u01c8\7r\2\2\u01c8\u01c9\7}\2\2\u01c9"+
		"\u01ca\7K\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7C\2\2\u01cc\u01cd\7n\2\2"+
		"\u01cd\u01ce\7r\2\2\u01ce\u01cf\7j\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1"+
		"\7d\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7k\2\2\u01d4"+
		"\u01d5\7e\2\2\u01d5\u01d6\7\177\2\2\u01d6F\3\2\2\2\u01d7\u01d8\7^\2\2"+
		"\u01d8\u01d9\7r\2\2\u01d9\u01da\7}\2\2\u01da\u01db\7U\2\2\u01db\u01dc"+
		"\7e\2\2\u01dc\u01dd\7\177\2\2\u01ddH\3\2\2\2\u01de\u01df\7^\2\2\u01df"+
		"\u01e0\7R\2\2\u01e0\u01e1\7}\2\2\u01e1\u01e2\7K\2\2\u01e2\u01e3\7p\2\2"+
		"\u01e3\u01e4\7I\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7g\2\2\u01e6\u01e7"+
		"\7g\2\2\u01e7\u01e8\7m\2\2\u01e8\u01e9\7\177\2\2\u01e9J\3\2\2\2\u01ea"+
		"\u01eb\7]\2\2\u01eb\u01ec\7^\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7}\2\2"+
		"\u01ee\u01ef\7N\2\2\u01ef\u01f0\7\177\2\2\u01f0\u01f1\7(\2\2\u01f1\u01f2"+
		"\7(\2\2\u01f2\u01f3\7]\2\2\u01f3\u01f4\7`\2\2\u01f4\u01f5\7^\2\2\u01f5"+
		"\u01f6\7r\2\2\u01f6\u01f7\7}\2\2\u01f7\u01f8\7N\2\2\u01f8\u01f9\7w\2\2"+
		"\u01f9\u01fa\7\177\2\2\u01fa\u01fb\7_\2\2\u01fb\u01fc\7_\2\2\u01fcL\3"+
		"\2\2\2\u01fd\u01fe\7`\2\2\u01feN\3\2\2\2\u01ff\u0200\t\2\2\2\u0200P\3"+
		"\2\2\2\u0201\u0202\t\3\2\2\u0202R\3\2\2\2\u0203\u0204\7^\2\2\u0204\u0205"+
		"\7S\2\2\u0205T\3\2\2\2\u0206\u0207\7^\2\2\u0207\u0208\7G\2\2\u0208V\3"+
		"\2\2\2\u0209\u020a\t\4\2\2\u020a\u020b\7/\2\2\u020b\u020c\t\4\2\2\u020c"+
		"X\3\2\2\2\u020d\u020e\t\5\2\2\u020e\u020f\7/\2\2\u020f\u0210\t\5\2\2\u0210"+
		"Z\3\2\2\2\u0211\u0212\7(\2\2\u0212\u0213\7(\2\2\u0213\\\3\2\2\2\u0214"+
		"\u0215\7~\2\2\u0215^\3\2\2\2\u0216\u0217\7^\2\2\u0217\u0218\7-\2\2\u0218"+
		"`\3\2\2\2\u0219\u021a\7^\2\2\u021a\u021b\7}\2\2\u021bb\3\2\2\2\u021c\u021d"+
		"\7^\2\2\u021d\u021e\7~\2\2\u021ed\3\2\2\2\u021f\u0220\7^\2\2\u0220\u0221"+
		"\7^\2\2\u0221f\3\2\2\2\u0222\u0223\7^\2\2\u0223\u0224\7*\2\2\u0224h\3"+
		"\2\2\2\u0225\u0226\7^\2\2\u0226\u0227\7+\2\2\u0227j\3\2\2\2\u0228\u0229"+
		"\7^\2\2\u0229\u022a\7_\2\2\u022al\3\2\2\2\u022b\u022c\7^\2\2\u022c\u022d"+
		"\7]\2\2\u022dn\3\2\2\2\u022e\u022f\7^\2\2\u022f\u0230\7\60\2\2\u0230p"+
		"\3\2\2\2\u0231\u0232\7^\2\2\u0232\u0233\7`\2\2\u0233r\3\2\2\2\u0234\u0235"+
		"\7^\2\2\u0235\u0236\7A\2\2\u0236t\3\2\2\2\u0237\u0238\7^\2\2\u0238\u0239"+
		"\7,\2\2\u0239v\3\2\2\2\u023a\u023b\7^\2\2\u023b\u023c\7&\2\2\u023cx\3"+
		"\2\2\2\u023d\u023e\7^\2\2\u023e\u023f\7/\2\2\u023fz\3\2\2\2\u0240\u0241"+
		"\7^\2\2\u0241\u0242\7f\2\2\u0242|\3\2\2\2\u0243\u0244\7}\2\2\u0244\u0245"+
		"\t\5\2\2\u0245\u0246\7\177\2\2\u0246~\3\2\2\2\u0247\u0248\7}\2\2\u0248"+
		"\u0249\7.\2\2\u0249\u024b\3\2\2\2\u024a\u024c\t\5\2\2\u024b\u024a\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\177\2\2\u024e"+
		"\u0080\3\2\2\2\u024f\u0251\7}\2\2\u0250\u0252\t\5\2\2\u0251\u0250\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7.\2\2\u0254"+
		"\u0255\7\177\2\2\u0255\u0082\3\2\2\2\u0256\u0258\7}\2\2\u0257\u0259\t"+
		"\5\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\7.\2\2\u025b\u025d\t\5\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7\177\2\2\u025f\u0084\3\2\2\2\u0260"+
		"\u0261\7]\2\2\u0261\u0086\3\2\2\2\u0262\u0263\7_\2\2\u0263\u0088\3\2\2"+
		"\2\u0264\u0265\7*\2\2\u0265\u008a\3\2\2\2\u0266\u0267\7+\2\2\u0267\u008c"+
		"\3\2\2\2\u0268\u0269\7^\2\2\u0269\u008e\3\2\2\2\u026a\u026b\7^\2\2\u026b"+
		"\u026c\7\62\2\2\u026c\u026d\3\2\2\2\u026d\u026e\t\6\2\2\u026e\u0090\3"+
		"\2\2\2\u026f\u0270\7^\2\2\u0270\u0271\7\62\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0273\t\6\2\2\u0273\u0274\t\6\2\2\u0274\u0092\3\2\2\2\u0275\u0276\7^"+
		"\2\2\u0276\u0277\7\62\2\2\u0277\u0278\3\2\2\2\u0278\u0279\t\7\2\2\u0279"+
		"\u027a\t\6\2\2\u027a\u027b\t\6\2\2\u027b\u0094\3\2\2\2\u027c\u027d\7^"+
		"\2\2\u027d\u027e\7z\2\2\u027e\u027f\3\2\2\2\u027f\u0280\t\b\2\2\u0280"+
		"\u0096\3\2\2\2\u0281\u0282\7^\2\2\u0282\u0283\7z\2\2\u0283\u0284\3\2\2"+
		"\2\u0284\u0285\t\b\2\2\u0285\u0286\t\b\2\2\u0286\u0287\t\b\2\2\u0287\u0288"+
		"\t\b\2\2\u0288\u0098\3\2\2\2\u0289\u028a\7W\2\2\u028a\u028b\7^\2\2\u028b"+
		"\u028c\7-\2\2\u028c\u028e\3\2\2\2\u028d\u028f\t\t\2\2\u028e\u028d\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\t\b\2\2\u0291"+
		"\u0292\bM\2\2\u0292\u009a\3\2\2\2\u0293\u0294\7^\2\2\u0294\u0295\7t\2"+
		"\2\u0295\u009c\3\2\2\2\u0296\u0297\7^\2\2\u0297\u0298\7v\2\2\u0298\u009e"+
		"\3\2\2\2\u0299\u029a\7^\2\2\u029a\u029b\7h\2\2\u029b\u00a0\3\2\2\2\u029c"+
		"\u029d\7^\2\2\u029d\u029e\7c\2\2\u029e\u00a2\3\2\2\2\u029f\u02a0\7^\2"+
		"\2\u02a0\u02a1\7g\2\2\u02a1\u00a4\3\2\2\2\u02a2\u02a3\7&\2\2\u02a3\u00a6"+
		"\3\2\2\2\u02a4\u02a5\7^\2\2\u02a5\u02a6\7d\2\2\u02a6\u00a8\3\2\2\2\u02a7"+
		"\u02a8\7^\2\2\u02a8\u02a9\7D\2\2\u02a9\u00aa\3\2\2\2\u02aa\u02ab\7^\2"+
		"\2\u02ab\u02ac\7C\2\2\u02ac\u00ac\3\2\2\2\u02ad\u02ae\7^\2\2\u02ae\u02af"+
		"\7I\2\2\u02af\u00ae\3\2\2\2\u02b0\u02b1\7^\2\2\u02b1\u02b2\7|\2\2\u02b2"+
		"\u00b0\3\2\2\2\u02b3\u02b4\7^\2\2\u02b4\u02b5\7\\\2\2\u02b5\u00b2\3\2"+
		"\2\2\u02b6\u02b7\7^\2\2\u02b7\u02b8\7T\2\2\u02b8\u00b4\3\2\2\2\u02b9\u02ba"+
		"\7^\2\2\u02ba\u02bb\7]\2\2\u02bb\u02bc\7\62\2\2\u02bc\u02bd\7/\2\2\u02bd"+
		"\u02be\7;\2\2\u02be\u02bf\7_\2\2\u02bf\u02c0\7-\2\2\u02c0\u00b6\3\2\2"+
		"\2\u02c1\u02c2\7^\2\2\u02c2\u02c3\7m\2\2\u02c3\u02c4\7>\2\2\u02c4\u02c6"+
		"\3\2\2\2\u02c5\u02c7\t\4\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\7@"+
		"\2\2\u02cb\u00b8\3\2\2\2\t\2\u024b\u0251\u0258\u025c\u028e\u02c8\3\3M"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}