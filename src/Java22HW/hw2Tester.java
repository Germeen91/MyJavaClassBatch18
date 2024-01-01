package Java22HW;

public class hw2Tester {
    public static void main(String[] args) {

hw2Product obj=new hw2Product("025","Dairy",6.5,10);

obj.printProductDetails();
int s=obj.restock(2);
        System.out.println(s);

        int p= obj.sell(4);
        System.out.println(p);

        System.out.println(obj.getProductID());
        System.out.println(obj.getProductName());
        System.out.println(obj.getPrice());
        System.out.println(obj.getStockQuantity());

        obj.setProductName("fruits");
        System.out.println(obj.getProductName());


        obj.setPrice(5.5);
        System.out.println(obj.getPrice());

        obj.setStockQuantity(2);
        System.out.println(obj.getStockQuantity());
    }
}
