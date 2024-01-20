package Java23LinkedList;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet3 {
    public static void main(String[] args) {

        Set<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);

        // Here Linked will store elements in order but Hash will remove duplicate




    }
}
