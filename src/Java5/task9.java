package Java5;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

//HW: Using scanner class create calculator.
// Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
//Please complete this assignment in 2 ways: using if statement and switch case.

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double n1= sc.nextDouble();

        System.out.println("enter anther number");
        double n2=sc.nextDouble();

        System.out.println("choose operetor (+ , - ,* ,/ )");
        String op=sc.next();


        if(op.equals("+")){
            System.out.println(n1+n2);

        } else if (op.equals("-")) {
            System.out.println(n1-n2);

        } else if (op.equals("*")) {
            System.out.println(n1*n2);

        } else if (op.equals("/")) {
            System.out.println(n1/n2);

        }else {
            System.out.println("invalid");
        }


    }
}
