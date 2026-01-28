

public class Function extends Thread {
    @Override
    public void run(){

    }
    public static void main(String[] args) throws InterruptedException {
        Function F = new Function();
        System.out.println(F.getState());
        F.start();
        System.out.println(F.getState()); // this funtion is the use fot he cheack at ich state the thread is
        System.out.println(Thread.currentThread()); // this will give the thread current thread that running
        Thread.sleep(100); // this is for making the sleep our main and give the time to run thread to run
        F.join(); //tell the main method wait until the F thread is completed
        System.out.println(F.getState());
        System.out.println(currentThread());
        System.out.println("Now main thread will end");
        System.out.println(Thread.currentThread().getName());
    }

}
