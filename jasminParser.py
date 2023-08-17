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

    def createHeader(self, stack=3, locals=7):
        self.writeLn(f'.limit stack {stack}')
        self.writeLn(f'.limit locals {locals}')

    def createEnd(self):
        self.writeLn('return')
        self.writeLn('.end method')

    def createInitPrint(self):
        self.writeLn('getstatic java/lang/System/out Ljava/io/PrintStream;')

    def createPrint(self, args):
        self.writeLn(f'ldc "{args}"')
        self.writeLn('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')

    def createInitScanner(self, address):
        self.writeLn('new java/util/Scanner')
        self.writeLn('dup')
        self.writeLn('getstatic java/lang/System/in Ljava/io/InputStream;')
        self.writeLn('invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V')
        self.writeLn(f'astore {address}')

    def createScanner(self):
        self.writeLn('invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;')