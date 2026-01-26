//at the compile time there is no issue but at the run there might be an issue of the like dev by Zero , Null pointer . IO and all possibel 
// for maging this and continueing the flow we need to know the try{}catch{} method
public class Exampel1 {
    public static int Dev(int a , int b){
        return a /b ;
    }
    public static void main(String[] args) {
        int [] a = {9,8,7,6,5};
        int [] b = {1,2,3,4,0};
        try{
            for(int i = 0 ; i < a.length ; i ++){
            System.out.println(Dev(a[i], b[i])); 
        }
        }catch(Exception e){ //here the Exeption Throw the object that catch by the object e
            System.out.println(e);
        }
        
        
        
    }
}
