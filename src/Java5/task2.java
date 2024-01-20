package Java5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

///Write a program that will prompt the user for
//Day number and print whether it is a weekend or weekday.
//If any day from 1-5 → output “It is a weekday”, any day
//from 6-7 → output “It is a weekend”, any other day → output
//“Invalid day”
//Test your task for -1 3 6 and 8

        Scanner sc=new Scanner(System.in);

        System.out.println("what is day number?");

        int d= sc.nextInt();

        if(d>=1 && d<=5){
            System.out.println("it is a weekday");
        }else if(d>=6 && d<=7){ // (d==6 || d==7)
            System.out.println("it is a weekend");
        }else {
            System.out.println("invalid day");
        }










    }
}
