package Java5;

import java.util.Scanner;

public class switchTask1 {
    public static void main(String[] args) {

//Ask user to enter their country and capture it.
// //Once values are captured print which language user speaks. Just do this for any 5 countries


        Scanner sc=new Scanner(System.in);

        System.out.println("what is your country");
        String country= sc.nextLine();


         switch (country.toLowerCase()) { /// we use equalsIgnore compare boolean and string
             case "egypt":
                 System.out.println("arabic");
                 break;
             case "us":
                 System.out.println("english");
                 break;
             default:
         }






    }
}
