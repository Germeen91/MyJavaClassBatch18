package Java7;

public class Array1 {
    public static void main(String[] args) {


        String []name=new String[2]; // i have array has 4 elements (size)

        name [0]="germeen";  // to prompt the name at index 0
        name [1]="beshoy"; // son on so on
        System.out.println(name[0]);
        System.out.println(name[1]); // until here we know the size of the array 2
        System.out.println("..................");

        int []numbers=new int[3];
        numbers [0]=3;
        numbers [1]=2;
        numbers [2]=1;
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("......................");

        // if you don't know the size of array or the elements of array write this
        System.out.println(numbers.length);
        System.out.println(name.length);



    }
}
