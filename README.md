# flask-compiler

A compiler for Flask projects (**Python + Jinja2 + HTML + CSS**) built with **Java 17**,
**Maven** and **ANTLR4**. It lexes and parses the four languages, builds **two AST trees**
(Python AST and Jinja AST, with HTML embedded as text in the Jinja AST), constructs symbol
tables, performs semantic analysis, transfers the Python data array into the Jinja tree, and
generates a runnable Flask product-management project.

## Compiler pipeline

```
Input (app.py, templates, html, css)
   |
   v  Lexer            (ANTLR4 lexers: Python / Jinja / HTML / CSS)
   v  Parser           (ANTLR4 parsers -> parse trees)
   v  AST              (Python AST + Jinja AST)
   v  Symbol Table     (scoped symbols for Python and Jinja)
   v  Semantic Analysis(5 checks + bonus, never stops on first error)
   v  Data Transfer    (Python arrays -> Jinja tree binding)
   v  Code Generation  (FlaskGenerator)
   |
   v
generated/  (runnable Flask project)
```

## Requirements
- JDK 17+ (developed/tested with JDK 21)
- Maven 3.8+
- Python 3 + Flask (only to *run the generated project*; not needed to build the compiler)

## Build
```bash
mvn clean compile
```
This runs the `antlr4-maven-plugin` (generates lexers/parsers from
`src/main/antlr4/com/flaskcompiler/grammar/`) and compiles the Java sources.

## Run the compiler
```bash
mvn exec:java
```
The pipeline parses `examples/input-project/`, prints each stage, and writes the generated
Flask project to `generated/`.

## Run the generated Flask app
```bash
cd generated
pip install -r requirements.txt
python app.py
```
Then open http://127.0.0.1:5000/

## Project layout
```
flask-compiler/
├── pom.xml
├── README.md
├── examples/
│   ├── input-project/            # compiler INPUT
│   │   ├── app.py                #   Python: products array + 4 routes
│   │   ├── templates/            #   Jinja2 + HTML templates
│   │   └── static/               #   sample.html, style.css
│   └── errors/                   # semantic-error test cases
├── generated/                    # compiler OUTPUT (runnable Flask app)
└── src/main/
    ├── antlr4/com/flaskcompiler/grammar/
    │   ├── PythonLexer.g4  PythonParser.g4
    │   ├── JinjaLexer.g4   JinjaParser.g4
    │   ├── HtmlLexer.g4    HtmlParser.g4
    │   └── CssLexer.g4     CssParser.g4
    └── java/com/flaskcompiler/
        ├── Main.java             # pipeline driver
        ├── ast/                  # Node, Visitor, AstPrinter; python/ and jinja/ nodes + builders
        ├── symbol/               # Symbol, Scope, SymbolTable, printer, collectors
        ├── semantic/             # SemanticError, SemanticAnalyzer
        ├── codegen/              # FlaskGenerator
        └── transfer/             # ContextModel, DataExtractor, JinjaContextBinder, BoundTemplate
```

## Languages supported (input grammars)
- **Python** (minimal Flask subset): imports, assignments, lists, dicts, function defs,
  `@app.route` decorators, `render_template`, return, calls, simple expressions.
- **Jinja2**: `{{ var }}`, `{{ obj.prop }}`, `{% for %}`, `{% if %}`, `{% extends %}`,
  `{% block %}`, with embedded HTML kept as text.
- **HTML** (standalone): tags, attributes, self-closing tags, nesting, text.
- **CSS** (standalone): element/`.class`/`#id` selectors, declarations, colors, dimensions.

## AST
Two trees rooted at `Node` (abstract: `nodeName`, `line`, `children`, `printNode()`,
`printChildren()`, `printTree()`, `accept(Visitor)`):
- **Python AST**: `ProgramNode, ImportNode, AssignmentNode, VariableNode, ListNode, DictNode,
  FunctionNode, RouteNode (extends FunctionNode), CallNode, ReturnNode, LiteralNode,
  PropertyAccessNode`.
- **Jinja AST**: `TemplateNode, BlockNode, ForNode, IfNode, ExpressionNode,
  VariableReferenceNode, HtmlContentNode`.

OOP requirements satisfied: inheritance (node families), polymorphism (`accept`), plus stored
node name and line number on every node.

## Semantic checks
1. Undefined variable (Python)
2. Duplicate route (Python)
3. Missing template (Python)
4. Undefined template variable (Jinja)
5. Loop over non-iterable (Jinja)
- Bonus: duplicate parameter, duplicate block

Run on `examples/errors/` each case reports its error in the format:
```
[Semantic Error]
line=8
node=render_template
message=Missing template: abc.html
```

## Generated interfaces
- `/` display products
- `/add` add product
- `/product/<id>` product details
- `/delete/<id>` delete product

All pages are reachable via navigation links.

## Notes
- Maven was installed locally to build; the ANTLR runtime is the only runtime dependency.
- The compiler only *generates* the Flask project; it never executes Flask or renders templates.
