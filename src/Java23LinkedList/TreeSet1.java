package Java23LinkedList;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {


        TreeSet<Integer> numbers=new TreeSet<>();  // give us element Sorted without duplicate
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        System.out.println(numbers);

        for (int n:numbers){
            if(n==20)
                System.out.println(n);
        }



    }
}
//we can use enhanced for loop but not working with remove method because the index will chang
// Good way to use Lambada expression
//numbers.removeIf(x->-x.startsWith(""))
//sout(numbers)
//numbers.removeIf(x->-x.endsWith(""))
//numbers.removeIf(x->-x.contains(""))
//numbers.forEach(x-> sout(x)).. print direct without loop