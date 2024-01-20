package Java24Maps;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();
        names.add("Fah");
        names.add("Maria");
        names.add("Ray");
        names.add("Hay");
        names.add("Jay");

        names.forEach(e-> System.out.println(e));

        System.out.println("**************************");
        names.forEach(e-> {
            if(e.contains("a")){
                System.out.println(e);}

        });





        System.out.println("********************************");
        names.removeIf(d->d.length()>3); // the letter of name less than 3
        System.out.println(names);

       // names.stream().   >> will give all methods we have








    }
}
