# Generated from viper.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,17,5,2,0,7,0,1,0,1,0,1,0,0,0,1,0,0,0,3,0,2,1,0,0,0,2,3,5,1,0,
        0,3,1,1,0,0,0,0
    ]

class viperParser ( Parser ):

    grammarFileName = "viper.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'`'", "<INVALID>", "'function'", "'procedure'", 
                     "'='", "'('", "')'", "'{'", "'}'", "'out'", "'.'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "TIPO", "FUNC", "PROC", 
                      "ATRTO", "AP", "FP", "AC", "FC", "WR", "CONCAT", "OPARIT", 
                      "OPRELA", "ID", "NUM", "WS", "ErrorChar" ]

    RULE_initial = 0

    ruleNames =  [ "initial" ]

    EOF = Token.EOF
    T__0=1
    TIPO=2
    FUNC=3
    PROC=4
    ATRTO=5
    AP=6
    FP=7
    AC=8
    FC=9
    WR=10
    CONCAT=11
    OPARIT=12
    OPRELA=13
    ID=14
    NUM=15
    WS=16
    ErrorChar=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class InitialContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return viperParser.RULE_initial

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInitial" ):
                listener.enterInitial(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInitial" ):
                listener.exitInitial(self)




    def initial(self):

        localctx = viperParser.InitialContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_initial)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(viperParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





