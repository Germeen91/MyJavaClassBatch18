package Java15;
//Write a Teacher class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  Teacher using displayInfo method.
public class Teacher {

    private String name;     //better to private instance var

    private String address;



    public Teacher(String name,String address){    // better to be public
                                       // click right > Generate > constructor

        this.name=name;
        this.address=address;
    }
    public void print(){   // better public for constructor
        System.out.println(name+" "+address);
    }


    public static void main(String[] args) {
        Teacher obj=new Teacher("Germeen","California");
        obj.print();
    }

}
