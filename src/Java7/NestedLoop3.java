package Java7;

public class NestedLoop3 {
    public static void main(String[] args) {


        for (int r=0;r<4;r++){

            for (int col=0;col<5;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }



        for (int r=1;r<=4;r++){   //4 row

            for (int col=1;col<=4;col++){  // in each row print  1 2 3 4 if you ask print col
                System.out.print(r+" ");       //  1 1 1 1 if you ask to print r repetitive 4
            }
            System.out.println();
         // try print r +""+col




        }
    }
}
