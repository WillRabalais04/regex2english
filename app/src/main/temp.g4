grammar temp;

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




expr : '\\Q' expr '\\E' (exprHelper | <EOF>)
| escapedToLiteralOutsideCharClass (exprHelper | <EOF>)
| characterClass (exprHelper | <EOF>)
| LPAREN expr RPAREN (exprHelper | <EOF>)
| back_reference (exprHelper | <EOF>)
| CARET expr (exprHelper | <EOF>) 
| '\\b'expr'\\b' (exprHelper | <EOF>)
| '\\B'expr'\\B' (exprHelper | <EOF>)
| '\\A'expr (exprHelper | <EOF>)
| '\\G' expr (exprHelper | <EOF>)
| LETTER+ exprHelper
;

exprHelper : quantifier (exprHelper | <EOF>)
| expr (exprHelper | <EOF>)
| '\|' expr (exprHelper | <EOF>)
| DOLLAR_SIGN (exprHelper | <EOF>)
| '\\z' (exprHelper | <EOF>)
| '\\Z' (exprHelper | <EOF>)
| '\|' expr (exprHelper | <EOF>)
;
