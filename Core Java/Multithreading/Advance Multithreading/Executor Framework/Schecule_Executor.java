import java.util.concurrent.*;
import java.util.concurrent.Callable;
public class Schecule_Executor {
    public static void Schedule() throws InterruptedException{
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Task is done after 5 sec");
                return 1 + 2;
            }
        };
        schedule.schedule(c ,5000,TimeUnit.MILLISECONDS);
        schedule.shutdown();
    
    }
    public static void main(String[] args) throws InterruptedException{
        Schedule();
    }
}
