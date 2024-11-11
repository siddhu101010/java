// MyRestaurant interface with eat method
interface MyRestaurant {
    void eat();
   }
   // MyJourney interface with travel method
   interface MyJourney {
    void travel();
   
   }
   // Holiday class implementing both MyRestaurant and MyJourney interfaces
   class Holiday implements MyRestaurant, MyJourney {
    // Implementing the eat method from MyRestaurant interface
    public void eat() {
    System.out.println("Eating at a restaurant during the holiday!");
    }
    // Implementing the travel method from MyJourney interface
    public void travel() {
    System.out.println("Traveling to a new destination during the holiday!");
    }
   }
   public class Travel {
    public static void main(String[] args) {
    // Creating an instance of Holiday
    Holiday holiday = new Holiday();
    // Calling the eat and travel methods
    holiday.eat();
    holiday.travel();
    }
   }