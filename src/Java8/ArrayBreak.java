package Java8;

public class ArrayBreak {
    public static void main(String[] args) {

        int [] numbers={10,25,26,30,40,45,45};


        for (int i=0;i < numbers.length;i++){  // numbers.length is the size of array
            System.out.println(numbers[i]);
        }

        for (int i=0;i < numbers.length;i++){  // numbers.length is the size of array
            if (numbers[i]==26){
                System.out.println("Number 26 id present");

                                           // if you got the number it will terminate the remaining iterations

                System.out.println();



                int [] number={10,25,26,30,40,45,45};
                for (int L = 0; L <numbers.length; L++) {
                    if(number[L]==26){
                        System.out.println("Number 26 is present");
                        break;

                    }
                }








            }
        }








    }
}
