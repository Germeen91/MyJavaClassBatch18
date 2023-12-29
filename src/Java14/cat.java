package Java14;

public class cat {

    // instance variable
    String name="kitti";


    void printName(){

        //Local variable  if the instance var and local var same name the priority print for local
        String name="pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        cat c=new cat();

        c.printName();
        System.out.println(c.name);
    }
}
