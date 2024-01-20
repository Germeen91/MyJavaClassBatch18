package Java24Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class E5Maps {
    //var name; not work here because you are not assigned
    public static void main(String[] args) {

        var maps=new HashMap<>(); // Hash make it not in order and remove duplicate
        maps.put("Apple",20);             // Key in the left        Value in the right
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());

        //Returns the keys in the form of a st
        var keys=maps.keySet();
       var array=new ArrayList<>(keys); // convert it

        for (var K:keys){   // maps not support loop directly you have to set method
            System.out.println(K);
        }
        System.out.println(keys);
    }
}
