parser grammar FlaskParser;

@parser::header {
    package org.example.gen;
}

options { tokenVocab = FlaskLexer; }

flaskTemplate : (htmlNode)* EOF ;

htmlNode
    : htmlElement          # htmlElementNode
    | j2Statement          # j2StmtNode
    | j2Variable           # j2VarNode
    | JINJA_COMMENT        # j2CommentNode
    | HTML_DOCTYPE         # doctypeNode
    | HTML_COMMENT         # htmlCommentNode
    | HTML_TEXT            # htmlTextNode
    ;

htmlElement
    : openTag htmlNode* closeTag    # normalElement
    | selfCloseTag                  # voidElement
    | styleElement                  # cssElement
    | scriptElement                 # scriptEl
    ;

openTag
    : HTML_OPEN_TAG attribute* TAG_CLOSE
    ;

closeTag
    : HTML_CLOSE_TAG TAG_CLOSE
    ;

selfCloseTag
    : HTML_OPEN_TAG attribute* TAG_SELF_CLOSE
    ;

styleElement
    : STYLE_OPEN cssStylesheetInStyle STYLE_CLOSE
    ;

scriptElement
    : SCRIPT_OPEN (SCRIPT_TEXT | SCRIPT_LT)* SCRIPT_CLOSE
    ;

attribute
    : ATTR_NAME (ATTR_EQ attrValue)?
    ;

attrValue
    : ATTR_VAL_DQ           # dqAttrVal
    | ATTR_VAL_SQ           # sqAttrVal
    | j2Variable            # j2AttrVal
    | j2VariableInTag       # j2AttrValInTag
    ;

j2VariableInTag
    : TAG_JINJA_VAR_OPEN j2VarExpr JINJA_VAR_CLOSE
    ;

cssStylesheet
    : cssItem*
    ;

cssItem
    : cssRule
    | cssAtRule
    ;

cssRule
    : cssSelectorList CSS_LBRACE cssDeclarationBlock CSS_RBRACE
    ;

cssSelectorList
    : cssSelector (CSS_COMMA cssSelector)*
    ;

cssSelector
    : cssSimpleSelectorSeq (cssCombinator cssSimpleSelectorSeq)*
    ;

cssCombinator
    : CSS_GT        # childComb
    | CSS_PLUS      # adjacentComb
    | CSS_TILDE_SEL # siblingComb
    ;

cssSimpleSelectorSeq
    : cssBaseSelector cssSubSelector*      # typeselectorwithmodifiers
    | cssSubSelector+                      # justClassIdAttrpseudowithouttype
    ;

cssBaseSelector
    : CSS_IDENT     # typeSelector
    | CSS_STAR      # universalSelector
    ;

cssSubSelector
    : CSS_DOT CSS_IDENT                                              # classSelector
    | CSS_HASH CSS_IDENT                                             # idSelector
    | CSS_HEX_COLOR                                                  # idSelectorHex
    | CSS_COLON CSS_IDENT
      (CSS_LPAREN cssFunctionArgs CSS_RPAREN)?                       # pseudoClassSelector
    | CSS_DCOLON CSS_IDENT                                           # pseudoElementSelector
    | CSS_LBRACKET CSS_IDENT
        (cssAttrOperator (CSS_STRING_DQ | CSS_STRING_SQ | CSS_IDENT))?
      CSS_RBRACKET                                                   # attrSelector
    ;

cssAttrOperator
    : CSS_ASSIGN
    | CSS_IDENT
    ;

cssFunctionArgs
    : cssValue (CSS_COMMA cssValue)*
    ;

cssDeclarationBlock
    : (cssDeclaration CSS_SEMICOLON)* cssDeclaration CSS_SEMICOLON?
    | CSS_SEMICOLON*
    ;

cssDeclaration
    : CSS_IDENT CSS_COLON cssValueList CSS_IMPORTANT?
    ;

cssValueList
    : cssValue+
    ;

cssValue
    : CSS_IDENT         # identValue
    | CSS_DIMENSION     # dimensionValue
    | CSS_NUMBER        # numberValue
    | CSS_HEX_COLOR     # hexColorValue
    | CSS_STRING_DQ     # dqStringValue
    | CSS_STRING_SQ     # sqStringValue
    | CSS_URL           # urlValue
    | CSS_VAR           # varValue
    | CSS_SLASH         # slashValue
    | CSS_COMMA         # commaValue
    | cssFunction       # funcValue
    ;

cssFunction
    : CSS_IDENT CSS_LPAREN cssFunctionArgs CSS_RPAREN
    ;

cssAtRule
    : cssMediaRule
    | cssKeyframesRule
    | cssImportRule
    | cssCharsetRule
    | cssSupportsRule
    | cssFontFaceRule
    ;

cssMediaRule
    : CSS_AT_MEDIA cssMediaQuery CSS_LBRACE cssItem* CSS_RBRACE
    ;

cssMediaQuery
    : cssMediaQueryTerm (CSS_IDENT cssMediaQueryTerm)*
    ;

cssMediaQueryTerm
    : CSS_IDENT
    | CSS_LPAREN CSS_IDENT CSS_COLON cssValue CSS_RPAREN
    ;

cssKeyframesRule
    : CSS_AT_KEYFRAMES CSS_IDENT CSS_LBRACE cssKeyframeBlock* CSS_RBRACE
    ;

cssKeyframeBlock
    : cssKeyframeSelector CSS_LBRACE cssDeclarationBlock CSS_RBRACE
    ;

cssKeyframeSelector
    : CSS_IDENT
    | CSS_DIMENSION
    ;

cssImportRule
    : CSS_AT_IMPORT (CSS_STRING_DQ | CSS_STRING_SQ | CSS_URL)
      (CSS_IDENT (CSS_COMMA CSS_IDENT)*)? CSS_SEMICOLON
    ;

cssCharsetRule
    : CSS_AT_CHARSET (CSS_STRING_DQ | CSS_STRING_SQ) CSS_SEMICOLON
    ;

cssSupportsRule
    : CSS_AT_SUPPORTS cssSupportsCondition CSS_LBRACE cssItem* CSS_RBRACE
    ;

cssSupportsCondition
    : CSS_IDENT
    | CSS_LPAREN CSS_IDENT CSS_COLON cssValue CSS_RPAREN
    ;

cssFontFaceRule
    : CSS_AT_FONT_FACE CSS_LBRACE cssDeclarationBlock CSS_RBRACE
    ;

cssStylesheetInStyle
    : cssItemInStyle*
    ;

cssItemInStyle
    : cssRuleInStyle
    | cssAtRuleInStyle
    ;

cssRuleInStyle
    : cssSelectorListInStyle CSS_MODE_LBRACE cssDeclarationBlockInStyle CSS_MODE_RBRACE
    ;

cssSelectorListInStyle
    : cssSelectorInStyle (CSS_MODE_COMMA cssSelectorInStyle)*
    ;

cssSelectorInStyle
    : cssSimpleSelectorSeqInStyle (cssCombinatorInStyle cssSimpleSelectorSeqInStyle)*
    ;

cssCombinatorInStyle
    : CSS_MODE_GT        # childCombInStyle
    | CSS_MODE_PLUS      # adjacentCombInStyle
    | CSS_MODE_TILDE_SEL # siblingCombInStyle
    ;

cssSimpleSelectorSeqInStyle
    : cssBaseSelectorInStyle cssSubSelectorInStyle*      # typeSelectorWithModifiersInStyle
    | cssSubSelectorInStyle+                              # justClassIdAttrPseudoInStyle
    ;

cssBaseSelectorInStyle
    : CSS_MODE_IDENT     # typeSelectorInStyle
    | CSS_MODE_STAR      # universalSelectorInStyle
    ;

cssSubSelectorInStyle
    : CSS_MODE_DOT CSS_MODE_IDENT                                                    # classSelectorInStyle
    | CSS_MODE_HASH CSS_MODE_IDENT                                                    # idSelectorInStyle
    | CSS_MODE_HEX_COLOR                                                              # idSelectorHexInStyle
    | CSS_MODE_COLON CSS_MODE_IDENT
      (CSS_MODE_LPAREN cssFunctionArgsInStyle CSS_MODE_RPAREN)?                      # pseudoClassSelectorInStyle
    | CSS_MODE_DCOLON CSS_MODE_IDENT                                                  # pseudoElementSelectorInStyle
    | CSS_MODE_LBRACKET CSS_MODE_IDENT
        (cssAttrOperatorInStyle (CSS_MODE_STRING_DQ | CSS_MODE_STRING_SQ | CSS_MODE_IDENT))?
      CSS_MODE_RBRACKET                                                              # attrSelectorInStyle
    ;

cssAttrOperatorInStyle
    : CSS_MODE_ASSIGN
    | CSS_MODE_IDENT
    ;

cssFunctionArgsInStyle
    : cssValueInStyle (CSS_MODE_COMMA cssValueInStyle)*
    ;

cssDeclarationBlockInStyle
    : (cssDeclarationInStyle CSS_MODE_SEMICOLON)* cssDeclarationInStyle CSS_MODE_SEMICOLON?
    | CSS_MODE_SEMICOLON*
    ;

cssDeclarationInStyle
    : CSS_MODE_IDENT CSS_MODE_COLON cssValueListInStyle CSS_MODE_IMPORTANT?
    ;

cssValueListInStyle
    : cssValueInStyle+
    ;

cssValueInStyle
    : CSS_MODE_IDENT         # identValueInStyle
    | CSS_MODE_DIMENSION     # dimensionValueInStyle
    | CSS_MODE_NUMBER        # numberValueInStyle
    | CSS_MODE_HEX_COLOR     # hexColorValueInStyle
    | CSS_MODE_STRING_DQ     # dqStringValueInStyle
    | CSS_MODE_STRING_SQ     # sqStringValueInStyle
    | CSS_MODE_URL           # urlValueInStyle
    | CSS_MODE_VAR           # varValueInStyle
    | CSS_MODE_SLASH         # slashValueInStyle
    | CSS_MODE_COMMA         # commaValueInStyle
    | cssFunctionInStyle     # funcValueInStyle
    ;

cssFunctionInStyle
    : CSS_MODE_IDENT CSS_MODE_LPAREN cssFunctionArgsInStyle CSS_MODE_RPAREN
    ;

cssAtRuleInStyle
    : cssMediaRuleInStyle
    | cssKeyframesRuleInStyle
    | cssImportRuleInStyle
    | cssCharsetRuleInStyle
    | cssSupportsRuleInStyle
    | cssFontFaceRuleInStyle
    ;

cssMediaRuleInStyle
    : CSS_MODE_AT_MEDIA cssMediaQueryInStyle CSS_MODE_LBRACE cssItemInStyle* CSS_MODE_RBRACE
    ;

cssMediaQueryInStyle
    : cssMediaQueryTermInStyle (CSS_MODE_IDENT cssMediaQueryTermInStyle)*
    ;

cssMediaQueryTermInStyle
    : CSS_MODE_IDENT
    | CSS_MODE_LPAREN CSS_MODE_IDENT CSS_MODE_COLON cssValueInStyle CSS_MODE_RPAREN
    ;

cssKeyframesRuleInStyle
    : CSS_MODE_AT_KEYFRAMES CSS_MODE_IDENT CSS_MODE_LBRACE cssKeyframeBlockInStyle* CSS_MODE_RBRACE
    ;

cssKeyframeBlockInStyle
    : cssKeyframeSelectorInStyle CSS_MODE_LBRACE cssDeclarationBlockInStyle CSS_MODE_RBRACE
    ;

cssKeyframeSelectorInStyle
    : CSS_MODE_IDENT
    | CSS_MODE_DIMENSION
    ;

cssImportRuleInStyle
    : CSS_MODE_AT_IMPORT (CSS_MODE_STRING_DQ | CSS_MODE_STRING_SQ | CSS_MODE_URL)
      (CSS_MODE_IDENT (CSS_MODE_COMMA CSS_MODE_IDENT)*)? CSS_MODE_SEMICOLON
    ;

cssCharsetRuleInStyle
    : CSS_MODE_AT_CHARSET (CSS_MODE_STRING_DQ | CSS_MODE_STRING_SQ) CSS_MODE_SEMICOLON
    ;

cssSupportsRuleInStyle
    : CSS_MODE_AT_SUPPORTS cssSupportsConditionInStyle CSS_MODE_LBRACE cssItemInStyle* CSS_MODE_RBRACE
    ;

cssSupportsConditionInStyle
    : CSS_MODE_IDENT
    | CSS_MODE_LPAREN CSS_MODE_IDENT CSS_MODE_COLON cssValueInStyle CSS_MODE_RPAREN
    ;

cssFontFaceRuleInStyle
    : CSS_MODE_AT_FONT_FACE CSS_MODE_LBRACE cssDeclarationBlockInStyle CSS_MODE_RBRACE
    ;

j2Statement
    : j2ForStmt
    | j2IfStmt
    | j2ExtendsStmt
    | j2BlockStmt
    | j2IncludeStmt
    | j2SetStmt
    | j2MacroStmt
    | j2ImportStmt
    | j2FromImportStmt
    | j2WithStmt
    | j2CallStmt
    ;

j2ForStmt
    : JINJA_STMT_OPEN J2S_FOR j2ForTarget J2S_IN j2Expr
      (J2S_IF j2Expr)?
      J2S_RECURSIVE?
      JINJA_STMT_CLOSE
      htmlNode*
      j2ElseClause?
      JINJA_STMT_OPEN J2S_ENDFOR JINJA_STMT_CLOSE
    ;

j2ForTarget
    : J2S_ID (J2S_COMMA J2S_ID)*
    ;

j2IfStmt
    : JINJA_STMT_OPEN J2S_IF j2Expr JINJA_STMT_CLOSE
      htmlNode*
      j2ElifClause*
      j2ElseClause?
      JINJA_STMT_OPEN J2S_ENDIF JINJA_STMT_CLOSE
    ;

j2ElifClause
    : JINJA_STMT_OPEN J2S_ELIF j2Expr JINJA_STMT_CLOSE
      htmlNode*
    ;

j2ElseClause
    : JINJA_STMT_OPEN J2S_ELSE JINJA_STMT_CLOSE
      htmlNode*
    ;

j2ExtendsStmt
    : JINJA_STMT_OPEN J2S_EXTENDS j2StringLiteral JINJA_STMT_CLOSE
    ;

j2BlockStmt
    : JINJA_STMT_OPEN J2S_BLOCK J2S_ID JINJA_STMT_CLOSE
      htmlNode*
      JINJA_STMT_OPEN J2S_ENDBLOCK J2S_ID? JINJA_STMT_CLOSE
    ;

j2IncludeStmt
    : JINJA_STMT_OPEN J2S_INCLUDE j2StringLiteral
      J2S_IGNORE_MISSING?
      JINJA_STMT_CLOSE
    ;

j2SetStmt
    : JINJA_STMT_OPEN J2S_SET J2S_ID J2S_ASSIGN j2Expr JINJA_STMT_CLOSE   # simpleSetStmt
    | JINJA_STMT_OPEN J2S_SET J2S_ID JINJA_STMT_CLOSE
      htmlNode*
      JINJA_STMT_OPEN J2S_ENDSET JINJA_STMT_CLOSE                          # blockSetStmt
    ;

j2MacroStmt
    : JINJA_STMT_OPEN J2S_MACRO J2S_ID
      J2S_LPAREN j2MacroArgs? J2S_RPAREN
      JINJA_STMT_CLOSE
      htmlNode*
      JINJA_STMT_OPEN J2S_ENDMACRO JINJA_STMT_CLOSE
    ;

j2MacroArgs
    : j2MacroArg (J2S_COMMA j2MacroArg)*
    ;

j2MacroArg
    : J2S_ID (J2S_ASSIGN j2Expr)?
    ;

j2ImportStmt
    : JINJA_STMT_OPEN J2S_IMPORT j2StringLiteral J2S_AS J2S_ID JINJA_STMT_CLOSE
    ;

j2FromImportStmt
    : JINJA_STMT_OPEN J2S_FROM j2StringLiteral J2S_IMPORT
      j2ImportName (J2S_COMMA j2ImportName)*
      JINJA_STMT_CLOSE
    ;

j2ImportName
    : J2S_ID (J2S_AS J2S_ID)?
    ;

j2WithStmt
    : JINJA_STMT_OPEN J2S_WITH
      (j2WithAssignment (J2S_COMMA j2WithAssignment)*)?
      JINJA_STMT_CLOSE
      htmlNode*
      JINJA_STMT_OPEN J2S_ENDWITH JINJA_STMT_CLOSE
    ;

j2WithAssignment
    : J2S_ID J2S_ASSIGN j2Expr
    ;

j2CallStmt
    : JINJA_STMT_OPEN J2S_CALL
      (J2S_LPAREN j2MacroArgs? J2S_RPAREN)?
      j2Expr
      JINJA_STMT_CLOSE
      htmlNode*
      JINJA_STMT_OPEN J2S_ENDCALL JINJA_STMT_CLOSE
    ;

j2Variable
    : JINJA_VAR_OPEN j2VarExpr JINJA_VAR_CLOSE
    ;

j2VarExpr
    : j2VarPipeExpr
    ;

j2VarPipeExpr
    : j2VarOrExpr (J2V_PIPE j2Filter)*
    ;

j2Filter
    : J2V_ID (J2V_LPAREN j2VarArgList? J2V_RPAREN)?
    ;

j2VarArgList
    : j2VarOrExpr (J2V_COMMA j2VarOrExpr)*
    ;

j2VarOrExpr
    : j2VarAndExpr (J2V_OR j2VarAndExpr)*
    ;

j2VarAndExpr
    : j2VarNotExpr (J2V_AND j2VarNotExpr)*
    ;

j2VarNotExpr
    : J2V_NOT j2VarNotExpr    # j2VarNotOp
    | j2VarCompareExpr         # j2VarComparePassThru
    ;

j2VarCompareExpr
    : j2VarAddExpr
      ( (J2V_EQ | J2V_NEQ | J2V_LT | J2V_GT | J2V_LTE | J2V_GTE
        | J2V_IN | J2V_IS)
        j2VarAddExpr
      )*
    ;

j2VarAddExpr
    : j2VarMulExpr ((J2V_PLUS | J2V_MINUS | J2V_TILDE) j2VarMulExpr)*
    ;

j2VarMulExpr
    : j2VarUnaryExpr
      ((J2V_STAR | J2V_SLASH | J2V_PERCENT | J2V_DSTAR) j2VarUnaryExpr)*
    ;

j2VarUnaryExpr
    : J2V_MINUS j2VarUnaryExpr    # j2VarNeg
    | J2V_PLUS  j2VarUnaryExpr    # j2VarPos
    | j2VarPostfixExpr             # j2VarPostfixPassThru
    ;

j2VarPostfixExpr
    : j2VarPrimary j2VarPostfixSuffix*
    ;

j2VarPostfixSuffix
    : J2V_DOT J2V_ID
    | J2V_LBRACKET j2VarOrExpr J2V_RBRACKET
    | J2V_LPAREN j2VarArgList? J2V_RPAREN
    ;

j2VarPrimary
    : J2V_ID                                                                   # j2VarId
    | J2V_INT                                                                  # j2VarInt
    | J2V_FLOAT                                                                # j2VarFloat
    | J2V_STRING                                                               # j2VarString
    | J2V_TRUE                                                                 # j2VarTrue
    | J2V_FALSE                                                                # j2VarFalse
    | J2V_NONE                                                                 # j2VarNone
    | J2V_LPAREN j2VarOrExpr J2V_RPAREN                                       # j2VarParen
    | J2V_LBRACKET (j2VarOrExpr (J2V_COMMA j2VarOrExpr)*)? J2V_RBRACKET      # j2VarList
    | J2V_LBRACE (j2VarDictPair (J2V_COMMA j2VarDictPair)*)? J2V_RBRACE      # j2VarDict
    ;

j2VarDictPair
    : j2VarOrExpr J2V_COLON j2VarOrExpr
    ;

j2Expr
    : j2PipeExpr
    ;

j2PipeExpr
    : j2OrExpr (J2S_PIPE j2StmtFilter)*
    ;

j2StmtFilter
    : J2S_ID (J2S_LPAREN j2ArgList? J2S_RPAREN)?
    ;

j2OrExpr
    : j2AndExpr (J2S_OR j2AndExpr)*
    ;

j2AndExpr
    : j2NotExpr (J2S_AND j2NotExpr)*
    ;

j2NotExpr
    : J2S_NOT j2NotExpr     # j2NotOp
    | j2CompareExpr          # j2ComparePassThru
    ;

j2CompareExpr
    : j2AddExpr
      ( (J2S_EQ | J2S_NEQ | J2S_LT | J2S_GT | J2S_LTE | J2S_GTE
        | J2S_IN | J2S_IS)
        j2AddExpr
      )*
    ;

j2AddExpr
    : j2MulExpr ((J2S_PLUS | J2S_MINUS | J2S_TILDE) j2MulExpr)*
    ;

j2MulExpr
    : j2UnaryExpr
      ((J2S_STAR | J2S_SLASH | J2S_PERCENT | J2S_DSTAR) j2UnaryExpr)*
    ;

j2UnaryExpr
    : J2S_MINUS j2UnaryExpr    # j2NegExpr
    | J2S_PLUS  j2UnaryExpr    # j2PosExpr
    | j2PostfixExpr             # j2PostfixPassThru
    ;

j2PostfixExpr
    : j2Primary j2PostfixSuffix*
    ;

j2PostfixSuffix
    : J2S_DOT J2S_ID
    | J2S_LBRACKET j2Expr J2S_RBRACKET
    | J2S_LPAREN j2ArgList? J2S_RPAREN
    ;

j2ArgList
    : j2Arg (J2S_COMMA j2Arg)*
    ;

j2Arg
    : (J2S_ID J2S_ASSIGN)? j2Expr
    ;

j2Primary
    : J2S_ID                                                                  # j2IdPrimary
    | J2S_INT                                                                 # j2IntPrimary
    | J2S_FLOAT                                                               # j2FloatPrimary
    | j2StringLiteral                                                         # j2StringPrimary
    | J2S_TRUE                                                                # j2TruePrimary
    | J2S_FALSE                                                               # j2FalsePrimary
    | J2S_NONE                                                                # j2NonePrimary
    | J2S_LPAREN j2Expr J2S_RPAREN                                           # j2ParenExpr
    | J2S_LBRACKET (j2Expr (J2S_COMMA j2Expr)*)? J2S_RBRACKET               # j2ListLiteral
    | J2S_LBRACE (j2DictPair (J2S_COMMA j2DictPair)*)? J2S_RBRACE           # j2DictLiteral
    ;

j2DictPair
    : j2Expr J2S_COLON j2Expr
    ;

j2StringLiteral
    : J2S_STRING
    ;