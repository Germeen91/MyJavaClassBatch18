package review10;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        /* int   >> primitive data type
        Integer >> Wrapper class
        */
        Integer i=12;  // class mean we have more methods
       // i. >method

        ArrayList <Integer> numbers=new ArrayList<>();  // number is var whose datatype is arrayList of integer
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

for (int p=0; p< numbers.size(); p++){
    System.out.println(numbers.get(p));
}

        System.out.println("***************");

for (Integer k:numbers){
    System.out.println(k);
}

Integer num=10;
int num2=num;  //from wrapper class to primitive data type >> unboxing

int u=12;
Integer n=u; //from primitive data type to wrapper class >> boxing

    }
}
