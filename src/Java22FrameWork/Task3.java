package Java22FrameWork;

import java.util.ArrayList;

/*Create an arrayList of words. Remove every word that ends with “e”*/
public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Carlose");
        words.add("Kim Jong Une");
        words.add("Nazi");
        words.add("Sherif");

        for (int i = 0; i < words.size(); i++) {  // enhanced loop not working here because of size is dynamic
            if(words.get(i).endsWith("e")){
                words.remove(i);  // Array list is dynamic it can change its size at runtime
                i--;               // because arraylist is continuing based on the previous, so we need decrease
            }
        }
        //Or no need loop
        System.out.println(words);
        /////////////////////////////////////////////////////

        words.removeIf(x->x.endsWith("a"));// Lambda expression    x is just Variable name
        System.out.println(words);

        ///////////////////////////////////////
        words.removeIf(x->x.contains("e"));
        System.out.println(words);



        words.forEach(x-> System.out.println(x));  // to print direct without Loop
    }
}
