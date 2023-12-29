package Java18;

public class Animal {

   private String name;
   private String color;
   private   int age;
   private double weight;
   // we need create constructor to initialize privet fields


    public Animal(String name, String color, int age, double weight) {   // public to be access to any class
        this.name = name;            // this keyword wil distinguish local var between instance var
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    public void speak (){
        System.out.println("Animal speaking ");
    }
    public void sleep(){
        System.out.println("ZZZzzzzZZZZZ");
    }
}

class Dog extends Animal {
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);  // use super to call constructor from parent class
    }

    public void speak() {    // over ride method the same of parent class but need to change it without create new method
        System.out.println("Wuff Wuff");
    }  // over riding the same return type ,same name diff sout
                                                              // but over load diff number , diff parameter ,same name and could be diff return type

    public void Demo(String str) {
        System.out.println(str); //>> pass info to another method
        printlen(str);
    }
    void printlen(String word){
        System.out.println(word.length());
    }
}