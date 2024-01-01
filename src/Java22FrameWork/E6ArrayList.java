package Java22FrameWork;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

/*if name contain letter 'o' replace it with java*/

        ArrayList<String> names = new ArrayList<>();
        names.add("steven");
        names.add("germeen");
        names.add("Jonathan");
        names.add("mark");
        names.add("marvi");
for (int i=0; i< names.size();i++){

    if (names.get(i).contains("o")){
     names.set(i,"java");
    }
}
        System.out.println(names);


    }
}