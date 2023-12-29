package Java19;

/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/
public class student {


    public void study(){
        System.out.println("Hard work");
    }
}
class syntaxStudent extends student {

    public void study() {
        System.out.println("Hard work as you can");
    }


    void play() {
        System.out.println("waste time");
    }
}
class collegeStudent extends student{
    public void study(){
        System.out.println("i will learn java");
    }
}
class schoolStudent extends student{
    public void study(){
        System.out.println("i can not study but i will try");
    }
}
