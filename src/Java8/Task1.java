package Java8;

public class Task1 {
    public static void main(String[] args) {

// how many time zeeshan


        String [] names={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};

        int count=0;

        for (int i=0;i< names.length;i++){
            if (names[i].equals("Zeeshan")){
                count++;

            }
        }
        System.out.println("Zeeshan apeared "+ count +" times");


    }
}
