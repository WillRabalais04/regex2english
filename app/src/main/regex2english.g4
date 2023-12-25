grammar regex2english;

// Parser:
start: expr;

expr : escapedToLiteralOutsideCharClass (exprHelper | <EOF>) # ESCAPE_SEQUENCE
| quote (exprHelper | <EOF>) # QUOTE
| predefinedCharacterClass (exprHelper | <EOF>) # PREDEFINED_CHARACTERCLASS
| characterClass (exprHelper | <EOF>) # CHARACTERCLASS
| group (exprHelper | <EOF>) # GROUP
| backReference (exprHelper | <EOF>) # BACKREFERENCE
| CARET expr (exprHelper | <EOF>) # BOUNDARY_MATCHER_START
| '\\b'expr'\\b' (exprHelper | <EOF>) # WORD_BOUNDARY
| '\\B'expr'\\B' (exprHelper | <EOF>) # NON_WORD_BOUNDARY
| '\\A'expr (exprHelper | <EOF>) # INPUT_START
| '\\G' expr (exprHelper | <EOF>) #END_OF_MATCH
| LETTER+ (exprHelper | <EOF>) # LETTER
;

exprHelper :  PIPE expr (exprHelper | <EOF>) #OR
|quantifier (exprHelper | <EOF>) # QUANTIFIER
| expr (exprHelper | <EOF>) # CONCATENATION
| DOLLAR_SIGN (exprHelper | <EOF>) # BOUNDARY_MATCHER_END
| '\\Z' (exprHelper | <EOF>) # END_OF_INPUT_EXCEPT_FINAL_TERMINATOR
| '\\z' (exprHelper | <EOF>) # END_OF_INPUT
;

characterClass: LBRACKET characterClassContent RBRACKET;

characterClassContent: CARET characterClassContent (characterClassContentHelper | <EOF>)
| escapedToLiteralInsideCharClass (characterClassContentHelper | <EOF>)
| predefinedCharacterClass (characterClassContentHelper | <EOF>)
| posix (characterClassContentHelper | <EOF>)
| javalangCharacterClass (characterClassContentHelper | <EOF>)
| unicodeScriptClass (characterClassContentHelper | <EOF>)
| (LETTER_RANGE | NUMBER_RANGE | ((LETTER | EXTRA_LETTER_ALLOWED_INSIDE) | CARET))+ (characterClassContentHelper | <EOF>)
;

characterClassContentHelper: DOUBLE_AMPERSAND  (characterClass | characterClassContent) (characterClassContentHelper | <EOF>) 
| characterClass (characterClassContentHelper | <EOF>)
;

group: LPAREN expr RPAREN ;

escapedToLiteralInsideCharClass: BACKSLASH_ESCAPED
| RBRACKET_ESCAPED
| HYPHEN_ESCAPED
| LBRACKET_ESCAPED
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

predefinedCharacterClass : '.' # WILDCARD
| '\\d' # DIGIT
| '\\D' # NON_DIGIT
| '\\h' # HORIZONTAL_WHITESPACE
| '\\H' # NON_HORIZONTAL_WHITESPACE
| '\\s' # WHITESPACE
| '\\S' # NON_WHITESPACE
| '\\v' # VERTICAL_WHITESPACE
| '\\V' # NON_VERTICAL_WHITESPACE
| '\\w' # WORD
| '\\W' # NON_WORD
;

quantifier:  N_OCCURRANCES
| MAX_QUANTIFIER 
|  MIN_QUANTIFIER
| RANGE_QUANTIFIER
| '+' #PLUS
| '*' # ASTERISK
| '?' # QMARK
;

backReference: N_TH_CAPTURE_GROUP
| NAMED_CAPTURE_GROUP_MATCH 
;

quote: LEFT_QUOTE expr RIGHT_QUOTE;

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

// move named_capture_group above other lexer tokesns
// Capture Groups
namedCaptureGroup : LPAREN '<?'NAMED_CAPTURE_GROUP_NAME'>' expr RPAREN;
nonCaptureGroup: LPAREN '?:' expr RPAREN;
independentNonCapturingGroup: LPAREN '?>' expr RPAREN;

// Look Aheads
zeroWidthPositiveLookAhead: LPAREN '?=' expr RPAREN;
zeroWidthNegativeLookAhead: LPAREN '?!' expr RPAREN;
zeroWidthPositiveLookBehind: LPAREN '?<=' expr RPAREN;
zeroWidthNegativeLookBehind: LPAREN '?<!' expr RPAREN;

// add:
// - (?idmsuxU-idmsuxU) 	Nothing, but turns match flags i d m s u x U on - off
// - (?idmsux-idmsux:X)  	X, as a non-capturing group with the given flags i d m s u x on - off

// POSIX Character Classes (US-ASCII only)
posix :  '\\p{Lower}' # POSIX_LOWERCASE //[a-z] 
| '\\p{Upper}' # POSIX_UPPERCASE //[A-Z]
| '\\p{ASCII}' # POSIX_ASCII //[\x00-\x7F]
| '\\p{Alpha}' # POSIX_LETTERS // [a-zA-Z]
| '\\p{Digit}' # POSIX_DIGITS // [0-9]
| '\\p{Alnum}' # POSIX_ALPHANUMERIC // [a-zA-Z0-9]
| '\\p{Punct}' # POSIX_PUNCTUATION // [!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~]
| '\\p{Graph}' # POSIX_ALPHANUM_PUNCTUATION // Any alphanumeric or punctuation character [\p{Alnum}\p{Punct}]
| '\\p{Print}' # POSIX_WHITESPACE_OR_GLYPH // any glyph or whitespace
| '\\p{Blank}' # POSIX_SPACE_OR_TAB // space or tab: [ \t]
| '\\p{Cntrl}' # POSIX_CONTROL_CHARACTERS // control characters [\x00-\x1F\x7F]
| '\\p{XDigit}'# POSIX_X_DIGIT // [0-9a-fA-F]
| '\\p{Space}' # POSIX_WHITESPACE // whitespace character: [ \t\n\x0B\f\r]
;

// java.lang.Character Classes 
javalangCharacterClass : '\\p{javaLowerCase}' # JAVALANG_CC_LOWERCASE // Equivalent to java.lang.Character.isLowerCase()
| '\\p{javaUpperCase}' # JAVALANG_CC_UPPERCASE	// Equivalent to java.lang.Character.isUpperCase()
| '\\p{javaWhitespace}' # JAVALANG_CC_WHITESPACE //Equivalent to java.lang.Character.isWhitespace()
| '\\p{javaMirrored}' # JAVALANG_CC_MIRRORED //Equivalent to java.lang.Character.isMirrored()
;

//Classes for Unicode Scripts
unicodeScriptClass : '\\p{IsLatin}' # LATIN //A Latin script character (script)
| '\\p{InGreek}'# GREEK //A character in the Greek block (block)
|  '\\p{Lu}' # UPPERCASE //An uppercase letter (category)
| '\\p{IsAlphabetic}' # IS_ALPHABETIC  //An alphabetic character (binary property)
| '\\p{Sc}' # CURRENCY_SYMBOL //A currency symbol
| '\\P{InGreek}' # NOT_GREEK//Any character except one in the Greek block (negation)
| '[\\p{L}&&[^\\p{Lu}]]' # NOT_UPPERCASE//Any letter except an uppercase letter (subtraction)
;

// Lexer:
CARET : '^';
DIGIT: '\\d';

LETTER : [a-zA-Z0-9/!,#&];
EXTRA_LETTER_ALLOWED_INSIDE:  [|*\\?.$-]; //following: https://www.abareplace.com/blog/escape-regexp/

// Quotes
LEFT_QUOTE: '\\Q';
RIGHT_QUOTE: '\\E';

// Ranges
LETTER_RANGE : [a-zA-Z]'-'[a-zA-Z];
NUMBER_RANGE : [0-9]'-'[0-9];

// Operators
DOUBLE_AMPERSAND : '&&' ;
PIPE : '|' ;

// Special Escaped Characters
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

// Quantifiers
N_OCCURRANCES : '{' [0-9] '}';
MAX_QUANTIFIER : '{,' [0-9]? '}';
MIN_QUANTIFIER : '{' [0-9]? ',}';
RANGE_QUANTIFIER : '{' [0-9]? ',' [0-9]? '}' ;

// Brackets
LBRACKET : '[' ; 
RBRACKET : ']' ; 
LPAREN : '(' ;
RPAREN : ')';

// Characters
BACKSLASH : '\\';
OCTAL_1 : '\\0'[0-7];
OCTAL_2 : '\\0'[0-7][0-7];
OCTAL_3 : '\\0'[0-3][0-7][0-7];
HEXA_2 : '\\x'[a-fA-F0-9];
HEXA_4 : '\\x'[a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9];
CODE_POINT : 'U\\+'[1]?[a-fA-F0-9]{4,5};
CARRIAGE_RETURN : '\\r';
TAB : '\\t' ;
FORM_FEED : '\\f' ;
ALERT : '\\a' ;
ESC : '\\e' ;

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

// Back references
N_TH_CAPTURE_GROUP: '\\[0-9]+' ;	// Whatever the nth capturing group matched
NAMED_CAPTURE_GROUP_MATCH: '\\k<'[a-zA-Z]+'>'; //	Whatever the named-capturing group "name" matched
NAMED_CAPTURE_GROUP_NAME : [a-zA-Z_];