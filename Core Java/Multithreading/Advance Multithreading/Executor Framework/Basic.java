
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;

// Thread Sppol thisis the consept where we have the multipel thread wating for the upcoming process not delet
// we achive it using the Executor Framework
// 1.Executor 
// 2.ExecutorService
// 3.SheduleExecutorService
public class Basic {
    public static void Executor_Framework() {
        ExecutorService E = Executors.newFixedThreadPool(1); // this will just give use 9 thread wich are going do work
                                                             // for us
        long S = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            long s_time = System.currentTimeMillis();
            int finali = i;
            E.submit( // E.submit() we use this for the start the thread
                    () -> {
                        long result = Factorial(finali);
                        System.out.println(result);
                      
                    });
        }
        try{
            E.awaitTermination(1,TimeUnit.SECONDS);
        }
        catch(InterruptedException e){
            System.out.println(E);
        }
        E.shutdown();// this would just shutdown the all thread
        System.out.println("Time Taken " + (System.currentTimeMillis() - S));
    }

    // here we need to manage our code by use
    public static void Thread1() throws InterruptedException {
        long s_time = System.currentTimeMillis();
        Thread[] Thread = new Thread[10];
        for (int i = 0; i < 10; i++) {
            int Finali = 9;
            Thread[i] = new Thread(
                    () -> {
                        long result = Factorial(Finali);
                        System.out.println(result);
                    });
            Thread[i].start();
        }
        for (Thread T : Thread) {
            T.join();
        }
        System.out.println("Total time" + (System.currentTimeMillis() - s_time));
    }

    public static void main(String[] args) throws InterruptedException {

        Executor_Framework();

    }

    private static int Factorial(int no) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        if (no <= 1) {
                return 1;
            }

            int result = 1;

            // 2. Use a loop instead of calling the function again
            for (int i = 2; i <= no; i++) {
                result *= i; // Same as: result = result * i;
            }
            return result;
    }
}
