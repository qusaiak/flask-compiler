import json
import os
from pathlib import Path
from flask import Flask, jsonify, redirect, render_template, request, url_for
from werkzeug.utils import secure_filename

APP_ROOT = Path(__file__).resolve().parent
app = Flask(
    __name__,
    template_folder=str(APP_ROOT / "templates"),
    static_folder=str(APP_ROOT / "static"),
)

# مجلد حفظ الصور المرفوعة
UPLOAD_FOLDER = APP_ROOT / "static" / "uploads"
UPLOAD_FOLDER.mkdir(parents=True, exist_ok=True)
app.config['UPLOAD_FOLDER'] = str(UPLOAD_FOLDER)

JSON_FILE = APP_ROOT / "products.json"

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
        return redirect(url_for("show_products"))

    return render_template("edit_product.html", product=product)

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
    return redirect(url_for("show_products"))

if __name__ == "__main__":
    app.run(debug=True)