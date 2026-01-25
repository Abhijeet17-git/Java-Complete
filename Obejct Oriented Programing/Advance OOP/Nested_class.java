class Human{
    class Male{

    }
    class Female{

    }
}
public class Nested_class {
    public static void main(String[] args) {
        Human H = new Human(); // this is the object of the outer class
        Human.Male M = H.new Male();
        

    }
}
