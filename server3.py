from flask import Flask, request, jsonify

app = Flask(__name__)

USERNAME = "admin"
PASSWORD = "admin"

students = [
    {"id": 1, "name": "Nguyen Van A", "age": 20, "address": "Hanoi", "phone": "123456789", "email": "a@example.com", "class": "A1"},
    {"id": 2, "name": "Tran Thi B", "age": 21, "address": "Ho Chi Minh City", "phone": "987654321", "email": "b@example.com", "class": "A2"}
]

@app.route("/login", methods=["POST"])
def login():
    data = request.json
    username = data.get("username")
    password = data.get("password")
    if username == USERNAME and password == PASSWORD:
        return jsonify({"message": "Đăng nhập thành công"})
    else:
        return jsonify({"message": "Tài khoản hoặc mật khẩu không chính xác"}), 401

@app.route("/students", methods=["GET"])
def get_students():
    return jsonify(students)

if __name__ == "__main__":
    app.run(debug=True)