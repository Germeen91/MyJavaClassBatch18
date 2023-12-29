package Java18;
/*1)Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods*/
public class HW1Car {
    private String make;
    private String model;
    private  int year;

    public void CalculateRentalPrice(int NumberOfRentalDays ){
        double RentalPrice=500;
        System.out.println("Total Of Rental Price For Car Is : "+(RentalPrice*NumberOfRentalDays));
    }

    public HW1Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
 class LuxuryCar extends HW1Car{

    public LuxuryCar(String make, String model, int year) {
        super(make, model, year);
    }

     public void CalculateRentalPrice(int NumberOfRentalDays ){
         double RentalPrice=250;
         System.out.println("Total Of Rental Price For Luxury Car Is : "+(RentalPrice*NumberOfRentalDays));
     }
}

class EconomyCar extends HW1Car{
    public EconomyCar(String make, String model, int year) {
        super(make, model, year);
    }

    public void CalculateRentalPrice(int NumberOfRentalDays) {
        double RentalPrice=200;
        System.out.println("Total Of Rental Price For Economy Car Is : "+(RentalPrice*NumberOfRentalDays));
    }

    public static void main(String[] args) {

       HW1Car obj=new HW1Car("KIA","Forti",2023);
        obj.CalculateRentalPrice(3);

        LuxuryCar obj1=new LuxuryCar("Frari","Roma",2021);
        obj1.CalculateRentalPrice(6);

        EconomyCar obj2=new EconomyCar("Toyota","Prius",2020);
        obj2.CalculateRentalPrice(4);
    }
}