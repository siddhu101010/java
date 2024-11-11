// Bank interface with rateOfInterest method
interface Bank {
    double rateOfInterest();
   }
   // SBI class implementing Bank interface
   class SBI implements Bank {
    // Overriding rateOfInterest method for SBI
    public double rateOfInterest() {
    return 5.5; // Example interest rate for SBI
    }
   }
   // PNB class implementing Bank interface
   class PNB implements Bank {
    // Overriding rateOfInterest method for PNB
    public double rateOfInterest() {
   
    return 6.0; // Example interest rate for PNB
    }
   }
   public class Main {
    public static void main(String[] args) {
    // Creating instances of SBI and PNB
    Bank sbi = new SBI();
    Bank pnb = new PNB();
    // Displaying rate of interest for each bank
    System.out.println("Rate of Interest for SBI: " + sbi.rateOfInterest() + "%");
    System.out.println("Rate of Interest for PNB: " + pnb.rateOfInterest() +
   "%");
    }
   }
   