package Java14;

public class Dog {

    String name;  // instance var inside a class or with class but outside block of code
                  // can access anywhere inside class except static methods

    void printInfo(){

        System.out.println(name);
    }


    public static void main(String[] args) {


        Dog d1=new Dog();
        d1.name="Jacki";  // name local variable because inside blocks of codes

        d1.printInfo();

        new Dog().printInfo();   //OR print like this chaining print
    }




}
