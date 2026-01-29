import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;
public class Read_write {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();   // here we have the read write lock here we have the the permisiont to rad the 10000 of record at same time with out read
    public void outer(){
        lock.ReadWriteLock();
    }
    public void ineer(){
        
    }
}


