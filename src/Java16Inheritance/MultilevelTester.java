package Java16Inheritance;

public class MultilevelTester {
    public static void main(String[] args) {

        // create obj for the last class because already has all methods by inheritance
        Audi a=new Audi();
        a.color="Black";
        a.print();
        a.print1();
        a.print3();
    }
}

class Vehicle{
    String color;
    void print(){
        System.out.println(color);
    }
}

class Car extends Vehicle{
    int noOfDoors=4;
    void print3(){
        System.out.println(noOfDoors);
    }
}

class Audi extends Car{

    boolean badEngines=true;
    void print1(){
        System.out.println(badEngines);
    }

}


