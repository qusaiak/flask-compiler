lexer grammar PythonLexer;

tokens { INDENT, DEDENT }

@lexer::members {
    // Buffer of extra tokens (INDENT/DEDENT/NEWLINE) to emit.
    private final java.util.LinkedList<Token> pendingTokens = new java.util.LinkedList<>();
    // Indentation level stack.
    private final java.util.Deque<Integer> indents = new java.util.ArrayDeque<>();
    // Depth of () [] {} so newlines inside brackets are ignored.
    private int opened = 0;

    @Override
    public void emit(Token t) {
        super.setToken(t);
        pendingTokens.offer(t);
    }

    @Override
    public Token nextToken() {
        if (_input.LA(1) == EOF && !indents.isEmpty()) {
            for (int i = pendingTokens.size() - 1; i >= 0; i--) {
                if (pendingTokens.get(i).getType() == EOF) {
                    pendingTokens.remove(i);
                }
            }
            emit(makeToken(NEWLINE, "\n"));
            while (!indents.isEmpty()) {
                emit(makeToken(DEDENT, ""));
                indents.pop();
            }
            emit(makeToken(EOF, "<EOF>"));
        }
        Token next = super.nextToken();
        return pendingTokens.isEmpty() ? next : pendingTokens.poll();
    }

    private Token makeToken(int type, String text) {
        int stop = getCharIndex() - 1;
        int start = text.isEmpty() ? stop : stop - text.length() + 1;
        return new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    private static int indentWidth(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            count += (ch == '\t') ? 8 - (count % 8) : 1;
        }
        return count;
    }

    private boolean atStartOfInput() {
        return getCharPositionInLine() == 0 && getLine() == 1;
    }
}

// Keywords
FROM    : 'from' ;
IMPORT  : 'import' ;
DEF     : 'def' ;
RETURN  : 'return' ;
TRUE    : 'True' ;
FALSE   : 'False' ;
NONE    : 'None' ;

// Operators / punctuation
ASSIGN  : '=' ;
PLUS    : '+' ;
MINUS   : '-' ;
STAR    : '*' ;
SLASH   : '/' ;
DOT     : '.' ;
COMMA   : ',' ;
COLON   : ':' ;
AT      : '@' ;

OPEN_PAREN  : '(' { opened++; } ;
CLOSE_PAREN : ')' { opened--; } ;
OPEN_BRACK  : '[' { opened++; } ;
CLOSE_BRACK : ']' { opened--; } ;
OPEN_BRACE  : '{' { opened++; } ;
CLOSE_BRACE : '}' { opened--; } ;

// Literals
STRING
    : '"' ( '\\' . | ~["\\\r\n] )* '"'
    | '\'' ( '\\' . | ~['\\\r\n] )* '\''
    ;

FLOAT_NUMBER : DIGITS '.' DIGITS ;
INTEGER      : DIGITS ;

NAME : [a-zA-Z_] [a-zA-Z_0-9]* ;

fragment DIGITS : [0-9]+ ;
fragment SPACES : [ \t]+ ;

COMMENT : '#' ~[\r\n\f]* -> skip ;

NEWLINE
    : ( {atStartOfInput()}? SPACES
      | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
      )
      {
        String text = getText();
        String spaces = text.replaceAll("[\r\n\f]+", "");
        int next = _input.LA(1);
        if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
            skip();
        } else {
            emit(makeToken(NEWLINE, "\n"));
            int indent = indentWidth(spaces);
            int previous = indents.isEmpty() ? 0 : indents.peek();
            if (indent == previous) {
                skip();
            } else if (indent > previous) {
                indents.push(indent);
                emit(makeToken(INDENT, spaces));
            } else {
                while (!indents.isEmpty() && indents.peek() > indent) {
                    emit(makeToken(DEDENT, ""));
                    indents.pop();
                }
            }
        }
      }
    ;

WS : [ \t]+ -> skip ;
