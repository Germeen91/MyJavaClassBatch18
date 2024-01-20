package Java7;

import java.util.Arrays;

public class Array7Lenght {
    public static void main(String[] args) {

        int []number={100,30,20,10,60,40,5,80};
        System.out.println(number.length);     //to know how many numbers in array automatic


        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }

        System.out.println("***********************");

        System.out.println(Arrays.toString(number));


        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
