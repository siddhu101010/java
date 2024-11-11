public class Employee {
    private String empName;
    private int empAge;
    private double empSalary;
    // Constructor to initialize the data members
    public Employee(String empName, int empAge, double empSalary) {
    this.empName = empName;
    this.empAge = empAge;
    this.empSalary = empSalary;
    }
    // Getters and Setters for data members
    public String getEmpName() {
    return empName;
   
    }
    public void setEmpName(String empName) {
    this.empName = empName;
    }
    public int getEmpAge() {
    return empAge;
    }
    public void setEmpAge(int empAge) {
    this.empAge = empAge;
    }
    public double getEmpSalary() {
    return empSalary;
    }
    public void setEmpSalary(double empSalary) {
    this.empSalary = empSalary;
    }
    // Custom exception for salary issues
    public static class EmpSalaryException extends Exception {
    // Constructor to initialize the exception with a message
    public EmpSalaryException(String message) {
   
    super(message);
    }
    }
    // Method to check if salary is less than 1000, and throw exception
    public static void checkEmployeeSalary(Employee emp) throws
   EmpSalaryException {
    if (emp.getEmpSalary() < 1000) {
    // Throwing custom exception if salary is less than 1000
    throw new EmpSalaryException("Salary of " + emp.getEmpName() + " is less than 1000");
    }
    }
    public static void main(String[] args) {
    // Creating five employee objects with different salaries
    Employee emp1 = new Employee("John", 25, 1200.0);
    Employee emp2 = new Employee("Alice", 30, 800.0);
    Employee emp3 = new Employee("Bob", 28, 950.0);
    Employee emp4 = new Employee("Charlie", 35, 1500.0);
    Employee emp5 = new Employee("David", 40, 700.0);
    // Array of Employee objects
    Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
    // Checking each employee's salary
    for (Employee emp : employees) {
   
    try {
    checkEmployeeSalary(emp); // Call method to check salary
    } catch (EmpSalaryException e) {
    // Handling the custom exception and printing the employee name
    System.out.println(e.getMessage());
    }
    }
    }
   }