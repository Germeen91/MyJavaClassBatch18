package Java21Abstract;

public class AnimalTester {
    public static void main(String[] args) {


Cat c=new Cat();
c.eat();
c.speak();
c.sleep();


Animal []array={new Cat(),new Dog()};

for (int i=0; i< array.length; i++){

    Animal P=array[i];
    P.eat();
    P.speak();
    P.sleep();
}

    }
}
