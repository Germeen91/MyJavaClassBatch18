package review11;

import java.util.LinkedHashMap;

public class E3Maps {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> student=new LinkedHashMap<>();

        student.put("John",95);
        student.put("Adam",8);
        student.put("Muh",92);
        student.put("Kat",91);
        student.put("Kari",90);
        student.entrySet().removeIf(x->x.getValue()<90 ||x.getKey().contains("a"));
        System.out.println(student);




    }
}
