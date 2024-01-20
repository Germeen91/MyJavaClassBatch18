package Java22FrameWork;

import java.util.Arrays;

public class E1CF{
    public static void main(String[] args) {

        String name="Maria";
        String []names={"zanan","halil","swati"};  // to store more data but it is limited and we can not modify
        System.out.println(Arrays.toString(names));
Arrays.sort(names);
        System.out.println(Arrays.toString(names));

String [] student=new String[100];    // array create places depend on you size that you must specify size but array List resize itself auto you dont must specify size
        System.out.println(student.length);
        System.out.println(Arrays.toString(student));


    }
}
