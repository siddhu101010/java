class Student_O {
    // Method to display "Unknown" when no name is passed
    public void printName() {
    System.out.println("Name: Unknown");
    }
    // Overloaded method to display the provided name
    public void printName(String name) {
    System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
    // Create an instance of Student
   
    Student_O student = new Student_O();
    // Call printName() without any argument, should display "Unknown"
    student.printName();
    // Call printName() with a specific name, should display that name
    student.printName("Alice");
    }
   }