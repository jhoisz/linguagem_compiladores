# Generated from C:/Users/Anderson Guimarães/PycharmProjects/linguagem_compiladores\Language.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LanguageParser import LanguageParser
else:
    from LanguageParser import LanguageParser

# This class defines a complete generic visitor for a parse tree produced by LanguageParser.

class LanguageVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LanguageParser#prog.
    def visitProg(self, ctx:LanguageParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#main.
    def visitMain(self, ctx:LanguageParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#commands.
    def visitCommands(self, ctx:LanguageParser.CommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#function.
    def visitFunction(self, ctx:LanguageParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#typeFunction.
    def visitTypeFunction(self, ctx:LanguageParser.TypeFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#paramsList.
    def visitParamsList(self, ctx:LanguageParser.ParamsListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#callFunction.
    def visitCallFunction(self, ctx:LanguageParser.CallFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#callFunctionParams.
    def visitCallFunctionParams(self, ctx:LanguageParser.CallFunctionParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#return.
    def visitReturn(self, ctx:LanguageParser.ReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#contentReturn.
    def visitContentReturn(self, ctx:LanguageParser.ContentReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#controlCommands.
    def visitControlCommands(self, ctx:LanguageParser.ControlCommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#conditions.
    def visitConditions(self, ctx:LanguageParser.ConditionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#ifelse.
    def visitIfelse(self, ctx:LanguageParser.IfelseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#else.
    def visitElse(self, ctx:LanguageParser.ElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#while.
    def visitWhile(self, ctx:LanguageParser.WhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#break.
    def visitBreak(self, ctx:LanguageParser.BreakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#nativeFunctions.
    def visitNativeFunctions(self, ctx:LanguageParser.NativeFunctionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#print.
    def visitPrint(self, ctx:LanguageParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#printParams.
    def visitPrintParams(self, ctx:LanguageParser.PrintParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#scanf.
    def visitScanf(self, ctx:LanguageParser.ScanfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#varDeclaration.
    def visitVarDeclaration(self, ctx:LanguageParser.VarDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#contentVarDeclaration.
    def visitContentVarDeclaration(self, ctx:LanguageParser.ContentVarDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#var.
    def visitVar(self, ctx:LanguageParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#id.
    def visitId(self, ctx:LanguageParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#constVar.
    def visitConstVar(self, ctx:LanguageParser.ConstVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#value.
    def visitValue(self, ctx:LanguageParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#type.
    def visitType(self, ctx:LanguageParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#primitiveType.
    def visitPrimitiveType(self, ctx:LanguageParser.PrimitiveTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#expression.
    def visitExpression(self, ctx:LanguageParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#allExp.
    def visitAllExp(self, ctx:LanguageParser.AllExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#aritmeticExp.
    def visitAritmeticExp(self, ctx:LanguageParser.AritmeticExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#logicExp.
    def visitLogicExp(self, ctx:LanguageParser.LogicExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#notExp.
    def visitNotExp(self, ctx:LanguageParser.NotExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#elemAritmetic.
    def visitElemAritmetic(self, ctx:LanguageParser.ElemAritmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#elemLogic.
    def visitElemLogic(self, ctx:LanguageParser.ElemLogicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LanguageParser#logicOp.
    def visitLogicOp(self, ctx:LanguageParser.LogicOpContext):
        return self.visitChildren(ctx)



del LanguageParser