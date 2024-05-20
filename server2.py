from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route("/add", methods=["POST"])
def add():
    data = request.json
    a = data["a"]
    b = data["b"]
    result = a + b
    return jsonify({"result": result})

@app.route("/subtract", methods=["POST"])
def subtract():
    data = request.json
    a = data["a"]
    b = data["b"]
    result = a - b
    return jsonify({"result": result})

@app.route("/multiply", methods=["POST"])
def multiply():
    data = request.json
    a = data["a"]
    b = data["b"]
    result = a * b
    return jsonify({"result": result})

@app.route("/divide", methods=["POST"])
def divide():
    data = request.json
    a = data["a"]
    b = data["b"]
    result = a / b
    return jsonify({"result": result})

if __name__ == "__main__":
    app.run(debug=True)