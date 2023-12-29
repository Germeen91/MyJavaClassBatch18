package Java19;
/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods*/
public class computer {
    String name;
    int year;

    public computer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void print (){
        System.out.println(name+" "+" model :"+year);
    }
    void speed(){
        System.out.println("Very Fast");
    }
}
class Apple extends computer{
    public Apple(String name, int year) {
        super(name, year);
    }
    void print (){
        System.out.println(name+" "+" model :"+year);
    }
    void speed(){
        System.out.println("Hanging sometimes ");
    }
}
class Lenovo extends computer{
    public Lenovo(String name, int year) {
        super(name, year);
    }

    void print (){
        System.out.println(name+" "+" model :"+year);
    }
    void speed(){
        System.out.println("So Slow");
    }
}
class HP extends computer{
    public HP(String name, int year) {
        super(name, year);
    }
    void print (){
        System.out.println(name+" "+" model :"+year);
    }
    void speed(){
        System.out.println("Not working as customer expected");
    }
}
class Dell extends computer{
    public Dell(String name, int year) {
        super(name, year);
    }
    void print (){
        System.out.println(name+" "+" model :"+year);
    }
    void speed(){
        System.out.println("working Perfect");
    }
}
