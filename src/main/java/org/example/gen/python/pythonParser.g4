parser grammar pythonParser;

options { tokenVocab = pythonLexer; }

program : (NEWLINE | statement)* EOF ;

statement
    : simpleStmt (NEWLINE | EOF)
    | compoundStmt
    ;
simpleStmt
    : importStmt
    | fromImportStmt
    | assignStmt
    | augAssignStmt
    | returnStmt
    | deleteStmt
    | assertStmt
    | globalStmt
    | nonlocalStmt
    | passStmt
    | breakStmt
    | continueStmt
    | raiseStmt
    | yieldStmt
    | exprStmt
    ;

importStmt     : KW_IMPORT dottedName (COMMA dottedName)* ;
fromImportStmt : KW_FROM dottedName KW_IMPORT importNames ;
importNames    : STAR | importName (COMMA importName)* ;
importName     : IDENT (KW_AS IDENT)? ;
dottedName     : IDENT (DOT IDENT)* ;

assignStmt    : target (EQ target)* EQ expression ;
augAssignStmt : target AUGASSIGN expression ;
target        : IDENT (DOT IDENT | LBRACKET expression RBRACKET)* ;

returnStmt   : KW_RETURN   expression? ;
deleteStmt   : KW_DEL      target (COMMA target)* ;
assertStmt   : KW_ASSERT   expression (COMMA expression)? ;
globalStmt   : KW_GLOBAL   IDENT (COMMA IDENT)* ;
nonlocalStmt : KW_NONLOCAL IDENT (COMMA IDENT)* ;
passStmt     : KW_PASS     ;
breakStmt    : KW_BREAK    ;
continueStmt : KW_CONTINUE ;
raiseStmt    : KW_RAISE    expression (KW_FROM expression)? ;
yieldStmt    : KW_YIELD    expression? ;
exprStmt     : expression  ;

compoundStmt
    : funcDef
    | asyncFuncDef
    | classDef
    | ifStmt
    | forStmt
    | whileStmt
    | withStmt
    | tryStmt
    | decoratedDef
    ;

decoratedDef : decorator+ (funcDef | asyncFuncDef | classDef) ;
decorator    : AT dottedName (LPAREN argList? RPAREN)? NEWLINE ;

funcDef
    : KW_DEF IDENT LPAREN paramList? RPAREN
      (ARROW expression)? COLON suite
    ;

asyncFuncDef
    : KW_ASYNC KW_DEF IDENT LPAREN paramList? RPAREN
      (ARROW expression)? COLON suite
    ;

paramList
    : param (COMMA param)*
      (COMMA STAR IDENT? (COMMA kwParam)*)?
      (COMMA DOUBLESTAR IDENT)? COMMA?
    | STAR IDENT? (COMMA kwParam)* (COMMA DOUBLESTAR IDENT)? COMMA?
    | DOUBLESTAR IDENT COMMA?
    ;
param   : IDENT (COLON expression)? (EQ expression)? ;
kwParam : IDENT (COLON expression)? (EQ expression)? ;

classDef : KW_CLASS IDENT (LPAREN baseList? RPAREN)? COLON suite ;
baseList : IDENT (COMMA IDENT)* ;

ifStmt
    : KW_IF expression COLON suite
      (KW_ELIF expression COLON suite)*
      (KW_ELSE COLON suite)?
    ;

forStmt
    : KW_FOR target KW_IN expression COLON suite
      (KW_ELSE COLON suite)?
    ;

whileStmt
    : KW_WHILE expression COLON suite
      (KW_ELSE COLON suite)?
    ;

withStmt : KW_WITH withItem (COMMA withItem)* COLON suite ;
withItem : expression (KW_AS target)? ;

tryStmt
    : KW_TRY COLON suite
      exceptClause+
      (KW_ELSE    COLON suite)?
      (KW_FINALLY COLON suite)?
    | KW_TRY COLON suite
      KW_FINALLY COLON suite
    ;
exceptClause
    : KW_EXCEPT (expression (KW_AS IDENT)?)? COLON suite
    ;

suite
    : NEWLINE INDENT (NEWLINE | statement)+ DEDENT
    ;

expression
    : lambdaExpr
    | orExpr (KW_IF orExpr KW_ELSE orExpr)?
    ;

lambdaExpr : KW_LAMBDA paramList? COLON expression ;

orExpr  : andExpr (KW_OR  andExpr)* ;
andExpr : notExpr (KW_AND notExpr)* ;
notExpr : KW_NOT notExpr | comparison ;

comparison : arith (compOp arith)* ;
compOp
    : EQEQ | NEQ | LT | GT | LTE | GTE
    | KW_IN | KW_NOT KW_IN
    | KW_IS | KW_IS  KW_NOT
    ;

arith  : term   ((PLUS  | MINUS) term)*   ;
term   : factor ((STAR | SLASH | DOUBLESLASH | PERCENT) factor)* ;
factor : (PLUS | MINUS | TILDE) factor | power ;
power  : awaitExpr (DOUBLESTAR factor)? ;
awaitExpr : KW_AWAIT? atom trailer* ;

trailer
    : LPAREN argList? RPAREN
    | LBRACKET expression RBRACKET
    | DOT IDENT
    ;

atom
    : IDENT | NUMBER | STRING+
    | TRUE  | FALSE  | NONE | ELLIPSIS
    | LPAREN expression RPAREN
    | LBRACKET listContent? RBRACKET
    | LBRACE dictContent? RBRACE
    ;

listContent
    : expression compFor+                        # comprehension
    | expression (COMMA expression)* COMMA?     # literal
    ;

dictContent
    : dictItem compFor+                          # dictComprehension
    | dictItem (COMMA dictItem)* COMMA?          # dictLiteral
    ;

compFor
    : KW_FOR target KW_IN orExpr (compIf)*
    ;

compIf
    : KW_IF orExpr
    ;

dictItem
    : expression COLON expression
    ;

argList
    : argument (COMMA argument)* COMMA?
    ;

argument
    : (IDENT EQ)? expression
    | STAR expression
    | DOUBLESTAR expression
    ;