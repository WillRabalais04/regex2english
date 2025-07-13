// Generated from regex2english.g4 by ANTLR 4.9.2
package rabalais.regex2english;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link regex2englishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface regex2englishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(regex2englishParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(regex2englishParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#exprHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprHelper(regex2englishParser.ExprHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#characterClassContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClassContent(regex2englishParser.CharacterClassContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#characterClassContentHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClassContentHelper(regex2englishParser.CharacterClassContentHelperContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#escapedToLiteralInsideCharClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedToLiteralInsideCharClass(regex2englishParser.EscapedToLiteralInsideCharClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#escapedToLiteralOutsideCharClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedToLiteralOutsideCharClass(regex2englishParser.EscapedToLiteralOutsideCharClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(regex2englishParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#zeroWidthAssertions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroWidthAssertions(regex2englishParser.ZeroWidthAssertionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#captureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureGroup(regex2englishParser.CaptureGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(regex2englishParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(regex2englishParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#predefinedCharacterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedCharacterClass(regex2englishParser.PredefinedCharacterClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#characterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClass(regex2englishParser.CharacterClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#backReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackReference(regex2englishParser.BackReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#boundaryMatcherStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundaryMatcherStart(regex2englishParser.BoundaryMatcherStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#wordBoundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordBoundary(regex2englishParser.WordBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#nonWordBoundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWordBoundary(regex2englishParser.NonWordBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#inputStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStart(regex2englishParser.InputStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#endOfMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfMatch(regex2englishParser.EndOfMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(regex2englishParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(regex2englishParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(regex2englishParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#boundaryMatcherEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundaryMatcherEnd(regex2englishParser.BoundaryMatcherEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#endOfInputExceptFinalTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfInputExceptFinalTerminator(regex2englishParser.EndOfInputExceptFinalTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#endOfOnput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfOnput(regex2englishParser.EndOfOnputContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(regex2englishParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#escapedFromLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedFromLiteral(regex2englishParser.EscapedFromLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#inlineModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineModifier(regex2englishParser.InlineModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#namedCaptureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedCaptureGroup(regex2englishParser.NamedCaptureGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#nonCaptureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCaptureGroup(regex2englishParser.NonCaptureGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#independentNonCapturingGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndependentNonCapturingGroup(regex2englishParser.IndependentNonCapturingGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#zeroWidthPositiveLookAhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroWidthPositiveLookAhead(regex2englishParser.ZeroWidthPositiveLookAheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#zeroWidthNegativeLookAhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroWidthNegativeLookAhead(regex2englishParser.ZeroWidthNegativeLookAheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#zeroWidthPositiveLookBehind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroWidthPositiveLookBehind(regex2englishParser.ZeroWidthPositiveLookBehindContext ctx);
	/**
	 * Visit a parse tree produced by {@link regex2englishParser#zeroWidthNegativeLookBehind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroWidthNegativeLookBehind(regex2englishParser.ZeroWidthNegativeLookBehindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_LOWERCASE}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_LOWERCASE(regex2englishParser.POSIX_LOWERCASEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_UPPERCASE}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_UPPERCASE(regex2englishParser.POSIX_UPPERCASEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_ASCII}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_ASCII(regex2englishParser.POSIX_ASCIIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_LETTERS}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_LETTERS(regex2englishParser.POSIX_LETTERSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_DIGITS}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_DIGITS(regex2englishParser.POSIX_DIGITSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_ALPHANUMERIC}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_ALPHANUMERIC(regex2englishParser.POSIX_ALPHANUMERICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_PUNCTUATION}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_PUNCTUATION(regex2englishParser.POSIX_PUNCTUATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_ALPHANUM_PUNCTUATION}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_ALPHANUM_PUNCTUATION(regex2englishParser.POSIX_ALPHANUM_PUNCTUATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_WHITESPACE_OR_GLYPH}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_WHITESPACE_OR_GLYPH(regex2englishParser.POSIX_WHITESPACE_OR_GLYPHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_SPACE_OR_TAB}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_SPACE_OR_TAB(regex2englishParser.POSIX_SPACE_OR_TABContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_CONTROL_CHARACTERS}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_CONTROL_CHARACTERS(regex2englishParser.POSIX_CONTROL_CHARACTERSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_X_DIGIT}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_X_DIGIT(regex2englishParser.POSIX_X_DIGITContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSIX_WHITESPACE}
	 * labeled alternative in {@link regex2englishParser#posix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSIX_WHITESPACE(regex2englishParser.POSIX_WHITESPACEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JAVALANG_CC_LOWERCASE}
	 * labeled alternative in {@link regex2englishParser#javalangCharacterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAVALANG_CC_LOWERCASE(regex2englishParser.JAVALANG_CC_LOWERCASEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JAVALANG_CC_UPPERCASE}
	 * labeled alternative in {@link regex2englishParser#javalangCharacterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAVALANG_CC_UPPERCASE(regex2englishParser.JAVALANG_CC_UPPERCASEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JAVALANG_CC_WHITESPACE}
	 * labeled alternative in {@link regex2englishParser#javalangCharacterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAVALANG_CC_WHITESPACE(regex2englishParser.JAVALANG_CC_WHITESPACEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JAVALANG_CC_MIRRORED}
	 * labeled alternative in {@link regex2englishParser#javalangCharacterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAVALANG_CC_MIRRORED(regex2englishParser.JAVALANG_CC_MIRROREDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LATIN}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLATIN(regex2englishParser.LATINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GREEK}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGREEK(regex2englishParser.GREEKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UPPERCASE}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUPPERCASE(regex2englishParser.UPPERCASEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IS_ALPHABETIC}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIS_ALPHABETIC(regex2englishParser.IS_ALPHABETICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENCY_SYMBOL}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENCY_SYMBOL(regex2englishParser.CURRENCY_SYMBOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT_GREEK}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT_GREEK(regex2englishParser.NOT_GREEKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT_UPPERCASE}
	 * labeled alternative in {@link regex2englishParser#unicodeScriptClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT_UPPERCASE(regex2englishParser.NOT_UPPERCASEContext ctx);
}