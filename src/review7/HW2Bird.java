package review7;
/*Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors
make fields private and define printInfo methods as well create the object of each class and call the methods*/
public class HW2Bird {
    private String name;
    private String color;
    private double weight;
    private  int age;

    public HW2Bird(String name, String color, double weight, int age){
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.age=age;
    }
    public void print1(){
        System.out.println("Name of Bird: "+name+ " "+" Color: "+color+" "+" Weight: "+weight+" Age: "+age);
    }
}

class sparrow extends HW2Bird {
    private int speed;

     public sparrow(String name, String color, double weight, int age, int speed) {
         super(name, color, weight, age);
          this.speed=speed;
     }
     public void print2(){
         System.out.println("Speed: "+speed);
     }
 }
  class parrot extends HW2Bird {

    private String feature;

      public parrot(String name, String color, double weight, int age, String feature) {
          super(name, color, weight, age);
          this.feature=feature;
      }

      public void print3(){
          System.out.println("Unique Feature: "+feature);
      }

 }
 class BirdTester{
     public static void main(String[] args) {

         sparrow obj=new sparrow("Sparrow","white",3.5,1,7);
         obj.print1();
         obj.print2();

         parrot obj2=new parrot("Parrot","colorfull",4.5,2,"Copy People");
         obj2.print1();
         obj2.print3();

     }
 }
