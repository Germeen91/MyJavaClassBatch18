package Java7;

public class ArrayHW4 {
    public static void main(String[] args) {
        /*Create an array of words: Java, Saturday, day, coding, is.
         Print the following sentence using elements of array: “Saturday is Java coding day”.*/

String [] n={"Saturday","is","Java","coding","day"};

for (int i=0;i<5;i++){
    System.out.print(n[i]+" ");
}

        System.out.println();

        for (String p:n){
            System.out.print(p+" ");
        }

    }
}
