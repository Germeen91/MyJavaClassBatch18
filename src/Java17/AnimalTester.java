package Java17;

public class AnimalTester {
    public static void main(String[] args) {


       // Dog d=new Dog();
      //  d.printInfo();
        //we will get null because
        // we did not initialize fields
        //if we try to initialize fields
        // d.name=  >  get error because fields are privet

        // they are privet so
        // constructor help us to pass fields those are privet

       // Animal a=new Animal("Jacky","white",12,22);
        //
       Dog d=new Dog("Jacky","white",12,22);

       d.printInfo();

       cat c=new cat(); // null because empty constructor
       c.printInfo();

    }

}
