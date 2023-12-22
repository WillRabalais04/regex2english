// Generated from app/src/main/regex2english.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regex2englishParser}.
 */
public interface regex2englishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(regex2englishParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(regex2englishParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(regex2englishParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(regex2englishParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#exprHelper}.
	 * @param ctx the parse tree
	 */
	void enterExprHelper(regex2englishParser.ExprHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#exprHelper}.
	 * @param ctx the parse tree
	 */
	void exitExprHelper(regex2englishParser.ExprHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(regex2englishParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(regex2englishParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#characterClass}.
	 * @param ctx the parse tree
	 */
	void enterCharacterClass(regex2englishParser.CharacterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#characterClass}.
	 * @param ctx the parse tree
	 */
	void exitCharacterClass(regex2englishParser.CharacterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#characterClassHelper}.
	 * @param ctx the parse tree
	 */
	void enterCharacterClassHelper(regex2englishParser.CharacterClassHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#characterClassHelper}.
	 * @param ctx the parse tree
	 */
	void exitCharacterClassHelper(regex2englishParser.CharacterClassHelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#escapedToLiteralInsideCharClass}.
	 * @param ctx the parse tree
	 */
	void enterEscapedToLiteralInsideCharClass(regex2englishParser.EscapedToLiteralInsideCharClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#escapedToLiteralInsideCharClass}.
	 * @param ctx the parse tree
	 */
	void exitEscapedToLiteralInsideCharClass(regex2englishParser.EscapedToLiteralInsideCharClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#predefinedCharacterClass}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedCharacterClass(regex2englishParser.PredefinedCharacterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#predefinedCharacterClass}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedCharacterClass(regex2englishParser.PredefinedCharacterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(regex2englishParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(regex2englishParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#back_reference}.
	 * @param ctx the parse tree
	 */
	void enterBack_reference(regex2englishParser.Back_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#back_reference}.
	 * @param ctx the parse tree
	 */
	void exitBack_reference(regex2englishParser.Back_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#boundary_matcher}.
	 * @param ctx the parse tree
	 */
	void enterBoundary_matcher(regex2englishParser.Boundary_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#boundary_matcher}.
	 * @param ctx the parse tree
	 */
	void exitBoundary_matcher(regex2englishParser.Boundary_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#escapedFromLiteral}.
	 * @param ctx the parse tree
	 */
	void enterEscapedFromLiteral(regex2englishParser.EscapedFromLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#escapedFromLiteral}.
	 * @param ctx the parse tree
	 */
	void exitEscapedFromLiteral(regex2englishParser.EscapedFromLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#escapedToLiteralOutsideCharClass}.
	 * @param ctx the parse tree
	 */
	void enterEscapedToLiteralOutsideCharClass(regex2englishParser.EscapedToLiteralOutsideCharClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#escapedToLiteralOutsideCharClass}.
	 * @param ctx the parse tree
	 */
	void exitEscapedToLiteralOutsideCharClass(regex2englishParser.EscapedToLiteralOutsideCharClassContext ctx);
}