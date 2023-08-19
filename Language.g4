grammar Language;

prog: function* main;

// MAIN
main: 'main' ':' varDeclaration? commands* 'end';

// Comandos
commands: nativeFunctions
        | expression
        | controlCommands
        | callFunction ';'
        | return
        | break
        ;

// Funções
function: ID '(' paramsList? ')' ':' typeFunction
    varDeclaration?
    commands*
    'end';

typeFunction: type | 'void';
paramsList: type ID (',' paramsList)*;

// !!! funções podem não ter parâmetros
callFunction: ID '(' (callFunctionParams (',' callFunctionParams)*)? ')';
callFunctionParams: allExp | ID;

// Return
return: 'return' contentReturn ';';
contentReturn: ID  | allExp;

//COMANDOS DE CONTROLE
controlCommands: ifelse | while;

// Condições para os comandos de controle
conditions: logicExp | BOOL | ID;

//If - else
ifelse: 'if' '(' conditions ')' ':' commands* else? 'end';
else: 'else' ':' commands*;

//While
while: 'while' '(' conditions ')'  ':' commands* 'end';
break: 'break' ';';

//FUNÇÕES NATIVAS
nativeFunctions: print | scanf;

// print
print: 'print' '(' printParams (',' printParams)* ')' ';';
printParams: ID
           | allExp
           ;

// scanf
scanf: 'scanf' '(' id+ ')' ';';

// MANIPULANDO VARIÁVEIS
varDeclaration : 'var' ':' contentVarDeclaration+;

contentVarDeclaration: var ';' | constVar ';';

var: id ':' type;
id: ID (',' id)*;

// Variáveis constantes
constVar: 'const' value+;
value: ID '=' primitiveType (',' value)*;

// Variáveis: inteiros, reais, strings e booleanos
type: 'int' | 'float' | 'str' | 'bool';
primitiveType: INT | FLOAT | STRING | BOOL;

// EXPRESSÕES
// revisar expressões aritméticas
expression: ID '=' allExp ';';
allExp: aritmeticExp | logicExp | primitiveType | callFunction;

// Expressões aritméticas
aritmeticExp: SUB aritmeticExp
    | '(' aritmeticExp ')' |
    | aritmeticExp op = (MUL | DIV) aritmeticExp
	| aritmeticExp op = (ADD | SUB) aritmeticExp
	| (elemAritmetic | callFunction);


// Expressões lógicas
// revisar: a + b > 0
logicExp: elemLogic logicOp elemLogic | '(' logicExp ')' | notExp;
notExp: '!' elemLogic;

// Elementos das expressões
elemAritmetic: FLOAT | INT | ID;
elemLogic: primitiveType | ID | callFunction | aritmeticExp;

//OPERADORES
logicOp: '==' | '!=' | '>=' | '<=' | '>' | '<';

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

// INT: [1-9]{1}[0-9]*; Consertar caso de único 0
INT: [0-9]*;
FLOAT: [0-9]+'.'[0-9]+;
STRING: '"' ~["\r\n\\]+ '"';
BOOL: 'true' | 'false';
ID:[a-zA-Z]{1}[a-zA-Z_0-9]*;
Space: [ \t\r\n-] -> skip;
COMMENT_ONE_LINE: '//' ~["\r\n\\]* -> skip;
COMMENT_MULT_LINES: '/*' ~["\r]* '*/' -> skip;