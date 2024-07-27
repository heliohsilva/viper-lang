# Generated from viper.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .viperParser import viperParser
else:
    from viperParser import viperParser

# This class defines a complete listener for a parse tree produced by viperParser.
class viperListener(ParseTreeListener):

    # Enter a parse tree produced by viperParser#program.
    def enterProgram(self, ctx:viperParser.ProgramContext):
        pass

    # Exit a parse tree produced by viperParser#program.
    def exitProgram(self, ctx:viperParser.ProgramContext):
        pass


    # Enter a parse tree produced by viperParser#statement.
    def enterStatement(self, ctx:viperParser.StatementContext):
        pass

    # Exit a parse tree produced by viperParser#statement.
    def exitStatement(self, ctx:viperParser.StatementContext):
        pass


    # Enter a parse tree produced by viperParser#atribuicao.
    def enterAtribuicao(self, ctx:viperParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by viperParser#atribuicao.
    def exitAtribuicao(self, ctx:viperParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by viperParser#declaracao.
    def enterDeclaracao(self, ctx:viperParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by viperParser#declaracao.
    def exitDeclaracao(self, ctx:viperParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by viperParser#declaracaoFuncao.
    def enterDeclaracaoFuncao(self, ctx:viperParser.DeclaracaoFuncaoContext):
        pass

    # Exit a parse tree produced by viperParser#declaracaoFuncao.
    def exitDeclaracaoFuncao(self, ctx:viperParser.DeclaracaoFuncaoContext):
        pass


    # Enter a parse tree produced by viperParser#declaracaoProcedimento.
    def enterDeclaracaoProcedimento(self, ctx:viperParser.DeclaracaoProcedimentoContext):
        pass

    # Exit a parse tree produced by viperParser#declaracaoProcedimento.
    def exitDeclaracaoProcedimento(self, ctx:viperParser.DeclaracaoProcedimentoContext):
        pass


    # Enter a parse tree produced by viperParser#whileLoop.
    def enterWhileLoop(self, ctx:viperParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by viperParser#whileLoop.
    def exitWhileLoop(self, ctx:viperParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by viperParser#ifStatement.
    def enterIfStatement(self, ctx:viperParser.IfStatementContext):
        pass

    # Exit a parse tree produced by viperParser#ifStatement.
    def exitIfStatement(self, ctx:viperParser.IfStatementContext):
        pass


    # Enter a parse tree produced by viperParser#parameters.
    def enterParameters(self, ctx:viperParser.ParametersContext):
        pass

    # Exit a parse tree produced by viperParser#parameters.
    def exitParameters(self, ctx:viperParser.ParametersContext):
        pass


    # Enter a parse tree produced by viperParser#parameter.
    def enterParameter(self, ctx:viperParser.ParameterContext):
        pass

    # Exit a parse tree produced by viperParser#parameter.
    def exitParameter(self, ctx:viperParser.ParameterContext):
        pass


    # Enter a parse tree produced by viperParser#block.
    def enterBlock(self, ctx:viperParser.BlockContext):
        pass

    # Exit a parse tree produced by viperParser#block.
    def exitBlock(self, ctx:viperParser.BlockContext):
        pass


    # Enter a parse tree produced by viperParser#condition.
    def enterCondition(self, ctx:viperParser.ConditionContext):
        pass

    # Exit a parse tree produced by viperParser#condition.
    def exitCondition(self, ctx:viperParser.ConditionContext):
        pass


    # Enter a parse tree produced by viperParser#expressao.
    def enterExpressao(self, ctx:viperParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by viperParser#expressao.
    def exitExpressao(self, ctx:viperParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by viperParser#functionCall.
    def enterFunctionCall(self, ctx:viperParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by viperParser#functionCall.
    def exitFunctionCall(self, ctx:viperParser.FunctionCallContext):
        pass



del viperParser