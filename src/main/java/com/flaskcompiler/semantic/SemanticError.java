package com.flaskcompiler.semantic;

/** A single semantic error with its location and offending node. */
public class SemanticError {

    private final String message;
    private final int line;
    private final String nodeName;

    public SemanticError(String message, int line, String nodeName) {
        this.message = message;
        this.line = line;
        this.nodeName = nodeName;
    }

    public String getMessage() { return message; }
    public int getLine() { return line; }
    public String getNodeName() { return nodeName; }

    @Override
    public String toString() {
        return "[Semantic Error]\n"
                + "line=" + line + "\n"
                + "node=" + nodeName + "\n"
                + "message=" + message;
    }
}
