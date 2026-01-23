
// A method is a block of code which only runs when it is called.
// static datatype_to_return Function_name(value to be passed){
        
//     }
class Method {
    //java Method witout parameter
    static void Function(){
        System.out.println("i am a funtion ");
    }
    //java with parameters
    static void PFuntion(String name){
        System.out.println("i am a funtion , i take "+ name+" this as the pararmeter ");
    }
    //Method with the return value
     static String RFuntion(String name){
        System.out.println("i am a funtion , i take "+ name+" this as the pararmeter ");
    return name;
    }

    public static void main(String args[]){
        Function();
        PFuntion("Abhijeet");
        RFuntion("Abhijeet");
    }
}
