package Java13;


//Create a method that will say Hello in different language
// based on the country that will passed when method is executed. Do it for any five countries
public class Hw2 {
    void language(String country){
        if (country.equalsIgnoreCase("Egypt")){
            System.out.println("Marhab");
        } else if (country.equalsIgnoreCase("USA")) {
            System.out.println("Hello");
            
        } else if (country.equalsIgnoreCase("Italy")) {
            System.out.println("Ciao");
            
        } else if (country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        } else if (country.equalsIgnoreCase("Spain")) {
            System.out.println("Hola");
        }

    }
    public static void main(String[] args) {

        Hw2 obj=new Hw2();

        obj.language("egypt");


    }
}
