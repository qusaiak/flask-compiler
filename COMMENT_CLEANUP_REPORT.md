# Comment cleanup report

Reviewed all 182 tracked project files, including handwritten and generated Java,
ANTLR grammars, Python, templates, CSS, JavaScript, configuration, fixtures, and
documentation. Existing uncommitted changes were preserved; the cleanup was
compared against a snapshot taken before editing, not only against Git HEAD.

Changed 38 source/template files and added this report. Removed approximately
180 comment entries (182 net, counting decorative separator lines individually).
The changes remove redundant narration, repetitive AST accessor/mutator
documentation, development notes, filename labels, and excessive separators.

**Files modified by this cleanup**

| Directory | Files |
| --- | --- |
| Project root | `compiler.py` |
| `src/main/java/org/example/` | `Main.java` |
| `src/main/java/org/example/ast/` | `ASTNode.java`, `ASTVisitor.java` |
| `src/main/java/org/example/ast/python/` | `GeneratorNode.java`, `GlobalNode.java`, `IdentifierNode.java`, `IfNode.java`, `KeywordArgumentNode.java`, `LambdaNode.java`, `ListNode.java`, `LiteralNode.java`, `ModuleNode.java`, `NonlocalNode.java`, `PythonFileNode.java`, `RaiseNode.java`, `ReturnNode.java`, `SubscriptNode.java`, `TryNode.java`, `WhileNode.java`, `WithNode.java`, `YieldNode.java` |
| `src/main/java/org/example/codegen/` | `CodeGenerator.java` |
| `src/main/java/org/example/gen/` | `Fix generated files.py`, `FlaskLexer.g4` |
| `src/main/java/org/example/gen/python/` | `pythonLexer.g4` |
| `src/main/java/org/example/reporting/` | `CompilerReportWriter.java` |
| `src/main/java/org/example/semantic/` | `PythonSemanticAnalyzer.java`, `Symbol.java`, `SymbolTable.java` |
| `src/main/java/org/example/visitor/` | `ASTBuilder.java`, `PythonASTBuilder.java` |
| `testFiles/` | `product_detail.txt`, `products.txt`, `runtime_app.py` |
| `testFiles/templates/` | `AddProducts.html`, `product_detail.html`, `products.html` |

**Removed code and rewritten comments**

- Removed two commented visitor-method scaffolding examples from `ASTVisitor.java`:
  `visit(VarDeclNode node)` and `visit(IfNode node)`. No executable code was removed.
- Removed a misplaced style-wrapping Javadoc from `CodeGenerator.formatValue`,
  which formats numeric values rather than styles.
- Rewrote necessary explanations in concise English: indentation suppression,
  keyword precedence in the lexer, expired scopes and symbol usage, keyword
  argument bindings, collection-literal traversal, raw script-tag attributes,
  template failure handling, and the generated-source repair script's required
  working directory.
- Kept all Python docstrings, application logging, compiler diagnostics, runtime
  strings, and generated-output strings unchanged.

**Important documentation preserved**

- Chained-assignment AST mapping and unsupported comprehension structures.
- Scope lookup order, expired loop variables, reserved Flask/Jinja identifiers,
  and symbol retention for reporting.
- Lexer indentation edge cases, keyword ordering, grammar literals, and token rules.
- Static template context extraction, dynamic-value limitations, code-generation
  branch handling, and report lifecycle documentation.
- Useful short navigation comments in large visitors and grammars.

`PythonContextExtractor.java` was intentionally left unchanged because its
comments explain static evaluation, fallback behavior, and limitations. Semantic
fixtures (`semantic_test.html`, `semantic_v3.html`, and `test_template.html`) retain
their explanations of deliberate errors. Generated ANTLR Java files retain their
provenance, API documentation, and deprecation notices; none was edited by this
cleanup. Existing project reports, README, configuration documentation, the
numbered `test_add_products.txt` reference listing, and checked-in generated
outputs were also left intact. CSS and JavaScript had no redundant actual comments
to remove; color values, selectors, URLs, and MIME types were not treated as comments.

No TODO/FIXME markers remain in the scanned source, grammars, or fixtures; none
was removed simply for representing an unimplemented feature.

**Validation**

Tests ran in temporary project copies so application tests could not alter the
working project's product data or generated files.

| Check | Result |
| --- | --- |
| `mvn -o test` using the installed IntelliJ Maven distribution | BUILD SUCCESS; 88 Java sources compiled. Maven reports no JUnit test sources. |
| `javac -g:none -encoding UTF-8 -cp <ANTLR-runtime> ...` before and after cleanup | Passed; all 371 resulting class files are byte-identical. |
| `java -cp <classes-and-runtime> org.example.Main` before and after | Passed; exercises Python and Jinja lexing/parsing, AST construction, semantic analysis, and generation. |
| `java -cp <classes-and-runtime> org.example.SemanticTestRunner` before and after | Passed; same 16 expected errors: 5 Python, 2 HTML, 2 CSS, 7 Jinja. |
| `python testFiles/test_runtime.py` before and after | All 7 checks passed, including Flask initialization and product routes. |
| Python `compile()` validation of all 10 Python files | 9 valid files; the unchanged deliberate error fixture `semantic_python_errors.py` raises the same pre-existing `return outside function` error. |
| Before/after source comparison | Java tokens and grammar code unchanged; Python tokens, ASTs, and docstrings unchanged; edited template differences limited to comments and their lines. |
| Generated-output comparison | All 7 `output/` files identical; all 5 `compiler_output/` files identical after normalizing only generation-log timestamps and durations. |
| `git diff --check` and cleanup diff review | Passed; no unrelated code edits introduced by this cleanup. |

Initial sandbox attempts could not access Java dependency paths and Maven's cache.
The same validation succeeded outside the sandbox using existing local dependencies.
No application or compiler behavior was intentionally changed, and the direct
equivalence checks found no executable changes.
