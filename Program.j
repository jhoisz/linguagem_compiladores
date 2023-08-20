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
l0:
iload 1
ldc 100
if_icmpge l1
iload 1
iload 2
if_icmple l2
goto l1
l2:
iload 1
ldc 10
if_icmpge l4
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "pouco"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
l4:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
iload 1
ldc 2
iadd
istore 1
goto l0
l1:
return
.end method
