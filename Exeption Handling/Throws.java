// throws this keyword tell java that it may throw the error that
// throws not handel the exception it directly bypass that exption to upper level and tell another to handel it
// it not handel by the anyone then it would handel using the jvm my the stack_trace 

import java.io.FileReader;

public class Throws {
    public static void method1() throws Exception{
        try{
            FileReader F= new FileReader("a.txt");
        }catch(Exception E){
            E.printStackTrace();
        }
        
    }
    public static void method2() throws Exception{
        method1();
    }
    public static void method3() throws Exception{
        method2();
    }
    public static void main(String[] args) throws Exception {
        method3();
    }
}
