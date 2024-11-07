package POE.Twoone;

import java.io.*;
import java.net.*;

public class FactorialServer {
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
                System.out.println("Received number from client: " + clientMessage);

                try {
                    int number = Integer.parseInt(clientMessage);
                    long factorial = calculateFactorial(number);
                    output.println("Factorial of " + number + " is " + factorial);
                } catch (NumberFormatException e) {
                    output.println("Invalid input. Please send a valid integer.");
                }

                // Exit if the client sends "bye"
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client has ended the chat.");
                    break;
                }
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

    // Method to calculate factorial of a number
    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
