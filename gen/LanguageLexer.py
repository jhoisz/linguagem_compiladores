# Generated from C:/Users/VAIO/Desktop/compiladores/javapy/linguagem_compiladores\Language.g4 by ANTLR 4.12.0
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,41,276,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
        39,7,39,2,40,7,40,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,2,1,
        3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,
        1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,
        1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,16,
        1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,19,
        1,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,
        1,22,1,22,1,23,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,25,1,26,1,26,
        1,26,1,27,1,27,1,28,1,28,1,29,1,29,1,30,1,30,1,31,1,31,1,32,1,32,
        1,33,5,33,205,8,33,10,33,12,33,208,9,33,1,34,4,34,211,8,34,11,34,
        12,34,212,1,34,1,34,4,34,217,8,34,11,34,12,34,218,1,35,1,35,4,35,
        223,8,35,11,35,12,35,224,1,35,1,35,1,36,1,36,1,36,1,36,1,36,1,36,
        1,36,1,36,1,36,3,36,238,8,36,1,37,1,37,1,37,5,37,243,8,37,10,37,
        12,37,246,9,37,1,38,1,38,1,38,1,38,1,39,1,39,1,39,1,39,5,39,256,
        8,39,10,39,12,39,259,9,39,1,39,1,39,1,40,1,40,1,40,1,40,5,40,267,
        8,40,10,40,12,40,270,9,40,1,40,1,40,1,40,1,40,1,40,0,0,41,1,1,3,
        2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,
        29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,
        51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,33,67,34,69,35,71,36,
        73,37,75,38,77,39,79,40,81,41,1,0,6,1,0,48,57,4,0,10,10,13,13,34,
        34,92,92,2,0,65,90,97,122,4,0,48,57,65,90,95,95,97,122,4,0,9,10,
        13,13,32,32,45,45,2,0,13,13,34,34,283,0,1,1,0,0,0,0,3,1,0,0,0,0,
        5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,
        1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
        1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,
        1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,
        1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,
        1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,
        1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,75,
        1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,1,83,1,0,0,0,3,88,
        1,0,0,0,5,90,1,0,0,0,7,94,1,0,0,0,9,96,1,0,0,0,11,98,1,0,0,0,13,
        100,1,0,0,0,15,105,1,0,0,0,17,107,1,0,0,0,19,114,1,0,0,0,21,117,
        1,0,0,0,23,122,1,0,0,0,25,128,1,0,0,0,27,134,1,0,0,0,29,140,1,0,
        0,0,31,146,1,0,0,0,33,150,1,0,0,0,35,156,1,0,0,0,37,158,1,0,0,0,
        39,162,1,0,0,0,41,168,1,0,0,0,43,172,1,0,0,0,45,177,1,0,0,0,47,179,
        1,0,0,0,49,182,1,0,0,0,51,185,1,0,0,0,53,188,1,0,0,0,55,191,1,0,
        0,0,57,193,1,0,0,0,59,195,1,0,0,0,61,197,1,0,0,0,63,199,1,0,0,0,
        65,201,1,0,0,0,67,206,1,0,0,0,69,210,1,0,0,0,71,220,1,0,0,0,73,237,
        1,0,0,0,75,239,1,0,0,0,77,247,1,0,0,0,79,251,1,0,0,0,81,262,1,0,
        0,0,83,84,5,109,0,0,84,85,5,97,0,0,85,86,5,105,0,0,86,87,5,110,0,
        0,87,2,1,0,0,0,88,89,5,58,0,0,89,4,1,0,0,0,90,91,5,101,0,0,91,92,
        5,110,0,0,92,93,5,100,0,0,93,6,1,0,0,0,94,95,5,59,0,0,95,8,1,0,0,
        0,96,97,5,40,0,0,97,10,1,0,0,0,98,99,5,41,0,0,99,12,1,0,0,0,100,
        101,5,118,0,0,101,102,5,111,0,0,102,103,5,105,0,0,103,104,5,100,
        0,0,104,14,1,0,0,0,105,106,5,44,0,0,106,16,1,0,0,0,107,108,5,114,
        0,0,108,109,5,101,0,0,109,110,5,116,0,0,110,111,5,117,0,0,111,112,
        5,114,0,0,112,113,5,110,0,0,113,18,1,0,0,0,114,115,5,105,0,0,115,
        116,5,102,0,0,116,20,1,0,0,0,117,118,5,101,0,0,118,119,5,108,0,0,
        119,120,5,115,0,0,120,121,5,101,0,0,121,22,1,0,0,0,122,123,5,119,
        0,0,123,124,5,104,0,0,124,125,5,105,0,0,125,126,5,108,0,0,126,127,
        5,101,0,0,127,24,1,0,0,0,128,129,5,98,0,0,129,130,5,114,0,0,130,
        131,5,101,0,0,131,132,5,97,0,0,132,133,5,107,0,0,133,26,1,0,0,0,
        134,135,5,112,0,0,135,136,5,114,0,0,136,137,5,105,0,0,137,138,5,
        110,0,0,138,139,5,116,0,0,139,28,1,0,0,0,140,141,5,115,0,0,141,142,
        5,99,0,0,142,143,5,97,0,0,143,144,5,110,0,0,144,145,5,102,0,0,145,
        30,1,0,0,0,146,147,5,118,0,0,147,148,5,97,0,0,148,149,5,114,0,0,
        149,32,1,0,0,0,150,151,5,99,0,0,151,152,5,111,0,0,152,153,5,110,
        0,0,153,154,5,115,0,0,154,155,5,116,0,0,155,34,1,0,0,0,156,157,5,
        61,0,0,157,36,1,0,0,0,158,159,5,105,0,0,159,160,5,110,0,0,160,161,
        5,116,0,0,161,38,1,0,0,0,162,163,5,102,0,0,163,164,5,108,0,0,164,
        165,5,111,0,0,165,166,5,97,0,0,166,167,5,116,0,0,167,40,1,0,0,0,
        168,169,5,115,0,0,169,170,5,116,0,0,170,171,5,114,0,0,171,42,1,0,
        0,0,172,173,5,98,0,0,173,174,5,111,0,0,174,175,5,111,0,0,175,176,
        5,108,0,0,176,44,1,0,0,0,177,178,5,33,0,0,178,46,1,0,0,0,179,180,
        5,61,0,0,180,181,5,61,0,0,181,48,1,0,0,0,182,183,5,33,0,0,183,184,
        5,61,0,0,184,50,1,0,0,0,185,186,5,62,0,0,186,187,5,61,0,0,187,52,
        1,0,0,0,188,189,5,60,0,0,189,190,5,61,0,0,190,54,1,0,0,0,191,192,
        5,62,0,0,192,56,1,0,0,0,193,194,5,60,0,0,194,58,1,0,0,0,195,196,
        5,42,0,0,196,60,1,0,0,0,197,198,5,47,0,0,198,62,1,0,0,0,199,200,
        5,43,0,0,200,64,1,0,0,0,201,202,5,45,0,0,202,66,1,0,0,0,203,205,
        7,0,0,0,204,203,1,0,0,0,205,208,1,0,0,0,206,204,1,0,0,0,206,207,
        1,0,0,0,207,68,1,0,0,0,208,206,1,0,0,0,209,211,7,0,0,0,210,209,1,
        0,0,0,211,212,1,0,0,0,212,210,1,0,0,0,212,213,1,0,0,0,213,214,1,
        0,0,0,214,216,5,46,0,0,215,217,7,0,0,0,216,215,1,0,0,0,217,218,1,
        0,0,0,218,216,1,0,0,0,218,219,1,0,0,0,219,70,1,0,0,0,220,222,5,34,
        0,0,221,223,8,1,0,0,222,221,1,0,0,0,223,224,1,0,0,0,224,222,1,0,
        0,0,224,225,1,0,0,0,225,226,1,0,0,0,226,227,5,34,0,0,227,72,1,0,
        0,0,228,229,5,116,0,0,229,230,5,114,0,0,230,231,5,117,0,0,231,238,
        5,101,0,0,232,233,5,102,0,0,233,234,5,97,0,0,234,235,5,108,0,0,235,
        236,5,115,0,0,236,238,5,101,0,0,237,228,1,0,0,0,237,232,1,0,0,0,
        238,74,1,0,0,0,239,240,7,2,0,0,240,244,6,37,0,0,241,243,7,3,0,0,
        242,241,1,0,0,0,243,246,1,0,0,0,244,242,1,0,0,0,244,245,1,0,0,0,
        245,76,1,0,0,0,246,244,1,0,0,0,247,248,7,4,0,0,248,249,1,0,0,0,249,
        250,6,38,1,0,250,78,1,0,0,0,251,252,5,47,0,0,252,253,5,47,0,0,253,
        257,1,0,0,0,254,256,8,1,0,0,255,254,1,0,0,0,256,259,1,0,0,0,257,
        255,1,0,0,0,257,258,1,0,0,0,258,260,1,0,0,0,259,257,1,0,0,0,260,
        261,6,39,1,0,261,80,1,0,0,0,262,263,5,47,0,0,263,264,5,42,0,0,264,
        268,1,0,0,0,265,267,8,5,0,0,266,265,1,0,0,0,267,270,1,0,0,0,268,
        266,1,0,0,0,268,269,1,0,0,0,269,271,1,0,0,0,270,268,1,0,0,0,271,
        272,5,42,0,0,272,273,5,47,0,0,273,274,1,0,0,0,274,275,6,40,1,0,275,
        82,1,0,0,0,9,0,206,212,218,224,237,244,257,268,2,1,37,0,6,0,0
    ]

class LanguageLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    T__13 = 14
    T__14 = 15
    T__15 = 16
    T__16 = 17
    T__17 = 18
    T__18 = 19
    T__19 = 20
    T__20 = 21
    T__21 = 22
    T__22 = 23
    T__23 = 24
    T__24 = 25
    T__25 = 26
    T__26 = 27
    T__27 = 28
    T__28 = 29
    MUL = 30
    DIV = 31
    ADD = 32
    SUB = 33
    INT = 34
    FLOAT = 35
    STRING = 36
    BOOL = 37
    ID = 38
    Space = 39
    COMMENT_ONE_LINE = 40
    COMMENT_MULT_LINES = 41

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "':'", "'end'", "';'", "'('", "')'", "'void'", "','", 
            "'return'", "'if'", "'else'", "'while'", "'break'", "'print'", 
            "'scanf'", "'var'", "'const'", "'='", "'int'", "'float'", "'str'", 
            "'bool'", "'!'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", 
            "'*'", "'/'", "'+'", "'-'" ]

    symbolicNames = [ "<INVALID>",
            "MUL", "DIV", "ADD", "SUB", "INT", "FLOAT", "STRING", "BOOL", 
            "ID", "Space", "COMMENT_ONE_LINE", "COMMENT_MULT_LINES" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "T__15", "T__16", "T__17", "T__18", "T__19", 
                  "T__20", "T__21", "T__22", "T__23", "T__24", "T__25", 
                  "T__26", "T__27", "T__28", "MUL", "DIV", "ADD", "SUB", 
                  "INT", "FLOAT", "STRING", "BOOL", "ID", "Space", "COMMENT_ONE_LINE", 
                  "COMMENT_MULT_LINES" ]

    grammarFileName = "Language.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[37] = self.ID_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def ID_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:
            1
     


