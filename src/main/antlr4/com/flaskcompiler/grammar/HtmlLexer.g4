lexer grammar HtmlLexer;

WS    : [ \t\r\n]+ -> skip ;
TOKEN : ~[ \t\r\n]+ ;

