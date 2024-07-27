// Generated from /home/guilherme/Desktop/viper-lang/viper.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class viperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TIPO=2, FUNC=3, PROC=4, ATRTO=5, AP=6, FP=7, AC=8, FC=9, WR=10, 
		CONCAT=11, OPARIT=12, OPRELA=13, WHILE=14, IF=15, ELSE=16, ID=17, NUM=18, 
		WS=19, ErrorChar=20;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_atribuicao = 2, RULE_declaracao = 3, 
		RULE_declaracaoFuncao = 4, RULE_declaracaoProcedimento = 5, RULE_whileLoop = 6, 
		RULE_ifStatement = 7, RULE_parameters = 8, RULE_parameter = 9, RULE_block = 10, 
		RULE_condition = 11, RULE_expressao = 12, RULE_functionCall = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "atribuicao", "declaracao", "declaracaoFuncao", 
			"declaracaoProcedimento", "whileLoop", "ifStatement", "parameters", "parameter", 
			"block", "condition", "expressao", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'function'", "'procedure'", "'='", "'('", "')'", 
			"'{'", "'}'", "'out'", "'.'", null, null, "'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "FUNC", "PROC", "ATRTO", "AP", "FP", "AC", "FC", 
			"WR", "CONCAT", "OPARIT", "OPRELA", "WHILE", "IF", "ELSE", "ID", "NUM", 
			"WS", "ErrorChar"
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
	public String getGrammarFileName() { return "viper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public viperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 442436L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoProcedimentoContext declaracaoProcedimento() {
			return getRuleContext(DeclaracaoProcedimentoContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				declaracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				declaracaoFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				declaracaoProcedimento();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode ATRTO() { return getToken(viperParser.ATRTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			match(ATRTO);
			setState(44);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(viperParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode ATRTO() { return getToken(viperParser.ATRTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(TIPO);
			setState(47);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRTO) {
				{
				setState(48);
				match(ATRTO);
				setState(49);
				expressao(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(viperParser.TIPO, 0); }
		public TerminalNode FUNC() { return getToken(viperParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TIPO);
			setState(53);
			match(FUNC);
			setState(54);
			match(ID);
			setState(55);
			match(AP);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(56);
				parameters();
				}
			}

			setState(59);
			match(FP);
			setState(60);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoProcedimentoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(viperParser.TIPO, 0); }
		public TerminalNode PROC() { return getToken(viperParser.PROC, 0); }
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public DeclaracaoProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoProcedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterDeclaracaoProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitDeclaracaoProcedimento(this);
		}
	}

	public final DeclaracaoProcedimentoContext declaracaoProcedimento() throws RecognitionException {
		DeclaracaoProcedimentoContext _localctx = new DeclaracaoProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaoProcedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TIPO);
			setState(63);
			match(PROC);
			setState(64);
			match(ID);
			setState(65);
			match(AP);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(66);
				parameters();
				}
			}

			setState(69);
			match(FP);
			setState(70);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(viperParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(WHILE);
			setState(73);
			match(AP);
			setState(74);
			condition();
			setState(75);
			match(FP);
			setState(76);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(viperParser.IF, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(viperParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			match(AP);
			setState(80);
			condition();
			setState(81);
			match(FP);
			setState(82);
			block();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(83);
				match(ELSE);
				setState(84);
				block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			parameter();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(88);
				match(T__0);
				setState(89);
				parameter();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(viperParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TIPO);
			setState(96);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(viperParser.AC, 0); }
		public TerminalNode FC() { return getToken(viperParser.FC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(AC);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 442436L) != 0)) {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OPRELA() { return getToken(viperParser.OPRELA, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expressao(0);
			setState(108);
			match(OPRELA);
			setState(109);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode NUM() { return getToken(viperParser.NUM, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OPARIT() { return getToken(viperParser.OPARIT, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(112);
				match(ID);
				}
				break;
			case 2:
				{
				setState(113);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(114);
				match(AP);
				setState(115);
				expressao(0);
				setState(116);
				match(FP);
				}
				break;
			case 4:
				{
				setState(118);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(OPARIT);
					setState(123);
					expressao(3);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(viperParser.ID, 0); }
		public TerminalNode AP() { return getToken(viperParser.AP, 0); }
		public TerminalNode FP() { return getToken(viperParser.FP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof viperListener ) ((viperListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(AP);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 393280L) != 0)) {
				{
				setState(131);
				expressao(0);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					setState(133);
					expressao(0);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141);
			match(FP);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00033\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005D\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007V\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b[\b\b\n\b\f\b^\t"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\ne\b\n\n\n\f\nh\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fx\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f}\b\f\n\f\f\f\u0080\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0087\b\r\n\r\f\r\u008a\t\r\u0003\r\u008c\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0018\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u0094\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001"+
		"\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000"+
		"\u0000\n>\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000eN\u0001"+
		"\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000"+
		"\u0000\u0014b\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000\u0018"+
		"w\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!)\u0003\u0004\u0002"+
		"\u0000\")\u0003\u0006\u0003\u0000#)\u0003\b\u0004\u0000$)\u0003\n\u0005"+
		"\u0000%)\u0003\f\u0006\u0000&)\u0003\u000e\u0007\u0000\')\u0003\u0018"+
		"\f\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000(#\u0001"+
		"\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*+\u0005\u0011\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0003"+
		"\u0018\f\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0002\u0000\u0000"+
		"/2\u0005\u0011\u0000\u000001\u0005\u0005\u0000\u000013\u0003\u0018\f\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0007\u0001\u0000"+
		"\u0000\u000045\u0005\u0002\u0000\u000056\u0005\u0003\u0000\u000067\u0005"+
		"\u0011\u0000\u000079\u0005\u0006\u0000\u00008:\u0003\u0010\b\u000098\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";<\u0005\u0007\u0000\u0000<=\u0003\u0014\n\u0000=\t\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0002\u0000\u0000?@\u0005\u0004\u0000\u0000@A\u0005\u0011"+
		"\u0000\u0000AC\u0005\u0006\u0000\u0000BD\u0003\u0010\b\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0007\u0000\u0000FG\u0003\u0014\n\u0000G\u000b\u0001\u0000\u0000\u0000"+
		"HI\u0005\u000e\u0000\u0000IJ\u0005\u0006\u0000\u0000JK\u0003\u0016\u000b"+
		"\u0000KL\u0005\u0007\u0000\u0000LM\u0003\u0014\n\u0000M\r\u0001\u0000"+
		"\u0000\u0000NO\u0005\u000f\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0003"+
		"\u0016\u000b\u0000QR\u0005\u0007\u0000\u0000RU\u0003\u0014\n\u0000ST\u0005"+
		"\u0010\u0000\u0000TV\u0003\u0014\n\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\u000f\u0001\u0000\u0000\u0000W\\\u0003\u0012\t\u0000"+
		"XY\u0005\u0001\u0000\u0000Y[\u0003\u0012\t\u0000ZX\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u0011\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0002\u0000\u0000`a\u0005\u0011\u0000\u0000a\u0013\u0001\u0000\u0000"+
		"\u0000bf\u0005\b\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"\t\u0000\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0003\u0018\f\u0000lm"+
		"\u0005\r\u0000\u0000mn\u0003\u0018\f\u0000n\u0017\u0001\u0000\u0000\u0000"+
		"op\u0006\f\uffff\uffff\u0000px\u0005\u0011\u0000\u0000qx\u0005\u0012\u0000"+
		"\u0000rs\u0005\u0006\u0000\u0000st\u0003\u0018\f\u0000tu\u0005\u0007\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vx\u0003\u001a\r\u0000wo\u0001\u0000\u0000"+
		"\u0000wq\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x~\u0001\u0000\u0000\u0000yz\n\u0002\u0000\u0000z{\u0005\f"+
		"\u0000\u0000{}\u0003\u0018\f\u0003|y\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0019\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0011\u0000\u0000\u0082\u008b\u0005\u0006\u0000\u0000"+
		"\u0083\u0088\u0003\u0018\f\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085"+
		"\u0087\u0003\u0018\f\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0007\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000\f\u001f("+
		"29CU\\fw~\u0088\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}