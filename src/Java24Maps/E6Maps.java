package Java24Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {
    public static void main(String[] args) {

// Map not Support For Loop directly because has 2 data type so,we have to convert it SET
        
        Map<Integer,String> studentMap=new LinkedHashMap<>(); // key is int , value String
                                              //Linked >>in order  Hash>>remove duplicate  Map>>two data type
        studentMap.put(1,"sino");
        studentMap.put(2,"besho");
        studentMap.put(3,"seto");
        studentMap.put(10,"koke");
        studentMap.put(5,"feto");
        System.out.println(studentMap);


//Map -> Entry- >Key Value
        //      studentEntries =studentsMap.entrySet();

        Set<Map.Entry<Integer, String>> entries =studentMap.entrySet(); // get individual key and value in the same time // Or use Lambda expression

        for (Map.Entry<Integer, String> e:entries){
            if(e.getKey()>2){
                System.out.println(e.getKey()+" "+e.getValue());}
        }

        System.out.println("***************************");

        for(var e:studentMap.entrySet()){
            var key=e.getKey();
            var value=e.getValue();
            System.out.println(key+" "+value);
        }



        System.out.println("***************************");
        studentMap.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
