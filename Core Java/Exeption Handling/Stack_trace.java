// exeption throw errorin the stack_trace manner lets understand that 
public class Stack_trace {

    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception e){
            StackTraceElement[] s = e.getStackTrace();// here the getStackTrace is the method in the exeption class that give the method wich cuse error in stack manner
            for(int i = 0 ; i < s.length ; i++){
                System.out.println(s[i]);
            
            }
            e.printStackTrace(); // this will just direct print the Stack without for loop
        }
         // this will throw error  in stack manner
        
    }
    public static void level3(){
        int [] arr = new int[5];
        System.out.println(arr[10]);
    }
    public static void level2(){
        level3();
    }
     public static void level1(){
        level2();
    }
}


