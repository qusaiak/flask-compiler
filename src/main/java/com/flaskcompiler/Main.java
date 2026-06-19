package com.flaskcompiler;

import com.flaskcompiler.ast.jinja.JinjaAstBuilder;
import com.flaskcompiler.ast.jinja.TemplateNode;
import com.flaskcompiler.ast.python.ProgramNode;
import com.flaskcompiler.ast.python.PythonAstBuilder;
import com.flaskcompiler.grammar.JinjaLexer;
import com.flaskcompiler.grammar.JinjaParser;
import com.flaskcompiler.grammar.PythonLexer;
import com.flaskcompiler.grammar.PythonParser;
import com.flaskcompiler.transfer.BoundTemplate;
import com.flaskcompiler.transfer.ContextModel;
import com.flaskcompiler.transfer.DataExtractor;
import com.flaskcompiler.transfer.JinjaContextBinder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Flask Compiler entry point.
 *
 * M1-M4: lexers/parsers. M5: ASTs. M6: symbol tables. M7: semantic analysis.
 * M8: Python -> Jinja data transfer (DataExtractor -> ContextModel -> JinjaContextBinder -> BoundTemplate).
 */
public final class Main {

    private Main() { }

    public static void main(String[] args) throws Exception {
        Path root = Paths.get("examples", "input-project");
        Path appPy = root.resolve("app.py");
        Path productsTpl = root.resolve("templates").resolve("products.html");

        ProgramNode program = new PythonAstBuilder().build(pythonParser(appPy).file_input());

        // ---- Extract data contexts from Python ----
        banner("M8 :: Data extraction (Python render_template calls)");
        List<ContextModel> models = new DataExtractor().extract(program);
        for (ContextModel m : models) {
            System.out.println();
            System.out.println(m.getRouteName() + "  ->  render_template(\"" + m.getTemplateName() + "\")");
            if (m.getVariables().isEmpty()) {
                System.out.println("  (no variables)");
            }
            m.getVariables().forEach((k, v) ->
                    System.out.println("  " + k + " -> " + BoundTemplate.describe(v)));
        }

        // ---- Bind the products array into products.html ----
        ContextModel productsModel = models.stream()
                .filter(m -> "products.html".equals(m.getTemplateName()))
                .findFirst()
                .orElseThrow();

        TemplateNode productsTemplate = new JinjaAstBuilder().build(jinjaParser(productsTpl).template());
        BoundTemplate bound = new JinjaContextBinder().bind(productsModel, productsTemplate);

        banner("M8 :: Transfer chain");
        System.out.println("app.py");
        System.out.println("  v");
        System.out.println("products = [ ... ]            (" + BoundTemplate.describe(productsModel.getVariables().get("products")) + ")");
        System.out.println("  v");
        System.out.println("render_template(\"products.html\", products=products)   [route: " + productsModel.getRouteName() + "]");
        System.out.println("  v");
        System.out.println("products.html");
        for (String node : bound.getBoundNodes()) {
            System.out.println("  v");
            System.out.println(node);
        }

        banner("M8 :: Binding");
        bound.printBinding(productsModel.getTemplateName());
    }

    private static PythonParser pythonParser(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        return new PythonParser(new CommonTokenStream(new PythonLexer(in)));
    }

    private static JinjaParser jinjaParser(Path file) throws Exception {
        CharStream in = CharStreams.fromPath(file);
        return new JinjaParser(new CommonTokenStream(new JinjaLexer(in)));
    }

    private static void banner(String title) {
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(title);
        System.out.println("=".repeat(60));
    }
}
