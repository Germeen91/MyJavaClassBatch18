package Java18;
/*Overload is changing in parameters but Overriding is change out of methods*/
public class parent {
//
    //if we put final keyword before any method no other class can override that method
    // if use final before name of class means can not inheritance classes of this class

    /* final void marry(){
        System.out.println("Marry the girl that we have selected for you");
    }*/
    /*public final class  parent {*/
    void marry(){
        System.out.println("Marry the girl that we have selected for you");
    }

}


class karimi extends parent{
    void marry(){
        System.out.println("I want to marry scarett johan");  // modify the method same name from parent (method over ridding)
    }

}
class Tester{
    public static void main(String[] args) {

        karimi obj=new karimi();
        obj.marry();           // we print that method from the child class

    }
}