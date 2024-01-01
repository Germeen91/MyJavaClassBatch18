package Java19Poly;


public class computerTester {
    public static void main(String[] args) {

      computer [] array={new Apple("Apple",2020),new Lenovo("Lenovo",2019),new HP("HP",2022),new Dell("Dell",2023)};

       for (int i=0; i< array.length; i++){

           computer c=array[i];
           c.print();
           c.speed();

       }



    }
}
