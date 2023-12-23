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
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_expr2 = 3, RULE_characterClassContent2 = 4, 
		RULE_line_anchor = 5, RULE_group = 6, RULE_characterClass = 7, RULE_characterClassContent = 8, 
		RULE_characterClassHelper = 9, RULE_escapedToLiteralInsideCharClass = 10, 
		RULE_escapedToLiteralOutsideCharClass = 11, RULE_predefinedCharacterClass = 12, 
		RULE_quantifier = 13, RULE_back_reference = 14, RULE_boundary_matcher = 15, 
		RULE_escapedFromLiteral = 16, RULE_javalangCharacterClass = 17, RULE_unicodeScriptClass = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "expr2", "characterClassContent2", "line_anchor", 
			"group", "characterClass", "characterClassContent", "characterClassHelper", 
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
			setState(38);
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_ESCAPED:
			case LBRACE_ESCAPED:
			case PIPE_ESCAPED:
			case BACKSLASH_ESCAPED:
			case LPAREN_ESCAPED:
			case RPAREN_ESCAPED:
			case LBRACKET_ESCAPED:
			case DOT_ESCAPED:
			case CARET_ESCAPED:
			case QMARK_ESCAPED:
			case ASTERISK_ESCAPED:
			case DOLLAR_SIGN_ESCAPED:
				_localctx = new LITERALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				escapedToLiteralOutsideCharClass();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(41);
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
			case LETTER:
				_localctx = new LETTERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
			case LBRACKET:
				_localctx = new CHARACTER_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				characterClass();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			case LPAREN:
				_localctx = new CAPTURE_GROUPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				group();
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(60);
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
			case NEWLINE_REF:
			case NAMED_CAPTURE_GROUP_MATCH:
				_localctx = new BACK_REFERENCEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				back_reference();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
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
			case CARET:
			case DOLLAR_SIGN:
			case WORD_BOUNDARY:
			case NON_WORD_BOUNDARY:
			case INPUT_START:
			case END_OF_MATCH:
			case INPUT_END:
			case INPUT_END_INC_NEWLINE:
				_localctx = new BOUNDARY_MATCHERContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				boundary_matcher();
				setState(70);
				expr();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(71);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				quantifier();
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				expr();
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(83);
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
				setState(87);
				boundary_matcher();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(88);
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

	public static class Expr2Context extends ParserRuleContext {
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(regex2englishParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(regex2englishParser.LPAREN, i);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Back_referenceContext back_reference() {
			return getRuleContext(Back_referenceContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(95);
				escapedToLiteralOutsideCharClass();
				}
				break;
			case 2:
				{
				setState(96);
				characterClass();
				}
				break;
			case 3:
				{
				setState(97);
				match(LPAREN);
				setState(98);
				expr2(0);
				setState(99);
				match(LPAREN);
				}
				break;
			case 4:
				{
				setState(101);
				back_reference();
				}
				break;
			case 5:
				{
				setState(102);
				expr();
				setState(103);
				expr();
				}
				break;
			case 6:
				{
				setState(105);
				match(CARET);
				setState(106);
				expr2(4);
				}
				break;
			case 7:
				{
				setState(107);
				expr();
				}
				break;
			case 8:
				{
				setState(108);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Expr2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr2);
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						quantifier();
						}
						break;
					case 2:
						{
						_localctx = new Expr2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr2);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(DOLLAR_SIGN);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class CharacterClassContent2Context extends ParserRuleContext {
		public CharacterClassContent2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassContent2; }
	}

	public final CharacterClassContent2Context characterClassContent2() throws RecognitionException {
		CharacterClassContent2Context _localctx = new CharacterClassContent2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_characterClassContent2);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Line_anchorContext extends ParserRuleContext {
		public Line_anchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_anchor; }
	}

	public final Line_anchorContext line_anchor() throws RecognitionException {
		Line_anchorContext _localctx = new Line_anchorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line_anchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LPAREN);
			setState(125);
			characterClass();
			setState(126);
			match(RPAREN);
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
		public CharacterClassContentContext characterClassContent() {
			return getRuleContext(CharacterClassContentContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(regex2englishParser.RBRACKET, 0); }
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characterClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LBRACKET);
			setState(129);
			characterClassContent();
			setState(130);
			match(RBRACKET);
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

	public static class CharacterClassContentContext extends ParserRuleContext {
		public List<TerminalNode> CARET() { return getTokens(regex2englishParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(regex2englishParser.CARET, i);
		}
		public CharacterClassContentContext characterClassContent() {
			return getRuleContext(CharacterClassContentContext.class,0);
		}
		public CharacterClassHelperContext characterClassHelper() {
			return getRuleContext(CharacterClassHelperContext.class,0);
		}
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
		public CharacterClassContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassContent; }
	}

	public final CharacterClassContentContext characterClassContent() throws RecognitionException {
		CharacterClassContentContext _localctx = new CharacterClassContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_characterClassContent);
		int _la;
		try {
			int _alt;
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(CARET);
				setState(133);
				characterClassContent();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				escapedToLiteralInsideCharClass();
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(139);
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
				setState(143);
				predefinedCharacterClass();
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(144);
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
				setState(154); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(154);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER_RANGE:
							{
							setState(148);
							match(LETTER_RANGE);
							}
							break;
						case NUMBER_RANGE:
							{
							setState(149);
							match(NUMBER_RANGE);
							}
							break;
						case CARET:
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(152);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LETTER:
							case EXTRA_LETTER_ALLOWED_INSIDE:
								{
								setState(150);
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
								setState(151);
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
					setState(156); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(158);
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
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(regex2englishParser.DOUBLE_AMPERSAND, 0); }
		public CharacterClassContentContext characterClassContent() {
			return getRuleContext(CharacterClassContentContext.class,0);
		}
		public CharacterClassHelperContext characterClassHelper() {
			return getRuleContext(CharacterClassHelperContext.class,0);
		}
		public CharacterClassHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassHelper; }
	}

	public final CharacterClassHelperContext characterClassHelper() throws RecognitionException {
		CharacterClassHelperContext _localctx = new CharacterClassHelperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_characterClassHelper);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(DOUBLE_AMPERSAND);
				setState(165);
				characterClassContent();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(166);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				characterClassContent();
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(171);
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
		enterRule(_localctx, 20, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 22, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 24, RULE_predefinedCharacterClass);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new WildcardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__0);
				}
				break;
			case DIGIT:
				_localctx = new DigitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(DIGIT);
				}
				break;
			case T__1:
				_localctx = new Non_digitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new Horizontal_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new Non_horizontal_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new WhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new Non_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new Vertical_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new Non_vertical_whitespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new Non_wordContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
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
		enterRule(_localctx, 26, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 28, RULE_back_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 30, RULE_boundary_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 32, RULE_escapedFromLiteral);
		try {
			setState(221);
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
				setState(200);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
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
		enterRule(_localctx, 34, RULE_javalangCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 36, RULE_unicodeScriptClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\5\3.\n\3\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\3\3\3\5\3\67\n\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\5\3A\n\3\3\3"+
		"\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\5\3L\n\3\5\3N\n\3\3\4\3\4\3\4\5\4S\n"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\5\4]\n\4\5\4_\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3\5\3\5"+
		"\7\5v\n\5\f\5\16\5y\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\n\5\n\u0090\n\n\3\n\3\n\3\n"+
		"\5\n\u0095\n\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\6\n\u009d\n\n\r\n\16\n\u009e"+
		"\3\n\3\n\5\n\u00a3\n\n\5\n\u00a5\n\n\3\13\3\13\3\13\3\13\5\13\u00ab\n"+
		"\13\3\13\3\13\3\13\5\13\u00b0\n\13\5\13\u00b2\n\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c3\n\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\n\3\2\34\35\5\2$$((..\4\2!\')-\4\2\r\17\61\63\3\2NO\4"+
		"\2\33\33EK\3\2\20\23\3\2\24\32\2\u0118\2(\3\2\2\2\4M\3\2\2\2\6^\3\2\2"+
		"\2\bo\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16~\3\2\2\2\20\u0082\3\2\2\2\22\u00a4"+
		"\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00c2\3"+
		"\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2\2\2 \u00c8\3\2\2\2\"\u00df\3\2\2"+
		"\2$\u00e1\3\2\2\2&\u00e3\3\2\2\2()\5\4\3\2)\3\3\2\2\2*-\5\30\r\2+.\5\6"+
		"\4\2,.\3\2\2\2-+\3\2\2\2-,\3\2\2\2.N\3\2\2\2/\61\7\34\2\2\60/\3\2\2\2"+
		"\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\67\5\6\4\2"+
		"\65\67\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67N\3\2\2\28;\5\20\t\29<\5"+
		"\6\4\2:<\3\2\2\2;9\3\2\2\2;:\3\2\2\2<N\3\2\2\2=@\5\16\b\2>A\5\6\4\2?A"+
		"\3\2\2\2@>\3\2\2\2@?\3\2\2\2AN\3\2\2\2BE\5\36\20\2CF\5\6\4\2DF\3\2\2\2"+
		"EC\3\2\2\2ED\3\2\2\2FN\3\2\2\2GH\5 \21\2HK\5\4\3\2IL\5\6\4\2JL\3\2\2\2"+
		"KI\3\2\2\2KJ\3\2\2\2LN\3\2\2\2M*\3\2\2\2M\60\3\2\2\2M8\3\2\2\2M=\3\2\2"+
		"\2MB\3\2\2\2MG\3\2\2\2N\5\3\2\2\2OR\5\34\17\2PS\5\6\4\2QS\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2S_\3\2\2\2TW\5\4\3\2UX\5\6\4\2VX\3\2\2\2WU\3\2\2\2WV\3"+
		"\2\2\2X_\3\2\2\2Y\\\5 \21\2Z]\5\6\4\2[]\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2"+
		"]_\3\2\2\2^O\3\2\2\2^T\3\2\2\2^Y\3\2\2\2_\7\3\2\2\2`a\b\5\1\2ap\5\30\r"+
		"\2bp\5\20\t\2cd\7\66\2\2de\5\b\5\2ef\7\66\2\2fp\3\2\2\2gp\5\36\20\2hi"+
		"\5\4\3\2ij\5\4\3\2jp\3\2\2\2kl\7\33\2\2lp\5\b\5\6mp\5\4\3\2np\5\4\3\2"+
		"o`\3\2\2\2ob\3\2\2\2oc\3\2\2\2og\3\2\2\2oh\3\2\2\2ok\3\2\2\2om\3\2\2\2"+
		"on\3\2\2\2pw\3\2\2\2qr\f\b\2\2rv\5\34\17\2st\f\5\2\2tv\7E\2\2uq\3\2\2"+
		"\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\3\2"+
		"\2\2{\13\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~\177\7\66\2\2\177\u0080\5\20\t\2"+
		"\u0080\u0081\7\67\2\2\u0081\17\3\2\2\2\u0082\u0083\7\64\2\2\u0083\u0084"+
		"\5\22\n\2\u0084\u0085\7\65\2\2\u0085\21\3\2\2\2\u0086\u0087\7\33\2\2\u0087"+
		"\u008a\5\22\n\2\u0088\u008b\5\24\13\2\u0089\u008b\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u00a5\3\2\2\2\u008c\u008f\5\26\f\2"+
		"\u008d\u0090\5\24\13\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u00a5\3\2\2\2\u0091\u0094\5\32\16\2\u0092\u0095\5\24\13"+
		"\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u00a5"+
		"\3\2\2\2\u0096\u009d\7\36\2\2\u0097\u009d\7\37\2\2\u0098\u009b\t\2\2\2"+
		"\u0099\u009b\7\33\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u00a3\5\24\13\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0086\3\2\2\2\u00a4\u008c\3\2"+
		"\2\2\u00a4\u0091\3\2\2\2\u00a4\u009c\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a7"+
		"\7 \2\2\u00a7\u00aa\5\22\n\2\u00a8\u00ab\5\24\13\2\u00a9\u00ab\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00af"+
		"\5\22\n\2\u00ad\u00b0\5\24\13\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00ac"+
		"\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\27\3\2\2\2\u00b5\u00b6"+
		"\t\4\2\2\u00b6\31\3\2\2\2\u00b7\u00c3\7\3\2\2\u00b8\u00c3\7/\2\2\u00b9"+
		"\u00c3\7\4\2\2\u00ba\u00c3\7\5\2\2\u00bb\u00c3\7\6\2\2\u00bc\u00c3\7\7"+
		"\2\2\u00bd\u00c3\7\b\2\2\u00be\u00c3\7\t\2\2\u00bf\u00c3\7\n\2\2\u00c0"+
		"\u00c3\7\13\2\2\u00c1\u00c3\7\f\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00b8\3"+
		"\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c5"+
		"\t\5\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\t\6\2\2\u00c7\37\3\2\2\2\u00c8\u00c9"+
		"\t\7\2\2\u00c9!\3\2\2\2\u00ca\u00e0\5\32\16\2\u00cb\u00e0\7:\2\2\u00cc"+
		"\u00e0\7;\2\2\u00cd\u00e0\7<\2\2\u00ce\u00e0\7=\2\2\u00cf\u00e0\7>\2\2"+
		"\u00d0\u00e0\7?\2\2\u00d1\u00e0\7@\2\2\u00d2\u00e0\7A\2\2\u00d3\u00e0"+
		"\7B\2\2\u00d4\u00e0\7C\2\2\u00d5\u00e0\7D\2\2\u00d6\u00e0\7\33\2\2\u00d7"+
		"\u00e0\7E\2\2\u00d8\u00e0\7F\2\2\u00d9\u00e0\7G\2\2\u00da\u00e0\7H\2\2"+
		"\u00db\u00e0\7I\2\2\u00dc\u00e0\7J\2\2\u00dd\u00e0\7K\2\2\u00de\u00e0"+
		"\7L\2\2\u00df\u00ca\3\2\2\2\u00df\u00cb\3\2\2\2\u00df\u00cc\3\2\2\2\u00df"+
		"\u00cd\3\2\2\2\u00df\u00ce\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d0\3\2"+
		"\2\2\u00df\u00d1\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d3\3\2\2\2\u00df"+
		"\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0#\3\2\2\2\u00e1\u00e2\t\b\2\2\u00e2%\3\2\2\2\u00e3\u00e4\t\t"+
		"\2\2\u00e4\'\3\2\2\2\36-\62\66;@EKMRW\\^ouw\u008a\u008f\u0094\u009a\u009c"+
		"\u009e\u00a2\u00a4\u00aa\u00af\u00b1\u00c2\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}