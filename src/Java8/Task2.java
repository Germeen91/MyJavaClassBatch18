package Java8;

public class Task2 {
    public static void main(String[] args) {

//add all the even numbers from the above array

        int[] numbers = {10, 20, 30, 40, 45, 55, 25, 80, 90};


        int sum=0;

        for (int i=0;i< numbers.length;i++){
            if(numbers[i]%2==0){
                sum=sum+numbers[i];
            }
        }
        System.out.println(sum);

    }
}