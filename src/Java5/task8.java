package Java5;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
       /*Allow user to enter grade (A, B, or C etc...) and then
        provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.*/



        Scanner sc=new Scanner(System.in);
        System.out.println("what is your grade?");
        String grade=sc.next();

        if(grade.equalsIgnoreCase("A")){  //very important. you to type ignore to make customer
            System.out.println(" Excellent");          // what they want capital or small and not double the result
        } else if (grade.equalsIgnoreCase("B")){ // in if statements
            System.out.println("Good");
        } else if (grade.equalsIgnoreCase("C")) {
            System.out.println("Average");
        } else if (grade.equalsIgnoreCase("D")) {
            System.out.println("Bad");
        } else  {
            System.out.println("Not acceptable");

        }


    }
}
