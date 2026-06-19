lexer grammar CssLexer;

WS    : [ \t\r\n]+ -> skip ;
TOKEN : ~[ \t\r\n]+ ;

