package POE;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        // Create an InputStreamReader to read from standard input (keyboard)
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String userInput = "";
        
        System.out.println("Enter some text (type 'q' to quit):");

        try {
            // Continue reading input until the user types 'q'
            while (true) {
                userInput = reader.readLine();  // Read input line by line
                
                // Check if the user typed 'q' to exit
                if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("Exiting the program.");
                    break;  // Exit the loop if 'q' is typed
                }
                
                // Otherwise, print the input back to the user
                System.out.println("You typed: " + userInput);
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();  // Close the BufferedReader
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
