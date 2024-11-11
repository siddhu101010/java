public class StringBufferOperations {
    public static void main(String[] args) {
    // Create a StringBuffer object with initial text
    StringBuffer sb = new StringBuffer("Hello");
    // Display initial content and capacity
    System.out.println("Initial content: " + sb.toString());
    System.out.println("Initial capacity: " + sb.capacity());
    // 1. Append a string
    sb.append(" World");
    System.out.println("\nAfter append(\" World\"): " + sb.toString());
    // 2. Display the character at a specific index
   
    System.out.println("Character at index 4: " + sb.charAt(4));
    // 3. Delete a character at a specific index
    sb.deleteCharAt(4);
    System.out.println("After deleteCharAt(4): " + sb.toString());
    // 4. Find the index of a substring
    int index = sb.indexOf("World");
    System.out.println("Index of \"World\": " + index);
    // 5. Insert a string at a specific offset
    sb.insert(5, ",");
    System.out.println("After insert(5, \",\"): " + sb.toString());
    // 6. Display the length of the StringBuffer
    System.out.println("Length of StringBuffer: " + sb.length());
    // 7. Replace a portion of the string with another string
    sb.replace(6, 11, "Everyone");
    System.out.println("After replace(6, 11, \"Everyone\"): " + sb.toString());
    // 8. Reverse the contents of the StringBuffer
    sb.reverse();
    System.out.println("After reverse(): " + sb.toString());
    // 9. Display the final capacity after all operations
   
    System.out.println("Final capacity: " + sb.capacity());
    }
   }
   