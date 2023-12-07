package Java11;

public class StringDemo2 {
    public static void main(String[] args) {


        //creating an object of String class

        String str="Batch 18";    // shortcut
        String str2=new String("Batch 18"); // same result

        System.out.println(str.length());  //8 letter include spaces
        System.out.println(str2.length());
// Empty method
        boolean isEmpty=str.isEmpty();   //  we can store first then print
        System.out.println(isEmpty);
        System.out.println(str.isEmpty()); // or print direct

    }
}
