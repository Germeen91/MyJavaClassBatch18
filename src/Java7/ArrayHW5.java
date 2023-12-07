package Java7;

public class ArrayHW5 {
    public static void main(String[] args) {
        /*
From an array of integer elements find the largest number and lowest number.*/

        int []num={10,5,90,65,23,41};

int largest=num[0];
int lowest=num[0];

for (int i=0; i< num.length; i++){
    if (num[i]>largest)
        largest=num[i];

    if (num[i]<lowest)
        lowest=num[i];
}
        System.out.println(largest);
        System.out.println(lowest);




    }
}
