package Methods;

//With method overloading, multiple methods can have the same name with different parameters:
// for aciving this we need to have the atleast one of the diffring object in the methods
public class Overloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String args[])
    {
        int a = plusMethod(0, 0);
        System.out.println(a);
    }
}
