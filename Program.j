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
ldc ""
astore 2
ldc 0.0
fstore 3
ldc 0.0
fstore 4
ldc 0.0
fstore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Digite numero:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextInt()I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite nome:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
astore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite nota1"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextFloat()F
fstore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "digite nota3"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
invokevirtual java/util/Scanner/nextFloat()F
fstore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "resultados:"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 3
invokevirtual java/io/PrintStream/println(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 2
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 5
invokevirtual java/io/PrintStream/println(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
return
.end method
