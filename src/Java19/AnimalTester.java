package Java19;

public class AnimalTester {
    public static void main(String[] args) {

        Animal a=new Dog("Jacky","Black",1,12);//casting data type
        //convert from parent class big >> small class Dog

        Dog d=(Dog)a;
        d.bark();
// that way good to store 1 obj



        double[] arr={10,20};

        Dog d1=new Dog("Jacky","Black",1,12);
        cat c1=new cat("Lovly","white",1,12);
        Animal a1=new Animal("Lovly","white",1,12);

        Animal [] animals={d1,c1,a1};

// array to store more obj

    }
}
