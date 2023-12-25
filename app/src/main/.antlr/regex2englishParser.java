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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		CARET=46, DIGIT=47, LETTER=48, EXTRA_LETTER_ALLOWED_INSIDE=49, LEFT_QUOTE=50, 
		RIGHT_QUOTE=51, LETTER_RANGE=52, NUMBER_RANGE=53, DOUBLE_AMPERSAND=54, 
		PIPE=55, PLUS_ESCAPED=56, LBRACE_ESCAPED=57, PIPE_ESCAPED=58, BACKSLASH_ESCAPED=59, 
		LPAREN_ESCAPED=60, RPAREN_ESCAPED=61, LBRACKET_ESCAPED=62, RBRACKET_ESCAPED=63, 
		DOT_ESCAPED=64, CARET_ESCAPED=65, QMARK_ESCAPED=66, ASTERISK_ESCAPED=67, 
		DOLLAR_SIGN_ESCAPED=68, HYPHEN_ESCAPED=69, N_OCCURRANCES=70, MAX_QUANTIFIER=71, 
		MIN_QUANTIFIER=72, RANGE_QUANTIFIER=73, LBRACKET=74, RBRACKET=75, LPAREN=76, 
		RPAREN=77, BACKSLASH=78, OCTAL_1=79, OCTAL_2=80, OCTAL_3=81, HEXA_2=82, 
		HEXA_4=83, CODE_POINT=84, CARRIAGE_RETURN=85, TAB=86, FORM_FEED=87, ALERT=88, 
		ESC=89, DOLLAR_SIGN=90, WORD_BOUNDARY=91, NON_WORD_BOUNDARY=92, INPUT_START=93, 
		END_OF_MATCH=94, INPUT_END=95, INPUT_END_INC_NEWLINE=96, LINEBREAK_MATCHER=97, 
		N_TH_CAPTURE_GROUP=98, NAMED_CAPTURE_GROUP_MATCH=99, NAMED_CAPTURE_GROUP_NAME=100;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_characterClass = 3, 
		RULE_characterClassContent = 4, RULE_characterClassContentHelper = 5, 
		RULE_group = 6, RULE_escapedToLiteralInsideCharClass = 7, RULE_escapedToLiteralOutsideCharClass = 8, 
		RULE_predefinedCharacterClass = 9, RULE_quantifier = 10, RULE_backReference = 11, 
		RULE_quote = 12, RULE_escapedFromLiteral = 13, RULE_namedCaptureGroup = 14, 
		RULE_nonCaptureGroup = 15, RULE_independentNonCapturingGroup = 16, RULE_zeroWidthPositiveLookAhead = 17, 
		RULE_zeroWidthNegativeLookAhead = 18, RULE_zeroWidthPositiveLookBehind = 19, 
		RULE_zeroWidthNegativeLookBehind = 20, RULE_posix = 21, RULE_javalangCharacterClass = 22, 
		RULE_unicodeScriptClass = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "characterClass", "characterClassContent", 
			"characterClassContentHelper", "group", "escapedToLiteralInsideCharClass", 
			"escapedToLiteralOutsideCharClass", "predefinedCharacterClass", "quantifier", 
			"backReference", "quote", "escapedFromLiteral", "namedCaptureGroup", 
			"nonCaptureGroup", "independentNonCapturingGroup", "zeroWidthPositiveLookAhead", 
			"zeroWidthNegativeLookAhead", "zeroWidthPositiveLookBehind", "zeroWidthNegativeLookBehind", 
			"posix", "javalangCharacterClass", "unicodeScriptClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'+'", "'*'", "'?'", "'<?'", "'>'", "'?:'", "'?>'", 
			"'?='", "'?!'", "'?<='", "'?<!'", "'\\p{Lower}'", "'\\p{Upper}'", "'\\p{ASCII}'", 
			"'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", "'\\p{Graph}'", 
			"'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", "'\\p{Space}'", 
			"'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'^'", "'\\d'", null, null, "'\\Q'", "'\\E'", null, null, "'&&'", "'|'", 
			"'\\+'", "'\\{'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", "'\\['", 
			"'\\.'", "'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", null, null, null, 
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
			null, null, null, null, null, null, null, null, null, null, "CARET", 
			"DIGIT", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "LEFT_QUOTE", "RIGHT_QUOTE", 
			"LETTER_RANGE", "NUMBER_RANGE", "DOUBLE_AMPERSAND", "PIPE", "PLUS_ESCAPED", 
			"LBRACE_ESCAPED", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", "LPAREN_ESCAPED", 
			"RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", "DOT_ESCAPED", 
			"CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", 
			"HYPHEN_ESCAPED", "N_OCCURRANCES", "MAX_QUANTIFIER", "MIN_QUANTIFIER", 
			"RANGE_QUANTIFIER", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "BACKSLASH", 
			"OCTAL_1", "OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "N_TH_CAPTURE_GROUP", "NAMED_CAPTURE_GROUP_MATCH", 
			"NAMED_CAPTURE_GROUP_NAME"
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
			setState(48);
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
		public BackReferenceContext backReference() {
			return getRuleContext(BackReferenceContext.class,0);
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
			setState(121);
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
				setState(50);
				escapedToLiteralOutsideCharClass();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(51);
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
				setState(55);
				quote();
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(56);
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
				setState(60);
				predefinedCharacterClass();
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
			case LBRACKET:
				_localctx = new CHARACTERCLASSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				characterClass();
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(66);
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
				setState(70);
				group();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
			case N_TH_CAPTURE_GROUP:
			case NAMED_CAPTURE_GROUP_MATCH:
				_localctx = new BACKREFERENCEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				backReference();
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(76);
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
				setState(80);
				match(CARET);
				setState(81);
				expr();
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
			case WORD_BOUNDARY:
				_localctx = new WORD_BOUNDARYContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				match(WORD_BOUNDARY);
				setState(87);
				expr();
				setState(88);
				match(WORD_BOUNDARY);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(89);
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
				setState(93);
				match(NON_WORD_BOUNDARY);
				setState(94);
				expr();
				setState(95);
				match(NON_WORD_BOUNDARY);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(96);
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
				setState(100);
				match(INPUT_START);
				setState(101);
				expr();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(102);
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
				setState(106);
				match(END_OF_MATCH);
				setState(107);
				expr();
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(108);
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
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(117);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(PIPE);
				setState(124);
				expr();
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(125);
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
				setState(129);
				quantifier();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(130);
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
			case DIGIT:
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
				setState(134);
				expr();
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(135);
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
				setState(139);
				match(DOLLAR_SIGN);
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(140);
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
				setState(144);
				match(INPUT_END_INC_NEWLINE);
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(145);
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
				setState(149);
				match(INPUT_END);
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(150);
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
			setState(156);
			match(LBRACKET);
			setState(157);
			characterClassContent();
			setState(158);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(CARET);
				setState(161);
				characterClassContent();
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(162);
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
				setState(166);
				escapedToLiteralInsideCharClass();
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(167);
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
				setState(171);
				predefinedCharacterClass();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(172);
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
				setState(176);
				posix();
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(177);
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
				setState(181);
				javalangCharacterClass();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(182);
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
				setState(186);
				unicodeScriptClass();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER_RANGE:
						{
						setState(191);
						match(LETTER_RANGE);
						}
						break;
					case NUMBER_RANGE:
						{
						setState(192);
						match(NUMBER_RANGE);
						}
						break;
					case CARET:
					case LETTER:
					case EXTRA_LETTER_ALLOWED_INSIDE:
						{
						setState(195);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(193);
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
							setState(194);
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
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARET) | (1L << LETTER) | (1L << EXTRA_LETTER_ALLOWED_INSIDE) | (1L << LETTER_RANGE) | (1L << NUMBER_RANGE))) != 0) );
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(201);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(DOUBLE_AMPERSAND);
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(208);
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
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case CARET:
				case DIGIT:
				case LETTER:
				case EXTRA_LETTER_ALLOWED_INSIDE:
				case LETTER_RANGE:
				case NUMBER_RANGE:
				case BACKSLASH_ESCAPED:
				case LBRACKET_ESCAPED:
				case RBRACKET_ESCAPED:
				case HYPHEN_ESCAPED:
					{
					setState(209);
					characterClassContent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(212);
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
				setState(216);
				characterClass();
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(217);
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
			setState(223);
			match(LPAREN);
			setState(224);
			expr();
			setState(225);
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
			setState(227);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BACKSLASH_ESCAPED - 59)) | (1L << (LBRACKET_ESCAPED - 59)) | (1L << (RBRACKET_ESCAPED - 59)) | (1L << (HYPHEN_ESCAPED - 59)))) != 0)) ) {
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
			setState(229);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (PLUS_ESCAPED - 56)) | (1L << (LBRACE_ESCAPED - 56)) | (1L << (PIPE_ESCAPED - 56)) | (1L << (BACKSLASH_ESCAPED - 56)) | (1L << (LPAREN_ESCAPED - 56)) | (1L << (RPAREN_ESCAPED - 56)) | (1L << (LBRACKET_ESCAPED - 56)) | (1L << (DOT_ESCAPED - 56)) | (1L << (CARET_ESCAPED - 56)) | (1L << (QMARK_ESCAPED - 56)) | (1L << (ASTERISK_ESCAPED - 56)) | (1L << (DOLLAR_SIGN_ESCAPED - 56)))) != 0)) ) {
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new WILDCARDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__0);
				}
				break;
			case DIGIT:
				_localctx = new DIGITContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(DIGIT);
				}
				break;
			case T__1:
				_localctx = new NON_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new HORIZONTAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new NON_HORIZONTAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new NON_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new VERTICAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new NON_VERTICAL_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new WORDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(240);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new NON_WORDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(241);
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
			setState(244);
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

	public static class BackReferenceContext extends ParserRuleContext {
		public TerminalNode N_TH_CAPTURE_GROUP() { return getToken(regex2englishParser.N_TH_CAPTURE_GROUP, 0); }
		public TerminalNode NAMED_CAPTURE_GROUP_MATCH() { return getToken(regex2englishParser.NAMED_CAPTURE_GROUP_MATCH, 0); }
		public BackReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backReference; }
	}

	public final BackReferenceContext backReference() throws RecognitionException {
		BackReferenceContext _localctx = new BackReferenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_backReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
			setState(248);
			match(LEFT_QUOTE);
			setState(249);
			expr();
			setState(250);
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
			setState(273);
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
				setState(252);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(262);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(264);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(265);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(266);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(267);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(268);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(269);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(270);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(271);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(272);
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

	public static class NamedCaptureGroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public TerminalNode NAMED_CAPTURE_GROUP_NAME() { return getToken(regex2englishParser.NAMED_CAPTURE_GROUP_NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public NamedCaptureGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedCaptureGroup; }
	}

	public final NamedCaptureGroupContext namedCaptureGroup() throws RecognitionException {
		NamedCaptureGroupContext _localctx = new NamedCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_namedCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(276);
			match(T__13);
			setState(277);
			match(NAMED_CAPTURE_GROUP_NAME);
			setState(278);
			match(T__14);
			setState(279);
			expr();
			setState(280);
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

	public static class NonCaptureGroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public NonCaptureGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCaptureGroup; }
	}

	public final NonCaptureGroupContext nonCaptureGroup() throws RecognitionException {
		NonCaptureGroupContext _localctx = new NonCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nonCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LPAREN);
			setState(283);
			match(T__15);
			setState(284);
			expr();
			setState(285);
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

	public static class IndependentNonCapturingGroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public IndependentNonCapturingGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_independentNonCapturingGroup; }
	}

	public final IndependentNonCapturingGroupContext independentNonCapturingGroup() throws RecognitionException {
		IndependentNonCapturingGroupContext _localctx = new IndependentNonCapturingGroupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_independentNonCapturingGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LPAREN);
			setState(288);
			match(T__16);
			setState(289);
			expr();
			setState(290);
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

	public static class ZeroWidthPositiveLookAheadContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public ZeroWidthPositiveLookAheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroWidthPositiveLookAhead; }
	}

	public final ZeroWidthPositiveLookAheadContext zeroWidthPositiveLookAhead() throws RecognitionException {
		ZeroWidthPositiveLookAheadContext _localctx = new ZeroWidthPositiveLookAheadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_zeroWidthPositiveLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LPAREN);
			setState(293);
			match(T__17);
			setState(294);
			expr();
			setState(295);
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

	public static class ZeroWidthNegativeLookAheadContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public ZeroWidthNegativeLookAheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroWidthNegativeLookAhead; }
	}

	public final ZeroWidthNegativeLookAheadContext zeroWidthNegativeLookAhead() throws RecognitionException {
		ZeroWidthNegativeLookAheadContext _localctx = new ZeroWidthNegativeLookAheadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_zeroWidthNegativeLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LPAREN);
			setState(298);
			match(T__18);
			setState(299);
			expr();
			setState(300);
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

	public static class ZeroWidthPositiveLookBehindContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public ZeroWidthPositiveLookBehindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroWidthPositiveLookBehind; }
	}

	public final ZeroWidthPositiveLookBehindContext zeroWidthPositiveLookBehind() throws RecognitionException {
		ZeroWidthPositiveLookBehindContext _localctx = new ZeroWidthPositiveLookBehindContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_zeroWidthPositiveLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LPAREN);
			setState(303);
			match(T__19);
			setState(304);
			expr();
			setState(305);
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

	public static class ZeroWidthNegativeLookBehindContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public ZeroWidthNegativeLookBehindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroWidthNegativeLookBehind; }
	}

	public final ZeroWidthNegativeLookBehindContext zeroWidthNegativeLookBehind() throws RecognitionException {
		ZeroWidthNegativeLookBehindContext _localctx = new ZeroWidthNegativeLookBehindContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_zeroWidthNegativeLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LPAREN);
			setState(308);
			match(T__20);
			setState(309);
			expr();
			setState(310);
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
		enterRule(_localctx, 42, RULE_posix);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new POSIX_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new POSIX_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new POSIX_ASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new POSIX_LETTERSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new POSIX_DIGITSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new POSIX_ALPHANUMERICContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new POSIX_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new POSIX_ALPHANUM_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new POSIX_WHITESPACE_OR_GLYPHContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new POSIX_SPACE_OR_TABContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new POSIX_CONTROL_CHARACTERSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(322);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new POSIX_X_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(323);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new POSIX_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(324);
				match(T__33);
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
		enterRule(_localctx, 44, RULE_javalangCharacterClass);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				_localctx = new JAVALANG_CC_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new JAVALANG_CC_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new JAVALANG_CC_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new JAVALANG_CC_MIRROREDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(T__37);
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
		enterRule(_localctx, 46, RULE_unicodeScriptClass);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				_localctx = new LATINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(T__38);
				}
				break;
			case T__39:
				_localctx = new GREEKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__39);
				}
				break;
			case T__40:
				_localctx = new UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(T__40);
				}
				break;
			case T__41:
				_localctx = new IS_ALPHABETICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(T__41);
				}
				break;
			case T__42:
				_localctx = new CURRENCY_SYMBOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new NOT_GREEKContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new NOT_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				match(T__44);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\5\3B\n"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\5\3Q\n\3\3\3"+
		"\3\3\3\3\3\3\5\3W\n\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\5\3q\n\3\3\3\6\3t\n"+
		"\3\r\3\16\3u\3\3\3\3\5\3z\n\3\5\3|\n\3\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3"+
		"\4\3\4\3\4\5\4\u0087\n\4\3\4\3\4\3\4\5\4\u008c\n\4\3\4\3\4\3\4\5\4\u0091"+
		"\n\4\3\4\3\4\3\4\5\4\u0096\n\4\3\4\3\4\3\4\5\4\u009b\n\4\5\4\u009d\n\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\6\5\6\u00ac\n"+
		"\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\5\6\u00b6\n\6\3\6\3\6\3\6\5\6"+
		"\u00bb\n\6\3\6\3\6\3\6\5\6\u00c0\n\6\3\6\3\6\3\6\3\6\5\6\u00c6\n\6\6\6"+
		"\u00c8\n\6\r\6\16\6\u00c9\3\6\3\6\5\6\u00ce\n\6\5\6\u00d0\n\6\3\7\3\7"+
		"\3\7\5\7\u00d5\n\7\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\5\7\u00de\n\7\5\7"+
		"\u00e0\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f5\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0114\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0148\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u014e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0157\n\31\3\31\2"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\3\2\62\63"+
		"\5\2==@AGG\4\2:@BF\4\2\r\17HK\3\2de\2\u01ab\2\62\3\2\2\2\4{\3\2\2\2\6"+
		"\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00cf\3\2\2\2\f\u00df\3\2\2\2\16\u00e1"+
		"\3\2\2\2\20\u00e5\3\2\2\2\22\u00e7\3\2\2\2\24\u00f4\3\2\2\2\26\u00f6\3"+
		"\2\2\2\30\u00f8\3\2\2\2\32\u00fa\3\2\2\2\34\u0113\3\2\2\2\36\u0115\3\2"+
		"\2\2 \u011c\3\2\2\2\"\u0121\3\2\2\2$\u0126\3\2\2\2&\u012b\3\2\2\2(\u0130"+
		"\3\2\2\2*\u0135\3\2\2\2,\u0147\3\2\2\2.\u014d\3\2\2\2\60\u0156\3\2\2\2"+
		"\62\63\5\4\3\2\63\3\3\2\2\2\64\67\5\22\n\2\658\5\6\4\2\668\3\2\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28|\3\2\2\29<\5\32\16\2:=\5\6\4\2;=\3\2\2\2<:"+
		"\3\2\2\2<;\3\2\2\2=|\3\2\2\2>A\5\24\13\2?B\5\6\4\2@B\3\2\2\2A?\3\2\2\2"+
		"A@\3\2\2\2B|\3\2\2\2CF\5\b\5\2DG\5\6\4\2EG\3\2\2\2FD\3\2\2\2FE\3\2\2\2"+
		"G|\3\2\2\2HK\5\16\b\2IL\5\6\4\2JL\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L|\3\2\2"+
		"\2MP\5\30\r\2NQ\5\6\4\2OQ\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q|\3\2\2\2RS\7\60"+
		"\2\2SV\5\4\3\2TW\5\6\4\2UW\3\2\2\2VT\3\2\2\2VU\3\2\2\2W|\3\2\2\2XY\7]"+
		"\2\2YZ\5\4\3\2Z]\7]\2\2[^\5\6\4\2\\^\3\2\2\2][\3\2\2\2]\\\3\2\2\2^|\3"+
		"\2\2\2_`\7^\2\2`a\5\4\3\2ad\7^\2\2be\5\6\4\2ce\3\2\2\2db\3\2\2\2dc\3\2"+
		"\2\2e|\3\2\2\2fg\7_\2\2gj\5\4\3\2hk\5\6\4\2ik\3\2\2\2jh\3\2\2\2ji\3\2"+
		"\2\2k|\3\2\2\2lm\7`\2\2mp\5\4\3\2nq\5\6\4\2oq\3\2\2\2pn\3\2\2\2po\3\2"+
		"\2\2q|\3\2\2\2rt\7\62\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3"+
		"\2\2\2wz\5\6\4\2xz\3\2\2\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{\64\3\2\2\2{"+
		"9\3\2\2\2{>\3\2\2\2{C\3\2\2\2{H\3\2\2\2{M\3\2\2\2{R\3\2\2\2{X\3\2\2\2"+
		"{_\3\2\2\2{f\3\2\2\2{l\3\2\2\2{s\3\2\2\2|\5\3\2\2\2}~\79\2\2~\u0081\5"+
		"\4\3\2\177\u0082\5\6\4\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u009d\3\2\2\2\u0083\u0086\5\26\f\2\u0084\u0087\5\6\4\2"+
		"\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u009d"+
		"\3\2\2\2\u0088\u008b\5\4\3\2\u0089\u008c\5\6\4\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u009d\3\2\2\2\u008d\u0090\7\\"+
		"\2\2\u008e\u0091\5\6\4\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u009d\3\2\2\2\u0092\u0095\7b\2\2\u0093\u0096\5\6"+
		"\4\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u009d\3\2\2\2\u0097\u009a\7a\2\2\u0098\u009b\5\6\4\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"}\3\2\2\2\u009c\u0083\3\2\2\2\u009c\u0088\3\2\2\2\u009c\u008d\3\2\2\2"+
		"\u009c\u0092\3\2\2\2\u009c\u0097\3\2\2\2\u009d\7\3\2\2\2\u009e\u009f\7"+
		"L\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\7M\2\2\u00a1\t\3\2\2\2\u00a2\u00a3"+
		"\7\60\2\2\u00a3\u00a6\5\n\6\2\u00a4\u00a7\5\f\7\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00d0\3\2\2\2\u00a8\u00ab"+
		"\5\20\t\2\u00a9\u00ac\5\f\7\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00d0\3\2\2\2\u00ad\u00b0\5\24\13\2\u00ae\u00b1"+
		"\5\f\7\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00d0\3\2\2\2\u00b2\u00b5\5,\27\2\u00b3\u00b6\5\f\7\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00d0\3\2\2\2\u00b7"+
		"\u00ba\5.\30\2\u00b8\u00bb\5\f\7\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00d0\3\2\2\2\u00bc\u00bf\5\60\31\2\u00bd"+
		"\u00c0\5\f\7\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00d0\3\2\2\2\u00c1\u00c8\7\66\2\2\u00c2\u00c8\7\67\2\2\u00c3"+
		"\u00c6\t\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00ce\5\f\7\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00a2\3\2"+
		"\2\2\u00cf\u00a8\3\2\2\2\u00cf\u00ad\3\2\2\2\u00cf\u00b2\3\2\2\2\u00cf"+
		"\u00b7\3\2\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00c7\3\2\2\2\u00d0\13\3\2\2"+
		"\2\u00d1\u00d4\78\2\2\u00d2\u00d5\5\b\5\2\u00d3\u00d5\5\n\6\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d9\5\f\7\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00e0\3\2"+
		"\2\2\u00da\u00dd\5\b\5\2\u00db\u00de\5\f\7\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d1\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00e0\r\3\2\2\2\u00e1\u00e2\7N\2\2\u00e2\u00e3"+
		"\5\4\3\2\u00e3\u00e4\7O\2\2\u00e4\17\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6"+
		"\21\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8\23\3\2\2\2\u00e9\u00f5\7\3\2\2\u00ea"+
		"\u00f5\7\61\2\2\u00eb\u00f5\7\4\2\2\u00ec\u00f5\7\5\2\2\u00ed\u00f5\7"+
		"\6\2\2\u00ee\u00f5\7\7\2\2\u00ef\u00f5\7\b\2\2\u00f0\u00f5\7\t\2\2\u00f1"+
		"\u00f5\7\n\2\2\u00f2\u00f5\7\13\2\2\u00f3\u00f5\7\f\2\2\u00f4\u00e9\3"+
		"\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\25\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\t\6\2\2\u00f9"+
		"\31\3\2\2\2\u00fa\u00fb\7\64\2\2\u00fb\u00fc\5\4\3\2\u00fc\u00fd\7\65"+
		"\2\2\u00fd\33\3\2\2\2\u00fe\u0114\5\24\13\2\u00ff\u0114\7Q\2\2\u0100\u0114"+
		"\7R\2\2\u0101\u0114\7S\2\2\u0102\u0114\7T\2\2\u0103\u0114\7U\2\2\u0104"+
		"\u0114\7V\2\2\u0105\u0114\7W\2\2\u0106\u0114\7X\2\2\u0107\u0114\7Y\2\2"+
		"\u0108\u0114\7Z\2\2\u0109\u0114\7[\2\2\u010a\u0114\7\60\2\2\u010b\u0114"+
		"\7\\\2\2\u010c\u0114\7]\2\2\u010d\u0114\7^\2\2\u010e\u0114\7_\2\2\u010f"+
		"\u0114\7`\2\2\u0110\u0114\7a\2\2\u0111\u0114\7b\2\2\u0112\u0114\7c\2\2"+
		"\u0113\u00fe\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0101"+
		"\3\2\2\2\u0113\u0102\3\2\2\2\u0113\u0103\3\2\2\2\u0113\u0104\3\2\2\2\u0113"+
		"\u0105\3\2\2\2\u0113\u0106\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0108\3\2"+
		"\2\2\u0113\u0109\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\35\3\2\2\2\u0115\u0116\7N\2\2\u0116\u0117\7\20\2\2\u0117\u0118\7f\2\2"+
		"\u0118\u0119\7\21\2\2\u0119\u011a\5\4\3\2\u011a\u011b\7O\2\2\u011b\37"+
		"\3\2\2\2\u011c\u011d\7N\2\2\u011d\u011e\7\22\2\2\u011e\u011f\5\4\3\2\u011f"+
		"\u0120\7O\2\2\u0120!\3\2\2\2\u0121\u0122\7N\2\2\u0122\u0123\7\23\2\2\u0123"+
		"\u0124\5\4\3\2\u0124\u0125\7O\2\2\u0125#\3\2\2\2\u0126\u0127\7N\2\2\u0127"+
		"\u0128\7\24\2\2\u0128\u0129\5\4\3\2\u0129\u012a\7O\2\2\u012a%\3\2\2\2"+
		"\u012b\u012c\7N\2\2\u012c\u012d\7\25\2\2\u012d\u012e\5\4\3\2\u012e\u012f"+
		"\7O\2\2\u012f\'\3\2\2\2\u0130\u0131\7N\2\2\u0131\u0132\7\26\2\2\u0132"+
		"\u0133\5\4\3\2\u0133\u0134\7O\2\2\u0134)\3\2\2\2\u0135\u0136\7N\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u0138\5\4\3\2\u0138\u0139\7O\2\2\u0139+\3\2\2\2"+
		"\u013a\u0148\7\30\2\2\u013b\u0148\7\31\2\2\u013c\u0148\7\32\2\2\u013d"+
		"\u0148\7\33\2\2\u013e\u0148\7\34\2\2\u013f\u0148\7\35\2\2\u0140\u0148"+
		"\7\36\2\2\u0141\u0148\7\37\2\2\u0142\u0148\7 \2\2\u0143\u0148\7!\2\2\u0144"+
		"\u0148\7\"\2\2\u0145\u0148\7#\2\2\u0146\u0148\7$\2\2\u0147\u013a\3\2\2"+
		"\2\u0147\u013b\3\2\2\2\u0147\u013c\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u013e"+
		"\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148-\3\2\2\2\u0149\u014e\7%\2\2\u014a\u014e"+
		"\7&\2\2\u014b\u014e\7\'\2\2\u014c\u014e\7(\2\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e/\3\2\2\2"+
		"\u014f\u0157\7)\2\2\u0150\u0157\7*\2\2\u0151\u0157\7+\2\2\u0152\u0157"+
		"\7,\2\2\u0153\u0157\7-\2\2\u0154\u0157\7.\2\2\u0155\u0157\7/\2\2\u0156"+
		"\u014f\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2"+
		"\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\61\3\2\2\2+\67<AFKPV]djpuy{\u0081\u0086\u008b\u0090\u0095\u009a\u009c"+
		"\u00a6\u00ab\u00b0\u00b5\u00ba\u00bf\u00c5\u00c7\u00c9\u00cd\u00cf\u00d4"+
		"\u00d8\u00dd\u00df\u00f4\u0113\u0147\u014d\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}