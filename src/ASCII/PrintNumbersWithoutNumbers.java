package ASCII;

public class PrintNumbersWithoutNumbers {
    public static void main(String[] args) {



        // In Java, ASCII (American Standard Code for Information Interchange)
        //The character 'A' is represented by the integer 65.
        //The character 'B' is represented by the integer 66.
        //...
        //The character 'Z' is represented by the integer 90.

        int one='A'-'A';  //>>   0
        int ten='K'-'A';  //>> 10

        for (int i=one; i<=ten; i++){
            System.out.println(i);
        }
    }
}
