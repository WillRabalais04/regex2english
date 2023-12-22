grammar regex2english;

start: quantifier;

expr: escapedToLiteralOutsideCharClass (exprHelper | <EOF>) 
| LETTER+ (exprHelper | <EOF>)
| LBRACKET characterClass RBRACKET (exprHelper | <EOF>)
| group (exprHelper | <EOF>)
| back_reference (exprHelper | <EOF>)
| boundary_matcher expr (exprHelper | <EOF>)
;

exprHelper: quantifier (exprHelper | <EOF>)
| expr (exprHelper | <EOF>)
| boundary_matcher (exprHelper | <EOF>)
;

group: DOLLAR_SIGN;

characterClass: CARET characterClass (characterClassHelper | <EOF>)
| LBRACKET characterClass RBRACKET (characterClassHelper | <EOF>)
| escapedToLiteralInsideCharClass (characterClassHelper | <EOF>)
| predefinedCharacterClass (characterClassHelper | <EOF>)
| (LETTER_RANGE | NUMBER_RANGE | ((LETTER | EXTRA_LETTER_ALLOWED_INSIDE) | CARET))+ (characterClassHelper | <EOF>)
;

characterClassHelper: characterClass (characterClassHelper | <EOF>) 
| DOUBLE_AMPERSAND characterClass (characterClassHelper | <EOF>)
;

CARET : '^';


LETTER : [a-zA-Z0-9/!,#&];
EXTRA_LETTER_ALLOWED_INSIDE:  [|*\\?.$-];

escapedToLiteralInsideCharClass: BACKSLASH_ESCAPED
| LPAREN_ESCAPED
| RBRACKET_ESCAPED
| LBRACKET_ESCAPED
| DOLLAR_SIGN_ESCAPED
| HYPHEN_ESCAPED
;

// PIPE_ESCAPED
// RPAREN_ESCAPED
// DOT_ESCAPED
// CARET_ESCAPED
// QMARK_ESCAPED
// ASTERISK_ESCAPED

escapedToLiteralOutsideCharClass: PIPE_ESCAPED
| BACKSLASH_ESCAPED
| LPAREN_ESCAPED
| RPAREN_ESCAPED
| LBRACKET_ESCAPED
| RBRACKET_ESCAPED
| DOT_ESCAPED
| CARET_ESCAPED
| QMARK_ESCAPED
| ASTERISK_ESCAPED
| DOLLAR_SIGN_ESCAPED
;

LETTER_RANGE : [a-zA-Z]'-'[a-zA-Z];
NUMBER_RANGE : [0-9]'-'[0-9];
DOUBLE_AMPERSAND : '&&' ;

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

quantifier: '\\{'[0-9]?','[0-9]?'\\}' #RANGE_QUANTIFIER
| '\\{'[0-9]?'\\}' #MIN_QUANTIFIER
|  '+' #PLUS
| '*'#ASTERISK
| '?' #QMARK
;



back_reference: NEWLINE_REF
| NAMED_CAPTURE_GROUP_MATCH 
;

boundary_matcher: CARET
| DOLLAR_SIGN
| WORD_BOUNDARY 
| NON_WORD_BOUNDARY
| INPUT_START 
| END_OF_MATCH
| INPUT_END
| INPUT_END_INC_NEWLINE 
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
POSIX :  '\\p{Lower}' //[a-z] 
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

NEWLINE_REF: '\\n';	//Whatever the nth capturing group matched
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
 
 
 // add escape sequence for quantifiers


//  characterClass: escapedToLiteralInsideCharClass 
// | LBRACKET characterClass RBRACKET
// | (LETTER_RANGE | NUMBER_RANGE | (escapedToLiteralInsideCharClass | LETTERS_INSIDE_CHAR_CLASS)+)
// | CARET characterClass
// | characterClass characterClass
// | characterClass DOUBLE_AMPERSAND characterClass
// ;

