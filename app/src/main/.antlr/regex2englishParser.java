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
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_group = 3, RULE_characterClass = 4, 
		RULE_characterClassHelper = 5, RULE_escapedToLiteralInsideCharClass = 6, 
		RULE_escapedToLiteralOutsideCharClass = 7, RULE_predefinedCharacterClass = 8, 
		RULE_quantifier = 9, RULE_back_reference = 10, RULE_boundary_matcher = 11, 
		RULE_escapedFromLiteral = 12, RULE_javalangCharacterClass = 13, RULE_unicodeScriptClass = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "group", "characterClass", "characterClassHelper", 
			"escapedToLiteralInsideCharClass", "escapedToLiteralOutsideCharClass", 
			"predefinedCharacterClass", "quantifier", "back_reference", "boundary_matcher", 
			"escapedFromLiteral", "javalangCharacterClass", "unicodeScriptClass"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BOUNDARY_MATCHERContext extends ExprContext {
		public Boundary_matcherContext boundary_matcher() {
			return getRuleContext(Boundary_matcherContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public BOUNDARY_MATCHERContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LETTERContext extends ExprContext {
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public List<TerminalNode> LETTER() { return getTokens(regex2englishParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(regex2englishParser.LETTER, i);
		}
		public LETTERContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LITERALContext extends ExprContext {
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public LITERALContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CHARACTER_CLASSContext extends ExprContext {
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public CHARACTER_CLASSContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BACK_REFERENCEContext extends ExprContext {
		public Back_referenceContext back_reference() {
			return getRuleContext(Back_referenceContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public BACK_REFERENCEContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CAPTURE_GROUPContext extends ExprContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public CAPTURE_GROUPContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new LITERALContext(_localctx);
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
				_localctx = new LETTERContext(_localctx);
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
				_localctx = new CHARACTER_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				characterClass();
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(47);
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
				_localctx = new CAPTURE_GROUPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				group();
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(52);
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
				_localctx = new BACK_REFERENCEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				back_reference();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(57);
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
				_localctx = new BOUNDARY_MATCHERContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				boundary_matcher();
				setState(62);
				expr();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(63);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				quantifier();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(70);
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
				setState(74);
				expr();
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(75);
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
				setState(79);
				boundary_matcher();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(80);
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
			setState(86);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(CARET);
				setState(89);
				characterClass();
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(90);
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
				setState(94);
				match(LBRACKET);
				setState(95);
				characterClass();
				setState(96);
				match(RBRACKET);
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(97);
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
				setState(101);
				escapedToLiteralInsideCharClass();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(102);
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
				setState(106);
				predefinedCharacterClass();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(107);
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
				setState(117); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(117);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER_RANGE:
							{
							setState(111);
							match(LETTER_RANGE);
							}
							break;
						case NUMBER_RANGE:
							{
							setState(112);
							match(NUMBER_RANGE);
							}
							break;
						case CARET:
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(115);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LETTER:
							case EXTRA_LETTER_ALLOWED_INSIDE:
								{
								setState(113);
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
								setState(114);
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
					setState(119); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
			setState(138);
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
			case RBRACKET_ESCAPED:
			case HYPHEN_ESCAPED:
			case DIGIT:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				characterClass();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(128);
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
				setState(132);
				match(DOUBLE_AMPERSAND);
				setState(133);
				characterClass();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(134);
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
		public TerminalNode RBRACKET_ESCAPED() { return getToken(regex2englishParser.RBRACKET_ESCAPED, 0); }
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
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH_ESCAPED) | (1L << RBRACKET_ESCAPED) | (1L << HYPHEN_ESCAPED))) != 0)) ) {
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

	public static class EscapedToLiteralOutsideCharClassContext extends ParserRuleContext {
		public TerminalNode LBRACKET_ESCAPED() { return getToken(regex2englishParser.LBRACKET_ESCAPED, 0); }
		public TerminalNode ASTERISK_ESCAPED() { return getToken(regex2englishParser.ASTERISK_ESCAPED, 0); }
		public TerminalNode PLUS_ESCAPED() { return getToken(regex2englishParser.PLUS_ESCAPED, 0); }
		public TerminalNode QMARK_ESCAPED() { return getToken(regex2englishParser.QMARK_ESCAPED, 0); }
		public TerminalNode LBRACE_ESCAPED() { return getToken(regex2englishParser.LBRACE_ESCAPED, 0); }
		public TerminalNode DOT_ESCAPED() { return getToken(regex2englishParser.DOT_ESCAPED, 0); }
		public TerminalNode LPAREN_ESCAPED() { return getToken(regex2englishParser.LPAREN_ESCAPED, 0); }
		public TerminalNode RPAREN_ESCAPED() { return getToken(regex2englishParser.RPAREN_ESCAPED, 0); }
		public TerminalNode CARET_ESCAPED() { return getToken(regex2englishParser.CARET_ESCAPED, 0); }
		public TerminalNode DOLLAR_SIGN_ESCAPED() { return getToken(regex2englishParser.DOLLAR_SIGN_ESCAPED, 0); }
		public TerminalNode PIPE_ESCAPED() { return getToken(regex2englishParser.PIPE_ESCAPED, 0); }
		public TerminalNode BACKSLASH_ESCAPED() { return getToken(regex2englishParser.BACKSLASH_ESCAPED, 0); }
		public EscapedToLiteralOutsideCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedToLiteralOutsideCharClass; }
	}

	public final EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() throws RecognitionException {
		EscapedToLiteralOutsideCharClassContext _localctx = new EscapedToLiteralOutsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ESCAPED) | (1L << LBRACE_ESCAPED) | (1L << PIPE_ESCAPED) | (1L << BACKSLASH_ESCAPED) | (1L << LPAREN_ESCAPED) | (1L << RPAREN_ESCAPED) | (1L << LBRACKET_ESCAPED) | (1L << DOT_ESCAPED) | (1L << CARET_ESCAPED) | (1L << QMARK_ESCAPED) | (1L << ASTERISK_ESCAPED) | (1L << DOLLAR_SIGN_ESCAPED))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_predefinedCharacterClass);
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
		public TerminalNode MAX_QUANTIFIER() { return getToken(regex2englishParser.MAX_QUANTIFIER, 0); }
		public TerminalNode MIN_QUANTIFIER() { return getToken(regex2englishParser.MIN_QUANTIFIER, 0); }
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << MAX_QUANTIFIER) | (1L << MIN_QUANTIFIER) | (1L << RANGE_QUANTIFIER))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_back_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		enterRule(_localctx, 22, RULE_boundary_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (CARET - 25)) | (1L << (DOLLAR_SIGN - 25)) | (1L << (WORD_BOUNDARY - 25)) | (1L << (NON_WORD_BOUNDARY - 25)) | (1L << (INPUT_START - 25)) | (1L << (END_OF_MATCH - 25)) | (1L << (INPUT_END - 25)) | (1L << (INPUT_END_INC_NEWLINE - 25)))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_escapedFromLiteral);
		try {
			setState(184);
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
				setState(163);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(174);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(175);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(176);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(177);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(178);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(179);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(180);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(181);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(182);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(183);
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
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\5\3D\n\3"+
		"\5\3F\n\3\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\3\4\5\4U\n"+
		"\4\5\4W\n\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\3\6\5\6f"+
		"\n\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\6\3\6\5\6v\n"+
		"\6\6\6x\n\6\r\6\16\6y\3\6\3\6\5\6~\n\6\5\6\u0080\n\6\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\5\7\u008d\n\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17"+
		"\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\n\3\2"+
		"\34\35\5\2$$((..\4\2!\')-\4\2\r\17\61\63\3\2NO\4\2\33\33EK\3\2\20\23\3"+
		"\2\24\32\2\u00f0\2 \3\2\2\2\4E\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\n\177\3\2"+
		"\2\2\f\u008c\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\u009d\3\2\2"+
		"\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00ba\3\2\2\2"+
		"\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"%\5\20\t\2#&"+
		"\5\6\4\2$&\3\2\2\2%#\3\2\2\2%$\3\2\2\2&F\3\2\2\2\')\7\34\2\2(\'\3\2\2"+
		"\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,/\5\6\4\2-/\3\2\2\2.,\3\2\2"+
		"\2.-\3\2\2\2/F\3\2\2\2\60\63\5\n\6\2\61\64\5\6\4\2\62\64\3\2\2\2\63\61"+
		"\3\2\2\2\63\62\3\2\2\2\64F\3\2\2\2\658\5\b\5\2\669\5\6\4\2\679\3\2\2\2"+
		"8\66\3\2\2\28\67\3\2\2\29F\3\2\2\2:=\5\26\f\2;>\5\6\4\2<>\3\2\2\2=;\3"+
		"\2\2\2=<\3\2\2\2>F\3\2\2\2?@\5\30\r\2@C\5\4\3\2AD\5\6\4\2BD\3\2\2\2CA"+
		"\3\2\2\2CB\3\2\2\2DF\3\2\2\2E\"\3\2\2\2E(\3\2\2\2E\60\3\2\2\2E\65\3\2"+
		"\2\2E:\3\2\2\2E?\3\2\2\2F\5\3\2\2\2GJ\5\24\13\2HK\5\6\4\2IK\3\2\2\2JH"+
		"\3\2\2\2JI\3\2\2\2KW\3\2\2\2LO\5\4\3\2MP\5\6\4\2NP\3\2\2\2OM\3\2\2\2O"+
		"N\3\2\2\2PW\3\2\2\2QT\5\30\r\2RU\5\6\4\2SU\3\2\2\2TR\3\2\2\2TS\3\2\2\2"+
		"UW\3\2\2\2VG\3\2\2\2VL\3\2\2\2VQ\3\2\2\2W\7\3\2\2\2XY\7E\2\2Y\t\3\2\2"+
		"\2Z[\7\33\2\2[^\5\n\6\2\\_\5\f\7\2]_\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\u0080"+
		"\3\2\2\2`a\7\64\2\2ab\5\n\6\2be\7\65\2\2cf\5\f\7\2df\3\2\2\2ec\3\2\2\2"+
		"ed\3\2\2\2f\u0080\3\2\2\2gj\5\16\b\2hk\5\f\7\2ik\3\2\2\2jh\3\2\2\2ji\3"+
		"\2\2\2k\u0080\3\2\2\2lo\5\22\n\2mp\5\f\7\2np\3\2\2\2om\3\2\2\2on\3\2\2"+
		"\2p\u0080\3\2\2\2qx\7\36\2\2rx\7\37\2\2sv\t\2\2\2tv\7\33\2\2us\3\2\2\2"+
		"ut\3\2\2\2vx\3\2\2\2wq\3\2\2\2wr\3\2\2\2wu\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z}\3\2\2\2{~\5\f\7\2|~\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0080\3"+
		"\2\2\2\177Z\3\2\2\2\177`\3\2\2\2\177g\3\2\2\2\177l\3\2\2\2\177w\3\2\2"+
		"\2\u0080\13\3\2\2\2\u0081\u0084\5\n\6\2\u0082\u0085\5\f\7\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u008d\3\2\2\2\u0086"+
		"\u0087\7 \2\2\u0087\u008a\5\n\6\2\u0088\u008b\5\f\7\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0081\3\2\2\2\u008c\u0086\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\t\3\2\2"+
		"\u008f\17\3\2\2\2\u0090\u0091\t\4\2\2\u0091\21\3\2\2\2\u0092\u009e\7\3"+
		"\2\2\u0093\u009e\7/\2\2\u0094\u009e\7\4\2\2\u0095\u009e\7\5\2\2\u0096"+
		"\u009e\7\6\2\2\u0097\u009e\7\7\2\2\u0098\u009e\7\b\2\2\u0099\u009e\7\t"+
		"\2\2\u009a\u009e\7\n\2\2\u009b\u009e\7\13\2\2\u009c\u009e\7\f\2\2\u009d"+
		"\u0092\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0095\3\2"+
		"\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\23\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0\25\3\2\2\2\u00a1\u00a2"+
		"\t\6\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\t\7\2\2\u00a4\31\3\2\2\2\u00a5\u00bb"+
		"\5\22\n\2\u00a6\u00bb\7:\2\2\u00a7\u00bb\7;\2\2\u00a8\u00bb\7<\2\2\u00a9"+
		"\u00bb\7=\2\2\u00aa\u00bb\7>\2\2\u00ab\u00bb\7?\2\2\u00ac\u00bb\7@\2\2"+
		"\u00ad\u00bb\7A\2\2\u00ae\u00bb\7B\2\2\u00af\u00bb\7C\2\2\u00b0\u00bb"+
		"\7D\2\2\u00b1\u00bb\7\33\2\2\u00b2\u00bb\7E\2\2\u00b3\u00bb\7F\2\2\u00b4"+
		"\u00bb\7G\2\2\u00b5\u00bb\7H\2\2\u00b6\u00bb\7I\2\2\u00b7\u00bb\7J\2\2"+
		"\u00b8\u00bb\7K\2\2\u00b9\u00bb\7L\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00a6"+
		"\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00a9\3\2\2\2\u00ba"+
		"\u00aa\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00ad\3\2"+
		"\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba"+
		"\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b4\3\2"+
		"\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\t\b\2"+
		"\2\u00bd\35\3\2\2\2\u00be\u00bf\t\t\2\2\u00bf\37\3\2\2\2\34%*.\638=CE"+
		"JOTV^ejouwy}\177\u0084\u008a\u008c\u009d\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}