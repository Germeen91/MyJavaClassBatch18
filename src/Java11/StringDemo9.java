package Java11;

public class StringDemo9 {
    public static void main(String[] args) {


        String str="Today is Saturday";

        System.out.println(str.substring(0,5)); // baby from the mother syntax
        System.out.println(str.substring(6,8));
        System.out.println(str.substring(9,str.length()));  // the rang from s to the end
        System.out.println(str.substring(9));     // or from 9 to unlimited because i did not determine the end

        String str1="Java is Fun";

        System.out.println(str1.substring(0,4));
        System.out.println(str1.substring(5,7)); // we take form the letter to the space index

        System.out.println(str1.substring(10));
        System.out.println(str1.indexOf("Fun"));


    }
}
