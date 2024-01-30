package Java24Maps;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
// Map not collection
//Map is interface can be string integer
        //HashMap is the name of class
        //new HasMap  .. is a object
        // maps ... is var hold Map class
        Map<String,Integer> maps=new HashMap<>(); // Hash make it not in order and remove duplicate
       maps.put("Apple",20);             // Key in the left        Value in the right
       maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        maps.put("Orange",20);
//duplicate keys are not allowed if we try it  will replace previous value
      //maps.put("Kiwi",15);
        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.containsKey("Apple"));
        System.out.println(maps.containsKey("Apple".toLowerCase()));
        System.out.println(maps.containsKey("Legs"));
        System.out.println(maps.containsValue(25));
        System.out.println(maps.containsValue(5));
        System.out.println(maps.isEmpty());
        System.out.println(maps.get("Kiwi"));// get value instead index





    }
}
