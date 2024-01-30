package review12;

public class E1ExceptionSolution {
    public static void main(String[] args) {


        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println((10/0));
        }catch (ArithmeticException a){

           // a.printStackTrace();  // will execute the code after + give you link to class error but not good to use it will hacker
           // System.out.println(a);
            System.out.println(a.getMessage());
           // System.out.println("Not allow / by Zero");
        }

        System.out.println(3);














    }
}
