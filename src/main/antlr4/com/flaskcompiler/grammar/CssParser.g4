parser grammar CssParser;

options { tokenVocab=CssLexer; }

// A stylesheet is a sequence of rule sets.
stylesheet
    : ruleSet* EOF
    ;

// selector(s) { declaration* }
ruleSet
    : selectorList LBRACE declaration* RBRACE
    ;

// multiple selectors separated by commas
selectorList
    : selector (COMMA selector)*
    ;

// element | .class | #id
selector
    : IDENT      // element
    | CLASS      // .class
    | HASH_ID    // #id
    ;

// property: value ;
declaration
    : property COLON value SEMI
    ;

property
    : IDENT
    ;

// one or more value terms (e.g. "1px solid blue", "0 auto")
value
    : term+
    ;

term
    : NUMBER
    | DIMENSION
    | PERCENTAGE
    | COLOR
    | STRING
    | IDENT
    ;
