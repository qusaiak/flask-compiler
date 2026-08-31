lexer grammar FlaskLexer;

@lexer::header {
    package org.example.gen;
}

WS : [ \t\r\n\u000C]+ -> skip ;
PERCENT: '%';

// ════════════════════════════════════════════════════════════════════
// CSS TOKENS — في DEFAULT MODE (للـ CSS files المباشرة)
// ════════════════════════════════════════════════════════════════════
CSS_COMMENT         : '/*' .*? '*/' -> skip ;
CSS_AT_MEDIA        : '@media'      ;
CSS_AT_KEYFRAMES    : '@keyframes'  ;
CSS_AT_IMPORT       : '@import'     ;
CSS_AT_CHARSET      : '@charset'    ;
CSS_AT_SUPPORTS     : '@supports'   ;
CSS_AT_FONT_FACE    : '@font-face'  ;
CSS_LBRACE          : '{' ;
CSS_RBRACE          : '}' ;
CSS_SEMICOLON       : ';' ;
CSS_DCOLON          : '::';
CSS_COLON           : ':' ;
CSS_COMMA           : ',' ;
CSS_STAR            : '*' ;
CSS_GT              : '>' ;
CSS_PLUS            : '+' ;
CSS_TILDE_SEL       : '~' ;
CSS_SLASH           : '/' ;
CSS_LPAREN          : '(' ;
CSS_RPAREN          : ')' ;
CSS_LBRACKET        : '[' ;
CSS_RBRACKET        : ']' ;
CSS_ASSIGN          : '=' ;
CSS_PIPE            : '|' ;
CSS_CARET           : '^' ;
CSS_IMPORTANT       : '!important' ;
CSS_HEX_COLOR       : '#' [0-9a-fA-F]+ ;
CSS_HASH            : '#' ;
CSS_DOT             : '.' ;
CSS_DIMENSION       : '-'? [0-9]+ ('.' [0-9]+)? ( 'px'|'em'|'rem'|'vh'|'vw'|'%' ) ;
CSS_NUMBER          : '-'? [0-9]+ ('.' [0-9]+)? ;
CSS_URL             : 'url(' ( ~[)] )* ')' ;
CSS_VAR             : 'var(' ( ~[)] )* ')' ;
CSS_STRING_DQ       : '"' ( ~["\\\r\n] | '\\' . )* '"' ;
CSS_STRING_SQ       : '\'' ( ~['\\\r\n] | '\\' . )* '\'' ;
CSS_IDENT           : '-'? [a-zA-Z_][a-zA-Z0-9_\-]* ;

// ════════════════════════════════════════════════════════════════════
// JINJA & HTML TOKENS
// ════════════════════════════════════════════════════════════════════
JINJA_STMT_OPEN : '{%' '-'? [ \t\r\n]* -> pushMode(JINJA2_STMT_MODE) ;
JINJA_VAR_OPEN  : '{{' '-'? [ \t\r\n]* -> pushMode(JINJA2_VAR_MODE)  ;
JINJA_COMMENT   : '{#' .*? '#}'     -> skip                        ;

HTML_DOCTYPE    : '<!DOCTYPE' [ \t\r\n]+ [Hh][Tt][Mm][Ll] [ \t\r\n]* '>' ;
HTML_COMMENT    : '<!--' .*? '-->' -> skip ;

STYLE_OPEN      : '<style'  (~[>])* '>' -> pushMode(CSS_MODE) ;
SCRIPT_OPEN     : '<script' (~[>])* '>' -> pushMode(SCRIPT_MODE) ;

HTML_OPEN_TAG   : '<' [a-zA-Z][a-zA-Z0-9\-]* -> pushMode(TAG_MODE) ;
HTML_CLOSE_TAG  : '</' [a-zA-Z][a-zA-Z0-9\-]* -> pushMode(TAG_MODE) ;

HTML_TEXT       : ~[<{%]+ ;

// ════════════════════════════════════════════════════════════════════
// TAG_MODE
// ════════════════════════════════════════════════════════════════════
mode TAG_MODE;

TAG_WS               : [ \t\r\n\u000C]+ -> channel(HIDDEN);

ATTR_NAME           : [a-zA-Z_:][a-zA-Z0-9_:\-.@]* ;
ATTR_EQ             : '=' ;
ATTR_VAL_DQ         : '"' ( '\\' . | ~["\\\r\n] )* '"' ;
ATTR_VAL_SQ         : '\'' ( '\\' . | ~['\\\r\n] )* '\'' ;

TAG_JINJA_VAR_OPEN  : '{{' '-'? [ \t]* -> pushMode(JINJA2_VAR_MODE) ;
TAG_JINJA_STMT_OPEN : '{%' '-'? [ \t]* -> pushMode(JINJA2_STMT_MODE) ;

TAG_SELF_CLOSE      : '/>' -> popMode ;
TAG_CLOSE           : '>' -> popMode ;

// ════════════════════════════════════════════════════════════════════
// CSS_MODE
// ════════════════════════════════════════════════════════════════════
mode CSS_MODE;
CSS_MODE_WS         : [ \t\r\n\u000C]+ -> channel(HIDDEN) ;
STYLE_CLOSE         : '</style>'    -> popMode  ;
CSS_MODE_COMMENT    : '/*' .*? '*/' -> skip     ;
CSS_MODE_AT_MEDIA   : '@media'      ;
CSS_MODE_AT_KEYFRAMES: '@keyframes' ;
CSS_MODE_AT_IMPORT  : '@import'     ;
CSS_MODE_AT_CHARSET : '@charset'    ;
CSS_MODE_AT_SUPPORTS: '@supports'   ;
CSS_MODE_AT_FONT_FACE: '@font-face' ;
CSS_MODE_LBRACE     : '{' ;
CSS_MODE_RBRACE     : '}' ;
CSS_MODE_SEMICOLON  : ';' ;
CSS_MODE_DCOLON     : '::' ;
CSS_MODE_COLON      : ':' ;
CSS_MODE_COMMA      : ',' ;
CSS_MODE_STAR       : '*' ;
CSS_MODE_GT         : '>' ;
CSS_MODE_PLUS       : '+' ;
CSS_MODE_TILDE_SEL  : '~' ;
CSS_MODE_SLASH      : '/' ;
CSS_MODE_LPAREN     : '(' ;
CSS_MODE_RPAREN     : ')' ;
CSS_MODE_LBRACKET   : '[' ;
CSS_MODE_RBRACKET   : ']' ;
CSS_MODE_ASSIGN     : '=' ;
CSS_MODE_PIPE       : '|' ;
CSS_MODE_CARET      : '^' ;
CSS_MODE_IMPORTANT  : '!important' ;
CSS_MODE_HEX_COLOR  : '#' [0-9a-fA-F]+ ;
CSS_MODE_HASH       : '#' ;
CSS_MODE_DOT        : '.' ;
CSS_MODE_DIMENSION  : '-'? [0-9]+ ('.' [0-9]+)? ( 'px'|'em'|'rem'|'vh'|'vw'|'%' ) ;
CSS_MODE_NUMBER     : '-'? [0-9]+ ('.' [0-9]+)? ;
CSS_MODE_URL        : 'url(' ( ~[)] )* ')' ;
CSS_MODE_VAR        : 'var(' ( ~[)] )* ')' ;
CSS_MODE_STRING_DQ  : '"' ( ~["\\\r\n] | '\\' . )* '"' ;
CSS_MODE_STRING_SQ  : '\'' ( ~['\\\r\n] | '\\' . )* '\'' ;
CSS_MODE_IDENT      : '-'? [a-zA-Z_][a-zA-Z0-9_\-]* ;

// ════════════════════════════════════════════════════════════════════
// SCRIPT_MODE
// ════════════════════════════════════════════════════════════════════
mode SCRIPT_MODE;
SCRIPT_WS           : [ \t\r\n\u000C]+ -> skip;
SCRIPT_CLOSE        : '</script>' -> popMode ;
SCRIPT_TEXT         : ~[<]+       ;
SCRIPT_LT           : '<'         ;

// ════════════════════════════════════════════════════════════════════
// JINJA2_STMT_MODE
// ════════════════════════════════════════════════════════════════════
mode JINJA2_STMT_MODE;
J2S_WS              : [ \t\r\n]+ -> channel(HIDDEN) ;
JINJA_STMT_CLOSE    : [ \t\r]* '-'? '%}' -> popMode ;

// --- الكلمات المفتاحية أولاً حصراً وقبل أي ID ---
J2S_FOR             : 'for'            ;
J2S_ENDFOR          : 'endfor'         ;
J2S_IF              : 'if'             ;
J2S_ELIF            : 'elif'           ;
J2S_ELSE            : 'else'           ;
J2S_ENDIF           : 'endif'          ;
J2S_EXTENDS         : 'extends'        ;
J2S_BLOCK           : 'block'          ;
J2S_ENDBLOCK        : 'endblock'       ;
J2S_INCLUDE         : 'include'        ;
J2S_IMPORT          : 'import'         ;
J2S_FROM            : 'from'           ;
J2S_AS              : 'as'             ;
J2S_IN              : 'in'             ;
J2S_SET             : 'set'            ;
J2S_ENDSET          : 'endset'         ;
J2S_WITH            : 'with'           ;
J2S_ENDWITH         : 'endwith'        ;
J2S_MACRO           : 'macro'          ;
J2S_ENDMACRO        : 'endmacro'       ;
J2S_CALL            : 'call'           ;
J2S_ENDCALL         : 'endcall'        ;
J2S_NOT             : 'not'            ;
J2S_AND             : 'and'            ;
J2S_OR              : 'or'             ;
J2S_IS              : 'is'             ;
J2S_RECURSIVE       : 'recursive'      ;
J2S_IGNORE_MISSING  : 'ignore missing' ;
J2S_TRUE            : 'true'  | 'True' ;
J2S_FALSE           : 'false' | 'False';
J2S_NONE            : 'none'  | 'None' ;

// --- الرموز والأرقام والمعرفات ---
J2S_EQ              : '==' ;
J2S_NEQ             : '!=' ;
J2S_LTE             : '<=' ;
J2S_GTE             : '>=' ;
J2S_DSTAR           : '**' ;
J2S_LT              : '<'  ;
J2S_GT              : '>'  ;
J2S_PLUS            : '+'  ;
J2S_MINUS           : '-'  ;
J2S_STAR            : '*'  ;
J2S_SLASH           : '/'  ;
J2S_PERCENT         : '%'  ;
J2S_TILDE           : '~'  ;
J2S_PIPE            : '|'  ;
J2S_ASSIGN          : '='  ;
J2S_DOT             : '.'  ;
J2S_COMMA           : ','  ;
J2S_COLON           : ':'  ;
J2S_LPAREN          : '('  ;
J2S_RPAREN          : ')'  ;
J2S_LBRACKET        : '['  ;
J2S_RBRACKET        : ']'  ;
J2S_LBRACE          : '{'  ;
J2S_RBRACE          : '}'  ;
J2S_STRING          : '"' ( '\\' . | ~["\\\r\n] )* '"' | '\'' ( '\\' . | ~['\\\r\n] )* '\'' ;
J2S_FLOAT           : [0-9]+ '.' [0-9]+ ;
J2S_INT             : [0-9]+              ;
J2S_ID              : [a-zA-Z_][a-zA-Z0-9_]* ;

// ════════════════════════════════════════════════════════════════════
// JINJA2_VAR_MODE
// ════════════════════════════════════════════════════════════════════
mode JINJA2_VAR_MODE;
J2V_WS              : [ \t\r\n]+ -> channel(HIDDEN) ;
JINJA_VAR_CLOSE     : [ \t\r]* '-'? '}}' -> popMode ;

// --- الكلمات المفتاحية أولاً حصراً وقبل أي ID ---
J2V_NOT             : 'not'   ;
J2V_AND             : 'and'   ;
J2V_OR              : 'or'    ;
J2V_IN              : 'in'    ;
J2V_IS              : 'is'    ;
J2V_TRUE            : 'true'  | 'True'  ;
J2V_FALSE           : 'false' | 'False' ;
J2V_NONE            : 'none'  | 'None'  ;

// --- الرموز والأرقام والمعرفات ---
J2V_EQ              : '==' ;
J2V_NEQ             : '!=' ;
J2V_LTE             : '<=' ;
J2V_GTE             : '>=' ;
J2V_DSTAR           : '**' ;
J2V_LT              : '<'  ;
J2V_GT              : '>'  ;
J2V_PLUS            : '+'  ;
J2V_MINUS           : '-'  ;
J2V_STAR            : '*'  ;
J2V_SLASH           : '/'  ;
J2V_PERCENT         : '%'  ;
J2V_TILDE           : '~'  ;
J2V_PIPE            : '|'  ;
J2V_DOT             : '.'  ;
J2V_COMMA           : ','  ;
J2V_COLON           : ':'  ;
J2V_LPAREN          : '('  ;
J2V_RPAREN          : ')'  ;
J2V_LBRACKET        : '['  ;
J2V_RBRACKET        : ']'  ;
J2V_LBRACE          : '{'  ;
J2V_RBRACE          : '}'  ;
J2V_STRING          : '"' ( '\\' . | ~["\\\r\n] )* '"' | '\'' ( '\\' . | ~['\\\r\n] )* '\'' ;
J2V_FLOAT           : [0-9]+ '.' [0-9]+ ;
J2V_INT             : [0-9]+              ;
J2V_ID              : [a-zA-Z_][a-zA-Z0-9_]* ;