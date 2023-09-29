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
		T__0=1, LPAREN=2, RPAREN=3, LBRACKET=4, RBRACKET=5, DOUBLE_AMPERSAND=6, 
		PIPE=7, CAPTURE_GROUP=8, ASTERISK=9, QMARK=10, PLUS=11, MIN_QUANTIFIER=12, 
		RANGE_QUANTIFIER=13, BACKSLASH=14, OCTAL_1=15, OCTAL_2=16, OCTAL_3=17, 
		HEXA_2=18, HEXA_4=19, CODE_POINT=20, CARRIAGE_RETURN=21, TAB=22, FORM_FEED=23, 
		ALERT=24, ESC=25, ALPHANUM=26, LETTER_RANGE=27, NUMBER_RANGE=28, WILDCARD=29, 
		DIGIT=30, NON_DIGIT=31, HORIZONTAL_WS=32, NON_HORIZONTAL_WS=33, WS=34, 
		NON_WS=35, VERTICAL_WS=36, NON_VERTICAL_WS=37, WORD=38, NON_WORD=39, CARET=40, 
		DOLLAR_SIGN=41, WORD_BOUNDARY=42, NON_WORD_BOUNDARY=43, INPUT_START=44, 
		END_OF_MATCH=45, INPUT_END=46, INPUT_END_INC_NEWLINE=47, LINEBREAK_MATCHER=48, 
		NUMBER=49, LETTER=50, LOWERCASE_PO6=51, UPPERCASE_PO6=52, ASCII_PO6=53, 
		ALPHA_PO6=54, NUM_PO6=55, ALNUM_PO6=56, PUNCT_PO6=57, GLYPH_PO6=58, PRINTABLE_PO6=59, 
		BLANK_PO6=60, CTRL_PO6=61, HEXADECIMAL_PO6=62, WS_PO6=63, CHAR_CLASS_LC=64, 
		CHAR_CLASS_UC=65, CHAR_CLASS_WS=66, CHAR_CLASS_MIRRORED=67, UNICODE_CLASS_LATIN=68, 
		UNICODE_CLASS_GREEK=69, UNICODE_CLASS_UC=70, UNICODE_CLASS_ALPHA=71, UNICODE_CLASS_CURR=72, 
		UNICODE_CLASS_NOT_GREEK=73, UNICODE_CLASS_NOT_UC=74;
	public static final int
		RULE_start = 0, RULE_notCharacterSequence = 1, RULE_rectangularBrackets = 2, 
		RULE_quantifier = 3, RULE_range = 4, RULE_expr = 5, RULE_characterClass = 6, 
		RULE_letterRange = 7, RULE_character = 8, RULE_characterSequence = 9, 
		RULE_predefinedCharacterClass = 10, RULE_escapedLiteral = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "notCharacterSequence", "rectangularBrackets", "quantifier", 
			"range", "expr", "characterClass", "letterRange", "character", "characterSequence", 
			"predefinedCharacterClass", "escapedLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\.'", "'('", "')'", "'['", "']'", "'&&'", "'|'", null, "'*'", 
			"'?'", "'+'", null, null, "'\\'", null, null, null, null, null, null, 
			"'r'", "'t'", "'f'", "'a'", "'e'", null, null, null, "'.'", "'\\d'", 
			"'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", 
			"'\\W'", "'^'", "'$'", "'b'", "'B'", "'A'", "'G'", "'z'", "'Z'", "'R'", 
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
			null, null, "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "DOUBLE_AMPERSAND", 
			"PIPE", "CAPTURE_GROUP", "ASTERISK", "QMARK", "PLUS", "MIN_QUANTIFIER", 
			"RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", 
			"HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", 
			"ESC", "ALPHANUM", "LETTER_RANGE", "NUMBER_RANGE", "WILDCARD", "DIGIT", 
			"NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LPAREN:
			case LBRACKET:
			case BACKSLASH:
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
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
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

	public static class NotCharacterSequenceContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public NotCharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notCharacterSequence; }
	}

	public final NotCharacterSequenceContext notCharacterSequence() throws RecognitionException {
		NotCharacterSequenceContext _localctx = new NotCharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_notCharacterSequence);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				quantifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				characterClass();
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

	public static class RectangularBracketsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public RectangularBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangularBrackets; }
	}

	public final RectangularBracketsContext rectangularBrackets() throws RecognitionException {
		RectangularBracketsContext _localctx = new RectangularBracketsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rectangularBrackets);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(LBRACKET);
				setState(34);
				range();
				setState(35);
				match(RBRACKET);
				}
				break;
			case T__0:
			case BACKSLASH:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				characterClass();
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
			setState(40);
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
		enterRule(_localctx, 8, RULE_range);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				letterRange();
				}
				break;
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(47);
				match(LBRACKET);
				setState(48);
				expr(0);
				setState(49);
				match(RBRACKET);
				}
				break;
			case LPAREN:
				{
				setState(51);
				match(LPAREN);
				setState(52);
				expr(0);
				setState(53);
				match(RPAREN);
				}
				break;
			case CARET:
				{
				setState(55);
				match(CARET);
				setState(56);
				expr(5);
				}
				break;
			case T__0:
			case BACKSLASH:
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
				{
				setState(57);
				characterClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						match(PIPE);
						setState(62);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(64);
						expr(2);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(66);
						quantifier();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						match(DOLLAR_SIGN);
						}
						break;
					}
					} 
				}
				setState(73);
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
		enterRule(_localctx, 12, RULE_characterClass);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BACKSLASH:
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
				setState(74);
				escapedLiteral();
				}
				break;
			case LETTER_RANGE:
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				range();
				}
				break;
			case ALPHANUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				characterSequence();
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

	public static class LetterRangeContext extends ParserRuleContext {
		public List<TerminalNode> LETTER_RANGE() { return getTokens(regex2englishParser.LETTER_RANGE); }
		public TerminalNode LETTER_RANGE(int i) {
			return getToken(regex2englishParser.LETTER_RANGE, i);
		}
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(regex2englishParser.DOUBLE_AMPERSAND, 0); }
		public CharacterSequenceContext characterSequence() {
			return getRuleContext(CharacterSequenceContext.class,0);
		}
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public LetterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterRange; }
	}

	public final LetterRangeContext letterRange() throws RecognitionException {
		LetterRangeContext _localctx = new LetterRangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letterRange);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LETTER_RANGE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(LETTER_RANGE);
				setState(81);
				match(LBRACKET);
				setState(82);
				match(LETTER_RANGE);
				setState(83);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(LETTER_RANGE);
				setState(85);
				match(DOUBLE_AMPERSAND);
				setState(86);
				match(LBRACKET);
				setState(87);
				match(LETTER_RANGE);
				setState(88);
				match(RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(LETTER_RANGE);
				setState(90);
				match(DOUBLE_AMPERSAND);
				setState(91);
				match(LBRACKET);
				setState(92);
				characterSequence();
				setState(93);
				match(RBRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(LETTER_RANGE);
				setState(96);
				match(DOUBLE_AMPERSAND);
				setState(97);
				match(LBRACKET);
				setState(98);
				match(CARET);
				setState(99);
				match(LETTER_RANGE);
				setState(100);
				match(RBRACKET);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(regex2englishParser.NUMBER, 0); }
		public TerminalNode LETTER() { return getToken(regex2englishParser.LETTER, 0); }
		public TerminalNode BACKSLASH() { return getToken(regex2englishParser.BACKSLASH, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH) | (1L << NUMBER) | (1L << LETTER))) != 0)) ) {
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
		public TerminalNode ALPHANUM() { return getToken(regex2englishParser.ALPHANUM, 0); }
		public CharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSequence; }
	}

	public final CharacterSequenceContext characterSequence() throws RecognitionException {
		CharacterSequenceContext _localctx = new CharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_characterSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 20, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 22, RULE_escapedLiteral);
		int _la;
		try {
			setState(115);
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
				setState(109);
				predefinedCharacterClass();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__0);
				}
				break;
			case BACKSLASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(BACKSLASH);
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(112);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL_1) | (1L << OCTAL_2) | (1L << OCTAL_3) | (1L << HEXA_2) | (1L << HEXA_4) | (1L << CODE_POINT) | (1L << CARRIAGE_RETURN) | (1L << TAB) | (1L << FORM_FEED) | (1L << ALERT) | (1L << ESC) | (1L << CARET) | (1L << DOLLAR_SIGN) | (1L << WORD_BOUNDARY) | (1L << NON_WORD_BOUNDARY) | (1L << INPUT_START) | (1L << END_OF_MATCH) | (1L << INPUT_END) | (1L << INPUT_END_INC_NEWLINE) | (1L << LINEBREAK_MATCHER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Lx\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4)\n\4\3\5\3\5\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7H\n\7"+
		"\f\7\16\7K\13\7\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\th\n\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\rt\n\r\5\rv\n\r\3\r\2\3\f\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\13\17\4\2\20\20\63\64\4\2\37&()\4"+
		"\2\21\33*\62\2\u0080\2\34\3\2\2\2\4!\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n."+
		"\3\2\2\2\f<\3\2\2\2\16O\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26"+
		"m\3\2\2\2\30u\3\2\2\2\32\35\5\f\7\2\33\35\3\2\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\3\3\2\2\2\36\"\5\b\5\2\37\"\5\n\6\2 \"\5\16\b\2!\36\3\2\2"+
		"\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\6\2\2$%\5\n\6\2%&\7\7\2\2&)\3"+
		"\2\2\2\')\5\16\b\2(#\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\t\2\2\2+\t\3\2\2"+
		"\2,/\5\20\t\2-/\7\36\2\2.,\3\2\2\2.-\3\2\2\2/\13\3\2\2\2\60\61\b\7\1\2"+
		"\61\62\7\6\2\2\62\63\5\f\7\2\63\64\7\7\2\2\64=\3\2\2\2\65\66\7\4\2\2\66"+
		"\67\5\f\7\2\678\7\5\2\28=\3\2\2\29:\7*\2\2:=\5\f\7\7;=\5\16\b\2<\60\3"+
		"\2\2\2<\65\3\2\2\2<9\3\2\2\2<;\3\2\2\2=I\3\2\2\2>?\f\5\2\2?@\7\t\2\2@"+
		"H\5\f\7\6AB\f\3\2\2BH\5\f\7\4CD\f\b\2\2DH\5\b\5\2EF\f\6\2\2FH\7+\2\2G"+
		">\3\2\2\2GA\3\2\2\2GC\3\2\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"J\r\3\2\2\2KI\3\2\2\2LP\5\30\r\2MP\5\n\6\2NP\5\24\13\2OL\3\2\2\2OM\3\2"+
		"\2\2ON\3\2\2\2P\17\3\2\2\2Qh\7\35\2\2RS\7\35\2\2ST\7\6\2\2TU\7\35\2\2"+
		"Uh\7\7\2\2VW\7\35\2\2WX\7\b\2\2XY\7\6\2\2YZ\7\35\2\2Zh\7\7\2\2[\\\7\35"+
		"\2\2\\]\7\b\2\2]^\7\6\2\2^_\5\24\13\2_`\7\7\2\2`h\3\2\2\2ab\7\35\2\2b"+
		"c\7\b\2\2cd\7\6\2\2de\7*\2\2ef\7\35\2\2fh\7\7\2\2gQ\3\2\2\2gR\3\2\2\2"+
		"gV\3\2\2\2g[\3\2\2\2ga\3\2\2\2h\21\3\2\2\2ij\t\3\2\2j\23\3\2\2\2kl\7\34"+
		"\2\2l\25\3\2\2\2mn\t\4\2\2n\27\3\2\2\2ov\5\26\f\2pv\7\3\2\2qs\7\20\2\2"+
		"rt\t\5\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2\2up\3\2\2\2uq\3\2\2\2"+
		"v\31\3\2\2\2\r\34!(.<GIOgsu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}