package Java14;

/*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.*/
public class HW2 {

    private  String str(String word) {
        String newWord = word.replaceAll("[^AaEeIiOoUu]", "");
        return newWord;
    }


    public static void main(String[] args) {

HW2 obj=new HW2();
        System.out.println(obj.str("Java"));

    }
}
