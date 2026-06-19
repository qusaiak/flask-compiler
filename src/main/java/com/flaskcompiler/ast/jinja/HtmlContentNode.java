package com.flaskcompiler.ast.jinja;

/** Plain embedded HTML/text between Jinja tags. */
public class HtmlContentNode extends JinjaNode {
    public HtmlContentNode(String text, int line) {
        super("Html:\"" + clean(text) + "\"", line);
    }

    private static String clean(String text) {
        String t = text.replace("\r", "").replace("\n", "\\n").trim();
        return t.length() > 40 ? t.substring(0, 40) + "..." : t;
    }
}
