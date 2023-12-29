package Java13;

public class MathTester {

    public static void main(String[] args) {

//[program code here we call the method ]

        Math obj= new Math ();  // create an object of class name
// not need return type
        obj.add(10,5);   //  there are two argument we put them as numbers in parentheses
        // because in the class there are parameter
        // the method not empty
// here the method in the class has print so we not call it again


        int r= obj.multiply(10,2); //the return type of method in class is int
                                   // so we have to make return int here also
        System.out.println(r);      // here the method in the class not has print so we have to call it here
        System.out.println(obj.multiply(10,2)); //OR



    }

}
