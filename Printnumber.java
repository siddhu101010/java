class PrintNumber {
    // Method to print an integer number
    public void printn(int number) {
    System.out.println("Integer number: " + number);
    }
    // Method to print a float number
    public void printn(float number) {
    System.out.println("Float number: " + number);
    }
    // Method to print a double number
    public void printn(double number) {
    System.out.println("Double number: " + number);
    }
   
    public static void main(String[] args) {
    // Create an instance of PrintNumber
    PrintNumber printer = new PrintNumber();
    // Call printn() with different datatypes
    printer.printn(10); // Integer
    printer.printn(10.5f); // Float
    printer.printn(10.123456); // Double
    }
   }