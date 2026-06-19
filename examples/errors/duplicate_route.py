from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def home():
    return render_template("products.html")


@app.route("/")
def index():
    return render_template("products.html")
