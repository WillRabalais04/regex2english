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
CODE_POINT : 'U\\+'[1]?[a-fA-F0-9]{4,5};
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

// POSIX character classes (US-ASCII only)
LOWERCASE_PO6 : '\\p{Lower}'; //[a-z]
UPPERCASE_PO6 : '\\p{Upper}'; //[A-Z]
ASCII_PO6 : '\\p{ASCII}'; //[\x00-\x7F]
ALPHA_PO6 : '\\p{Alpha}';
NUM_PO6 : '\\p{Digit}'; // [0-9]
ALNUM_PO6 : '\\p{Alnum}'; // Any alphanumeric character
PUNCT_PO6 : '\\p{Punct}'; // [!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~]
GLYPH_PO6 : '\\p{Graph}'; // 	Any alphanumeric or punctuation character [\p{Alnum}\p{Punct}]
PRINTABLE_PO6 : '\\p{Print}'; // any glyph or whitespace
BLANK_PO6 : '\\p{Blank}' ; // space or tab: [ \t]
CTRL_PO6 : '\\p{Cntrl}'; // control characters [\x00-\x1F\x7F]
HEXADECIMAL_PO6 : '\\p{XDigit}'; // [0-9a-fA-F]
WS_PO6 : '\\p{Space}'; // whitespace character: [ \t\n\x0B\f\r]

// java.lang.Character classes (simple java character type)
CHAR_CLASS_LC : '\\p{javaLowerCase}';	//Equivalent to java.lang.Character.isLowerCase()
CHAR_CLASS_UC :'\\p{javaUpperCase}';	//Equivalent to java.lang.Character.isUpperCase()
CHAR_CLASS_WS : '\\p{javaWhitespace}'; //Equivalent to java.lang.Character.isWhitespace()
CHAR_CLASS_MIRRORED : '\\p{javaMirrored}'; //Equivalent to java.lang.Character.isMirrored()

//Classes for Unicode scripts, blocks, categories and binary properties
UNICODE_CLASS_LATIN : '\\p{IsLatin}';	//A Latin script character (script)
UNICODE_CLASS_GREEK : '\\p{InGreek}';	//A character in the Greek block (block)
UNICODE_CLASS_UC : '\\p{Lu}'; //An uppercase letter (category)
UNICODE_CLASS_ALPHA : '\\p{IsAlphabetic}'; //An alphabetic character (binary property)
UNICODE_CLASS_CURR : '\\p{Sc}'; //A currency symbol
UNICODE_CLASS_NOT_GREEK :'\\P{InGreek}';	//Any character except one in the Greek block (negation)
UNICODE_CLASS_NOT_UC : '[\\p{L}&&[^\\p{Lu}]]'; //Any letter except an uppercase letter (subtraction)

// NON_WORD_BOUNDARY : '\\B' ; 