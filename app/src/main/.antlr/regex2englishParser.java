// Generated from /Users/willrabalais/Code/Projects/regex2english/app/src/main/regex2english.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regex2englishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACKET=1, RBRACKET=2, PIPE=3, CAPTURE_GROUP=4, ASTERISK=5, QMARK=6, 
		PLUS=7, MIN_QUANTIFIER=8, RANGE_QUANTIFIER=9, BACKSLASH=10, OCTAL_1=11, 
		OCTAL_2=12, OCTAL_3=13, HEXA_2=14, HEXA_4=15, CODE_POINT=16, CARRIAGE_RETURN=17, 
		TAB=18, FORM_FEED=19, ALERT=20, ESC=21, LETTER_RANGE=22, NUMBER_RANGE=23, 
		WILDCARD=24, DIGIT=25, NON_DIGIT=26, HORIZONTAL_WS=27, NON_HORIZONTAL_WS=28, 
		WS=29, NON_WS=30, VERTICAL_WS=31, NON_VERTICAL_WS=32, WORD=33, NON_WORD=34, 
		CARET=35, DOLLAR_SIGN=36, WORD_BOUNDARY=37, NON_WORD_BOUNDARY=38, INPUT_START=39, 
		END_OF_MATCH=40, INPUT_END=41, INPUT_END_INC_NEWLINE=42, LINEBREAK_MATCHER=43, 
		NUMBER=44, LETTER=45, LOWERCASE_PO6=46, UPPERCASE_PO6=47, ASCII_PO6=48, 
		ALPHA_PO6=49, NUM_PO6=50, ALNUM_PO6=51, PUNCT_PO6=52, GLYPH_PO6=53, PRINTABLE_PO6=54, 
		BLANK_PO6=55, CTRL_PO6=56, HEXADECIMAL_PO6=57, WS_PO6=58, CHAR_CLASS_LC=59, 
		CHAR_CLASS_UC=60, CHAR_CLASS_WS=61, CHAR_CLASS_MIRRORED=62, UNICODE_CLASS_LATIN=63, 
		UNICODE_CLASS_GREEK=64, UNICODE_CLASS_UC=65, UNICODE_CLASS_ALPHA=66, UNICODE_CLASS_CURR=67, 
		UNICODE_CLASS_NOT_GREEK=68, UNICODE_CLASS_NOT_UC=69;
	public static final int
		RULE_expr = 0, RULE_test = 1, RULE_start = 2, RULE_quantifier = 3, RULE_characterSequence = 4, 
		RULE_range = 5, RULE_character = 6, RULE_characterClass = 7, RULE_stringOfCharacters = 8, 
		RULE_predefinedCharacterClass = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "test", "start", "quantifier", "characterSequence", "range", 
			"character", "characterClass", "stringOfCharacters", "predefinedCharacterClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'|'", null, "'*'", "'?'", "'+'", null, null, "'\\'", 
			null, null, null, null, null, null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", 
			"'\\e'", null, null, "'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", 
			"'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", "'^'", "'$'", "'\\b'", "'\\B'", 
			"'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'", null, null, "'\\p{Lower}'", 
			"'\\p{Upper}'", "'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", 
			"'\\p{Punct}'", "'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", 
			"'\\p{XDigit}'", "'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", 
			"'\\p{javaWhitespace}'", "'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", 
			"'\\p{Lu}'", "'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACKET", "RBRACKET", "PIPE", "CAPTURE_GROUP", "ASTERISK", "QMARK", 
			"PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_1", 
			"OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "LETTER_RANGE", "NUMBER_RANGE", "WILDCARD", 
			"DIGIT", "NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", 
			"VERTICAL_WS", "NON_VERTICAL_WS", "WORD", "NON_WORD", "CARET", "DOLLAR_SIGN", 
			"WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "NUMBER", 
			"LETTER", "LOWERCASE_PO6", "UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", 
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

	@Override
	public String getGrammarFileName() { return "regex2english.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public regex2englishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public StringOfCharactersContext stringOfCharacters() {
			return getRuleContext(StringOfCharactersContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			stringOfCharacters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_RANGE:
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				test();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public TerminalNode CAPTURE_GROUP() { return getToken(regex2englishParser.CAPTURE_GROUP, 0); }
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public TerminalNode MIN_QUANTIFIER() { return getToken(regex2englishParser.MIN_QUANTIFIER, 0); }
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE) | (1L << CAPTURE_GROUP) | (1L << ASTERISK) | (1L << QMARK) | (1L << PLUS) | (1L << MIN_QUANTIFIER) | (1L << RANGE_QUANTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSequenceContext extends ParserRuleContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public CharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSequence; }
	}

	public final CharacterSequenceContext characterSequence() throws RecognitionException {
		CharacterSequenceContext _localctx = new CharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_characterSequence);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKSLASH:
			case OCTAL_1:
			case OCTAL_2:
			case OCTAL_3:
			case HEXA_2:
			case HEXA_4:
			case CODE_POINT:
			case CARRIAGE_RETURN:
			case TAB:
			case FORM_FEED:
			case ALERT:
			case ESC:
			case NUMBER:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				character();
				}
				break;
			case WILDCARD:
			case DIGIT:
			case NON_DIGIT:
			case HORIZONTAL_WS:
			case NON_HORIZONTAL_WS:
			case WS:
			case NON_WS:
			case VERTICAL_WS:
			case WORD:
			case NON_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				predefinedCharacterClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> LETTER_RANGE() { return getTokens(regex2englishParser.LETTER_RANGE); }
		public TerminalNode LETTER_RANGE(int i) {
			return getToken(regex2englishParser.LETTER_RANGE, i);
		}
		public TerminalNode NUMBER_RANGE() { return getToken(regex2englishParser.NUMBER_RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_range);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					match(LETTER_RANGE);
					}
					break;
				}
				setState(37);
				match(LETTER_RANGE);
				}
				break;
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(NUMBER_RANGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(regex2englishParser.NUMBER, 0); }
		public TerminalNode LETTER() { return getToken(regex2englishParser.LETTER, 0); }
		public TerminalNode BACKSLASH() { return getToken(regex2englishParser.BACKSLASH, 0); }
		public TerminalNode OCTAL_1() { return getToken(regex2englishParser.OCTAL_1, 0); }
		public TerminalNode OCTAL_2() { return getToken(regex2englishParser.OCTAL_2, 0); }
		public TerminalNode OCTAL_3() { return getToken(regex2englishParser.OCTAL_3, 0); }
		public TerminalNode HEXA_2() { return getToken(regex2englishParser.HEXA_2, 0); }
		public TerminalNode HEXA_4() { return getToken(regex2englishParser.HEXA_4, 0); }
		public TerminalNode CODE_POINT() { return getToken(regex2englishParser.CODE_POINT, 0); }
		public TerminalNode CARRIAGE_RETURN() { return getToken(regex2englishParser.CARRIAGE_RETURN, 0); }
		public TerminalNode TAB() { return getToken(regex2englishParser.TAB, 0); }
		public TerminalNode FORM_FEED() { return getToken(regex2englishParser.FORM_FEED, 0); }
		public TerminalNode ALERT() { return getToken(regex2englishParser.ALERT, 0); }
		public TerminalNode ESC() { return getToken(regex2englishParser.ESC, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH) | (1L << OCTAL_1) | (1L << OCTAL_2) | (1L << OCTAL_3) | (1L << HEXA_2) | (1L << HEXA_4) | (1L << CODE_POINT) | (1L << CARRIAGE_RETURN) | (1L << TAB) | (1L << FORM_FEED) | (1L << ALERT) | (1L << ESC) | (1L << NUMBER) | (1L << LETTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterClassContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characterClass);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(LBRACKET);
				setState(44);
				expr();
				setState(45);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(LBRACKET);
				setState(48);
				match(CARET);
				setState(49);
				expr();
				setState(50);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(LBRACKET);
				setState(53);
				range();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringOfCharactersContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public StringOfCharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOfCharacters; }
	}

	public final StringOfCharactersContext stringOfCharacters() throws RecognitionException {
		StringOfCharactersContext _localctx = new StringOfCharactersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringOfCharacters);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				character();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				character();
				setState(58);
				character();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredefinedCharacterClassContext extends ParserRuleContext {
		public TerminalNode WILDCARD() { return getToken(regex2englishParser.WILDCARD, 0); }
		public TerminalNode DIGIT() { return getToken(regex2englishParser.DIGIT, 0); }
		public TerminalNode NON_DIGIT() { return getToken(regex2englishParser.NON_DIGIT, 0); }
		public TerminalNode HORIZONTAL_WS() { return getToken(regex2englishParser.HORIZONTAL_WS, 0); }
		public TerminalNode NON_HORIZONTAL_WS() { return getToken(regex2englishParser.NON_HORIZONTAL_WS, 0); }
		public TerminalNode WS() { return getToken(regex2englishParser.WS, 0); }
		public TerminalNode NON_WS() { return getToken(regex2englishParser.NON_WS, 0); }
		public TerminalNode VERTICAL_WS() { return getToken(regex2englishParser.VERTICAL_WS, 0); }
		public TerminalNode WORD() { return getToken(regex2englishParser.WORD, 0); }
		public TerminalNode NON_WORD() { return getToken(regex2englishParser.NON_WORD, 0); }
		public PredefinedCharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedCharacterClass; }
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WILDCARD) | (1L << DIGIT) | (1L << NON_DIGIT) | (1L << HORIZONTAL_WS) | (1L << NON_HORIZONTAL_WS) | (1L << WS) | (1L << NON_WS) | (1L << VERTICAL_WS) | (1L << WORD) | (1L << NON_WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3GC\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\5\4\35\n\4\3\5\3\5\3\6\3\6\5\6#\n\6\3\7\5\7&\n\7"+
		"\3\7\3\7\5\7*\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t9\n\t\3\n\3\n\3\n\3\n\5\n?\n\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\5\3\2\5\13\4\2\f\27./\4\2\32!#$\2?\2\26\3\2\2\2\4\30\3\2\2"+
		"\2\6\34\3\2\2\2\b\36\3\2\2\2\n\"\3\2\2\2\f)\3\2\2\2\16+\3\2\2\2\208\3"+
		"\2\2\2\22>\3\2\2\2\24@\3\2\2\2\26\27\5\22\n\2\27\3\3\2\2\2\30\31\5\f\7"+
		"\2\31\5\3\2\2\2\32\35\5\4\3\2\33\35\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2"+
		"\2\35\7\3\2\2\2\36\37\t\2\2\2\37\t\3\2\2\2 #\5\16\b\2!#\5\24\13\2\" \3"+
		"\2\2\2\"!\3\2\2\2#\13\3\2\2\2$&\7\30\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2"+
		"\2\'*\7\30\2\2(*\7\31\2\2)%\3\2\2\2)(\3\2\2\2*\r\3\2\2\2+,\t\3\2\2,\17"+
		"\3\2\2\2-.\7\3\2\2./\5\2\2\2/\60\7\4\2\2\609\3\2\2\2\61\62\7\3\2\2\62"+
		"\63\7%\2\2\63\64\5\2\2\2\64\65\7\4\2\2\659\3\2\2\2\66\67\7\3\2\2\679\5"+
		"\f\7\28-\3\2\2\28\61\3\2\2\28\66\3\2\2\29\21\3\2\2\2:?\5\16\b\2;<\5\16"+
		"\b\2<=\5\16\b\2=?\3\2\2\2>:\3\2\2\2>;\3\2\2\2?\23\3\2\2\2@A\t\4\2\2A\25"+
		"\3\2\2\2\b\34\"%)8>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}