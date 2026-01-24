
//midifier for the class 
//public :- when we use this modifier that means class is accessible by the other class
//default:- when we use this mean class is accese in the same package
//Modifer for the attributes
//public :- When we use the modifier mean attributre acces by whole class
//private :- accese in the same class only
//defult :- The code is only accessible in the same package. This is used when you don't specify a modifier.
//protected :- The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
class Att{
    public int a = 10; //acces any where any time
    private int b = 10 ; // cant accese outside of the class 
}
public class Modifier {
    public static void main(String[] args) {
        Att a = new Att();
        System.out.println(a.a); //print 10
        //System.out.println(b.a); //give the error
    }
}
