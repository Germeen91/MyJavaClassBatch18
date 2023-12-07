package Java7;

public class ArrayHW1 {
    public static void main(String[] args) {
        /* Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.*/

      //  String [] animal=new String[5];// way to identify size

        String [] animal={"Java10","Cat","Lion","Bear","Horse"};


        for (int i=0;i<animal.length;i++){
            System.out.print(animal[i]+" ");
        }
        System.out.println();

        String [] animals={"Java10","Cat","Lion","Bear","Horse"};

int p=0;
        while (p< animals.length){
            System.out.print(animals[p]+" ");
            p++;
        }
    }
}
