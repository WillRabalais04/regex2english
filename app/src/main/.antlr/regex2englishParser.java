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
	public static final int
		RULE_expr = 0, RULE_start = 1, RULE_notCharacterSequence = 2, RULE_rectangularBrackets = 3, 
		RULE_quantifier = 4, RULE_range = 5, RULE_letterRange = 6, RULE_character = 7, 
		RULE_characterClass = 8, RULE_characterSequence = 9, RULE_predefinedCharacterClass = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "start", "notCharacterSequence", "rectangularBrackets", "quantifier", 
			"range", "letterRange", "character", "characterClass", "characterSequence", 
			"predefinedCharacterClass"
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
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public CharacterSequenceContext characterSequence() {
			return getRuleContext(CharacterSequenceContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(23);
				match(LPAREN);
				setState(24);
				expr(0);
				setState(25);
				match(RPAREN);
				}
				break;
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
			case NUMBER:
			case LETTER:
				{
				setState(27);
				characterSequence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(31);
						match(PIPE);
						setState(32);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						match(ASTERISK);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						match(PLUS);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						match(QMARK);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class StartContext extends ParserRuleContext {
		public NotCharacterSequenceContext notCharacterSequence() {
			return getRuleContext(NotCharacterSequenceContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				notCharacterSequence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 4, RULE_notCharacterSequence);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case MIN_QUANTIFIER:
			case RANGE_QUANTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				quantifier();
				}
				break;
			case LETTER_RANGE:
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				range();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
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
		enterRule(_localctx, 6, RULE_rectangularBrackets);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(LBRACKET);
				setState(54);
				range();
				setState(55);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode MIN_QUANTIFIER() { return getToken(regex2englishParser.MIN_QUANTIFIER, 0); }
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantifier);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MIN_QUANTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(MIN_QUANTIFIER);
				}
				break;
			case RANGE_QUANTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(RANGE_QUANTIFIER);
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
		enterRule(_localctx, 10, RULE_range);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				letterRange();
				}
				break;
			case NUMBER_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
		enterRule(_localctx, 12, RULE_letterRange);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(LETTER_RANGE);
				setState(70);
				match(LETTER_RANGE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(LETTER_RANGE);
				setState(72);
				match(LBRACKET);
				setState(73);
				match(LETTER_RANGE);
				setState(74);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(LETTER_RANGE);
				setState(76);
				match(DOUBLE_AMPERSAND);
				setState(77);
				match(LBRACKET);
				setState(78);
				match(LETTER_RANGE);
				setState(79);
				match(RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(LETTER_RANGE);
				setState(81);
				match(DOUBLE_AMPERSAND);
				setState(82);
				match(LBRACKET);
				setState(83);
				characterSequence();
				setState(84);
				match(RBRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(LETTER_RANGE);
				setState(87);
				match(DOUBLE_AMPERSAND);
				setState(88);
				match(LBRACKET);
				setState(89);
				match(CARET);
				setState(90);
				match(LETTER_RANGE);
				setState(91);
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
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_character);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NUMBER);
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LETTER);
				}
				break;
			case BACKSLASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(BACKSLASH);
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 11);
				{
				setState(104);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 14);
				{
				setState(107);
				match(ESC);
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
				enterOuterAlt(_localctx, 15);
				{
				setState(108);
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

	public static class CharacterClassContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public CharacterSequenceContext characterSequence() {
			return getRuleContext(CharacterSequenceContext.class,0);
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
		enterRule(_localctx, 16, RULE_characterClass);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(LBRACKET);
				setState(112);
				characterSequence();
				setState(113);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(LBRACKET);
				setState(116);
				match(CARET);
				setState(117);
				characterSequence();
				setState(118);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(LBRACKET);
				setState(121);
				range();
				setState(122);
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

	public static class CharacterSequenceContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public CharacterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSequence; }
	}

	public final CharacterSequenceContext characterSequence() throws RecognitionException {
		CharacterSequenceContext _localctx = new CharacterSequenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_characterSequence);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				character();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				character();
				setState(128);
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
		enterRule(_localctx, 20, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\5"+
		"\7F\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\5\13\u0085\n\13"+
		"\3\f\3\f\3\f\2\3\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\35$&\'\2\u009e"+
		"\2\36\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2\fE\3\2\2"+
		"\2\16^\3\2\2\2\20o\3\2\2\2\22~\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2"+
		"\2\30\31\b\2\1\2\31\32\7\3\2\2\32\33\5\2\2\2\33\34\7\4\2\2\34\37\3\2\2"+
		"\2\35\37\5\24\13\2\36\30\3\2\2\2\36\35\3\2\2\2\37+\3\2\2\2 !\f\6\2\2!"+
		"\"\7\b\2\2\"*\5\2\2\7#$\f\7\2\2$*\7\n\2\2%&\f\5\2\2&*\7\f\2\2\'(\f\4\2"+
		"\2(*\7\13\2\2) \3\2\2\2)#\3\2\2\2)%\3\2\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2.\61\5\6\4\2/\61\3\2\2\2\60.\3\2\2"+
		"\2\60/\3\2\2\2\61\5\3\2\2\2\62\66\5\n\6\2\63\66\5\f\7\2\64\66\5\22\n\2"+
		"\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\7\5\2\289"+
		"\5\f\7\29:\7\6\2\2:=\3\2\2\2;=\5\22\n\2<\67\3\2\2\2<;\3\2\2\2=\t\3\2\2"+
		"\2>B\3\2\2\2?B\7\r\2\2@B\7\16\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3"+
		"\2\2\2CF\5\16\b\2DF\7\34\2\2EC\3\2\2\2ED\3\2\2\2F\r\3\2\2\2GH\7\33\2\2"+
		"H_\7\33\2\2IJ\7\33\2\2JK\7\5\2\2KL\7\33\2\2L_\7\6\2\2MN\7\33\2\2NO\7\7"+
		"\2\2OP\7\5\2\2PQ\7\33\2\2Q_\7\6\2\2RS\7\33\2\2ST\7\7\2\2TU\7\5\2\2UV\5"+
		"\24\13\2VW\7\6\2\2W_\3\2\2\2XY\7\33\2\2YZ\7\7\2\2Z[\7\5\2\2[\\\7(\2\2"+
		"\\]\7\33\2\2]_\7\6\2\2^G\3\2\2\2^I\3\2\2\2^M\3\2\2\2^R\3\2\2\2^X\3\2\2"+
		"\2_\17\3\2\2\2`p\7\61\2\2ap\7\62\2\2bp\7\17\2\2cp\7\20\2\2dp\7\21\2\2"+
		"ep\7\22\2\2fp\7\23\2\2gp\7\24\2\2hp\7\25\2\2ip\7\26\2\2jp\7\27\2\2kp\7"+
		"\30\2\2lp\7\31\2\2mp\7\32\2\2np\5\26\f\2o`\3\2\2\2oa\3\2\2\2ob\3\2\2\2"+
		"oc\3\2\2\2od\3\2\2\2oe\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2"+
		"oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\21\3\2\2\2qr\7\5\2"+
		"\2rs\5\24\13\2st\7\6\2\2t\177\3\2\2\2uv\7\5\2\2vw\7(\2\2wx\5\24\13\2x"+
		"y\7\6\2\2y\177\3\2\2\2z{\7\5\2\2{|\5\f\7\2|}\7\6\2\2}\177\3\2\2\2~q\3"+
		"\2\2\2~u\3\2\2\2~z\3\2\2\2\177\23\3\2\2\2\u0080\u0085\5\20\t\2\u0081\u0082"+
		"\5\20\t\2\u0082\u0083\5\20\t\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2"+
		"\u0084\u0081\3\2\2\2\u0085\25\3\2\2\2\u0086\u0087\t\2\2\2\u0087\27\3\2"+
		"\2\2\16\36)+\60\65<AE^o~\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}