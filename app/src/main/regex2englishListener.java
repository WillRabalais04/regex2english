// Generated from regex2english.g4 by ANTLR 4.13.0
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
	 * Enter a parse tree produced by the {@code UMINUS}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUMINUS(regex2englishParser.UMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UMINUS}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUMINUS(regex2englishParser.UMINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENGRP(regex2englishParser.PARENGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENGRP(regex2englishParser.PARENGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDOUBLE(regex2englishParser.DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDOUBLE(regex2englishParser.DOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULOPGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULOPGRP(regex2englishParser.MULOPGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULOPGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULOPGRP(regex2englishParser.MULOPGRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDOPGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDOPGRP(regex2englishParser.ADDOPGRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDOPGRP}
	 * labeled alternative in {@link regex2englishParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDOPGRP(regex2englishParser.ADDOPGRPContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(regex2englishParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(regex2englishParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link regex2englishParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(regex2englishParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link regex2englishParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(regex2englishParser.MulopContext ctx);
}