package Java24Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.


        Map <Integer,String> store=new LinkedHashMap<>();
        store.put(2526,"Printer");
        store.put(2481,"TV");
        store.put(3256,"Computer");
        store.put(7541,"Radio");
        store.put(9852,"Mobil");

               Set<Map.Entry<Integer,String>> s=  store.entrySet(); // converted to EntrySet
for (Map.Entry<Integer,String> e:s){
    System.out.println(e.getKey()+" >> "+e.getValue());
}
        System.out.println("*****************");
store.forEach((k,v)-> System.out.println(k+" >> "+v));





    }
}
