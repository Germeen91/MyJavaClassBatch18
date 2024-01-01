package Java22FrameWork;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Germeen");
        names.add("Beshoy");
        names.add("Damla");
        names.add("Kamla");
        names.add("feto");

        System.out.println(names);

        //OR print by Loop

        for(int i=0; i<names.size();i++){  // loop to get element one by one
           System.out.println(names.get(i));  // print ArrayList by get method


        }
        System.out.println("********************");
for ( String p:names){
    System.out.println(p);
}




    }
}
