# التقرير النهائي لمشروع المترجمات

## 1. فكرة المشروع

يطبق المشروع مترجمًا تعليميًا يربط بين Python وFlask من جهة، وقوالب Jinja2 وHTML وCSS من جهة أخرى. يقرأ المترجم ملف backend، يبني Python AST ويجري التحليل الدلالي، ثم يستخرج بيانات Context ويربطها بقوالب Jinja ويولد صفحات HTML ثابتة.

مسار العمل هو:

```text
app.py
→ Python Lexer
→ Python Parser
→ Python AST
→ Python Semantic Analysis
→ Context Data
→ Jinja/HTML Lexer and Parser
→ Jinja/HTML AST
→ Jinja Semantic Analysis
→ HTML Code Generation
```

ملفات CSS وJavaScript ملفات داعمة، وتحافظ عليها مرحلة التوليد وتنسخها إلى `output/` دون تحليل إضافي.

## 2. مكونات المترجم

يحتوي المشروع على قواعد ANTLR للغات Python وJinja/HTML/CSS، وVisitor لبناء الأشجار، وعقد AST تطبق مبادئ البرمجة الكائنية والوراثة وتعدد الأشكال. تحتوي العقد على اسم العقدة ورقم السطر والأبناء.

يتم بناء Python AST بواسطة `PythonASTBuilder`، وبناء Jinja/HTML AST بواسطة `ASTBuilder`. يطبع `Main` الشجرة كاملة أثناء التنفيذ، كما يحفظها في:

```text
compiler_output/ast_python.json
compiler_output/ast_jinja.json
```

## 3. جدول الرموز والتحليل الدلالي

يوجد `SymbolTable` لتسجيل المتغيرات والدوال ومتغيرات الحلقات وكتل Jinja، مع دعم النطاقات وطباعة الرموز. يستخدم جدول الرموز للتحليل الدلالي فقط، ولا يستخدم كمصدر لبيانات التوليد؛ بيانات التوليد تأتي من Context المستخرج من Python.

توجد اختبارات مستقلة للأخطاء في Python وHTML وCSS وJinja بواسطة `SemanticTestRunner.java`. يكشف الاختبار أخطاء مقصودة ويكتب النتيجة في:

```text
compiler_output/semantic_test_report.txt
```

## 4. التوليد النهائي

يعالج `Main` القوالب النهائية الأربعة:

```text
testFiles/templates/index.jinja
→ output/index.html

testFiles/templates/add_product.jinja
→ output/add_product.html

testFiles/templates/edit_product.jinja
→ output/edit_product.html

testFiles/templates/product_detail.jinja
→ output/product_detail.html
```

في بداية كل تشغيل يتم حذف محتوى `output/` القديم، ثم إعادة توليد الملفات ونسخ الملفات الداعمة. لذلك يجب أن يحتوي `output/` النهائي على:

```text
index.html
add_product.html
edit_product.html
product_detail.html
app.py
style.css
script.js
```

وتحتوي `compiler_output/` على:

```text
ast_python.json
ast_jinja.json
semantic_report.txt
generation_log.txt
```

وقد يوجد أيضًا `semantic_test_report.txt` كتقرير إضافي خاص باختبار الأخطاء الدلالية.

## 5. تطبيق Flask

يحتوي `runtime_app.py` على واجهات عرض المنتجات وإضافة منتج وعرض التفاصيل وتعديل المنتج وحذفه. تحفظ البيانات الدائمة في:

```text
testFiles/products.json
```

ويتم تحديث واجهة Flask بعد كل عملية. أما ملفات HTML المولدة في `output/` فتتحدث بعد إعادة تشغيل `Main`، تطبيقًا لمبدأ إعادة التوليد عند تغيير البيانات.

## 6. الاختبارات المنفذة

نجحت اختبارات Flask للمسارات التالية:

```text
GET /products
GET /add
GET /product?id=1
GET /edit/1
POST /edit/1
POST /add
GET /delete?id=3
```

كما نجح تشغيل `Main` دون أخطاء Parser للقوالب النهائية، ونجح تنظيف `output/` وإعادة إنشاء الصفحات الأربعة وملفات الدعم المطلوبة.

نجح `SemanticTestRunner` في اكتشاف:

```text
5 أخطاء Python
2 أخطاء HTML
2 أخطاء CSS
7 أخطاء Jinja
المجموع: 16 خطأ دلاليًا
```

ولا يغيّر هذا الاختبار محتوى `output/`.

## 7. طريقة العرض في المقابلة

لتوضيح التوليد، يتم تشغيل `Main.main()` ثم عرض شجرة AST وجدول الرموز ورسائل Context، وبعدها فتح `output/index.html`.

لتوضيح الأخطاء الدلالية، يتم تشغيل `SemanticTestRunner.main()` وعرض الأخطاء الأربعة الأنواع والتقرير الناتج.

لتوضيح تطبيق Flask، يتم تشغيل:

```text
cd testFiles
python runtime_app.py
```

ثم فتح:

```text
http://127.0.0.1:5000/
```

## 8. متطلبات التسليم المتبقية

يجب قبل رفع الأرشيف تعبئة `TEAM_INFO.txt` بأسماء أعضاء المجموعة ورابط مستودع GitHub الحقيقي. كما يجب التأكد من أن الأرشيف المضغوط الذي سيتم رفعه هو الأرشيف الذي يحتوي آخر نسخة من جميع الملفات، وليس أرشيفًا قديمًا.
