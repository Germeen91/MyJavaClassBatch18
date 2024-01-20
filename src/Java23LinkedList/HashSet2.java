package Java23LinkedList;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {

       Set<String> fruit=new HashSet<>();   //>> prefer because you achieve polymorphism any where in your port
        //HashSet <String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);

        //Not store the data in order so will print it randomly
        // Not print duplicate

    }
}
