from flask import Flask, render_template

app = Flask(__name__)

@app.route('/semantic-missing')
def semantic_missing():
    return render_template('semantic_flask_missing.html')

if __name__ == '__main__':
    app.run()
