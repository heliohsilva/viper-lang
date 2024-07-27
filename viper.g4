grammar viper;

// Regras para análise sintática
program: statement+ ;

statement
    : atribuicao
    | declaracao
    | declaracaoFuncao
    | declaracaoProcedimento
    | whileLoop
    | ifStatement
    | expressao
    ;

//Atribuição e declaração
atribuicao: ID ATRTO expressao ;
declaracao: TIPO ID (ATRTO expressao)? ;

//Declarações de função e procedimento
declaracaoFuncao: TIPO FUNC ID AP parameters? FP block ;
declaracaoProcedimento: TIPO PROC ID AP parameters? FP block ;

//Loops e condicionais
whileLoop: WHILE AP condition FP block ;
ifStatement: IF AP condition FP block (ELSE block)? ;

//Parâmetros e blocos
parameters: parameter (',' parameter)* ;
parameter: TIPO ID ;

block: AC statement* FC ;

//Expressão e condição
condition: expressao OPRELA expressao ;
expressao
    : ID
    | NUM
    | '(' expressao ')'
    | expressao OPARIT expressao
    | functionCall
    ;

//Chamada de função
functionCall: ID AP (expressao (',' expressao)*)? FP ;

// Definição léxica
TIPO: 'int' | 'float' | 'char' | 'bool';
FUNC: 'function';
PROC: 'procedure';
ATRTO: '=';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
WR: 'out';
CONCAT: '.';
OPARIT: '/' | '%' | '*' | '+' | '-';
OPRELA: '==' | '!=' | '>' | '<' | '>=' | '<=';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
fragment LETRA: [a-zA-Z];
fragment NUMERO: [0-9];
ID: LETRA (LETRA | NUMERO)*;
NUM: NUMERO+ (',' NUMERO+)?;
WS: [ \r\n\t]+ -> skip;
ErrorChar: .;
