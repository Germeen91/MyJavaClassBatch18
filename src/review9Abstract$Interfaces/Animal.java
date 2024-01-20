package review9Abstract$Interfaces;

public abstract class Animal {
   private String name;
    private String color;
    private int age;

    Animal(String name , String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    String getName(){
        return name;
    }
  public abstract void eat();

   public abstract void speak();
  public void printInfo(){
       System.out.println(name+" "+color+" "+age);
   }
}
class Dog extends Animal{

    String breed;   // own field
    public Dog (String name, String color, int age, String breed){
        super(name,color,age);
        this.breed=breed;

    }

    public void eat(){   //if parent has abstract methods child must implement these methods
        System.out.println("Dogs like to eat meat");
    }

    public void speak(){
        System.out.println("Wuf Wuf");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(breed);
    }

    public void run(){
        System.out.println("run");
    }
}
class Cat extends Animal{

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}