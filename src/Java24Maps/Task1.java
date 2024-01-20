package Java24Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
//Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

        Map<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Amazon");
        building.put(4,"yahoo");
        building.put(5,"Google");
        building.put(6,"Youtube");
        building.put(7,"FireFox");
        System.out.println(building.size());
        System.out.println(building.replace(4,"LG"));
        System.out.println(building.remove(7));  // if we remove key , value will remove auto
                                                    // remove here remove only one item
        System.out.println(building);


        building.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("*****************************");

// if you need if







    }
}
