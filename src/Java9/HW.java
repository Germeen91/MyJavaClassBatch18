package Java9;

public class HW {
    public static void main(String[] args) {
        /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers.*/

int [][] num={
        {10,5,15},
        {8,6,3},
        {2,1,7}
};

int sum=0;

for (int i=0; i<num.length;i++){
    for (int k=0; k<num[i].length; k++){

        sum =sum+num[i][k];
    }

}

        System.out.println(sum);




    }
}
