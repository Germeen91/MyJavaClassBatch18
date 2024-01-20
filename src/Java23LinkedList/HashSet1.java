package Java23LinkedList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        HashSet<Integer> nums=new HashSet<>();   // Set is the name of interface
        nums.add(10);
        nums.add(20);
        //no get method in Set because store data not in order so no index for each data
        // nums.get(0);
        // nums.add(10);
        System.out.println(nums);
    }
}
//Hash set do not store duplicate element // there is not order print out randomly >> so no get size method

