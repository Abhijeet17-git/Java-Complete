class Exampal{
    int get(int a){ //polymorohisam achived
        return a;
    }
    void get(){
       System.out.println("no attribute were given"); 
    }
}
public class Polymorphisam {
    //as name sugest we have the multipal form of the ssmae java code
    public static void main(String[] args) {
        Exampal A = new Exampal();
        A.get();
    }
}
