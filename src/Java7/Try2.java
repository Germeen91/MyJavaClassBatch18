package Java7;

public class Try2 {
    public static void main(String[] args) {

        for (int i=0; i<5; ++i){//1
            for(int y=0 ;y<=i ;y++){//1
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<5; ++i){//1
            for(int y=i ;y<5 ;y++){//
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
