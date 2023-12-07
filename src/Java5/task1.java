package Java5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
////Prompt the user to enter person heights in inches.//
// Person should be classified as one of the following:
//• short (under 60 inch)
//• medium(between 60 -72 inch)
//• tall (over 72 inch)

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your height in inches");

        double h= sc.nextDouble();

        if (h < 60) {
            System.out.println("short");

        }else if(h>=60 && h<=72){

            System.out.println("medium");
        }else{
            System.out.println("tall");
        }


    }
}
