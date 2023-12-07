package Java8;

public class EnhancedForLoop {
    public static void main(String[] args) {

        int [] numbers={10,20,3,0,45,2,6,8,9,54,63};


        for (int n:numbers){    // to print the numbers of array
            System.out.println(n);
        }
        System.out.println("......................");


for (int i=0; i < numbers.length; i++){
    System.out.println(numbers[i]);
}

    }
}
