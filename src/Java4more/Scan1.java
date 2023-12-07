package Java4more;


import java.util.Scanner; // hit double shift-auto import check 2 boxs

public class Scan1 {

    public static void main(String[] args) {//dont call your class scanner java will confuse

        System.out.println("please enter your age");
/* Scanner is datatype
scan is a variable
new is a keyboard that we use to create objects
(System.in) means we want to read from keyboard

  */
        Scanner scan=new Scanner(System.in);
        //scan.nextInt() take the int number from the
        // keyboard and store it inside age variable
        int age=scan.nextInt();

        System.out.println("you are "+age+" years old");








    }
}
