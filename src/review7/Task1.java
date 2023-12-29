package review7;

public class Task1 {

 /*   create a method will take an array of ints as input and return sum of all numbers from the input array
 */
  public  static int Array(int [] numbers){
        int sum=0;
        for (int p:numbers)
        sum=sum+p;
        {
            return sum;
        }
    }


    public static void main(String[] args) {

       int []ar={10,20,5};
        System.out.println(Task1.Array(ar));
        System.out.println(Array(ar));




    }
}
