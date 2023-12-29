package Java13;

public class PrintTester {
    public static void main(String[] args) {


        Printer p=new Printer();  // create an object of class name


        p.printHello();  // no argument  in parentheses because in the class no parameter
                          // the method empty


   p.printWord("Java");  // we have String parameter so we print String argument



   p.printManyTimes("Java",5); // we have 2 argument String , int
                                       // like 2 parameter
    }
}
