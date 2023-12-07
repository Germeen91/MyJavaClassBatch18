package Java6;

import java.util.Scanner;

public class ScannerAndLoop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=sc.nextInt();

        System.out.println("Please enter the end");
        int end=sc.nextInt();

        while (start<=end){   // must be true if user put starting point>end will not print
            System.out.print(start+" ");
            ++start;
        }







    }
}
