package Java4more;

import java.util.Scanner;

public class Scan8 {
    public static void main(String[] args) {

        System.out.println("what is your city?");

        Scanner j=new Scanner(System.in);
        String city=j.nextLine();



        System.out.println("what is the Temperature in F ?");
        Scanner m=new Scanner(System.in);
        double temp=m.nextDouble();

        System.out.println("the Temperature in the city "+city+" is "+((temp-32)/1.8)+"C");








    }
}
