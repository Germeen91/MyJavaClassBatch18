package Java22FrameWork;

import java.util.ArrayList;

public class E5ArrayList {

    // print yes if you have letter 'o' otherwise no for all names
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("steven");
        names.add("germeen");
        names.add("Jonathan");
        names.add("mark");
        names.add("marvi");

        for (int i=0; i< names.size(); i++){
 /* System.out.println(names.get(i));
        String s=names.get(i);*/

            if(names.get(i).contains("o")){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }





    }
}
