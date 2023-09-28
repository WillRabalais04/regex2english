grammar regex2english;

// PARSER:

//start : expr | test | <EOF> ;
 
expr : stringOfCharacters;
 
test : range;

start : test | <EOF> ;


quantifier : PIPE
| CAPTURE_GROUP 
| ASTERISK 
| QMARK
| PLUS
| MIN_QUANTIFIER
| RANGE_QUANTIFIER 
;

/* expressions:
characters
quantifiers
*/


characterSequence: character 
| predefinedCharacterClass ;

range : LETTER_RANGE? LETTER_RANGE | NUMBER_RANGE;

character: NUMBER
| LETTER
| BACKSLASH
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
;

characterClass: LBRACKET expr RBRACKET 
| LBRACKET CARET expr RBRACKET
| LBRACKET range
;

stringOfCharacters : character | character character;

predefinedCharacterClass : WILDCARD
| DIGIT
| NON_DIGIT
| HORIZONTAL_WS
| NON_HORIZONTAL_WS
| WS
| NON_WS
| VERTICAL_WS
| WORD
| NON_WORD
;

// LEXER:
LBRACKET : '[';
RBRACKET : ']';

// Logical Operators
PIPE : '|' ;
CAPTURE_GROUP : '('~[)]*')';

// Quantifiers
ASTERISK : '*' ;
QMARK : '?';
PLUS : '+';
MIN_QUANTIFIER : '{'[0-9]?'}' ;
RANGE_QUANTIFIER :'{'[0-9]? ','[0-9]?'}' ;

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

//ranges:
LETTER_RANGE : [a-zA-Z]'-'[a-zA-Z];
NUMBER_RANGE : [0-9]'-'[0-9];

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
NON_WORD_BOUNDARY : '\\B';
INPUT_START : '\\A';
END_OF_MATCH : '\\G';
INPUT_END : '\\z';
INPUT_END_INC_NEWLINE : '\\Z';

//Linebreak Matcher
LINEBREAK_MATCHER : '\\R' ;

NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
LETTER : [a-z];

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
CHAR_CLASS_LC : '\\p{javaLowerCase}'; // Equivalent to java.lang.Character.isLowerCase()
CHAR_CLASS_UC :'\\p{javaUpperCase}';	// Equivalent to java.lang.Character.isUpperCase()
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



Back references
\n	Whatever the nth capturing group matched
\k<name>	Whatever the named-capturing group "name" matched


 */