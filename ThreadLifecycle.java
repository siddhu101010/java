package POE;

class LifecycleDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is in RUNNABLE state and executing.");
        try {
            Thread.sleep(1000);  // Simulate some work in RUNNABLE state
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        // Step 1: Create a new thread instance (NEW state)
        LifecycleDemo thread = new LifecycleDemo();
        System.out.println("Thread state after creation: " + thread.getState());  // NEW

        // Step 2: Start the thread (RUNNABLE state)
        thread.start();
        System.out.println("Thread state after start: " + thread.getState());  // RUNNABLE

        // Step 3: Wait until thread finishes to check TERMINATED state
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        // Final state after the thread has completed
        System.out.println("Thread state after termination: " + thread.getState());  // TERMINATED
    }
}
