class NonPrimitive{
    int x;
    int y;//here this are non primitive so they are the having defualt value oft he Zero for the primitive then dont get the value
}
public class DataType {

    public static void main(String args[])
    {
        NonPrimitive N = new NonPrimitive(); // new memory of the given
        NonPrimitive N1 = N; // here N1 is the refrence of the N mean if we change the value of the N1 then the actual values are got chagne in the Non-Primitive meory given on hip 
        N.x= 10 ;
        N1.x = 0;
        System.out.println(N1.x);
        String name = null; //primitive datatypes
        System.out.println(name);
        byte age = 21;
        Byte B = age;
        B = 20;
        Integer i = new Integer();
    }
}
