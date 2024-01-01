package Java22InterFaces;
//Interface:
//Interfaces are like contracts which make sure that everybody is on the same page.
//They achieve this through abstraction.
//1.Inside the interface, all the methods are abstract and public by def.
//By default, all the variables we create inside the Interface are public-> static->final.
//  Interfaces themselves are also abstract and public by default.
//2.Inside interface, you cannot have instance variables. If there is no instance field, there is no need for
//  constructors or objects of Interface.
//The main of interface is everybody is following the same rules and everybody is on the same page.
//we can not create obj of interfaces direct
public interface Human {
    void walk();

}
interface Person{
    void talk();
}
interface  Employee extends Human,Person{
    void work();
}

class SyntaxEmployee implements Employee{

    @Override
    public void walk() {
        System.out.println("walk.....");
    }

    @Override
    public void talk() {
        System.out.println("talk.....");
    }

    @Override
    public void work() {
        System.out.println("work....");
    }
}