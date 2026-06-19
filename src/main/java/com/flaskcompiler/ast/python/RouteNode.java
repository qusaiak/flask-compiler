package com.flaskcompiler.ast.python;

/** A function decorated with @app.route — a Route IS-A Function (inheritance). */
public class RouteNode extends FunctionNode {
    public RouteNode(String path, String signature, int line) {
        super(signature, line);
        this.nodeName = "Route[" + path + "]:" + signature;
    }
}
