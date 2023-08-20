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
    
    def writeLn(self, content):
         self.file.write(content + '\n')

    def createMain(self):
        self.writeLn('.method public static main([Ljava/lang/String;)V')

    def createHeader(self, stack=10, locals=7):
        self.writeLn(f'.limit stack {stack}')
        self.writeLn(f'.limit locals {locals}')

    def createEnd(self):
        self.writeLn('return')
        self.writeLn('.end method')

    #iniciando print
    def createInitPrint(self,address):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        self.writeLn(f'astore {address}')

    #print de constantes
    def createPrintValue(self, value):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        self.writeLn(f'ldc {value}')
        self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')

    #chamando o print para uma única variável de acordo com seu tipo
    def createPrint(self, args, type):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        if (type == "str"):
            self.writeLn(f'aload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')
        elif(type == "int"):
            self.writeLn(f'iload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(I)V')
        elif (type == "float"):
            self.writeLn(f'fload {args}')
            self.writeLn('invokevirtual java/io/PrintStream/println(F)V')

    def loadVar(self,args,type):
        if (type == "str"):
            self.writeLn(f'aload {args}')
        elif(type == "int"):
            self.writeLn(f'iload {args}')
        elif (type == "float"):
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
        if type == "str":
            self.writeLn(f'ldc \"{value}\"')
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

    def callCondition(self, logicOp, type):
        self.writeLn(f'{self.operators_reverse[logicOp]} l{self.ifstack[-1][0]if type=="if"else self.loopstack[-1][1]}')

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
        if type == "float":
            if op == "+":
                self.writeLn("fadd")
            if op == "-":
                self.writeLn("fsub")
            if op == "*":
                self.writeLn("fmul")
            if op == "/":
                self.writeLn("fdiv")

    def placeLabelIf(self, type):
        if type == "else":
            self.writeLn(f'l{self.ifstack[-1][0]}:')
        else:
            self.writeLn(f'l{self.ifstack[-1][1]}:')
            self.ifstack.pop()

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


    def createIfLabels(self):
        self.ifstack.append([self.count,self.count+1])
        self.count +=2

    def createLoopLabels(self):
        self.loopstack.append([self.count, self.count + 1])
        self.count += 2
    # def clean(self, type):
    #     if type!= "str":
    #         self.writeLn('pop')