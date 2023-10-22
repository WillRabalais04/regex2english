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
	public static final int
		RULE_start = 0, RULE_characterClass = 1, RULE_characterClassHelper = 2, 
		RULE_escapedToLiteralInsideCharClass = 3, RULE_predefinedCharacterClass = 4, 
		RULE_escapedFromLiteral = 5, RULE_escapedToLiteralOutsideCharClass = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "characterClass", "characterClassHelper", "escapedToLiteralInsideCharClass", 
			"predefinedCharacterClass", "escapedFromLiteral", "escapedToLiteralOutsideCharClass"
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
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			characterClass();
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
		public List<TerminalNode> LETTERS_INSIDE_CHAR_CLASS() { return getTokens(regex2englishParser.LETTERS_INSIDE_CHAR_CLASS); }
		public TerminalNode LETTERS_INSIDE_CHAR_CLASS(int i) {
			return getToken(regex2englishParser.LETTERS_INSIDE_CHAR_CLASS, i);
		}
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_characterClass);
		int _la;
		try {
			int _alt;
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(CARET);
				setState(17);
				characterClass();
				setState(20);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18);
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
				setState(22);
				match(LBRACKET);
				setState(23);
				characterClass();
				setState(24);
				match(RBRACKET);
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(25);
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
				setState(29);
				escapedToLiteralInsideCharClass();
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(30);
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
				setState(37); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(37);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER_RANGE:
							{
							setState(34);
							match(LETTER_RANGE);
							}
							break;
						case NUMBER_RANGE:
							{
							setState(35);
							match(NUMBER_RANGE);
							}
							break;
						case CARET:
						case LETTERS_INSIDE_CHAR_CLASS:
							{
							setState(36);
							_la = _input.LA(1);
							if ( !(_la==CARET || _la==LETTERS_INSIDE_CHAR_CLASS) ) {
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
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(39); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(41);
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
	}

	public final CharacterClassHelperContext characterClassHelper() throws RecognitionException {
		CharacterClassHelperContext _localctx = new CharacterClassHelperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_characterClassHelper);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARET:
			case LETTERS_INSIDE_CHAR_CLASS:
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
				setState(47);
				characterClass();
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(48);
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
				setState(52);
				match(DOUBLE_AMPERSAND);
				setState(53);
				characterClass();
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(54);
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
	}

	public final EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() throws RecognitionException {
		EscapedToLiteralInsideCharClassContext _localctx = new EscapedToLiteralInsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH_ESCAPED) | (1L << LPAREN_ESCAPED) | (1L << LBRACKET_ESCAPED) | (1L << RBRACKET_ESCAPED) | (1L << DOLLAR_SIGN_ESCAPED) | (1L << HYPHEN_ESCAPED))) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_predefinedCharacterClass);
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
		enterRule(_localctx, 10, RULE_escapedFromLiteral);
		try {
			setState(85);
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
				setState(64);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(74);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(75);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(76);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(77);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(78);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(79);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(80);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(81);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(82);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(83);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(84);
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
		enterRule(_localctx, 12, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\5\3"+
		"\27\n\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\5\3#\n\3\3\3\3\3\3"+
		"\3\6\3(\n\3\r\3\16\3)\3\3\3\3\5\3.\n\3\5\3\60\n\3\3\4\3\4\3\4\5\4\65\n"+
		"\4\3\4\3\4\3\4\3\4\5\4;\n\4\5\4=\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"X\n\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\6\3\2\3\4\5\2\t\n\f\r\22\23\4"+
		"\2+\62\64\65\3\2\b\22\2u\2\20\3\2\2\2\4/\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2"+
		"\n@\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\7"+
		"\3\2\2\23\26\5\4\3\2\24\27\5\6\4\2\25\27\3\2\2\2\26\24\3\2\2\2\26\25\3"+
		"\2\2\2\27\60\3\2\2\2\30\31\7\24\2\2\31\32\5\4\3\2\32\35\7\25\2\2\33\36"+
		"\5\6\4\2\34\36\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\60\3\2\2\2\37\""+
		"\5\b\5\2 #\5\6\4\2!#\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\60\3\2\2\2$(\7\5\2"+
		"\2%(\7\6\2\2&(\t\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*-\3\2\2\2+.\5\6\4\2,.\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\60"+
		"\3\2\2\2/\22\3\2\2\2/\30\3\2\2\2/\37\3\2\2\2/\'\3\2\2\2\60\5\3\2\2\2\61"+
		"\64\5\4\3\2\62\65\5\6\4\2\63\65\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65"+
		"=\3\2\2\2\66\67\7\7\2\2\67:\5\4\3\28;\5\6\4\29;\3\2\2\2:8\3\2\2\2:9\3"+
		"\2\2\2;=\3\2\2\2<\61\3\2\2\2<\66\3\2\2\2=\7\3\2\2\2>?\t\3\2\2?\t\3\2\2"+
		"\2@A\t\4\2\2A\13\3\2\2\2BX\5\n\6\2CX\7 \2\2DX\7!\2\2EX\7\"\2\2FX\7#\2"+
		"\2GX\7$\2\2HX\7%\2\2IX\7&\2\2JX\7\'\2\2KX\7(\2\2LX\7)\2\2MX\7*\2\2NX\7"+
		"\3\2\2OX\7\66\2\2PX\7\67\2\2QX\78\2\2RX\79\2\2SX\7:\2\2TX\7;\2\2UX\7<"+
		"\2\2VX\7=\2\2WB\3\2\2\2WC\3\2\2\2WD\3\2\2\2WE\3\2\2\2WF\3\2\2\2WG\3\2"+
		"\2\2WH\3\2\2\2WI\3\2\2\2WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2WN\3\2"+
		"\2\2WO\3\2\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2"+
		"\2\2WV\3\2\2\2X\r\3\2\2\2YZ\t\5\2\2Z\17\3\2\2\2\r\26\35\"\')-/\64:<W";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}