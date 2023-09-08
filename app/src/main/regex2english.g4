grammar regex2english;

// PARSER:
 
//start : expr | test | <EOF> ;
 
expr : '-' expr     # UMINUS
   | expr addop expr # ADDOPGRP
   | expr mulop expr # MULOPGRP
   | '(' expr ')'   # PARENGRP
   | NUMBER    # DOUBLE
   | predefinedCharacterClass # PCC
   ;
   
 
test : HEXA_FOUR;

start : test | <EOF> ;
   

 
addop : '+' | '-' ;
 
mulop : '*' | '/' | '%' ;

predefinedCharacterClass : '.' ;

// LEXER:

// Logical Operators
PIPE : '|' ;
CAPTURE_GROUP : '('~[)]* ')';

// Quantifiers
ASTERISK : '*' ;
QMARK : '?';
PLUS : '+';

MIN_QUANTIFIER : '{'[0-9]?'}' ;

//make sure it has option for no upperbound
RANGE_QUANTIFIER :'{'[0-9]? ','[0-9]?'}' ;


// Characters
BACKSLASH : '\\' ;
OCTAL_ONE : '\\0'[0-7];
OCTAL_TWO : '\\0'[0-7][0-7];
OCTAL_THREE : '\\0'[0-3][0-7][0-7];
HEXA_TWO : '\\x'[a-fA-F0-9];
HEXA_FOUR : '\\x'[a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9];
//ADD: \x{h...h}	The character with hexadecimal value 0xh...h (Character.MIN_CODE_POINT  <= 0xh...h <=  Character.MAX_CODE_POINT)
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
INPUT_END : '\\z';
INPUT_END_INC_NEWLINE : '\\Z';

//Linebreak Matcher
LINEBREAK_MATCHER : '\\R' ;

NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
LETTERS : [a-z];


// not figured out yet corner
// POSIX character classes
//java.lang.Character classes
// NON_WORD_BOUNDARY : '\\B' ; =