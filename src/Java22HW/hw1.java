package Java22HW;

import java.util.ArrayList;

public class hw1 {
    public static void main(String[] args) {
        /*Create an arraylist of cars and retrieve all the values using 2 different ways.*/

        ArrayList <String> cars=new ArrayList<>();

        cars.add("Toyota");
        cars.add("KIA");
        cars.add("Ford");


        System.out.println(cars);
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        for (String s:cars){
            System.out.println(s);
        }

cars.forEach(x-> System.out.println(x));
    }
}
