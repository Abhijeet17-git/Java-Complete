import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Reentrant_exampal {
    private Lock lock = new ReentrantLock(true); // here we use the reentrartLock becuse it have the deinatin of the all of the lock ,getlock,trylock 
    public void Outer(){
        lock.lock(); //1st lock
        try{    
            System.out.println("this si the outer method");
            Inner();
        }finally{
            lock.unlock(); // second lock unlocked
        
        }
    }
    public void Inner(){
        lock.lock(); // 2nd lock // this is the forever if someone is waitfor the resuses it will stop forever but never unlock if we use the Thred.inturupt() then alsoit stays
        try{
            System.out.println("this is the inner method");
        }finally{
            lock.unlock(); // one lock unlocked
        }
    }
    public static void main(String[] args) {
        Reentrant_exampal R = new Reentrant_exampal();
        R.Outer();
    }
}
