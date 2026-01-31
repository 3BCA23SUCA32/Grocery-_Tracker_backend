
---

# 📁 BACKEND – `README.md`

```md
# 🛒 Grocery Tracker – Backend (Spring Boot)

This is the backend part of the **Grocery Tracker CRUD Application**, developed using **Spring Boot**.  
It provides REST APIs to perform CRUD operations on grocery items and stores data in a database.

---

## 🚀 Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## ✨ Features
- Create grocery items
- Read all grocery items
- Update grocery items
- Delete grocery items
- RESTful API architecture

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/groceries` | Add new grocery item |
| GET | `/api/groceries` | Get all grocery items |
| PUT | `/api/groceries/{id}` | Update grocery item |
| DELETE | `/api/groceries/{id}` | Delete grocery item |

---

## ▶️ How to Run the Backend

1. Open the backend project in **IntelliJ IDEA**
2. Make sure Java & Maven are installed
3. Run the main class:
GroceryApplication.java

4. Backend will start at:


http://localhost:8080


---

## 🗄 Database
- **H2 Database** (in-memory)
- Automatically configured using Spring Boot
- No manual setup required

---

## 📂 Project Structure


src/main/java/com/example/grocerytracker/
├── controller/
├── service/
├── repository/
├── model/
└── GroceryApplication.java


---

## 🧠 Learning Outcome
- REST API development
- CRUD operations using Spring Data JPA
- Backend–frontend communication

---

## 👩‍💻 Developed By
**Varsha**
