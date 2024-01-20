package Java16Inheritance;

public class AnimalTester {

    public static void main(String[] args) {
/// inheritance no prevent reputation of fields for the classes
// single we create obj for each child class
        Dog d=new Dog();
        d.name="Jakcy";
        d.age=10;
        d.color="black";
        d.weight=22;
        d.printInfo();
        d.bark();
        d.sleep();


        cat c=new cat();
        c.name="lulu";
        c.age=2;
        c.color="white";
        c.weight=3;
        c.printInfo();
        c.sleep();



    }
}
