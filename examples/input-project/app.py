from flask import Flask, render_template, request, redirect

app = Flask(__name__)

products = [
    {"id": 1, "name": "Laptop", "price": 1200, "description": "A fast laptop"},
    {"id": 2, "name": "Phone", "price": 800, "description": "A smart phone"},
    {"id": 3, "name": "Headphones", "price": 150, "description": "Noise cancelling"},
]


@app.route("/")
def display_products():
    return render_template("products.html", products=products)


@app.route("/add", methods=["GET", "POST"])
def add_product():
    return render_template("add_product.html")


@app.route("/product/<int:product_id>")
def product_details(product_id):
    product = products[product_id]
    return render_template("product_details.html", product=product)


@app.route("/delete/<int:product_id>")
def delete_product(product_id):
    product = products[product_id]
    return render_template("delete_product.html", product=product)
