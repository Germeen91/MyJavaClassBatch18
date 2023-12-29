package Java13;

public class Number {

//Create a method that will take 2 parameters as a numbers and prints which number is larger.


    void n (int num1,int num2){
        if (num1>num2){
        System.out.println(num1+" The largest number");}
        else {
            System.out.println(num2 +" The largest number");
        }
    }



    public static void main(String[] args) {


        Number obj=new Number();

        obj.n(10,20);


    }



}
