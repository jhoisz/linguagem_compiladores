// Generated from C:/Users/Jhoisnayra/PycharmProjects/language\Language.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(LanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#controlCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlCommands(LanguageParser.ControlCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(LanguageParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(LanguageParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(LanguageParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LanguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#printParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParams(LanguageParser.PrintParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#contentComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentComment(LanguageParser.ContentCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#contentVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentVarDeclaration(LanguageParser.ContentVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LanguageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LanguageParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#idAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAux(LanguageParser.IdAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#constVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVar(LanguageParser.ConstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#valueAttribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAttribution(LanguageParser.ValueAttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#valueAttributionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAttributionAux(LanguageParser.ValueAttributionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#contentTypeVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentTypeVar(LanguageParser.ContentTypeVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression(LanguageParser.ElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#allExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllExpressions(LanguageParser.AllExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#aritmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmeticExpression(LanguageParser.AritmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#aritmeticAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmeticAux(LanguageParser.AritmeticAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(LanguageParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(LanguageParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#arithmeticOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperators(LanguageParser.ArithmeticOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#logicOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOperators(LanguageParser.LogicOperatorsContext ctx);
}