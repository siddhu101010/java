

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) {
        // Define the byte array to write to the file
        byte[] byteArray = {11, 21, 3, 40, 5};
        
        // Path of the file where the bytes will be written
        String fileName = "example.dat";

        // Writing bytes to the file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(byteArray);
            System.out.println("Bytes written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading the content from the file using FileInputStream
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteRead;
            System.out.print("Content read from file: ");
            while ((byteRead = fis.read()) != -1) {
                System.out.print(byteRead + " ");
            }
            System.out.println();  // To move to the next line after printing all bytes
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

