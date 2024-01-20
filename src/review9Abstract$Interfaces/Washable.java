package review9Abstract$Interfaces;

public interface Washable {   // Interface cant have var, cons , obj      only static me
public static final  int age=20;   // by def public,  meth abstract ,var static
    void wash();   // we cant not but final because by def methods are abstract and abstract must override
}
interface Trustable{

    void trust();
}

class Horse implements Washable,Trustable{
    @Override
    public void wash(){
        System.out.println("Washing the horse");
    }

    @Override
    public void trust() {
        System.out.println("trusting in horse");
    }
}

class Car implements  Washable{
    @Override
    public void wash() {
        System.out.println("Washing the car");
    }
}

class Laptop{}

//Interface:
//Interfaces are like contracts which make sure that everybody is on the same page.
//They achieve this through abstraction.
//1.Inside the interface, all the methods are abstract and public by def.
//By default, all the variables we create inside the Interface are public-> static->final.
//  Interfaces themselves are also abstract and public by default.
//2.Inside interface, you cannot have instance variables. If there is no instance field, there is no need for
//  constructors or objects of Interface.
//The main of interface is everybody is following the same rules and everybody is on the same page.