package Java3;

public class task4 {
    public static void main(String[] args) {

        int age=20;

        if (age<1){
            System.out.println("Baby");
        }else if(age<20) {
            System.out.println("Teenager");

        }    else if (age<30){
            System.out.println("Still young"); /*java foud the true condition here
                                                so ignore after that all this condition
*/
        }else  if(age<50){
            System.out.println("a little old");

        }else  {
            System.out.println("old");
        }


    }
}
