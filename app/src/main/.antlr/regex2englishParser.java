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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PIPE=6, CAPTURE_GROUP=7, ASTERISK=8, 
		QMARK=9, PLUS=10, MIN_QUANTIFIER=11, RANGE_QUANTIFIER=12, BACKSLASH=13, 
		OCTAL_ONE=14, OCTAL_TWO=15, OCTAL_THREE=16, HEXA_TWO=17, HEXA_FOUR=18, 
		CODE_POINT=19, CARRIAGE_RETURN=20, TAB=21, FORM_FEED=22, ALERT=23, ESC=24, 
		WILDCARD=25, DIGIT=26, NON_DIGIT=27, HORIZONTAL_WS=28, NON_HORIZONTAL_WS=29, 
		WS=30, NON_WS=31, VERTICAL_WS=32, NON_VERTICAL_WS=33, WORD=34, NON_WORD=35, 
		CARET=36, DOLLAR_SIGN=37, WORD_BOUNDARY=38, INPUT_START=39, END_OF_MATCH=40, 
		INPUT_END=41, INPUT_END_INC_NEWLINE=42, LINEBREAK_MATCHER=43, NUMBER=44, 
		LETTERS=45, LOWERCASE_PO6=46, UPPERCASE_PO6=47, ASCII_PO6=48, ALPHA_PO6=49, 
		NUM_PO6=50, ALNUM_PO6=51, PUNCT_PO6=52, GLYPH_PO6=53, PRINTABLE_PO6=54, 
		BLANK_PO6=55, CTRL_PO6=56, HEXADECIMAL_PO6=57, WS_PO6=58, CHAR_CLASS_LC=59, 
		CHAR_CLASS_UC=60, CHAR_CLASS_WS=61, CHAR_CLASS_MIRRORED=62, UNICODE_CLASS_LATIN=63, 
		UNICODE_CLASS_GREEK=64, UNICODE_CLASS_UC=65, UNICODE_CLASS_ALPHA=66, UNICODE_CLASS_CURR=67, 
		UNICODE_CLASS_NOT_GREEK=68, UNICODE_CLASS_NOT_UC=69;
	public static final int
		RULE_expr = 0, RULE_test = 1, RULE_start = 2, RULE_addop = 3, RULE_mulop = 4, 
		RULE_predefinedCharacterClass = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "test", "start", "addop", "mulop", "predefinedCharacterClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "')'", "'/'", "'%'", "'|'", null, "'*'", "'?'", "'+'", 
			null, null, "'\\'", null, null, null, null, null, null, "'\\r'", "'\\t'", 
			"'\\f'", "'\\a'", "'\\e'", "'.'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", 
			"'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", "'\\W'", "'^'", "'$'", "'\\b'", 
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
			null, null, null, null, null, null, "PIPE", "CAPTURE_GROUP", "ASTERISK", 
			"QMARK", "PLUS", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", "BACKSLASH", "OCTAL_ONE", 
			"OCTAL_TWO", "OCTAL_THREE", "HEXA_TWO", "HEXA_FOUR", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "WILDCARD", "DIGIT", "NON_DIGIT", 
			"HORIZONTAL_WS", "NON_HORIZONTAL_WS", "WS", "NON_WS", "VERTICAL_WS", 
			"NON_VERTICAL_WS", "WORD", "NON_WORD", "CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "NUMBER", "LETTERS", "LOWERCASE_PO6", "UPPERCASE_PO6", 
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UMINUSContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UMINUSContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PCCContext extends ExprContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public PCCContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PARENGRPContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PARENGRPContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DOUBLEContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(regex2englishParser.NUMBER, 0); }
		public DOUBLEContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MULOPGRPContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MULOPGRPContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ADDOPGRPContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public ADDOPGRPContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new UMINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(13);
				match(T__0);
				setState(14);
				expr(6);
				}
				break;
			case T__1:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(T__1);
				setState(16);
				expr(0);
				setState(17);
				match(T__2);
				}
				break;
			case NUMBER:
				{
				_localctx = new DOUBLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(NUMBER);
				}
				break;
			case WILDCARD:
				{
				_localctx = new PCCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				predefinedCharacterClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ADDOPGRPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(23);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(24);
						addop();
						setState(25);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new MULOPGRPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						mulop();
						setState(29);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(35);
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

	public static class TestContext extends ParserRuleContext {
		public TerminalNode HEXA_FOUR() { return getToken(regex2englishParser.HEXA_FOUR, 0); }
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
			setState(36);
			match(HEXA_FOUR);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEXA_FOUR:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==PLUS) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ASTERISK))) != 0)) ) {
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
		public PredefinedCharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedCharacterClass; }
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predefinedCharacterClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(WILDCARD);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\63\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13\2\3"+
		"\3\3\3\3\4\3\4\5\4+\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\3\2\b\2\4\6\b\n"+
		"\f\2\4\4\2\3\3\f\f\4\2\6\7\n\n\2\62\2\27\3\2\2\2\4&\3\2\2\2\6*\3\2\2\2"+
		"\b,\3\2\2\2\n.\3\2\2\2\f\60\3\2\2\2\16\17\b\2\1\2\17\20\7\3\2\2\20\30"+
		"\5\2\2\b\21\22\7\4\2\2\22\23\5\2\2\2\23\24\7\5\2\2\24\30\3\2\2\2\25\30"+
		"\7.\2\2\26\30\5\f\7\2\27\16\3\2\2\2\27\21\3\2\2\2\27\25\3\2\2\2\27\26"+
		"\3\2\2\2\30#\3\2\2\2\31\32\f\7\2\2\32\33\5\b\5\2\33\34\5\2\2\b\34\"\3"+
		"\2\2\2\35\36\f\6\2\2\36\37\5\n\6\2\37 \5\2\2\7 \"\3\2\2\2!\31\3\2\2\2"+
		"!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'\7"+
		"\24\2\2\'\5\3\2\2\2(+\5\4\3\2)+\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\7\3\2\2\2"+
		",-\t\2\2\2-\t\3\2\2\2./\t\3\2\2/\13\3\2\2\2\60\61\7\33\2\2\61\r\3\2\2"+
		"\2\6\27!#*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}