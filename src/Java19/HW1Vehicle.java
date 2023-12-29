package Java19;
/*1) Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.*/
public class HW1Vehicle {
    private int speed;
    private String color;
    private String fulType;

    public HW1Vehicle(int speed, String color, String fulType) {
        this.speed = speed;
        this.color = color;
        this.fulType = fulType;
    }
    public void print(){
        System.out.println("Speed Vehicle "+speed+" color "+color+" FulType "+fulType);
    }
    void accelerate(){
        System.out.println("Speed up");
    }
    void brake(){
        System.out.println("Stop....");
    }
}
class Car extends HW1Vehicle{
    public Car(int speed, String color, String fulType) {
        super(speed, color, fulType);
    }

    @Override
    public void print() {
        super.print();
    }

    void accelerate(){
        System.out.println("The car is accelerating");
    }
    void brake(){
        System.out.println("car stooped now");
    }
    void Trick(){
        System.out.println("Do drifting");
    }
}
class Truck extends HW1Vehicle{
    public Truck(int speed, String color, String fulType) {
        super(speed, color, fulType);
    }

    @Override
    public void print() {
        super.print();
    }
    void accelerate(){
        System.out.println("The Truck is slow accelerating");
    }
    void brake(){
        System.out.println("Truck takes long time stop");
    }
    void carLoad(){
        System.out.println("Truck can load 100 car ");
    }
}
class Motorcycle extends HW1Vehicle{
    public Motorcycle(int speed, String color, String fulType) {
        super(speed, color, fulType);
    }

    @Override
    public void print() {
        super.print();
    }
    void accelerate(){
        System.out.println("Speed up more ");
    }
    void brake(){
        System.out.println("Hard brake");
    }

    void wheels(){
        System.out.println("Do drift easily");
    }
}
class Bicycle extends HW1Vehicle{
    public Bicycle(int speed, String color, String fulType) {
        super(speed, color, fulType);
    }
    @Override
    public void print() {
        super.print();
    }
    void accelerate(){
        System.out.println("Speed more and more ");
    }
    void brake(){
        System.out.println("braking Easily");
    }

    void drift(){
        System.out.println("can not do drift");
    }
}
 class HW1VehicleTester{
    public static void main(String[] args) {

        HW1Vehicle [] array={new Car(120,"Blue","unleaded"),new Truck(50,"White","Diesel"),
        new Motorcycle(30,"Black","Premium"),new Bicycle(10,"Gray"," Human Power")};

        for (int i=0; i< array.length; i++){

            HW1Vehicle V=array[i];
            V.print();
            V.accelerate();
            V.brake();

            if (V instanceof Truck){
                Truck T=(Truck) V;
                T.carLoad();
            }
            if (V instanceof Motorcycle){
                Motorcycle M =(Motorcycle) V;
                M.wheels();
            }
            if (V instanceof Bicycle){
                Bicycle B=(Bicycle) V;
            }
            System.out.println("......................");
        }
    }
}