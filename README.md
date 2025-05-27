# Text Summarization Web App

A web-based application that summarizes long text into concise summaries using a Python-based Hugging Face transformer model served via Flask and integrated with a Spring Boot backend and a responsive HTML/CSS/JavaScript frontend.

---

## 🧠 Project Overview

- **Frontend:** HTML, CSS, JavaScript  
- **Backend (API Gateway):** Spring Boot (Java)  
- **AI Microservice:** Flask + Hugging Face Transformers (`t5-small`)  
- **Model Used:** `t5-small` from Hugging Face's Transformers library

---

## 🚀 How It Works

1. **User enters text** in the web UI (`index.html`).
2. **Java Spring Boot controller** receives the text and forwards it to the Python microservice.
3. **Flask server** uses Hugging Face's `t5-small` model to summarize the text.
4. **Summary is returned** and displayed in the web interface.

---

## 🔧 Setup Instructions
**on Terminal 1 for Flask:**

cd .\app

venv\Scripts\activate

pip install -r requirements.txt

python .\app.py

**on Terminal 2 for Springboot:**

.\mvnw spring-boot:run

Now go to http://localhost:8080/index.html for the application to use
