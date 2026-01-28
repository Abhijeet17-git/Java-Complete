//here we are learing the waht is the use of the This keyowrd
//this keyword is use for the initialize the var in the class
//When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
//To call another constructor in the same class and reuse code.
public class This {
    int x = 20 ;
    public int Ret(){
        return this.x;
    }
    public static void main(String[] args) {
        This T = new This();
        T.x = 20;
    }
}
