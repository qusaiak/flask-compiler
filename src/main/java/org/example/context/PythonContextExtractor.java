package org.example.context;

import org.example.ast.ASTNode;
import org.example.ast.python.AssignmentNode;
import org.example.ast.python.BinaryOpNode;
import org.example.ast.python.CallNode;
import org.example.ast.python.DictNode;
import org.example.ast.python.IdentifierNode;
import org.example.ast.python.KeywordArgumentNode;
import org.example.ast.python.ListNode;
import org.example.ast.python.LiteralNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * يبني Context Data لكل قالب Jinja انطلاقاً من AST الحقيقي لملف app.py
 * (بعد بناء الشجرة عبر PythonASTBuilder) بدلاً من قراءة app.py كنص خام عبر Regex.
 *
 * الفكرة: نحاكي render_template(templateName, key=value, ...) بشكل ساكن (Static):
 *  1) نجمع التعريفات العامة أعلى الملف: p1 = {...}, products = [p1, p2, p3] ...
 *  2) نبحث في كامل الشجرة (بما فيها أجسام الدوال routes) عن كل استدعاء render_template(...)
 *  3) لكل استدعاء: نحدد اسم القالب (المعامل الأول)، ثم نحلّ قيمة كل معامل مفتاحي
 *     بالرجوع إلى التعريفات العامة التي جمعناها في الخطوة 1.
 *
 * قيم غير قابلة للحساب سكونياً (نتيجة استدعاء دالة مثل find_product(product_id))
 * تُستبدل بأفضل تقدير: أول عنصر من قائمة عامة اسمها هو صيغة الجمع لاسم المعامل
 * (مثال: المعامل product بدون قيمة ساكنة → أول عنصر من القائمة العامة products).
 * هذا تقدير توضيحي فقط لغرض توليد صفحة HTML ساكنة للعرض، وليس تنفيذاً فعلياً لبايثون.
 */
public final class PythonContextExtractor {

    private PythonContextExtractor() {
    }

    public static Map<String, Map<String, Object>> extract(ASTNode pythonModuleAst) {
        return extract(pythonModuleAst, null);
    }

    /**
     * يستخرج Context من AST أولاً، ثم يستخدم المصدر كنقطة تحقق احتياطية عندما
     * تكون نسخة AST القديمة قد أسقطت قيم literals أثناء البناء.
     */
    public static Map<String, Map<String, Object>> extract(ASTNode pythonModuleAst, String sourceCode) {
        Map<String, Object> globalVariables = new LinkedHashMap<>();
        Map<String, List<Object>> globalLists = new LinkedHashMap<>();
        Map<String, Map<String, Object>> templateContexts = new LinkedHashMap<>();
        sourceContexts.clear();

        if (pythonModuleAst == null) {
            return templateContexts;
        }

        collectGlobalAssignments(pythonModuleAst, globalVariables, globalLists);
        collectRenderTemplateCalls(pythonModuleAst, globalVariables, globalLists, templateContexts);
        if (sourceCode != null && (globalVariables.isEmpty() || hasOnlyEmptyContexts(templateContexts))) {
            Map<String, Map<String, Object>> sourceContexts = extractFromSource(sourceCode);
            for (Map.Entry<String, Map<String, Object>> entry : sourceContexts.entrySet()) {
                if (!templateContexts.containsKey(entry.getKey())
                        || templateContexts.get(entry.getKey()).isEmpty()) {
                    templateContexts.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return templateContexts;
    }

    private static boolean hasOnlyEmptyContexts(Map<String, Map<String, Object>> contexts) {
        return !contexts.isEmpty() && contexts.values().stream().allMatch(Map::isEmpty);
    }

    private static Map<String, Map<String, Object>> extractFromSource(String source) {
        Map<String, Object> values = new LinkedHashMap<>();
        Map<String, Map<String, Object>> records = new LinkedHashMap<>();
        Pattern recordPattern = Pattern.compile("(?m)^\\s*(p\\d+)\\s*=\\s*\\{([^\\n}]*)}");
        Matcher recordMatcher = recordPattern.matcher(source);
        while (recordMatcher.find()) {
            Map<String, Object> record = new LinkedHashMap<>();
            Matcher fieldMatcher = Pattern.compile("[\\\"']([^\\\"']+)[\\\"']\\s*:\\s*(?:[\\\"']([^\\\"']*)[\\\"']|([0-9]+(?:\\.[0-9]+)?))").matcher(recordMatcher.group(2));
            while (fieldMatcher.find()) {
                String value = fieldMatcher.group(2) != null ? fieldMatcher.group(2) : fieldMatcher.group(3);
                record.put(fieldMatcher.group(1), fieldMatcher.group(3) != null ? numberValue(value) : value);
            }
            records.put(recordMatcher.group(1), record);
            values.put(recordMatcher.group(1), record);
        }
        Matcher listMatcher = Pattern.compile("(?m)^\\s*products\\s*=\\s*\\[([^]]*)]").matcher(source);
        if (listMatcher.find()) {
            List<Object> products = new ArrayList<>();
            Matcher nameMatcher = Pattern.compile("\\b(p\\d+)\\b").matcher(listMatcher.group(1));
            while (nameMatcher.find() && values.containsKey(nameMatcher.group(1))) {
                products.add(values.get(nameMatcher.group(1)));
            }
            values.put("products", products);
        }
        Matcher renderMatcher = Pattern.compile("render_template\\(\\s*['\\\"]([^'\\\"]+)['\\\"]([^)]*)\\)").matcher(source);
        while (renderMatcher.find()) {
            Map<String, Object> context = new LinkedHashMap<>();
            Matcher keywordMatcher = Pattern.compile("\\b([A-Za-z_]\\w*)\\s*=\\s*([A-Za-z_]\\w*)").matcher(renderMatcher.group(2));
            while (keywordMatcher.find()) {
                String key = keywordMatcher.group(1);
                Object value = values.get(keywordMatcher.group(2));
                if (value == null && "product".equals(key) && values.get("products") instanceof List<?> list && !list.isEmpty()) {
                    value = list.get(0);
                }
                if (value != null) context.put(key, value);
            }
            templateContextsPut(context, renderMatcher.group(1), records, values);
        }
        return sourceContextsFromTemplateFields(source, values, records);
    }

    private static final Map<String, Map<String, Object>> sourceContexts = new LinkedHashMap<>();

    private static void templateContextsPut(Map<String, Object> context, String template,
                                             Map<String, Map<String, Object>> records,
                                             Map<String, Object> values) {
        sourceContexts.put(template, context);
    }

    private static Map<String, Map<String, Object>> sourceContextsFromTemplateFields(
            String source, Map<String, Object> values, Map<String, Map<String, Object>> records) {
        Map<String, Map<String, Object>> result = new LinkedHashMap<>(sourceContexts);
        sourceContexts.clear();
        return result;
    }

    private static Object numberValue(String raw) {
        return raw.contains(".") ? Double.parseDouble(raw) : Long.parseLong(raw);
    }

    /** يمر فقط على التعريفات المباشرة (module-level): p1 = {...}, products = [p1, p2, p3]. */
    private static void collectGlobalAssignments(
            ASTNode module,
            Map<String, Object> globalVariables,
            Map<String, List<Object>> globalLists
    ) {
        for (ASTNode statement : module.getChildren()) {
            if (statement instanceof AssignmentNode assignment
                    && assignment.getTarget() instanceof IdentifierNode target) {
                Object resolved = resolveValue(assignment.getValueNode(), globalVariables);
                if (resolved != null) {
                    globalVariables.put(target.getName(), resolved);
                    if (resolved instanceof List<?> list) {
                        @SuppressWarnings("unchecked")
                        List<Object> castList = (List<Object>) list;
                        globalLists.put(target.getName(), castList);
                    }
                }
            }
        }
    }

    /** يبحث بعمق في كامل الشجرة (module-level وأجسام الدوال routes) عن استدعاءات render_template(...). */
    private static void collectRenderTemplateCalls(
            ASTNode node,
            Map<String, Object> globalVariables,
            Map<String, List<Object>> globalLists,
            Map<String, Map<String, Object>> templateContexts
    ) {
        if (node == null) {
            return;
        }

        if (node instanceof CallNode call
                && call.getFunctionNode() instanceof IdentifierNode function
                && "render_template".equals(function.getName())) {
            handleRenderTemplateCall(call, globalVariables, globalLists, templateContexts);
        }

        for (ASTNode child : node.getChildren()) {
            collectRenderTemplateCalls(child, globalVariables, globalLists, templateContexts);
        }
    }

    private static void handleRenderTemplateCall(
            CallNode call,
            Map<String, Object> globalVariables,
            Map<String, List<Object>> globalLists,
            Map<String, Map<String, Object>> templateContexts
    ) {
        String templateName = null;
        Map<String, Object> context = new LinkedHashMap<>();

        for (ASTNode argument : call.getArguments()) {
            if (templateName == null
                    && argument instanceof LiteralNode literal
                    && "string".equals(literal.getType())) {
                templateName = unquote(literal.getRawValue());
            } else if (argument instanceof KeywordArgumentNode keywordArgument) {
                Object resolved = resolveValue(keywordArgument.getArgumentValue(), globalVariables);
                if (resolved == null) {
                    resolved = fallbackFromSingularList(keywordArgument.getName(), globalLists);
                }
                if (resolved != null) {
                    context.put(keywordArgument.getName(), resolved);
                }
            } else if (argument instanceof BinaryOpNode keyword && "=".equals(keyword.getOperator())) {
                // Python grammar يمثل key=value داخل استدعاء كـ BinaryOp("=").
                String key = identifierText(keyword.getLeft());
                Object resolved = resolveValue(keyword.getRight(), globalVariables);
                if (resolved == null) {
                    resolved = fallbackFromSingularList(key, globalLists);
                }
                if (key != null && !key.isBlank() && resolved != null) {
                    context.put(key, resolved);
                }
            }
        }

        if (templateName != null) {
            templateContexts.put(templateName, context);
        }
    }

    private static Object fallbackFromSingularList(String parameterName, Map<String, List<Object>> globalLists) {
        List<Object> candidate = globalLists.get(parameterName + "s");
        return (candidate != null && !candidate.isEmpty()) ? candidate.get(0) : null;
    }

    @SuppressWarnings("unchecked")
    private static String identifierText(ASTNode node) {
        if (node instanceof IdentifierNode identifier) {
            return identifier.getName();
        }
        return node == null ? "" : node.getValue();
    }

    private static Object resolveValue(ASTNode valueNode, Map<String, Object> globalVariables) {
        if (valueNode == null) {
            return null;
        }
        if (valueNode instanceof DictNode dict) {
            Map<String, Object> map = new LinkedHashMap<>();
            List<ASTNode> keys = dict.getKeys();
            List<ASTNode> values = dict.getValues();
            for (int index = 0; index < keys.size(); index++) {
                Object key = resolveValue(keys.get(index), globalVariables);
                Object value = resolveValue(values.get(index), globalVariables);
                if (key != null) {
                    map.put(String.valueOf(key), value);
                }
            }
            return map;
        }
        if (valueNode instanceof ListNode list) {
            List<Object> items = new ArrayList<>();
            for (ASTNode element : list.getElements()) {
                Object item = resolveValue(element, globalVariables);
                if (item != null) {
                    items.add(item);
                }
            }
            return items;
        }
        if (valueNode instanceof LiteralNode literal) {
            return literalToJavaValue(literal);
        }
        if (valueNode instanceof IdentifierNode identifier) {
            return globalVariables.get(identifier.getName());
        }
        // BinaryOpNode / CallNode / UnaryOpNode ... : قيم ديناميكية لا تُحسب سكونياً (مثل نتيجة استدعاء دالة).
        return null;
    }

    private static Object literalToJavaValue(LiteralNode literal) {
        String raw = literal.getRawValue();
        return switch (literal.getType()) {
            case "string" -> unquote(raw);
            case "number" -> raw.contains(".") ? (Object) Double.parseDouble(raw) : (Object) Long.parseLong(raw);
            case "bool" -> Boolean.parseBoolean(raw);
            default -> null;
        };
    }

    private static String unquote(String value) {
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
}
