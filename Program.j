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
ldc 1
istore 2
iload 2
ifeq l0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "media"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
l0:
ldc 1
istore 1
l2:
ldc 1
ifeq l3
iload 1
ldc 1
iadd
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
iload 1
ldc 10
if_icmple l4
goto l3
l4:
goto l2
l3:
return
.end method
