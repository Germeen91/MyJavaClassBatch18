package Java11;

public class StringDemo4 {
    public static void main(String[] args) {


        String str="Now i love Java is great";

        System.out.println(str.startsWith("Now"));
        System.out.println(str.startsWith("Python"));
        System.out.println(str.startsWith("N"));
        System.out.println(str.startsWith("n"));
        System.out.println(".........................");

        System.out.println(str.startsWith(" Now"));  // there is space
        System.out.println(str.startsWith("")); // there are nothing before
        System.out.println("......................");

        System.out.println(str.endsWith("great"));
        System.out.println(str.endsWith("Java"));
        System.out.println("......................");

        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Python "));




    }
}
