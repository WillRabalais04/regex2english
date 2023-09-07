grammar regex2english;

// parser
 
start : expr | <EOF> ;
 
expr : '-' expr     # UMINUS
   | expr addop expr # ADDOPGRP
   | expr mulop expr # MULOPGRP
   | '(' expr ')'   # PARENGRP
   | NUMBER    # DOUBLE
   | predefinedCharacterClass # PCC
   | quantifier # Q
   | quantifier expr # Q2
   | expr quantifier expr # Q3
   | expr quantifier # Q1
   ;
   

 
addop : '+' | '-' ;
 
mulop : '*' | '/' | '%' ;

predefinedCharacterClass : '.' | '\\W' ;

quantifier : '*' | '+' | '?';
 
// lexer
 
NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
WS : [ \r\n\t];


// Predefined character classes 



WILDCARD : '.';
NONWORD : '\\W';



LETTERS : [a-z];


