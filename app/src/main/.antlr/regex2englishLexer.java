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
		CARET=25, LETTER=26, EXTRA_LETTER_ALLOWED_INSIDE=27, LETTER_RANGE=28, 
		NUMBER_RANGE=29, DOUBLE_AMPERSAND=30, PLUS_ESCAPED=31, LBRACE_ESCAPED=32, 
		PIPE_ESCAPED=33, BACKSLASH_ESCAPED=34, LPAREN_ESCAPED=35, RPAREN_ESCAPED=36, 
		LBRACKET_ESCAPED=37, RBRACKET_ESCAPED=38, DOT_ESCAPED=39, CARET_ESCAPED=40, 
		QMARK_ESCAPED=41, ASTERISK_ESCAPED=42, DOLLAR_SIGN_ESCAPED=43, HYPHEN_ESCAPED=44, 
		DIGIT=45, N_OCCURRANCES=46, MAX_QUANTIFIER=47, MIN_QUANTIFIER=48, RANGE_QUANTIFIER=49, 
		LBRACKET=50, RBRACKET=51, LPAREN=52, RPAREN=53, PIPE=54, BACKSLASH=55, 
		OCTAL_1=56, OCTAL_2=57, OCTAL_3=58, HEXA_2=59, HEXA_4=60, CODE_POINT=61, 
		CARRIAGE_RETURN=62, TAB=63, FORM_FEED=64, ALERT=65, ESC=66, DOLLAR_SIGN=67, 
		WORD_BOUNDARY=68, NON_WORD_BOUNDARY=69, INPUT_START=70, END_OF_MATCH=71, 
		INPUT_END=72, INPUT_END_INC_NEWLINE=73, LINEBREAK_MATCHER=74, POSIX=75, 
		NEWLINE_REF=76, NAMED_CAPTURE_GROUP_MATCH=77;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "CARET", 
			"LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LETTER_RANGE", "NUMBER_RANGE", 
			"DOUBLE_AMPERSAND", "PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", 
			"BACKSLASH_ESCAPED", "LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", 
			"RBRACKET_ESCAPED", "DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", 
			"ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "DIGIT", 
			"N_OCCURRANCES", "MAX_QUANTIFIER", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "PIPE", "BACKSLASH", "OCTAL_1", 
			"OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "POSIX", "NEWLINE_REF", "NAMED_CAPTURE_GROUP_MATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'+'", "'*'", "'?'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", 
			"'\\p{javaWhitespace}'", "'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", 
			"'\\p{Lu}'", "'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'^'", null, null, null, null, "'&&'", "'\\+'", "'\\{'", "'\\|'", "'\\\\'", 
			"'\\('", "'\\)'", "'\\]'", "'\\['", "'\\.'", "'\\^'", "'\\?'", "'\\*'", 
			"'\\$'", "'\\-'", "'\\d'", null, null, null, null, "'['", "']'", "'('", 
			"')'", "'|'", "'\\'", null, null, null, null, null, null, "'\\r'", "'\\t'", 
			"'\\f'", "'\\a'", "'\\e'", "'$'", "'\\b'", "'\\B'", "'\\A'", "'\\G'", 
			"'\\z'", "'\\Z'", "'\\R'", null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LETTER_RANGE", 
			"NUMBER_RANGE", "DOUBLE_AMPERSAND", "PLUS_ESCAPED", "LBRACE_ESCAPED", 
			"PIPE_ESCAPED", "BACKSLASH_ESCAPED", "LPAREN_ESCAPED", "RPAREN_ESCAPED", 
			"LBRACKET_ESCAPED", "RBRACKET_ESCAPED", "DOT_ESCAPED", "CARET_ESCAPED", 
			"QMARK_ESCAPED", "ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", 
			"DIGIT", "N_OCCURRANCES", "MAX_QUANTIFIER", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "PIPE", "BACKSLASH", "OCTAL_1", 
			"OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "POSIX", "NEWLINE_REF", "NAMED_CAPTURE_GROUP_MATCH"
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
		case 60:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u029a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u01a5\n\60\3\60\3\60\3\61"+
		"\3\61\5\61\u01ab\n\61\3\61\3\61\3\61\3\62\3\62\5\62\u01b2\n\62\3\62\3"+
		"\62\5\62\u01b6\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\5>\u01ea\n>\3"+
		">\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3E\3"+
		"F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u028b"+
		"\nL\3M\3M\3M\3N\3N\3N\3N\3N\6N\u0295\nN\rN\16N\u0296\3N\3N\2\2O\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\3\2\n\t\2##%%((..\61;C\\c"+
		"|\b\2&&,,/\60AA^^~~\4\2C\\c|\3\2\62;\3\2\629\3\2\62\65\5\2\62;CHch\3\2"+
		"\63\63\2\u02ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\3\u009d\3\2\2"+
		"\2\5\u009f\3\2\2\2\7\u00a2\3\2\2\2\t\u00a5\3\2\2\2\13\u00a8\3\2\2\2\r"+
		"\u00ab\3\2\2\2\17\u00ae\3\2\2\2\21\u00b1\3\2\2\2\23\u00b4\3\2\2\2\25\u00b7"+
		"\3\2\2\2\27\u00ba\3\2\2\2\31\u00bc\3\2\2\2\33\u00be\3\2\2\2\35\u00c0\3"+
		"\2\2\2\37\u00d2\3\2\2\2!\u00e4\3\2\2\2#\u00f7\3\2\2\2%\u0108\3\2\2\2\'"+
		"\u0114\3\2\2\2)\u0120\3\2\2\2+\u0127\3\2\2\2-\u0138\3\2\2\2/\u013f\3\2"+
		"\2\2\61\u014b\3\2\2\2\63\u015e\3\2\2\2\65\u0160\3\2\2\2\67\u0162\3\2\2"+
		"\29\u0164\3\2\2\2;\u0168\3\2\2\2=\u016c\3\2\2\2?\u016f\3\2\2\2A\u0172"+
		"\3\2\2\2C\u0175\3\2\2\2E\u0178\3\2\2\2G\u017b\3\2\2\2I\u017e\3\2\2\2K"+
		"\u0181\3\2\2\2M\u0184\3\2\2\2O\u0187\3\2\2\2Q\u018a\3\2\2\2S\u018d\3\2"+
		"\2\2U\u0190\3\2\2\2W\u0193\3\2\2\2Y\u0196\3\2\2\2[\u0199\3\2\2\2]\u019c"+
		"\3\2\2\2_\u01a0\3\2\2\2a\u01a8\3\2\2\2c\u01af\3\2\2\2e\u01b9\3\2\2\2g"+
		"\u01bb\3\2\2\2i\u01bd\3\2\2\2k\u01bf\3\2\2\2m\u01c1\3\2\2\2o\u01c3\3\2"+
		"\2\2q\u01c5\3\2\2\2s\u01ca\3\2\2\2u\u01d0\3\2\2\2w\u01d7\3\2\2\2y\u01dc"+
		"\3\2\2\2{\u01e4\3\2\2\2}\u01ee\3\2\2\2\177\u01f1\3\2\2\2\u0081\u01f4\3"+
		"\2\2\2\u0083\u01f7\3\2\2\2\u0085\u01fa\3\2\2\2\u0087\u01fd\3\2\2\2\u0089"+
		"\u01ff\3\2\2\2\u008b\u0202\3\2\2\2\u008d\u0205\3\2\2\2\u008f\u0208\3\2"+
		"\2\2\u0091\u020b\3\2\2\2\u0093\u020e\3\2\2\2\u0095\u0211\3\2\2\2\u0097"+
		"\u028a\3\2\2\2\u0099\u028c\3\2\2\2\u009b\u028f\3\2\2\2\u009d\u009e\7\60"+
		"\2\2\u009e\4\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1\7F\2\2\u00a1\6\3\2"+
		"\2\2\u00a2\u00a3\7^\2\2\u00a3\u00a4\7j\2\2\u00a4\b\3\2\2\2\u00a5\u00a6"+
		"\7^\2\2\u00a6\u00a7\7J\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7^\2\2\u00a9\u00aa"+
		"\7u\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7^\2\2\u00ac\u00ad\7U\2\2\u00ad\16"+
		"\3\2\2\2\u00ae\u00af\7^\2\2\u00af\u00b0\7x\2\2\u00b0\20\3\2\2\2\u00b1"+
		"\u00b2\7^\2\2\u00b2\u00b3\7X\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7^\2\2\u00b8\u00b9\7Y\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd"+
		"\32\3\2\2\2\u00be\u00bf\7A\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7^\2\2\u00c1"+
		"\u00c2\7r\2\2\u00c2\u00c3\7}\2\2\u00c3\u00c4\7l\2\2\u00c4\u00c5\7c\2\2"+
		"\u00c5\u00c6\7x\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7E\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\u00d1\7\177\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d4"+
		"\7r\2\2\u00d4\u00d5\7}\2\2\u00d5\u00d6\7l\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7x\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7r\2\2"+
		"\u00db\u00dc\7r\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\u00df"+
		"\7E\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7\177\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7^\2\2\u00e5\u00e6\7r\2\2"+
		"\u00e6\u00e7\7}\2\2\u00e7\u00e8\7l\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea"+
		"\7x\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7Y\2\2\u00ec\u00ed\7j\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\u00f2\7r\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7\177\2\2\u00f6\"\3\2\2\2\u00f7\u00f8\7^\2\2\u00f8"+
		"\u00f9\7r\2\2\u00f9\u00fa\7}\2\2\u00fa\u00fb\7l\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\u00fd\7x\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7O\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7t\2\2\u0101\u0102\7t\2\2\u0102\u0103\7q\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7f\2\2\u0106\u0107\7\177"+
		"\2\2\u0107$\3\2\2\2\u0108\u0109\7^\2\2\u0109\u010a\7r\2\2\u010a\u010b"+
		"\7}\2\2\u010b\u010c\7K\2\2\u010c\u010d\7u\2\2\u010d\u010e\7N\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2"+
		"\u0112\u0113\7\177\2\2\u0113&\3\2\2\2\u0114\u0115\7^\2\2\u0115\u0116\7"+
		"r\2\2\u0116\u0117\7}\2\2\u0117\u0118\7K\2\2\u0118\u0119\7p\2\2\u0119\u011a"+
		"\7I\2\2\u011a\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7m\2\2\u011e\u011f\7\177\2\2\u011f(\3\2\2\2\u0120\u0121\7^\2\2"+
		"\u0121\u0122\7r\2\2\u0122\u0123\7}\2\2\u0123\u0124\7N\2\2\u0124\u0125"+
		"\7w\2\2\u0125\u0126\7\177\2\2\u0126*\3\2\2\2\u0127\u0128\7^\2\2\u0128"+
		"\u0129\7r\2\2\u0129\u012a\7}\2\2\u012a\u012b\7K\2\2\u012b\u012c\7u\2\2"+
		"\u012c\u012d\7C\2\2\u012d\u012e\7n\2\2\u012e\u012f\7r\2\2\u012f\u0130"+
		"\7j\2\2\u0130\u0131\7c\2\2\u0131\u0132\7d\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136\7e\2\2\u0136\u0137\7\177"+
		"\2\2\u0137,\3\2\2\2\u0138\u0139\7^\2\2\u0139\u013a\7r\2\2\u013a\u013b"+
		"\7}\2\2\u013b\u013c\7U\2\2\u013c\u013d\7e\2\2\u013d\u013e\7\177\2\2\u013e"+
		".\3\2\2\2\u013f\u0140\7^\2\2\u0140\u0141\7R\2\2\u0141\u0142\7}\2\2\u0142"+
		"\u0143\7K\2\2\u0143\u0144\7p\2\2\u0144\u0145\7I\2\2\u0145\u0146\7t\2\2"+
		"\u0146\u0147\7g\2\2\u0147\u0148\7g\2\2\u0148\u0149\7m\2\2\u0149\u014a"+
		"\7\177\2\2\u014a\60\3\2\2\2\u014b\u014c\7]\2\2\u014c\u014d\7^\2\2\u014d"+
		"\u014e\7r\2\2\u014e\u014f\7}\2\2\u014f\u0150\7N\2\2\u0150\u0151\7\177"+
		"\2\2\u0151\u0152\7(\2\2\u0152\u0153\7(\2\2\u0153\u0154\7]\2\2\u0154\u0155"+
		"\7`\2\2\u0155\u0156\7^\2\2\u0156\u0157\7r\2\2\u0157\u0158\7}\2\2\u0158"+
		"\u0159\7N\2\2\u0159\u015a\7w\2\2\u015a\u015b\7\177\2\2\u015b\u015c\7_"+
		"\2\2\u015c\u015d\7_\2\2\u015d\62\3\2\2\2\u015e\u015f\7`\2\2\u015f\64\3"+
		"\2\2\2\u0160\u0161\t\2\2\2\u0161\66\3\2\2\2\u0162\u0163\t\3\2\2\u0163"+
		"8\3\2\2\2\u0164\u0165\t\4\2\2\u0165\u0166\7/\2\2\u0166\u0167\t\4\2\2\u0167"+
		":\3\2\2\2\u0168\u0169\t\5\2\2\u0169\u016a\7/\2\2\u016a\u016b\t\5\2\2\u016b"+
		"<\3\2\2\2\u016c\u016d\7(\2\2\u016d\u016e\7(\2\2\u016e>\3\2\2\2\u016f\u0170"+
		"\7^\2\2\u0170\u0171\7-\2\2\u0171@\3\2\2\2\u0172\u0173\7^\2\2\u0173\u0174"+
		"\7}\2\2\u0174B\3\2\2\2\u0175\u0176\7^\2\2\u0176\u0177\7~\2\2\u0177D\3"+
		"\2\2\2\u0178\u0179\7^\2\2\u0179\u017a\7^\2\2\u017aF\3\2\2\2\u017b\u017c"+
		"\7^\2\2\u017c\u017d\7*\2\2\u017dH\3\2\2\2\u017e\u017f\7^\2\2\u017f\u0180"+
		"\7+\2\2\u0180J\3\2\2\2\u0181\u0182\7^\2\2\u0182\u0183\7_\2\2\u0183L\3"+
		"\2\2\2\u0184\u0185\7^\2\2\u0185\u0186\7]\2\2\u0186N\3\2\2\2\u0187\u0188"+
		"\7^\2\2\u0188\u0189\7\60\2\2\u0189P\3\2\2\2\u018a\u018b\7^\2\2\u018b\u018c"+
		"\7`\2\2\u018cR\3\2\2\2\u018d\u018e\7^\2\2\u018e\u018f\7A\2\2\u018fT\3"+
		"\2\2\2\u0190\u0191\7^\2\2\u0191\u0192\7,\2\2\u0192V\3\2\2\2\u0193\u0194"+
		"\7^\2\2\u0194\u0195\7&\2\2\u0195X\3\2\2\2\u0196\u0197\7^\2\2\u0197\u0198"+
		"\7/\2\2\u0198Z\3\2\2\2\u0199\u019a\7^\2\2\u019a\u019b\7f\2\2\u019b\\\3"+
		"\2\2\2\u019c\u019d\7}\2\2\u019d\u019e\t\5\2\2\u019e\u019f\7\177\2\2\u019f"+
		"^\3\2\2\2\u01a0\u01a1\7}\2\2\u01a1\u01a2\7.\2\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u01a5\t\5\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\7\177\2\2\u01a7`\3\2\2\2\u01a8\u01aa\7}\2\2\u01a9\u01ab"+
		"\t\5\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\7.\2\2\u01ad\u01ae\7\177\2\2\u01aeb\3\2\2\2\u01af\u01b1\7}\2\2"+
		"\u01b0\u01b2\t\5\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\7.\2\2\u01b4\u01b6\t\5\2\2\u01b5\u01b4\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7\177\2\2\u01b8d\3\2\2"+
		"\2\u01b9\u01ba\7]\2\2\u01baf\3\2\2\2\u01bb\u01bc\7_\2\2\u01bch\3\2\2\2"+
		"\u01bd\u01be\7*\2\2\u01bej\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0l\3\2\2\2\u01c1"+
		"\u01c2\7~\2\2\u01c2n\3\2\2\2\u01c3\u01c4\7^\2\2\u01c4p\3\2\2\2\u01c5\u01c6"+
		"\7^\2\2\u01c6\u01c7\7\62\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\t\6\2\2\u01c9"+
		"r\3\2\2\2\u01ca\u01cb\7^\2\2\u01cb\u01cc\7\62\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cd\u01ce\t\6\2\2\u01ce\u01cf\t\6\2\2\u01cft\3\2\2\2\u01d0\u01d1\7"+
		"^\2\2\u01d1\u01d2\7\62\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\t\7\2\2\u01d4"+
		"\u01d5\t\6\2\2\u01d5\u01d6\t\6\2\2\u01d6v\3\2\2\2\u01d7\u01d8\7^\2\2\u01d8"+
		"\u01d9\7z\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\t\b\2\2\u01dbx\3\2\2\2\u01dc"+
		"\u01dd\7^\2\2\u01dd\u01de\7z\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\t\b\2"+
		"\2\u01e0\u01e1\t\b\2\2\u01e1\u01e2\t\b\2\2\u01e2\u01e3\t\b\2\2\u01e3z"+
		"\3\2\2\2\u01e4\u01e5\7W\2\2\u01e5\u01e6\7^\2\2\u01e6\u01e7\7-\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01ea\t\t\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\t\b\2\2\u01ec\u01ed\b>\2\2\u01ed"+
		"|\3\2\2\2\u01ee\u01ef\7^\2\2\u01ef\u01f0\7t\2\2\u01f0~\3\2\2\2\u01f1\u01f2"+
		"\7^\2\2\u01f2\u01f3\7v\2\2\u01f3\u0080\3\2\2\2\u01f4\u01f5\7^\2\2\u01f5"+
		"\u01f6\7h\2\2\u01f6\u0082\3\2\2\2\u01f7\u01f8\7^\2\2\u01f8\u01f9\7c\2"+
		"\2\u01f9\u0084\3\2\2\2\u01fa\u01fb\7^\2\2\u01fb\u01fc\7g\2\2\u01fc\u0086"+
		"\3\2\2\2\u01fd\u01fe\7&\2\2\u01fe\u0088\3\2\2\2\u01ff\u0200\7^\2\2\u0200"+
		"\u0201\7d\2\2\u0201\u008a\3\2\2\2\u0202\u0203\7^\2\2\u0203\u0204\7D\2"+
		"\2\u0204\u008c\3\2\2\2\u0205\u0206\7^\2\2\u0206\u0207\7C\2\2\u0207\u008e"+
		"\3\2\2\2\u0208\u0209\7^\2\2\u0209\u020a\7I\2\2\u020a\u0090\3\2\2\2\u020b"+
		"\u020c\7^\2\2\u020c\u020d\7|\2\2\u020d\u0092\3\2\2\2\u020e\u020f\7^\2"+
		"\2\u020f\u0210\7\\\2\2\u0210\u0094\3\2\2\2\u0211\u0212\7^\2\2\u0212\u0213"+
		"\7T\2\2\u0213\u0096\3\2\2\2\u0214\u0215\7^\2\2\u0215\u0216\7r\2\2\u0216"+
		"\u0217\7}\2\2\u0217\u0218\7N\2\2\u0218\u0219\7q\2\2\u0219\u021a\7y\2\2"+
		"\u021a\u021b\7g\2\2\u021b\u021c\7t\2\2\u021c\u028b\7\177\2\2\u021d\u021e"+
		"\7^\2\2\u021e\u021f\7r\2\2\u021f\u0220\7}\2\2\u0220\u0221\7W\2\2\u0221"+
		"\u0222\7r\2\2\u0222\u0223\7r\2\2\u0223\u0224\7g\2\2\u0224\u0225\7t\2\2"+
		"\u0225\u028b\7\177\2\2\u0226\u0227\7^\2\2\u0227\u0228\7r\2\2\u0228\u0229"+
		"\7}\2\2\u0229\u022a\7C\2\2\u022a\u022b\7U\2\2\u022b\u022c\7E\2\2\u022c"+
		"\u022d\7K\2\2\u022d\u022e\7K\2\2\u022e\u028b\7\177\2\2\u022f\u0230\7^"+
		"\2\2\u0230\u0231\7r\2\2\u0231\u0232\7}\2\2\u0232\u0233\7C\2\2\u0233\u0234"+
		"\7n\2\2\u0234\u0235\7r\2\2\u0235\u0236\7j\2\2\u0236\u0237\7c\2\2\u0237"+
		"\u028b\7\177\2\2\u0238\u0239\7^\2\2\u0239\u023a\7r\2\2\u023a\u023b\7}"+
		"\2\2\u023b\u023c\7F\2\2\u023c\u023d\7k\2\2\u023d\u023e\7i\2\2\u023e\u023f"+
		"\7k\2\2\u023f\u0240\7v\2\2\u0240\u028b\7\177\2\2\u0241\u0242\7^\2\2\u0242"+
		"\u0243\7r\2\2\u0243\u0244\7}\2\2\u0244\u0245\7C\2\2\u0245\u0246\7n\2\2"+
		"\u0246\u0247\7p\2\2\u0247\u0248\7w\2\2\u0248\u0249\7o\2\2\u0249\u028b"+
		"\7\177\2\2\u024a\u024b\7^\2\2\u024b\u024c\7r\2\2\u024c\u024d\7}\2\2\u024d"+
		"\u024e\7R\2\2\u024e\u024f\7w\2\2\u024f\u0250\7p\2\2\u0250\u0251\7e\2\2"+
		"\u0251\u0252\7v\2\2\u0252\u028b\7\177\2\2\u0253\u0254\7^\2\2\u0254\u0255"+
		"\7r\2\2\u0255\u0256\7}\2\2\u0256\u0257\7I\2\2\u0257\u0258\7t\2\2\u0258"+
		"\u0259\7c\2\2\u0259\u025a\7r\2\2\u025a\u025b\7j\2\2\u025b\u028b\7\177"+
		"\2\2\u025c\u025d\7^\2\2\u025d\u025e\7r\2\2\u025e\u025f\7}\2\2\u025f\u0260"+
		"\7R\2\2\u0260\u0261\7t\2\2\u0261\u0262\7k\2\2\u0262\u0263\7p\2\2\u0263"+
		"\u0264\7v\2\2\u0264\u028b\7\177\2\2\u0265\u0266\7^\2\2\u0266\u0267\7r"+
		"\2\2\u0267\u0268\7}\2\2\u0268\u0269\7D\2\2\u0269\u026a\7n\2\2\u026a\u026b"+
		"\7c\2\2\u026b\u026c\7p\2\2\u026c\u026d\7m\2\2\u026d\u028b\7\177\2\2\u026e"+
		"\u026f\7^\2\2\u026f\u0270\7r\2\2\u0270\u0271\7}\2\2\u0271\u0272\7E\2\2"+
		"\u0272\u0273\7p\2\2\u0273\u0274\7v\2\2\u0274\u0275\7t\2\2\u0275\u0276"+
		"\7n\2\2\u0276\u028b\7\177\2\2\u0277\u0278\7^\2\2\u0278\u0279\7r\2\2\u0279"+
		"\u027a\7}\2\2\u027a\u027b\7Z\2\2\u027b\u027c\7F\2\2\u027c\u027d\7k\2\2"+
		"\u027d\u027e\7i\2\2\u027e\u027f\7k\2\2\u027f\u0280\7v\2\2\u0280\u028b"+
		"\7\177\2\2\u0281\u0282\7^\2\2\u0282\u0283\7r\2\2\u0283\u0284\7}\2\2\u0284"+
		"\u0285\7U\2\2\u0285\u0286\7r\2\2\u0286\u0287\7c\2\2\u0287\u0288\7e\2\2"+
		"\u0288\u0289\7g\2\2\u0289\u028b\7\177\2\2\u028a\u0214\3\2\2\2\u028a\u021d"+
		"\3\2\2\2\u028a\u0226\3\2\2\2\u028a\u022f\3\2\2\2\u028a\u0238\3\2\2\2\u028a"+
		"\u0241\3\2\2\2\u028a\u024a\3\2\2\2\u028a\u0253\3\2\2\2\u028a\u025c\3\2"+
		"\2\2\u028a\u0265\3\2\2\2\u028a\u026e\3\2\2\2\u028a\u0277\3\2\2\2\u028a"+
		"\u0281\3\2\2\2\u028b\u0098\3\2\2\2\u028c\u028d\7^\2\2\u028d\u028e\7p\2"+
		"\2\u028e\u009a\3\2\2\2\u028f\u0290\7^\2\2\u0290\u0291\7m\2\2\u0291\u0292"+
		"\7>\2\2\u0292\u0294\3\2\2\2\u0293\u0295\t\4\2\2\u0294\u0293\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\7@\2\2\u0299\u009c\3\2\2\2\n\2\u01a4\u01aa\u01b1\u01b5"+
		"\u01e9\u028a\u0296\3\3>\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}