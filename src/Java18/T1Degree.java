package Java18;
/*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.*/
public class T1Degree {

   public void getPrerequisite(){
       System.out.println("To get a degree you need high school diploma");
   }

}

class Bachelors extends T1Degree {
}
class Masters extends T1Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma from your country");
    }




    public static void main(String[] args) {
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();

    }
}