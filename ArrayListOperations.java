package POE;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
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
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    items.add(addItem);
                    System.out.println("'" + addItem + "' added successfully.");
                    break;

                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (items.remove(removeItem)) {
                        System.out.println("'" + removeItem + "' removed successfully.");
                    } else {
                        System.out.println("'" + removeItem + "' not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Items in the ArrayList:");
                    if (items.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (String item : items) {
                            System.out.println(item);
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

