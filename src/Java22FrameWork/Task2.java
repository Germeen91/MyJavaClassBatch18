package Java22FrameWork;

import java.util.ArrayList;

/*Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace the whole word with water. */
public class Task2 {
    public static void main(String[] args) {
/*Create an arrayList of drinks call it.
* if any drink has letter " a " or "e" replace the whole word with water */
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("juice");
        drinks.add("mango");
        drinks.add("lemon");

        for (int i=0; i<drinks.size(); i++){
            if (drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
            }
        }





