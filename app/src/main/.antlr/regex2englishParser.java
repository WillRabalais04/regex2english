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
		LETTERS=1, LPAREN=2, RPAREN=3, LBRACKET=4, RBRACKET=5, DOUBLE_AMPERSAND=6, 
		PIPE=7, CAPTURE_GROUP=8, ASTERISK=9, QMARK=10, PLUS=11, MIN_QUANTIFIER=12, 
		RANGE_QUANTIFIER=13, BACKSLASH=14, OCTAL_1=15, OCTAL_2=16, OCTAL_3=17, 
		HEXA_2=18, HEXA_4=19, CODE_POINT=20, CARRIAGE_RETURN=21, TAB=22, FORM_FEED=23, 
		ALERT=24, ESC=25, ALPHANUM=26, LETTER_RANGE=27, NUMBER_RANGE=28, WILDCARD=29, 
		DIGIT=30, NON_DIGIT=31, HORIZONTAL_WS=32, NON_HORIZONTAL_WS=33, WS=34, 
		NON_WS=35, VERTICAL_WS=36, NON_VERTICAL_WS=37, WORD=38, NON_WORD=39, ESCAPED_BACKSLASH=40, 
		CARET=41, DOLLAR_SIGN=42, WORD_BOUNDARY=43, NON_WORD_BOUNDARY=44, INPUT_START=45, 
		END_OF_MATCH=46, INPUT_END=47, INPUT_END_INC_NEWLINE=48, LINEBREAK_MATCHER=49, 
		LOWERCASE_PO6=50, UPPERCASE_PO6=51, ASCII_PO6=52, ALPHA_PO6=53, NUM_PO6=54, 
		ALNUM_PO6=55, PUNCT_PO6=56, GLYPH_PO6=57, PRINTABLE_PO6=58, BLANK_PO6=59, 
		CTRL_PO6=60, HEXADECIMAL_PO6=61, WS_PO6=62, CHAR_CLASS_LC=63, CHAR_CLASS_UC=64, 
		CHAR_CLASS_WS=65, CHAR_CLASS_MIRRORED=66, UNICODE_CLASS_LATIN=67, UNICODE_CLASS_GREEK=68, 
		UNICODE_CLASS_UC=69, UNICODE_CLASS_ALPHA=70, UNICODE_CLASS_CURR=71, UNICODE_CLASS_NOT_GREEK=72, 
		UNICODE_CLASS_NOT_UC=73;
	public static final int
		RULE_start = 0, RULE_test = 1, RULE_quantifier = 2, RULE_range = 3, RULE_expr = 4, 
		RULE_characterClass = 5, RULE_letterRange = 6, RULE_characterSequence = 7, 
		RULE_predefinedCharacterClass = 8, RULE_escapedLiteral = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "test", "quantifier", "range", "expr", "characterClass", "letterRange", 
			"characterSequence", "predefinedCharacterClass", "escapedLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'['", "']'", "'&&'", "'|'", null, "'*'", "'?'", 
			"'+'", null, null, "'\\'", null, null, null, null, null, null, "'\\r'", 
			"'\\t'", "'\\f'", "'\\a'", "'\\e'", null, null, null, "'.'", "'\\d'", 
			"'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", 
			"'\\W'", "'\\\\'", "'^'", "'$'", "'\\b'", "'\\B'", "'\\A'", "'\\G'", 
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
			null, "LETTERS", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "DOUBLE_AMPERSAND", 
			"PIPE", "CAPTURE_GROUP", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", 
			"RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", 
			"HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", 
			"ESC", "ALPHANUM", "LETTER_RANGE", "NUMBER_RANGE", "WILDCARD", "DIGIT", 
			"NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "ESCAPED_BACKSLASH", "CARET", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "LOWERCASE_PO6", 
			"UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", "NUM_PO6", "ALNUM_PO6", "PUNCT_PO6", 
			"GLYPH_PO6", "PRINTABLE_PO6", "BLANK_PO6", "CTRL_PO6", "HEXADECIMAL_PO6", 
			"WS_PO6", "CHAR_CLASS_LC", "CHAR_CLASS_UC", "CHAR_CLASS_WS", "CHAR_CLASS_MIRRORED", 
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

	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case LBRACKET:
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
			case ALPHANUM:
			case LETTER_RANGE:
			case NUMBER_RANGE:
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
			case ESCAPED_BACKSLASH:
			case CARET:
			case DOLLAR_SIGN:
			case WORD_BOUNDARY:
			case NON_WORD_BOUNDARY:
			case INPUT_START:
			case END_OF_MATCH:
			case INPUT_END:
			case INPUT_END_INC_NEWLINE:
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				expr(0);
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

	public static class TestContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public TerminalNode LETTERS() { return getToken(regex2englishParser.LETTERS, 0); }
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
			setState(24);
			match(CARET);
			setState(25);
			match(LETTERS);
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
		enterRule(_localctx, 4, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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
		enterRule(_localctx, 6, RULE_range);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case LETTER_RANGE:
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				letterRange(0);
				}
				break;
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34);
				match(LBRACKET);
				setState(35);
				expr(0);
				setState(36);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				setState(38);
				match(LPAREN);
				setState(39);
				expr(0);
				setState(40);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(42);
				match(CARET);
				setState(43);
				expr(5);
				}
				break;
			case 4:
				{
				setState(44);
				characterClass();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(48);
						match(PIPE);
						setState(49);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(51);
						expr(2);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53);
						quantifier();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(55);
						match(DOLLAR_SIGN);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class CharacterClassContext extends ParserRuleContext {
		public EscapedLiteralContext escapedLiteral() {
			return getRuleContext(EscapedLiteralContext.class,0);
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
		enterRule(_localctx, 10, RULE_characterClass);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				escapedLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
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
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public List<LetterRangeContext> letterRange() {
			return getRuleContexts(LetterRangeContext.class);
		}
		public LetterRangeContext letterRange(int i) {
			return getRuleContext(LetterRangeContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public TerminalNode LETTERS() { return getToken(regex2englishParser.LETTERS, 0); }
		public TerminalNode LETTER_RANGE() { return getToken(regex2englishParser.LETTER_RANGE, 0); }
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(regex2englishParser.DOUBLE_AMPERSAND, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_letterRange, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(67);
				match(LBRACKET);
				setState(68);
				letterRange(0);
				setState(69);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				setState(71);
				match(CARET);
				setState(72);
				letterRange(5);
				}
				break;
			case 3:
				{
				setState(73);
				match(CARET);
				setState(74);
				match(LETTERS);
				}
				break;
			case 4:
				{
				setState(75);
				match(LETTER_RANGE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LetterRangeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_letterRange);
						setState(78);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(79);
						letterRange(4);
						}
						break;
					case 2:
						{
						_localctx = new LetterRangeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_letterRange);
						setState(80);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(81);
						match(DOUBLE_AMPERSAND);
						setState(82);
						letterRange(3);
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public CharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSequence; }
	}

	public final CharacterSequenceContext characterSequence() throws RecognitionException {
		CharacterSequenceContext _localctx = new CharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characterSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ALPHANUM);
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
		enterRule(_localctx, 16, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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

	public static class EscapedLiteralContext extends ParserRuleContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public TerminalNode ESCAPED_BACKSLASH() { return getToken(regex2englishParser.ESCAPED_BACKSLASH, 0); }
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
		public EscapedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedLiteral; }
	}

	public final EscapedLiteralContext escapedLiteral() throws RecognitionException {
		EscapedLiteralContext _localctx = new EscapedLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_escapedLiteral);
		try {
			setState(114);
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
				setState(92);
				predefinedCharacterClass();
				}
				break;
			case ESCAPED_BACKSLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(ESCAPED_BACKSLASH);
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 12);
				{
				setState(103);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 13);
				{
				setState(104);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 14);
				{
				setState(105);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 15);
				{
				setState(106);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(107);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 17);
				{
				setState(108);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 18);
				{
				setState(109);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 19);
				{
				setState(110);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 20);
				{
				setState(111);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 21);
				{
				setState(112);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 22);
				{
				setState(113);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return letterRange_sempred((LetterRangeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean letterRange_sempred(LetterRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Kw\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\5\2\31\n\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\"\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\b\3\b\3\b\3\b\3\b\7\bV\n\b\f\b\16"+
		"\bY\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"u\n\13\3\13\2\4\n\16\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\13\17\4\2\37&("+
		")\2\u0091\2\30\3\2\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b!\3\2\2\2\n/\3\2\2\2"+
		"\fB\3\2\2\2\16N\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24t\3\2\2\2\26\31\5\n"+
		"\6\2\27\31\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\3\3\2\2\2\32\33\7+\2"+
		"\2\33\34\7\3\2\2\34\5\3\2\2\2\35\36\t\2\2\2\36\7\3\2\2\2\37\"\5\16\b\2"+
		" \"\7\36\2\2!\37\3\2\2\2! \3\2\2\2\"\t\3\2\2\2#$\b\6\1\2$%\7\6\2\2%&\5"+
		"\n\6\2&\'\7\7\2\2\'\60\3\2\2\2()\7\4\2\2)*\5\n\6\2*+\7\5\2\2+\60\3\2\2"+
		"\2,-\7+\2\2-\60\5\n\6\7.\60\5\f\7\2/#\3\2\2\2/(\3\2\2\2/,\3\2\2\2/.\3"+
		"\2\2\2\60<\3\2\2\2\61\62\f\5\2\2\62\63\7\t\2\2\63;\5\n\6\6\64\65\f\3\2"+
		"\2\65;\5\n\6\4\66\67\f\b\2\2\67;\5\6\4\289\f\6\2\29;\7,\2\2:\61\3\2\2"+
		"\2:\64\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13"+
		"\3\2\2\2><\3\2\2\2?C\5\24\13\2@C\5\b\5\2AC\5\20\t\2B?\3\2\2\2B@\3\2\2"+
		"\2BA\3\2\2\2C\r\3\2\2\2DE\b\b\1\2EF\7\6\2\2FG\5\16\b\2GH\7\7\2\2HO\3\2"+
		"\2\2IJ\7+\2\2JO\5\16\b\7KL\7+\2\2LO\7\3\2\2MO\7\35\2\2ND\3\2\2\2NI\3\2"+
		"\2\2NK\3\2\2\2NM\3\2\2\2OW\3\2\2\2PQ\f\5\2\2QV\5\16\b\6RS\f\4\2\2ST\7"+
		"\b\2\2TV\5\16\b\5UP\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17"+
		"\3\2\2\2YW\3\2\2\2Z[\7\34\2\2[\21\3\2\2\2\\]\t\3\2\2]\23\3\2\2\2^u\5\22"+
		"\n\2_u\7*\2\2`u\7\21\2\2au\7\22\2\2bu\7\23\2\2cu\7\24\2\2du\7\25\2\2e"+
		"u\7\26\2\2fu\7\27\2\2gu\7\30\2\2hu\7\31\2\2iu\7\32\2\2ju\7\33\2\2ku\7"+
		"+\2\2lu\7,\2\2mu\7-\2\2nu\7.\2\2ou\7/\2\2pu\7\60\2\2qu\7\61\2\2ru\7\62"+
		"\2\2su\7\63\2\2t^\3\2\2\2t_\3\2\2\2t`\3\2\2\2ta\3\2\2\2tb\3\2\2\2tc\3"+
		"\2\2\2td\3\2\2\2te\3\2\2\2tf\3\2\2\2tg\3\2\2\2th\3\2\2\2ti\3\2\2\2tj\3"+
		"\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3"+
		"\2\2\2tr\3\2\2\2ts\3\2\2\2u\25\3\2\2\2\f\30!/:<BNUWt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}