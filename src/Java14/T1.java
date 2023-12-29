package Java14;

public class T1 {


    // create a static method with int return type call it dValue which takes a number multiplies it by 2 and returns the value

 // static method if we are not planning to have objects
    static int dValue(int num1){

        return  num1*2;
    }


    public static void main(String[] args) {


        System.out.println(T1.dValue(4)); // name of class
    }
}
