package Java11StringDemo;

public class StringDemo5 {
    public static void main(String[] args) {


        String str = "Java";
        System.out.println(str.equals("python")); // compere true or false
        System.out.println(str.equals("Java"));
        System.out.println(str.equals("java")); // lowercase
        System.out.println(str.equalsIgnoreCase("java"));
    }
}