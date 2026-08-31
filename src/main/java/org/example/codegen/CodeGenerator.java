package org.example.codegen;

import org.example.ast.ASTNode;
import org.example.ast.css.CssDeclarationNode;
import org.example.ast.css.CssRuleNode;
import org.example.ast.html.HtmlAttributeNode;
import org.example.ast.html.HtmlElementNode;
import org.example.ast.jinja2.JinjaForNode;
import org.example.ast.jinja2.JinjaIfNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * مولّد HTML/CSS من شجرة AST.
 * يحافظ على attributes في HTML ويحوّل CssRule/CssDeclaration إلى CSS صالح.
 */
public class CodeGenerator {

    private static final Set<String> VOID_TAGS = Set.of(
            "area", "base", "br", "col", "embed", "hr", "img",
            "input", "link", "meta", "param", "source", "track", "wbr"
    );

    private final Map<String, Object> context;
    private final Map<String, String> blocks = new HashMap<>();
    private final StringBuilder bodyContent = new StringBuilder();
    private String extendsTemplate;

    public CodeGenerator(Map<String, Object> context) {
        this.context = context == null ? new HashMap<>() : context;
    }

    public void visit(ASTNode node) {
        if (node == null) {
            return;
        }

        switch (node.getNodeType()) {
            case "HtmlFile", "Template" -> {
                for (ASTNode child : node.getChildren()) {
                    visit(child);
                }
            }
            case "JinjaExtends" -> extendsTemplate = node.getChildren().isEmpty()
                    ? unquote(node.getValue())
                    : unquote(node.getChildren().get(0).getValue());
            case "JinjaBlock" -> {
                StringBuilder content = new StringBuilder();
                for (ASTNode child : node.getChildren()) {
                    content.append(renderNodeToString(child));
                }
                blocks.put(node.getValue(), content.toString().trim());
            }
            case "HtmlElement" -> {
                if (node instanceof HtmlElementNode element) {
                    bodyContent.append(renderHtmlElement(element));
                }
            }
            case "JinjaFor" -> {
                if (node instanceof JinjaForNode forNode) {
                    bodyContent.append(renderJinjaFor(forNode));
                }
            }
            case "JinjaIf", "JinjaElif", "JinjaElse" -> {
                if (node instanceof JinjaIfNode ifNode) {
                    bodyContent.append(renderJinjaIf(ifNode));
                }
            }
            case "HtmlText", "Text" -> bodyContent.append(node.getValue());
            default -> {
                for (ASTNode child : node.getChildren()) {
                    visit(child);
                }
            }
        }
    }

    private String renderHtmlElement(HtmlElementNode node) {
        String tagName = node.getTagName();
        if (tagName == null || tagName.isBlank()) {
            return "";
        }

        StringBuilder html = new StringBuilder("<").append(tagName);
        for (ASTNode attributeNode : node.getAttributes()) {
            if (attributeNode instanceof HtmlAttributeNode attribute) {
                html.append(renderAttribute(attribute));
            }
        }

        if (node.isSelfClosing() || isVoidTag(tagName)) {
            return html.append(" />").toString();
        }

        html.append(">");
        for (ASTNode child : node.getChildren()) {
            html.append(renderNodeToString(child));
        }
        html.append("</").append(tagName).append(">");
        return html.toString();
    }

    private String renderAttribute(HtmlAttributeNode attribute) {
        ASTNode valueNode = attribute.getAttrValue();
        if (valueNode == null) {
            return " " + attribute.getAttrName();
        }

        String value = unquote(renderNodeToString(valueNode).trim());
        value = renderInlineJinja(value);
        return value.isEmpty()
                ? " " + attribute.getAttrName()
                : " " + attribute.getAttrName() + "=\"" + value + "\"";
    }

    private String renderCssRule(CssRuleNode rule) {
        StringBuilder css = new StringBuilder();
        css.append(rule.getSelector()).append(" {\n");

        for (ASTNode child : rule.getChildren()) {
            if (child instanceof CssDeclarationNode declaration) {
                css.append("  ").append(renderCssDeclaration(declaration)).append("\n");
            }
        }

        css.append("}\n");
        return css.toString();
    }

    private String renderCssDeclaration(CssDeclarationNode declaration) {
        String value = declaration.getCssValue() == null
                ? ""
                : renderNodeToString(declaration.getCssValue()).trim();
        return declaration.getProperty() + ": " + value + ";";
    }

    /** ينفذ {% for product in products %} باستخدام القائمة الموجودة في context. */
    private String renderJinjaFor(JinjaForNode forNode) {
        if (forNode.getVariable() == null || forNode.getIterable() == null) {
            return "";
        }

        String variableName = forNode.getVariable().getValue().trim();
        String iterableExpression = forNode.getIterable().getValue().trim();
        Object source = resolveExpression(iterableExpression);
        if (!(source instanceof Iterable<?> iterable)) {
            return "";
        }

        boolean previousBindingExists = context.containsKey(variableName);
        Object previousBinding = context.get(variableName);
        StringBuilder output = new StringBuilder();

        for (Object item : iterable) {
            context.put(variableName, item);
            for (ASTNode child : forNode.getChildren()) {
                output.append(renderNodeToString(child));
            }
        }

        if (previousBindingExists) {
            context.put(variableName, previousBinding);
        } else {
            context.remove(variableName);
        }
        return output.toString();
    }

    private String renderNodeToString(ASTNode node) {
        if (node == null) {
            return "";
        }
        if (node instanceof HtmlElementNode element) {
            return renderHtmlElement(element);
        }
        if (node instanceof HtmlAttributeNode attribute) {
            return renderAttribute(attribute);
        }
        if (node instanceof CssRuleNode rule) {
            return renderCssRule(rule);
        }
        if (node instanceof CssDeclarationNode declaration) {
            return renderCssDeclaration(declaration);
        }
        if (node instanceof JinjaForNode forNode) {
            return renderJinjaFor(forNode);
        }
        if (node instanceof JinjaIfNode ifNode) {
            return renderJinjaIf(ifNode);
        }

        String type = node.getNodeType();
        String value = node.getValue() == null ? "" : node.getValue();
        if (type.equals("HtmlText") || type.equals("Text") || type.equals("Literal")) {
            return value;
        }
        if (type.equals("JinjaExpr")) {
            String expression = node.getChildren().isEmpty()
                    ? value
                    : node.getChildren().get(0).getValue().trim();
            Object evaluated = evaluateJinjaExpression(expression);
            return evaluated == null ? "{{ " + expression + " }}" : formatValue(evaluated);
        }

        StringBuilder result = new StringBuilder();
        for (ASTNode child : node.getChildren()) {
            result.append(renderNodeToString(child));
        }
        return result.toString();
    }

    private String renderJinjaIf(JinjaIfNode ifNode) {
        String type = ifNode.getNodeType();
        if ("JinjaElse".equals(type)) {
            return renderBranchChildren(ifNode);
        }

        if (evaluateCondition(ifNode.getCondition() == null ? "" : ifNode.getCondition().getValue())) {
            return renderBranchChildren(ifNode);
        }

        for (ASTNode child : ifNode.getChildren()) {
            if (child instanceof JinjaIfNode branch && child != ifNode.getCondition()) {
                if ("JinjaElif".equals(branch.getNodeType())) {
                    String condition = branch.getCondition() == null ? "" : branch.getCondition().getValue();
                    if (evaluateCondition(condition)) {
                        return renderBranchChildren(branch);
                    }
                } else if ("JinjaElse".equals(branch.getNodeType())) {
                    return renderBranchChildren(branch);
                }
            }
        }
        return "";
    }

    private String renderBranchChildren(JinjaIfNode branch) {
        StringBuilder output = new StringBuilder();
        for (ASTNode child : branch.getChildren()) {
            if (child == branch.getCondition()) {
                continue;
            }
            if (child instanceof JinjaIfNode) {
                continue;
            }
            output.append(renderNodeToString(child));
        }
        return output.toString();
    }

    private boolean evaluateCondition(String source) {
        String expression = source == null ? "" : source.trim();
        if (expression.isEmpty()) return false;
        if (expression.startsWith("not ")) return !evaluateCondition(expression.substring(4));
        if (expression.equalsIgnoreCase("true")) return true;
        if (expression.equalsIgnoreCase("false") || expression.equalsIgnoreCase("none")) return false;

        Object value = evaluateJinjaExpression(expression);
        if (value == null) return false;
        if (value instanceof Boolean bool) return bool;
        if (value instanceof Collection<?> collection) return !collection.isEmpty();
        if (value instanceof Map<?, ?> map) return !map.isEmpty();
        if (value instanceof String text) return !text.isBlank();
        if (value instanceof Number number) return number.doubleValue() != 0;
        return true;
    }

    private String renderInlineJinja(String text) {
        Pattern expression = Pattern.compile("\\{\\{\\s*([^}]+?)\\s*}}");
        Matcher matcher = expression.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String source = matcher.group(1).trim();
            Object evaluated = evaluateJinjaExpression(source);
            String replacement = evaluated == null ? matcher.group(0) : formatValue(evaluated);
            matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
        }
        matcher.appendTail(result);
        return result.toString();
    }

    private Object evaluateJinjaExpression(String expression) {
        List<String> parts = splitPipeline(expression);
        if (parts.isEmpty()) return null;

        Object value = resolveBaseValue(parts.get(0));
        for (int index = 1; index < parts.size(); index++) {
            value = applyFilter(value, parts.get(index));
        }
        return value;
    }

    private Object resolveBaseValue(String text) {
        String source = text.trim();
        if ((source.startsWith("\"") && source.endsWith("\"")) ||
                (source.startsWith("'") && source.endsWith("'"))) {
            return unquote(source);
        }
        if (source.matches("[-+]?\\d+")) return Integer.parseInt(source);
        if (source.matches("[-+]?\\d+\\.\\d+")) return Double.parseDouble(source);
        return resolveExpression(source);
    }

    private List<String> splitPipeline(String expression) {
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        int depth = 0;
        char quote = 0;
        for (char character : expression.toCharArray()) {
            if ((character == '\'' || character == '\"') && (quote == 0 || quote == character)) {
                quote = quote == 0 ? character : (char) 0;
            } else if (quote == 0 && character == '(') {
                depth++;
            } else if (quote == 0 && character == ')') {
                depth = Math.max(0, depth - 1);
            }
            if (quote == 0 && depth == 0 && character == '|') {
                parts.add(current.toString().trim());
                current.setLength(0);
            } else {
                current.append(character);
            }
        }
        parts.add(current.toString().trim());
        return parts;
    }

    private Object applyFilter(Object value, String specification) {
        Matcher matcher = Pattern.compile("^([A-Za-z_]\\w*)(?:\\((.*)\\))?$").matcher(specification.trim());
        if (!matcher.matches()) return value;

        String filter = matcher.group(1).toLowerCase(Locale.ROOT);
        List<String> args = parseFilterArguments(matcher.group(2));
        String text = value == null ? "" : String.valueOf(value);

        return switch (filter) {
            case "upper" -> text.toUpperCase(Locale.ROOT);
            case "lower" -> text.toLowerCase(Locale.ROOT);
            case "trim" -> text.trim();
            case "capitalize" -> text.isEmpty() ? text : text.substring(0, 1).toUpperCase(Locale.ROOT) + text.substring(1).toLowerCase(Locale.ROOT);
            case "title" -> titleCase(text);
            case "safe" -> text;
            case "striptags" -> text.replaceAll("<[^>]*>", "");
            case "length" -> lengthOf(value);
            case "first" -> firstOf(value);
            case "last" -> lastOf(value);
            case "default" -> isFalsy(value) && !args.isEmpty() ? args.get(0) : value;
            case "join" -> joinValues(value, args.isEmpty() ? "," : args.get(0));
            case "replace" -> args.size() >= 2 ? text.replace(args.get(0), args.get(1)) : text;
            case "truncate" -> truncate(text, args.isEmpty() ? 20 : Integer.parseInt(args.get(0)));
            default -> value;
        };
    }

    private List<String> parseFilterArguments(String rawArguments) {
        List<String> arguments = new ArrayList<>();
        if (rawArguments == null || rawArguments.isBlank()) return arguments;
        StringBuilder current = new StringBuilder();
        char quote = 0;
        for (char character : rawArguments.toCharArray()) {
            if ((character == '\'' || character == '\"') && (quote == 0 || quote == character)) {
                quote = quote == 0 ? character : (char) 0;
            }
            if (character == ',' && quote == 0) {
                arguments.add(unquote(current.toString().trim()));
                current.setLength(0);
            } else {
                current.append(character);
            }
        }
        arguments.add(unquote(current.toString().trim()));
        return arguments;
    }

    private int lengthOf(Object value) {
        if (value instanceof Collection<?> collection) return collection.size();
        if (value instanceof Map<?, ?> map) return map.size();
        return value == null ? 0 : String.valueOf(value).length();
    }

    private Object firstOf(Object value) {
        if (value instanceof List<?> list) return list.isEmpty() ? "" : list.get(0);
        return value == null || String.valueOf(value).isEmpty() ? "" : String.valueOf(value).substring(0, 1);
    }

    private Object lastOf(Object value) {
        if (value instanceof List<?> list) return list.isEmpty() ? "" : list.get(list.size() - 1);
        String text = value == null ? "" : String.valueOf(value);
        return text.isEmpty() ? "" : text.substring(text.length() - 1);
    }

    private String joinValues(Object value, String separator) {
        if (value instanceof Collection<?> collection) {
            return collection.stream().map(String::valueOf).collect(java.util.stream.Collectors.joining(separator));
        }
        return String.valueOf(value);
    }

    private boolean isFalsy(Object value) {
        return value == null || (value instanceof String text && text.isBlank()) ||
                (value instanceof Collection<?> collection && collection.isEmpty());
    }

    private String titleCase(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (result.length() > 0) result.append(' ');
                result.append(word.substring(0, 1).toUpperCase(Locale.ROOT));
                if (word.length() > 1) result.append(word.substring(1).toLowerCase(Locale.ROOT));
            }
        }
        return result.toString();
    }

    private String truncate(String text, int limit) {
        return text.length() <= limit ? text : text.substring(0, Math.max(0, limit)) + "...";
    }

    @SuppressWarnings("unchecked")
    private Object resolveExpression(String expression) {
        String normalized = expression.trim();
        if (context.containsKey(normalized)) {
            return context.get(normalized);
        }

        String[] parts = normalized.split("\\.");
        Object current = context.get(parts[0]);
        if (current == null) {
            return null;
        }
        for (int index = 1; index < parts.length; index++) {
            if (!(current instanceof Map<?, ?> map)) {
                return null;
            }
            current = ((Map<String, Object>) map).get(parts[index]);
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    private boolean isVoidTag(String tagName) {
        return VOID_TAGS.contains(tagName.toLowerCase(Locale.ROOT));
    }

    private String unquote(String value) {
        if (value == null) {
            return "";
        }
        String trimmed = value.trim();
        if (trimmed.length() >= 2 &&
                ((trimmed.startsWith("\"") && trimmed.endsWith("\"")) ||
                        (trimmed.startsWith("'") && trimmed.endsWith("'")))) {
            return trimmed.substring(1, trimmed.length() - 1);
        }
        return trimmed;
    }

    private String formatValue(Object value) {
        if (value instanceof Double number && number == Math.rint(number)) {
            return String.valueOf(number.longValue());
        }
        if (value instanceof Float number && number == Math.rint(number)) {
            return String.valueOf(number.longValue());
        }
        return String.valueOf(value);
    }

    public void generateStaticHtmlOutput(String fileName) {
        try {
            Path outputDir = Paths.get("output");
            Files.createDirectories(outputDir);
            Path outputPath = outputDir.resolve(fileName);

            StringBuilder finalHtml = new StringBuilder();
            finalHtml.append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            finalHtml.append("    <meta charset=\"UTF-8\">\n");
            finalHtml.append("    <title>")
                    .append(blocks.getOrDefault("title", "Generated Flask Page"))
                    .append("</title>\n");

            String styles = blocks.get("styles");
            if (styles != null && !styles.isBlank()) {
                String normalizedStyles = styles.trim();
                if (normalizedStyles.toLowerCase(Locale.ROOT).startsWith("<style")) {
                    finalHtml.append(normalizedStyles).append("\n");
                } else {
                    finalHtml.append("<style>\n")
                            .append(normalizedStyles)
                            .append("\n</style>\n");
                }
            }

            finalHtml.append("</head>\n<body>\n");
            if (blocks.containsKey("content")) {
                finalHtml.append(blocks.get("content"));
            } else {
                finalHtml.append(bodyContent);
            }
            finalHtml.append("\n</body>\n</html>\n");

            String normalizedHtml = finalHtml.toString()
                    .replaceAll("<textarea([^>]*)\\s*/>", "<textarea$1></textarea>");
            Files.writeString(outputPath, normalizedHtml);
            System.out.println("Static HTML successfully generated at: " + outputPath.toAbsolutePath());
        } catch (IOException exception) {
            System.err.println("Error generating static HTML file: " + exception.getMessage());
        }
    }
}
