package Java14;

public class personTester {
    public static void main(String[] args) {



        person p1=new person();
        p1.name="zeeshan";
        p1.age=22;
        p1.weight=60;
        p1.printIfo();
        System.out.println(person.noOfEye); //static var start with the name of class not object name (not need object)
p1.printNoOfEyes(); //OR create a method in class then print it here

        person p2=new person();
        p2.name="Sino";
        p2.age=25;
        p2.weight=50;
        person.noOfEye=3;  // to update static Var
        person.noOfEye++;   // OR
        p2.printIfo();
        System.out.println(person.noOfEye);

    }
}
