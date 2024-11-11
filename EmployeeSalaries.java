public class EmployeeSalaries {
    public static void main(String[] args) {
    // Array to store the salaries of five employees
    double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
    // Variables to calculate total salary and average salary
    double totalSalary = 0.0;
    double averageSalary;
    // Calculate the total salary
    for (double s : salary) {
    totalSalary += s;
    }
    // Calculate the average salary
    averageSalary = totalSalary / salary.length;
    // Display the average salary
    System.out.println("Average Salary: " + averageSalary);
    // Counters for employees with salaries above and below average
    int aboveAverageCount = 0;
    int belowAverageCount = 0;
    // Count employees based on salary comparison with average
   
    for (double s : salary) {
    if (s > averageSalary) {
    aboveAverageCount++;
    } else if (s < averageSalary) {
    belowAverageCount++;
    }
    }
    // Display the results
    System.out.println("Number of employees with salary above average: " +
   aboveAverageCount);
    System.out.println("Number of employees with salary below average: " +
   belowAverageCount);
    }
   }
   