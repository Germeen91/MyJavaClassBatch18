package Java11StringDemo;

public class StringDemo8 {
    public static void main(String[] args) {


        String str = "Today is Saturday";
        System.out.println(str.indexOf('T'));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('a')); // it will take the first a
        System.out.println(str.indexOf('z'));

        for (int i = 0; i < str.length(); i++) { // to print the index of all "a"
            if (str.charAt(i) == 'a') {
                System.out.println(i);

            }


        }
    }
}