package Java18;

public class person {

    private String name;
    private int age;
    private  double weight;

    public person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){     //sout just prints what's in the method, return is returning the outcome value
        return name;
    } // to store and print out name field separately
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class  student extends person {
    private double marks;

    public student(String name, int age, double weight, double marks) {
        super(name, age, weight);
        this.marks = marks;
    }

    void printMarks() {
        System.out.println(marks);
    }

    public void printInfo(){ // overriding method
      super.printInfo();
        System.out.println(marks);

    }
}