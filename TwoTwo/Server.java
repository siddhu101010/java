package TwoTwo;


import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is listening on port 5000...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Setting up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String clientMessage;
            while ((clientMessage = input.readLine()) != null) {
                System.out.println("Client: " + clientMessage);

                // Exit if the client says "bye"
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client has ended the chat.");
                    output.println("bye");
                    break;
                }

                // Respond to the client
                String serverMessage = "Hello from Server!";
                output.println(serverMessage);
            }

            // Close resources
            input.close();
            output.close();
            socket.close();
            System.out.println("Server connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
