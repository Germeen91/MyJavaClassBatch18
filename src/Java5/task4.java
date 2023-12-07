package Java5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
///Write a program for user to enter his/hers birth month. Based on the month define the season.
//Example: if user is born in March, April, May → season =”Spring”
//if user is born in June, July, August →
//season =”Summer”  etc …
//At the end of the program we should see 1 output as “You were born is season __”.


        Scanner scn = new Scanner(System.in);
        System.out.println("What is your birth month?");
        String month = scn.next();
         String season=" ";


        if (month.equalsIgnoreCase("march") || month.equals("april") || month.equals("may")) {

            System.out.println(season="Spring");
        } else if (month.equalsIgnoreCase("june") || month.equals("july") || month.equals("august")) {
            System.out.println(season="Summer");
        } else if (month.equalsIgnoreCase("september") || month.equals("october") || month.equals("november")) {
            System.out.println(season="Fall");
        } else  {
            System.out.println(season="winter");
        }
        System.out.print("You were born in season " +season);
    }

    }

