//without Proper Mechanisam Communication thread might end up in ifficient busy wait state
//we cant have the proper CPU utilization 
class Shared_resources{
    private int data ;
    private boolean hasData;
    public synchronized void Producer(int value){
        while(hasData){
            try{
                wait(); // this tell the thread that you have to wait someone is there and doing the things or somthing is processing
            } catch (InterruptedException E) {
                System.out.println(E);
            }
        }
        hasData = true;
        data = value ;
        System.out.println("Produced" + value);
        notify(); //this is the statement that tell that another thread i am free now you can go ahed
    }
    public synchronized int Consumer(){
        while(!hasData){
            try{
                wait();
            } catch (InterruptedException E) {
                System.out.println(E);
            }
        }
        hasData=false;
        System.out.println("Consumed" + data);
        notify();
        return data;
    }
}
class Produced implements Runnable{
    private Shared_resources R ;
    public Produced(Shared_resources R){
        this.R = R ;
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            R.Producer(i);
        }
    }
}
class Consumed implements Runnable{
    private Shared_resources R ;
    public Consumed(Shared_resources R){
        this.R = R ;
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            R.Consumer();
        }
    }
}
public class Thread_comunication{
    public static void main(String args[]){
        Shared_resources S = new Shared_resources();
        Thread T = new Thread(new Produced(S));
        Thread T1 = new Thread(new Consumed(S));
        T.start();
        T1.start();
    }
}