package Methods;

public class Scope {
    public static void main(String[] args) {
        // Method Scope
        // Variables declared directly inside a method are available anywhere in the
        // method following the line of code in which they were declared:
        System.out.println("Here we cant use the X");
        int x = 20;
        System.out.println("Here we can use the X");
        // Block Scope
        // Variables declared inside a block of code are only accessible by the code
        // between the curly braces, and only after the line in which the variable was
        // declared:

        // Loop Scope
        // Variables declared inside a for loop only exist inside the loop:
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }

    }
}
