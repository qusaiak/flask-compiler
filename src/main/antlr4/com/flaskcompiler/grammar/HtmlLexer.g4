lexer grammar HtmlLexer;

// ============================================================
// Standalone, lightweight HTML lexer (independent of Jinja).
// DEFAULT mode: plain text content. Switches into TAG mode on '<'.
// ============================================================

TAG_OPEN  : '<' -> pushMode(TAG) ;
HTML_TEXT : ~[<]+ ;

// ============================================================
// TAG mode: inside a tag, until '>' or '/>'
// ============================================================
mode TAG;

TAG_SLASH_CLOSE : '/>' -> popMode ;   // self-closing
TAG_CLOSE       : '>'  -> popMode ;
SLASH           : '/' ;               // for closing tags </...>
EQUALS          : '=' ;

TAG_NAME : [a-zA-Z] [a-zA-Z0-9]* ;

ATTR_VALUE
    : '"' ~["]* '"'
    | '\'' ~[']* '\''
    ;

TAG_WS : [ \t\r\n]+ -> skip ;
