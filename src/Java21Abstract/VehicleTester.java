package Java21Abstract;

public class VehicleTester {
    public static void main(String[] args) {

      Vehicle [] array={new Car("Toyota","Prius",87,"Silver"),
      new Truck("Chevrolet","M3",96,"2 cabinets"),
      new Motorcycle("Davidson","P3",80,2)};

for (int i =0; i< array.length; i++){

    Vehicle V=array[i];
    V.print();
    V.startEngine();
    V.stopEngine();
    V.fuelUp();
    System.out.println(".........................");



}


    }
}
