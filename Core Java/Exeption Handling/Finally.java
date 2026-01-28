// finally this is the keyword in the java wich is the use when we just need to execute the code wich heppen at the last

public class Finally {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 0 ;
        dev(a,b);

    }
    public static int dev(int a , int b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }
        finally{
             System.out.println("hello");
        }
        // System.out.println("hello"); // this is error becuse it never reachabel
    }
}
