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
		T__0=1, T__1=2, T__2=3, LETTERS=4, PIPE=5, ASTERISK=6, QMARK=7, PLUS=8, 
		MIN_QUANTIFIER=9, RANGE_QUANTIFIER=10, PIPE_ESCAPED=11, BACKSLASH_ESCAPED=12, 
		LPAREN_ESCAPED=13, RPAREN_ESCAPED=14, LBRACKET_ESCAPED=15, RBRACKET_ESCAPED=16, 
		DOT_ESCAPED=17, CARET_ESCAPED=18, QMARK_ESCAPED=19, ASTERISK_ESCAPED=20, 
		DOLLAR_SIGN_ESCAPED=21, HYPHEN_ESCAPED=22, BACKSLASH=23, OCTAL_1=24, OCTAL_2=25, 
		OCTAL_3=26, HEXA_2=27, HEXA_4=28, CODE_POINT=29, CARRIAGE_RETURN=30, TAB=31, 
		FORM_FEED=32, ALERT=33, ESC=34, ALPHANUM=35, LETTER_RANGE=36, NUMBER_RANGE=37, 
		WILDCARD=38, DIGIT=39, NON_DIGIT=40, HORIZONTAL_WS=41, NON_HORIZONTAL_WS=42, 
		WS=43, NON_WS=44, VERTICAL_WS=45, NON_VERTICAL_WS=46, WORD=47, NON_WORD=48, 
		CARET=49, DOLLAR_SIGN=50, WORD_BOUNDARY=51, NON_WORD_BOUNDARY=52, INPUT_START=53, 
		END_OF_MATCH=54, INPUT_END=55, INPUT_END_INC_NEWLINE=56, LINEBREAK_MATCHER=57, 
		LOWERCASE_PO6=58, UPPERCASE_PO6=59, ASCII_PO6=60, ALPHA_PO6=61, NUM_PO6=62, 
		ALNUM_PO6=63, PUNCT_PO6=64, GLYPH_PO6=65, PRINTABLE_PO6=66, BLANK_PO6=67, 
		CTRL_PO6=68, HEXADECIMAL_PO6=69, WS_PO6=70, CHAR_CLASS_LC=71, CHAR_CLASS_UC=72, 
		CHAR_CLASS_WS=73, CHAR_CLASS_MIRRORED=74, UNICODE_CLASS_LATIN=75, UNICODE_CLASS_GREEK=76, 
		UNICODE_CLASS_UC=77, UNICODE_CLASS_ALPHA=78, UNICODE_CLASS_CURR=79, UNICODE_CLASS_NOT_GREEK=80, 
		UNICODE_CLASS_NOT_UC=81;
	public static final int
		RULE_test = 0, RULE_quantifier = 1, RULE_range = 2, RULE_charClass = 3, 
		RULE_characterClass = 4, RULE_letterRange = 5, RULE_characterSequence = 6, 
		RULE_predefinedCharacterClass = 7, RULE_escapedFromLiteral = 8, RULE_escapedToLiteralOutsideCharClass = 9, 
		RULE_escapedToLiteralInsideCharClass = 10, RULE_acceptedCharacters = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"test", "quantifier", "range", "charClass", "characterClass", "letterRange", 
			"characterSequence", "predefinedCharacterClass", "escapedFromLiteral", 
			"escapedToLiteralOutsideCharClass", "escapedToLiteralInsideCharClass", 
			"acceptedCharacters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'['", "']'", null, "'|'", "'*'", "'?'", "'+'", null, null, 
			"'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", "'\\['", "'\\.'", "'\\^'", 
			"'\\?'", "'\\*'", "'\\$'", "'\\-'", "'\\'", null, null, null, null, null, 
			null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", null, null, null, 
			"'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", 
			"'\\V'", "'\\w'", "'\\W'", "'^'", "'$'", "'\\b'", "'\\B'", "'\\A'", "'\\G'", 
			"'\\z'", "'\\Z'", "'R'", "'\\p{Lower}'", "'\\p{Upper}'", "'\\p{ASCII}'", 
			"'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", "'\\p{Graph}'", 
			"'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", "'\\p{Space}'", 
			"'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LETTERS", "PIPE", "ASTERISK", "QMARK", "PLUS", 
			"MIN_QUANTIFIER", "RANGE_QUANTIFIER", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "BACKSLASH", "OCTAL_1", "OCTAL_2", 
			"OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", "TAB", 
			"FORM_FEED", "ALERT", "ESC", "ALPHANUM", "LETTER_RANGE", "NUMBER_RANGE", 
			"WILDCARD", "DIGIT", "NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", 
			"WS", "NON_WS", "VERTICAL_WS", "NON_VERTICAL_WS", "WORD", "NON_WORD", 
			"CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", 
			"END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", 
			"LOWERCASE_PO6", "UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", "NUM_PO6", 
			"ALNUM_PO6", "PUNCT_PO6", "GLYPH_PO6", "PRINTABLE_PO6", "BLANK_PO6", 
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

	public static class TestContext extends ParserRuleContext {
		public LetterRangeContext letterRange() {
			return getRuleContext(LetterRangeContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			letterRange(0);
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
		enterRule(_localctx, 2, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << QMARK) | (1L << PLUS) | (1L << MIN_QUANTIFIER) | (1L << RANGE_QUANTIFIER))) != 0)) ) {
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

	public static class RangeContext extends ParserRuleContext {
		public LetterRangeContext letterRange() {
			return getRuleContext(LetterRangeContext.class,0);
		}
		public TerminalNode NUMBER_RANGE() { return getToken(regex2englishParser.NUMBER_RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_range);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERS:
			case LETTER_RANGE:
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				letterRange(0);
				}
				break;
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
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

	public static class CharClassContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public CharClassContext charClass() {
			return getRuleContext(CharClassContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharacterSequenceContext characterSequence() {
			return getRuleContext(CharacterSequenceContext.class,0);
		}
		public CharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charClass; }
	}

	public final CharClassContext charClass() throws RecognitionException {
		CharClassContext _localctx = new CharClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_charClass);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(CARET);
				setState(34);
				charClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				characterSequence();
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

	public static class CharacterClassContext extends ParserRuleContext {
		public EscapedFromLiteralContext escapedFromLiteral() {
			return getRuleContext(EscapedFromLiteralContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharacterSequenceContext characterSequence() {
			return getRuleContext(CharacterSequenceContext.class,0);
		}
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_characterClass);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				escapedFromLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				characterSequence();
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

	public static class LetterRangeContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public List<LetterRangeContext> letterRange() {
			return getRuleContexts(LetterRangeContext.class);
		}
		public LetterRangeContext letterRange(int i) {
			return getRuleContext(LetterRangeContext.class,i);
		}
		public TerminalNode LETTERS() { return getToken(regex2englishParser.LETTERS, 0); }
		public TerminalNode LETTER_RANGE() { return getToken(regex2englishParser.LETTER_RANGE, 0); }
		public LetterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterRange; }
	}

	public final LetterRangeContext letterRange() throws RecognitionException {
		return letterRange(0);
	}

	private LetterRangeContext letterRange(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LetterRangeContext _localctx = new LetterRangeContext(_ctx, _parentState);
		LetterRangeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_letterRange, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARET:
				{
				setState(45);
				match(CARET);
				setState(46);
				letterRange(3);
				}
				break;
			case LETTERS:
			case LETTER_RANGE:
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==LETTERS || _la==LETTER_RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new LetterRangeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_letterRange);
						setState(50);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(51);
						letterRange(2);
						}
						break;
					case 2:
						{
						_localctx = new LetterRangeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_letterRange);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(53);
							match(T__0);
							}
						}

						setState(56);
						match(T__1);
						setState(57);
						letterRange(0);
						setState(58);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CharacterSequenceContext extends ParserRuleContext {
		public TerminalNode ALPHANUM() { return getToken(regex2englishParser.ALPHANUM, 0); }
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public CharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSequence; }
	}

	public final CharacterSequenceContext characterSequence() throws RecognitionException {
		CharacterSequenceContext _localctx = new CharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_characterSequence);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ALPHANUM);
				}
				break;
			case PIPE_ESCAPED:
			case BACKSLASH_ESCAPED:
			case LPAREN_ESCAPED:
			case RPAREN_ESCAPED:
			case LBRACKET_ESCAPED:
			case RBRACKET_ESCAPED:
			case DOT_ESCAPED:
			case CARET_ESCAPED:
			case QMARK_ESCAPED:
			case ASTERISK_ESCAPED:
			case DOLLAR_SIGN_ESCAPED:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				escapedToLiteralOutsideCharClass();
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
		enterRule(_localctx, 14, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static class EscapedFromLiteralContext extends ParserRuleContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
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
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public TerminalNode WORD_BOUNDARY() { return getToken(regex2englishParser.WORD_BOUNDARY, 0); }
		public TerminalNode NON_WORD_BOUNDARY() { return getToken(regex2englishParser.NON_WORD_BOUNDARY, 0); }
		public TerminalNode INPUT_START() { return getToken(regex2englishParser.INPUT_START, 0); }
		public TerminalNode END_OF_MATCH() { return getToken(regex2englishParser.END_OF_MATCH, 0); }
		public TerminalNode INPUT_END() { return getToken(regex2englishParser.INPUT_END, 0); }
		public TerminalNode INPUT_END_INC_NEWLINE() { return getToken(regex2englishParser.INPUT_END_INC_NEWLINE, 0); }
		public TerminalNode LINEBREAK_MATCHER() { return getToken(regex2englishParser.LINEBREAK_MATCHER, 0); }
		public EscapedFromLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedFromLiteral; }
	}

	public final EscapedFromLiteralContext escapedFromLiteral() throws RecognitionException {
		EscapedFromLiteralContext _localctx = new EscapedFromLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escapedFromLiteral);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(82);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(83);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(84);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(85);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(86);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(87);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(88);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(89);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(90);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(91);
				match(LINEBREAK_MATCHER);
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

	public static class EscapedToLiteralOutsideCharClassContext extends ParserRuleContext {
		public TerminalNode PIPE_ESCAPED() { return getToken(regex2englishParser.PIPE_ESCAPED, 0); }
		public TerminalNode BACKSLASH_ESCAPED() { return getToken(regex2englishParser.BACKSLASH_ESCAPED, 0); }
		public TerminalNode LPAREN_ESCAPED() { return getToken(regex2englishParser.LPAREN_ESCAPED, 0); }
		public TerminalNode RPAREN_ESCAPED() { return getToken(regex2englishParser.RPAREN_ESCAPED, 0); }
		public TerminalNode LBRACKET_ESCAPED() { return getToken(regex2englishParser.LBRACKET_ESCAPED, 0); }
		public TerminalNode RBRACKET_ESCAPED() { return getToken(regex2englishParser.RBRACKET_ESCAPED, 0); }
		public TerminalNode DOT_ESCAPED() { return getToken(regex2englishParser.DOT_ESCAPED, 0); }
		public TerminalNode CARET_ESCAPED() { return getToken(regex2englishParser.CARET_ESCAPED, 0); }
		public TerminalNode QMARK_ESCAPED() { return getToken(regex2englishParser.QMARK_ESCAPED, 0); }
		public TerminalNode ASTERISK_ESCAPED() { return getToken(regex2englishParser.ASTERISK_ESCAPED, 0); }
		public TerminalNode DOLLAR_SIGN_ESCAPED() { return getToken(regex2englishParser.DOLLAR_SIGN_ESCAPED, 0); }
		public EscapedToLiteralOutsideCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedToLiteralOutsideCharClass; }
	}

	public final EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() throws RecognitionException {
		EscapedToLiteralOutsideCharClassContext _localctx = new EscapedToLiteralOutsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE_ESCAPED) | (1L << BACKSLASH_ESCAPED) | (1L << LPAREN_ESCAPED) | (1L << RPAREN_ESCAPED) | (1L << LBRACKET_ESCAPED) | (1L << RBRACKET_ESCAPED) | (1L << DOT_ESCAPED) | (1L << CARET_ESCAPED) | (1L << QMARK_ESCAPED) | (1L << ASTERISK_ESCAPED) | (1L << DOLLAR_SIGN_ESCAPED))) != 0)) ) {
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

	public static class EscapedToLiteralInsideCharClassContext extends ParserRuleContext {
		public TerminalNode BACKSLASH_ESCAPED() { return getToken(regex2englishParser.BACKSLASH_ESCAPED, 0); }
		public TerminalNode LPAREN_ESCAPED() { return getToken(regex2englishParser.LPAREN_ESCAPED, 0); }
		public TerminalNode RPAREN_ESCAPED() { return getToken(regex2englishParser.RPAREN_ESCAPED, 0); }
		public TerminalNode LBRACKET_ESCAPED() { return getToken(regex2englishParser.LBRACKET_ESCAPED, 0); }
		public TerminalNode DOLLAR_SIGN_ESCAPED() { return getToken(regex2englishParser.DOLLAR_SIGN_ESCAPED, 0); }
		public TerminalNode HYPHEN_ESCAPED() { return getToken(regex2englishParser.HYPHEN_ESCAPED, 0); }
		public EscapedToLiteralInsideCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedToLiteralInsideCharClass; }
	}

	public final EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() throws RecognitionException {
		EscapedToLiteralInsideCharClassContext _localctx = new EscapedToLiteralInsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_escapedToLiteralInsideCharClass);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BACKSLASH_ESCAPED:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(BACKSLASH_ESCAPED);
				}
				break;
			case LPAREN_ESCAPED:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(LPAREN_ESCAPED);
				}
				break;
			case RPAREN_ESCAPED:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(RPAREN_ESCAPED);
				}
				break;
			case LBRACKET_ESCAPED:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(LBRACKET_ESCAPED);
				}
				break;
			case DOLLAR_SIGN_ESCAPED:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(DOLLAR_SIGN_ESCAPED);
				}
				break;
			case HYPHEN_ESCAPED:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(HYPHEN_ESCAPED);
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

	public static class AcceptedCharactersContext extends ParserRuleContext {
		public TerminalNode ALPHANUM() { return getToken(regex2englishParser.ALPHANUM, 0); }
		public TerminalNode LPAREN_ESCAPED() { return getToken(regex2englishParser.LPAREN_ESCAPED, 0); }
		public List<AcceptedCharactersContext> acceptedCharacters() {
			return getRuleContexts(AcceptedCharactersContext.class);
		}
		public AcceptedCharactersContext acceptedCharacters(int i) {
			return getRuleContext(AcceptedCharactersContext.class,i);
		}
		public AcceptedCharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceptedCharacters; }
	}

	public final AcceptedCharactersContext acceptedCharacters() throws RecognitionException {
		return acceptedCharacters(0);
	}

	private AcceptedCharactersContext acceptedCharacters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AcceptedCharactersContext _localctx = new AcceptedCharactersContext(_ctx, _parentState);
		AcceptedCharactersContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_acceptedCharacters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUM:
				{
				setState(106);
				match(ALPHANUM);
				}
				break;
			case LPAREN_ESCAPED:
				{
				setState(107);
				match(LPAREN_ESCAPED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AcceptedCharactersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_acceptedCharacters);
					setState(110);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(111);
					acceptedCharacters(4);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return letterRange_sempred((LetterRangeContext)_localctx, predIndex);
		case 11:
			return acceptedCharacters_sempred((AcceptedCharactersContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean letterRange_sempred(LetterRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean acceptedCharacters_sempred(AcceptedCharactersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Sx\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"(\n\5\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\3\7\5\7\63\n\7\3\7\3\7\3\7\3\7"+
		"\5\79\n\7\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\b\3\b\5\bF\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"j\n\f\3\r\3\r\3\r\5\ro\n\r\3\r\3\r\7\rs\n\r\f\r\16\rv\13\r\3\r\2\4\f\30"+
		"\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\b\f\4\2\6\6&&\4\2(/\61\62\3"+
		"\2\r\27\2\u0092\2\32\3\2\2\2\4\34\3\2\2\2\6 \3\2\2\2\b\'\3\2\2\2\n,\3"+
		"\2\2\2\f\62\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26"+
		"i\3\2\2\2\30n\3\2\2\2\32\33\5\f\7\2\33\3\3\2\2\2\34\35\t\2\2\2\35\5\3"+
		"\2\2\2\36!\5\f\7\2\37!\7\'\2\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"(\3"+
		"\2\2\2#$\7\63\2\2$(\5\b\5\2%(\5\6\4\2&(\5\16\b\2\'\"\3\2\2\2\'#\3\2\2"+
		"\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2)-\5\22\n\2*-\5\6\4\2+-\5\16\b\2,)"+
		"\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\13\3\2\2\2./\b\7\1\2/\60\7\63\2\2\60\63"+
		"\5\f\7\5\61\63\t\3\2\2\62.\3\2\2\2\62\61\3\2\2\2\63@\3\2\2\2\64\65\f\3"+
		"\2\2\65?\5\f\7\4\668\f\6\2\2\679\7\3\2\28\67\3\2\2\289\3\2\2\29:\3\2\2"+
		"\2:;\7\4\2\2;<\5\f\7\2<=\7\5\2\2=?\3\2\2\2>\64\3\2\2\2>\66\3\2\2\2?B\3"+
		"\2\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2B@\3\2\2\2CF\7%\2\2DF\5\24\13\2E"+
		"C\3\2\2\2ED\3\2\2\2F\17\3\2\2\2GH\t\4\2\2H\21\3\2\2\2I_\5\20\t\2J_\7\32"+
		"\2\2K_\7\33\2\2L_\7\34\2\2M_\7\35\2\2N_\7\36\2\2O_\7\37\2\2P_\7 \2\2Q"+
		"_\7!\2\2R_\7\"\2\2S_\7#\2\2T_\7$\2\2U_\7\63\2\2V_\7\64\2\2W_\7\65\2\2"+
		"X_\7\66\2\2Y_\7\67\2\2Z_\78\2\2[_\79\2\2\\_\7:\2\2]_\7;\2\2^I\3\2\2\2"+
		"^J\3\2\2\2^K\3\2\2\2^L\3\2\2\2^M\3\2\2\2^N\3\2\2\2^O\3\2\2\2^P\3\2\2\2"+
		"^Q\3\2\2\2^R\3\2\2\2^S\3\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2"+
		"^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\23\3\2"+
		"\2\2`a\t\5\2\2a\25\3\2\2\2bj\3\2\2\2cj\7\16\2\2dj\7\17\2\2ej\7\20\2\2"+
		"fj\7\21\2\2gj\7\27\2\2hj\7\30\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2"+
		"\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\27\3\2\2\2kl\b\r\1\2lo\7%\2\2mo\7"+
		"\17\2\2nk\3\2\2\2nm\3\2\2\2ot\3\2\2\2pq\f\5\2\2qs\5\30\r\6rp\3\2\2\2s"+
		"v\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\31\3\2\2\2vt\3\2\2\2\16 \',\628>@E^int";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}