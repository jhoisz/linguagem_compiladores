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
ldc 0.0
fstore 1
ldc 0.0
fstore 2
ldc 0.0
fstore 3
ldc 0.0
fstore 4
ldc 0
istore 5
ldc ""
astore 6
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite o valor da 1 nota"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextFloat()F
fstore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite o valor da 2 nota"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextFloat()F
fstore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite o valor da 3 nota"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextFloat()F
fstore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a media eh:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fload 1
fload 2
fadd
fload 3
fadd
ldc 3
i2f
fdiv
fstore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 4
invokevirtual java/io/PrintStream/println(F)V
return
.end method
