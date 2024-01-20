package Java23LinkedList;

import review10.Dog;

import java.util.LinkedList;

//-List allow duplicate data
//-Set not allow duplicate data
public class LinkedList1 {
    public static void main(String[] args) {
        //We create object of LinkedList
        // Inside the <> we write the name of the class (Whose objects we want to store)

     //   LinkedList< The name of the class>=new LinkedList<>();


        LinkedList <Dog> dogs=new LinkedList<Dog>();
Dog d1=new Dog("Raino","German",12);
dogs.add(d1);
    }
}
