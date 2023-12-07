package Java9;

public class HW2 {
    public static void main(String[] args) {

//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
 // //african countries.
//Then print all values from that array using 2 different loops and calculate how many total countries been stored.

String[][]countries={
        {"greenland","canada","mexico","usa"},
        {"chile","brazil","argentina","colombia"},
        {"france","italy","germany","greece"},
        {"japan","china","bangladesh","malaysia"},
        {"south africa","egypt","morocco"}
};
int count=0;

for (int i=0; i<countries.length; i++){
    for (int k=0; k<countries[i].length; k++){
        count++;
        System.out.print(countries[i][k]+" ");

    }
    System.out.println();


}
        System.out.print("Total of countries = " + count);


        System.out.println("........................");

        int total=0;
        for (String [] b:countries){
            for (String p:b ){
                total++;
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.print("Totall = "+total);


    }
}
