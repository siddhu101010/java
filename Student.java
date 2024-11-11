
class Student {
    // Variable to store the name of the student
    private String name;
    // Constructor with no parameters, assigns "Unknown" as the default name
    public Student() {
    this.name = "Unknown";
    }
    // Constructor with one parameter to assign the name passed during object creation
    public Student(String name) {
    this.name = name;
    }
    // Method to print the student's name
    public void printName() {
    System.out.println("Student Name: " + name);
    }
    public static void main(String[] args) {
    // Creating a student with no name passed, should default to "Unknown"
    Student student1 = new Student();
    student1.printName();
   
    // Creating a student with a specific name
    Student student2 = new Student("Alice");
    student2.printName();
    }
   }