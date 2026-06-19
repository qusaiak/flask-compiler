parser grammar HtmlParser;

options { tokenVocab=HtmlLexer; }

document : TOKEN* EOF ;

