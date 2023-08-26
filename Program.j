.class public Program
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 20
.limit locals 10
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
istore 2
ldc 1
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 3
ldc 4
imul
iadd
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
iconst_1
ixor
ifne l0
ldc "false"
goto l1
l0:
ldc "true"
l1:
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
