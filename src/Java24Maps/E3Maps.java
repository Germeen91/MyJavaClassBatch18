package Java24Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps=new HashMap<>(); // Hash make it not in order and remove duplicate
        maps.put("Apple",20);             // Key in the left        Value in the right
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());

        //Returns the keys in the form of a set
        Set<String > keys=maps.keySet();
        ArrayList <String> array=new ArrayList<>(keys); // convert it

        for (String K:keys){   // maps not support loop directly you have to set method && remove because has 2 parameters
            System.out.println(K);
        }
        System.out.println(keys);










    }
}
