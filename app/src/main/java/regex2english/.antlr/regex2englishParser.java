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
		T__31=32, WILDCARD=33, CARET=34, DIGIT=35, NON_DIGIT=36, HORIZONTAL_WHITESPACE=37, 
		NON_HORIZONTAL_WHITESPACE=38, WHITESPACE=39, NON_WHITESPACE=40, VERTICAL_WHITESPACE=41, 
		NON_VERTICAL_WHITESPACE=42, WORD=43, NON_WORD=44, LEFT_QUOTE=45, RIGHT_QUOTE=46, 
		LETTER_RANGE=47, NUMBER_RANGE=48, DOUBLE_AMPERSAND=49, PIPE=50, PLUS_ESCAPED=51, 
		LBRACE_ESCAPED=52, PIPE_ESCAPED=53, BACKSLASH_ESCAPED=54, LPAREN_ESCAPED=55, 
		RPAREN_ESCAPED=56, LBRACKET_ESCAPED=57, RBRACKET_ESCAPED=58, DOT_ESCAPED=59, 
		CARET_ESCAPED=60, QMARK_ESCAPED=61, ASTERISK_ESCAPED=62, DOLLAR_SIGN_ESCAPED=63, 
		HYPHEN_ESCAPED=64, N_OCCURRANCES=65, MAX_QUANTIFIER=66, MIN_QUANTIFIER=67, 
		RANGE_QUANTIFIER=68, PLUS=69, ASTERISK=70, QMARK=71, LBRACKET=72, RBRACKET=73, 
		LPAREN=74, RPAREN=75, BACKSLASH=76, OCTAL_1=77, OCTAL_2=78, OCTAL_3=79, 
		HEXA_2=80, HEXA_4=81, CODE_POINT=82, CARRIAGE_RETURN=83, TAB=84, FORM_FEED=85, 
		ALERT=86, ESC=87, DOLLAR_SIGN=88, WORD_BOUNDARY=89, NON_WORD_BOUNDARY=90, 
		INPUT_START=91, END_OF_MATCH=92, INPUT_END=93, INPUT_END_INC_NEWLINE=94, 
		LINEBREAK_MATCHER=95, LETTER=96, EXTRA_LETTER_ALLOWED_INSIDE=97, INLINEMODIFIER=98, 
		LOCAL_INLINE_MODIFIER_TEMPLATE=99, N_TH_CAPTURE_GROUP=100, NAMED_CAPTURE_GROUP_MATCH=101, 
		NAMED_CAPTURE_GROUP_NAME=102;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprHelper = 2, RULE_characterClassContent = 3, 
		RULE_characterClassContentHelper = 4, RULE_escapedToLiteralInsideCharClass = 5, 
		RULE_escapedToLiteralOutsideCharClass = 6, RULE_quote = 7, RULE_zeroWidthAssertions = 8, 
		RULE_captureGroup = 9, RULE_group = 10, RULE_predefinedCharacterClass = 11, 
		RULE_characterClass = 12, RULE_backReference = 13, RULE_boundaryMatcherStart = 14, 
		RULE_wordBoundary = 15, RULE_nonWordBoundary = 16, RULE_inputStart = 17, 
		RULE_endOfMatch = 18, RULE_letter = 19, RULE_concatenation = 20, RULE_quantifier = 21, 
		RULE_boundaryMatcherEnd = 22, RULE_endOfInputExceptFinalTerminator = 23, 
		RULE_endOfOnput = 24, RULE_or = 25, RULE_escapedFromLiteral = 26, RULE_inlineModifier = 27, 
		RULE_namedCaptureGroup = 28, RULE_nonCaptureGroup = 29, RULE_independentNonCapturingGroup = 30, 
		RULE_zeroWidthPositiveLookAhead = 31, RULE_zeroWidthNegativeLookAhead = 32, 
		RULE_zeroWidthPositiveLookBehind = 33, RULE_zeroWidthNegativeLookBehind = 34, 
		RULE_posix = 35, RULE_javalangCharacterClass = 36, RULE_unicodeScriptClass = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprHelper", "characterClassContent", "characterClassContentHelper", 
			"escapedToLiteralInsideCharClass", "escapedToLiteralOutsideCharClass", 
			"quote", "zeroWidthAssertions", "captureGroup", "group", "predefinedCharacterClass", 
			"characterClass", "backReference", "boundaryMatcherStart", "wordBoundary", 
			"nonWordBoundary", "inputStart", "endOfMatch", "letter", "concatenation", 
			"quantifier", "boundaryMatcherEnd", "endOfInputExceptFinalTerminator", 
			"endOfOnput", "or", "escapedFromLiteral", "inlineModifier", "namedCaptureGroup", 
			"nonCaptureGroup", "independentNonCapturingGroup", "zeroWidthPositiveLookAhead", 
			"zeroWidthNegativeLookAhead", "zeroWidthPositiveLookBehind", "zeroWidthNegativeLookBehind", 
			"posix", "javalangCharacterClass", "unicodeScriptClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?'", "'>'", "'?:'", "'?>'", "'?='", "'?!'", "'?<='", "'?<!'", 
			"'\\p{Lower}'", "'\\p{Upper}'", "'\\p{ASCII}'", "'\\p{Alpha}'", "'\\p{Digit}'", 
			"'\\p{Alnum}'", "'\\p{Punct}'", "'\\p{Graph}'", "'\\p{Print}'", "'\\p{Blank}'", 
			"'\\p{Cntrl}'", "'\\p{XDigit}'", "'\\p{Space}'", "'\\p{javaLowerCase}'", 
			"'\\p{javaUpperCase}'", "'\\p{javaWhitespace}'", "'\\p{javaMirrored}'", 
			"'\\p{IsLatin}'", "'\\p{InGreek}'", "'\\p{Lu}'", "'\\p{IsAlphabetic}'", 
			"'\\p{Sc}'", "'\\P{InGreek}'", "'[\\p{L}&&[^\\p{Lu}]]'", "'.'", "'^'", 
			"'\\d'", "'\\D'", "'\\h'", "'\\H'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", 
			"'\\w'", "'\\W'", "'\\Q'", "'\\E'", null, null, "'&&'", "'|'", "'\\+'", 
			"'\\{'", "'\\|'", "'\\\\'", "'\\('", "'\\)'", "'\\]'", "'\\['", "'\\.'", 
			"'\\^'", "'\\?'", "'\\*'", "'\\$'", "'\\-'", null, null, null, null, 
			"'+'", "'*'", "'?'", "'['", "']'", "'('", "')'", "'\\'", null, null, 
			null, null, null, null, "'\\r'", "'\\t'", "'\\f'", "'\\a'", "'\\e'", 
			"'$'", "'\\b'", "'\\B'", "'\\A'", "'\\G'", "'\\z'", "'\\Z'", "'\\R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WILDCARD", "CARET", 
			"DIGIT", "NON_DIGIT", "HORIZONTAL_WHITESPACE", "NON_HORIZONTAL_WHITESPACE", 
			"WHITESPACE", "NON_WHITESPACE", "VERTICAL_WHITESPACE", "NON_VERTICAL_WHITESPACE", 
			"WORD", "NON_WORD", "LEFT_QUOTE", "RIGHT_QUOTE", "LETTER_RANGE", "NUMBER_RANGE", 
			"DOUBLE_AMPERSAND", "PIPE", "PLUS_ESCAPED", "LBRACE_ESCAPED", "PIPE_ESCAPED", 
			"BACKSLASH_ESCAPED", "LPAREN_ESCAPED", "RPAREN_ESCAPED", "LBRACKET_ESCAPED", 
			"RBRACKET_ESCAPED", "DOT_ESCAPED", "CARET_ESCAPED", "QMARK_ESCAPED", 
			"ASTERISK_ESCAPED", "DOLLAR_SIGN_ESCAPED", "HYPHEN_ESCAPED", "N_OCCURRANCES", 
			"MAX_QUANTIFIER", "MIN_QUANTIFIER", "RANGE_QUANTIFIER", "PLUS", "ASTERISK", 
			"QMARK", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "BACKSLASH", "OCTAL_1", 
			"OCTAL_2", "OCTAL_3", "HEXA_2", "HEXA_4", "CODE_POINT", "CARRIAGE_RETURN", 
			"TAB", "FORM_FEED", "ALERT", "ESC", "DOLLAR_SIGN", "WORD_BOUNDARY", "NON_WORD_BOUNDARY", 
			"INPUT_START", "END_OF_MATCH", "INPUT_END", "INPUT_END_INC_NEWLINE", 
			"LINEBREAK_MATCHER", "LETTER", "EXTRA_LETTER_ALLOWED_INSIDE", "INLINEMODIFIER", 
			"LOCAL_INLINE_MODIFIER_TEMPLATE", "N_TH_CAPTURE_GROUP", "NAMED_CAPTURE_GROUP_MATCH", 
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
			setState(76);
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
		public PredefinedCharacterClassContext predefinedCharacterClass() {
			return getRuleContext(PredefinedCharacterClassContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public BackReferenceContext backReference() {
			return getRuleContext(BackReferenceContext.class,0);
		}
		public BoundaryMatcherStartContext boundaryMatcherStart() {
			return getRuleContext(BoundaryMatcherStartContext.class,0);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(78);
				escapedToLiteralOutsideCharClass();
				}
				break;
			case 2:
				{
				setState(79);
				quote();
				}
				break;
			case 3:
				{
				setState(80);
				zeroWidthAssertions();
				}
				break;
			case 4:
				{
				setState(81);
				inlineModifier();
				}
				break;
			case 5:
				{
				setState(82);
				captureGroup();
				}
				break;
			case 6:
				{
				setState(83);
				group();
				}
				break;
			case 7:
				{
				setState(84);
				predefinedCharacterClass();
				}
				break;
			case 8:
				{
				setState(85);
				characterClass();
				}
				break;
			case 9:
				{
				setState(86);
				backReference();
				}
				break;
			case 10:
				{
				setState(87);
				boundaryMatcherStart();
				}
				break;
			case 11:
				{
				setState(88);
				wordBoundary();
				}
				break;
			case 12:
				{
				setState(89);
				nonWordBoundary();
				}
				break;
			case 13:
				{
				setState(90);
				inputStart();
				}
				break;
			case 14:
				{
				setState(91);
				endOfMatch();
				}
				break;
			case 15:
				{
				setState(92);
				letter();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(95);
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
		public EndOfOnputContext endOfOnput() {
			return getRuleContext(EndOfOnputContext.class,0);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case LETTER:
			case INLINEMODIFIER:
			case LOCAL_INLINE_MODIFIER_TEMPLATE:
			case N_TH_CAPTURE_GROUP:
			case NAMED_CAPTURE_GROUP_MATCH:
				{
				setState(99);
				concatenation();
				}
				break;
			case N_OCCURRANCES:
			case MAX_QUANTIFIER:
			case MIN_QUANTIFIER:
			case RANGE_QUANTIFIER:
			case PLUS:
			case ASTERISK:
			case QMARK:
				{
				setState(100);
				quantifier();
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(101);
				boundaryMatcherEnd();
				}
				break;
			case INPUT_END_INC_NEWLINE:
				{
				setState(102);
				endOfInputExceptFinalTerminator();
				}
				break;
			case INPUT_END:
				{
				setState(103);
				endOfOnput();
				}
				break;
			case PIPE:
				{
				setState(104);
				or();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(107);
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
		enterRule(_localctx, 6, RULE_characterClassContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111);
				match(CARET);
				setState(112);
				characterClassContent();
				}
				break;
			case 2:
				{
				setState(113);
				escapedToLiteralInsideCharClass();
				}
				break;
			case 3:
				{
				setState(114);
				predefinedCharacterClass();
				}
				break;
			case 4:
				{
				setState(115);
				posix();
				}
				break;
			case 5:
				{
				setState(116);
				javalangCharacterClass();
				}
				break;
			case 6:
				{
				setState(117);
				unicodeScriptClass();
				}
				break;
			case 7:
				{
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER_RANGE:
						{
						setState(118);
						match(LETTER_RANGE);
						}
						break;
					case NUMBER_RANGE:
						{
						setState(119);
						match(NUMBER_RANGE);
						}
						break;
					case CARET:
					case LETTER:
					case EXTRA_LETTER_ALLOWED_INSIDE:
						{
						setState(122);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LETTER:
						case EXTRA_LETTER_ALLOWED_INSIDE:
							{
							setState(120);
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
							setState(121);
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
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (CARET - 34)) | (1L << (LETTER_RANGE - 34)) | (1L << (NUMBER_RANGE - 34)) | (1L << (LETTER - 34)) | (1L << (EXTRA_LETTER_ALLOWED_INSIDE - 34)))) != 0) );
				}
				break;
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_AMPERSAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(DOUBLE_AMPERSAND);
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(135);
					characterClass();
					}
					break;
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
				case T__29:
				case T__30:
				case T__31:
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
				case BACKSLASH_ESCAPED:
				case LBRACKET_ESCAPED:
				case RBRACKET_ESCAPED:
				case HYPHEN_ESCAPED:
				case LETTER:
				case EXTRA_LETTER_ALLOWED_INSIDE:
					{
					setState(136);
					characterClassContent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(139);
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
				setState(143);
				characterClass();
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(144);
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
			setState(150);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (BACKSLASH_ESCAPED - 54)) | (1L << (LBRACKET_ESCAPED - 54)) | (1L << (RBRACKET_ESCAPED - 54)) | (1L << (HYPHEN_ESCAPED - 54)))) != 0)) ) {
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
			setState(152);
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
			setState(154);
			match(LEFT_QUOTE);
			setState(155);
			expr();
			setState(156);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				zeroWidthPositiveLookAhead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				zeroWidthNegativeLookAhead();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				zeroWidthPositiveLookBehind();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				namedCaptureGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				nonCaptureGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
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
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LPAREN);
			setState(170);
			expr();
			setState(171);
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
		enterRule(_localctx, 22, RULE_predefinedCharacterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 24, RULE_characterClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LBRACKET);
			setState(176);
			characterClassContent();
			setState(177);
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
		enterRule(_localctx, 26, RULE_backReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 28, RULE_boundaryMatcherStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(CARET);
			setState(182);
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
		enterRule(_localctx, 30, RULE_wordBoundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WORD_BOUNDARY);
			setState(185);
			expr();
			setState(186);
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
		enterRule(_localctx, 32, RULE_nonWordBoundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(NON_WORD_BOUNDARY);
			setState(189);
			expr();
			setState(190);
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
		enterRule(_localctx, 34, RULE_inputStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(INPUT_START);
			setState(193);
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
		enterRule(_localctx, 36, RULE_endOfMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(END_OF_MATCH);
			setState(196);
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
		enterRule(_localctx, 38, RULE_letter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 40, RULE_concatenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 42, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (N_OCCURRANCES - 65)) | (1L << (MAX_QUANTIFIER - 65)) | (1L << (MIN_QUANTIFIER - 65)) | (1L << (RANGE_QUANTIFIER - 65)) | (1L << (PLUS - 65)) | (1L << (ASTERISK - 65)) | (1L << (QMARK - 65)))) != 0)) ) {
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
		public TerminalNode DOLLAR_SIGN() { return getToken(regex2englishParser.DOLLAR_SIGN, 0); }
		public BoundaryMatcherEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundaryMatcherEnd; }
	}

	public final BoundaryMatcherEndContext boundaryMatcherEnd() throws RecognitionException {
		BoundaryMatcherEndContext _localctx = new BoundaryMatcherEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boundaryMatcherEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 46, RULE_endOfInputExceptFinalTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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

	public static class EndOfOnputContext extends ParserRuleContext {
		public TerminalNode INPUT_END() { return getToken(regex2englishParser.INPUT_END, 0); }
		public EndOfOnputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfOnput; }
	}

	public final EndOfOnputContext endOfOnput() throws RecognitionException {
		EndOfOnputContext _localctx = new EndOfOnputContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_endOfOnput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 50, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PIPE);
			setState(214);
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
		enterRule(_localctx, 52, RULE_escapedFromLiteral);
		try {
			setState(237);
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
				setState(216);
				predefinedCharacterClass();
				}
				break;
			case OCTAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(OCTAL_1);
				}
				break;
			case OCTAL_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(OCTAL_2);
				}
				break;
			case OCTAL_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(OCTAL_3);
				}
				break;
			case HEXA_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(HEXA_2);
				}
				break;
			case HEXA_4:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(HEXA_4);
				}
				break;
			case CODE_POINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				match(CODE_POINT);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				match(CARRIAGE_RETURN);
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				match(TAB);
				}
				break;
			case FORM_FEED:
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				match(FORM_FEED);
				}
				break;
			case ALERT:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				match(ALERT);
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 12);
				{
				setState(227);
				match(ESC);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				match(CARET);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				match(DOLLAR_SIGN);
				}
				break;
			case WORD_BOUNDARY:
				enterOuterAlt(_localctx, 15);
				{
				setState(230);
				match(WORD_BOUNDARY);
				}
				break;
			case NON_WORD_BOUNDARY:
				enterOuterAlt(_localctx, 16);
				{
				setState(231);
				match(NON_WORD_BOUNDARY);
				}
				break;
			case INPUT_START:
				enterOuterAlt(_localctx, 17);
				{
				setState(232);
				match(INPUT_START);
				}
				break;
			case END_OF_MATCH:
				enterOuterAlt(_localctx, 18);
				{
				setState(233);
				match(END_OF_MATCH);
				}
				break;
			case INPUT_END:
				enterOuterAlt(_localctx, 19);
				{
				setState(234);
				match(INPUT_END);
				}
				break;
			case INPUT_END_INC_NEWLINE:
				enterOuterAlt(_localctx, 20);
				{
				setState(235);
				match(INPUT_END_INC_NEWLINE);
				}
				break;
			case LINEBREAK_MATCHER:
				enterOuterAlt(_localctx, 21);
				{
				setState(236);
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
		enterRule(_localctx, 54, RULE_inlineModifier);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INLINEMODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(INLINEMODIFIER);
				}
				break;
			case LOCAL_INLINE_MODIFIER_TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(240);
				match(LOCAL_INLINE_MODIFIER_TEMPLATE);
				setState(241);
				expr();
				setState(242);
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
		enterRule(_localctx, 56, RULE_namedCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(LPAREN);
			setState(247);
			match(T__0);
			setState(248);
			match(NAMED_CAPTURE_GROUP_NAME);
			setState(249);
			match(T__1);
			setState(250);
			expr();
			setState(251);
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
		enterRule(_localctx, 58, RULE_nonCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LPAREN);
			setState(254);
			match(T__2);
			setState(255);
			expr();
			setState(256);
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
		enterRule(_localctx, 60, RULE_independentNonCapturingGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LPAREN);
			setState(259);
			match(T__3);
			setState(260);
			expr();
			setState(261);
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
		enterRule(_localctx, 62, RULE_zeroWidthPositiveLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LPAREN);
			setState(264);
			match(T__4);
			setState(265);
			expr();
			setState(266);
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
		enterRule(_localctx, 64, RULE_zeroWidthNegativeLookAhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LPAREN);
			setState(269);
			match(T__5);
			setState(270);
			expr();
			setState(271);
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
		enterRule(_localctx, 66, RULE_zeroWidthPositiveLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAREN);
			setState(274);
			match(T__6);
			setState(275);
			expr();
			setState(276);
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
		enterRule(_localctx, 68, RULE_zeroWidthNegativeLookBehind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LPAREN);
			setState(279);
			match(T__7);
			setState(280);
			expr();
			setState(281);
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
		enterRule(_localctx, 70, RULE_posix);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new POSIX_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new POSIX_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new POSIX_ASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new POSIX_LETTERSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new POSIX_DIGITSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new POSIX_ALPHANUMERICContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new POSIX_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new POSIX_ALPHANUM_PUNCTUATIONContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new POSIX_WHITESPACE_OR_GLYPHContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new POSIX_SPACE_OR_TABContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(292);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new POSIX_CONTROL_CHARACTERSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(293);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new POSIX_X_DIGITContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(294);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new POSIX_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(295);
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
		enterRule(_localctx, 72, RULE_javalangCharacterClass);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new JAVALANG_CC_LOWERCASEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new JAVALANG_CC_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new JAVALANG_CC_WHITESPACEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new JAVALANG_CC_MIRROREDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(T__24);
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
		enterRule(_localctx, 74, RULE_unicodeScriptClass);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new LATINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new GREEKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new IS_ALPHABETICContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new CURRENCY_SYMBOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new NOT_GREEKContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new NOT_UPPERCASEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(T__31);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3h\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\3\3\3\5\3d\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5}\n\5\6\5\177\n\5\r\5\16\5\u0080\5\5\u0083\n"+
		"\5\3\5\3\5\5\5\u0087\n\5\3\6\3\6\3\6\5\6\u008c\n\6\3\6\3\6\5\6\u0090\n"+
		"\6\3\6\3\6\3\6\5\6\u0095\n\6\5\6\u0097\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\13\5\13\u00aa\n\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\6\25\u00ca\n\25\r\25\16\25\u00cb\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f0"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u00f7\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u012b\n%\3&\3&\3&\3&\5&\u0131\n&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u013a\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\b\3\2bc\5\288;<BB\4\2\65;=A\4\2"+
		"##%.\3\2fg\3\2CI\2\u0169\2N\3\2\2\2\4_\3\2\2\2\6k\3\2\2\2\b\u0082\3\2"+
		"\2\2\n\u0096\3\2\2\2\f\u0098\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2\2"+
		"\22\u00a4\3\2\2\2\24\u00a9\3\2\2\2\26\u00ab\3\2\2\2\30\u00af\3\2\2\2\32"+
		"\u00b1\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00ba\3\2\2\2\"\u00be"+
		"\3\2\2\2$\u00c2\3\2\2\2&\u00c5\3\2\2\2(\u00c9\3\2\2\2*\u00cd\3\2\2\2,"+
		"\u00cf\3\2\2\2.\u00d1\3\2\2\2\60\u00d3\3\2\2\2\62\u00d5\3\2\2\2\64\u00d7"+
		"\3\2\2\2\66\u00ef\3\2\2\28\u00f6\3\2\2\2:\u00f8\3\2\2\2<\u00ff\3\2\2\2"+
		">\u0104\3\2\2\2@\u0109\3\2\2\2B\u010e\3\2\2\2D\u0113\3\2\2\2F\u0118\3"+
		"\2\2\2H\u012a\3\2\2\2J\u0130\3\2\2\2L\u0139\3\2\2\2NO\5\4\3\2O\3\3\2\2"+
		"\2P`\5\16\b\2Q`\5\20\t\2R`\5\22\n\2S`\58\35\2T`\5\24\13\2U`\5\26\f\2V"+
		"`\5\30\r\2W`\5\32\16\2X`\5\34\17\2Y`\5\36\20\2Z`\5 \21\2[`\5\"\22\2\\"+
		"`\5$\23\2]`\5&\24\2^`\5(\25\2_P\3\2\2\2_Q\3\2\2\2_R\3\2\2\2_S\3\2\2\2"+
		"_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2"+
		"_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2ad\5\6\4\2bd\3\2\2"+
		"\2ca\3\2\2\2cb\3\2\2\2d\5\3\2\2\2el\5*\26\2fl\5,\27\2gl\5.\30\2hl\5\60"+
		"\31\2il\5\62\32\2jl\5\64\33\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2"+
		"ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mp\5\6\4\2np\3\2\2\2om\3\2\2\2on\3\2\2\2"+
		"p\7\3\2\2\2qr\7$\2\2r\u0083\5\b\5\2s\u0083\5\f\7\2t\u0083\5\30\r\2u\u0083"+
		"\5H%\2v\u0083\5J&\2w\u0083\5L\'\2x\177\7\61\2\2y\177\7\62\2\2z}\t\2\2"+
		"\2{}\7$\2\2|z\3\2\2\2|{\3\2\2\2}\177\3\2\2\2~x\3\2\2\2~y\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082q\3\2\2\2\u0082s\3\2\2\2\u0082t\3\2\2\2\u0082u\3\2\2\2\u0082"+
		"v\3\2\2\2\u0082w\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0087"+
		"\5\n\6\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\t\3\2\2\2\u0088\u008b\7\63\2\2\u0089\u008c\5\32\16\2\u008a\u008c\5\b"+
		"\5\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u0090\5\n\6\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0097\3\2\2\2\u0091\u0094\5\32\16\2\u0092\u0095\5\n\6\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0088\3\2\2\2\u0096\u0091\3\2\2\2\u0097\13\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099\r\3\2\2\2\u009a\u009b\t\4\2\2\u009b\17\3\2\2\2\u009c\u009d"+
		"\7/\2\2\u009d\u009e\5\4\3\2\u009e\u009f\7\60\2\2\u009f\21\3\2\2\2\u00a0"+
		"\u00a5\5@!\2\u00a1\u00a5\5B\"\2\u00a2\u00a5\5D#\2\u00a3\u00a5\5F$\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\23\3\2\2\2\u00a6\u00aa\5:\36\2\u00a7\u00aa\5<\37\2\u00a8\u00aa"+
		"\5> \2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\25\3\2\2\2\u00ab\u00ac\7L\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7M\2\2"+
		"\u00ae\27\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7J"+
		"\2\2\u00b2\u00b3\5\b\5\2\u00b3\u00b4\7K\2\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\t\6\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\5\4\3\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\7[\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7[\2\2"+
		"\u00bd!\3\2\2\2\u00be\u00bf\7\\\2\2\u00bf\u00c0\5\4\3\2\u00c0\u00c1\7"+
		"\\\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7]\2\2\u00c3\u00c4\5\4\3\2\u00c4%\3"+
		"\2\2\2\u00c5\u00c6\7^\2\2\u00c6\u00c7\5\4\3\2\u00c7\'\3\2\2\2\u00c8\u00ca"+
		"\7b\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00ce\5\4\3\2\u00ce+\3\2\2\2\u00cf"+
		"\u00d0\t\7\2\2\u00d0-\3\2\2\2\u00d1\u00d2\7Z\2\2\u00d2/\3\2\2\2\u00d3"+
		"\u00d4\7`\2\2\u00d4\61\3\2\2\2\u00d5\u00d6\7_\2\2\u00d6\63\3\2\2\2\u00d7"+
		"\u00d8\7\64\2\2\u00d8\u00d9\5\4\3\2\u00d9\65\3\2\2\2\u00da\u00f0\5\30"+
		"\r\2\u00db\u00f0\7O\2\2\u00dc\u00f0\7P\2\2\u00dd\u00f0\7Q\2\2\u00de\u00f0"+
		"\7R\2\2\u00df\u00f0\7S\2\2\u00e0\u00f0\7T\2\2\u00e1\u00f0\7U\2\2\u00e2"+
		"\u00f0\7V\2\2\u00e3\u00f0\7W\2\2\u00e4\u00f0\7X\2\2\u00e5\u00f0\7Y\2\2"+
		"\u00e6\u00f0\7$\2\2\u00e7\u00f0\7Z\2\2\u00e8\u00f0\7[\2\2\u00e9\u00f0"+
		"\7\\\2\2\u00ea\u00f0\7]\2\2\u00eb\u00f0\7^\2\2\u00ec\u00f0\7_\2\2\u00ed"+
		"\u00f0\7`\2\2\u00ee\u00f0\7a\2\2\u00ef\u00da\3\2\2\2\u00ef\u00db\3\2\2"+
		"\2\u00ef\u00dc\3\2\2\2\u00ef\u00dd\3\2\2\2\u00ef\u00de\3\2\2\2\u00ef\u00df"+
		"\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e1\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef"+
		"\u00e3\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e6\3\2"+
		"\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef"+
		"\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\67\3\2\2\2\u00f1\u00f7\7d\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7M\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f79\3\2\2\2\u00f8\u00f9\7L\2\2\u00f9"+
		"\u00fa\7\3\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd\5\4"+
		"\3\2\u00fd\u00fe\7M\2\2\u00fe;\3\2\2\2\u00ff\u0100\7L\2\2\u0100\u0101"+
		"\7\5\2\2\u0101\u0102\5\4\3\2\u0102\u0103\7M\2\2\u0103=\3\2\2\2\u0104\u0105"+
		"\7L\2\2\u0105\u0106\7\6\2\2\u0106\u0107\5\4\3\2\u0107\u0108\7M\2\2\u0108"+
		"?\3\2\2\2\u0109\u010a\7L\2\2\u010a\u010b\7\7\2\2\u010b\u010c\5\4\3\2\u010c"+
		"\u010d\7M\2\2\u010dA\3\2\2\2\u010e\u010f\7L\2\2\u010f\u0110\7\b\2\2\u0110"+
		"\u0111\5\4\3\2\u0111\u0112\7M\2\2\u0112C\3\2\2\2\u0113\u0114\7L\2\2\u0114"+
		"\u0115\7\t\2\2\u0115\u0116\5\4\3\2\u0116\u0117\7M\2\2\u0117E\3\2\2\2\u0118"+
		"\u0119\7L\2\2\u0119\u011a\7\n\2\2\u011a\u011b\5\4\3\2\u011b\u011c\7M\2"+
		"\2\u011cG\3\2\2\2\u011d\u012b\7\13\2\2\u011e\u012b\7\f\2\2\u011f\u012b"+
		"\7\r\2\2\u0120\u012b\7\16\2\2\u0121\u012b\7\17\2\2\u0122\u012b\7\20\2"+
		"\2\u0123\u012b\7\21\2\2\u0124\u012b\7\22\2\2\u0125\u012b\7\23\2\2\u0126"+
		"\u012b\7\24\2\2\u0127\u012b\7\25\2\2\u0128\u012b\7\26\2\2\u0129\u012b"+
		"\7\27\2\2\u012a\u011d\3\2\2\2\u012a\u011e\3\2\2\2\u012a\u011f\3\2\2\2"+
		"\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0123"+
		"\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012bI\3\2\2\2"+
		"\u012c\u0131\7\30\2\2\u012d\u0131\7\31\2\2\u012e\u0131\7\32\2\2\u012f"+
		"\u0131\7\33\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3"+
		"\2\2\2\u0130\u012f\3\2\2\2\u0131K\3\2\2\2\u0132\u013a\7\34\2\2\u0133\u013a"+
		"\7\35\2\2\u0134\u013a\7\36\2\2\u0135\u013a\7\37\2\2\u0136\u013a\7 \2\2"+
		"\u0137\u013a\7!\2\2\u0138\u013a\7\"\2\2\u0139\u0132\3\2\2\2\u0139\u0133"+
		"\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aM\3\2\2\2\27_cko|~\u0080\u0082"+
		"\u0086\u008b\u008f\u0094\u0096\u00a4\u00a9\u00cb\u00ef\u00f6\u012a\u0130"+
		"\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}