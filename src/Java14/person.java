package Java14;

public class person {
    static int noOfEye = 2;// static var  Static variables are created
    // using static keyword they are also created outside of
    //blocks of code like methods,loops etc.that is the same
    // in each object so to save memory we create static to say
    // this is variable the same in each object
    // only one location
    String name;  //instance var
    int age;
    double weight;

    //instance var access anywhere inside class
    void printIfo() {

        System.out.println(name + " " + age + " " + weight);
    }


    void printNoOfEyes() {
        System.out.println(noOfEye);
    }

}