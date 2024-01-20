package Java23LinkedList;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        //Create a Set in which you need to add names of the countries(5).
        // In this set we want all objects to be sorted in alphabetical order.
        // using 2 diff ways retrieve all elements from set.

        Set<String> names=new TreeSet<>();
        names.add("Egypt");
        names.add("USA");
        names.add("India");
        names.add("Japan");
        names.add("China");
        System.out.println(names);   // first way


        System.out.println("......................");
        for (String N:names){       // second way
            System.out.println(N);
        }




    }
}
