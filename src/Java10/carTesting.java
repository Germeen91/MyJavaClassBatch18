package Java10;

public class carTesting {
    public static void main(String[] args) {


        //Create an object from the name of class
        car bmw=new car();


        bmw.model="17";
        bmw.color="Blue";
        bmw.price=120000;
        bmw.make="BMW";
        System.out.println(bmw.model);
        System.out.println(bmw.color);
        System.out.println(bmw.price);
        System.out.println(bmw.make);

        bmw.honk();
        bmw.ApplyBrake();
        bmw.drive();



    }
}
