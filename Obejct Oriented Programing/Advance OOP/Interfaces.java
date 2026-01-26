// class = Blueprint for object
// interface= Blueprint for the Classe
//Propertise of the Interface
//1.only of the abstract method allow
//2.only static variable are allowed
//use of the abstraction 
//1.For the multinheritance 
//2.For the Abstraction(pure)
interface Test{
    //     here only we have the accese of the public static final constant;
    //     and the static method are allow,Defualt method are allow
    public static final int Age = 19;
    int age = 19 ; //this also same becuse its always public and static
    public abstract int Age(); //
    static void Info(){
        System.out.println("This is the Test Interface");
    }
    default void Info1(){ //this is the defulat method wich we dont want to impliment when someone inherit it willl automatically inherit
       
    }
}
class Test1 implements Test{
    @Override
    public int Age(){
        return Test.age;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Test1 T = new Test1();
        // T.Info(); this will thorow error becuse it own by the interface not acces by the Test that is the static method
        T.Info1();//this is the defult method wich inherit to the class at time when i inpliment the interfcae
    }
}
