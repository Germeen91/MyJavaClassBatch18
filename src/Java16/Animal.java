package Java16;


// hierarchical  inheritance  (one parent with more class   dog + cat)
public class Animal {
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
