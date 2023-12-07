package Java4more;

import java.util.Scanner;

public class Scan5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please what is your gender M/F");

        char gender=sc.next().charAt(0);


        System.out.println("Your gender is "+gender);




    }
}
