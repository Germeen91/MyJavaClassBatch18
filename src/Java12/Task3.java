package Java12;

public class Task3 {
    public static void main(String[] args) {

/*You have a String a=”Is it saturday?
Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?*/

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";

        String []p=a.split("[?]"); // ask to split based on (?) in array split method

        System.out.println(p.length); //
///////////////////////////////////////
        System.out.println(a.split("[?]").length);

    }
}
