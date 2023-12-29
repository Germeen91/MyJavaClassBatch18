package Java13;

public class Hw4 {
    // Write a method to return whether given number is prime or not?



    int number(int num) {
        boolean isPrime=true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                isPrime = false;
            break;
        }


        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
return num;
    }
    public static void main(String[] args) {

        Hw4 obj=new Hw4();
      int x=  obj.number(4);



    }



}
