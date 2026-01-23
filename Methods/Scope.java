package Methods;

public class Scope {
    public static void main(String[] args) {
        //Method Scope
        //Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
        System.out.println("Here we cant use the X");
        int x = 20 ;
        System.out.println("Here we can use the X");
        //Block Scope
        // Loop Scope

    }
}
