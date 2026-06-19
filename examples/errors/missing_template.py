from flask import Flask, render_template

app = Flask(__name__)


@app.route("/report")
def report():
    return render_template("abc.html")
