package Java11StringDemo;

public class StringDemo6 {
    public static void main(String[] args) {



        String str="Java is Fun";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4)); // space
        //Or we can store then print
        char c=str.charAt(0);
        System.out.println(c);
//////////////////////////////////////////////////////

        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }



    }
}
