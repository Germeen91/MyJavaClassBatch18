package Java16;


//Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
public class Teacher {


    String name;
    int age;

    void sleep(){
        System.out.println("ZzzzZZzzz..");
    }
    void eat(){
        System.out.println("Hum Hum");
    }
    void speak(){
        System.out.println("Pla Pla...");
    }
    void teach(){
        System.out.println("explaining");
    }

    void printInfo(){
        System.out.println("my name is "+name +" Iam "+age+" Years old");
    }

}

class MathTeacher extends Teacher{

    String Subject;
    void math(){
        System.out.println(Subject +" 1+1= 2");
    }
}

class ChemistryTeacher extends Teacher{
    String subject1;
    void chemistry(){
        System.out.println(subject1+" chemical");
    }
}

class PianoTeacher extends Teacher {

    String subject2;
    void piano(){
        System.out.println(subject2+" Ting Tong");
    }

}

class TeacherTester{
    public static void main(String[] args) {

        MathTeacher m=new MathTeacher();
        m.name="john";
        m.age=25;
        m.printInfo();
        m.sleep();
        m.speak();
        m.eat();
        m.teach();
        m.Subject="Mathematics";
        m.math();

        System.out.println("...........................");

        ChemistryTeacher c=new ChemistryTeacher();
        c.name="steven";
        c.age=30;
        c.printInfo();
        c.sleep();
        c.speak();
        c.eat();
        c.teach();
        c.subject1="Chemistry";
        c.chemistry();

    }
}
