package Java12;

public class  E3StringBuilder {
    public static void main(String[] args) {

// builder is faster and mutable but takes more space
        // String is slow and immutable but not takes more space and

        // it is build because every step builds on the previous
        StringBuilder sb=new StringBuilder("Hello World");
        System.out.println(sb.reverse());

        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(1,"H"));
        System.out.println(sb.append(" im happy"));



    }
}
