# Flask–Jinja Compiler — Final Code Generation Project

## فكرة المشروع

هذا المشروع يطبق مترجمًا تعليميًا يجمع بين تحليل Python وFlask وتحليل قوالب Jinja/HTML، ثم يولد صفحات HTML ثابتة مع نسخ ملفات Flask وCSS وJavaScript كملفات داعمة.

## مسار المترجم

```text
app.py
→ Python Lexer / Parser
→ Python AST
→ Python Semantic Analysis
→ Context Data
→ Jinja/HTML Lexer / Parser
→ Jinja/HTML AST
→ Jinja Semantic Analysis
→ HTML Code Generation
```

يستخدم `SymbolTable` في التحليل الدلالي فقط، بينما تأتي بيانات التوليد من Context المستخرج من Python.

## التشغيل

يتطلب المشروع JDK 21 أو أحدث وMaven 3.8 أو أحدث. يمكن فتح المشروع في IntelliJ ثم تنفيذ `Build → Rebuild Project` وتشغيل `Main.java`.

يقرأ `Main` ملف `testFiles/app.py` ويعالج القوالب النهائية الأربعة:

```text
testFiles/templates/index.jinja
testFiles/templates/add_product.jinja
testFiles/templates/edit_product.jinja
testFiles/templates/product_detail.jinja
```

يبدأ كل تشغيل بمسح `output/`، ثم يعيد توليد الصفحات ونسخ ملفات الدعم.

## مخرجات التوليد

```text
output/index.html
output/add_product.html
output/edit_product.html
output/app.py
output/style.css
output/script.js
```

ويحفظ تقارير المترجم في:

```text
compiler_output/ast_python.json
compiler_output/ast_jinja.json
compiler_output/semantic_report.txt
compiler_output/generation_log.txt
```

## اختبار الأخطاء الدلالية

شغّل `SemanticTestRunner.java` من IntelliJ. يفحص ملفات الاختبار التالية دون تعديل `output/`:

```text
testFiles/semantic_python_errors.py
testFiles/semantic_html_errors.html
testFiles/semantic_css_errors.css
testFiles/templates/semantic_v3.html
```

ويغطي أخطاء Python وHTML وCSS وJinja، وقد كشف في آخر تشغيل 5 أخطاء Python و2 HTML و2 CSS و7 Jinja، ثم ينشئ:

```text
compiler_output/semantic_test_report.txt
```

## تشغيل تطبيق Flask

```text
cd testFiles
python runtime_app.py
```

ثم افتح:

```text
http://127.0.0.1:5000/
```

يحتوي التطبيق على عرض المنتجات وإضافة منتج وعرض التفاصيل وتعديل المنتج وحذفه. تحفظ البيانات في `testFiles/products.json`، وتحتاج ملفات HTML المولدة إلى إعادة تشغيل `Main` حتى تتزامن مع البيانات الجديدة.

## الاختبار الوظيفي

```text
python testFiles/test_runtime.py
```

## التسليم

يجب أن يحتوي الأرشيف على الكود المصدري، ملفات الإدخال والقوالب، `output/`، `compiler_output/`، `FINAL_REPORT.md`، `DELIVERY_REPORT.md`، و`TEAM_INFO.txt`. يجب تعبئة أسماء أعضاء المجموعة ورابط GitHub الحقيقي في `TEAM_INFO.txt` قبل الرفع.
