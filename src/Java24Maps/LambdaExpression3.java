package Java24Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class
LambdaExpression3 {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        //// set like print it as a colum
        // can convert first
        Set<Map.Entry<String,Integer>> data=maps.entrySet();
        System.out.println(data);
        // Or Use Lambda
maps.forEach((k,v)-> System.out.println(k+" "+v));



        // we can use removeIf here  so, we have convert set because set ,list are collection but Map not collection
        maps.entrySet().removeIf(e->e.getKey().contains("i")); // to getKey OR getValue have to put entrySet to get from it
        maps.entrySet().removeIf(e->e.getValue()==5);
        maps.entrySet().removeIf(e->e.getKey().contains("O") || e.getValue()==5);

        // Lambada with removeIf  replace if condition
        System.out.println(maps);


    }
}
