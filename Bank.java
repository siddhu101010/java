class Bank {
    // Attributes
    String bankName;
    String area;
    String phoneno;
    // Constructor to initialize bankName, area, and phoneno
    public Bank(String bankName, String area, String phoneno) {
    this.bankName = bankName;
    this.area = area;
    this.phoneno = phoneno;
    }
    // Method to display bank details
    public void displayBankDetails() {
    System.out.println("Bank Name: " + bankName);
    System.out.println("Area: " + area);
    System.out.println("Phone Number: " + phoneno);
    }
    public static void main(String[] args) {
    // Creating an instance of Bank
    Bank bank = new Bank("State Bank of India", "Mumbai", "022-12345678");
    // Displaying bank details
    bank.displayBankDetails();
    }
   }