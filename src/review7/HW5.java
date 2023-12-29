package review7;
/*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.*/

public class HW5 {


    static void print(int n1, int n2){
        System.out.println(n1 + " >>> " +n2);
    }
    static void print(double n1, double n2){
        System.out.println(n1+ " >>> "+ n2);
    }
    static void print(int n1, double n2){
        System.out.println(n1 + " >>> "+n2);
    }

    public static void main(String[] args) {

        HW5.print(3,5);
        HW5.print(4.5,10.5);
        HW5.print(6,8.5);
    }
}
