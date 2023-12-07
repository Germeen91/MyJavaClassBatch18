package Java6;

public class WhileLoopTask4 {
    public static void main(String[] args) {
 /// print even numbers from 20 to 100
        int x=20;

        while (x<=100){                   // should be always true
            if (x%2==0){
                System.out.println(x);
            }
            ++x;
                   // when can not use if we can put condition is x=x+2;

        }



    }
}
