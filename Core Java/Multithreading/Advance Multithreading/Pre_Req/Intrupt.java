class Test extends Thread{
    public Test(String Name){
        super(Name);
    }
    @Override
    public void run(){
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){
            System.out.println("Thread is the intrupted");
        }
    }
}
public class Intrupt {
    public static void main(String[] args) {
        Test T =new Test("Test_Thred");
        T.start();
        T.interrupt();
    }
}
