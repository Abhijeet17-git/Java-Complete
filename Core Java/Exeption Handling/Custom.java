class Try{
    boolean Compare(int a , int b) throws Exception{
        if(a>b){
            throw new Exception("This the error");
        }
        return true;
    }
}
public class Custom {
    public static void main(String[] args) {
        Try T = new Try();
        try{
            T.Compare(4, 0);
        }catch(Exception E){
            System.out.println(E);
        }
    }
}
