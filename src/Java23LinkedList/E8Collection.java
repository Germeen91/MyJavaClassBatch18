package Java23LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8Collection {
    public static void main(String[] args) {
/*ArrayList .. good way To use to get or print specific index element
*  not good    ..if we need to insert or remove element it will reindex all element again because of removing Or inserting
*
* ArrayLinkedList .. good way To use to get or print random element
** good ..if we need to insert or remove element it will Just put the element between 2 element and create reference for previous and after element
 * */

        ArrayList <Integer> numbers =new ArrayList<>(); // array List print element as you write it with index
                                                      // doesnt care in order or duplicate
                                                       //print the elements like store them not sorted
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(10);

        System.out.println(numbers);;

        LinkedHashSet <Integer> uniqueNumber=new LinkedHashSet<>(numbers); // keep the same original order without duplicate
        System.out.println(uniqueNumber);

        TreeSet<Integer> treeSet=new TreeSet<>(uniqueNumber); // sort data and remove duplicate
        System.out.println(treeSet);


    }
}
