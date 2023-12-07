package Java7;

public class ArrayHW2 {
    public static void main(String[] args) {
/*Create an array on integers and calculate the sum of all elements in an array
        From an array of integer elements find the largest number.*/

        int[] numbers = {10, 5, 9, 30, 20, 90};

        int largest=numbers[0];
        int sum=0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]>largest)
                largest=numbers[i];
            sum=sum+numbers[i];
        }

        System.out.println(largest);
        System.out.println(sum);
    }
}

