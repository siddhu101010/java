import java.util.Scanner;
public class MultipleExceptions {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 // Accept two numbers from the user
 System.out.print("Enter the first number: ");
 int num1 = scanner.nextInt();
 System.out.print("Enter the second number: ");
 int num2 = scanner.nextInt();

 // Try block for handling division and array access
 try {
 // Handle division of two numbers

 int result = num1 / num2;
 System.out.println("Result of division: " + result);
 }
 // Catch block for division by zero
 catch (ArithmeticException e) {
 System.out.println("We can’t divide any number by 0");
 }

 // Declare an array of size 5
 int[] arr = {10, 20, 30, 40, 50};

 // Try block for accessing an element from the array
 try {
 System.out.print("Enter an index to access from the array: ");
 int index = scanner.nextInt();
 System.out.println("Element at index " + index + ": " + arr[index]);
 }
 // Catch block for array index out of bounds
 catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("You are trying to access index out of range of given array");
 }
 // Close scanner
 scanner.close();
 }
}