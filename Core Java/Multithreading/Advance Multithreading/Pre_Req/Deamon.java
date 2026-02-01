// the daemon thread are the thread that are not the user they use to do the work in the backgrougd like 
// 1.grabage collection
// 2.log
// 3.taskmonitor
//if all use thrad are finsihes then the daemon thread is also killed aduruptedly
class Test extends Thread{
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){
            for(int i = 0 ; i < 30 ;i++)
            System.out.println("Demon thread is running");
        }else{
            System.out.println("This is not daemon thread");
        }
    }
}
public class Deamon {
    public static void main(String[] args) {
        Test T = new Test();
        Test T1 = new Test();
        T1.setDaemon(true); //this is the how we start the daemon thread
        T.start();
        T1.start();
        T.start();

    }
}
