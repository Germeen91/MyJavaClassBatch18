package Java4more;

import java.util.Scanner;

public class Scan6 {
    public static void main(String[] args) {

        System.out.println("what is the amount of loan is needed?");

        Scanner n=new Scanner(System.in);

         int loan=n.nextInt();

         if (loan<=200000){
             System.out.println("you can get this loan");
         }else {
             System.out.println("this amount cant be provided");
         }










    }
}
