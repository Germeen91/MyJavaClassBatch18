package Java23LinkedList;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;


        Set<String> cities = new LinkedHashSet<>();
        cities.add("Torrance");
        cities.add("Hawthorne");
        cities.add("Gardena");
        cities.add("Vally");
        cities.add("Santa monica");
        cities.add("Anaheim");

cities.removeIf(x->x.startsWith("A"));  //never use enhanced loop with remove because the ArrayList is dynamic
        System.out.println(cities);



    }
}
