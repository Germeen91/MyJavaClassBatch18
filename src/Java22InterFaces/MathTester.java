package Java22InterFaces;

public class MathTester {

    public static void main(String[] args) {

        // Calculator m=new Math();
        //Calculator m=new Calculator() ;
        // in direct way to create obj to interfaces class

        //because we can not create object of interfaces

        Math m=new Math();  // direct way with implement class
        int a=m.add(10,10);
        System.out.println(a);

        Calculator cc=new Math();// polymorphism parent class =new child class

    }
}
