package review7;
/*Create a class named Vehicle. If no arguments are passed while creating an object of the class,
 it should print "I love vehicles". If a String representing the type of vehicle (like "Car", "Bike") is passed,
  it should print "I love [VehicleType]".
 For example, if "Car" is passed, it should print "I love Car"*/
public class HW6Vehicle {
    public void print(){
        System.out.println("I love vehicles");
    }
    public void VehicleType(String car){
        System.out.println("I love "+ car);
    }


    public static void main(String[] args) {
        HW6Vehicle obj=new HW6Vehicle();
        obj.print();

        HW6Vehicle obj1=new HW6Vehicle();
        obj1.VehicleType("BMW");
    }
}
