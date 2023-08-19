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
        self.symbolTable = {}

    # Enter a parse tree produced by LanguageParser#prog.
    def enterProg(self, ctx:LanguageParser.ProgContext):
        self.jasminParser.createMain()
        self.jasminParser.createHeader()

    # Exit a parse tree produced by LanguageParser#prog.
    def exitProg(self, ctx:LanguageParser.ProgContext):
        self.jasminParser.createEnd()

    # Enter a parse tree produced by LanguageParser#main.
    def enterMain(self, ctx:LanguageParser.MainContext):
        self.jasminParser.createInitScanner(0)

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
        child = ctx.getChild(0)
        child.inherit = 'if'
        self.jasminParser.createIfLabels();

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
        self.jasminParser.goto("if","end")
        self.jasminParser.placeLabel("else")

    # Exit a parse tree produced by LanguageParser#else.
    def exitElse(self, ctx:LanguageParser.ElseContext):
        self.jasminParser.placeLabel("end")


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
        for param in ctx.printParams():
            if param.ID() is not None:
                id = self.symbolTable[param.ID().getText()]
                self.jasminParser.createPrint(id[0],id[1])
            else:
                self.jasminParser.createPrintValue(param.allExp().primitiveType().STRING().getText())


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
            var = self.symbolTable[test.ID().getText()]
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
        id = ctx.id_()
        while True:
            type = ctx.type_().getText()
            self.symbolTable[id.ID().getText()] = [self.currentId, type , self.initialValue(type)]
            self.currentId += 1
            self.jasminParser.loadConst(self.initialValue(type),type)
            self.jasminParser.storage(self.symbolTable[id.ID().getText()][0], ctx.type_().getText())
            if len(id.id_()) == 0:
                break
            else:
                id = id.id_()[0]


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
        if ctx.FLOAT() is not None:
            self.jasminParser.loadConst(ctx.FLOAT().getText(), "float")
            ctx.type = "float"

        elif ctx.INT() is not None:
            self.jasminParser.loadConst(ctx.INT().getText(), "int")
            ctx.type = "int"

    # Enter a parse tree produced by LanguageParser#expression.
    def enterExpression(self, ctx:LanguageParser.ExpressionContext):
        child = ctx.getChild(2)
        child.inherit = 'attr'

    # Exit a parse tree produced by LanguageParser#expression.
    def exitExpression(self, ctx:LanguageParser.ExpressionContext):
        if ctx.ID().getText() not in self.symbolTable:
            raise Exception("variavel não declarada anteriormente")
        else:
            var = self.symbolTable[ctx.ID().getText()]
            self.jasminParser.storage(var[0],var[1])


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
        if ctx.elemAritmetic() is not None:
            ctx.type = ctx.elemAritmetic().type
        else:
            for art in ctx.aritmeticExp():
                ctx.type  = art.type

        if ctx.DIV() is not None:
            self.jasminParser.aritimeticOperand("/",ctx.type)
        if ctx.ADD() is not None:
            self.jasminParser.aritimeticOperand("+",ctx.type)
        if ctx.MUL() is not None:
            self.jasminParser.aritimeticOperand("*",ctx.type)
        if ctx.SUB() is not None:
            self.jasminParser.aritimeticOperand("-",ctx.type)

    # Enter a parse tree produced by LanguageParser#logicExp.
    def enterLogicExp(self, ctx:LanguageParser.LogicExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#logicExp.
    def exitLogicExp(self, ctx:LanguageParser.LogicExpContext):
        if ctx.inherit == 'if':
            self.jasminParser.callIf(ctx.logicOp().getText())


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
        if ctx.ID() is not None:
            var = None
            try:
                var = self.symbolTable[ctx.ID().getText()]
            except:
                raise Exception("identificador não declararo!!")
            self.jasminParser.loadVar(var[0], var[1])
            ctx.type = var[1]
        elif ctx.FLOAT() is not None:
            self.jasminParser.loadConst(ctx.FLOAT().getText(), "float")
            ctx.type = "float"
        elif ctx.INT() is not None:
            self.jasminParser.loadConst(ctx.INT().getText(), "int")
            ctx.type = "int"

    # Enter a parse tree produced by LanguageParser#elemLogic.
    def enterElemLogic(self, ctx:LanguageParser.ElemLogicContext):
        pass

    # Exit a parse tree produced by LanguageParser#elemLogic.
    def exitElemLogic(self, ctx:LanguageParser.ElemLogicContext):
        if ctx.ID() is not None:
            var = None
            try:
                var = self.symbolTable[ctx.ID().getText()]
            except:
                raise Exception("identificador não declararo!!")
            self.jasminParser.loadVar(var[0], var[1])
            ctx.type = var[1]



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