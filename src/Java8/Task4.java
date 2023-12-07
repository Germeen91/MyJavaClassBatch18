package Java8;

public class Task4 {
    public static void main(String[] args) {
// show the sum of even numbers and odd numbers separately

        int []numbers={10,15,20,18,9,60,22,30};

        int sum=0,add=0;

        for (int x:numbers){
            if (x%2==0)
                sum=sum+x;
        }
        System.out.println("sum of even numbers are "+sum);



        int []number={10,15,20,18,9,60,22,30};
        for (int p:number){
            if (p%2!=0)
                add=add+p;
        }
        System.out.println("sum of odd numbers are "+add);
    }
}
