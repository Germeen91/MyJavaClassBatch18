package Java11StringDemo;

public class Task2 {
    public static void main(String[] args) {

//count how many times letter 'a' has appeared in the string
        String str="Java is Fun";
int count=0;


        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='a')
            count++;

        }            System.out.println(count);

    }
}
