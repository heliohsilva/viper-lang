grammar viper;

initial: '`'; //without this, the grammar isnt accepted
TIPO: 'int' | 'float' | 'char' | 'bool';
FUNC: 'function';
PROC: 'procedure';
ATRTO: '=';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
WR: 'out';
RE: 'in';
WHILE: 'while';
IF: 'while';
CONCAT: '.';
OPARIT: '/' | '%' | '*' | '+' | '-';
OPRELA: '==' | '!=' | '>' | '<' | '>=' | '<=';
fragment LETRA: [a-zA-Z];
fragment NUMERO: [0-9];
ID: LETRA (NUMERO | LETRA)*;
NUM: NUMERO+ ('.' NUMERO+)?;
WS: [ \r\n\t]+ -> skip;
ErrorChar: .;
