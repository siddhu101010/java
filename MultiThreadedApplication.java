

import java.util.Random;

class NumberGenerator extends Thread {
    public static int number;
    public static boolean isEven;

    public void run() {
        Random random = new Random();
        try {
            while (true) {
                number = random.nextInt(100); // Generate a random integer
                System.out.println("Generated number: " + number);

                if (number % 2 == 0) {
                    isEven = true;
                } else {
                    isEven = false;
                }

                // Notify the other threads based on number's parity
                synchronized (this) {
                    notifyAll();
                }

                Thread.sleep(1000); // Wait 1 second before generating next number
            }
        } catch (InterruptedException e) {
            System.out.println("NumberGenerator interrupted");
        }
    }
}

class SquareCalculator extends Thread {
    private final NumberGenerator generator;

    public SquareCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        try {
            while (true) {
                synchronized (generator) {
                    generator.wait();
                    if (NumberGenerator.isEven) {
                        int square = NumberGenerator.number * NumberGenerator.number;
                        System.out.println("Square of " + NumberGenerator.number + " is: " + square);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("SquareCalculator interrupted");
        }
    }
}

class CubeCalculator extends Thread {
    private final NumberGenerator generator;

    public CubeCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        try {
            while (true) {
                synchronized (generator) {
                    generator.wait();
                    if (!NumberGenerator.isEven) {
                        int cube = NumberGenerator.number * NumberGenerator.number * NumberGenerator.number;
                        System.out.println("Cube of " + NumberGenerator.number + " is: " + cube);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("CubeCalculator interrupted");
        }
    }
}

public class MultiThreadedApplication {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator(generator);
        CubeCalculator cubeCalculator = new CubeCalculator(generator);

        generator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
