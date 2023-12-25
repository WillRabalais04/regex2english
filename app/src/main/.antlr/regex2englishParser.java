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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CARET=38, 
		LETTER=39, EXTRA_LETTER_ALLOWED_INSIDE=40, LEFT_QUOTE=41, RIGHT_QUOTE=42, 
		LETTER_RANGE=43, NUMBER_RANGE=44, DOUBLE_AMPERSAND=45, PIPE=46, PLUS_ESCAPED=47, 
		LBRACE_ESCAPED=48, PIPE_ESCAPED=49, BACKSLASH_ESCAPED=50, LPAREN_ESCAPED=51, 
		RPAREN_ESCAPED=52, LBRACKET_ESCAPED=53, RBRACKET_ESCAPED=54, DOT_ESCAPED=55, 
		CARET_ESCAPED=56, QMARK_ESCAPED=57, ASTERISK_ESCAPED=58, DOLLAR_SIGN_ESCAPED=59, 
		HYPHEN_ESCAPED=60, DIGIT=61, N_OCCURRANCES=62, MAX_QUANTIFIER=63, MIN_QUANTIFIER=64, 
		RANGE_QUANTIFIER=65, LBRACKET=66, RBRACKET=67, LPAREN=68, RPAREN=69, BACKSLASH=70, 
		OCTAL_1=71, OCTAL_2=72, OCTAL_3=73, HEXA_2=74, HEXA_4=75, CODE_POINT=76, 
		CARRIAGE_RETURN=77, TAB=78, FORM_FEED=79, ALERT=80, ESC=81, DOLLAR_SIGN=82, 
		WORD_BOUNDARY=83, NON_WORD_BOUNDARY=84, INPUT_START=85, END_OF_MATCH=86, 
		INPUT_END=87, INPUT_END_INC_NEWLINE=88, LINEBREAK_MATCHER=89, N_TH_CAPTURE_GROUP=90, 
		NAMED_CAPTURE_GROUP_MATCH=91;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_characterClass = 3, 
		RULE_characterClassContent = 4, RULE_characterClassContentHelper = 5, 
		RULE_group = 6, RULE_escapedToLiteralInsideCharClass = 7, RULE_escapedToLiteralOutsideCharClass = 8, 
		RULE_predefinedCharacterClass = 9, RULE_quantifier = 10, RULE_back_reference = 11, 
		RULE_quote = 12, RULE_escapedFromLiteral = 13, RULE_posix = 14, RULE_javalangCharacterClass = 15, 
		RULE_unicodeScriptClass = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "characterClass", "characterClassContent", 
			"characterClassContentHelper", "group", "escapedToLiteralInsideCharClass", 
			"escapedToLiteralOutsideCharClass", "predefinedCharacterClass", "quantifier", 
			"back_reference", "quote", "escapedFromLiteral", "posix", "javalangCharacterClass", 
			"unicodeScriptClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'+'", "'*'", "'?'", "'\\p{Lower}'", "'\\p{Upper}'", 
			"'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", 
			"'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", 
			"'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'^'", null, null, "'\\Q'", "'\\E'", null, null, "'&&'", "'|'", "'\\+'", 
			"'\\{'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", "'\\['", "'\\.'", 
			"'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", "'\\d'", null, null, null, 
			null, "'['", "']'", "'('", "')'", "'\\'", null, null, null, null, null, 
			null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", "'$'", "'\\b'", "'\\B'", 
			"'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'", "'\\[0-9]+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CARET", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LEFT_QUOTE", 
			"RIGHT_QUOTE", "LETTER_RANGE", "NUMBER_RANGE", "DOUBLE_AMPERSAND", "PIPE", 
			"PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "DIGIT", "N_OCCURRANCES", "MAX_QUANTIFIER", 
			"MIN_QUANTIFIER", "RANGE_QUANTIFIER", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", 
			"CODE_POINT", "CARRIAGE_RETURN", "TAB", "FORM_FEED", "ALERT", "ESC", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "N_TH_CAPTURE_GROUP", 
			"NAMED_CAPTURE_GROUP_MATCH"
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
			setState(34);
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
	public static class BACKREFERENCEContext extends ExprContext {
		public Back_referenceContext back_reference() {
			return getRuleContext(Back_referenceContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public BACKREFERENCEContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class QUOTEContext extends ExprContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public QUOTEContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GROUPContext extends ExprContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public GROUPContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class END_OF_MATCHContext extends ExprContext {
		public TerminalNode END_OF_MATCH() { return getToken(regex2englishParser.END_OF_MATCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public END_OF_MATCHContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NON_WORD_BOUNDARYContext extends ExprContext {
		public List<TerminalNode> NON_WORD_BOUNDARY() { return getTokens(regex2englishParser.NON_WORD_BOUNDARY); }
		public TerminalNode NON_WORD_BOUNDARY(int i) {
			return getToken(regex2englishParser.NON_WORD_BOUNDARY, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public NON_WORD_BOUNDARYContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class INPUT_STARTContext extends ExprContext {
		public TerminalNode INPUT_START() { return getToken(regex2englishParser.INPUT_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public INPUT_STARTContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PREDEFINED_CHARACTERCLASSContext extends ExprContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public PREDEFINED_CHARACTERCLASSContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CHARACTERCLASSContext extends ExprContext {
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public CHARACTERCLASSContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class WORD_BOUNDARYContext extends ExprContext {
		public List<TerminalNode> WORD_BOUNDARY() { return getTokens(regex2englishParser.WORD_BOUNDARY); }
		public TerminalNode WORD_BOUNDARY(int i) {
			return getToken(regex2englishParser.WORD_BOUNDARY, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public WORD_BOUNDARYContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ESCAPE_SEQUENCEContext extends ExprContext {
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public ESCAPE_SEQUENCEContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BOUNDARY_MATCHER_STARTContext extends ExprContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public BOUNDARY_MATCHER_STARTContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(107);
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
				_localctx = new ESCAPE_SEQUENCEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				escapedToLiteralOutsideCharClass();
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(37);
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
			case LEFT_QUOTE:
				_localctx = new QUOTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				quote();
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
				_localctx = new PREDEFINED_CHARACTERCLASSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				predefinedCharacterClass();
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
			case LBRACKET:
				_localctx = new CHARACTERCLASSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				characterClass();
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			case LPAREN:
				_localctx = new GROUPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				group();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
			case N_TH_CAPTURE_GROUP:
			case NAMED_CAPTURE_GROUP_MATCH:
				_localctx = new BACKREFERENCEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				back_reference();
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(62);
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
				_localctx = new BOUNDARY_MATCHER_STARTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				match(CARET);
				setState(67);
				expr();
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
			case WORD_BOUNDARY:
				_localctx = new WORD_BOUNDARYContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(WORD_BOUNDARY);
				setState(73);
				expr();
				setState(74);
				match(WORD_BOUNDARY);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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
			case NON_WORD_BOUNDARY:
				_localctx = new NON_WORD_BOUNDARYContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				match(NON_WORD_BOUNDARY);
				setState(80);
				expr();
				setState(81);
				match(NON_WORD_BOUNDARY);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			case INPUT_START:
				_localctx = new INPUT_STARTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				match(INPUT_START);
				setState(87);
				expr();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
			case END_OF_MATCH:
				_localctx = new END_OF_MATCHContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				match(END_OF_MATCH);
				setState(93);
				expr();
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(94);
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
				enterOuterAlt(_localctx, 12);
				{
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(103);
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
		public ExprHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprHelper; }
	 
		public ExprHelperContext() { }
		public void copyFrom(ExprHelperContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BOUNDARY_MATCHER_ENDContext extends ExprHelperContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public BOUNDARY_MATCHER_ENDContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}
	public static class CONCATENATIONContext extends ExprHelperContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public CONCATENATIONContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}
	public static class QUANTIFIERContext extends ExprHelperContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public QUANTIFIERContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}
	public static class ORContext extends ExprHelperContext {
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public ORContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}
	public static class END_OF_INPUTContext extends ExprHelperContext {
		public TerminalNode INPUT_END() { return getToken(regex2englishParser.INPUT_END, 0); }
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public END_OF_INPUTContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}
	public static class END_OF_INPUT_EXCEPT_FINAL_TERMINATORContext extends ExprHelperContext {
		public TerminalNode INPUT_END_INC_NEWLINE() { return getToken(regex2englishParser.INPUT_END_INC_NEWLINE, 0); }
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
		}
		public END_OF_INPUT_EXCEPT_FINAL_TERMINATORContext(ExprHelperContext ctx) { copyFrom(ctx); }
	}

	public final ExprHelperContext exprHelper() throws RecognitionException {
		ExprHelperContext _localctx = new ExprHelperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprHelper);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(PIPE);
				setState(110);
				expr();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(111);
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
			case T__10:
			case T__11:
			case T__12:
			case N_OCCURRANCES:
			case MAX_QUANTIFIER:
			case MIN_QUANTIFIER:
			case RANGE_QUANTIFIER:
				_localctx = new QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				quantifier();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(116);
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
			case LEFT_QUOTE:
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
			case DIGIT:
			case LBRACKET:
			case LPAREN:
			case WORD_BOUNDARY:
			case NON_WORD_BOUNDARY:
			case INPUT_START:
			case END_OF_MATCH:
			case N_TH_CAPTURE_GROUP:
			case NAMED_CAPTURE_GROUP_MATCH:
				_localctx = new CONCATENATIONContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				expr();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(121);
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
			case DOLLAR_SIGN:
				_localctx = new BOUNDARY_MATCHER_ENDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(DOLLAR_SIGN);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(126);
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
			case INPUT_END_INC_NEWLINE:
				_localctx = new END_OF_INPUT_EXCEPT_FINAL_TERMINATORContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(INPUT_END_INC_NEWLINE);
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(131);
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
			case INPUT_END:
				_localctx = new END_OF_INPUTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(INPUT_END);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(136);
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
		enterRule(_localctx, 6, RULE_characterClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LBRACKET);
			setState(143);
			characterClassContent();
			setState(144);
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
		public CharacterClassContentHelperContext characterClassContentHelper() {
			return getRuleContext(CharacterClassContentHelperContext.class,0);
		}
		public EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() {
			return getRuleContext(EscapedToLiteralInsideCharClassContext.class,0);
		}
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public PosixContext posix() {
			return getRuleContext(PosixContext.class,0);
		}
		public JavalangCharacterClassContext javalangCharacterClass() {
			return getRuleContext(JavalangCharacterClassContext.class,0);
		}
		public UnicodeScriptClassContext unicodeScriptClass() {
			return getRuleContext(UnicodeScriptClassContext.class,0);
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
		enterRule(_localctx, 8, RULE_characterClassContent);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(CARET);
				setState(147);
				characterClassContent();
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(148);
					characterClassContentHelper();
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
				setState(152);
				escapedToLiteralInsideCharClass();
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(153);
					characterClassContentHelper();
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
				setState(157);
				predefinedCharacterClass();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(158);
					characterClassContentHelper();
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
				setState(162);
				posix();
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(163);
					characterClassContentHelper();
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
				setState(167);
				javalangCharacterClass();
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(168);
					characterClassContentHelper();
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
				setState(172);
				unicodeScriptClass();
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(173);
					characterClassContentHelper();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER_RANGE:
						{
						setState(177);
						match(LETTER_RANGE);
						}
						break;
					case NUMBER_RANGE:
						{
						setState(178);
						match(NUMBER_RANGE);
						}
						break;
					case CARET:
					case LETTER:
					case EXTRA_LETTER_ALLOWED_INSIDE:
						{
						setState(181);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(179);
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
							setState(180);
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
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARET) | (1L << LETTER) | (1L << EXTRA_LETTER_ALLOWED_INSIDE) | (1L << LETTER_RANGE) | (1L << NUMBER_RANGE))) != 0) );
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(187);
					characterClassContentHelper();
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

	public static class CharacterClassContentHelperContext extends ParserRuleContext {
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(regex2englishParser.DOUBLE_AMPERSAND, 0); }
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public CharacterClassContentContext characterClassContent() {
			return getRuleContext(CharacterClassContentContext.class,0);
		}
		public CharacterClassContentHelperContext characterClassContentHelper() {
			return getRuleContext(CharacterClassContentHelperContext.class,0);
		}
		public CharacterClassContentHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassContentHelper; }
	}

	public final CharacterClassContentHelperContext characterClassContentHelper() throws RecognitionException {
		CharacterClassContentHelperContext _localctx = new CharacterClassContentHelperContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_characterClassContentHelper);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(DOUBLE_AMPERSAND);
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(194);
					characterClass();
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
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case CARET:
				case LETTER:
				case EXTRA_LETTER_ALLOWED_INSIDE:
				case LETTER_RANGE:
				case NUMBER_RANGE:
				case BACKSLASH_ESCAPED:
				case LBRACKET_ESCAPED:
				case RBRACKET_ESCAPED:
				case HYPHEN_ESCAPED:
				case DIGIT:
					{
					setState(195);
					characterClassContent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(198);
					characterClassContentHelper();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				characterClass();
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(203);
					characterClassContentHelper();
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(209);
			match(LPAREN);
			setState(210);
			expr();
			setState(211);
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

	public static class EscapedToLiteralInsideCharClassContext extends ParserRuleContext {
		public TerminalNode BACKSLASH_ESCAPED() { return getToken(regex2englishParser.BACKSLASH_ESCAPED, 0); }
		public TerminalNode RBRACKET_ESCAPED() { return getToken(regex2englishParser.RBRACKET_ESCAPED, 0); }
		public TerminalNode HYPHEN_ESCAPED() { return getToken(regex2englishParser.HYPHEN_ESCAPED, 0); }
		public TerminalNode LBRACKET_ESCAPED() { return getToken(regex2englishParser.LBRACKET_ESCAPED, 0); }
		public EscapedToLiteralInsideCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedToLiteralInsideCharClass; }
	}

	public final EscapedToLiteralInsideCharClassContext escapedToLiteralInsideCharClass() throws RecognitionException {
		EscapedToLiteralInsideCharClassContext _localctx = new EscapedToLiteralInsideCharClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH_ESCAPED) | (1L << LBRACKET_ESCAPED) | (1L << RBRACKET_ESCAPED) | (1L << HYPHEN_ESCAPED))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
	public static class WILDCARDContext extends PredefinedCharacterClassContext {
		public WILDCARDContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class NON_DIGITContext extends PredefinedCharacterClassContext {
		public NON_DIGITContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class HORIZONTAL_WHITESPACEContext extends PredefinedCharacterClassContext {
		public HORIZONTAL_WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class WORDContext extends PredefinedCharacterClassContext {
		public WORDContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class NON_WHITESPACEContext extends PredefinedCharacterClassContext {
		public NON_WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class NON_VERTICAL_WHITESPACEContext extends PredefinedCharacterClassContext {
		public NON_VERTICAL_WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class WHITESPACEContext extends PredefinedCharacterClassContext {
		public WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class NON_WORDContext extends PredefinedCharacterClassContext {
		public NON_WORDContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class VERTICAL_WHITESPACEContext extends PredefinedCharacterClassContext {
		public VERTICAL_WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class DIGITContext extends PredefinedCharacterClassContext {
		public TerminalNode DIGIT() { return getToken(regex2englishParser.DIGIT, 0); }
		public DIGITContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class NON_HORIZONTAL_WHITESPACEContext extends PredefinedCharacterClassContext {
		public NON_HORIZONTAL_WHITESPACEContext(PredefinedCharacterClassContext ctx) { copyFrom(ctx); }
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predefinedCharacterClass);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new WILDCARDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__0);
				}
				break;
			case DIGIT:
				_localctx = new DIGITContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(DIGIT);
				}
				break;
			case T__1:
				_localctx = new NON_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new HORIZONTAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new NON_HORIZONTAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new NON_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new VERTICAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new NON_VERTICAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new WORDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new NON_WORDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(227);
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
		public TerminalNode N_OCCURRANCES() { return getToken(regex2englishParser.N_OCCURRANCES, 0); }
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
		enterRule(_localctx, 20, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (N_OCCURRANCES - 11)) | (1L << (MAX_QUANTIFIER - 11)) | (1L << (MIN_QUANTIFIER - 11)) | (1L << (RANGE_QUANTIFIER - 11)))) != 0)) ) {
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
		public TerminalNode N_TH_CAPTURE_GROUP() { return getToken(regex2englishParser.N_TH_CAPTURE_GROUP, 0); }
		public TerminalNode NAMED_CAPTURE_GROUP_MATCH() { return getToken(regex2englishParser.NAMED_CAPTURE_GROUP_MATCH, 0); }
		public Back_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_reference; }
	}

	public final Back_referenceContext back_reference() throws RecognitionException {
		Back_referenceContext _localctx = new Back_referenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_back_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==N_TH_CAPTURE_GROUP || _la==NAMED_CAPTURE_GROUP_MATCH) ) {
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

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode LEFT_QUOTE() { return getToken(regex2englishParser.LEFT_QUOTE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_QUOTE() { return getToken(regex2englishParser.RIGHT_QUOTE, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LEFT_QUOTE);
			setState(235);
			expr();
			setState(236);
			match(RIGHT_QUOTE);
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
		enterRule(_localctx, 26, RULE_escapedFromLiteral);
		try {
			setState(259);
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
				setState(238);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(250);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(251);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(252);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(254);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(255);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(256);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(257);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(258);
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

	public static class PosixContext extends ParserRuleContext {
		public PosixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posix; }
	 
		public PosixContext() { }
		public void copyFrom(PosixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class POSIX_LETTERSContext extends PosixContext {
		public POSIX_LETTERSContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_ALPHANUMERICContext extends PosixContext {
		public POSIX_ALPHANUMERICContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_LOWERCASEContext extends PosixContext {
		public POSIX_LOWERCASEContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_WHITESPACE_OR_GLYPHContext extends PosixContext {
		public POSIX_WHITESPACE_OR_GLYPHContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_CONTROL_CHARACTERSContext extends PosixContext {
		public POSIX_CONTROL_CHARACTERSContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_ALPHANUM_PUNCTUATIONContext extends PosixContext {
		public POSIX_ALPHANUM_PUNCTUATIONContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_DIGITSContext extends PosixContext {
		public POSIX_DIGITSContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_WHITESPACEContext extends PosixContext {
		public POSIX_WHITESPACEContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_SPACE_OR_TABContext extends PosixContext {
		public POSIX_SPACE_OR_TABContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_ASCIIContext extends PosixContext {
		public POSIX_ASCIIContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_UPPERCASEContext extends PosixContext {
		public POSIX_UPPERCASEContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_X_DIGITContext extends PosixContext {
		public POSIX_X_DIGITContext(PosixContext ctx) { copyFrom(ctx); }
	}
	public static class POSIX_PUNCTUATIONContext extends PosixContext {
		public POSIX_PUNCTUATIONContext(PosixContext ctx) { copyFrom(ctx); }
	}

	public final PosixContext posix() throws RecognitionException {
		PosixContext _localctx = new PosixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_posix);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new POSIX_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new POSIX_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new POSIX_ASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new POSIX_LETTERSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new POSIX_DIGITSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new POSIX_ALPHANUMERICContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new POSIX_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new POSIX_ALPHANUM_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new POSIX_WHITESPACE_OR_GLYPHContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new POSIX_SPACE_OR_TABContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new POSIX_CONTROL_CHARACTERSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new POSIX_X_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new POSIX_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(273);
				match(T__25);
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
	 
		public JavalangCharacterClassContext() { }
		public void copyFrom(JavalangCharacterClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JAVALANG_CC_LOWERCASEContext extends JavalangCharacterClassContext {
		public JAVALANG_CC_LOWERCASEContext(JavalangCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class JAVALANG_CC_WHITESPACEContext extends JavalangCharacterClassContext {
		public JAVALANG_CC_WHITESPACEContext(JavalangCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class JAVALANG_CC_MIRROREDContext extends JavalangCharacterClassContext {
		public JAVALANG_CC_MIRROREDContext(JavalangCharacterClassContext ctx) { copyFrom(ctx); }
	}
	public static class JAVALANG_CC_UPPERCASEContext extends JavalangCharacterClassContext {
		public JAVALANG_CC_UPPERCASEContext(JavalangCharacterClassContext ctx) { copyFrom(ctx); }
	}

	public final JavalangCharacterClassContext javalangCharacterClass() throws RecognitionException {
		JavalangCharacterClassContext _localctx = new JavalangCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_javalangCharacterClass);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new JAVALANG_CC_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new JAVALANG_CC_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new JAVALANG_CC_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new JAVALANG_CC_MIRROREDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__29);
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

	public static class UnicodeScriptClassContext extends ParserRuleContext {
		public UnicodeScriptClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeScriptClass; }
	 
		public UnicodeScriptClassContext() { }
		public void copyFrom(UnicodeScriptClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOT_UPPERCASEContext extends UnicodeScriptClassContext {
		public NOT_UPPERCASEContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class IS_ALPHABETICContext extends UnicodeScriptClassContext {
		public IS_ALPHABETICContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class CURRENCY_SYMBOLContext extends UnicodeScriptClassContext {
		public CURRENCY_SYMBOLContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class UPPERCASEContext extends UnicodeScriptClassContext {
		public UPPERCASEContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class LATINContext extends UnicodeScriptClassContext {
		public LATINContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class NOT_GREEKContext extends UnicodeScriptClassContext {
		public NOT_GREEKContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}
	public static class GREEKContext extends UnicodeScriptClassContext {
		public GREEKContext(UnicodeScriptClassContext ctx) { copyFrom(ctx); }
	}

	public final UnicodeScriptClassContext unicodeScriptClass() throws RecognitionException {
		UnicodeScriptClassContext _localctx = new UnicodeScriptClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unicodeScriptClass);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new LATINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new GREEKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new IS_ALPHABETICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new CURRENCY_SYMBOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new NOT_GREEKContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new NOT_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(T__36);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\5\3C\n\3\3"+
		"\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3W\n\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\3\3\3\3\3\3\3\5\3c\n\3\3\3\6\3"+
		"f\n\3\r\3\16\3g\3\3\3\3\5\3l\n\3\5\3n\n\3\3\4\3\4\3\4\3\4\5\4t\n\4\3\4"+
		"\3\4\3\4\5\4y\n\4\3\4\3\4\3\4\5\4~\n\4\3\4\3\4\3\4\5\4\u0083\n\4\3\4\3"+
		"\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\5\4\u008d\n\4\5\4\u008f\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6"+
		"\3\6\5\6\u00a3\n\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\6\3\6\3\6\5\6\u00ad\n\6"+
		"\3\6\3\6\3\6\5\6\u00b2\n\6\3\6\3\6\3\6\3\6\5\6\u00b8\n\6\6\6\u00ba\n\6"+
		"\r\6\16\6\u00bb\3\6\3\6\5\6\u00c0\n\6\5\6\u00c2\n\6\3\7\3\7\3\7\5\7\u00c7"+
		"\n\7\3\7\3\7\5\7\u00cb\n\7\3\7\3\7\3\7\5\7\u00d0\n\7\5\7\u00d2\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00e7\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0106\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0115\n\20\3\21\3\21\3\21"+
		"\3\21\5\21\u011b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0124\n"+
		"\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2)*\5"+
		"\2\64\64\678>>\4\2\61\679=\4\2\r\17@C\3\2\\]\2\u017f\2$\3\2\2\2\4m\3\2"+
		"\2\2\6\u008e\3\2\2\2\b\u0090\3\2\2\2\n\u00c1\3\2\2\2\f\u00d1\3\2\2\2\16"+
		"\u00d3\3\2\2\2\20\u00d7\3\2\2\2\22\u00d9\3\2\2\2\24\u00e6\3\2\2\2\26\u00e8"+
		"\3\2\2\2\30\u00ea\3\2\2\2\32\u00ec\3\2\2\2\34\u0105\3\2\2\2\36\u0114\3"+
		"\2\2\2 \u011a\3\2\2\2\"\u0123\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&)\5\22\n\2"+
		"\'*\5\6\4\2(*\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*n\3\2\2\2+.\5\32\16\2,/\5\6"+
		"\4\2-/\3\2\2\2.,\3\2\2\2.-\3\2\2\2/n\3\2\2\2\60\63\5\24\13\2\61\64\5\6"+
		"\4\2\62\64\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64n\3\2\2\2\658\5\b\5\2"+
		"\669\5\6\4\2\679\3\2\2\28\66\3\2\2\28\67\3\2\2\29n\3\2\2\2:=\5\16\b\2"+
		";>\5\6\4\2<>\3\2\2\2=;\3\2\2\2=<\3\2\2\2>n\3\2\2\2?B\5\30\r\2@C\5\6\4"+
		"\2AC\3\2\2\2B@\3\2\2\2BA\3\2\2\2Cn\3\2\2\2DE\7(\2\2EH\5\4\3\2FI\5\6\4"+
		"\2GI\3\2\2\2HF\3\2\2\2HG\3\2\2\2In\3\2\2\2JK\7U\2\2KL\5\4\3\2LO\7U\2\2"+
		"MP\5\6\4\2NP\3\2\2\2OM\3\2\2\2ON\3\2\2\2Pn\3\2\2\2QR\7V\2\2RS\5\4\3\2"+
		"SV\7V\2\2TW\5\6\4\2UW\3\2\2\2VT\3\2\2\2VU\3\2\2\2Wn\3\2\2\2XY\7W\2\2Y"+
		"\\\5\4\3\2Z]\5\6\4\2[]\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]n\3\2\2\2^_\7X\2"+
		"\2_b\5\4\3\2`c\5\6\4\2ac\3\2\2\2b`\3\2\2\2ba\3\2\2\2cn\3\2\2\2df\7)\2"+
		"\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2il\5\6\4\2jl\3\2\2"+
		"\2ki\3\2\2\2kj\3\2\2\2ln\3\2\2\2m&\3\2\2\2m+\3\2\2\2m\60\3\2\2\2m\65\3"+
		"\2\2\2m:\3\2\2\2m?\3\2\2\2mD\3\2\2\2mJ\3\2\2\2mQ\3\2\2\2mX\3\2\2\2m^\3"+
		"\2\2\2me\3\2\2\2n\5\3\2\2\2op\7\60\2\2ps\5\4\3\2qt\5\6\4\2rt\3\2\2\2s"+
		"q\3\2\2\2sr\3\2\2\2t\u008f\3\2\2\2ux\5\26\f\2vy\5\6\4\2wy\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2y\u008f\3\2\2\2z}\5\4\3\2{~\5\6\4\2|~\3\2\2\2}{\3\2\2"+
		"\2}|\3\2\2\2~\u008f\3\2\2\2\177\u0082\7T\2\2\u0080\u0083\5\6\4\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u008f\3\2"+
		"\2\2\u0084\u0087\7Z\2\2\u0085\u0088\5\6\4\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008f\3\2\2\2\u0089\u008c\7Y"+
		"\2\2\u008a\u008d\5\6\4\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008eo\3\2\2\2\u008eu\3\2\2\2\u008e"+
		"z\3\2\2\2\u008e\177\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0089\3\2\2\2\u008f"+
		"\7\3\2\2\2\u0090\u0091\7D\2\2\u0091\u0092\5\n\6\2\u0092\u0093\7E\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0098\5\n\6\2\u0096\u0099\5\f\7\2"+
		"\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u00c2"+
		"\3\2\2\2\u009a\u009d\5\20\t\2\u009b\u009e\5\f\7\2\u009c\u009e\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00c2\3\2\2\2\u009f\u00a2"+
		"\5\24\13\2\u00a0\u00a3\5\f\7\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00c2\3\2\2\2\u00a4\u00a7\5\36\20\2\u00a5\u00a8"+
		"\5\f\7\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00c2\3\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ad\5\f\7\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00c2\3\2\2\2\u00ae"+
		"\u00b1\5\"\22\2\u00af\u00b2\5\f\7\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00c2\3\2\2\2\u00b3\u00ba\7-\2\2\u00b4"+
		"\u00ba\7.\2\2\u00b5\u00b8\t\2\2\2\u00b6\u00b8\7(\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00c0\5\f\7\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u0094\3\2\2\2\u00c1\u009a\3\2\2\2\u00c1\u009f\3\2\2\2\u00c1\u00a4\3\2"+
		"\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2"+
		"\13\3\2\2\2\u00c3\u00c6\7/\2\2\u00c4\u00c7\5\b\5\2\u00c5\u00c7\5\n\6\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00cb"+
		"\5\f\7\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00d2\3\2\2\2\u00cc\u00cf\5\b\5\2\u00cd\u00d0\5\f\7\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00c3\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\r\3\2\2\2\u00d3\u00d4\7F\2\2"+
		"\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7G\2\2\u00d6\17\3\2\2\2\u00d7\u00d8\t"+
		"\3\2\2\u00d8\21\3\2\2\2\u00d9\u00da\t\4\2\2\u00da\23\3\2\2\2\u00db\u00e7"+
		"\7\3\2\2\u00dc\u00e7\7?\2\2\u00dd\u00e7\7\4\2\2\u00de\u00e7\7\5\2\2\u00df"+
		"\u00e7\7\6\2\2\u00e0\u00e7\7\7\2\2\u00e1\u00e7\7\b\2\2\u00e2\u00e7\7\t"+
		"\2\2\u00e3\u00e7\7\n\2\2\u00e4\u00e7\7\13\2\2\u00e5\u00e7\7\f\2\2\u00e6"+
		"\u00db\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00de\3\2"+
		"\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\25\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9\27\3\2\2\2\u00ea\u00eb"+
		"\t\6\2\2\u00eb\31\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\5\4\3\2\u00ee"+
		"\u00ef\7,\2\2\u00ef\33\3\2\2\2\u00f0\u0106\5\24\13\2\u00f1\u0106\7I\2"+
		"\2\u00f2\u0106\7J\2\2\u00f3\u0106\7K\2\2\u00f4\u0106\7L\2\2\u00f5\u0106"+
		"\7M\2\2\u00f6\u0106\7N\2\2\u00f7\u0106\7O\2\2\u00f8\u0106\7P\2\2\u00f9"+
		"\u0106\7Q\2\2\u00fa\u0106\7R\2\2\u00fb\u0106\7S\2\2\u00fc\u0106\7(\2\2"+
		"\u00fd\u0106\7T\2\2\u00fe\u0106\7U\2\2\u00ff\u0106\7V\2\2\u0100\u0106"+
		"\7W\2\2\u0101\u0106\7X\2\2\u0102\u0106\7Y\2\2\u0103\u0106\7Z\2\2\u0104"+
		"\u0106\7[\2\2\u0105\u00f0\3\2\2\2\u0105\u00f1\3\2\2\2\u0105\u00f2\3\2"+
		"\2\2\u0105\u00f3\3\2\2\2\u0105\u00f4\3\2\2\2\u0105\u00f5\3\2\2\2\u0105"+
		"\u00f6\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00f8\3\2\2\2\u0105\u00f9\3\2"+
		"\2\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\35\3\2\2\2\u0107\u0115\7\20\2\2\u0108\u0115\7\21"+
		"\2\2\u0109\u0115\7\22\2\2\u010a\u0115\7\23\2\2\u010b\u0115\7\24\2\2\u010c"+
		"\u0115\7\25\2\2\u010d\u0115\7\26\2\2\u010e\u0115\7\27\2\2\u010f\u0115"+
		"\7\30\2\2\u0110\u0115\7\31\2\2\u0111\u0115\7\32\2\2\u0112\u0115\7\33\2"+
		"\2\u0113\u0115\7\34\2\2\u0114\u0107\3\2\2\2\u0114\u0108\3\2\2\2\u0114"+
		"\u0109\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010c\3\2"+
		"\2\2\u0114\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\37\3\2\2\2\u0116\u011b\7\35\2\2\u0117\u011b\7\36\2\2\u0118"+
		"\u011b\7\37\2\2\u0119\u011b\7 \2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b!\3\2\2\2\u011c\u0124"+
		"\7!\2\2\u011d\u0124\7\"\2\2\u011e\u0124\7#\2\2\u011f\u0124\7$\2\2\u0120"+
		"\u0124\7%\2\2\u0121\u0124\7&\2\2\u0122\u0124\7\'\2\2\u0123\u011c\3\2\2"+
		"\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124#\3\2\2\2+).\63"+
		"8=BHOV\\bgkmsx}\u0082\u0087\u008c\u008e\u0098\u009d\u00a2\u00a7\u00ac"+
		"\u00b1\u00b7\u00b9\u00bb\u00bf\u00c1\u00c6\u00ca\u00cf\u00d1\u00e6\u0105"+
		"\u0114\u011a\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}