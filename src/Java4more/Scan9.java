package Java4more;

import java.util.Scanner;

public class Scan9 {
    public static void main(String[] args) {
////Create a Java program that will ask if user has a credit card or not. //
// If you user does not have a credit card then offer them. If they do have one ask what is balance on the card?//
// If balance of the card is larger than 1000, tell them to pay off immediately, //
// otherwise you can tell them that they can spend more.

        System.out.println("Do you have a credit card?");

        Scanner sc=new Scanner(System.in);
         String answer=sc.nextLine();

         if(answer.equals("yes")){
             System.out.println("what is balance on card?");
             double balance=sc.nextDouble();// sc.nextLine(); to make space between question

             if(balance>1000) {
                 System.out.println("pay off immediately");
             }else{
                     System.out.println("you can spend more");
                 }
         }else{
             System.out.println("we can offer credit card");
         }




         }

             }
