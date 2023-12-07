package Java4;

import java.util.Scanner;

public class task1 {
    //Ask the user to enter any number
//
//if a user enters a number and it is even,
// print "Value is even", after that it should check if the number
// is greater than 1000 it should say odd after that it should check
// if odd number is greater than 1000
// it should say odd value is large otherwise odd value is just right


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number");
            int num = sc.nextInt();


            if (num % 2 == 0) {
                System.out.println("Value is even");
                if (num >= 1000) {
                    System.out.println("Even number is large");

                }else {
                    System.out.println("Even value is just right");
                }

            }if (num %2 !=0 ){
                System.out.println("Value is odd");
                if (num >= 1000){
                    System.out.println("odd value is large");
                }else {
                    System.out.println("odd value is just right");
                }

            }







        }
    }

