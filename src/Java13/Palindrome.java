package Java13;


//Create a method that will print whether given String is palindrome or not.

public class Palindrome {


    void w(String word){
        String reverse="";
        for (int i= word.length()-1 ;i >=0 ;i--) {

            reverse = reverse + word.charAt(i);
        }
            if (word.equalsIgnoreCase(reverse)){
                System.out.println(word+" is palidrome");
            }else {
                System.out.println(word+ " not palidrome");
            }
        }



    public static void main(String[] args) {


        Palindrome p = new Palindrome();
        p.w("germeen");

    }
}
