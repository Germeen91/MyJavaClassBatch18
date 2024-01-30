package Java13;



//Create a method that will take a number and prints whether the number is even or odd.
public class Test {

    void num(int number){
        if (number %2==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }


    public static void main(String[] args) {



        Test n=new Test();
        n.num(6);
        n.num(7);

    }






}




