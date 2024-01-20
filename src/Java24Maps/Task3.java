package Java24Maps;

import java.util.HashMap;
import java.util.Map;
//Create a Map that will store Employee name and salary. Write a logic to
//// retrieve an employee who gets the highest salary. Output should be in
//// the below format John Smith=$100000
public class Task3 {
    public static void main(String[] args) {


        Map<String,Integer> employee=new HashMap<>();
        employee.put("Germeen",2000);
        employee.put("John",4000);
        employee.put("Steven",3000);
        employee.put("Seno",1000);

        String name="";
        int salary=0;
        for (var e:employee.entrySet()){
            if (e.getValue()>salary){
                name=e.getKey();
                salary=e.getValue();
            }
        }
        System.out.println(name+" "+salary);







    }
}
