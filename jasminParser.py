class JasminParser:
    def __init__(self):
        self.path = ''
        self.file = open('Program.j', 'w+')
        self.file.write('.class public Program')
        self.file.write('.super java/lang/Object')

    def createMain(self):
        self.file.write('.method public static main([Ljava/lang/String;)V')

    def createHeader(self, stack=3, locals=7):
        self.file.write(f'.limit stack {stack}')
        self.file.write(f'.limit locals {locals}')

    def createEnd(self):
        self.file.write('return')
        self.file.write('.end method')

    def createInitPrint(self):
        self.file.write('getstatic java/lang/System/out Ljava/io/PrintStream;')

    def createPrint(self, args):
        self.file.write(f'ldc {args}')
        self.file.write('invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V')