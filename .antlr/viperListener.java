// Generated from /home/guilherme/Desktop/viper-lang/viper.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link viperParser}.
 */
public interface viperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link viperParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(viperParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(viperParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(viperParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(viperParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(viperParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(viperParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(viperParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(viperParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(viperParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(viperParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#declaracaoProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoProcedimento(viperParser.DeclaracaoProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#declaracaoProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoProcedimento(viperParser.DeclaracaoProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(viperParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(viperParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(viperParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(viperParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(viperParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(viperParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(viperParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(viperParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(viperParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(viperParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(viperParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(viperParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(viperParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(viperParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(viperParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(viperParser.FunctionCallContext ctx);
}