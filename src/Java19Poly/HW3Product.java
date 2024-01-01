package Java19Poly;
/*3)E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.*/
public class HW3Product {
    private String name;
    private int price;

private String SKU;

    public HW3Product(String name, int price, String SKU) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
    }

    void printInfo(){
        System.out.println(name+" The Price is : "+price+" Stock Keeping Unit is : ("+SKU+")");
    }
    void calculateTax(){
        double Tax=.10;
        System.out.println("The price After Tax : "+(price*Tax));
    }
}
class Electronics extends HW3Product{

    public Electronics(String name, int price, String SKU) {
        super(name, price, SKU);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }

    void calculateTax(int price){
        double Tax=.20;
        System.out.println("The price After Tax : "+(price*Tax));
    }
    void applyWarranty(){
        System.out.println("Apply Warranty now get free services for 5 years");
    }
}
class Clothing extends HW3Product{
    public Clothing(String name, int price, String SKU) {
        super(name, price, SKU);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }

    void calculateTax(int price){
        double Tax=.5;
        System.out.println("The price After Tax : "+(price*Tax));
    }
}
class Furniture extends HW3Product{
    public Furniture(String name, int price, String SKU) {
        super(name, price, SKU);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }

    void calculateTax(int price){
        double Tax=.20;
        System.out.println("The price After Tax : "+(price*Tax));
    }
}
class Books extends HW3Product{
    public Books(String name, int price, String SKU) {
        super(name, price, SKU);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }

    void calculateTax(int price){
        double Tax=.8;
        System.out.println("The price After Tax : "+(price*Tax));
    }
}
class ProductTester{
    public static void main(String[] args) {

       HW3Product []array={new Electronics("LabTop",1200,"ATS125"),
       new Clothing("Pants",25,"DRE246"),
       new Furniture("Tables",550,"FUO144"),
       new Books("Baby Stories",15,"PY1487")};


        for (int i=0; i< array.length; i++){

            HW3Product P=array[i];
            P.printInfo();
            P.calculateTax();
            if (P instanceof Electronics){
                Electronics E=(Electronics) P;
                E.applyWarranty();
            }

            System.out.println("...................");

        }


    }
}