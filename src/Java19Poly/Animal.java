package Java19Poly;

public class Animal {

    private  String name;
    private String color;
    private  int age;
    private double weight;


    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println(name +" "+color+" "+age+" "+ weight);
    }
}
class Dog extends Animal{
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
    public void bark(){
        System.out.println("Wuf Wuf");
    }
}

class cat extends Animal{
    public cat(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void meow (){
        System.out.println("Meow Meow");
    }
}