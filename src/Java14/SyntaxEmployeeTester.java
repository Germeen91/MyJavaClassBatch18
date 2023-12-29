package Java14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {


        SyntaxEmployee p1=new SyntaxEmployee();
        p1.empID=80;
        p1.salary=5000;
        p1.print();
        System.out.println("CEO is: "+SyntaxEmployee.CEO);
// static var we can use it without object
        // just print it


    }
}
