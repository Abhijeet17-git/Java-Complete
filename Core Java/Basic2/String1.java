public class String1{
    public static void main(String args[]) {
        String Name = "Abhijeet Govind Bhujade" ;
        String Name2 = "Sourabh";
        // String .length() funtion
        System.out.println(Name.length());
        //The toUpperCase() method converts a string to upper case letters.
        //The toLowerCase() method converts a string to lower case letters
        System.out.println(Name.toLowerCase());
        System.out.println(Name.toUpperCase());
        // .indexOf() funtion
        System.out.println(Name.indexOf("Govind"));
        // .charAt("index that we want to get") funtion
        System.out.println(Name.charAt(9));
        // txt1.equals(txt2) funtion if equal True , or not equal false
        System.out.println(Name.equals(Name));
        // txt.concat(txt2) 
        System.out.println(Name.concat(Name2));
    }
}
