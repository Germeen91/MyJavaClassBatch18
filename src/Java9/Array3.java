package Java9;

public class Array3 {
    public static void main(String[] args) {

        // Dimensional arrays 2D array is a collection of multi of array

        int [] [] matrix={
      // column  0  1   2  3
                {10,20,50},      // , comma part of syntax { the rows} // row 0
                {25,35,66},                                            // row 1
                {80,90,78,45},         //{the column }                 // row 2
                {45,55,66}       // , no comma in the last array       // row 3

        };


        int [] row=matrix[2];   // we can separate the row then print the element what i want

        System.out.println(row[2]); //78

        for (int i=0; i< row.length; i++){
            System.out.print(row[i]+ " ");
        }


        System.out.println();

for (int arr : row){
    System.out.print(arr+" ");
}


        System.out.println();

for (int []jojo:matrix){
    for (int feto:jojo){
        System.out.print(feto+" ");
    }
}

    }
}
