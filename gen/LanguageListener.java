// Generated from C:/Users/Jhoisnayra/PycharmProjects/language\Language.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(LanguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(LanguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#controlCommands}.
	 * @param ctx the parse tree
	 */
	void enterControlCommands(LanguageParser.ControlCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#controlCommands}.
	 * @param ctx the parse tree
	 */
	void exitControlCommands(LanguageParser.ControlCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(LanguageParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(LanguageParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(LanguageParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(LanguageParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(LanguageParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(LanguageParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LanguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LanguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#printParams}.
	 * @param ctx the parse tree
	 */
	void enterPrintParams(LanguageParser.PrintParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#printParams}.
	 * @param ctx the parse tree
	 */
	void exitPrintParams(LanguageParser.PrintParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#contentComment}.
	 * @param ctx the parse tree
	 */
	void enterContentComment(LanguageParser.ContentCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#contentComment}.
	 * @param ctx the parse tree
	 */
	void exitContentComment(LanguageParser.ContentCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#contentVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterContentVarDeclaration(LanguageParser.ContentVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#contentVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitContentVarDeclaration(LanguageParser.ContentVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LanguageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LanguageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LanguageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LanguageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#idAux}.
	 * @param ctx the parse tree
	 */
	void enterIdAux(LanguageParser.IdAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#idAux}.
	 * @param ctx the parse tree
	 */
	void exitIdAux(LanguageParser.IdAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#constVar}.
	 * @param ctx the parse tree
	 */
	void enterConstVar(LanguageParser.ConstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#constVar}.
	 * @param ctx the parse tree
	 */
	void exitConstVar(LanguageParser.ConstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#valueAttribution}.
	 * @param ctx the parse tree
	 */
	void enterValueAttribution(LanguageParser.ValueAttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#valueAttribution}.
	 * @param ctx the parse tree
	 */
	void exitValueAttribution(LanguageParser.ValueAttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#valueAttributionAux}.
	 * @param ctx the parse tree
	 */
	void enterValueAttributionAux(LanguageParser.ValueAttributionAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#valueAttributionAux}.
	 * @param ctx the parse tree
	 */
	void exitValueAttributionAux(LanguageParser.ValueAttributionAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#contentTypeVar}.
	 * @param ctx the parse tree
	 */
	void enterContentTypeVar(LanguageParser.ContentTypeVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#contentTypeVar}.
	 * @param ctx the parse tree
	 */
	void exitContentTypeVar(LanguageParser.ContentTypeVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpression(LanguageParser.ElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpression(LanguageParser.ElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#allExpressions}.
	 * @param ctx the parse tree
	 */
	void enterAllExpressions(LanguageParser.AllExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#allExpressions}.
	 * @param ctx the parse tree
	 */
	void exitAllExpressions(LanguageParser.AllExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#aritmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterAritmeticExpression(LanguageParser.AritmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#aritmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitAritmeticExpression(LanguageParser.AritmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#aritmeticAux}.
	 * @param ctx the parse tree
	 */
	void enterAritmeticAux(LanguageParser.AritmeticAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#aritmeticAux}.
	 * @param ctx the parse tree
	 */
	void exitAritmeticAux(LanguageParser.AritmeticAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(LanguageParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(LanguageParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(LanguageParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(LanguageParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#arithmeticOperators}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperators(LanguageParser.ArithmeticOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#arithmeticOperators}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperators(LanguageParser.ArithmeticOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#logicOperators}.
	 * @param ctx the parse tree
	 */
	void enterLogicOperators(LanguageParser.LogicOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#logicOperators}.
	 * @param ctx the parse tree
	 */
	void exitLogicOperators(LanguageParser.LogicOperatorsContext ctx);
}