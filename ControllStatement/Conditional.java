public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        if (a > 10) {
            // block of code to be executed if condition1 is true
        } else if (a < 10) {
            // block of code to be executed if the condition1 is false and condition2 is
            // true
        } else {
            // block of code to be executed if the condition1 is false and condition2 is
            // false
        }
        String result = (a > 10) ? "a is greater than 10 " : "a is less than 10";
        switch (a) {
            case 10:
                // code block
                break;
            case 11:
                // code block
                break;
            default:
                // code block
        }
    }
}
