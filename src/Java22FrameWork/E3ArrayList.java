package Java22FrameWork;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList <String>names=new ArrayList<>();
        names.add("Germeen");
        names.add("Beshoy");
        names.add("Damla");
        names.add("Kamla");
        names.add("feto");
     // names.removeAll(names);
   //System.out.println(names);

        System.out.println(names.size());
        System.out.println(names.contains("Hanana"));
        System.out.println(names.remove("feto"));
        System.out.println(names.remove(3));
        System.out.println(names.get(0));

        names.set(0,"Steven")  ;       // update, change, replace element on specific index
        System.out.println(names);

names.add(0,"koke");
        System.out.println(names);  // to add extra in index 0  not update

        System.out.println(names.indexOf("Damla"));

    }
}
