.class public Program
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 7
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 0
ldc 0
istore 1
ldc 0
istore 2
ldc 0
istore 3
ldc ""
astore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite o valor de x:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextInt()I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite o valor de y:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextInt()I
istore 2
iload 1
iload 2
if_icmple l0
iload 1
ldc 2
imul
iload 2
ldc 2
imul
iadd
istore 3
goto l1
l0:
iload 1
ldc 3
imul
iload 2
ldc 3
imul
iadd
istore 3
l1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "resultado"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream/println(I)V
return
.end method
