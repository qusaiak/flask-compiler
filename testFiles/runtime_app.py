import json

import os
import shutil
import subprocess
import threading
import time
from pathlib import Path
from flask import Flask, jsonify, redirect, render_template, request, url_for
from werkzeug.utils import secure_filename

APP_ROOT = Path(__file__).resolve().parent
app = Flask(
    __name__,
    template_folder=str(APP_ROOT / "templates"),
    static_folder=str(APP_ROOT / "static"),
)

UPLOAD_FOLDER = APP_ROOT / "static" / "uploads"
UPLOAD_FOLDER.mkdir(parents=True, exist_ok=True)
app.config['UPLOAD_FOLDER'] = str(UPLOAD_FOLDER)

JSON_FILE = APP_ROOT / "products.json"
PROJECT_ROOT = APP_ROOT.parent

_json_signature = None
_regeneration_lock = threading.Lock()


def get_json_signature():
    try:
        stat = JSON_FILE.stat()
        return stat.st_mtime_ns, stat.st_size
    except FileNotFoundError:
        return None


def remember_json_signature():
    global _json_signature
    _json_signature = get_json_signature()


def watch_products_json():
    global _json_signature
    remember_json_signature()
    while True:
        time.sleep(0.75)
        current_signature = get_json_signature()
        if current_signature is None or current_signature == _json_signature:
            continue

        _json_signature = current_signature
        app.logger.info("Detected manual change in products.json; regenerating static HTML...")
        regenerate_static_pages()


def regenerate_static_pages():

    java = shutil.which("java")
    classes_dir = PROJECT_ROOT / "target" / "classes"
    if java is None:
        app.logger.warning("Java was not found; static HTML was not regenerated.")
        return False
    if not classes_dir.is_dir():
        app.logger.warning(
            "Compiled Java classes were not found at %s; run mvn package first.",
            classes_dir,
        )
        return False

    try:
        classpath_entries = [str(classes_dir)]
        m2_repository = Path.home() / ".m2" / "repository"
        if m2_repository.is_dir():
            classpath_entries.extend(
                str(jar) for jar in m2_repository.rglob("*.jar")
            )

        subprocess.run(
            [
                java,
                "-cp",
                os.pathsep.join(classpath_entries),
                "org.example.Main",
                "--regenerate",
                "--data",
                str(JSON_FILE.relative_to(PROJECT_ROOT)),

            ],
            cwd=str(PROJECT_ROOT),
            check=True,
            capture_output=True,
            text=True,
        )
        app.logger.info("Static HTML regenerated after products.json changed.")
        return True
    except (OSError, subprocess.CalledProcessError) as error:
        app.logger.exception("Automatic static generation failed: %s", error)
        return False

@app.after_request
def disable_browser_cache(response):
    """إجبار المتصفح على قراءة آخر بيانات عند كل Refresh."""
    response.headers["Cache-Control"] = "no-store, no-cache, must-revalidate, max-age=0"
    response.headers["Pragma"] = "no-cache"
    response.headers["Expires"] = "0"
    return response

def load_products():
    """تحميل المنتجات من ملف JSON مع إعادة ترقيم الـ IDs تلقائياً لتكون متسلسلة بدون فجوات."""
    products = []
    if JSON_FILE.exists():
        try:
            with open(JSON_FILE, "r", encoding="utf-8") as f:
                products = json.load(f)
        except json.JSONDecodeError:
            pass

    if not products:
        # القائمة الافتراضية في حال عدم وجود الملف
        products = [
            {
                "id": 1,
                "name": "Laptop",
                "price": 1200,
                "image": "laptop.jpg",
                "details": "Laptop details",
            },
            {
                "id": 2,
                "name": "Headphones",
                "price": 150,
                "image": "headphone.jpg",
                "details": "Headphones details",
            },
        ]

    # إعادة ترقيم الـ IDs تصاعدياً (1, 2, 3, ...) لضمان عدم وجود فجوات
    for index, product in enumerate(products, start=1):
        product["id"] = index

    return products

def save_products(products_list):
    """إعادة ترقيم المنتجات قبل حفظها لضمان بقاء الـ IDs متسلسلة، ثم الحفظ في الملف."""
    for index, product in enumerate(products_list, start=1):
        product["id"] = index

    with open(JSON_FILE, "w", encoding="utf-8") as f:
        json.dump(products_list, f, ensure_ascii=False, indent=4)

    # تسجيل البصمة حتى لا يعيد الـWatcher توليد الصفحة مرة ثانية لنفس عملية الحفظ.
    remember_json_signature()

def next_product_id() -> int:
    """تحديد الـ ID للمنتج الجديد بناءً على العدد الحالي + 1."""
    products = load_products()
    return len(products) + 1

def find_product(product_id):
    """البحث عن منتج بالمعرّف مع إعادة None عند عدم وجوده."""
    return next((product for product in load_products() if product["id"] == product_id), None)

@app.route("/")
def home():
    return redirect(url_for("show_products"))

@app.route("/products")
def show_products():
    products = load_products()
    return render_template("products.html", products=products)

@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        name = request.form.get("name", "").strip()
        details = request.form.get("details", "").strip()

        # معالجة رفع الصورة من الجهاز
        image_filename = "default.jpg"
        if 'image_file' in request.files:
            file = request.files['image_file']
            if file and file.filename != '':
                filename = secure_filename(file.filename)
                file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
                image_filename = f"uploads/{filename}"

        try:
            price = float(request.form.get("price", "0"))
        except ValueError:
            price = 0.0

        if name:
            products = load_products()
            products.append(
                {
                    "id": next_product_id(),
                    "name": name,
                    "price": price,
                    "image": image_filename,
                    "details": details,
                }
            )
            save_products(products)
            regenerate_static_pages()
        return redirect(url_for("show_products"))

    return render_template("AddProducts.html")

# مسار تعديل المنتج
@app.route("/edit/<int:product_id>", methods=["GET", "POST"])
def edit_product(product_id):
    products = load_products()
    product = next((p for p in products if p["id"] == product_id), None)

    if not product:
        return "Product not found", 404

    if request.method == "POST":
        product["name"] = request.form.get("name", "").strip()
        product["details"] = request.form.get("details", "").strip()

        try:
            product["price"] = float(request.form.get("price", "0"))
        except ValueError:
            pass

        # إذا تم اختيار صورة جديدة أثناء التعديل
        if 'image_file' in request.files:
            file = request.files['image_file']
            if file and file.filename != '':
                filename = secure_filename(file.filename)
                file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
                product["image"] = f"uploads/{filename}"

        save_products(products)
        regenerate_static_pages()
        return redirect(url_for("show_products"))

    return render_template("edit_product.html", product=product)

@app.route("/api/products", methods=["GET", "POST"])
def products_api():
    """واجهة JSON لعمليات AJAX على المنتجات."""
    if request.method == "GET":
        return jsonify(load_products())

    payload = request.get_json(silent=True) or request.form
    name = str(payload.get("name", "")).strip()
    if not name:
        return jsonify({"error": "name is required"}), 400

    try:
        price = float(payload.get("price", 0))
    except (TypeError, ValueError):
        price = 0.0

    products = load_products()
    product = {
        "id": len(products) + 1,
        "name": name,
        "price": price,
        "image": str(payload.get("image", "default.jpg")),
        "details": str(payload.get("details", "")),
    }
    products.append(product)
    save_products(products)
    regenerate_static_pages()
    return jsonify({"product": product, "products": load_products()}), 201


@app.route("/api/products/<int:product_id>", methods=["PUT", "PATCH", "DELETE"])
def product_api(product_id):
    """تعديل أو حذف منتج عبر AJAX مع حفظ JSON وإعادة التوليد."""
    products = load_products()
    product = next((item for item in products if item["id"] == product_id), None)
    if product is None:
        return jsonify({"error": "Product not found"}), 404

    if request.method == "DELETE":
        products = [item for item in products if item["id"] != product_id]
        save_products(products)
        regenerate_static_pages()
        return jsonify({"products": load_products()})

    payload = request.get_json(silent=True) or request.form
    if "name" in payload:
        product["name"] = str(payload.get("name", "")).strip()
    if "details" in payload:
        product["details"] = str(payload.get("details", "")).strip()
    if "image" in payload:
        product["image"] = str(payload.get("image", "default.jpg"))
    if "price" in payload:
        try:
            product["price"] = float(payload.get("price", 0))
        except (TypeError, ValueError):
            return jsonify({"error": "price must be a number"}), 400

    save_products(products)
    regenerate_static_pages()
    return jsonify({"product": product, "products": load_products()})


@app.route("/product")
def product_detail():
    product_id = request.args.get("id", type=int)
    return render_template("product_detail.html", product=find_product(product_id))

@app.route("/delete")
def delete_product():
    product_id = request.args.get("id", type=int)
    if product_id is not None:
        products = load_products()
        updated_products = [product for product in products if product["id"] != product_id]
        save_products(updated_products)
        regenerate_static_pages()
    return redirect(url_for("show_products"))

if __name__ == "__main__":
    # تشغيل مراقب واحد فقط؛ use_reloader=False يمنع إنشاء مراقبين بسبب Flask Debug.
    watcher = threading.Thread(target=watch_products_json, daemon=True)
    watcher.start()
    app.run(debug=True, use_reloader=False)