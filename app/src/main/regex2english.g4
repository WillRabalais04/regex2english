grammar regex2english;

start: expr;

expr: escapedToLiteralOutsideCharClass (exprHelper | <EOF>) # LITERAL
| LETTER+ (exprHelper | <EOF>) # LETTER
| characterClass (exprHelper | <EOF>) # CHARACTER_CLASS
| group (exprHelper | <EOF>) #CAPTURE_GROUP
| back_reference (exprHelper | <EOF>) #BACK_REFERENCE
| boundary_matcher expr (exprHelper | <EOF>) #BOUNDARY_MATCHER
;
// add edge cases LBRACKET hyphen RBRACKET, LBRACKET hyphen characterClassContent RBRACKET, LBRACKET characterClassContent hyphen RBRACKET

exprHelper: quantifier (exprHelper | <EOF>)
| expr (exprHelper | <EOF>)
| boundary_matcher (exprHelper | <EOF>)
;

expr2: '\\Q' expr2 '\\E' # QUOTATION
| escapedToLiteralOutsideCharClass # ESCAPE_SEQUENCE
| LETTER+ # LETTER
| characterClass # CHARACTER_CLASS
| LPAREN expr2 RPAREN # GROUP
| back_reference # BACK_REFERENCE
| expr2 quantifier # QUANTIFIER
| expr2 expr2 # CONCATENATION
| boundary_matcher # BOUNDARY_MATCHER
| (expr2 | expr2) # OR
;

boundary_matcher: CARET expr2
| expr2 DOLLAR_SIGN
| '\\b'expr2'\\b' 
| '\\B'expr2'\\B' 
| '\\A'expr2 
| '\\G' expr2
| expr'\\z'
| expr'\\Z' 
;


// E = expr2
// F = boundary matcher

// a = //Q
// b = escapedToLiteralOutsideCharClass
// c = LETTER
// d = characterClass
// e = LPAREN
// f = back_reference
// g = quantifier
// h = CARET
// i = DOLLAR_SIGN
// j = '\\b'
// k = '\\B'
// l = '\\A'
// m = '\\G'
// n = '\\z'
// o = '\\Z'
// p = '\\E'
// q = RPAREN


characterClassContent2 : CARET characterClassContent2
| escapedToLiteralInsideCharClass
| predefinedCharacterClass
| characterClassContent2 DOUBLE_AMPERSAND (characterClass | characterClassContent2)  // add && and concatenation
| posix
| javalangCharacterClass
| unicodeScriptClass
| (LETTER_RANGE | NUMBER_RANGE | ((LETTER | EXTRA_LETTER_ALLOWED_INSIDE) | CARET))+
;

line_anchor : 
;

group: LPAREN characterClass RPAREN ;

characterClass: LBRACKET characterClassContent2 RBRACKET;

characterClassContent: CARET characterClassContent (characterClassHelper | <EOF>)
|  (characterClassHelper | <EOF>)
|  (characterClassHelper | <EOF>)
| (LETTER_RANGE | NUMBER_RANGE | ((LETTER | EXTRA_LETTER_ALLOWED_INSIDE) | CARET))+ (characterClassHelper | <EOF>)
;

characterClassHelper: DOUBLE_AMPERSAND characterClassContent (characterClassHelper | <EOF>)
|characterClassContent (characterClassHelper | <EOF>) 
;

CARET : '^';


LETTER : [a-zA-Z0-9/!,#&];
EXTRA_LETTER_ALLOWED_INSIDE:  [|*\\?.$-];

//following: https://www.abareplace.com/blog/escape-regexp/

escapedToLiteralInsideCharClass: BACKSLASH_ESCAPED
| RBRACKET_ESCAPED
| HYPHEN_ESCAPED
;

escapedToLiteralOutsideCharClass: LBRACKET_ESCAPED
| ASTERISK_ESCAPED
| PLUS_ESCAPED
| QMARK_ESCAPED
| LBRACE_ESCAPED
| DOT_ESCAPED
| LPAREN_ESCAPED
| RPAREN_ESCAPED
| CARET_ESCAPED
| DOLLAR_SIGN_ESCAPED
| PIPE_ESCAPED
| BACKSLASH_ESCAPED
;

LETTER_RANGE : [a-zA-Z]'-'[a-zA-Z];
NUMBER_RANGE : [0-9]'-'[0-9];
DOUBLE_AMPERSAND : '&&' ;

PLUS_ESCAPED : '\\+' ;
LBRACE_ESCAPED : '\\{' ;
PIPE_ESCAPED : '\\|' ;
BACKSLASH_ESCAPED : '\\\\' ;
LPAREN_ESCAPED: '\\(' ;
RPAREN_ESCAPED: '\\)' ;
LBRACKET_ESCAPED: '\\]' ;
RBRACKET_ESCAPED: '\\[' ;
DOT_ESCAPED: '\\.' ;
CARET_ESCAPED: '\\^' ;
QMARK_ESCAPED: '\\?' ;
ASTERISK_ESCAPED : '\\*' ;
DOLLAR_SIGN_ESCAPED : '\\$';
HYPHEN_ESCAPED : '\\-' ;

predefinedCharacterClass : '.' # Wildcard
| '\\d' # digit
| '\\D' # non_digit
| '\\h' # horizontal_whitespace
| '\\H' # non_horizontal_whitespace
| '\\s' # whitespace
| '\\S' # non_whitespace
| '\\v' # vertical_whitespace
| '\\V' # non_vertical_whitespace
| '\\w' # word
| '\\W' # non_word
;

DIGIT: '\\d';

// Quantifiers

N_OCCURRANCES : '{' [0-9] '}';
MAX_QUANTIFIER : '{,' [0-9]? '}';
MIN_QUANTIFIER : '{' [0-9]? ',}';
RANGE_QUANTIFIER : '{' [0-9]? ',' [0-9]? '}' ;


quantifier:   MAX_QUANTIFIER 
|  MIN_QUANTIFIER
| RANGE_QUANTIFIER
|  '+' #PLUS
| '*'#ASTERISK
| '?' #QMARK
;

back_reference: N_TH_CAPTURE_GROUP
| NAMED_CAPTURE_GROUP_MATCH 
;



// LEXER:
// caret should not be esceped

LBRACKET : '[' ; 
RBRACKET : ']' ; 
LPAREN : '(' ;
RPAREN : ')';

// Alternation operator
PIPE : '|' ;

escapedFromLiteral : predefinedCharacterClass
| OCTAL_1 
| OCTAL_2 
| OCTAL_3 
| HEXA_2 
| HEXA_4 
| CODE_POINT
| CARRIAGE_RETURN
| TAB 
| FORM_FEED
| ALERT
| ESC
| CARET
| DOLLAR_SIGN
| WORD_BOUNDARY
| NON_WORD_BOUNDARY
| INPUT_START
| END_OF_MATCH
| INPUT_END
| INPUT_END_INC_NEWLINE
| LINEBREAK_MATCHER
;



// Characters
BACKSLASH : '\\' ;
OCTAL_1 : '\\0'[0-7];
OCTAL_2 : '\\0'[0-7][0-7];
OCTAL_3 : '\\0'[0-3][0-7][0-7];
HEXA_2 : '\\x'[a-fA-F0-9];
HEXA_4 : '\\x'[a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9];
CODE_POINT : 'U\\+'[1]?[a-fA-F0-9]{4,5};
CARRIAGE_RETURN : '\\r' ;
TAB : '\\t' ;
FORM_FEED : '\\f' ;
ALERT : '\\a' ;
ESC : '\\e' ;

// figure out a way to verify the lower bound > upper bound
// make sure cases are matched - don't allow eg. [a-Z]



// Boundary Matchers
DOLLAR_SIGN : '$';
WORD_BOUNDARY : '\\b';
NON_WORD_BOUNDARY : '\\B';
INPUT_START : '\\A';
END_OF_MATCH : '\\G';
INPUT_END : '\\z';
INPUT_END_INC_NEWLINE : '\\Z';

//Linebreak Matcher
LINEBREAK_MATCHER : '\\R' ;


// POSIX character classes (US-ASCII only)
posix :  '\\p{Lower}' //[a-z] 
| '\\p{Upper}' //[A-Z]
| '\\p{ASCII}' //[\x00-\x7F]
| '\\p{Alpha}'
| '\\p{Digit}' // [0-9]
| '\\p{Alnum}' // Any alphanumeric character
| '\\p{Punct}' // [!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~]
| '\\p{Graph}' // 	Any alphanumeric or punctuation character [\p{Alnum}\p{Punct}]
| '\\p{Print}' // any glyph or whitespace
| '\\p{Blank}'  // space or tab: [ \t]
| '\\p{Cntrl}' // control characters [\x00-\x1F\x7F]
| '\\p{XDigit}' // [0-9a-fA-F]
| '\\p{Space}' // whitespace character: [ \t\n\x0B\f\r]
;

// java.lang.Character classes (simple java character type)
javalangCharacterClass : '\\p{javaLowerCase}' // Equivalent to java.lang.Character.isLowerCase()
| '\\p{javaUpperCase}'	// Equivalent to java.lang.Character.isUpperCase()
| '\\p{javaWhitespace}' //Equivalent to java.lang.Character.isWhitespace()
| '\\p{javaMirrored}' //Equivalent to java.lang.Character.isMirrored()
;

//Classes for Unicode scripts, blocks, categories and binary properties
unicodeScriptClass : '\\p{IsLatin}'	//A Latin script character (script)
| '\\p{InGreek}'	//A character in the Greek block (block)
|  '\\p{Lu}' //An uppercase letter (category)
| '\\p{IsAlphabetic}' //An alphabetic character (binary property)
| '\\p{Sc}' //A currency symbol
| '\\P{InGreek}'	//Any character except one in the Greek block (negation)
| '[\\p{L}&&[^\\p{Lu}]]' //Any letter except an uppercase letter (subtraction)
;



/*
//Quotation
SINGLE_BAC\	Nothing, but quotes the following character
\Q	Nothing, but quotes all characters until \E
\E	Nothing, but ends quoting started by \Q
*/


/* 

Special constructs (named-capturing and non-capturing)
(?<name>X)	X, as a named-capturing group
(?:X)	X, as a non-capturing group
(?idmsuxU-idmsuxU) 	Nothing, but turns match flags i d m s u x U on - off
(?idmsux-idmsux:X)  	X, as a non-capturing group with the given flags i d m s u x on - off
(?=X)	X, via zero-width positive lookahead
(?!X)	X, via zero-width negative lookahead
(?<=X)	X, via zero-width positive lookbehind
(?<!X)	X, via zero-width negative lookbehind
(?>X)	X, as an independent, non-capturing group

*/

// Back references

N_TH_CAPTURE_GROUP: '\\[0-9]+' ;	//Whatever the nth capturing group matched
NAMED_CAPTURE_GROUP_MATCH: '\\k<' [a-zA-Z]+ '>'; //	Whatever the named-capturing group "name" matched
// ^ probably name the name part between the chevrons -- this project is so meta

 
 
 
 /* 
 
 capture groups
 quantifier
 escaped characters
 character class
    - escaped characters
       - predefined character class
    - ranges
    - literals
 
 rectangular bracket groups:
 - character class
 
 boundary matchers
 
 literals
 
 
 Predefined character classes

 
 
 
 
 */
 
 
 // add escape sequence for quantifiers;

