package Java21;

/*2)Vehicle Management System: Design a base class Vehicle with methods like startEngine(), stopEngine(), fuelUp(),
 and fields like make, model, and fuelLevel. Create subclasses like Car, Truck, and Motorcycle, each with specific
 implementations for the methods, considering their unique characteristics.*/
public abstract class Vehicle {
    private String make;
    private String model;
    private int fuelLevel;
    Vehicle(String make,String model,int fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;
    }
    public void print(){
        System.out.println(make+" "+model+" "+fuelLevel);
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
}

class Car extends Vehicle{
    private String color;
    Car(String make, String model,int fuelLevel,String color){
        super(make,model,fuelLevel);
        this.color=color;
    }
    public void print(){
        super.print();
        System.out.println("Color "+color);
    }
    public  void startEngine(){
        System.out.println("Turn on your Car key");
    }
    public  void stopEngine(){
        System.out.println("Turn off your Car key");
    }
    public  void fuelUp(){
        System.out.println("Fuel up your Car Tank");
    }
}
class Truck extends Vehicle{
private String Size;
Truck(String make, String model,int fuelLevel,String Size){
    super(make,model,fuelLevel);
    this.Size=Size;
}
    public void print(){
        super.print();
        System.out.println("It has "+Size);
    }
    public  void startEngine(){
        System.out.println("Turn on your Truck key");
    }
    public  void stopEngine(){
        System.out.println("Turn off your Truck key");
    }
    public  void fuelUp(){
        System.out.println("Fuel up your Truck Tank");
    }
}
class Motorcycle extends Vehicle{
    private int numberOfWheels;
    Motorcycle(String make, String model,int fuelLevel,int numberOfWheels){
        super(make,model,fuelLevel);
        this.numberOfWheels=numberOfWheels;
    }
    public void print(){
        super.print();
        System.out.println("It has "+numberOfWheels+" Wheels");
    }
    public  void startEngine(){
        System.out.println("Turn on your Motorcycle key");
    }
    public  void stopEngine(){
        System.out.println("Turn off your Motorcycle key");
    }
    public  void fuelUp(){
        System.out.println("Fuel up your Motorcycle Tank");
    }
}