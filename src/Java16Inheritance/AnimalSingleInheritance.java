package Java16Inheritance;


// hierarchical  inheritance  (one parent with more class   dog + cat)
public class AnimalSingleInheritance {
    String name;
    String color;
    int age;
    double weight;


    void sleep(){
        System.out.println("ZzZZzzzZzzz..");
    }

    public void printInfo(){
        System.out.println(name+ " "+color+" "+age+" "+weight);
    }
}
