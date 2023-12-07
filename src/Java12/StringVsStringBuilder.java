package Java12;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        String address = "USA";
        String address1 = "USA";
        String address2 = "USA";
        String address3 = "USA";
        String address4 = "USA";
        String address5 = "USA";
        address5 = "Canada";

        String ad = "Canada";
        StringBuffer sb = new StringBuffer("Hello");
sb.append(" Batch ");
        System.out.println(sb);

        StringBuilder strB = new StringBuilder("study");
        strB.append(" tonight");
        System.out.println(strB);

    }
}