package Java9;

public class Task2 {
    public static void main(String[] args) {
// Create 2D array of cars : american,german,korian,italian.
        //then retrieve all values from that array using 2 different loops

        String [][] cars={
                {"Chevrolet", "Ford", "Dodge"},
                {"Volkswagen", "BMW", "Mercedes"},
                {"Hyundai", "Kia", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}

        };


        for (int i=0; i<cars.length; i++){
            for (int j=0; j<cars[i].length; j++){

                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
            }


        for (String[] arr:cars) {
            for (String brand : arr) {

                System.out.print(brand + " ");
            }

            System.out.println();
        }
        }


    }

