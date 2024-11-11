package TwoTwo;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server.");

            // Setting up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String userMessage;
            System.out.println("Enter messages (type 'bye' to end):");
            while (true) {
                System.out.print("You: ");
                userMessage = consoleInput.readLine();
                output.println(userMessage);  // Send message to server

                // Exit if the client says "bye"
                if (userMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Ending chat.");
                    break;
                }

                // Read and display server's response
                String serverMessage = input.readLine();
                System.out.println("Server: " + serverMessage);
            }

            // Close resources
            input.close();
            output.close();
            consoleInput.close();
            socket.close();
            System.out.println("Client connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

