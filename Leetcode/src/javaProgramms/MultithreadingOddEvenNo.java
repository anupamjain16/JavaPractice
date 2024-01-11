package javaProgramms;

public class MultithreadingOddEvenNo {

    private int counter = 1; // Private for encapsulation

    static int N = 10; // Initialize N directly

    public void printOddNumber() {
        synchronized (this) { // Synchronize on the shared object
            while (counter < N) {
                while (counter % 2 == 0) { // Wait for odd number
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Restore interrupted status
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify(); // Notify other thread
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) { // Synchronize on the same object
            while (counter < N) {
                while (counter % 2 == 1) { // Wait for even number
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Restore interrupted status
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify(); // Notify other thread
            }
        }
    }

    public static void main(String[] args) {
        MultithreadingOddEvenNo mt = new MultithreadingOddEvenNo();
        Thread t1 = new Thread(mt::printEvenNumber); // Use method reference for clarity
        Thread t2 = new Thread(mt::printOddNumber);
        t1.start();
        t2.start();
    }
}
