package Java7;

import java.util.Arrays;

public class ArrayHW3 {

    public static void main(String[] args) {


        /* Create an array to store char values and then print those in reverse order*/

        char[] values = {'G', 'S', 'B', 'M'}; // index  in order 0 1 2 /element size


            for (int i = 3; i >= 0; i--) {
                System.out.print(values[i] + " ");
            }
        System.out.println();
        System.out.println(Arrays.toString(values));

        for (int i= values.length-1;i>=0; i--){    // because i is index and index is always less than -1 of elements
            System.out.println(values[i]);
        }

        }
        }

