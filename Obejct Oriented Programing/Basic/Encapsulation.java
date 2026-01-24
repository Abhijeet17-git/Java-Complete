class Demo{
    private int a = 10 ;
    public int Get(){
        return a ;
    }
    public void Set(int a){
        this.a = a;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        //Encpsulation :-
        //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
        //declare class variables/attributes as private
        //provide public get and set methods to access and update the value of a private variable
        Demo D = new Demo();
        //System.out.println(D.a); this will give the error
        System.out.println(D.Get());
        D.Set(18);
        System.out.println(D.Get());

    }
}
