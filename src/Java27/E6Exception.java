package Java27;

public class E6Exception {
    public static void main(String[] args) {

        System.out.println(1);
        try{
            System.out.println(2);
            // System.out.println(10/0);// the moment java will get any error java will stop execute and start catch block which can handle this error
            System.out.println(3);
        }catch (ArithmeticException e){ // catch execute only when try is has error
            System.out.println(4);
            // System.out.println(10/0);  // again stop execute
            System.out.println(5);
        }finally { // finally always execute even have error
            //            System.out.println(10/0);
            System.out.println(10);
            System.out.println("Will always be executed");
        }
        System.out.println(8);








    }
}
