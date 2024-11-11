package Twoone;

import java.io.*;
import java.net.*;

public class FactorialClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server.");

            // Setting up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            System.out.println("Enter numbers to calculate factorial (type 'bye' to end):");
            while (true) {
                System.out.print("Enter number: ");
                userInput = consoleInput.readLine();
                output.println(userInput);  // Send number to server

                // Exit if the user says "bye"
                if (userInput.equalsIgnoreCase("bye")) {
                    System.out.println("Ending connection.");
                    break;
                }

                // Read and display server's response
                String serverResponse = input.readLine();
                System.out.println("Server: " + serverResponse);
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

