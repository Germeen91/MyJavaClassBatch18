package Java7;

public class NestedLoop {
    public static void main(String[] args) {


        for (int c=0;c<3;++c){           //the outer loop controls how many times execute//if outer false nothing will print
                                         // in each time in inner loop
            for (int t=0;t<5;++t){       // inner controls the print , outer controls the whole codes
                System.out.print("*");   // inner loop controls number of stars "how many starr im gonna print them"
            }
            System.out.println();      // outer controls numbers of rows

        }

        System.out.println();

        for (int row=0;row<5;++row){                    //the outer loop controls how many times execute
                                                        // in each time in inner loop
            for (int column=1;column<=10;++column){       // inner controls the print , outer controls the whole codes
                System.out.print(row);                   // inner loop controls number of stars"what I have to print"
                                                           //المحتوي اللي عاوز اطبعه
            } System.out.println();                      // outer controls numbers of rows

        }





















    }


}
