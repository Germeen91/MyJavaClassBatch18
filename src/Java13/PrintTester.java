package Java13;

public class PrintTester {
    public static void main(String[] args) {


        Printer p=new Printer();  // create an object of class name


        p.printHello();  // no putting anything in parentheses because in the class no parameter
                          // the method empty


   p.printWord("Java");  // we have String parameter so we print parameter



   p.printManyTimes("Java",5); // we have 2 parameter String , int

    }
}
