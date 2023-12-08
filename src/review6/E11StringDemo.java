package review6;

public class E11StringDemo {
    public static void main(String[] args) {

        String str="My name is James my Number is 91245687";

          String number = str.replaceAll("[^0-9]","");

        System.out.println(number);


StringBuilder ad=new StringBuilder("Java");
        System.out.println(ad);

    }
}
