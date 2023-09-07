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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PIPE=7, GROUP=8, ASTERISK=9, 
		QMARK=10, CHARACTER_X=11, BACKSLASH=12, CARRIAGE_RETURN=13, TAB=14, FORM_FEED=15, 
		ALERT=16, ESC=17, WILDCARD=18, DIGIT=19, NON_DIGIT=20, HORIZONTAL_WS=21, 
		NON_HORIZONTAL_WS=22, WS=23, NON_WS=24, VERTICAL_WS=25, NON_VERTICAL_WS=26, 
		WORD=27, NON_WORD=28, CARET=29, DOLLAR_SIGN=30, WORD_BOUNDARY=31, INPUT_START=32, 
		END_OF_MATCH=33, NUMBER=34, LETTERS=35;
	public static final int
		RULE_expr = 0, RULE_test = 1, RULE_start = 2, RULE_addop = 3, RULE_mulop = 4, 
		RULE_predefinedCharacterClass = 5, RULE_quantifier = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "test", "start", "addop", "mulop", "predefinedCharacterClass", 
			"quantifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "')'", "'+'", "'/'", "'%'", "'|'", "'.*'", "'*'", 
			"'?'", "'x'", "'\\'", "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", "'.'", 
			"'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'^'", "'$'", "'\\b'", "'\\A'", "'\\G'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PIPE", "GROUP", "ASTERISK", 
			"QMARK", "CHARACTER_X", "BACKSLASH", "CARRIAGE_RETURN", "TAB", "FORM_FEED", 
			"ALERT", "ESC", "WILDCARD", "DIGIT", "NON_DIGIT", "HORIZONTAL_WS", "NON_HORIZONTAL_WS", 
			"WS", "NON_WS", "VERTICAL_WS", "NON_VERTICAL_WS", "WORD", "NON_WORD", 
			"CARET", "DOLLAR_SIGN", "WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"NUMBER", "LETTERS"
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
	public static class Q1Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Q1Context(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PCCContext extends ExprContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public PCCContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class QContext extends ExprContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public QContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Q2Context extends ExprContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Q2Context(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Q3Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Q3Context(ExprContext ctx) { copyFrom(ctx); }
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
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new UMINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				match(T__0);
				setState(16);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(T__1);
				setState(18);
				expr(0);
				setState(19);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new DOUBLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new PCCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				predefinedCharacterClass();
				}
				break;
			case 5:
				{
				_localctx = new QContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				quantifier();
				}
				break;
			case 6:
				{
				_localctx = new Q2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				quantifier();
				setState(25);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ADDOPGRPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(30);
						addop();
						setState(31);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new MULOPGRPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(33);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(34);
						mulop();
						setState(35);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new Q3Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						quantifier();
						setState(39);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new Q1Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(42);
						quantifier();
						}
						break;
					}
					} 
				}
				setState(47);
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
		public TerminalNode GROUP() { return getToken(regex2englishParser.GROUP, 0); }
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
			setState(48);
			match(GROUP);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
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
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__3) ) {
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
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ASTERISK))) != 0)) ) {
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
			setState(58);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << ASTERISK) | (1L << QMARK))) != 0)) ) {
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%A\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\3\3\3\3\4\3\4\5\4\67"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\3\2\t\2\4\6\b\n\f\16\2\5\4"+
		"\2\3\3\6\6\4\2\7\b\13\13\4\2\6\6\13\f\2C\2\35\3\2\2\2\4\62\3\2\2\2\6\66"+
		"\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20\21\b\2\1\2\21"+
		"\22\7\3\2\2\22\36\5\2\2\f\23\24\7\4\2\2\24\25\5\2\2\2\25\26\7\5\2\2\26"+
		"\36\3\2\2\2\27\36\7$\2\2\30\36\5\f\7\2\31\36\5\16\b\2\32\33\5\16\b\2\33"+
		"\34\5\2\2\5\34\36\3\2\2\2\35\20\3\2\2\2\35\23\3\2\2\2\35\27\3\2\2\2\35"+
		"\30\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\36/\3\2\2\2\37 \f\13\2\2 !\5\b"+
		"\5\2!\"\5\2\2\f\".\3\2\2\2#$\f\n\2\2$%\5\n\6\2%&\5\2\2\13&.\3\2\2\2\'"+
		"(\f\4\2\2()\5\16\b\2)*\5\2\2\5*.\3\2\2\2+,\f\3\2\2,.\5\16\b\2-\37\3\2"+
		"\2\2-#\3\2\2\2-\'\3\2\2\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\3\3\2\2\2\61/\3\2\2\2\62\63\7\n\2\2\63\5\3\2\2\2\64\67\5\4\3\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\t\2\2\29\t\3\2"+
		"\2\2:;\t\3\2\2;\13\3\2\2\2<=\7\24\2\2=\r\3\2\2\2>?\t\4\2\2?\17\3\2\2\2"+
		"\6\35-/\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}