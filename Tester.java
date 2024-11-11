class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    // Constructor to initialize the Student's names
    public Student(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    }
   
    // Method to trim names, set middleName to "N.A." if empty, and return updated object
    public Student change() {
    firstName = firstName.trim();
    middleName = middleName.trim();
    lastName = lastName.trim();
    if (middleName.isEmpty()) {
    middleName = "N.A.";
    }
    return this;
    }
    // Method to generate initials by calling change() and taking the first letter of each name
    public String generateInitials() {
    change(); // Ensure names are formatted as per the change method
    return firstName.charAt(0) + "." + middleName.charAt(0) + "." +
   lastName.charAt(0) + ".";
    }
   }
   // Tester class to demonstrate functionality
   public class Tester {
    public static void main(String[] args) {
   
    // Create a Student object with leading/trailing spaces and/or blank middle name
    Student student = new Student(" Harry ", "", " Potter ");
    // Call generateInitials and print the initials
    String initials = student.generateInitials();
    System.out.println("Student Initials: " + initials);
    }
   }