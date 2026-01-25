// in inheritance we just going to inherit the proopertise of the superclass in the baseclass 
//Superclass ;- Wich we are need to inherit 
//subclass :- the class wich we got inherited from the superclass

//what is the super keyword?
//1.Access parent class variables
//2.Call parent class methods
//3.call parent class constructor
class Superclass{
    int x = 10 ;
    public Superclass(){
        System.out.println("this is the superclass");
    }
    int Get(){
    return x;
    }
}
class Subclass extends Superclass{
    int y = 19;
    int b = super.x; // use for accese the keyword of the the superclass
    public Subclass(){
        super();//This is the keyword wich is use for class the superclass keyword
        System.out.println("this is the subclass");
    }
    @Override
    int Get(){
        return y+b;
    }
    int method(){
        return super.Get(); //this is how we accese the method of the superclass
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Subclass S = new Subclass();
        System.out.println(S.x); // we may access the value of the supercalss from the subclass 
        System.out.println(S.method());
        System.out.println(S.Get());
    }
}
