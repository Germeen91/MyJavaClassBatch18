package Java24Maps;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpression2 {
    public static void main(String[] args) {


        Map<String,Integer> maps=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        maps.forEach((k,v) -> System.out.println(k));  // to print only keys
        maps.forEach((k,v) -> System.out.println(v));  // to print only value
        maps.forEach((k,v) -> System.out.println(v+" "+k));  // switch
        maps.forEach((k,v) -> System.out.println(k+" "+v));  // print both
        System.out.println("******************");
        maps.forEach((k,v) -> {

            if (k.contains("A") || v>10){
                System.out.println(k+" "+v);
            }

        });







    }
}
