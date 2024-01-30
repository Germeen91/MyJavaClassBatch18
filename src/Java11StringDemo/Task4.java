package Java11StringDemo;

public class Task4 {
    public static void main(String[] args) {
/*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.
For Example String str=hello =>l   */


        String str = "hello";

        int len = str.length();// variable to store size of str variable


        if (!str.isEmpty()) {


            if (len >= 3 && len % 2 != 0) {

                System.out.println(str.charAt(len / 2));
            }

        }

        if (!str.isEmpty()) {

            if (str.length() >= 3 && str.length() / 2 != 0) {
                System.out.println(str.charAt(str.length() / 2));
            }
        }
    }
}
