package Java4more;

import java.util.Scanner;

public class Scan7 {
    public static void main(String[] args) {

        //You are DMV representative and you need to ask customer their age.
        // If they are 18 or older you will issue a driver license to them,
        // otherwise you will offer them to get a learners permit


        System.out.println("what is your age?");
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();

        if (age>=18){
            System.out.println("you will issue a driver license");
        }else {
            System.out.println("get a learners permit");
        }




    }
}
