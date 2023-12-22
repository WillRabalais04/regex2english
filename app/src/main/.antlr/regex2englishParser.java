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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, CARET=27, LETTER=28, EXTRA_LETTER_ALLOWED_INSIDE=29, 
		LETTER_RANGE=30, NUMBER_RANGE=31, DOUBLE_AMPERSAND=32, PIPE_ESCAPED=33, 
		BACKSLASH_ESCAPED=34, LPAREN_ESCAPED=35, RPAREN_ESCAPED=36, LBRACKET_ESCAPED=37, 
		RBRACKET_ESCAPED=38, DOT_ESCAPED=39, CARET_ESCAPED=40, QMARK_ESCAPED=41, 
		ASTERISK_ESCAPED=42, DOLLAR_SIGN_ESCAPED=43, HYPHEN_ESCAPED=44, DIGIT=45, 
		LBRACKET=46, RBRACKET=47, LPAREN=48, RPAREN=49, PIPE=50, BACKSLASH=51, 
		OCTAL_1=52, OCTAL_2=53, OCTAL_3=54, HEXA_2=55, HEXA_4=56, CODE_POINT=57, 
		CARRIAGE_RETURN=58, TAB=59, FORM_FEED=60, ALERT=61, ESC=62, DOLLAR_SIGN=63, 
		WORD_BOUNDARY=64, NON_WORD_BOUNDARY=65, INPUT_START=66, END_OF_MATCH=67, 
		INPUT_END=68, INPUT_END_INC_NEWLINE=69, LINEBREAK_MATCHER=70, POSIX=71, 
		NEWLINE_REF=72, NAMED_CAPTURE_GROUP_MATCH=73;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_group = 3, RULE_characterClass = 4, 
		RULE_characterClassHelper = 5, RULE_escapedToLiteralInsideCharClass = 6, 
		RULE_predefinedCharacterClass = 7, RULE_quantifier = 8, RULE_back_reference = 9, 
		RULE_boundary_matcher = 10, RULE_escapedFromLiteral = 11, RULE_escapedToLiteralOutsideCharClass = 12, 
		RULE_javalangCharacterClass = 13, RULE_unicodeScriptClass = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "group", "characterClass", "characterClassHelper", 
			"escapedToLiteralInsideCharClass", "predefinedCharacterClass", "quantifier", 
			"back_reference", "boundary_matcher", "escapedFromLiteral", "escapedToLiteralOutsideCharClass", 
			"javalangCharacterClass", "unicodeScriptClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'\\{[0-9]?,[0-9]?\\}'", "'\\{[0-9]?\\}'", "'+'", "'*'", 
			"'?'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'^'", null, null, null, null, "'&&'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", 
			"'\\]'", "'\\['", "'\\.'", "'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", 
			"'\\d'", "'['", "']'", "'('", "')'", "'|'", "'\\'", null, null, null, 
			null, null, null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", "'$'", 
			"'\\b'", "'\\B'", "'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'", null, 
			"'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LETTER_RANGE", 
			"NUMBER_RANGE", "DOUBLE_AMPERSAND", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "DIGIT", "LBRACKET", "RBRACKET", 
			"LPAREN", "RPAREN", "PIPE", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", 
			"HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", 
			"ALERT", "ESC", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", 
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
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
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
			setState(30);
			quantifier();
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				escapedToLiteralOutsideCharClass();
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(33);
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
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
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
				setState(46);
				match(LBRACKET);
				setState(47);
				characterClass();
				setState(48);
				match(RBRACKET);
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(49);
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
				setState(53);
				group();
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(54);
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
				setState(58);
				back_reference();
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(59);
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
				setState(63);
				boundary_matcher();
				setState(64);
				expr();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(65);
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
	}

	public final ExprHelperContext exprHelper() throws RecognitionException {
		ExprHelperContext _localctx = new ExprHelperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprHelper);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				quantifier();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(72);
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
				setState(76);
				expr();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(77);
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
				setState(81);
				boundary_matcher();
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(82);
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
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
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_characterClass);
		int _la;
		try {
			int _alt;
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(CARET);
				setState(91);
				characterClass();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(92);
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
				setState(96);
				match(LBRACKET);
				setState(97);
				characterClass();
				setState(98);
				match(RBRACKET);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(99);
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
				setState(103);
				escapedToLiteralInsideCharClass();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(104);
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
				setState(108);
				predefinedCharacterClass();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(109);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(119);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER_RANGE:
							{
							setState(113);
							match(LETTER_RANGE);
							}
							break;
						case NUMBER_RANGE:
							{
							setState(114);
							match(NUMBER_RANGE);
							}
							break;
						case CARET:
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(117);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LETTER:
							case EXTRA_LETTER_ALLOWED_INSIDE:
								{
								setState(115);
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
								setState(116);
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
					setState(121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(123);
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
		enterRule(_localctx, 10, RULE_characterClassHelper);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
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
			case DIGIT:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				characterClass();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(130);
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
				setState(134);
				match(DOUBLE_AMPERSAND);
				setState(135);
				characterClass();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(136);
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
		enterRule(_localctx, 12, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		public PredefinedCharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedCharacterClass; }
	 
		public PredefinedCharacterClassContext() { }
		public void copyFrom(PredefinedCharacterClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Non_wordContext extends PredefinedCharacterClassContext {
		public Non_wordContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Non_horizontal_whitespaceContext extends PredefinedCharacterClassContext {
		public Non_horizontal_whitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class WildcardContext extends PredefinedCharacterClassContext {
		public WildcardContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Non_vertical_whitespaceContext extends PredefinedCharacterClassContext {
		public Non_vertical_whitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Vertical_whitespaceContext extends PredefinedCharacterClassContext {
		public Vertical_whitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class WhitespaceContext extends PredefinedCharacterClassContext {
		public WhitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Non_digitContext extends PredefinedCharacterClassContext {
		public Non_digitContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Horizontal_whitespaceContext extends PredefinedCharacterClassContext {
		public Horizontal_whitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class WordContext extends PredefinedCharacterClassContext {
		public WordContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class Non_whitespaceContext extends PredefinedCharacterClassContext {
		public Non_whitespaceContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class DigitContext extends PredefinedCharacterClassContext {
		public TerminalNode DIGIT() { return getToken(regex2englishParser.DIGIT, 0); }
		public DigitContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predefinedCharacterClass);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new WildcardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__0);
				}
				break;
			case DIGIT:
				_localctx = new DigitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(DIGIT);
				}
				break;
			case T__1:
				_localctx = new Non_digitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new Horizontal_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new Non_horizontal_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new WhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new Non_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new Vertical_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new Non_vertical_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new Non_wordContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				match(T__9);
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
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	 
		public QuantifierContext() { }
		public void copyFrom(QuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RANGE_QUANTIFIERContext extends QuantifierContext {
		public RANGE_QUANTIFIERContext(QuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class MIN_QUANTIFIERContext extends QuantifierContext {
		public MIN_QUANTIFIERContext(QuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class QMARKContext extends QuantifierContext {
		public QMARKContext(QuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class ASTERISKContext extends QuantifierContext {
		public ASTERISKContext(QuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class PLUSContext extends QuantifierContext {
		public PLUSContext(QuantifierContext ctx) { copyFrom(ctx); }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantifier);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new RANGE_QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new MIN_QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new PLUSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new ASTERISKContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new QMARKContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(T__14);
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

	public static class Back_referenceContext extends ParserRuleContext {
		public TerminalNode NEWLINE_REF() { return getToken(regex2englishParser.NEWLINE_REF, 0); }
		public TerminalNode NAMED_CAPTURE_GROUP_MATCH() { return getToken(regex2englishParser.NAMED_CAPTURE_GROUP_MATCH, 0); }
		public Back_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_reference; }
	}

	public final Back_referenceContext back_reference() throws RecognitionException {
		Back_referenceContext _localctx = new Back_referenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_back_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
	}

	public final Boundary_matcherContext boundary_matcher() throws RecognitionException {
		Boundary_matcherContext _localctx = new Boundary_matcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boundary_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (CARET - 27)) | (1L << (DOLLAR_SIGN - 27)) | (1L << (WORD_BOUNDARY - 27)) | (1L << (NON_WORD_BOUNDARY - 27)) | (1L << (INPUT_START - 27)) | (1L << (END_OF_MATCH - 27)) | (1L << (INPUT_END - 27)) | (1L << (INPUT_END_INC_NEWLINE - 27)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_escapedFromLiteral);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(183);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(185);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(186);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(187);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(188);
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
		enterRule(_localctx, 24, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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

	public static class JavalangCharacterClassContext extends ParserRuleContext {
		public JavalangCharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javalangCharacterClass; }
	}

	public final JavalangCharacterClassContext javalangCharacterClass() throws RecognitionException {
		JavalangCharacterClassContext _localctx = new JavalangCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_javalangCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class UnicodeScriptClassContext extends ParserRuleContext {
		public UnicodeScriptClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeScriptClass; }
	}

	public final UnicodeScriptClassContext unicodeScriptClass() throws RecognitionException {
		UnicodeScriptClassContext _localctx = new UnicodeScriptClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unicodeScriptClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\66\n\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\3\3"+
		"\5\3F\n\3\5\3H\n\3\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\5\4R\n\4\3\4\3\4\3"+
		"\4\5\4W\n\4\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6h\n\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\5\6r\n\6\3\6\3\6\3\6\3"+
		"\6\5\6x\n\6\6\6z\n\6\r\6\16\6{\3\6\3\6\5\6\u0080\n\6\5\6\u0082\n\6\3\7"+
		"\3\7\3\7\5\7\u0087\n\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7\5\7\u008f\n\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009e\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c0\n"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\t\3\2\36\37\5\2$%\'(-.\3\2JK\4\2\35\35AG\3\2#-\3\2\22\25"+
		"\3\2\26\34\2\u00fb\2 \3\2\2\2\4G\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\u0081"+
		"\3\2\2\2\f\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u009d\3\2\2\2\22\u00a4\3"+
		"\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2"+
		"\2\2\34\u00c3\3\2\2\2\36\u00c5\3\2\2\2 !\5\22\n\2!\3\3\2\2\2\"%\5\32\16"+
		"\2#&\5\6\4\2$&\3\2\2\2%#\3\2\2\2%$\3\2\2\2&H\3\2\2\2\')\7\36\2\2(\'\3"+
		"\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,/\5\6\4\2-/\3\2\2\2.,\3"+
		"\2\2\2.-\3\2\2\2/H\3\2\2\2\60\61\7\60\2\2\61\62\5\n\6\2\62\65\7\61\2\2"+
		"\63\66\5\6\4\2\64\66\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66H\3\2\2\2\67"+
		":\5\b\5\28;\5\6\4\29;\3\2\2\2:8\3\2\2\2:9\3\2\2\2;H\3\2\2\2<?\5\24\13"+
		"\2=@\5\6\4\2>@\3\2\2\2?=\3\2\2\2?>\3\2\2\2@H\3\2\2\2AB\5\26\f\2BE\5\4"+
		"\3\2CF\5\6\4\2DF\3\2\2\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2G\"\3\2\2\2G(\3"+
		"\2\2\2G\60\3\2\2\2G\67\3\2\2\2G<\3\2\2\2GA\3\2\2\2H\5\3\2\2\2IL\5\22\n"+
		"\2JM\5\6\4\2KM\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MY\3\2\2\2NQ\5\4\3\2OR\5\6\4"+
		"\2PR\3\2\2\2QO\3\2\2\2QP\3\2\2\2RY\3\2\2\2SV\5\26\f\2TW\5\6\4\2UW\3\2"+
		"\2\2VT\3\2\2\2VU\3\2\2\2WY\3\2\2\2XI\3\2\2\2XN\3\2\2\2XS\3\2\2\2Y\7\3"+
		"\2\2\2Z[\7A\2\2[\t\3\2\2\2\\]\7\35\2\2]`\5\n\6\2^a\5\f\7\2_a\3\2\2\2`"+
		"^\3\2\2\2`_\3\2\2\2a\u0082\3\2\2\2bc\7\60\2\2cd\5\n\6\2dg\7\61\2\2eh\5"+
		"\f\7\2fh\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\u0082\3\2\2\2il\5\16\b\2jm\5\f\7"+
		"\2km\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\u0082\3\2\2\2nq\5\20\t\2or\5\f\7\2p"+
		"r\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\u0082\3\2\2\2sz\7 \2\2tz\7!\2\2ux\t\2\2"+
		"\2vx\7\35\2\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2ys\3\2\2\2yt\3\2\2\2yw\3\2"+
		"\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}\u0080\5\f\7\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0082\3\2\2\2\u0081\\\3\2\2\2"+
		"\u0081b\3\2\2\2\u0081i\3\2\2\2\u0081n\3\2\2\2\u0081y\3\2\2\2\u0082\13"+
		"\3\2\2\2\u0083\u0086\5\n\6\2\u0084\u0087\5\f\7\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008f\3\2\2\2\u0088\u0089\7\""+
		"\2\2\u0089\u008c\5\n\6\2\u008a\u008d\5\f\7\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0083\3\2"+
		"\2\2\u008e\u0088\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\t\3\2\2\u0091\17"+
		"\3\2\2\2\u0092\u009e\7\3\2\2\u0093\u009e\7/\2\2\u0094\u009e\7\4\2\2\u0095"+
		"\u009e\7\5\2\2\u0096\u009e\7\6\2\2\u0097\u009e\7\7\2\2\u0098\u009e\7\b"+
		"\2\2\u0099\u009e\7\t\2\2\u009a\u009e\7\n\2\2\u009b\u009e\7\13\2\2\u009c"+
		"\u009e\7\f\2\2\u009d\u0092\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0094\3\2"+
		"\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a5\7\r\2\2\u00a0\u00a5"+
		"\7\16\2\2\u00a1\u00a5\7\17\2\2\u00a2\u00a5\7\20\2\2\u00a3\u00a5\7\21\2"+
		"\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\t\4\2\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\27\3\2\2\2\u00aa\u00c0\5\20\t\2"+
		"\u00ab\u00c0\7\66\2\2\u00ac\u00c0\7\67\2\2\u00ad\u00c0\78\2\2\u00ae\u00c0"+
		"\79\2\2\u00af\u00c0\7:\2\2\u00b0\u00c0\7;\2\2\u00b1\u00c0\7<\2\2\u00b2"+
		"\u00c0\7=\2\2\u00b3\u00c0\7>\2\2\u00b4\u00c0\7?\2\2\u00b5\u00c0\7@\2\2"+
		"\u00b6\u00c0\7\35\2\2\u00b7\u00c0\7A\2\2\u00b8\u00c0\7B\2\2\u00b9\u00c0"+
		"\7C\2\2\u00ba\u00c0\7D\2\2\u00bb\u00c0\7E\2\2\u00bc\u00c0\7F\2\2\u00bd"+
		"\u00c0\7G\2\2\u00be\u00c0\7H\2\2\u00bf\u00aa\3\2\2\2\u00bf\u00ab\3\2\2"+
		"\2\u00bf\u00ac\3\2\2\2\u00bf\u00ad\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00af"+
		"\3\2\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf"+
		"\u00b3\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b6\3\2"+
		"\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\t\6\2\2\u00c2\33"+
		"\3\2\2\2\u00c3\u00c4\t\7\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\t\b\2\2\u00c6"+
		"\37\3\2\2\2\35%*.\65:?EGLQVX`glqwy{\177\u0081\u0086\u008c\u008e\u009d"+
		"\u00a4\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}