package Java22FrameWork;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();  // fixed array size the size is dynamic it is growing by adding element
// you have to specify data type string , int ........ to make control
        names.add("Maria");
        System.out.println(names.size());

        names.add("germeen");  // then store what do you want
        names.add("Marcellino");
        names.add("Steven");
        System.out.println(names.size());  // every action will record and affect
        System.out.println(names);
    }
}
