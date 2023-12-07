package Java4more;

import java.util.Scanner;

public class Scan10 {
    public static void main(String[] args) {

        //Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more
        //or equals 5 years than user is eligible for the bonus, otherwise he is not .Once user is eligible and
        //salary is larger than 50000  than  bonus  =  5000,  otherwise bonus=3000.
        //
         //  user to enter is scanner


     Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers of worked years");

       int years=sc.nextInt();

        System.out.println("enter annual salary");
        int Salary=sc.nextInt();

        if(years>=5){
            System.out.println("eligible for bonus");
            if(Salary>50000){
                System.out.println("bonus = 5000");
            }else {
                System.out.println("bonus = 3000");
            }

        }else {
            System.out.println("you are not eligible for bonus");
        }








    }
}
