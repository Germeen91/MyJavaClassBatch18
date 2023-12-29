package Java17;

/*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.*/
public class HW3 {
    static void add( int n1, int n2){
        System.out.println(n1 + n2);
    }
    static void add(double n1, double n2) {
        System.out.println(n1 + n2);
    }
    static void add(double n1, int n2){
        System.out.println(n1 + n2);
    }


    public static void main(String[] args) {
        HW3.add(2,3);
        HW3.add(2.5,3.5);
        HW3.add(6.5,3);
    }
}
