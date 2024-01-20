package Java22FrameWork;

import java.util.ArrayList;
//List >>allow duplicate value     *Set >> not allow duplicate value
// collection framework is simply a collection of classes which help us manage and manipulate large amount of data

// ArrayList fixed array size the size is dynamic it is growing by adding element you dont must to specify size
// array dont building methods we have to create own method because it is not class

// array list fast but size is dynamic so we can hardly add and remove element
// Lined list slow but store elements random and easy to add and remove elements
public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();  // fixed array size the size is dynamic it is growing by adding element
// you have to specify data type string , int ........ to make control
        names.add("Maria");
        System.out.println(names.size());

        names.add("germeen");  // then store what do you want
        names.add("Marcellino");
        names.add("Steven");
        System.out.println(names.size());  // every action will record and affect
        System.out.println(names);
    }
}
