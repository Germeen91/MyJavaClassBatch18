package Java22FrameWork;

import java.util.ArrayList;

/*Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to  Remove any number that is divisible by 5 from that arrayList*/
public class Task4 {
    public static void main(String[] args) {


ArrayList <Integer> numbers=new ArrayList<>();

for (int i=2; i<=500; i+=2){
   numbers.add(i);
}
        System.out.println(numbers);

for (int p=0; p<numbers.size(); p++){

    if (numbers.get(p)%5==0){
      numbers.remove(p);
    }
}
        System.out.println(numbers);

}
    }

