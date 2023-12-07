package Java4more;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {

        System.out.println("what is your name");

        Scanner fetch=new Scanner(System.in);
        String name=fetch.next(); //next only handle only one word
        System.out.println(" your name is "+ name);




    }
}
