package com.flaskcompiler.ast.python;

/** Root of the Python AST. */
public class ProgramNode extends PythonNode {
    public ProgramNode(int line) {
        super("Program", line);
    }
}
