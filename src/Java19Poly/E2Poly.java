package Java19Poly;
// same class Animal
public class E2Poly{
    public static void main(String[] args) {

        Dog d1=new Dog("Jacky","Brown",10,25);  // we store object of dog class inside var d1
        Dog d2=new Dog("Jacky","Brown",10,25);  // we store object of dog class inside var d2
        cat c1=new cat("Jacky","Brown",10,25);
        Animal a1=new Animal("Jacky","Brown",10,25);

        Animal []arr={d1,d2,c1,a1}; //(up casting) store as parent name because it is big
              // they already cat , dog converted to animal



Animal a2=arr[0];  // index 0 is d1  we put Animal not Dog because it is the bigger(up casting)
a2.printInfo();





    }
}
