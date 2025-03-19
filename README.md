# MULTITHREADED-CHAT-APPLICATION

# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MADAMSETTY SAI VENKAT AKSHAT

*INTERN ID*: CT08UFI

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# MULTITHREADED CHAT APPLICATION USING JAVA SOCKETS  

# OBJECTIVE  
The objective of this project is to develop a **multithreaded chat application** using **Java Sockets** that allows multiple clients to communicate with each other in real-time through a central server.  

Networking and multithreading in Java enable seamless communication between multiple users, making this project useful for collaborative messaging systems, real-time notifications, and distributed applications.  

# Requirements  
The application should implement the following functionalities:  

1️⃣ **Multithreaded Server**  

- The server should be capable of handling multiple clients simultaneously.  
- Each client should be assigned a separate thread for communication.  
- The server should broadcast messages to all connected clients.  

2️⃣ **Client Communication**  

- Clients should be able to connect to the server and exchange messages in real time.  
- Messages sent by one client should be received by all other connected clients.  
- The client should continuously listen for incoming messages while also allowing users to send messages.  

3️⃣ **User-Friendly Interface**  

- The program should have a simple command-line interface (CLI) for sending and receiving messages.  
- Error handling should be implemented to manage disconnections, network failures, and invalid inputs.  

4️⃣ **Scalability & Performance**  

- The system should efficiently handle multiple concurrent client connections.  
- Multithreading should be used to avoid blocking and ensure smooth performance.  

# Expected Deliverables  
To successfully complete this task, the following deliverables should be submitted:  

✔ A **functional Java program** implementing a multithreaded chat system.  

✔ Proper **documentation** and **comments** in the code to improve readability.  

✔ A **GitHub repository** containing the complete source code.  

✔ A well-structured **README file** that explains the program’s functionality, installation, and usage.  

# Technical Implementation  
The program utilizes Java’s built-in **java.net** and **java.io** packages, which provide various classes for handling networking and input/output operations efficiently:  

🔹 **ServerSocket** – Listens for incoming client connections.  

🔹 **Socket** – Establishes a connection between clients and the server.  

🔹 **PrintWriter** – Sends messages from the server to clients.  

🔹 **BufferedReader** – Reads incoming messages from clients.  

🔹 **Threads** – Ensures multiple clients can communicate concurrently.  

Additionally, **exception handling** is implemented to manage disconnections and I/O errors gracefully.  

# HOW TO RUN THE APPLICATION  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/chat-application.git
cd chat-application
```
