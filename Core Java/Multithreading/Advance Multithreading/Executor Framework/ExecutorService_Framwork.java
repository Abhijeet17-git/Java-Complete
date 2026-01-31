import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
// we need the future for getting what it actually returns what therd would return
import java.util.concurrent.*;

public class ExecutorService_Framwork {

    public static void Future_Capabilities() {
        // Using a single thread executor for simplicity
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // 1. Submitting a Callable (returns a value) instead of a Runnable
        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000); // Simulating some heavy work
            return "Task Completed Successfully!";
        });

        // 2. check if the task is done yet (Non-blocking)
        System.out.println("Is the task finished? " + future.isDone());

        try {
            // 3. get() with timeout
            // It's safer to wait for a specific time than to wait forever
            System.out.println("Waiting for the result...");
            String result = future.get(3, TimeUnit.SECONDS); 
            System.out.println("Result from Thread: " + result);

        } catch (TimeoutException e) {
            System.out.println("The task took too long!");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 4. Checking status after completion
        System.out.println("Is the task finished now? " + future.isDone());

        // 5. Demonstrating Cancellation
        Future<Integer> longTask = executor.submit(() -> {
            Thread.sleep(5000);
            return 42;
        });

        // Let's change our mind and cancel it
        boolean wasCancelled = longTask.cancel(true); // 'true' interrupts the thread
        System.out.println("Was task cancelled? " + wasCancelled);
        System.out.println("Is cancelled? " + longTask.isCancelled());

        executor.shutdown();
    }
    public static void Submitting() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(()->System.out.println("this is the runnabel without the return "));// here we are passing the runnabel method 
        Future<String> future1 = executor.submit(()->
         {
            System.out.println("This is the method where we are going to return");
            return "succes";
         });//here we are passing the runnabbel method and also return after thre thread is completed
        Future<String> future2 = executor.submit(() -> "Abhi"); // this is the callabl method that would return something
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor1.submit(() -> 1+2);
        Integer i = submit.get(); // here the main thead will wait until the all therad work is getting done and we got our i 
        executor1.shutdown(); // this will shutdown the all of the threads all 
        boolean flag = executor1.isTerminated();  // this will just terminate the thing off or not give the boolean valeu
    }
    public static void main(String[] args) {
        Future_Capabilities();
    }
}