parser grammar CssParser;

options { tokenVocab=CssLexer; }

stylesheet : TOKEN* EOF ;

