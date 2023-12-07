package Java5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        //Ask user to enter a number and then categorize if number is small, medium or large
        //Small number is value between 1 and 10
        //Medium number is value between 11 and 100
        //Large number is value between 101 and 1000


        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number?");
        double num= sc.nextDouble();

        if (num>=1 && num<=10){
            System.out.println("small number");
        } else if (num>=11 && num<=100) {
            System.out.println("medium number");

        } else {
            System.out.println("large number");




        }


    }


    }

