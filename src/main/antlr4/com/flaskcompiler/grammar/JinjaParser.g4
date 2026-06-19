parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

// Entry point: a Jinja template is a sequence of nodes.
template
    : node* EOF
    ;

node
    : extendsTag
    | blockTag
    | forTag
    | ifTag
    | expression
    | content
    ;

// Plain embedded HTML / text
content
    : TEXT
    ;

// {{ variable }} or {{ object.property }}
expression
    : EXPR_OPEN variableRef EXPR_CLOSE
    ;

variableRef
    : NAME (DOT NAME)*
    ;

// {% extends "base.html" %}
extendsTag
    : STMT_OPEN EXTENDS STRING STMT_CLOSE
    ;

// {% block name %} ... {% endblock %}
blockTag
    : STMT_OPEN BLOCK NAME STMT_CLOSE
      node*
      STMT_OPEN ENDBLOCK STMT_CLOSE
    ;

// {% for item in items %} ... {% endfor %}
forTag
    : STMT_OPEN FOR NAME IN variableRef STMT_CLOSE
      node*
      STMT_OPEN ENDFOR STMT_CLOSE
    ;

// {% if condition %} ... {% endif %}
ifTag
    : STMT_OPEN IF condition STMT_CLOSE
      node*
      STMT_OPEN ENDIF STMT_CLOSE
    ;

condition
    : variableRef
    ;
