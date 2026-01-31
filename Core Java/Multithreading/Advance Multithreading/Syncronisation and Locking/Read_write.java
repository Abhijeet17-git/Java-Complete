import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

// reader:ones a thousand reader can also read with no problem so we shouold allow it 
// write : ones only one can write so 
// with synchronized lock reader block wich cuse unnesesary blocking to prevent it wwe need the read write lock
public class Read_write {
    private int count = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    public int counter() {
        readLock.lock();
        try{
            return count;
        }finally{
            readLock.unlock();
        }
    }

    public void increament() {
        writeLock.lock();
        try {
            System.out.println("unlock");
                count = count + 1;
            
        }finally{
            System.out.println("unlocked");
            writeLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Read_write R = new Read_write();
        Runnable Readtask = new Runnable() {
            @Override
            public void run(){
                for(int i = 0 ; i< 10 ; i++){
                    System.out.println(Thread.currentThread().getName()+"read:"+R.counter());
                }
            }
        };
        Runnable Writetask = new Runnable() {
            @Override
            public void run(){
                for(int i = 0 ; i< 10 ; i++){
                    R.increament();
                    System.out.println(Thread.currentThread().getName()+"incremented:");
                }
            }
        };
        Thread T = new Thread(Writetask);
        Thread T1 = new Thread(Writetask);
        Thread T2 = new Thread(Writetask);
        T.start();
        T1.start();
        T2.start();

        T.join();
        T.sleep(100);
        T1.join();
        T1.sleep(100);
        T2.join();
        T2.sleep(100);
    }
}