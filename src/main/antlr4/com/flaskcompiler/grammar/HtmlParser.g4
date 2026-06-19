parser grammar HtmlParser;

options { tokenVocab=HtmlLexer; }

// A document is a sequence of nodes (elements and text).
document
    : node* EOF
    ;

node
    : element
    | text
    ;

text
    : HTML_TEXT
    ;

element
    : startTag node* endTag   // nested container element
    | selfClosingTag          // e.g. <img ... />, <input ... />
    ;

startTag
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE
    ;

endTag
    : TAG_OPEN SLASH TAG_NAME TAG_CLOSE
    ;

selfClosingTag
    : TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE
    ;

attribute
    : TAG_NAME (EQUALS attributeValue)?
    ;

attributeValue
    : ATTR_VALUE
    | TAG_NAME
    ;
