package Java16Inheritance;

public class person {  // super class  or parent class
    String name;
    int age;
    double weight;

    void printInfo(){
        System.out.println(name+ " "+age+ " "+weight);
    }
}
    class student extends person {  // single inheritance  (one parent  one class )

     char grade;              // we dont need to repeat the same fields again
       void study() {            // but if we have own fields not put in parent class
       }
           void print() {
               System.out.println("His grade is "+grade);
           }
       }



    class studentTester {

        public static void main(String[] args) {

        student s=new student();
        s.age=12;
        s.name="Feto";
        s.weight=40;
        s.grade='A';
        s.printInfo();
        s.print();

        }
    }

