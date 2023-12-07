package Java6;

public class WhileLoopTask5 {
    public static void main(String[] args) {
 /// print only odd numbers from 100 to 1
        int b=100;

        while (b>=1){
            if (b%2!=0){
                System.out.println(b);
            }
            --b;     // we can use simple method instead of if statement
                     // but make value b= 99; because start from odd number then make the close is b=b-2;
        }







    }
}
