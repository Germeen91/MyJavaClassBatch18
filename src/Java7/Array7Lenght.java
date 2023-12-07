package Java7;

import java.util.Arrays;

public class Array7Lenght {
    public static void main(String[] args) {

        int []number={10,20,30,80,50,40,60,90};
        System.out.println(number.length);     //to know how many numbers in array automatic


        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(number));


        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
