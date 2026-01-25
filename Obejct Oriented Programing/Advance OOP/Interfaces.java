// class = Blueprint for object
// interface= Blueprint for the Classe
//Propertise of the Interface
//1.only of the abstract method allow
//2.only static variable are allowed
//use of the abstraction 
//1.For the multinheritance 
//2.For the Abstraction(pure)
class Test {
    public static void Okkk(){
        System.out.println("this is the okk method");
    }
}
class Test1 extends Test{
    
    public static void Okkk(){
        System.out.println("This is the okkkkk method");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Test T = new Test1();
    }
}
