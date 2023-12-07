package Java8;

public class Task5 {
    public static void main(String[] args) {

        // int [] numbers={10,15,20,18,9,60,22,30};

        // print true if array is sorted otherwise print false

        int []numbers={10,15,20,18,9,60,22,30};
boolean isSorted=true;

for (int i=0; i< numbers.length-1; i++) {
    if (numbers[i] > numbers[i + 1]) {
        isSorted = false;
        break;
    }
}
        System.out.println("Is loop sorted "+ isSorted);
    }
    }

