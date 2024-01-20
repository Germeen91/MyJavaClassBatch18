package Java18;
/*2)Online Shopping Cart:
Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated*/
 class HW2Product {
    private String name;
    private double price;
    private double quantity;

    public HW2Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void print() {
        System.out.println(name + " " + price + " " + quantity);
    }

    public void NetPrice(double price,double quantity) { // if you will plan to chang or have math please define fields parameter
        System.out.println("The Price Of Product Is :" + (price*quantity));
    }
}
class Discount extends HW2Product {

        private double discount;

        public Discount(String name, double price, double quantity, double discount) {
            super(name, price, quantity);
            this.discount = discount;
        }

    @Override
    void print() {
        super.print();
        System.out.println(discount);
        }

    public void NetPrice(double price, double quantity, double discount) {
        System.out.println("The Price Of Product After discount Is :" +(price*quantity*discount));
    }

    public static void main(String[] args) {
           HW2Product obj=new HW2Product("Toys",10,3);
           obj.print();
           obj.NetPrice(10,3);

        Discount ob=new Discount("Balls",10,3,.5);
        ob.print();
        ob.NetPrice(10,3,.5);

    }
}




