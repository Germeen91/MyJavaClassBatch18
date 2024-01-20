package review11;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> student=new LinkedHashMap<>();

        student.put("John",95);
        student.put("Adam",8);
        student.put("Muh",92);
        student.put("Kat",91);
        student.put("Kari",90);

        System.out.println(student);


student.forEach((k,v)->{

    if (v>90)

    System.out.println(k+" "+v);
});
/////////////////////////////////////////////////////////////////////////

        ArrayList<String> names=new ArrayList<>();

        student.forEach((k,v)->{

            if (v>90)
names.add(k);
                System.out.println(names);
        });




    }
}
