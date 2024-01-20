package Java23LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

     //How can you remove all duplicates from ArrayList?

        List<String> aList=new ArrayList<>();
        aList.add("john");
        aList.add("jane");
        aList.add("james");
        aList.add("jasmine");
        aList.add("jane");
        aList.add("james");
        System.out.println(aList);

       Set<String> A=new LinkedHashSet<>(aList);
        aList.clear(); // because we removed duplicate element but still keep places so, we have to clear and addAll them again
        aList.addAll(A);
        System.out.println(aList);





    }
}
