

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        // Full path to the input file
        String inputFile = "D:\\Java\\input.txt";    // Source file
        String outputFile = "D:\\Java\\output.txt";  // Destination file

        // Create FileInputStream to read the input file
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteRead;
            // Read from input file and write to output file
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);  // Write byte to output file
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
