package Java27;

public class E1Solution {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
// solution for run time error
        try{ // try this piece of code and if causes any issues
        System.out.println(10/0);
        }catch (Exception e){  // catch that error and execute this line of code
            System.out.println("please don't try to divide by zero it not allowed in java");
        }
        System.out.println("5");
        System.out.println("6");
        System.out.println("5");
////////////////////////////////////////////////////////////////////////////////////////////////
/// if your code is correct java will not catch error and execute your code good
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try{
            System.out.println(10/2);
        }catch (ArithmeticException e){  //good to specific wrong not general like above (parent error)
            System.out.println("please don't try to divide by zero it not allowed in java");
        }
        System.out.println("5");
        System.out.println("6");
        System.out.println("5");


    }
}
