parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

template : TOKEN* EOF ;

