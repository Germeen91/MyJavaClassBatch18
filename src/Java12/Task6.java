package Java12;

public class Task6 {
    public static void main(String[] args) {

        //How would you check if String is palindrome or not ?
        // aba => true
        //Abbc=> false

        String str="Car";
        String reversedWord="";

        for (int i = str.length()-1; i>=0; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }




    }
}
