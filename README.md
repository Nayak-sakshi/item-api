# 🧾 Item API – Sample Java Backend Project

A simple **Java Spring Boot** backend application that implements a **RESTful API**
for managing a collection of items using **in-memory storage**.

---

## 🚀 Tech Stack

- **Java 17**
- **Spring Boot**
- **Maven**
- **In-memory storage** (`ArrayList`)

---

## ▶️ How to Run the Application

### 📋 Prerequisites

- Java **17+**
- Maven  
  *(or use Maven Wrapper)*

### 💻 Run Locally

```bash
./mvnw spring-boot:run
```
## 🔗 API Endpoints

Base URL:
http://localhost:8080
---

### ➕ Create Item

**POST** `/api/items`

Creates a new item.

#### Request Body

```json
{
  "name": "Laptop",
  "description": "Gaming laptop"
}
```
### Get All Items

**GET** `/api/items`

Returns a list of all items.

#### Response

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming laptop"
  }
]
```

### Get Item by ID

**GET** `/api/items/{id}`

Returns a single item by its ID.

Path Parameter
Parameter	Type	Description
id	Long	Item ID
Example Request
**GET** `/api/items/1`

#### Response
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
```


Responses
Status Code	Description
200 OK	Item found
404 Not Found	Item not found
#### Validation

- name field is required

- If name is missing or empty:

API returns 400 Bad Request