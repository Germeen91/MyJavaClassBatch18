package review9Abstract$Interfaces;

public class PolyTesterAnimal {
    public static void main(String[] args) {


Animal []animals={new Dog("Raino","Black",5,"German"),
new Cat("Bossy","White",4)};


// polymorphism must override
for (Animal a:animals){
    a.eat();
    a.speak();
    a.printInfo();
    System.out.println(a.getName());


    if (a instanceof Dog){
        ((Dog) a).run();
    }
}



/*Animal a=animals[0];
Dog d1=(Dog)a;
d1.run();*/








    }
}
