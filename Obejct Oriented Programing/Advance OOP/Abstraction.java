// Data abstraction is the process of hiding certain details and showing only essential information to the user.
abstract class Animal{
    //here we are doing the gerneral method of the animal like and the bark,eat and all
    protected abstract void bark(); // each animal bark diff
    public String Sleep(){
        return "zzz..."; //animal sleep same we can give them body
    }
}
class Dog extends Animal{
    @Override
    protected void bark(){ // dog bark diff and all animal barkdiff
        System.out.println(Sleep());
        System.out.println("Bhau Bhau ....");
    }
    
}
public class Abstraction {
    public static void main(String[] args) {
        Dog D = new Dog();
        System.out.println(D.Sleep());
    }
}
