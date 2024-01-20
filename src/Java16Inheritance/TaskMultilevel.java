package Java16Inheritance;

//Write program for multilevel inheritance where class Z inherits from class Y and Class Y inherits from Class X.

public class TaskMultilevel {
    public static void main(String[] args) {
z obj=new z();
obj.print();
obj.print2();
obj.print3();


    }
}

class x {
    void print (){
        System.out.println("HaHa");
    }

}
class y extends x{
    void print2(){
        System.out.println("goody");
    }

}
class z extends y{
void print3(){
    System.out.println("god is love");
}
}