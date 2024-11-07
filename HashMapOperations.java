package POE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, String> items = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter item value: ");
                    String value = scanner.nextLine();
                    
                    if (items.containsKey(key)) {
                        System.out.println("Item with key '" + key + "' already exists. Updating value.");
                    } else {
                        System.out.println("Adding new item.");
                    }
                    items.put(key, value);
                    System.out.println("Item added/updated successfully.");
                    break;

                case 2:
                    System.out.print("Enter item key to remove: ");
                    String removeKey = scanner.nextLine();
                    if (items.remove(removeKey) != null) {
                        System.out.println("Item with key '" + removeKey + "' removed successfully.");
                    } else {
                        System.out.println("Item with key '" + removeKey + "' not found.");
                    }
                    break;

                case 3:
                    System.out.println("Items in the HashMap:");
                    if (items.isEmpty()) {
                        System.out.println("The HashMap is empty.");
                    } else {
                        for (Map.Entry<String, String> entry : items.entrySet()) {
                            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}

