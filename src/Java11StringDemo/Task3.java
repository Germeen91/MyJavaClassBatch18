package Java11StringDemo;

public class Task3 {
    public static void main(String[] args) {


// print the all the index of letter 'a'  from above string

        String str = "Today is Saturday";


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println(i);

            }
        }



    }
}