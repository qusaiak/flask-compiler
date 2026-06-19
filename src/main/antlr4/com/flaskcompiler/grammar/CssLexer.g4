lexer grammar CssLexer;

// ============================================================
// Standalone, lightweight CSS lexer (independent of HTML/Jinja).
// ============================================================

LBRACE : '{' ;
RBRACE : '}' ;
COLON  : ':' ;
SEMI   : ';' ;
COMMA  : ',' ;

// .class selector
CLASS : '.' NMSTART NMCHAR* ;

// Hex color must be declared before #id so '#fff' lexes as a COLOR
// while '#header' (longer match, not all-hex) lexes as HASH_ID.
COLOR   : '#' HEX+ ;
HASH_ID : '#' NMSTART NMCHAR* ;

STRING
    : '"' ~["]* '"'
    | '\'' ~[']* '\''
    ;

// Numeric values: percentages, dimensions (with unit) and plain numbers.
PERCENTAGE : NUM '%' ;
DIMENSION  : NUM [a-zA-Z]+ ;
NUMBER     : NUM ;

// element selectors, property names, keyword values (blue, solid, sans-serif...)
IDENT : NMSTART NMCHAR* ;

WS : [ \t\r\n]+ -> skip ;

fragment NUM     : [0-9]+ ('.' [0-9]+)? ;
fragment HEX     : [0-9a-fA-F] ;
fragment NMSTART : [a-zA-Z_] ;
fragment NMCHAR  : [a-zA-Z0-9_\-] ;
