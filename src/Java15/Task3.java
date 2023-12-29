package Java15;
//Write Book class that will have 5 instance variables and 2 Constructors.
// While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
//Create print info method and call it.
public class Task3 {

    private String bookName;
    private int numberOfPages;
     private String color;
     private  String author;
    private int price;

    public Task3(String bookName, int numberOfPages, String color, String author) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.color = color;
        this.author = author;
    }

    public Task3(String bookName, int numberOfPages, String color, String author,int price) {
       this(bookName,numberOfPages,color,author);
        this.price = price;
    }

    public void print(){
        System.out.println(bookName+" "+numberOfPages+" "+color+" "+author);
    }

    public void print2(){
        System.out.println(bookName+" "+numberOfPages+" "+color+" "+author+" "+price);
    }
    public static void main(String[] args) {

        Task3 obj=new Task3("My Baby",50, "Black","Steven ");
        Task3 obj1=new Task3("My Baby",50, "Black","Steven ",20);

        obj.print();
        obj1.print2();

    }
}
