package Java11;

public class StringDemo1 {
    public static void main(String[] args) {
// when class created by someone else

        // to print method without build class

        //Create an object of that  class
        /* String => Data type
        str => variable name
        new String () => creating the object of string */

        String str=new String("Hello World ");
//calling the length method using the str object
        System.out.println(str.length());

        //we can store the results of a method as well

        String upper= str.toUpperCase();
        System.out.println(upper);

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.concat("Hello Batch 18"));// not recommended
        System.out.println(str+"Hello Batch 18"); // better way
    }
}
