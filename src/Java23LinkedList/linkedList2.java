package Java23LinkedList;

import java.util.LinkedList;

public class linkedList2 {
    public static void main(String[] args) {

        // String here is the type of name class
        //String is the name of the class.
        LinkedList<String> s=new LinkedList<>();   // LinkedList & ArrayList ..>> They classes have used implement List interface
        s.add("kit");
        s.add("nam");
        s.add("kor");
        s.add("kim");
        s.add("rar");
        s.remove(0);
        System.out.println(s);
        System.out.println(s.size());

        //List<String> s=new LinkedList<>(); >> prefer because achieve polymorphism


    }
}
