package Java8;

public class Task3 {
    public static void main(String[] args) {

        // to count how many numbers divisible by 5 and how many numbers divisible by 2

        int []numbers={101,100,25,30,25,50,300};

        int n5=0, n2=0;

        for(int x:numbers){
            if(x%5==0){
                n5++;
            }
            if(x%2==0){
                n2++;
            }
        }
        System.out.println("Numbers divisible by 5 are "+n5);
        System.out.println("Numbers divisible by 2 are "+n2);

        System.out.println();
/////////////////////////////////////////////////////////////////////
        int coun5=0;
        int coun2=0;

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]%5==0){
                coun5++;}

            if (numbers[i]%2==0){
                coun2++;}


        }
        System.out.println(coun2);
        System.out.println(coun5);



    }
}
