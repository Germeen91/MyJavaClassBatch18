package Java7;

import java.util.Arrays;

public class ArrayHW {
    public static void main(String[] args) {
      /*  Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array*/


        String [] car={"BMW","KIA","Toyota","Tesla","Honda","Jeep"}; // two different ways to identify size of element
/*String [] cars=new String[6]; */

        System.out.println(car[0]+" ");
        System.out.println(car[1]+" ");
        System.out.println(car[2]+" ");
        System.out.println(car[3]+" ");
        System.out.println(car[4]+" ");
        System.out.println(car[5]+" ");

//...................................................................
        for (int i=0;i< car.length;i++){
            System.out.print(car[i]+" ");
        }
        //.........................................................

        String [] cars={"BMW","KIA","Toyota","Tesla","Honda","Jeep"};
        int i=0;
        while (i< cars.length){
            System.out.print(cars[i]+" ");
            i++;
        }

        //.....................................

        for (String p:car){
            System.out.println(p);
        }
        System.out.println(Arrays.toString(car));



    }
}
