lexer grammar pythonLexer;
@lexer::header { package org.example.gen.python; }

@lexer::members {

    private final java.util.Deque<Integer> indentStack =
        new java.util.ArrayDeque<>();
    private final java.util.Queue<org.antlr.v4.runtime.Token> pending =
        new java.util.LinkedList<>();

    private int openBrackets = 0;

    { indentStack.push(0); }

    @Override
    public org.antlr.v4.runtime.Token nextToken() {
        if (!pending.isEmpty()) return pending.poll();
        org.antlr.v4.runtime.Token t = super.nextToken();
        if (t.getType() == EOF) {
            emitRemainingDedents();
        }
        if (!pending.isEmpty()) {
            pending.add(t);
            return pending.poll();
        }
        return t;
    }

    private void handleNewline() {
        if (openBrackets > 0) return;

        int nextChar = _input.LA(1);
        if (nextChar == '#' || nextChar == '\r' || nextChar == '\n' || nextChar == org.antlr.v4.runtime.IntStream.EOF) {
            return;
        }

        org.antlr.v4.runtime.CommonToken nl =
            new org.antlr.v4.runtime.CommonToken(NEWLINE, "\n");
        nl.setLine(getLine());
        nl.setCharPositionInLine(0);
        pending.add(nl);

        int spaces = 0;
        boolean seenNewline = false;
        for (char c : getText().toCharArray()) {
            if (c == '\r' || c == '\n') { spaces = 0; seenNewline = true; continue; }
            if (!seenNewline) continue;
            if (c == ' ')  { spaces++;                        continue; }
            if (c == '\t') { spaces = ((spaces / 8) + 1) * 8; continue; }
        }

        int cur = indentStack.peek();

        if (spaces > cur) {
            indentStack.push(spaces);
            org.antlr.v4.runtime.CommonToken indent =
                new org.antlr.v4.runtime.CommonToken(INDENT, "<INDENT>");
            indent.setLine(getLine());
            indent.setCharPositionInLine(spaces);
            pending.add(indent);
        } else if (spaces < cur) {
            while (indentStack.size() > 1 && indentStack.peek() > spaces) {
                indentStack.pop();
                org.antlr.v4.runtime.CommonToken dedent =
                    new org.antlr.v4.runtime.CommonToken(DEDENT, "<DEDENT>");
                dedent.setLine(getLine());
                dedent.setCharPositionInLine(spaces);
                pending.add(dedent);
            }
        }
    }

    private void emitRemainingDedents() {
        while (indentStack.size() > 1) {
            indentStack.pop();
            org.antlr.v4.runtime.CommonToken dedent =
                new org.antlr.v4.runtime.CommonToken(DEDENT, "<DEDENT>");
            pending.add(dedent);
        }
    }
}

tokens { INDENT, DEDENT }

// Keywords
KW_DEF      : 'def'      ;   KW_CLASS    : 'class'    ;
KW_RETURN   : 'return'   ;   KW_IMPORT   : 'import'   ;
KW_FROM     : 'from'     ;   KW_AS       : 'as'       ;
KW_IF       : 'if'       ;   KW_ELIF     : 'elif'     ;
KW_ELSE     : 'else'     ;   KW_FOR      : 'for'      ;
KW_IN       : 'in'       ;   KW_WHILE    : 'while'    ;
KW_WITH     : 'with'     ;   KW_PASS     : 'pass'     ;
KW_BREAK    : 'break'    ;   KW_CONTINUE : 'continue' ;
KW_AND      : 'and'      ;   KW_OR       : 'or'       ;
KW_NOT      : 'not'      ;   KW_IS       : 'is'       ;
KW_RAISE    : 'raise'    ;   KW_TRY      : 'try'      ;
KW_EXCEPT   : 'except'   ;   KW_FINALLY  : 'finally'  ;
KW_GLOBAL   : 'global'   ;   KW_DEL      : 'del'      ;
KW_ASSERT   : 'assert'   ;   KW_LAMBDA   : 'lambda'   ;
KW_NONLOCAL : 'nonlocal' ;   KW_YIELD    : 'yield'    ;
KW_ASYNC    : 'async'    ;   KW_AWAIT    : 'await'    ;
TRUE        : 'True'     ;
FALSE       : 'False'    ;
NONE        : 'None'     ;

// Operators
AUGASSIGN   : '+=' | '-=' | '*=' | '/=' | '//=' | '%=' | '**='
            | '&=' | '|=' | '^=' | '>>=' | '<<='               ;
ARROW       : '->'  ;
DOUBLESTAR  : '**'  ;
DOUBLESLASH : '//'  ;
LSHIFT      : '<<'  ;
RSHIFT      : '>>'  ;
EQEQ        : '==' ;   NEQ     : '!=' ;
LTE         : '<=' ;   GTE     : '>=' ;
EQ          : '='  ;   LT      : '<'  ;   GT      : '>'  ;
PLUS        : '+'  ;   MINUS   : '-'  ;
STAR        : '*'  ;   SLASH   : '/'  ;   PERCENT : '%'  ;
AMP         : '&'  ;   PIPE    : '|'  ;   CARET   : '^'  ;
TILDE       : '~'  ;   AT      : '@'  ;
ELLIPSIS    : '...' ;
DOT         : '.'  ;   COLON   : ':'  ;   SEMI    : ';'  ;
COMMA       : ','  ;

LPAREN   : '(' { openBrackets++; } ;
RPAREN   : ')' { openBrackets--; } ;
LBRACKET : '[' { openBrackets++; } ;
RBRACKET : ']' { openBrackets--; } ;
LBRACE   : '{' { openBrackets++; } ;
RBRACE   : '}' { openBrackets--; } ;

// String literals
STRING
    : STRING_PREFIX? ( TRIPLE_DQ | TRIPLE_SQ | DQ_STR | SQ_STR )
    ;
fragment STRING_PREFIX : [fFbBuUrR] | 'fr' | 'rf' | 'br' | 'rb' ;
fragment TRIPLE_DQ     : '"""' .*? '"""'                         ;
fragment TRIPLE_SQ     : '\'\'\'' .*? '\'\'\''                   ;
fragment DQ_STR        : '"'  ( '\\' . | ~["\\\r\n] )* '"'      ;
fragment SQ_STR        : '\'' ( '\\' . | ~['\\\r\n] )* '\''     ;

// Number literals
NUMBER
    : '0' [xX] [0-9a-fA-F]+ [lL]?
    | '0' [oO] [0-7]+        [lL]?
    | '0' [bB] [01]+         [lL]?
    | [0-9]+ [jJ]
    | [0-9]* '.' [0-9]+ ([eE][+-]?[0-9]+)? [jJ]?
    | [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? [jJ]?
    | [0-9]+  [eE][+-]?[0-9]+               [jJ]?
    | [0-9]+ [lL]?
    ;

IDENT : [a-zA-Z_\u0080-\uffff] [a-zA-Z0-9_\u0080-\uffff]* ;

// Indentation
NEWLINE_WS
    : ('\r'? '\n') [ \t]* { handleNewline(); }
      -> skip
    ;

NEWLINE : '\r'? '\n' -> skip ;

WS            : [ \t]+          -> channel(HIDDEN) ;
COMMENT       : '#' ~[\r\n]*    -> channel(HIDDEN) ;
LINE_CONTINUE : '\\' '\r'? '\n' -> skip            ;