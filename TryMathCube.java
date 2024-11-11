public class TryMathCube {
    // Method to calculate the cube of a number
    public static int cube(int number) {
    return number * number * number;
    }
    public static void main(String[] args) {
    // Check if the command-line argument is passed
    if (args.length == 0) {
    System.out.println("Please provide a number as a command-line argument.");
    return;
    }
    try {
    // Try to parse the command-line argument to an integer
    int number = Integer.parseInt(args[0]);
   
    // Call the cube method and print the result
    int result = cube(number);
    System.out.println("The cube of " + number + " is: " + result);
   
    } catch (NumberFormatException e) {
    // Handle the case where the argument is not a valid integer
    System.out.println("Invalid input. Please provide a valid integer.");
    } catch (ArrayIndexOutOfBoundsException e) {
    // Handle the case where no argument is passed
    System.out.println("No argument provided. Please pass a number.");
    }
    }
   }