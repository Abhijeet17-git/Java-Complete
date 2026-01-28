class Static_Abstract_final{
    static int  add(int a , int b){
        return (a +b) ;
    }
    public static void main(String[] args) {
        //final :- when we use them mean we can not further change it inthe any of the case
        final int x = 10;
        //x = 20 //this we cause in error
        //Static Keyowrd :- A static method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.
        add(4,5);//we dont need the object for call
        //Abstract Keyword :- 
    }
}