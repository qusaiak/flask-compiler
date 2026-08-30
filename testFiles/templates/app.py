from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__, template_folder='.')

p1 = {"id": 1, "name": "Laptop", "price": 1200, "image": "https://via.placeholder.com/150", "details": "Powerful laptop for work and gaming."}
p2 = {"id": 2, "name": "Phone", "price": 800, "image": "https://via.placeholder.com/150", "details": "Latest smartphone with great camera."}
p3 = {"id": 3, "name": "Headphones", "price": 150, "image": "https://via.placeholder.com/150", "details": "Noise-cancelling wireless headphones."}

products = [p1, p2, p3]

def find_product(product_id):
    for p in products:
        if p["id"] == product_id:
            return p
    return None

def get_next_id():
    max_id = 0
    for p in products:
        if p["id"] > max_id:
            max_id = p["id"]
    return max_id + 1

def remove_product(product_id):
    filtered = []
    for p in products:
        if p["id"] != product_id:
            filtered.append(p)
    return filtered

@app.route('/')
def home():
    return redirect(url_for('show_products'))

@app.route('/products')
def show_products():
    return render_template('index.jinja', products=products)

@app.route('/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        new_id = get_next_id()
        name_val = request.form.get('name', '')
        price_val = request.form.get('price', 0)
        img_val = request.form.get('image', 'https://via.placeholder.com/150')
        det_val = request.form.get('details', '')
        new_product = {"id": new_id, "name": name_val, "price": price_val, "image": img_val, "details": det_val}
        products.append(new_product)
        return redirect(url_for('show_products'))
    return render_template('add_product.jinja')

@app.route('/edit/<int:product_id>', methods=['GET', 'POST'])
def edit_product(product_id):
    product = find_product(product_id)
    if product is None:
        return 'Product not found'
    if request.method == 'POST':
        product['name'] = request.form.get('name', product['name'])
        product['price'] = request.form.get('price', product['price'])
        product['image'] = request.form.get('image', product['image'])
        product['details'] = request.form.get('details', product['details'])
        return redirect(url_for('show_products'))
    return render_template('edit_product.jinja', product=product)

@app.route('/product')
def product_detail():
    product_id = request.args.get('id', type=int)
    product = find_product(product_id)
    return render_template('product_detail.html', product=product)

@app.route('/delete')
def delete_product():
    global products
    product_id = request.args.get('id', type=int)
    if product_id is not None:
        products = remove_product(product_id)
    return redirect(url_for('show_products'))

app.run(debug=True)
