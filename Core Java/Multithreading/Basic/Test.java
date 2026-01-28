class Test2 implements Runnable{ //by impleemtion the runnable interface
    @Override
    public void run() {
        for( ; ;){
            System.out.println("*****************************");
        }
        
    }
}
class Test1 extends Thread{ //By extending the Thread
    @Override
    public void run(){
        for( ; ;){
            System.out.println("Abhijeet");
        }
        
    }
}
class Test{
    public static void main(String[] args) {
        Test1 T = new Test1();
        Test2 T1  = new Test2();
        Thread t = new Thread(T1);
        t.start();
        T.start();
        for(; ; ){
            System.out.println("Sourabh");
        }
        
    }
}