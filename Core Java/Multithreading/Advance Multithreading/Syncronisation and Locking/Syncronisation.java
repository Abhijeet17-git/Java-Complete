// here without the Syncronisation the process will not print the desired out it print the anything abot the 1800 and any so we need to Syncronisation between them so that method not acces at same time with two diff thread
class Counter{

    private int count = 0 ;
    public synchronized void increment(){ // now this will insure that only sigel object would acces singel time this method at same time avoid the race condtion mutual exclusion
        count = count+1;
    }
    public int get(){
        return count ;
    }
}
class Mythread extends Thread{
    private Counter counter ;
    public Mythread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i = 0 ; i<1000 ;i++)
            counter.increment();
    }
}
public class Syncronisation {
    public static void main(String[] args) {
        Counter C = new Counter();
        Mythread Thread1 = new Mythread(C);
        Mythread Thread2 = new Mythread(C);
        //Desierd out out is the output for the 
        Thread1.start();
        Thread2.start();
        try{
            Thread1.join();
            Thread2.join(); //here we wait for the process to complet the thread 2then we are proceed 
        }catch(InterruptedException e){
            System.out.print("error throws");
        }
        System.out.println(C.get());
    }
}
