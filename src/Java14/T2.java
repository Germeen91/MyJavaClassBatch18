package Java14;

public class T2 {
// Create a method that will accept an array as parameters and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the creating an instance/object of the class.
    int sumArray(int [] arr){
        int sum=0;
        for (int i=0 ; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        T2 t=new T2();

        int []numbers={10,10,20};
        int summm= t.sumArray(numbers); //created return type > object > name of method> parameter is the array
        System.out.println(summm);   // then print

        System.out.println(t.sumArray(numbers)); // anther print
    }
}
