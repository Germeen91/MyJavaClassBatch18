package Java9;

public class Array2 {
    public static void main(String[] args) {

        int [] [] matrix={
                {10,20,50},      // , comma part of syntax { the rows}
                {25,35,66},
                {80,90,78,45},         //{the column }
                {45,55,66}       // , no comma in the last array

        };  /// we have 4 rows  +  4 column


        System.out.println(matrix[1][1]);     // row number 1  and element number 1
        System.out.println(matrix[0][2]);  // row number 0 and element number 2
        System.out.println(matrix[3][2]);
       // System.out.println(matrix[0][3]);  // Error

        System.out.println(matrix.length); //4    // gives number of row
        System.out.println(matrix[0].length); //3  the size of elements  "how many element inside the row 0
        System.out.println(matrix[2].length);  //4


    }
}
