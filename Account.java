class Account {
    // Attributes
    String accountNo;
    String name;
    static int min_balance = 500; // Static attribute, common for all accounts
    int balance;
    // Constructor to initialize accountNo, name, and balance
    public Account(String accountNo, String name, int balance) {
    this.accountNo = accountNo;
    this.name = name;
    this.balance = balance;
    }
    // Method to display account details
    public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNo);
    System.out.println("Account Holder Name: " + name);
    System.out.println("Minimum Balance: " + min_balance);
    System.out.println("Account Balance: " + balance);
   
    }
    public static void main(String[] args) {
    // Creating an instance of Account
    Account account = new Account("123456789", "John Doe", 1000);
   
    // Displaying account details
    account.displayAccountDetails();
    }
   }
   