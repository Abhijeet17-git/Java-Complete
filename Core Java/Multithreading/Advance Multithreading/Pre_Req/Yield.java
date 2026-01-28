class Test extends Thread{
    public Test(String Name){
        super(Name);
    }
    @Override
    public void run(){
        for(int i = 0 ; i<10 ;i++){
            System.out.println(Thread.currentThread().getName()+"is running");
        }
        Thread.yield(); // in this way the another therd got the chances fo the finishing th process
    }
}
public class Yield {
    public static void main(String[] args) {
        Test T =new Test("Test_Thred1");
        Test T1 =new Test("Test_Thred2");
        T.start();
        T1.start(); // now this is the way using this the CPU assing to one procees untill thread terminated
    }
}
