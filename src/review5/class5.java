package review5;

import java.util.Arrays;
import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the size of array"); // ask user to print numbers
        int size= sc.nextInt();  //take the input from user to print it

int [] number=new int[size];    // store the numbers from user inside array

        System.out.println(number.length);  // print the size




        for (int i=0; i<number.length; i++){
            System.out.println("please enter the number "+(i+1));
            number[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(number));




    }
}
