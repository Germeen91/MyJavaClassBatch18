package Java7;

public class BreakAndContinue {
    public static void main(String[] args) {
    // we use continue after if condition to Exclude or Except
        //then continue
        // but break to stop repetitive the loop after
        // achieve condition
// break here for (for loop ) to break
        // but in (while loop) we declare var then while(the condition is true) >> then break it by using reverse of var
        for (int p=1;p<4;p++){
            for (int l=1;l<=3;l++){
                if (l==2){
                    break;  }  //will stop when find number 2 and not continue
                System.out.print(l+" ");
            }
            System.out.println();
            }

        System.out.println(".............");


        for (int p=1;p<4;p++){
            for (int l=1;l<=3;l++){
                if (l==2){
                    continue;}     // will print all number except 2
                System.out.print(l+" ");
            }
            System.out.println();
        }





        }








    }

