package Java24Maps;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps=new HashMap<>(); // Hash make it not in order and remove duplicate
        maps.put("Apple",20);             // Key in the left        Value in the right
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        maps.remove("Kiwi");
        System.out.println(maps);
        maps.replace("Apple",30);
        System.out.println(maps);
        maps.clear();
        System.out.println(maps);

    }
}
