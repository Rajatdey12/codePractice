package test.basics.pack1;

/*
    Print the output alternatively by using two threads
 */
public class PrintNumsAlternative {

    private final Object lock = new Object();
    private boolean isThread1Turn;
    private int counter = 1;

    public void print(final boolean isThread1) {

        while (counter <= 10) {
            synchronized (lock) {
                while (isThread1Turn != isThread1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (counter > 10) {
                    break;
                }
                System.out.println("Print value is : " + counter + " printed by : " + Thread.currentThread().getName());
                counter++;
                isThread1Turn = !isThread1Turn;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumsAlternative pan = new PrintNumsAlternative();
        Thread t1 = new Thread(() -> pan.print(true), "Thread-1");
        Thread t2 = new Thread(() -> pan.print(false), "Thread-2");

        t1.start();
        t2.start();
    }
}
