parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

// Entry point: a Python module (minimal Flask subset)
file_input
    : (NEWLINE | statement)* EOF
    ;

statement
    : import_stmt
    | function_def
    | simple_stmt
    ;

// --- imports ---
import_stmt
    : FROM dotted_name IMPORT import_list NEWLINE
    | IMPORT dotted_name NEWLINE
    ;

import_list
    : NAME (COMMA NAME)*
    | STAR
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

// --- function / route definitions ---
function_def
    : decorator* DEF NAME parameters COLON suite
    ;

decorator
    : AT dotted_name (OPEN_PAREN arglist? CLOSE_PAREN)? NEWLINE
    ;

parameters
    : OPEN_PAREN param_list? CLOSE_PAREN
    ;

param_list
    : NAME (COMMA NAME)*
    ;

suite
    : simple_stmt
    | NEWLINE INDENT statement+ DEDENT
    ;

// --- simple statements ---
simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : assignment
    | return_stmt
    | expr
    ;

assignment
    : NAME ASSIGN expr
    ;

return_stmt
    : RETURN expr?
    ;

// --- expressions (simple) ---
expr
    : additive
    ;

additive
    : multiplicative ((PLUS | MINUS) multiplicative)*
    ;

multiplicative
    : postfix ((STAR | SLASH) postfix)*
    ;

postfix
    : atom trailer*
    ;

trailer
    : DOT NAME
    | OPEN_PAREN arglist? CLOSE_PAREN
    | OPEN_BRACK expr CLOSE_BRACK
    ;

atom
    : OPEN_PAREN expr CLOSE_PAREN
    | list_literal
    | dict_literal
    | NAME
    | STRING+
    | FLOAT_NUMBER
    | INTEGER
    | TRUE
    | FALSE
    | NONE
    ;

list_literal
    : OPEN_BRACK (expr (COMMA expr)* COMMA?)? CLOSE_BRACK
    ;

dict_literal
    : OPEN_BRACE (dict_entry (COMMA dict_entry)* COMMA?)? CLOSE_BRACE
    ;

dict_entry
    : expr COLON expr
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : NAME ASSIGN expr
    | expr
    ;
