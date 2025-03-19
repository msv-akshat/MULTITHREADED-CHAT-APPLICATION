// Server Code
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static Set<PrintWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started on port 12345...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected.");
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                OutputStream output = socket.getOutputStream()
            ) {
                out = new PrintWriter(output, true);
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Received: " + message);
                    broadcast(message, out);  // Updated to prevent self-echo
                }
            } catch (IOException e) {
                System.out.println("Client disconnected.");
            } finally {
                synchronized (clientWriters) {
                    clientWriters.remove(out);
                }
            }
        }

        private void broadcast(String message, PrintWriter sender) {
            synchronized (clientWriters) {
                for (PrintWriter writer : clientWriters) {
                    if (writer != sender) {  // Skip sending back to the sender
                        writer.println(message);
                    }
                }
            }
        }
    }
}
