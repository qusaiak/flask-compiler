lexer grammar JinjaLexer;

WS    : [ \t\r\n]+ -> skip ;
TOKEN : ~[ \t\r\n]+ ;

