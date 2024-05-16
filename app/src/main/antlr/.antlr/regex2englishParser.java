// Generated from /Users/willrabalais/Code/Projects/regex2english/app/src/main/antlr/regex2english.g4 by ANTLR 4.9.2
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WILDCARD=30, CARET=31, 
		DIGIT=32, NON_DIGIT=33, HORIZONTAL_WHITESPACE=34, NON_HORIZONTAL_WHITESPACE=35, 
		WHITESPACE=36, NON_WHITESPACE=37, VERTICAL_WHITESPACE=38, NON_VERTICAL_WHITESPACE=39, 
		WORD=40, NON_WORD=41, LEFT_QUOTE=42, RIGHT_QUOTE=43, LETTER_RANGE=44, 
		NUMBER_RANGE=45, DOUBLE_AMPERSAND=46, PIPE=47, PLUS_ESCAPED=48, LBRACE_ESCAPED=49, 
		PIPE_ESCAPED=50, BACKSLASH_ESCAPED=51, LPAREN_ESCAPED=52, RPAREN_ESCAPED=53, 
		LBRACKET_ESCAPED=54, RBRACKET_ESCAPED=55, DOT_ESCAPED=56, CARET_ESCAPED=57, 
		QMARK_ESCAPED=58, ASTERISK_ESCAPED=59, DOLLAR_SIGN_ESCAPED=60, HYPHEN_ESCAPED=61, 
		N_OCCURRANCES=62, MAX_QUANTIFIER=63, MIN_QUANTIFIER=64, RANGE_QUANTIFIER=65, 
		PLUS=66, ASTERISK=67, QMARK=68, LBRACKET=69, RBRACKET=70, LPAREN=71, RPAREN=72, 
		BACKSLASH=73, OCTAL_1=74, OCTAL_2=75, OCTAL_3=76, HEXA_2=77, HEXA_4=78, 
		HEXA_6=79, CARRIAGE_RETURN=80, TAB=81, FORM_FEED=82, ALERT=83, ESC=84, 
		POSITIVE_LA=85, NEGATIVE_LA=86, POSITIVE_LB=87, NEGATIVE_LB=88, DOLLAR_SIGN=89, 
		WORD_BOUNDARY=90, NON_WORD_BOUNDARY=91, INPUT_START=92, END_OF_MATCH=93, 
		INPUT_END=94, INPUT_END_INC_NEWLINE=95, LINEBREAK_MATCHER=96, LETTER=97, 
		INLINEMODIFIER=98, LOCAL_INLINE_MODIFIER_TEMPLATE=99, N_TH_CAPTURE_GROUP=100, 
		NAMED_CAPTURE_GROUP_MATCH=101, NAMED_CAPTURE_GROUP_NAME=102;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_characterClassContent = 3, 
		RULE_characterClassContentHelper = 4, RULE_escapedToLiteralInsideCharClass = 5, 
		RULE_escapedToLiteralOutsideCharClass = 6, RULE_quote = 7, RULE_zeroWidthAssertions = 8, 
		RULE_captureGroup = 9, RULE_group = 10, RULE_range = 11, RULE_predefinedCharacterClass = 12, 
		RULE_characterClass = 13, RULE_backReference = 14, RULE_boundaryMatcherStart = 15, 
		RULE_wordBoundary = 16, RULE_nonWordBoundary = 17, RULE_inputStart = 18, 
		RULE_endOfMatch = 19, RULE_letter = 20, RULE_concatenation = 21, RULE_quantifier = 22, 
		RULE_boundaryMatcherEnd = 23, RULE_endOfInputExceptFinalTerminator = 24, 
		RULE_endOfInput = 25, RULE_or = 26, RULE_escapedFromLiteral = 27, RULE_inlineModifier = 28, 
		RULE_namedCaptureGroup = 29, RULE_nonCaptureGroup = 30, RULE_independentNonCapturingGroup = 31, 
		RULE_zeroWidthPositiveLookAhead = 32, RULE_zeroWidthNegativeLookAhead = 33, 
		RULE_zeroWidthPositiveLookBehind = 34, RULE_zeroWidthNegativeLookBehind = 35, 
		RULE_posix = 36, RULE_javalangCharacterClass = 37, RULE_unicodeScriptClass = 38, 
		RULE_extra_letters_allowed_inside_CC = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "characterClassContent", "characterClassContentHelper", 
			"escapedToLiteralInsideCharClass", "escapedToLiteralOutsideCharClass", 
			"quote", "zeroWidthAssertions", "captureGroup", "group", "range", "predefinedCharacterClass", 
			"characterClass", "backReference", "boundaryMatcherStart", "wordBoundary", 
			"nonWordBoundary", "inputStart", "endOfMatch", "letter", "concatenation", 
			"quantifier", "boundaryMatcherEnd", "endOfInputExceptFinalTerminator", 
			"endOfInput", "or", "escapedFromLiteral", "inlineModifier", "namedCaptureGroup", 
			"nonCaptureGroup", "independentNonCapturingGroup", "zeroWidthPositiveLookAhead", 
			"zeroWidthNegativeLookAhead", "zeroWidthPositiveLookBehind", "zeroWidthNegativeLookBehind", 
			"posix", "javalangCharacterClass", "unicodeScriptClass", "extra_letters_allowed_inside_CC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?'", "'>'", "'?:'", "'?>'", "'\\p{Lower}'", "'\\p{Upper}'", 
			"'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", "'\\p{Alnum}'", "'\\p{Punct}'", 
			"'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", "'\\p{Cntrl}'", "'\\p{XDigit}'", 
			"'\\p{Space}'", "'\\p{javaLowerCase}'", "'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", 
			"'\\p{javaMirrored}'", "'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", 
			"'\\p{IsAlphabetic}'", "'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", 
			"'-'", "'.'", "'^'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", 
			"'\\v'", "'\\V'", "'\\w'", "'\\W'", "'\\Q'", "'\\E'", null, null, "'&&'", 
			"'|'", "'\\+'", "'\\{'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", 
			"'\\['", "'\\.'", "'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", null, 
			null, null, null, "'+'", "'*'", "'?'", "'['", "']'", "'('", "')'", "'\\'", 
			null, null, null, null, null, null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", 
			"'\\e'", "'?='", "'?!'", "'?<='", "'?<!'", "'$'", "'\\b'", "'\\B'", "'\\A'", 
			"'\\G'", "'\\z'", "'\\Z'", "'\\R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WILDCARD", "CARET", "DIGIT", "NON_DIGIT", 
			"HORIZONTAL_WHITESPACE", "NON_HORIZONTAL_WHITESPACE", "WHITESPACE", "NON_WHITESPACE", 
			"VERTICAL_WHITESPACE", "NON_VERTICAL_WHITESPACE", "WORD", "NON_WORD", 
			"LEFT_QUOTE", "RIGHT_QUOTE", "LETTER_RANGE", "NUMBER_RANGE", "DOUBLE_AMPERSAND", 
			"PIPE", "PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", "BACKSLASH_ESCAPED", 
			"LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", "RBRACKET_ESCAPED", 
			"DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", "ASTERISK_ESCAPED", 
			"DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "N_OCCURRANCES", "MAX_QUANTIFIER", 
			"MIN_QUANTIFIER", "RANGE_QUANTIFIER", "PLUS", "ASTERISK", "QMARK", "LBRACKET", 
			"RBRACKET", "LPAREN", "RPAREN", "BACKSLASH", "OCTAL_1", "OCTAL_2", "OCTAL_3", 
			"HEXA_2", "HEXA_4", "HEXA_6", "CARRIAGE_RETURN", "TAB", "FORM_FEED", 
			"ALERT", "ESC", "POSITIVE_LA", "NEGATIVE_LA", "POSITIVE_LB", "NEGATIVE_LB", 
			"DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", "INPUT_START", "END_OF_MATCH", 
			"INPUT_END", "INPUT_END_INC_NEWLINE", "LINEBREAK_MATCHER", "LETTER", 
			"INLINEMODIFIER", "LOCAL_INLINE_MODIFIER_TEMPLATE", "N_TH_CAPTURE_GROUP", 
			"NAMED_CAPTURE_GROUP_MATCH", "NAMED_CAPTURE_GROUP_NAME"
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
			setState(80);
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
		public EscapedToLiteralOutsideCharClassContext escapedToLiteralOutsideCharClass() {
			return getRuleContext(EscapedToLiteralOutsideCharClassContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public ZeroWidthAssertionsContext zeroWidthAssertions() {
			return getRuleContext(ZeroWidthAssertionsContext.class,0);
		}
		public InlineModifierContext inlineModifier() {
			return getRuleContext(InlineModifierContext.class,0);
		}
		public CaptureGroupContext captureGroup() {
			return getRuleContext(CaptureGroupContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public BoundaryMatcherStartContext boundaryMatcherStart() {
			return getRuleContext(BoundaryMatcherStartContext.class,0);
		}
		public EscapedFromLiteralContext escapedFromLiteral() {
			return getRuleContext(EscapedFromLiteralContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public BackReferenceContext backReference() {
			return getRuleContext(BackReferenceContext.class,0);
		}
		public WordBoundaryContext wordBoundary() {
			return getRuleContext(WordBoundaryContext.class,0);
		}
		public NonWordBoundaryContext nonWordBoundary() {
			return getRuleContext(NonWordBoundaryContext.class,0);
		}
		public InputStartContext inputStart() {
			return getRuleContext(InputStartContext.class,0);
		}
		public EndOfMatchContext endOfMatch() {
			return getRuleContext(EndOfMatchContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(82);
				escapedToLiteralOutsideCharClass();
				}
				break;
			case 2:
				{
				setState(83);
				quote();
				}
				break;
			case 3:
				{
				setState(84);
				zeroWidthAssertions();
				}
				break;
			case 4:
				{
				setState(85);
				inlineModifier();
				}
				break;
			case 5:
				{
				setState(86);
				captureGroup();
				}
				break;
			case 6:
				{
				setState(87);
				group();
				}
				break;
			case 7:
				{
				setState(88);
				boundaryMatcherStart();
				}
				break;
			case 8:
				{
				setState(89);
				escapedFromLiteral();
				}
				break;
			case 9:
				{
				setState(90);
				characterClass();
				}
				break;
			case 10:
				{
				setState(91);
				backReference();
				}
				break;
			case 11:
				{
				setState(92);
				wordBoundary();
				}
				break;
			case 12:
				{
				setState(93);
				nonWordBoundary();
				}
				break;
			case 13:
				{
				setState(94);
				inputStart();
				}
				break;
			case 14:
				{
				setState(95);
				endOfMatch();
				}
				break;
			case 15:
				{
				setState(96);
				letter();
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(99);
				exprHelper();
				}
				break;
			case 2:
				{
				}
				break;
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

	public static class ExprHelperContext extends ParserRuleContext {
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public BoundaryMatcherEndContext boundaryMatcherEnd() {
			return getRuleContext(BoundaryMatcherEndContext.class,0);
		}
		public EndOfInputExceptFinalTerminatorContext endOfInputExceptFinalTerminator() {
			return getRuleContext(EndOfInputExceptFinalTerminatorContext.class,0);
		}
		public EndOfInputContext endOfInput() {
			return getRuleContext(EndOfInputContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExprHelperContext exprHelper() {
			return getRuleContext(ExprHelperContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(103);
				concatenation();
				}
				break;
			case 2:
				{
				setState(104);
				quantifier();
				}
				break;
			case 3:
				{
				setState(105);
				boundaryMatcherEnd();
				}
				break;
			case 4:
				{
				setState(106);
				endOfInputExceptFinalTerminator();
				}
				break;
			case 5:
				{
				setState(107);
				endOfInput();
				}
				break;
			case 6:
				{
				setState(108);
				or();
				}
				break;
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
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
		public CharacterClassContentHelperContext characterClassContentHelper() {
			return getRuleContext(CharacterClassContentHelperContext.class,0);
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
		public List<Extra_letters_allowed_inside_CCContext> extra_letters_allowed_inside_CC() {
			return getRuleContexts(Extra_letters_allowed_inside_CCContext.class);
		}
		public Extra_letters_allowed_inside_CCContext extra_letters_allowed_inside_CC(int i) {
			return getRuleContext(Extra_letters_allowed_inside_CCContext.class,i);
		}
		public CharacterClassContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClassContent; }
	}

	public final CharacterClassContentContext characterClassContent() throws RecognitionException {
		CharacterClassContentContext _localctx = new CharacterClassContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_characterClassContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				match(CARET);
				setState(116);
				characterClassContent();
				}
				break;
			case 2:
				{
				setState(117);
				group();
				}
				break;
			case 3:
				{
				setState(118);
				escapedToLiteralInsideCharClass();
				}
				break;
			case 4:
				{
				setState(119);
				predefinedCharacterClass();
				}
				break;
			case 5:
				{
				setState(120);
				posix();
				}
				break;
			case 6:
				{
				setState(121);
				javalangCharacterClass();
				}
				break;
			case 7:
				{
				setState(122);
				unicodeScriptClass();
				}
				break;
			case 8:
				{
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(132);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER_RANGE:
						{
						setState(123);
						match(LETTER_RANGE);
						}
						break;
					case NUMBER_RANGE:
						{
						setState(124);
						match(NUMBER_RANGE);
						}
						break;
					case T__28:
					case WILDCARD:
					case CARET:
					case PIPE:
					case PLUS:
					case ASTERISK:
					case QMARK:
					case DOLLAR_SIGN:
					case LETTER:
						{
						setState(130);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__28:
						case WILDCARD:
						case PIPE:
						case PLUS:
						case ASTERISK:
						case QMARK:
						case DOLLAR_SIGN:
						case LETTER:
							{
							setState(127);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LETTER:
								{
								setState(125);
								match(LETTER);
								}
								break;
							case T__28:
							case WILDCARD:
							case PIPE:
							case PLUS:
							case ASTERISK:
							case QMARK:
							case DOLLAR_SIGN:
								{
								setState(126);
								extra_letters_allowed_inside_CC();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						case CARET:
							{
							setState(129);
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
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << WILDCARD) | (1L << CARET) | (1L << LETTER_RANGE) | (1L << NUMBER_RANGE) | (1L << PIPE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUS - 66)) | (1L << (ASTERISK - 66)) | (1L << (QMARK - 66)) | (1L << (DOLLAR_SIGN - 66)) | (1L << (LETTER - 66)))) != 0) );
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(138);
				characterClassContentHelper();
				}
				break;
			case 2:
				{
				}
				break;
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
		enterRule(_localctx, 8, RULE_characterClassContentHelper);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(DOUBLE_AMPERSAND);
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(143);
					characterClass();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
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
				case WILDCARD:
				case CARET:
				case DIGIT:
				case NON_DIGIT:
				case HORIZONTAL_WHITESPACE:
				case NON_HORIZONTAL_WHITESPACE:
				case WHITESPACE:
				case NON_WHITESPACE:
				case VERTICAL_WHITESPACE:
				case NON_VERTICAL_WHITESPACE:
				case WORD:
				case NON_WORD:
				case LETTER_RANGE:
				case NUMBER_RANGE:
				case PIPE:
				case BACKSLASH_ESCAPED:
				case LBRACKET_ESCAPED:
				case RBRACKET_ESCAPED:
				case HYPHEN_ESCAPED:
				case PLUS:
				case ASTERISK:
				case QMARK:
				case LPAREN:
				case DOLLAR_SIGN:
				case LETTER:
					{
					setState(144);
					characterClassContent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(147);
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
				setState(151);
				characterClass();
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(152);
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
		enterRule(_localctx, 10, RULE_escapedToLiteralInsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 12, RULE_escapedToLiteralOutsideCharClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 14, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LEFT_QUOTE);
			setState(163);
			expr();
			setState(164);
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

	public static class ZeroWidthAssertionsContext extends ParserRuleContext {
		public ZeroWidthPositiveLookAheadContext zeroWidthPositiveLookAhead() {
			return getRuleContext(ZeroWidthPositiveLookAheadContext.class,0);
		}
		public ZeroWidthNegativeLookAheadContext zeroWidthNegativeLookAhead() {
			return getRuleContext(ZeroWidthNegativeLookAheadContext.class,0);
		}
		public ZeroWidthPositiveLookBehindContext zeroWidthPositiveLookBehind() {
			return getRuleContext(ZeroWidthPositiveLookBehindContext.class,0);
		}
		public ZeroWidthNegativeLookBehindContext zeroWidthNegativeLookBehind() {
			return getRuleContext(ZeroWidthNegativeLookBehindContext.class,0);
		}
		public ZeroWidthAssertionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroWidthAssertions; }
	}

	public final ZeroWidthAssertionsContext zeroWidthAssertions() throws RecognitionException {
		ZeroWidthAssertionsContext _localctx = new ZeroWidthAssertionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_zeroWidthAssertions);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				zeroWidthPositiveLookAhead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				zeroWidthNegativeLookAhead();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				zeroWidthPositiveLookBehind();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				zeroWidthNegativeLookBehind();
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

	public static class CaptureGroupContext extends ParserRuleContext {
		public NamedCaptureGroupContext namedCaptureGroup() {
			return getRuleContext(NamedCaptureGroupContext.class,0);
		}
		public NonCaptureGroupContext nonCaptureGroup() {
			return getRuleContext(NonCaptureGroupContext.class,0);
		}
		public IndependentNonCapturingGroupContext independentNonCapturingGroup() {
			return getRuleContext(IndependentNonCapturingGroupContext.class,0);
		}
		public CaptureGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureGroup; }
	}

	public final CaptureGroupContext captureGroup() throws RecognitionException {
		CaptureGroupContext _localctx = new CaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_captureGroup);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				namedCaptureGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				nonCaptureGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				independentNonCapturingGroup();
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
		public TerminalNode LPAREN() { return getToken(regex2englishParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(LPAREN);
				setState(178);
				expr();
				setState(179);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(LPAREN);
				setState(182);
				range();
				setState(183);
				match(RPAREN);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LETTER_RANGE() { return getToken(regex2englishParser.LETTER_RANGE, 0); }
		public TerminalNode NUMBER_RANGE() { return getToken(regex2englishParser.NUMBER_RANGE, 0); }
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (LETTER_RANGE - 44)) | (1L << (NUMBER_RANGE - 44)) | (1L << (RANGE_QUANTIFIER - 44)))) != 0)) ) {
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
		public TerminalNode HORIZONTAL_WHITESPACE() { return getToken(regex2englishParser.HORIZONTAL_WHITESPACE, 0); }
		public TerminalNode NON_HORIZONTAL_WHITESPACE() { return getToken(regex2englishParser.NON_HORIZONTAL_WHITESPACE, 0); }
		public TerminalNode WHITESPACE() { return getToken(regex2englishParser.WHITESPACE, 0); }
		public TerminalNode NON_WHITESPACE() { return getToken(regex2englishParser.NON_WHITESPACE, 0); }
		public TerminalNode VERTICAL_WHITESPACE() { return getToken(regex2englishParser.VERTICAL_WHITESPACE, 0); }
		public TerminalNode NON_VERTICAL_WHITESPACE() { return getToken(regex2englishParser.NON_VERTICAL_WHITESPACE, 0); }
		public TerminalNode WORD() { return getToken(regex2englishParser.WORD, 0); }
		public TerminalNode NON_WORD() { return getToken(regex2englishParser.NON_WORD, 0); }
		public PredefinedCharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedCharacterClass; }
	}

	public final PredefinedCharacterClassContext predefinedCharacterClass() throws RecognitionException {
		PredefinedCharacterClassContext _localctx = new PredefinedCharacterClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WILDCARD) | (1L << DIGIT) | (1L << NON_DIGIT) | (1L << HORIZONTAL_WHITESPACE) | (1L << NON_HORIZONTAL_WHITESPACE) | (1L << WHITESPACE) | (1L << NON_WHITESPACE) | (1L << VERTICAL_WHITESPACE) | (1L << NON_VERTICAL_WHITESPACE) | (1L << WORD) | (1L << NON_WORD))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_characterClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LBRACKET);
			setState(192);
			characterClassContent();
			setState(193);
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
		enterRule(_localctx, 28, RULE_backReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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

	public static class BoundaryMatcherStartContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(regex2englishParser.CARET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoundaryMatcherStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundaryMatcherStart; }
	}

	public final BoundaryMatcherStartContext boundaryMatcherStart() throws RecognitionException {
		BoundaryMatcherStartContext _localctx = new BoundaryMatcherStartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boundaryMatcherStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CARET);
			setState(198);
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

	public static class WordBoundaryContext extends ParserRuleContext {
		public List<TerminalNode> WORD_BOUNDARY() { return getTokens(regex2englishParser.WORD_BOUNDARY); }
		public TerminalNode WORD_BOUNDARY(int i) {
			return getToken(regex2englishParser.WORD_BOUNDARY, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WordBoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordBoundary; }
	}

	public final WordBoundaryContext wordBoundary() throws RecognitionException {
		WordBoundaryContext _localctx = new WordBoundaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wordBoundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(WORD_BOUNDARY);
			setState(201);
			expr();
			setState(202);
			match(WORD_BOUNDARY);
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

	public static class NonWordBoundaryContext extends ParserRuleContext {
		public List<TerminalNode> NON_WORD_BOUNDARY() { return getTokens(regex2englishParser.NON_WORD_BOUNDARY); }
		public TerminalNode NON_WORD_BOUNDARY(int i) {
			return getToken(regex2englishParser.NON_WORD_BOUNDARY, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NonWordBoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWordBoundary; }
	}

	public final NonWordBoundaryContext nonWordBoundary() throws RecognitionException {
		NonWordBoundaryContext _localctx = new NonWordBoundaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nonWordBoundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NON_WORD_BOUNDARY);
			setState(205);
			expr();
			setState(206);
			match(NON_WORD_BOUNDARY);
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

	public static class InputStartContext extends ParserRuleContext {
		public TerminalNode INPUT_START() { return getToken(regex2englishParser.INPUT_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InputStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStart; }
	}

	public final InputStartContext inputStart() throws RecognitionException {
		InputStartContext _localctx = new InputStartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inputStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(INPUT_START);
			setState(209);
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

	public static class EndOfMatchContext extends ParserRuleContext {
		public TerminalNode END_OF_MATCH() { return getToken(regex2englishParser.END_OF_MATCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EndOfMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfMatch; }
	}

	public final EndOfMatchContext endOfMatch() throws RecognitionException {
		EndOfMatchContext _localctx = new EndOfMatchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_endOfMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(END_OF_MATCH);
			setState(212);
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

	public static class LetterContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(regex2englishParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(regex2englishParser.LETTER, i);
		}
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_letter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(214);
					match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConcatenationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concatenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode N_OCCURRANCES() { return getToken(regex2englishParser.N_OCCURRANCES, 0); }
		public TerminalNode MAX_QUANTIFIER() { return getToken(regex2englishParser.MAX_QUANTIFIER, 0); }
		public TerminalNode MIN_QUANTIFIER() { return getToken(regex2englishParser.MIN_QUANTIFIER, 0); }
		public TerminalNode RANGE_QUANTIFIER() { return getToken(regex2englishParser.RANGE_QUANTIFIER, 0); }
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (N_OCCURRANCES - 62)) | (1L << (MAX_QUANTIFIER - 62)) | (1L << (MIN_QUANTIFIER - 62)) | (1L << (RANGE_QUANTIFIER - 62)) | (1L << (PLUS - 62)) | (1L << (ASTERISK - 62)) | (1L << (QMARK - 62)))) != 0)) ) {
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

	public static class BoundaryMatcherEndContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public BoundaryMatcherEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundaryMatcherEnd; }
	}

	public final BoundaryMatcherEndContext boundaryMatcherEnd() throws RecognitionException {
		BoundaryMatcherEndContext _localctx = new BoundaryMatcherEndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boundaryMatcherEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expr();
			setState(224);
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

	public static class EndOfInputExceptFinalTerminatorContext extends ParserRuleContext {
		public TerminalNode INPUT_END_INC_NEWLINE() { return getToken(regex2englishParser.INPUT_END_INC_NEWLINE, 0); }
		public EndOfInputExceptFinalTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfInputExceptFinalTerminator; }
	}

	public final EndOfInputExceptFinalTerminatorContext endOfInputExceptFinalTerminator() throws RecognitionException {
		EndOfInputExceptFinalTerminatorContext _localctx = new EndOfInputExceptFinalTerminatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_endOfInputExceptFinalTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(INPUT_END_INC_NEWLINE);
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

	public static class EndOfInputContext extends ParserRuleContext {
		public TerminalNode INPUT_END() { return getToken(regex2englishParser.INPUT_END, 0); }
		public EndOfInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfInput; }
	}

	public final EndOfInputContext endOfInput() throws RecognitionException {
		EndOfInputContext _localctx = new EndOfInputContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endOfInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(INPUT_END);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(PIPE);
			setState(231);
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

	public static class EscapedFromLiteralContext extends ParserRuleContext {
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public TerminalNode OCTAL_1() { return getToken(regex2englishParser.OCTAL_1, 0); }
		public TerminalNode OCTAL_2() { return getToken(regex2englishParser.OCTAL_2, 0); }
		public TerminalNode OCTAL_3() { return getToken(regex2englishParser.OCTAL_3, 0); }
		public TerminalNode HEXA_2() { return getToken(regex2englishParser.HEXA_2, 0); }
		public TerminalNode HEXA_4() { return getToken(regex2englishParser.HEXA_4, 0); }
		public TerminalNode HEXA_6() { return getToken(regex2englishParser.HEXA_6, 0); }
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
		enterRule(_localctx, 54, RULE_escapedFromLiteral);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WILDCARD:
			case DIGIT:
			case NON_DIGIT:
			case HORIZONTAL_WHITESPACE:
			case NON_HORIZONTAL_WHITESPACE:
			case WHITESPACE:
			case NON_WHITESPACE:
			case VERTICAL_WHITESPACE:
			case NON_VERTICAL_WHITESPACE:
			case WORD:
			case NON_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(HEXA_4);
				}
				break;
			case HEXA_6:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(HEXA_6);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(244);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(245);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(246);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(247);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(248);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(249);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(250);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(251);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(252);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(253);
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

	public static class InlineModifierContext extends ParserRuleContext {
		public TerminalNode INLINEMODIFIER() { return getToken(regex2englishParser.INLINEMODIFIER, 0); }
		public TerminalNode LOCAL_INLINE_MODIFIER_TEMPLATE() { return getToken(regex2englishParser.LOCAL_INLINE_MODIFIER_TEMPLATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(regex2englishParser.RPAREN, 0); }
		public InlineModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineModifier; }
	}

	public final InlineModifierContext inlineModifier() throws RecognitionException {
		InlineModifierContext _localctx = new InlineModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inlineModifier);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INLINEMODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(INLINEMODIFIER);
				}
				break;
			case LOCAL_INLINE_MODIFIER_TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(257);
				match(LOCAL_INLINE_MODIFIER_TEMPLATE);
				setState(258);
				expr();
				setState(259);
				match(RPAREN);
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
		enterRule(_localctx, 58, RULE_namedCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LPAREN);
			setState(264);
			match(T__0);
			setState(265);
			match(NAMED_CAPTURE_GROUP_NAME);
			setState(266);
			match(T__1);
			setState(267);
			expr();
			setState(268);
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
		enterRule(_localctx, 60, RULE_nonCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(LPAREN);
			setState(271);
			match(T__2);
			setState(272);
			expr();
			setState(273);
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
		enterRule(_localctx, 62, RULE_independentNonCapturingGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(276);
			match(T__3);
			setState(277);
			expr();
			setState(278);
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
		public TerminalNode POSITIVE_LA() { return getToken(regex2englishParser.POSITIVE_LA, 0); }
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
		enterRule(_localctx, 64, RULE_zeroWidthPositiveLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LPAREN);
			setState(281);
			match(POSITIVE_LA);
			setState(282);
			expr();
			setState(283);
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
		public TerminalNode NEGATIVE_LA() { return getToken(regex2englishParser.NEGATIVE_LA, 0); }
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
		enterRule(_localctx, 66, RULE_zeroWidthNegativeLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LPAREN);
			setState(286);
			match(NEGATIVE_LA);
			setState(287);
			expr();
			setState(288);
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
		public TerminalNode POSITIVE_LB() { return getToken(regex2englishParser.POSITIVE_LB, 0); }
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
		enterRule(_localctx, 68, RULE_zeroWidthPositiveLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LPAREN);
			setState(291);
			match(POSITIVE_LB);
			setState(292);
			expr();
			setState(293);
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
		public TerminalNode NEGATIVE_LB() { return getToken(regex2englishParser.NEGATIVE_LB, 0); }
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
		enterRule(_localctx, 70, RULE_zeroWidthNegativeLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LPAREN);
			setState(296);
			match(NEGATIVE_LB);
			setState(297);
			expr();
			setState(298);
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
		enterRule(_localctx, 72, RULE_posix);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new POSIX_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new POSIX_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new POSIX_ASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new POSIX_LETTERSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new POSIX_DIGITSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new POSIX_ALPHANUMERICContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new POSIX_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new POSIX_ALPHANUM_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new POSIX_WHITESPACE_OR_GLYPHContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(308);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new POSIX_SPACE_OR_TABContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(309);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new POSIX_CONTROL_CHARACTERSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(310);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new POSIX_X_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new POSIX_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(312);
				match(T__16);
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
		enterRule(_localctx, 74, RULE_javalangCharacterClass);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new JAVALANG_CC_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new JAVALANG_CC_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new JAVALANG_CC_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new JAVALANG_CC_MIRROREDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(T__20);
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
		enterRule(_localctx, 76, RULE_unicodeScriptClass);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new LATINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new GREEKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new IS_ALPHABETICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new CURRENCY_SYMBOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new NOT_GREEKContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new NOT_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(T__27);
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

	public static class Extra_letters_allowed_inside_CCContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(regex2englishParser.PLUS, 0); }
		public TerminalNode PIPE() { return getToken(regex2englishParser.PIPE, 0); }
		public TerminalNode ASTERISK() { return getToken(regex2englishParser.ASTERISK, 0); }
		public TerminalNode QMARK() { return getToken(regex2englishParser.QMARK, 0); }
		public TerminalNode WILDCARD() { return getToken(regex2englishParser.WILDCARD, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public Extra_letters_allowed_inside_CCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_letters_allowed_inside_CC; }
	}

	public final Extra_letters_allowed_inside_CCContext extra_letters_allowed_inside_CC() throws RecognitionException {
		Extra_letters_allowed_inside_CCContext _localctx = new Extra_letters_allowed_inside_CCContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_extra_letters_allowed_inside_CC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (WILDCARD - 29)) | (1L << (PIPE - 29)) | (1L << (PLUS - 29)) | (1L << (ASTERISK - 29)) | (1L << (QMARK - 29)) | (1L << (DOLLAR_SIGN - 29)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3h\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3d\n\3\3\3\3"+
		"\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\5\4t\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\5\5\u0085\n"+
		"\5\6\5\u0087\n\5\r\5\16\5\u0088\5\5\u008b\n\5\3\5\3\5\5\5\u008f\n\5\3"+
		"\6\3\6\3\6\5\6\u0094\n\6\3\6\3\6\5\6\u0098\n\6\3\6\3\6\3\6\5\6\u009d\n"+
		"\6\5\6\u009f\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00ad"+
		"\n\n\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00bc\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\6\26\u00da\n\26\r\26\16\26\u00db\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0101\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0108\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u013c\n&\3\'\3\'\3\'\3\'\5\'\u0142\n\'\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u014b\n(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\t\5\2\65\6589??\4"+
		"\2\628:>\4\2./CC\4\2  \"+\3\2fg\3\2@F\6\2\37 \61\61DF[[\2\u017d\2R\3\2"+
		"\2\2\4c\3\2\2\2\6o\3\2\2\2\b\u008a\3\2\2\2\n\u009e\3\2\2\2\f\u00a0\3\2"+
		"\2\2\16\u00a2\3\2\2\2\20\u00a4\3\2\2\2\22\u00ac\3\2\2\2\24\u00b1\3\2\2"+
		"\2\26\u00bb\3\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2"+
		"\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\"\u00ca\3\2\2\2$\u00ce\3\2\2\2&\u00d2"+
		"\3\2\2\2(\u00d5\3\2\2\2*\u00d9\3\2\2\2,\u00dd\3\2\2\2.\u00df\3\2\2\2\60"+
		"\u00e1\3\2\2\2\62\u00e4\3\2\2\2\64\u00e6\3\2\2\2\66\u00e8\3\2\2\28\u0100"+
		"\3\2\2\2:\u0107\3\2\2\2<\u0109\3\2\2\2>\u0110\3\2\2\2@\u0115\3\2\2\2B"+
		"\u011a\3\2\2\2D\u011f\3\2\2\2F\u0124\3\2\2\2H\u0129\3\2\2\2J\u013b\3\2"+
		"\2\2L\u0141\3\2\2\2N\u014a\3\2\2\2P\u014c\3\2\2\2RS\5\4\3\2S\3\3\2\2\2"+
		"Td\5\16\b\2Ud\5\20\t\2Vd\5\22\n\2Wd\5:\36\2Xd\5\24\13\2Yd\5\26\f\2Zd\5"+
		" \21\2[d\58\35\2\\d\5\34\17\2]d\5\36\20\2^d\5\"\22\2_d\5$\23\2`d\5&\24"+
		"\2ad\5(\25\2bd\5*\26\2cT\3\2\2\2cU\3\2\2\2cV\3\2\2\2cW\3\2\2\2cX\3\2\2"+
		"\2cY\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2"+
		"\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2eh\5\6\4\2fh\3\2\2\2ge\3\2"+
		"\2\2gf\3\2\2\2h\5\3\2\2\2ip\5,\27\2jp\5.\30\2kp\5\60\31\2lp\5\62\32\2"+
		"mp\5\64\33\2np\5\66\34\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2"+
		"\2\2on\3\2\2\2ps\3\2\2\2qt\5\6\4\2rt\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\7\3"+
		"\2\2\2uv\7!\2\2v\u008b\5\b\5\2w\u008b\5\26\f\2x\u008b\5\f\7\2y\u008b\5"+
		"\32\16\2z\u008b\5J&\2{\u008b\5L\'\2|\u008b\5N(\2}\u0087\7.\2\2~\u0087"+
		"\7/\2\2\177\u0082\7c\2\2\u0080\u0082\5P)\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0085\7!\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0087\3\2\2\2\u0086}\3\2\2\2\u0086~\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008au\3\2\2\2\u008aw\3\2\2\2\u008ax\3\2\2\2"+
		"\u008ay\3\2\2\2\u008az\3\2\2\2\u008a{\3\2\2\2\u008a|\3\2\2\2\u008a\u0086"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008f\5\n\6\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\t\3\2\2\2\u0090\u0093\7\60\2"+
		"\2\u0091\u0094\5\34\17\2\u0092\u0094\5\b\5\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0098\5\n\6\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009f\3\2\2\2\u0099"+
		"\u009c\5\34\17\2\u009a\u009d\5\n\6\2\u009b\u009d\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0090\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\r\3\2\2\2\u00a2"+
		"\u00a3\t\3\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a6\5\4\3\2"+
		"\u00a6\u00a7\7-\2\2\u00a7\21\3\2\2\2\u00a8\u00ad\5B\"\2\u00a9\u00ad\5"+
		"D#\2\u00aa\u00ad\5F$\2\u00ab\u00ad\5H%\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\23\3\2\2\2\u00ae"+
		"\u00b2\5<\37\2\u00af\u00b2\5> \2\u00b0\u00b2\5@!\2\u00b1\u00ae\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4"+
		"\7I\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b6\7J\2\2\u00b6\u00bc\3\2\2\2\u00b7"+
		"\u00b8\7I\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7J\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be"+
		"\t\4\2\2\u00be\31\3\2\2\2\u00bf\u00c0\t\5\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7G\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\7H\2\2\u00c4\35\3\2\2\2\u00c5"+
		"\u00c6\t\6\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7!\2\2\u00c8\u00c9\5\4\3\2"+
		"\u00c9!\3\2\2\2\u00ca\u00cb\7\\\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\7"+
		"\\\2\2\u00cd#\3\2\2\2\u00ce\u00cf\7]\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1"+
		"\7]\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d4\5\4\3\2\u00d4\'"+
		"\3\2\2\2\u00d5\u00d6\7_\2\2\u00d6\u00d7\5\4\3\2\u00d7)\3\2\2\2\u00d8\u00da"+
		"\7c\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00de\5\4\3\2\u00de-\3\2\2\2\u00df"+
		"\u00e0\t\7\2\2\u00e0/\3\2\2\2\u00e1\u00e2\5\4\3\2\u00e2\u00e3\7[\2\2\u00e3"+
		"\61\3\2\2\2\u00e4\u00e5\7a\2\2\u00e5\63\3\2\2\2\u00e6\u00e7\7`\2\2\u00e7"+
		"\65\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\5\4\3\2\u00ea\67\3\2\2\2"+
		"\u00eb\u0101\5\32\16\2\u00ec\u0101\7L\2\2\u00ed\u0101\7M\2\2\u00ee\u0101"+
		"\7N\2\2\u00ef\u0101\7O\2\2\u00f0\u0101\7P\2\2\u00f1\u0101\7Q\2\2\u00f2"+
		"\u0101\7R\2\2\u00f3\u0101\7S\2\2\u00f4\u0101\7T\2\2\u00f5\u0101\7U\2\2"+
		"\u00f6\u0101\7V\2\2\u00f7\u0101\7!\2\2\u00f8\u0101\7[\2\2\u00f9\u0101"+
		"\7\\\2\2\u00fa\u0101\7]\2\2\u00fb\u0101\7^\2\2\u00fc\u0101\7_\2\2\u00fd"+
		"\u0101\7`\2\2\u00fe\u0101\7a\2\2\u00ff\u0101\7b\2\2\u0100\u00eb\3\2\2"+
		"\2\u0100\u00ec\3\2\2\2\u0100\u00ed\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00ef"+
		"\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f2\3\2\2\2\u0100"+
		"\u00f3\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f6\3\2"+
		"\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u01019\3\2\2\2\u0102\u0108"+
		"\7d\2\2\u0103\u0104\7e\2\2\u0104\u0105\5\4\3\2\u0105\u0106\7J\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0108;\3\2\2\2"+
		"\u0109\u010a\7I\2\2\u010a\u010b\7\3\2\2\u010b\u010c\7h\2\2\u010c\u010d"+
		"\7\4\2\2\u010d\u010e\5\4\3\2\u010e\u010f\7J\2\2\u010f=\3\2\2\2\u0110\u0111"+
		"\7I\2\2\u0111\u0112\7\5\2\2\u0112\u0113\5\4\3\2\u0113\u0114\7J\2\2\u0114"+
		"?\3\2\2\2\u0115\u0116\7I\2\2\u0116\u0117\7\6\2\2\u0117\u0118\5\4\3\2\u0118"+
		"\u0119\7J\2\2\u0119A\3\2\2\2\u011a\u011b\7I\2\2\u011b\u011c\7W\2\2\u011c"+
		"\u011d\5\4\3\2\u011d\u011e\7J\2\2\u011eC\3\2\2\2\u011f\u0120\7I\2\2\u0120"+
		"\u0121\7X\2\2\u0121\u0122\5\4\3\2\u0122\u0123\7J\2\2\u0123E\3\2\2\2\u0124"+
		"\u0125\7I\2\2\u0125\u0126\7Y\2\2\u0126\u0127\5\4\3\2\u0127\u0128\7J\2"+
		"\2\u0128G\3\2\2\2\u0129\u012a\7I\2\2\u012a\u012b\7Z\2\2\u012b\u012c\5"+
		"\4\3\2\u012c\u012d\7J\2\2\u012dI\3\2\2\2\u012e\u013c\7\7\2\2\u012f\u013c"+
		"\7\b\2\2\u0130\u013c\7\t\2\2\u0131\u013c\7\n\2\2\u0132\u013c\7\13\2\2"+
		"\u0133\u013c\7\f\2\2\u0134\u013c\7\r\2\2\u0135\u013c\7\16\2\2\u0136\u013c"+
		"\7\17\2\2\u0137\u013c\7\20\2\2\u0138\u013c\7\21\2\2\u0139\u013c\7\22\2"+
		"\2\u013a\u013c\7\23\2\2\u013b\u012e\3\2\2\2\u013b\u012f\3\2\2\2\u013b"+
		"\u0130\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013cK\3\2\2\2\u013d\u0142\7\24\2\2\u013e\u0142\7\25\2\2\u013f\u0142"+
		"\7\26\2\2\u0140\u0142\7\27\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142M\3\2\2\2\u0143\u014b\7"+
		"\30\2\2\u0144\u014b\7\31\2\2\u0145\u014b\7\32\2\2\u0146\u014b\7\33\2\2"+
		"\u0147\u014b\7\34\2\2\u0148\u014b\7\35\2\2\u0149\u014b\7\36\2\2\u014a"+
		"\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2"+
		"\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"O\3\2\2\2\u014c\u014d\t\b\2\2\u014dQ\3\2\2\2\31cgos\u0081\u0084\u0086"+
		"\u0088\u008a\u008e\u0093\u0097\u009c\u009e\u00ac\u00b1\u00bb\u00db\u0100"+
		"\u0107\u013b\u0141\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}