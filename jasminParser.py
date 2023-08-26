class JasminParser:
    def __init__(self):
        self.path = ''
        self.file = open('Program.j', 'w+')
        self.writeLn('.class public Program')
        self.writeLn('.super java/lang/Object')
        self.count = 0
        self.ifstack=[]
        self.loopstack=[]
        self.operators_reverse = {
            "!=": "if_icmpeq",
            "==": "if_icmpne",
            ">=": "if_icmplt",
            ">": "if_icmple",
            "<=": "if_icmpgt",
            "<": "if_icmpge",
        }
        self.operators_reverse_simple = {
            "!=": "ifeq",
            "==": "ifne",
            ">=": "iflt",
            ">": "ifle",
            "<=": "ifgt",
            "<": "ifge",
        }
    
    def writeLn(self, content):
         self.file.write(content + '\n')

    def createMain(self):
        self.writeLn('.method public static main([Ljava/lang/String;)V')

    def createHeader(self, stack=20, locals=10):
        self.writeLn(f'.limit stack {stack}')
        self.writeLn(f'.limit locals {locals}')

    def createEnd(self):
        self.writeLn('return')
        self.writeLn('.end method')
        self.file.close()

    #iniciando print
    def createInitPrint(self,address):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        self.writeLn(f'astore {address}')

    def getPrint(self):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')

    #print de constantes
    def createPrintValue(self,type):
        if (type == "str"):
            self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')
        elif (type == "int"):
            self.writeLn('invokevirtual java/io/PrintStream/println(I)V')
        elif (type == "float"):
            self.writeLn('invokevirtual java/io/PrintStream/println(F)V')
        elif (type == "bool"):
            self.ifBoolprint()
            self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')


    #chamando o print para uma única variável de acordo com seu tipo
    def createPrint(self, args, type):
        if (type == "str"):
            self.writeLn(f'aload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')
        elif(type == "int"):
            self.writeLn(f'iload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(I)V')
        elif (type == "float"):
            self.writeLn(f'fload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(F)V')
        elif(type == 'bool'):
            self.writeLn(f'iload {args}')
            self.ifBoolprint()
            self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')

    def loadVar(self,args,type):
        if type == "str":
            self.writeLn(f'aload {args}')
        elif type == "int" or type == "bool":
            self.writeLn(f'iload {args}')
        elif type == "float":
            self.writeLn(f'fload {args}')

    #inicializando scanner
    def createInitScanner(self, address):
        self.writeLn('new java/util/Scanner')
        self.writeLn('dup')
        self.writeLn('getstatic java/lang/System/in Ljava/io/InputStream;')
        self.writeLn('invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V')
        self.writeLn(f'astore {address}')

    #chama o scanner de acordo com o tipo
    def callScanner(self,type):
        self.writeLn("aload 0")
        if (type == "str"):
            self.writeLn('invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;')
        elif(type == "int"):
            self.writeLn('invokevirtual java/util/Scanner/nextInt()I')
        elif (type == "float"):
            self.writeLn('invokevirtual java/util/Scanner/nextFloat()F')


    #colocando o valor de uma constante na pilha
    def loadConst(self,value,type):
        if type == "str" and value== "":
            self.writeLn(f'ldc \"{value}\"')
        elif type == 'bool' and value == "true":
            self.writeLn('ldc 1')
        elif type == 'bool' and value == "false":
            self.writeLn('ldc 0')
        elif type == 'bool':
            raise Exception(f'valor {value} inválido para booleano')
        else:
            self.writeLn(f'ldc {value}')
    #guradando valor em uma variável no enderco id
    def storage(self, id, type):
        if type == "str":
            self.writeLn(f'astore {id}')
        elif type == "int":
            self.writeLn(f'istore {id}')
        elif type == "bool":
            self.writeLn(f'istore {id}')
        elif type == "float":
            self.writeLn(f'fstore {id}')

    def callCondition(self, logicOp, type,typeIf):
        if typeIf == "int":
            self.writeLn(f'{self.operators_reverse[logicOp]} l{self.ifstack[-1][0]if type=="if"else self.loopstack[-1][1]}')
        elif typeIf == "float":
            self.writeLn("fcmpl")
            self.writeLn(f'{self.operators_reverse_simple[logicOp]} l{self.ifstack[-1][0]if type=="if"else self.loopstack[-1][1]}')
        elif typeIf == "bool":
            self.writeLn(
                f'ifeq l{self.ifstack[-1][0] if type == "if" else self.loopstack[-1][1]}')

    def executeBoolExpression(self,logicOp, typeIf):
        if typeIf == "int":
            self.writeLn(
                f'{self.operators_reverse[logicOp]} l{self.count}')
        elif typeIf == "float":
            self.writeLn("fcmpl")
            self.writeLn(
                f'{self.operators_reverse_simple[logicOp]} l{self.count}')
        self.writeLn("ldc 1")
        self.writeLn((f'goto l{self.count+1}'))
        self.writeLn(f'l{self.count}:')
        self.writeLn("ldc 0")
        self.writeLn(f'l{self.count + 1}:')
        self.count+=2

    def aritimeticOperand(self,op,type):
        if type == "int":
            if op == "+":
                self.writeLn("iadd")
            if op == "-":
                self.writeLn("isub")
            if op == "*":
                self.writeLn("imul")
            if op == "/":
                self.writeLn("idiv")
            if op == "@":
                self.writeLn("ldc -1")
                self.writeLn("imul")
        if type == "float":
            if op == "+":
                self.writeLn("fadd")
            if op == "-":
                self.writeLn("fsub")
            if op == "*":
                self.writeLn("fmul")
            if op == "/":
                self.writeLn("fdiv")
            if op == "@":
                self.writeLn("ldc -1.0")
                self.writeLn("fmul")

    def placeLabelIf(self, type):
        if type == "else":
            self.writeLn(f'l{self.ifstack[-1][0]}:')
        else:
            self.writeLn(f'l{self.ifstack[-1][1]}:')
            self.ifstack.pop()

    def ifBoolprint(self, _not=False, _ctx='print'):
        self.writeLn(f'ifne l{self.count}')
        self.writeLn(f'ldc \"false\"')
        self.writeLn(f'goto l{self.count+1}')
        self.writeLn(f'l{self.count}:')
        self.writeLn(f'ldc \"true\"')
        self.writeLn(f'l{self.count+1}:')
        self.count +=2

    def placeLabelLoop(self, type):
        if type == "while" :
            self.writeLn(f'l{self.loopstack[-1][0]}:')
        else:
            self.writeLn(f'l{self.loopstack[-1][1]}:')
            self.loopstack.pop()

    def goto(self, type, local):
        if type == "if" and local == "end":
            self.writeLn(f'goto l{self.ifstack[-1][1]}')
        elif type == "if" and local == "else":
            self.writeLn(f'goto l{self.ifstack[-1][0]}')
        elif type == "while" and local == "ini":
            self.writeLn(f'goto l{self.loopstack[-1][0]}')
        elif type == "while" and local == "end":
            self.writeLn(f'goto l{self.loopstack[-1][1]}')

    def intToFloat(self, pos):
        if pos == 1:
            self.writeLn("swap")
            self.writeLn("i2f")
            self.writeLn("swap")
        else:
            self.writeLn("i2f")

    def floatToInt(self, pos):
        if pos == 1:
            self.writeLn("swap")
            self.writeLn("f2i")
            self.writeLn("swap")
        else:
            self.writeLn("f2i")


    def createIfLabels(self):
        self.ifstack.append([self.count,self.count+1])
        self.count +=2

    def createLoopLabels(self):
        self.loopstack.append([self.count, self.count + 1])
        self.count += 2
    # def clean(self, type):
    #     if type!= "str":
    #         self.writeLn('pop')
    def xor(self):
        self.writeLn("iconst_1")
        self.writeLn("ixor")