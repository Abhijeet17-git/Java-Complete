//Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
//How do we form a class?
//public class CLASS_NAME{
//
//}
//For getting acces of the class we need the object of that class 
//how to form the object of class
// Class_name Object_name = new Class_name([any parameter that were stated in the consstructor]);
class Demo{
    int x  ; // Class Attributes
    public Demo(int x){
        this.x = x ; //here we use the this keyword fot the intialize the valye of the arrtibute by creating the object
    }
    public int Function1(int a, int b){
        return a+b;
    }
}
public class Class_Object {
    public static void main(String[] args) {
        Demo D = new Demo(2);
        Demo D1 = new Demo(4); // we have the multiobject of the singel class
        System.out.println(D.x);
        int a = D1.Function1(4, 3);
        System.out.println(a);
    }

}
