package Java10;

public class DogTester {
    public static void main(String[] args) { // to execute your cod

  //called creating an abject of the class
        Dog dog1=new Dog();  // name of class(class is now datatype) + name variable



      /*
      Dog => Data Type
      dog1=>is a variable that holds the object
       new Dog(); => Creating the object of dog class
       */



      dog1.name="Jaky";
        dog1.breed="German";
        dog1.weight=15;
        dog1.color="black";
        dog1.age=5;


        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
        System.out.println(dog1.age);

        dog1.bark();
        dog1.sleep();

        System.out.println(".................");

Dog dog2=new Dog();

dog2.name="Leo";
dog2.breed="Persian";
dog2.weight=8;
dog2.color="White";

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();





















    }
}
