package Java8;

import java.util.Scanner;

public class ScannerAndArray {
    public static void main(String[] args) {


        int [] numbers=new int[5];  // create an empty array of size 5

        Scanner sc=new Scanner(System.in);  // object scanner class
        for ( int i=0; i < numbers.length; i++){
            System.out.println("Please Enter number "+(i+1));
            numbers[i]= sc.nextInt();
        }


        System.out.println("Here are all the numbers that you entered");
        for (int k:numbers){
            System.out.println(k);
        }

/////////////////////////////////////////////////

        System.out.println("Here are all the numbers that you entered");

        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]+" ");
        }




    }

}
