// Generated from app/src/main/regex2english.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class regex2englishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARET=1, LETTER=2, EXTRA_LETTER_ALLOWED_INSIDE=3, LETTER_RANGE=4, NUMBER_RANGE=5, 
		DOUBLE_AMPERSAND=6, PIPE_ESCAPED=7, BACKSLASH_ESCAPED=8, LPAREN_ESCAPED=9, 
		RPAREN_ESCAPED=10, LBRACKET_ESCAPED=11, RBRACKET_ESCAPED=12, DOT_ESCAPED=13, 
		CARET_ESCAPED=14, QMARK_ESCAPED=15, ASTERISK_ESCAPED=16, DOLLAR_SIGN_ESCAPED=17, 
		HYPHEN_ESCAPED=18, LBRACKET=19, RBRACKET=20, LPAREN=21, RPAREN=22, RANGE_QUANTIFIER=23, 
		MIN_QUANTIFIER=24, PLUS=25, ASTERISK=26, QMARK=27, PIPE=28, BACKSLASH=29, 
		OCTAL_1=30, OCTAL_2=31, OCTAL_3=32, HEXA_2=33, HEXA_4=34, CODE_POINT=35, 
		CARRIAGE_RETURN=36, TAB=37, FORM_FEED=38, ALERT=39, ESC=40, WILDCARD=41, 
		DIGIT=42, NON_DIGIT=43, HORIZONTAL_WS=44, NON_HORIZONTAL_WS=45, WS=46, 
		NON_WS=47, VERTICAL_WS=48, NON_VERTICAL_WS=49, WORD=50, NON_WORD=51, DOLLAR_SIGN=52, 
		WORD_BOUNDARY=53, NON_WORD_BOUNDARY=54, INPUT_START=55, END_OF_MATCH=56, 
		INPUT_END=57, INPUT_END_INC_NEWLINE=58, LINEBREAK_MATCHER=59, LOWERCASE_PO6=60, 
		UPPERCASE_PO6=61, ASCII_PO6=62, ALPHA_PO6=63, NUM_PO6=64, ALNUM_PO6=65, 
		PUNCT_PO6=66, GLYPH_PO6=67, PRINTABLE_PO6=68, BLANK_PO6=69, CTRL_PO6=70, 
		HEXADECIMAL_PO6=71, WS_PO6=72, CHAR_CLASS_LC=73, CHAR_CLASS_UC=74, CHAR_CLASS_WS=75, 
		CHAR_CLASS_MIRRORED=76, UNICODE_CLASS_LATIN=77, UNICODE_CLASS_GREEK=78, 
		UNICODE_CLASS_UC=79, UNICODE_CLASS_ALPHA=80, UNICODE_CLASS_CURR=81, UNICODE_CLASS_NOT_GREEK=82, 
		UNICODE_CLASS_NOT_UC=83, NEWLINE_REF=84, NAMED_CAPTURE_GROUP_MATCH=85;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_group = 3, RULE_characterClass = 4, 
		RULE_characterClassHelper = 5, RULE_escapedToLiteralInsideCharClass = 6, 
		RULE_predefinedCharacterClass = 7, RULE_quantifier = 8, RULE_back_reference = 9, 
		RULE_boundary_matcher = 10, RULE_escapedFromLiteral = 11, RULE_escapedToLiteralOutsideCharClass = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "group", "characterClass", "characterClassHelper", 
			"escapedToLiteralInsideCharClass", "predefinedCharacterClass", "quantifier", 
			"back_reference", "boundary_matcher", "escapedFromLiteral", "escapedToLiteralOutsideCharClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", null, null, null, null, "'&&'", "'\\|'", "'\\\\'", "'\\('", 
			"'\\)'", "'\\]'", "'\\['", "'\\.'", "'\\^'", "'\\?'", "'\\*'", "'\\$'", 
			"'\\-'", "'['", "']'", "'('", "')'", null, null, "'+'", "'*'", "'?'", 
			"'|'", "'\\'", null, null, null, null, null, null, "'\\r'", "'\\t'", 
			"'\\f'", "'\\a'", "'\\e'", "'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", 
			"'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", "'$'", "'\\b'", 
			"'\\B'", "'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'R'", "'\\p{Lower}'", "'\\p{Upper}'", 
			"'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", 
			"'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", 
			"'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LETTER_RANGE", 
			"NUMBER_RANGE", "DOUBLE_AMPERSAND", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "RANGE_QUANTIFIER", "MIN_QUANTIFIER", "PLUS", "ASTERISK", "QMARK", 
			"PIPE", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", 
			"CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", 
			"WILDCARD", "DIGIT", "NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", 
			"WS", "NON_WS", "VERTICAL_WS", "NON_VERTICAL_WS", "WORD", "NON_WORD", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "LOWERCASE_PO6", 
			"UPPERCASE_PO6", "ASCII_PO6", "ALPHA_PO6", "NUM_PO6", "ALNUM_PO6", "PUNCT_PO6", 
			"GLYPH_PO6", "PRINTABLE_PO6", "BLANK_PO6", "CTRL_PO6", "HEXADECIMAL_PO6", 
			"WS_PO6", "CHAR_CLASS_LC", "CHAR_CLASS_UC", "CHAR_CLASS_WS", "CHAR_CLASS_MIRRORED", 
			"UNICODE_CLASS_LATIN", "UNICODE_CLASS_GREEK", "UNICODE_CLASS_UC", "UNICODE_CLASS_ALPHA", 
			"UNICODE_CLASS_CURR", "UNICODE_CLASS_NOT_GREEK", "UNICODE_CLASS_NOT_UC", 
			"NEWLINE_REF", "NAMED_CAPTURE_GROUP_MATCH"
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public List<TerminalNode> LETTER() { return getTokens(regex2englishParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(regex2englishParser.LETTER, i);
		}
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public Back_referenceContext back_reference() {
			return getRuleContext(Back_referenceContext.class,0);
		}
		public Boundary_matcherContext boundary_matcher() {
			return getRuleContext(Boundary_matcherContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				escapedToLiteralOutsideCharClass();
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(29);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(33);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(38);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(LBRACKET);
				setState(43);
				characterClass();
				setState(44);
				match(RBRACKET);
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				group();
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(50);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				back_reference();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(55);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				boundary_matcher();
				setState(60);
				expr();
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(61);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprHelperContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Boundary_matcherContext boundary_matcher() {
			return getRuleContext(Boundary_matcherContext.class,0);
		}
		public ExprHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprHelper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterExprHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitExprHelper(this);
		}
	}

	public final ExprHelperContext exprHelper() throws RecognitionException {
		ExprHelperContext _localctx = new ExprHelperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprHelper);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				quantifier();
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(68);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				expr();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(73);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				boundary_matcher();
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(78);
					exprHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(DOLLAR_SIGN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterClassContext extends ParserRuleContext {
		public List<TerminalNode> CARET() { return getTokens(regex2englishParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(regex2englishParser.CARET, i);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public CharacterClassHelperContext characterClassHelper() {
			return getRuleContext(CharacterClassHelperContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(regex2englishParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() {
			return getRuleContext(EscapedToLiteralInsideCharClassContext.class,0);
		}
		public List<TerminalNode> LETTER_RANGE() { return getTokens(regex2englishParser.LETTER_RANGE); }
		public TerminalNode LETTER_RANGE(int i) {
			return getToken(regex2englishParser.LETTER_RANGE, i);
		}
		public List<TerminalNode> NUMBER_RANGE() { return getTokens(regex2englishParser.NUMBER_RANGE); }
		public TerminalNode NUMBER_RANGE(int i) {
			return getToken(regex2englishParser.NUMBER_RANGE, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(regex2englishParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(regex2englishParser.LETTER, i);
		}
		public List<TerminalNode> EXTRA_LETTER_ALLOWED_INSIDE() { return getTokens(regex2englishParser.EXTRA_LETTER_ALLOWED_INSIDE); }
		public TerminalNode EXTRA_LETTER_ALLOWED_INSIDE(int i) {
			return getToken(regex2englishParser.EXTRA_LETTER_ALLOWED_INSIDE, i);
		}
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterCharacterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitCharacterClass(this);
		}
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_characterClass);
		int _la;
		try {
			int _alt;
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(CARET);
				setState(87);
				characterClass();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(88);
					characterClassHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(LBRACKET);
				setState(93);
				characterClass();
				setState(94);
				match(RBRACKET);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(95);
					characterClassHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				escapedToLiteralInsideCharClass();
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(100);
					characterClassHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(110);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER_RANGE:
							{
							setState(104);
							match(LETTER_RANGE);
							}
							break;
						case NUMBER_RANGE:
							{
							setState(105);
							match(NUMBER_RANGE);
							}
							break;
						case CARET:
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(108);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LETTER:
							case EXTRA_LETTER_ALLOWED_INSIDE:
								{
								setState(106);
								_la = _input.LA(1);
								if ( !(_la==LETTER || _la==EXTRA_LETTER_ALLOWED_INSIDE) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								break;
							case CARET:
								{
								setState(107);
								match(CARET);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(112); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(114);
					characterClassHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterClassHelperContext extends ParserRuleContext {
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public CharacterClassHelperContext characterClassHelper() {
			return getRuleContext(CharacterClassHelperContext.class,0);
		}
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(regex2englishParser.DOUBLE_AMPERSAND, 0); }
		public CharacterClassHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassHelper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterCharacterClassHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitCharacterClassHelper(this);
		}
	}

	public final CharacterClassHelperContext characterClassHelper() throws RecognitionException {
		CharacterClassHelperContext _localctx = new CharacterClassHelperContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_characterClassHelper);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARET:
			case LETTER:
			case EXTRA_LETTER_ALLOWED_INSIDE:
			case LETTER_RANGE:
			case NUMBER_RANGE:
			case BACKSLASH_ESCAPED:
			case LPAREN_ESCAPED:
			case LBRACKET_ESCAPED:
			case RBRACKET_ESCAPED:
			case DOLLAR_SIGN_ESCAPED:
			case HYPHEN_ESCAPED:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				characterClass();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(121);
					characterClassHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(DOUBLE_AMPERSAND);
				setState(126);
				characterClass();
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(127);
					characterClassHelper();
					}
					break;
				case 2:
					{
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscapedToLiteralInsideCharClassContext extends ParserRuleContext {
		public TerminalNode BACKSLASH_ESCAPED() { return getToken(regex2englishParser.BACKSLASH_ESCAPED, 0); }
		public TerminalNode LPAREN_ESCAPED() { return getToken(regex2englishParser.LPAREN_ESCAPED, 0); }
		public TerminalNode RBRACKET_ESCAPED() { return getToken(regex2englishParser.RBRACKET_ESCAPED, 0); }
		public TerminalNode LBRACKET_ESCAPED() { return getToken(regex2englishParser.LBRACKET_ESCAPED, 0); }
		public TerminalNode DOLLAR_SIGN_ESCAPED() { return getToken(regex2englishParser.DOLLAR_SIGN_ESCAPED, 0); }
		public TerminalNode HYPHEN_ESCAPED() { return getToken(regex2englishParser.HYPHEN_ESCAPED, 0); }
		public EscapedToLiteralInsideCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedToLiteralInsideCharClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterEscapedToLiteralInsideCharClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitEscapedToLiteralInsideCharClass(this);
		}
	}

	public final EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() throws RecognitionException {
		EscapedToLiteralInsideCharClassContext _localctx = new EscapedToLiteralInsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 400128L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterPredefinedCharacterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitPredefinedCharacterClass(this);
		}
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3938450650693632L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public TerminalNode MIN_QUANTIFIER() { return getToken(regex2englishParser.MIN_QUANTIFIER, 0); }
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Back_referenceContext extends ParserRuleContext {
		public TerminalNode NEWLINE_REF() { return getToken(regex2englishParser.NEWLINE_REF, 0); }
		public TerminalNode NAMED_CAPTURE_GROUP_MATCH() { return getToken(regex2englishParser.NAMED_CAPTURE_GROUP_MATCH, 0); }
		public Back_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterBack_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitBack_reference(this);
		}
	}

	public final Back_referenceContext back_reference() throws RecognitionException {
		Back_referenceContext _localctx = new Back_referenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_back_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE_REF || _la==NAMED_CAPTURE_GROUP_MATCH) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boundary_matcherContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public TerminalNode WORD_BOUNDARY() { return getToken(regex2englishParser.WORD_BOUNDARY, 0); }
		public TerminalNode NON_WORD_BOUNDARY() { return getToken(regex2englishParser.NON_WORD_BOUNDARY, 0); }
		public TerminalNode INPUT_START() { return getToken(regex2englishParser.INPUT_START, 0); }
		public TerminalNode END_OF_MATCH() { return getToken(regex2englishParser.END_OF_MATCH, 0); }
		public TerminalNode INPUT_END() { return getToken(regex2englishParser.INPUT_END, 0); }
		public TerminalNode INPUT_END_INC_NEWLINE() { return getToken(regex2englishParser.INPUT_END_INC_NEWLINE, 0); }
		public Boundary_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundary_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterBoundary_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitBoundary_matcher(this);
		}
	}

	public final Boundary_matcherContext boundary_matcher() throws RecognitionException {
		Boundary_matcherContext _localctx = new Boundary_matcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boundary_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957152676052994L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterEscapedFromLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitEscapedFromLiteral(this);
		}
	}

	public final EscapedFromLiteralContext escapedFromLiteral() throws RecognitionException {
		EscapedFromLiteralContext _localctx = new EscapedFromLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escapedFromLiteral);
		try {
			setState(164);
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
				setState(143);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(156);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(157);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(158);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(159);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(160);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(161);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(162);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(163);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).enterEscapedToLiteralOutsideCharClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regex2englishListener ) ((regex2englishListener)listener).exitEscapedToLiteralOutsideCharClass(this);
		}
	}

	public final EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() throws RecognitionException {
		EscapedToLiteralOutsideCharClassContext _localctx = new EscapedToLiteralOutsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 262016L) != 0)) ) {
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
		"\u0004\u0001U\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001 \b\u0001\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001\f\u0001"+
		"$\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002Q\b\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0004\u0004"+
		"o\b\u0004\u000b\u0004\f\u0004p\u0001\u0004\u0001\u0004\u0003\u0004u\b"+
		"\u0004\u0003\u0004w\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005|\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0082\b\u0005\u0003\u0005\u0084\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0007\u0001\u0000\u0002\u0003\u0003\u0000"+
		"\b\t\u000b\f\u0011\u0012\u0002\u0000)023\u0001\u0000\u0017\u001b\u0001"+
		"\u0000TU\u0002\u0000\u0001\u00014:\u0001\u0000\u0007\u0011\u00ce\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004R\u0001"+
		"\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000"+
		"\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000"+
		"\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000"+
		"\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000\u0000"+
		"\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0003\u0018\f\u0000\u001d \u0003\u0004\u0002\u0000\u001e"+
		" \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 B\u0001\u0000\u0000\u0000!#\u0005\u0002\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&)\u0003"+
		"\u0004\u0002\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000)B\u0001\u0000\u0000\u0000*+\u0005\u0013\u0000"+
		"\u0000+,\u0003\b\u0004\u0000,/\u0005\u0014\u0000\u0000-0\u0003\u0004\u0002"+
		"\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000"+
		"\u0000\u00000B\u0001\u0000\u0000\u000014\u0003\u0006\u0003\u000025\u0003"+
		"\u0004\u0002\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u00005B\u0001\u0000\u0000\u000069\u0003\u0012\t\u0000"+
		"7:\u0003\u0004\u0002\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:B\u0001\u0000\u0000\u0000;<\u0003\u0014"+
		"\n\u0000<?\u0003\u0002\u0001\u0000=@\u0003\u0004\u0002\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A\u001c\u0001\u0000\u0000\u0000A\"\u0001\u0000\u0000"+
		"\u0000A*\u0001\u0000\u0000\u0000A1\u0001\u0000\u0000\u0000A6\u0001\u0000"+
		"\u0000\u0000A;\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000"+
		"CF\u0003\u0010\b\u0000DG\u0003\u0004\u0002\u0000EG\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GS\u0001\u0000\u0000"+
		"\u0000HK\u0003\u0002\u0001\u0000IL\u0003\u0004\u0002\u0000JL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LS\u0001"+
		"\u0000\u0000\u0000MP\u0003\u0014\n\u0000NQ\u0003\u0004\u0002\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RC\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000"+
		"\u0000RM\u0001\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0005"+
		"4\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000"+
		"WZ\u0003\b\u0004\u0000X[\u0003\n\u0005\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[w\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0013\u0000\u0000]^\u0003\b\u0004\u0000^a\u0005\u0014"+
		"\u0000\u0000_b\u0003\n\u0005\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000bw\u0001\u0000\u0000\u0000cf\u0003"+
		"\f\u0006\u0000dg\u0003\n\u0005\u0000eg\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gw\u0001\u0000\u0000\u0000"+
		"ho\u0005\u0004\u0000\u0000io\u0005\u0005\u0000\u0000jm\u0007\u0000\u0000"+
		"\u0000km\u0005\u0001\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000ni\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000ru\u0003\n\u0005\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vV\u0001\u0000"+
		"\u0000\u0000v\\\u0001\u0000\u0000\u0000vc\u0001\u0000\u0000\u0000vn\u0001"+
		"\u0000\u0000\u0000w\t\u0001\u0000\u0000\u0000x{\u0003\b\u0004\u0000y|"+
		"\u0003\n\u0005\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u0084\u0001\u0000\u0000\u0000}~\u0005\u0006"+
		"\u0000\u0000~\u0081\u0003\b\u0004\u0000\u007f\u0082\u0003\n\u0005\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083x\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0084\u000b"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0001\u0000\u0000\u0086\r\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\u0002\u0000\u0000\u0088\u000f\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0007\u0003\u0000\u0000\u008a\u0011\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0007\u0004\u0000\u0000\u008c\u0013\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0007\u0005\u0000\u0000\u008e\u0015\u0001"+
		"\u0000\u0000\u0000\u008f\u00a5\u0003\u000e\u0007\u0000\u0090\u00a5\u0005"+
		"\u001e\u0000\u0000\u0091\u00a5\u0005\u001f\u0000\u0000\u0092\u00a5\u0005"+
		" \u0000\u0000\u0093\u00a5\u0005!\u0000\u0000\u0094\u00a5\u0005\"\u0000"+
		"\u0000\u0095\u00a5\u0005#\u0000\u0000\u0096\u00a5\u0005$\u0000\u0000\u0097"+
		"\u00a5\u0005%\u0000\u0000\u0098\u00a5\u0005&\u0000\u0000\u0099\u00a5\u0005"+
		"\'\u0000\u0000\u009a\u00a5\u0005(\u0000\u0000\u009b\u00a5\u0005\u0001"+
		"\u0000\u0000\u009c\u00a5\u00054\u0000\u0000\u009d\u00a5\u00055\u0000\u0000"+
		"\u009e\u00a5\u00056\u0000\u0000\u009f\u00a5\u00057\u0000\u0000\u00a0\u00a5"+
		"\u00058\u0000\u0000\u00a1\u00a5\u00059\u0000\u0000\u00a2\u00a5\u0005:"+
		"\u0000\u0000\u00a3\u00a5\u0005;\u0000\u0000\u00a4\u008f\u0001\u0000\u0000"+
		"\u0000\u00a4\u0090\u0001\u0000\u0000\u0000\u00a4\u0091\u0001\u0000\u0000"+
		"\u0000\u00a4\u0092\u0001\u0000\u0000\u0000\u00a4\u0093\u0001\u0000\u0000"+
		"\u0000\u00a4\u0094\u0001\u0000\u0000\u0000\u00a4\u0095\u0001\u0000\u0000"+
		"\u0000\u00a4\u0096\u0001\u0000\u0000\u0000\u00a4\u0097\u0001\u0000\u0000"+
		"\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000"+
		"\u0000\u00a4\u009a\u0001\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000"+
		"\u0000\u00a4\u009c\u0001\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000"+
		"\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0006\u0000"+
		"\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u0018\u001f$(/49?AFKPRZafl"+
		"nptv{\u0081\u0083\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}