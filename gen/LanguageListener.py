# Generated from C:/Users/VAIO/Desktop/compiladores/javapy/linguagem_compiladores\Language.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LanguageParser import LanguageParser
else:
    from LanguageParser import LanguageParser

from jasminParser import JasminParser

# This class defines a complete listener for a parse tree produced by LanguageParser.
class LanguageListener(ParseTreeListener):

    def __init__(self):
        self.jasminParser = JasminParser()
        self.currentId = 1
        self.sybolTable = {}

    # Enter a parse tree produced by LanguageParser#prog.
    def enterProg(self, ctx:LanguageParser.ProgContext):
        self.jasminParser.createMain()
        self.jasminParser.createHeader()

    # Exit a parse tree produced by LanguageParser#prog.
    def exitProg(self, ctx:LanguageParser.ProgContext):
        self.jasminParser.createEnd()

    # Enter a parse tree produced by LanguageParser#main.
    def enterMain(self, ctx:LanguageParser.MainContext):
        self.jasminParser.createInitPrint()
        self.jasminParser.createPrint('Hello Word')

    # Exit a parse tree produced by LanguageParser#main.
    def exitMain(self, ctx:LanguageParser.MainContext):
        pass


    # Enter a parse tree produced by LanguageParser#commands.
    def enterCommands(self, ctx:LanguageParser.CommandsContext):
        pass

    # Exit a parse tree produced by LanguageParser#commands.
    def exitCommands(self, ctx:LanguageParser.CommandsContext):
        pass


    # Enter a parse tree produced by LanguageParser#function.
    def enterFunction(self, ctx:LanguageParser.FunctionContext):
        pass

    # Exit a parse tree produced by LanguageParser#function.
    def exitFunction(self, ctx:LanguageParser.FunctionContext):
        pass


    # Enter a parse tree produced by LanguageParser#typeFunction.
    def enterTypeFunction(self, ctx:LanguageParser.TypeFunctionContext):
        pass

    # Exit a parse tree produced by LanguageParser#typeFunction.
    def exitTypeFunction(self, ctx:LanguageParser.TypeFunctionContext):
        pass


    # Enter a parse tree produced by LanguageParser#paramsList.
    def enterParamsList(self, ctx:LanguageParser.ParamsListContext):
        pass

    # Exit a parse tree produced by LanguageParser#paramsList.
    def exitParamsList(self, ctx:LanguageParser.ParamsListContext):
        pass


    # Enter a parse tree produced by LanguageParser#callFunction.
    def enterCallFunction(self, ctx:LanguageParser.CallFunctionContext):
        pass

    # Exit a parse tree produced by LanguageParser#callFunction.
    def exitCallFunction(self, ctx:LanguageParser.CallFunctionContext):
        pass


    # Enter a parse tree produced by LanguageParser#callFunctionParams.
    def enterCallFunctionParams(self, ctx:LanguageParser.CallFunctionParamsContext):
        pass

    # Exit a parse tree produced by LanguageParser#callFunctionParams.
    def exitCallFunctionParams(self, ctx:LanguageParser.CallFunctionParamsContext):
        pass


    # Enter a parse tree produced by LanguageParser#return.
    def enterReturn(self, ctx:LanguageParser.ReturnContext):
        pass

    # Exit a parse tree produced by LanguageParser#return.
    def exitReturn(self, ctx:LanguageParser.ReturnContext):
        pass


    # Enter a parse tree produced by LanguageParser#contentReturn.
    def enterContentReturn(self, ctx:LanguageParser.ContentReturnContext):
        pass

    # Exit a parse tree produced by LanguageParser#contentReturn.
    def exitContentReturn(self, ctx:LanguageParser.ContentReturnContext):
        pass


    # Enter a parse tree produced by LanguageParser#controlCommands.
    def enterControlCommands(self, ctx:LanguageParser.ControlCommandsContext):
        pass

    # Exit a parse tree produced by LanguageParser#controlCommands.
    def exitControlCommands(self, ctx:LanguageParser.ControlCommandsContext):
        pass


    # Enter a parse tree produced by LanguageParser#conditions.
    def enterConditions(self, ctx:LanguageParser.ConditionsContext):
        pass

    # Exit a parse tree produced by LanguageParser#conditions.
    def exitConditions(self, ctx:LanguageParser.ConditionsContext):
        pass


    # Enter a parse tree produced by LanguageParser#ifelse.
    def enterIfelse(self, ctx:LanguageParser.IfelseContext):
        pass

    # Exit a parse tree produced by LanguageParser#ifelse.
    def exitIfelse(self, ctx:LanguageParser.IfelseContext):
        pass


    # Enter a parse tree produced by LanguageParser#else.
    def enterElse(self, ctx:LanguageParser.ElseContext):
        pass

    # Exit a parse tree produced by LanguageParser#else.
    def exitElse(self, ctx:LanguageParser.ElseContext):
        pass


    # Enter a parse tree produced by LanguageParser#while.
    def enterWhile(self, ctx:LanguageParser.WhileContext):
        pass

    # Exit a parse tree produced by LanguageParser#while.
    def exitWhile(self, ctx:LanguageParser.WhileContext):
        pass


    # Enter a parse tree produced by LanguageParser#break.
    def enterBreak(self, ctx:LanguageParser.BreakContext):
        pass

    # Exit a parse tree produced by LanguageParser#break.
    def exitBreak(self, ctx:LanguageParser.BreakContext):
        pass


    # Enter a parse tree produced by LanguageParser#nativeFunctions.
    def enterNativeFunctions(self, ctx:LanguageParser.NativeFunctionsContext):
        pass

    # Exit a parse tree produced by LanguageParser#nativeFunctions.
    def exitNativeFunctions(self, ctx:LanguageParser.NativeFunctionsContext):
        pass


    # Enter a parse tree produced by LanguageParser#print.
    def enterPrint(self, ctx:LanguageParser.PrintContext):
        pass

    # Exit a parse tree produced by LanguageParser#print.
    def exitPrint(self, ctx:LanguageParser.PrintContext):
        pass


    # Enter a parse tree produced by LanguageParser#printParams.
    def enterPrintParams(self, ctx:LanguageParser.PrintParamsContext):
        pass

    # Exit a parse tree produced by LanguageParser#printParams.
    def exitPrintParams(self, ctx:LanguageParser.PrintParamsContext):
        pass


    # Enter a parse tree produced by LanguageParser#scanf.
    def enterScanf(self, ctx:LanguageParser.ScanfContext):
        pass

    # Exit a parse tree produced by LanguageParser#scanf.
    def exitScanf(self, ctx:LanguageParser.ScanfContext):
        for test in ctx.id_():
            var = self.sybolTable[test.ID().getText()]
            self.jasminParser.callScanner(var[1])
            self.jasminParser.storage(var[0],var[1])



    # Enter a parse tree produced by LanguageParser#varDeclaration.
    def enterVarDeclaration(self, ctx:LanguageParser.VarDeclarationContext):
        pass

    # Exit a parse tree produced by LanguageParser#varDeclaration.
    def exitVarDeclaration(self, ctx:LanguageParser.VarDeclarationContext):
        pass


    # Enter a parse tree produced by LanguageParser#contentVarDeclaration.
    def enterContentVarDeclaration(self, ctx:LanguageParser.ContentVarDeclarationContext):
        pass

    # Exit a parse tree produced by LanguageParser#contentVarDeclaration.
    def exitContentVarDeclaration(self, ctx:LanguageParser.ContentVarDeclarationContext):
        pass

    # Enter a parse tree produced by LanguageParser#var.
    def enterVar(self, ctx:LanguageParser.VarContext):
        pass

    # Exit a parse tree produced by LanguageParser#var.
    def exitVar(self, ctx:LanguageParser.VarContext):
        for test in ctx.id_():
            type = ctx.type_().getText()
            self.sybolTable[test.ID().getText()] = [self.currentId,type , self.initialValue(type)]
            self.currentId += 1
            self.jasminParser.loadConst(self.initialValue(type),type)
            self.jasminParser.storage(self.sybolTable[test.ID().getText()][0],ctx.type_().getText())



    # Enter a parse tree produced by LanguageParser#id.
    def enterId(self, ctx:LanguageParser.IdContext):
        pass

    # Exit a parse tree produced by LanguageParser#id.
    def exitId(self, ctx:LanguageParser.IdContext):
        pass


    # Enter a parse tree produced by LanguageParser#constVar.
    def enterConstVar(self, ctx:LanguageParser.ConstVarContext):
        pass

    # Exit a parse tree produced by LanguageParser#constVar.
    def exitConstVar(self, ctx:LanguageParser.ConstVarContext):
        pass


    # Enter a parse tree produced by LanguageParser#value.
    def enterValue(self, ctx:LanguageParser.ValueContext):
        pass

    # Exit a parse tree produced by LanguageParser#value.
    def exitValue(self, ctx:LanguageParser.ValueContext):
        pass


    # Enter a parse tree produced by LanguageParser#type.
    def enterType(self, ctx:LanguageParser.TypeContext):
        pass

    # Exit a parse tree produced by LanguageParser#type.
    def exitType(self, ctx:LanguageParser.TypeContext):
        pass


    # Enter a parse tree produced by LanguageParser#primitiveType.
    def enterPrimitiveType(self, ctx:LanguageParser.PrimitiveTypeContext):
        pass

    # Exit a parse tree produced by LanguageParser#primitiveType.
    def exitPrimitiveType(self, ctx:LanguageParser.PrimitiveTypeContext):
        pass


    # Enter a parse tree produced by LanguageParser#expression.
    def enterExpression(self, ctx:LanguageParser.ExpressionContext):
        pass

    # Exit a parse tree produced by LanguageParser#expression.
    def exitExpression(self, ctx:LanguageParser.ExpressionContext):
        pass


    # Enter a parse tree produced by LanguageParser#allExp.
    def enterAllExp(self, ctx:LanguageParser.AllExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#allExp.
    def exitAllExp(self, ctx:LanguageParser.AllExpContext):
        pass


    # Enter a parse tree produced by LanguageParser#aritmeticExp.
    def enterAritmeticExp(self, ctx:LanguageParser.AritmeticExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#aritmeticExp.
    def exitAritmeticExp(self, ctx:LanguageParser.AritmeticExpContext):
        pass


    # Enter a parse tree produced by LanguageParser#logicExp.
    def enterLogicExp(self, ctx:LanguageParser.LogicExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#logicExp.
    def exitLogicExp(self, ctx:LanguageParser.LogicExpContext):
        pass


    # Enter a parse tree produced by LanguageParser#notExp.
    def enterNotExp(self, ctx:LanguageParser.NotExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#notExp.
    def exitNotExp(self, ctx:LanguageParser.NotExpContext):
        pass


    # Enter a parse tree produced by LanguageParser#elemAritmetic.
    def enterElemAritmetic(self, ctx:LanguageParser.ElemAritmeticContext):
        pass

    # Exit a parse tree produced by LanguageParser#elemAritmetic.
    def exitElemAritmetic(self, ctx:LanguageParser.ElemAritmeticContext):
        pass


    # Enter a parse tree produced by LanguageParser#elemLogic.
    def enterElemLogic(self, ctx:LanguageParser.ElemLogicContext):
        pass

    # Exit a parse tree produced by LanguageParser#elemLogic.
    def exitElemLogic(self, ctx:LanguageParser.ElemLogicContext):
        pass


    # Enter a parse tree produced by LanguageParser#logicOp.
    def enterLogicOp(self, ctx:LanguageParser.LogicOpContext):
        pass

    # Exit a parse tree produced by LanguageParser#logicOp.
    def exitLogicOp(self, ctx:LanguageParser.LogicOpContext):
        pass

    def initialValue(self, type):
        if type == "int":
            return 0
        elif type == "str":
            return ""
        elif type == "bool":
            return 0
        elif type == "float":
            return 0.0





del LanguageParser