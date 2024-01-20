package Java24Maps;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpression3 {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);

// we can use removeIf here  so, we have convert set because set ,list are collection but Map not collection
        maps.entrySet().removeIf(e->e.getKey().contains("i")); // to getKey OR getValue have to put entrySet to get from it
        maps.entrySet().removeIf(e->e.getValue()==5);
        maps.entrySet().removeIf(e->e.getKey().contains("O") || e.getValue()==5);

        // Lambada with removeIf  replace if condition
        System.out.println(maps);

    }
}
