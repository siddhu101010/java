package POE;

class MultiplicationTable extends Thread {
    private final int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100);  // Pause to simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread for number " + number + " interrupted.");
            }
        }
        System.out.println("End of table for " + number + "\n");
    }
}

public class MultiplicationTableUsingThreads {
    public static void main(String[] args) {
        // Create and start a thread for each multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            MultiplicationTable tableThread = new MultiplicationTable(i);
            tableThread.start();
        }
    }
}
