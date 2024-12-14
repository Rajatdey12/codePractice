package se8;

public class DeadLock {

    public static void main(String[] args) {

        final String resource1 = "RAJAT DEY";
        final String resource2 = "SHIKHA CHAUDHARY";

        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired lock on :: resource 1");
                try {
                    Thread.sleep(1000);
                } catch (Exception exp) {
                    System.out.println("Error occurred while t1 locking resource1");
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: acquired lock on :: resource 2");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println("Error occurred while t2 locking resource2");
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
