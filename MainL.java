class Loan {
    // Attributes
    int tenure;
    double principal;
    float interestRate;
    String accountNumber;
    // Method to calculate EMI
    public double calculateEMI() {
    // Calculate simple interest
    double simpleInterest = (principal * interestRate * tenure) / 100;
    // Calculate EMI
    double EMI = (simpleInterest + principal) / tenure;
   
    return EMI;
    }
   }
   class HomeLoan extends Loan {
    // Default constructor to initialize loan details
    public HomeLoan() {
    // Initializing attributes for HomeLoan
    this.tenure = 10; // For example, 10 years
    this.principal = 500000; // Example principal amount
    this.interestRate = 6.5f; // Example interest rate in percentage
    this.accountNumber = "HL123456"; // Example account number
    }
   }
   public class MainL {
    public static void main(String[] args) {
    // Create an instance of HomeLoan
    HomeLoan homeLoan = new HomeLoan();
    // Display loan details
    System.out.println("Account Number: " + homeLoan.accountNumber);
    System.out.println("Tenure (years): " + homeLoan.tenure);
    System.out.println("Principal: " + homeLoan.principal);
    System.out.println("Interest Rate: " + homeLoan.interestRate);
   
    // Calculate and display EMI
    double emi = homeLoan.calculateEMI();
    System.out.println("EMI Amount: " + emi);
    }
   }