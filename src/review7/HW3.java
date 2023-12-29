package review7;
/*Create a method to find the minimum of two numbers.
 Method will be passed two parameters and will return the minimum number.
 Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5*/
public class HW3 {

    static int numbers(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n2 + " is the minimum number");
            return n2;
        }

        else  {
            System.out.println(n1 + " is the minimum number");
            return n1;
        }
    }

    static double numbers(double n1, double n2){
         if (n1>n2){
             System.out.println(n2 +" is the minimum number");
             return n2;

         }
         else {
             System.out.println(n1 + " is the minimum number");
             return n1;
         }

    }

    public static void main(String[] args) {

        HW3.numbers(5,10);
        HW3.numbers(5.5,10.5);

    }
}
