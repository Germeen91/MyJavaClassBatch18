package Java24Maps;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    //Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
    //Print all keys and values from a country map using for each loop or Lambda.
    //Print all values from a country map using for each loop or Lambda.
    public static void main(String[] args) {

        Map<String,String> countries=new TreeMap<>();
        countries.put("Russia","Moscow");
        countries.put("Germany","Berlin");
        countries.put("France","Paris");
        countries.put("Belgium","Brussels");
        countries.put("Egypt","Cairo");

       countries.forEach((k,v)-> System.out.println(v));
        countries.forEach((k,v)-> System.out.println(k+" "+v));
///////////////////////////////////////////////////////////////////////////
        System.out.println(countries);
        for (Map.Entry<String,String> e: countries.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
        System.out.println("*********************************");
        countries.forEach((k,v)-> System.out.println(k+" = "+v));
        System.out.println("*****************************");
        System.out.println(countries.values());
        System.out.println("******************************");
        countries.forEach((k,v)-> System.out.println(v));
        System.out.println("******************************");
        for (var e:countries.entrySet()){
            System.out.println(e.getValue());
        }













    }
}
