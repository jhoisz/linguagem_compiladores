// Generated from c:\Users\VAIO\Desktop\compiladores\javapy\linguagem_compiladores\Language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, MUL=30, DIV=31, ADD=32, 
		SUB=33, INT=34, FLOAT=35, STRING=36, BOOL=37, ID=38, Space=39, COMMENT_ONE_LINE=40, 
		COMMENT_MULT_LINES=41;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_commands = 2, RULE_function = 3, RULE_typeFunction = 4, 
		RULE_paramsList = 5, RULE_callFunction = 6, RULE_callFunctionParams = 7, 
		RULE_return = 8, RULE_contentReturn = 9, RULE_controlCommands = 10, RULE_conditions = 11, 
		RULE_ifelse = 12, RULE_else = 13, RULE_while = 14, RULE_break = 15, RULE_nativeFunctions = 16, 
		RULE_print = 17, RULE_printParams = 18, RULE_scanf = 19, RULE_varDeclaration = 20, 
		RULE_contentVarDeclaration = 21, RULE_var = 22, RULE_id = 23, RULE_constVar = 24, 
		RULE_value = 25, RULE_type = 26, RULE_primitiveType = 27, RULE_expression = 28, 
		RULE_allExp = 29, RULE_aritmeticExp = 30, RULE_logicExp = 31, RULE_notExp = 32, 
		RULE_elemAritmetic = 33, RULE_elemLogic = 34, RULE_logicOp = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "commands", "function", "typeFunction", "paramsList", 
			"callFunction", "callFunctionParams", "return", "contentReturn", "controlCommands", 
			"conditions", "ifelse", "else", "while", "break", "nativeFunctions", 
			"print", "printParams", "scanf", "varDeclaration", "contentVarDeclaration", 
			"var", "id", "constVar", "value", "type", "primitiveType", "expression", 
			"allExp", "aritmeticExp", "logicExp", "notExp", "elemAritmetic", "elemLogic", 
			"logicOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "';'", "'('", "')'", "'void'", "','", 
			"'return'", "'if'", "'else'", "'while'", "'break'", "'print'", "'scanf'", 
			"'var'", "'const'", "'='", "'int'", "'float'", "'str'", "'bool'", "'!'", 
			"'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "INT", 
			"FLOAT", "STRING", "BOOL", "ID", "Space", "COMMENT_ONE_LINE", "COMMENT_MULT_LINES"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(72);
				function();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			main();
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

	public static class MainContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			match(T__1);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(82);
				varDeclaration();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				commands();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__2);
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

	public static class CommandsContext extends ParserRuleContext {
		public NativeFunctionsContext nativeFunctions() {
			return getRuleContext(NativeFunctionsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlCommandsContext controlCommands() {
			return getRuleContext(ControlCommandsContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReturnContext return() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BreakContext break() {
			return getRuleContext(BreakContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				nativeFunctions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				controlCommands();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				callFunction();
				setState(97);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				return();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				break();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
		}
		public ParamsListContext paramsList() {
			return getRuleContext(ParamsListContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__4);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(105);
				paramsList();
				}
			}

			setState(108);
			match(T__5);
			setState(109);
			match(T__1);
			setState(110);
			typeFunction();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(111);
				varDeclaration();
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(114);
				commands();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__2);
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

	public static class TypeFunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeFunction);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				type();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParamsListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<ParamsListContext> paramsList() {
			return getRuleContexts(ParamsListContext.class);
		}
		public ParamsListContext paramsList(int i) {
			return getRuleContext(ParamsListContext.class,i);
		}
		public ParamsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsList; }
	}

	public final ParamsListContext paramsList() throws RecognitionException {
		ParamsListContext _localctx = new ParamsListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			match(ID);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					match(T__7);
					setState(129);
					paramsList();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<CallFunctionParamsContext> callFunctionParams() {
			return getRuleContexts(CallFunctionParamsContext.class);
		}
		public CallFunctionParamsContext callFunctionParams(int i) {
			return getRuleContext(CallFunctionParamsContext.class,i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(T__4);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				callFunctionParams();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(138);
					match(T__7);
					setState(139);
					callFunctionParams();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(147);
			match(T__5);
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

	public static class CallFunctionParamsContext extends ParserRuleContext {
		public AllExpContext allExp() {
			return getRuleContext(AllExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public CallFunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunctionParams; }
	}

	public final CallFunctionParamsContext callFunctionParams() throws RecognitionException {
		CallFunctionParamsContext _localctx = new CallFunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callFunctionParams);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				allExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(ID);
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

	public static class ReturnContext extends ParserRuleContext {
		public ContentReturnContext contentReturn() {
			return getRuleContext(ContentReturnContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__8);
			setState(154);
			contentReturn();
			setState(155);
			match(T__3);
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

	public static class ContentReturnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public AllExpContext allExp() {
			return getRuleContext(AllExpContext.class,0);
		}
		public ContentReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentReturn; }
	}

	public final ContentReturnContext contentReturn() throws RecognitionException {
		ContentReturnContext _localctx = new ContentReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contentReturn);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				allExp();
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

	public static class ControlCommandsContext extends ParserRuleContext {
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public WhileContext while() {
			return getRuleContext(WhileContext.class,0);
		}
		public ControlCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlCommands; }
	}

	public final ControlCommandsContext controlCommands() throws RecognitionException {
		ControlCommandsContext _localctx = new ControlCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_controlCommands);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				ifelse();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				while();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionsContext extends ParserRuleContext {
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditions);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				logicExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(ID);
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

	public static class IfelseContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__9);
			setState(171);
			match(T__4);
			setState(172);
			conditions();
			setState(173);
			match(T__5);
			setState(174);
			match(T__1);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(175);
				commands();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(181);
				else();
				}
			}

			setState(184);
			match(T__2);
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

	public static class ElseContext extends ParserRuleContext {
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__10);
			setState(187);
			match(T__1);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(188);
				commands();
				}
				}
				setState(193);
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

	public static class WhileContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__11);
			setState(195);
			match(T__4);
			setState(196);
			conditions();
			setState(197);
			match(T__5);
			setState(198);
			match(T__1);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(199);
				commands();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__2);
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

	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
	}

	public final BreakContext break() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__12);
			setState(208);
			match(T__3);
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

	public static class NativeFunctionsContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanfContext scanf() {
			return getRuleContext(ScanfContext.class,0);
		}
		public NativeFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeFunctions; }
	}

	public final NativeFunctionsContext nativeFunctions() throws RecognitionException {
		NativeFunctionsContext _localctx = new NativeFunctionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nativeFunctions);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				print();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				scanf();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintContext extends ParserRuleContext {
		public List<PrintParamsContext> printParams() {
			return getRuleContexts(PrintParamsContext.class);
		}
		public PrintParamsContext printParams(int i) {
			return getRuleContext(PrintParamsContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__13);
			setState(215);
			match(T__4);
			setState(216);
			printParams();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(217);
				match(T__7);
				setState(218);
				printParams();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__5);
			setState(225);
			match(T__3);
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

	public static class PrintParamsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public AllExpContext allExp() {
			return getRuleContext(AllExpContext.class,0);
		}
		public PrintParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParams; }
	}

	public final PrintParamsContext printParams() throws RecognitionException {
		PrintParamsContext _localctx = new PrintParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printParams);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				allExp();
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

	public static class ScanfContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__14);
			setState(232);
			match(T__4);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				id();
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(238);
			match(T__5);
			setState(239);
			match(T__3);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public List<ContentVarDeclarationContext> contentVarDeclaration() {
			return getRuleContexts(ContentVarDeclarationContext.class);
		}
		public ContentVarDeclarationContext contentVarDeclaration(int i) {
			return getRuleContext(ContentVarDeclarationContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__15);
			setState(242);
			match(T__1);
			setState(244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(243);
					contentVarDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ContentVarDeclarationContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public ContentVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentVarDeclaration; }
	}

	public final ContentVarDeclarationContext contentVarDeclaration() throws RecognitionException {
		ContentVarDeclarationContext _localctx = new ContentVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_contentVarDeclaration);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				var();
				setState(249);
				match(T__3);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				constVar();
				setState(252);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				id();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(261);
			match(T__1);
			setState(262);
			type();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(T__7);
					setState(266);
					id();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ConstVarContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ConstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVar; }
	}

	public final ConstVarContext constVar() throws RecognitionException {
		ConstVarContext _localctx = new ConstVarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__16);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				value();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(279);
			match(T__17);
			setState(280);
			primitiveType();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(T__7);
					setState(282);
					value();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public AllExpContext allExp() {
			return getRuleContext(AllExpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ID);
			setState(293);
			match(T__17);
			setState(294);
			allExp();
			setState(295);
			match(T__3);
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

	public static class AllExpContext extends ParserRuleContext {
		public AritmeticExpContext aritmeticExp() {
			return getRuleContext(AritmeticExpContext.class,0);
		}
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public AllExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allExp; }
	}

	public final AllExpContext allExp() throws RecognitionException {
		AllExpContext _localctx = new AllExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_allExp);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				aritmeticExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				logicExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				primitiveType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				callFunction();
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

	public static class AritmeticExpContext extends ParserRuleContext {
		public Token op;
		public TerminalNode SUB() { return getToken(LanguageParser.SUB, 0); }
		public List<AritmeticExpContext> aritmeticExp() {
			return getRuleContexts(AritmeticExpContext.class);
		}
		public AritmeticExpContext aritmeticExp(int i) {
			return getRuleContext(AritmeticExpContext.class,i);
		}
		public ElemAritmeticContext elemAritmetic() {
			return getRuleContext(ElemAritmeticContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(LanguageParser.ADD, 0); }
		public AritmeticExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmeticExp; }
	}

	public final AritmeticExpContext aritmeticExp() throws RecognitionException {
		return aritmeticExp(0);
	}

	private AritmeticExpContext aritmeticExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritmeticExpContext _localctx = new AritmeticExpContext(_ctx, _parentState);
		AritmeticExpContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_aritmeticExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(304);
				match(SUB);
				setState(305);
				aritmeticExp(6);
				}
				break;
			case 2:
				{
				setState(306);
				match(T__4);
				setState(307);
				aritmeticExp(0);
				setState(308);
				match(T__5);
				}
				break;
			case 3:
				{
				}
				break;
			case 4:
				{
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(311);
					elemAritmetic();
					}
					break;
				case 2:
					{
					setState(312);
					callFunction();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new AritmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmeticExp);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						((AritmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((AritmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						aritmeticExp(4);
						}
						break;
					case 2:
						{
						_localctx = new AritmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmeticExp);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						((AritmeticExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AritmeticExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(322);
						aritmeticExp(3);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class LogicExpContext extends ParserRuleContext {
		public List<ElemLogicContext> elemLogic() {
			return getRuleContexts(ElemLogicContext.class);
		}
		public ElemLogicContext elemLogic(int i) {
			return getRuleContext(ElemLogicContext.class,i);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public LogicExpContext logicExp() {
			return getRuleContext(LogicExpContext.class,0);
		}
		public NotExpContext notExp() {
			return getRuleContext(NotExpContext.class,0);
		}
		public LogicExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExp; }
	}

	public final LogicExpContext logicExp() throws RecognitionException {
		LogicExpContext _localctx = new LogicExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicExp);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				elemLogic();
				setState(329);
				logicOp();
				setState(330);
				elemLogic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__4);
				setState(333);
				logicExp();
				setState(334);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				notExp();
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

	public static class NotExpContext extends ParserRuleContext {
		public ElemLogicContext elemLogic() {
			return getRuleContext(ElemLogicContext.class,0);
		}
		public NotExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExp; }
	}

	public final NotExpContext notExp() throws RecognitionException {
		NotExpContext _localctx = new NotExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__22);
			setState(340);
			elemLogic();
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

	public static class ElemAritmeticContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ElemAritmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemAritmetic; }
	}

	public final ElemAritmeticContext elemAritmetic() throws RecognitionException {
		ElemAritmeticContext _localctx = new ElemAritmeticContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elemAritmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ElemLogicContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public AritmeticExpContext aritmeticExp() {
			return getRuleContext(AritmeticExpContext.class,0);
		}
		public ElemLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemLogic; }
	}

	public final ElemLogicContext elemLogic() throws RecognitionException {
		ElemLogicContext _localctx = new ElemLogicContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elemLogic);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				callFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				aritmeticExp(0);
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

	public static class LogicOpContext extends ParserRuleContext {
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return aritmeticExp_sempred((AritmeticExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aritmeticExp_sempred(AritmeticExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3V\n\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\3\5\5\5s\n"+
		"\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7"+
		"\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\b\3\b\3\b\3\b\3\b\7\b\u008f\n"+
		"\b\f\b\16\b\u0092\13\b\5\b\u0094\n\b\3\b\3\b\3\t\3\t\5\t\u009a\n\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3"+
		"\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b3\n\16\f\16\16"+
		"\16\u00b6\13\16\3\16\5\16\u00b9\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00c0"+
		"\n\17\f\17\16\17\u00c3\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cb"+
		"\n\20\f\20\16\20\u00ce\13\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\5\22\u00d7"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u00de\n\23\f\23\16\23\u00e1\13\23"+
		"\3\23\3\23\3\23\3\24\3\24\5\24\u00e8\n\24\3\25\3\25\3\25\6\25\u00ed\n"+
		"\25\r\25\16\25\u00ee\3\25\3\25\3\25\3\26\3\26\3\26\6\26\u00f7\n\26\r\26"+
		"\16\26\u00f8\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101\n\27\3\30\6\30\u0104"+
		"\n\30\r\30\16\30\u0105\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u010e\n\31\f"+
		"\31\16\31\u0111\13\31\3\32\3\32\6\32\u0115\n\32\r\32\16\32\u0116\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u011e\n\33\f\33\16\33\u0121\13\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0130\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u013c\n \5 \u013e\n \3 \3 \3 \3 \3 "+
		"\3 \7 \u0146\n \f \16 \u0149\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0154\n"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u015f\n$\3%\3%\3%\2\3>&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\b\3\2\25\30"+
		"\3\2$\'\3\2 !\3\2\"#\4\2$%((\3\2\32\37\2\u016e\2M\3\2\2\2\4R\3\2\2\2\6"+
		"g\3\2\2\2\bi\3\2\2\2\n~\3\2\2\2\f\u0080\3\2\2\2\16\u0089\3\2\2\2\20\u0099"+
		"\3\2\2\2\22\u009b\3\2\2\2\24\u00a1\3\2\2\2\26\u00a5\3\2\2\2\30\u00aa\3"+
		"\2\2\2\32\u00ac\3\2\2\2\34\u00bc\3\2\2\2\36\u00c4\3\2\2\2 \u00d1\3\2\2"+
		"\2\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2*\u00f3"+
		"\3\2\2\2,\u0100\3\2\2\2.\u0103\3\2\2\2\60\u010a\3\2\2\2\62\u0112\3\2\2"+
		"\2\64\u0118\3\2\2\2\66\u0122\3\2\2\28\u0124\3\2\2\2:\u0126\3\2\2\2<\u012f"+
		"\3\2\2\2>\u013d\3\2\2\2@\u0153\3\2\2\2B\u0155\3\2\2\2D\u0158\3\2\2\2F"+
		"\u015e\3\2\2\2H\u0160\3\2\2\2JL\5\b\5\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\5\4\3\2Q\3\3\2\2\2RS\7\3\2\2SU\7\4\2"+
		"\2TV\5*\26\2UT\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\5\2\2^\5\3\2\2\2_h\5"+
		"\"\22\2`h\5:\36\2ah\5\26\f\2bc\5\16\b\2cd\7\6\2\2dh\3\2\2\2eh\5\22\n\2"+
		"fh\5 \21\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2ge\3\2\2\2gf\3\2\2\2"+
		"h\7\3\2\2\2ij\7(\2\2jl\7\7\2\2km\5\f\7\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"no\7\b\2\2op\7\4\2\2pr\5\n\6\2qs\5*\26\2rq\3\2\2\2rs\3\2\2\2sw\3\2\2\2"+
		"tv\5\6\4\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z{\7\5\2\2{\t\3\2\2\2|\177\5\66\34\2}\177\7\t\2\2~|\3\2\2\2~}\3\2\2\2"+
		"\177\13\3\2\2\2\u0080\u0081\5\66\34\2\u0081\u0086\7(\2\2\u0082\u0083\7"+
		"\n\2\2\u0083\u0085\5\f\7\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\r\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008a\7(\2\2\u008a\u0093\7\7\2\2\u008b\u0090\5\20\t\2\u008c\u008d"+
		"\7\n\2\2\u008d\u008f\5\20\t\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\b\2\2\u0096\17\3\2\2\2\u0097\u009a\5<\37\2\u0098\u009a\7(\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c"+
		"\7\13\2\2\u009c\u009d\5\24\13\2\u009d\u009e\7\6\2\2\u009e\23\3\2\2\2\u009f"+
		"\u00a2\7(\2\2\u00a0\u00a2\5<\37\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\25\3\2\2\2\u00a3\u00a6\5\32\16\2\u00a4\u00a6\5\36\20\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00ab\5@!\2"+
		"\u00a8\u00ab\7\'\2\2\u00a9\u00ab\7(\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad"+
		"\u00ae\7\7\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\b\2\2\u00b0\u00b4\7"+
		"\4\2\2\u00b1\u00b3\5\6\4\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7\5\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7\r\2"+
		"\2\u00bd\u00c1\7\4\2\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\35\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\5"+
		"\30\r\2\u00c7\u00c8\7\b\2\2\u00c8\u00cc\7\4\2\2\u00c9\u00cb\5\6\4\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\5\2\2\u00d0"+
		"\37\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\7\6\2\2\u00d3!\3\2\2\2\u00d4"+
		"\u00d7\5$\23\2\u00d5\u00d7\5(\25\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\7\7\2\2\u00da\u00df"+
		"\5&\24\2\u00db\u00dc\7\n\2\2\u00dc\u00de\5&\24\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\7\6\2\2\u00e4"+
		"%\3\2\2\2\u00e5\u00e8\7(\2\2\u00e6\u00e8\5<\37\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\'\3\2\2\2\u00e9\u00ea\7\21\2\2\u00ea\u00ec\7\7\2"+
		"\2\u00eb\u00ed\5\60\31\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\b"+
		"\2\2\u00f1\u00f2\7\6\2\2\u00f2)\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f6"+
		"\7\4\2\2\u00f5\u00f7\5,\27\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00fb\5.\30\2"+
		"\u00fb\u00fc\7\6\2\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff"+
		"\7\6\2\2\u00ff\u0101\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101"+
		"-\3\2\2\2\u0102\u0104\5\60\31\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\7\4\2\2\u0108\u0109\5\66\34\2\u0109/\3\2\2\2\u010a\u010f\7(\2\2\u010b"+
		"\u010c\7\n\2\2\u010c\u010e\5\60\31\2\u010d\u010b\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0114\7\23\2\2\u0113\u0115\5\64\33\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\63\3\2\2\2\u0118\u0119\7(\2\2\u0119\u011a\7\24\2\2\u011a\u011f\58\35"+
		"\2\u011b\u011c\7\n\2\2\u011c\u011e\5\64\33\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\65\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0122\u0123\t\2\2\2\u0123\67\3\2\2\2\u0124\u0125"+
		"\t\3\2\2\u01259\3\2\2\2\u0126\u0127\7(\2\2\u0127\u0128\7\24\2\2\u0128"+
		"\u0129\5<\37\2\u0129\u012a\7\6\2\2\u012a;\3\2\2\2\u012b\u0130\5> \2\u012c"+
		"\u0130\5@!\2\u012d\u0130\58\35\2\u012e\u0130\5\16\b\2\u012f\u012b\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"=\3\2\2\2\u0131\u0132\b \1\2\u0132\u0133\7#\2\2\u0133\u013e\5> \b\u0134"+
		"\u0135\7\7\2\2\u0135\u0136\5> \2\u0136\u0137\7\b\2\2\u0137\u013e\3\2\2"+
		"\2\u0138\u013e\3\2\2\2\u0139\u013c\5D#\2\u013a\u013c\5\16\b\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0131\3\2\2\2\u013d"+
		"\u0134\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0147\3\2"+
		"\2\2\u013f\u0140\f\5\2\2\u0140\u0141\t\4\2\2\u0141\u0146\5> \6\u0142\u0143"+
		"\f\4\2\2\u0143\u0144\t\5\2\2\u0144\u0146\5> \5\u0145\u013f\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148?\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5F$\2\u014b\u014c"+
		"\5H%\2\u014c\u014d\5F$\2\u014d\u0154\3\2\2\2\u014e\u014f\7\7\2\2\u014f"+
		"\u0150\5@!\2\u0150\u0151\7\b\2\2\u0151\u0154\3\2\2\2\u0152\u0154\5B\""+
		"\2\u0153\u014a\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u0154A"+
		"\3\2\2\2\u0155\u0156\7\31\2\2\u0156\u0157\5F$\2\u0157C\3\2\2\2\u0158\u0159"+
		"\t\6\2\2\u0159E\3\2\2\2\u015a\u015f\58\35\2\u015b\u015f\7(\2\2\u015c\u015f"+
		"\5\16\b\2\u015d\u015f\5> \2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fG\3\2\2\2\u0160\u0161\t\7\2\2"+
		"\u0161I\3\2\2\2&MUZglrw~\u0086\u0090\u0093\u0099\u00a1\u00a5\u00aa\u00b4"+
		"\u00b8\u00c1\u00cc\u00d6\u00df\u00e7\u00ee\u00f8\u0100\u0105\u010f\u0116"+
		"\u011f\u012f\u013b\u013d\u0145\u0147\u0153\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}