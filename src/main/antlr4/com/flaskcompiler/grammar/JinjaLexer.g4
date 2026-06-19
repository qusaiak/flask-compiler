lexer grammar JinjaLexer;

// ============================================================
// DEFAULT mode: plain HTML / text. Switches into TAG mode when
// a Jinja expression ({{) or statement ({%) opens. HTML is kept
// as raw embedded TEXT (no HTML grammar in M2).
// ============================================================

EXPR_OPEN : '{{' -> pushMode(TAG) ;
STMT_OPEN : '{%' -> pushMode(TAG) ;

// Any run of characters that is not the start of a Jinja tag.
// A lone '{' is allowed as long as it is not followed by '{' or '%'.
TEXT : ( '{' ~[{%] | ~[{] )+ ;

// ============================================================
// TAG mode: inside {{ ... }} or {% ... %}
// ============================================================
mode TAG;

EXPR_CLOSE : '}}' -> popMode ;
STMT_CLOSE : '%}' -> popMode ;

// Statement keywords (must precede NAME)
FOR      : 'for' ;
ENDFOR   : 'endfor' ;
IF       : 'if' ;
ENDIF    : 'endif' ;
IN       : 'in' ;
EXTENDS  : 'extends' ;
BLOCK    : 'block' ;
ENDBLOCK : 'endblock' ;

STRING : '"' ~["]* '"' | '\'' ~[']* '\'' ;

DOT  : '.' ;
NAME : [a-zA-Z_] [a-zA-Z_0-9]* ;

TAG_WS : [ \t\r\n]+ -> skip ;
