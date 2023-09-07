grammar regex2english;

// PARSER:
 
//start : expr | test | <EOF> ;
 
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
   
 
test : GROUP;

start : test | <EOF> ;
   

 
addop : '+' | '-' ;
 
mulop : '*' | '/' | '%' ;

predefinedCharacterClass : '.' ;

quantifier : '*' | '+' | '?';
 

// LEXER:

// Logical Operators
PIPE : '|' ;
GROUP : '.*';

// Quantifiers
ASTERISK : '*' ;
QMARK : '?';


// Characters
CHARACTER_X : 'x' ;
BACKSLASH : '\\' ;


CARRIAGE_RETURN : '\\r' ;
TAB : '\\t' ;
FORM_FEED : '\\f' ;
ALERT : '\\a' ;
ESC : '\\e' ;

 


// Predefined Character Classes 
WILDCARD : '.';
DIGIT : '\\d';
NON_DIGIT : '\\D';
HORIZONTAL_WS : '\\h';
NON_HORIZONTAL_WS : '\\H';
WS : '\\s';
NON_WS : '\\S';
VERTICAL_WS : '\\v';
NON_VERTICAL_WS : '\\V';
WORD : '\\w';
NON_WORD : '\\W';

// Boundary Matchers
CARET : '^';
DOLLAR_SIGN : '$';
WORD_BOUNDARY : '\\b';
INPUT_START : '\\A';
END_OF_MATCH : '\\G';








NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
LETTERS : [a-z];


// not figured out yet corner
// POSIX character classes
//java.lang.Character classes
// NON_WORD_BOUNDARY : '\\B' ; =


