class JasminParser:
    def __init__(self):
        self.path = ''
        self.file = open('Program.j', 'w+')
        self.writeLn('.class public Program')
        self.writeLn('.super java/lang/Object')
    
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

    def createInitPrint(self,address):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        self.writeLn(f'astore {address}')

    def createPrintValue(self, value):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')
        self.writeLn(f'ldc {value}')
        self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')

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

    def createInitScanner(self, address):
        self.writeLn('new java/util/Scanner')
        self.writeLn('dup')
        self.writeLn('getstatic java/lang/System/in Ljava/io/InputStream;')
        self.writeLn('invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V')
        self.writeLn(f'astore {address}')

    def callScanner(self,type):
        self.writeLn("aload 0")
        if (type == "str"):
            self.writeLn('invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;')
        elif(type == "int"):
            self.writeLn('invokevirtual java/util/Scanner/nextInt()I')
        elif (type == "float"):
            self.writeLn('invokevirtual java/util/Scanner/nextFloat()F')


    def loadConst(self,value,type):
        if type == "str":
            self.writeLn(f'ldc \"{value}\"')
        else:
            self.writeLn(f'ldc {value}')

    def storage(self, id, type):
        if type == "str":
            self.writeLn(f'astore {id}')
        elif type == "int":
            self.writeLn(f'istore {id}')
        elif type == "bool":
            self.writeLn(f'istore {id}')
        elif type == "float":
            self.writeLn(f'fstore {id}')