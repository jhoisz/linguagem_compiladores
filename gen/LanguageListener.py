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
        child.inherit = ctx.inherit


    # Exit a parse tree produced by LanguageParser#conditions.
    def exitConditions(self, ctx:LanguageParser.ConditionsContext):
        if ctx.ID() is not None :
            var = self.getFromSymbolTable[ctx.ID().getText()]
            self.jasminParser.loadVar(var[0],var[1])
            self.jasminParser.callCondition("",ctx.inherit,"bool")
        elif ctx.BOOL() is not None:
            self.jasminParser.loadConst(ctx.BOOL().getText(),"bool")
            self.jasminParser.callCondition("", ctx.inherit, "bool")


    # Enter a parse tree produced by LanguageParser#ifelse.
    def enterIfelse(self, ctx:LanguageParser.IfelseContext):
        self.jasminParser.createIfLabels()
        child = ctx.getChild(2)
        child.inherit = "if"

    # Exit a parse tree produced by LanguageParser#ifelse.
    def exitIfelse(self, ctx:LanguageParser.IfelseContext):
        if ctx.else_() is not None:
            self.jasminParser.placeLabelIf("end")
        else:
            self.jasminParser.placeLabelIf("else")


    # Enter a parse tree produced by LanguageParser#else.
    def enterElse(self, ctx:LanguageParser.ElseContext):
        self.jasminParser.goto("if","end")
        self.jasminParser.placeLabelIf("else")

    # Exit a parse tree produced by LanguageParser#else.
    def exitElse(self, ctx:LanguageParser.ElseContext):
       pass


    # Enter a parse tree produced by LanguageParser#while.
    def enterWhile(self, ctx:LanguageParser.WhileContext):
        self.jasminParser.createLoopLabels()
        self.jasminParser.placeLabelLoop("while")
        child = ctx.getChild(2)
        child.inherit = "while"


    # Exit a parse tree produced by LanguageParser#while.
    def exitWhile(self, ctx:LanguageParser.WhileContext):
        self.jasminParser.goto("while","ini")
        self.jasminParser.placeLabelLoop("end")


    # Enter a parse tree produced by LanguageParser#break.
    def enterBreak(self, ctx:LanguageParser.BreakContext):
        pass

    # Exit a parse tree produced by LanguageParser#break.
    def exitBreak(self, ctx:LanguageParser.BreakContext):
        try:
            self.jasminParser.goto("while","end")
        except:
            raise Exception(f'line {ctx.start.line}: Comando break fora de while!')

    # Enter a parse tree produced by LanguageParser#nativeFunctions.
    def enterNativeFunctions(self, ctx:LanguageParser.NativeFunctionsContext):
        pass

    # Exit a parse tree produced by LanguageParser#nativeFunctions.
    def exitNativeFunctions(self, ctx:LanguageParser.NativeFunctionsContext):
        pass


    # Enter a parse tree produced by LanguageParser#print.
    def enterPrint(self, ctx:LanguageParser.PrintContext):
        self.jasminParser.getPrint()

    # Exit a parse tree produced by LanguageParser#print.
    def exitPrint(self, ctx:LanguageParser.PrintContext):
        for param in ctx.printParams():
            if param.ID() is not None:
                id = self.getFromSymbolTable(param.ID().getText())
                if id[0] is not None: # variáveis
                    self.jasminParser.createPrint(id[0],id[1])
                else: # constantes
                    self.jasminParser.loadConst(id[2], id[1])
                    self.jasminParser.createPrintValue(id[1])
            elif param.allExp() is not None:
                self.jasminParser.createPrintValue(param.allExp().type)


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
            var = self.getFromSymbolTable(test.ID().getText())

            if var[0] is None:
                raise Exception(f'line {ctx.start.line}: Erro de atribuição! identificador {test.ID().getText()} é uma constante')
                
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
        id = ctx.ID().getText()
        value = ctx.primitiveType()
        ctx.isConst = True

        if value.INT() is not None:
            self.symbolTable[id] = [None, 'int', int(value.INT().getText())]
        elif value.FLOAT() is not None:
            self.symbolTable[id] = [None, 'float', float(value.FLOAT().getText())]
        elif value.STRING() is not None:
            self.symbolTable[id] = [None, 'str', value.STRING().getText().replace('"', '')]
        elif value.BOOL() is not None:
            self.symbolTable[id] = [None, 'bool', value.BOOL().getText()]


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
        value = None
        if ctx.FLOAT() is not None:
            value = ctx.FLOAT().getText()
            ctx.type = "float"
        elif ctx.INT() is not None:
            value = ctx.INT().getText()
            ctx.type = "int"
        elif ctx.STRING() is not None:
            value = ctx.STRING().getText()
            ctx.type = "str"
        elif ctx.BOOL() is not None:
            value = ctx.BOOL().getText()
            ctx.type = "bool"

        if not hasattr(ctx.parentCtx, 'isConst'): # só carrega se não for declaração de constante
            self.jasminParser.loadConst(value, ctx.type)
                                        
    # Enter a parse tree produced by LanguageParserion.
    def enterExpression(self, ctx:LanguageParser.ExpressionContext):
        child = ctx.getChild(2)
        child.inherit = 'attr'

    # Exit a parse tree produced by LanguageParser#expression.
    def exitExpression(self, ctx:LanguageParser.ExpressionContext):
        var = self.getFromSymbolTable(ctx.ID().getText())

        if var[0] is None:
            raise Exception(f'line {ctx.start.line}: Erro de atribuição! {ctx.ID().getText()} é uma constante')
        else:
            ctx.type = ctx.getChild(2).type
            if ctx.type == "int" and var[1] == "float":
                self.jasminParser.intToFloat(2)
            elif ctx.type == "float" and var[1] == "int":
                self.jasminParser.floatToInt(2)
            elif ctx.type != var[1]:
                raise Exception(f'line {ctx.start.line}: Erro de atribuição! na variável {ctx.ID().getText()} era esperado {var[1]} mas foi recebido {ctx.type}')

            self.jasminParser.storage(var[0],var[1])


    # Enter a parse tree produced by LanguageParser#allExp.
    def enterAllExp(self, ctx:LanguageParser.AllExpContext):
        child = ctx.getChild(0)
        if hasattr(ctx,"inherit"):
            child.inherit = ctx.inherit

    # Exit a parse tree produced by LanguageParser#allExp.
    def exitAllExp(self, ctx:LanguageParser.AllExpContext):
        ctx.type = ctx.getChild(0).type


    # Enter a parse tree produced by LanguageParser#aritmeticExp.
    def enterAritmeticExp(self, ctx:LanguageParser.AritmeticExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#aritmeticExp.
    def exitAritmeticExp(self, ctx:LanguageParser.AritmeticExpContext):
        if ctx.elemAritmetic() is not None:
            ctx.type = ctx.elemAritmetic().type
        elif len(ctx.aritmeticExp()) == 1:
            ctx.type = ctx.aritmeticExp()[0].type
            if ctx.SUB() is not None:
                self.jasminParser.aritimeticOperand("@",ctx.type)
        else:
            operation = self.getOperation(ctx)
            operand1 = ctx.aritmeticExp()[0]
            operand2 = ctx.aritmeticExp()[1]
            if operand1.type not in ["float","int"]:
                raise Exception(f'line {ctx.start.line}: Operação \"{operation}\" inválida para tipo {operand1.type}')
            elif operand2.type not in ["float","int"]:
                raise Exception(f'line {ctx.start.line}: Operação \"{operation}\" inválida para tipo {operand2.type}')

            if operand1.type == operand2.type:
                ctx.type = operand2.type
            else:
                if operand2.type == "int":
                    self.jasminParser.intToFloat(2)
                else:
                    self.jasminParser.intToFloat(1)
                ctx.type = "float"
            self.jasminParser.aritimeticOperand(operation, ctx.type)


    def getOperation(self, ctx:LanguageParser.AritmeticExpContext):
        if ctx.DIV() is not None:
            return "/"
        if ctx.ADD() is not None:
            return "+"
        if ctx.MUL() is not None:
            return "*"
        if ctx.SUB() is not None:
            return "-"

    # Enter a parse tree produced by LanguageParser#logicExp.
    def enterLogicExp(self, ctx:LanguageParser.LogicExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#logicExp.
    def exitLogicExp(self, ctx:LanguageParser.LogicExpContext):
        typeIf = ""
        if ctx.logicExp() is not None and len(ctx.logicExp())==1:
            ctx.type = "bool"
        elif ctx.notExp() is not None:
            ctx.type='bool'
        else:
            operand1 = ctx.elemLogic()[0]
            operand2 = ctx.elemLogic()[1]

            if operand1.type not in ["float","int"]:
                raise Exception(f'line {ctx.start.line}: Operação {ctx.logicOp().getText()} inválida para tipo {operand1.type}')
            elif operand2.type not in ["float","int"]:
                raise Exception(f'line {ctx.start.line}: Operação {ctx.logicOp().getText()} inválida para tipo {operand2.type}')


            if operand1.type == operand2.type:
                typeIf = operand2.type
            else:
                if operand2.type == "int":
                    self.jasminParser.intToFloat(2)
                else:
                    self.jasminParser.intToFloat(1)
                typeIf = "float"
            if hasattr(ctx,"inherit") and ctx.inherit != "attr":
                self.jasminParser.callCondition(ctx.logicOp().getText(),ctx.inherit,typeIf)
            else:
                self.jasminParser.executeBoolExpression(ctx.logicOp().getText(),typeIf)
            ctx.type = 'bool'



    # Enter a parse tree produced by LanguageParser#notExp.
    def enterNotExp(self, ctx:LanguageParser.NotExpContext):
        pass

    # Exit a parse tree produced by LanguageParser#notExp.
    def exitNotExp(self, ctx:LanguageParser.NotExpContext):
        self.jasminParser.xor()

    # Enter a parse tree produced by LanguageParser#elemAritmetic.
    def enterElemAritmetic(self, ctx:LanguageParser.ElemAritmeticContext):
        pass

    # Exit a parse tree produced by LanguageParser#elemAritmetic.
    def exitElemAritmetic(self, ctx:LanguageParser.ElemAritmeticContext):
        if ctx.ID() is not None:
            var = self.getFromSymbolTable(ctx.ID().getText())
            
            if var[1] not in ["float","int"]:
                    raise Exception(f'line {ctx.start.line}: Operação inválida para variável \"{ctx.ID().getText()}\" de tipo: {var[1]}')
            
            if var[0] is None: # constante
                self.jasminParser.loadConst(var[2], var[1])
            else: #variavel
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
            var = self.getFromSymbolTable(ctx.ID().getText())

            if var[0] is None: # constante
                self.jasminParser.loadConst(var[2], var[1])
            else: #variavel
                self.jasminParser.loadVar(var[0], var[1])
           
            ctx.type = var[1]
        else:
            ctx.type = ctx.getChild(0).type



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
            return "false"
        elif type == "float":
            return 0.0

    def getFromSymbolTable(self, id):
        try:
            return self.symbolTable[id]
        except:
            raise Exception(f'Identificador não declarado: {id}')




del LanguageParser