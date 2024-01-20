package Java24Maps;

import java.util.Map;
import java.util.TreeMap;
//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
//Example of key is 1 , 2 ,3 etc.
public class person {
    private  String name;
    private  int age;
    private double salary;

    public person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println(name+" "+age+" "+salary);
    }

    public static void main(String[] args) {

        Map<Integer,person> S=new TreeMap<>();
S.put(1,new person("Germeen",32,2000));
        S.put(2,new person("Steven",25,3000));
        S.put(3,new person("Koke",20,4000));
        S.put(4,new person("Seno",32,1000));

        S.forEach((key,personObj)->{
            System.out.println("id:"+key);
            personObj.printInfo();
        });

        System.out.println("************************");
        for (var e:S.entrySet()){
            System.out.println(e.getKey());
            e.getValue().printInfo();
        }

    }
}
