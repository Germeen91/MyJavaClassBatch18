package review5;

public class class1 {
    public static void main(String[] args) {


        int []num={10,25,36,56,80,50,60};

// write the element in even index

        for (int n=0; n<num.length; n++){
            if (n%2==0){
                System.out.println(num[n]);
            }
        }


        for (int n=0; n<num.length; n=n+2){
                System.out.println(num[n]);
            }




        }

    }

