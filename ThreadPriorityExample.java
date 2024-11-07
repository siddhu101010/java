package POE;

class Task extends Thread {
    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is executing - Priority: " + getPriority());
            try {
                // Sleep for a short time to allow context switching
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create three threads
        Task thread1 = new Task("Thread 1");
        Task thread2 = new Task("Thread 2");
        Task thread3 = new Task("High Priority Thread");

        // Set different priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Set low priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Set normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Set high priority

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Join the threads to ensure main waits for them to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have completed execution.");
    }
}
