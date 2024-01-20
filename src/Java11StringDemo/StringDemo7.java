package Java11StringDemo;

public class StringDemo7 {
    public static void main(String[] args) {



        String str=" HELLO ";
// more method
        System.out.println(str.toLowerCase().trim().length()); // get 5 because java execute from left to right

String str1=" HELLO ";
        System.out.println(str1.trim().toLowerCase().equals("hello"));


    }
}
