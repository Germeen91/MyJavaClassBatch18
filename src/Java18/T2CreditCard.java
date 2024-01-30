package Java18;
/*Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.*/


public class T2CreditCard {

    void CalculateInterest(double balance){
        double interest=balance*0.05;
        System.out.println( "Interest on "+balance+" is "+interest);
    }
}
class Visa extends T2CreditCard{
    void CalculateInterest(double balance){   // overriding method
        double interest=balance*0.07;
        System.out.println( "Interest on "+balance+" is "+interest);
    }
}
class AX extends T2CreditCard{
    void CalculateInterest (double balance){
        double interest=balance*0.09;
        System.out.println( "Interest on "+balance+" is "+interest);
    }

    public static void main(String[] args) {
        Visa v=new Visa();
        v.CalculateInterest(1000);
        AX a=new AX();
        a.CalculateInterest(1000);
    }
}