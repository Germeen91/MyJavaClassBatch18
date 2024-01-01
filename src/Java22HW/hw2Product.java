package Java22HW;
/*ask: Create a Product Class for an Inventory System
Objective:
Develop a Product class for an inventory system to apply the principles of encapsulation.
Requirements:
Define Class Variables:
productID (String)
productName (String)
price (double)
stockQuantity (int)
Encapsulate the Variables:
Set all the class variables to private. This restricts direct access from outside the class.
Create a Constructor:
Define a constructor for the Product class that takes the productID, productName, price, and stockQuantity as parameters.
Implement Getter and Setter Methods:
Provide public getter and setter methods for productName, price, and stockQuantity.
Only provide a getter for productID, as it should not be changeable once set.
Additional Methods:
restock(int amount): Adds the specified amount to the stockQuantity.
sell(int amount): Reduces the stock quantity by the specified amount and returns the total sale price. Ensure the stock does not go negative.
printProductDetails(): Prints details of the product.
Test Your Class:
In your main method, create an instance of Product.
Use the setters to modify the product details as needed.
Perform restocking and selling operations.
Print product details to verify your code*/
public class hw2Product {

    private String ProductID;
    private String productName;
    private double price;
    private int stockQuantity;

    hw2Product(String ProductID, String productName, double price, int stockQuantity) {
        this.ProductID = ProductID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int restock(int amount) {
        return amount + stockQuantity;
    }

    public int sell(int amount) {
        return stockQuantity - amount;
    }

    public void printProductDetails() {
        System.out.println("The Product ID is : " + ProductID + " The product name is :" + productName +
                " The price is : " + price + " The stock Quantity : " + stockQuantity);
    }
}