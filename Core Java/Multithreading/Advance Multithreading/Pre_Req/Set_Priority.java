class Test extends Thread {
    public Test(String name) {
        super(name);
    }

    @Override
    public void run() {

        int temp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100000; j++) {
                temp = temp + 1;
            }
            System.out.println(Thread.currentThread().getName() + "Thread Priority" + Thread.currentThread().getName()
                    + "count" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}

public class Set_Priority {
    public static void main(String[] args) {
        Test T1 = new Test("low Level");
        Test T2 = new Test("medium Level");
        Test T3 = new Test("high Level");
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.NORM_PRIORITY);
        T3.setPriority(Thread.MAX_PRIORITY);
        T1.start();
        T2.start();
        T3.start();

    }
}