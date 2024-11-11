
import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {
        // Create the parent directory "JavaPgm"
        File javaPgmDirectory = new File("JavaPgm");
        
        // Create the parent directory if it doesn't exist
        if (!javaPgmDirectory.exists()) {
            if (javaPgmDirectory.mkdir()) {
                System.out.println("Directory 'JavaPgm' created successfully.");
            } else {
                System.out.println("Failed to create 'JavaPgm' directory.");
                return; // Exit if the directory creation fails
            }
        }

        // Create the subdirectories within "JavaPgm"
        String[] subdirectories = {"InheritancePgm", "AbstractionPgm", "PolymorphismPgm"};
        
        for (String subdir : subdirectories) {
            File subdirectory = new File(javaPgmDirectory, subdir);
            if (!subdirectory.exists()) {
                if (subdirectory.mkdir()) {
                    System.out.println("Subdirectory '" + subdir + "' created successfully.");
                } else {
                    System.out.println("Failed to create subdirectory '" + subdir + "'.");
                }
            }
        }

        // List the subdirectories of "JavaPgm"
        System.out.println("\nSubdirectories inside 'JavaPgm' directory:");
        File[] files = javaPgmDirectory.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("No subdirectories found.");
        }
    }
}
