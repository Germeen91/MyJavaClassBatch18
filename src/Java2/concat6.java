package Java2;

public class concat6 {
    public static void main(String[] args) {

        double a=9;
        double b=4;

        System.out.println(a/b);

        System.out.println(2+2*2); //6
        System.out.println((2+2)*2); //8
        System.out.println("10"+10); //1010  because java walk left to right so will copy all because copy first
        System.out.println("10"+10+10); //101010  same before
        System.out.println(10+10+"10"); // from left to right 2010

    }
}
