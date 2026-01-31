// Locking is the process where we apply the lock on  the process so one thread accese it at a time
//Type of the locking
//1.Intrinsic:-this is the buil in blocck wichi s get actuall apply when we use the synchronized(object) with no manual coding 
//2/Explicit:-Threre are the advance lock wich we want to applu manualuy they are in java.util.concurrent.locks we say when to lock when to unlock
// lock.unlock() := this is use for the unlocking the lock without and 
// lock.trylock() := this is use fir the ching that is the lock will unlocked now 
// lock.lock() := use for the unlocking the process

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

class Back {
    private int Bal = 100;
    private final Lock lock = new ReentrantLock(); //here the lock is the interface so we dont need to have the maek the object of the lock so we use the ReentrantLock() this method for the assing it have the 
    //when the same thread is again do Lock.lock() if it same thread it again get the lock and if the 10 time it get lock it should 10 time unlock then resources relesed this i th
    public void with(int ammount) {
        try {

            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + "is trying to withdraw" + (Bal));

                if (Bal >= ammount) {
                    try {
                        Thread.sleep(3000);
                        Bal = Bal - ammount;
                        System.out.println(Thread.currentThread().getName() + "withdrwal succsefull" + (Bal));
                    } catch (Exception e) {

                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficient bal");
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            lock.unlock();
        }
    }

    public int get() {
        return Bal;
    }
}

public class Locking {
    public static void main(String[] args) throws InterruptedException {

        Back B = new Back();
        Runnable R = new Runnable() {
            @Override
            public void run() {
                B.with(50);
            }
        };
        Thread T1 = new Thread(R); // here both of the thread is try to withdraw wich it to the breadking the
                                   // intigrity
        Thread T2 = new Thread(R);
        T1.start();
        T2.start();
        T1.join();
        T2.join();
        System.out.println(B.get());

        // now with the help of the lock
    }

}
