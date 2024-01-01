package Java21Abstract;

public abstract class Animal {// if class abstract we can not create object because there are methods without body (unimplemented)
                              // but if we have fields in abstract class we can have constructor to initialize fields
   public abstract void eat(); // final means can not override and abstract must override this method
    public void sleep(){
        System.out.println("Animals Sleep");
    }
    public abstract void speak();

}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }
    public void speak(){
        System.out.println("Wuf Wuf");
    }

}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cats like to eat Fish");
    }
    public void speak(){
        System.out.println("Meow Meow");
    }


}