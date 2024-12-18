package se8;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Implement threading in JAVA (scenario of 20 parallel requests and at max 5 concurrency) [concept of Executor Service]; ThreadPool
public class ExecutorServiceTest {

    public static void main(String[] args) {

        // Create a thread pool with a fixed size of 5
        ExecutorService es = Executors.newFixedThreadPool(5);

        // Submit 20 tasks to the executor
        for (int i = 0; i < 20; i++) {
            final int requestId = i += 1;
            es.submit(() -> handleRequest(requestId));
        }
        // Shut down the executor after all tasks are submitted
        es.shutdown();
    }

    // Simulate a request handling task
    private static void handleRequest(int requestId) {
        try {
            System.out.println("Handling request " + requestId + " by " + Thread.currentThread().getName());
            // Simulate some processing time
            Thread.sleep(2000); // 2 seconds delay to mimic request processing
            System.out.println("Completed request " + requestId + " by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
