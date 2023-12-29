package Java14;
/*Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.*/
public class HW1 {


    public String good(String word){
        String reserve="";

        for (int i=word.length()-1; i>=0; i--){
          reserve=reserve+word.charAt(i);
        }
return reserve;
    }

    public static void main(String[] args) {

        HW1 obj=new HW1();
        System.out.println(obj.good("Steven"));

    }
}
