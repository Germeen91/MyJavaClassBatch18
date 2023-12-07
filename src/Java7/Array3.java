package Java7;

public class Array3 {
    public static void main(String[] args) {

        char []gender=new char[3]; /// the capacity only three items " size , number of elements "

        gender[0]='f';
        gender[1]='m';
        gender[2]='y';
        // gender[3]='l';  will not execute because the maximum is 3 items only
        System.out.println(gender[2]);



    }
}
