package Java5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Write a program that will ask user to  inputs
        //the current time (use 24 hour format).
        //Based on the given time define:
        //if hour is between 1-11 --> Morning
        //if hour between 12-15 --> Afternoon
        //if hour between 16-20 --> Evening
        //if hour between 21-24 --> Night
        //If anything else print invalid

        Scanner sc=new Scanner(System.in);

        System.out.println("what is your current time?");

     int time= sc.nextInt();

     if(time>=1 && time<=11){
         System.out.println("morning");
     }else if (time >=12 && time <=15){
         System.out.println("afternoon");
     } else if (time>=16 && time <=20) {
         System.out.println("evening");

     }else if(time>=21 && time<=24){
         System.out.println("night");
     }else {
         System.out.println("invalid");
     }


    }
}
