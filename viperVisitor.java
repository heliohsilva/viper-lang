// Generated from /home/guilherme/Desktop/viper-lang/viper.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link viperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface viperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link viperParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(viperParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(viperParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(viperParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(viperParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoFuncao(viperParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#declaracaoProcedimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoProcedimento(viperParser.DeclaracaoProcedimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(viperParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(viperParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(viperParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(viperParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(viperParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(viperParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(viperParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(viperParser.FunctionCallContext ctx);
}