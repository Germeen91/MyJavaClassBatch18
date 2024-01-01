package Java22FrameWork;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        System.out.println(names.size());
        names.add("Beshoy");

        System.out.println(names.contains("Germeen"));
                                       //the size is dynamic it is growing by adding element
        System.out.println(names.size());
        names.remove("Beshoy");
        System.out.println(names.size());

    }
}
