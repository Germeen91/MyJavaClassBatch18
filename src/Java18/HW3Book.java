package Java18;
/*3)Library Management System:

Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.*/
public class HW3Book {
    private String title;
    private String author;
    private  int ISBN;

    void print(){
        System.out.println("Book title " +title+" Auther "+author+" ISBN "+ISBN);
    }

    public HW3Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
class EBook extends HW3Book{
    private String downloadLink;

    public EBook(String title, String author, int ISBN, String downloadLink) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
    }

    void Link(){
        System.out.println(downloadLink);
    }
    @Override
    void print() {
        super.print();
        Link();
    }
}
class PrintBook extends HW3Book {
    private int numberOfCopies;

    public PrintBook(String title, String author, int ISBN, int numberOfCopies) {
        super(title, author, ISBN);
        this.numberOfCopies = numberOfCopies;
    }

    void num() {
        System.out.println("Numbers Of Copies :" + numberOfCopies);
    }

    @Override
    void print() {
        super.print();
        num();

    }

    public static void main(String[] args) {
        EBook obj = new EBook("The Beach House", "Rachel", 2563, "https://www.Amazon.com");
        obj.print();


        PrintBook P = new PrintBook("Piology", "Nath", 3659, 20);
        P.print();
    }
}
