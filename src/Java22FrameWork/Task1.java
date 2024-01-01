package Java22FrameWork;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

/*create an array list that will store 5 names into it
* Find out whether the given arrayList is empty or not
* Check whether the specific name is present in arrayList or not
* Find the size of your ArrayList and print all value from that */
        ArrayList<String> names=new ArrayList<>();
        names.add("steven");
        names.add("germeen");
        names.add("Jonathan");
        names.add("mark");
        names.add("marvi");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("germeen"));
        System.out.println(names.size());
        System.out.println(names);
/*if names contain letter 'o' replace it with "java"*/

for (int p=0; p <names.size(); p++){
    if (names.get(p).contains("o")){
        names.set(p,"Java");
    }

        }
        System.out.println(names);


    }
}
