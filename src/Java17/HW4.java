package Java17;

/*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.*/
public class HW4 {


    private void add(String word){
        System.out.println(word);
    }
    private void add(String word , int n){
        System.out.println(word +" "+ n);
    }
    private void add(int n, String word){
        System.out.println(n +" "+ word);
    }



    public static void main(String[] args) {
HW4 obj=new HW4();
obj.add("Java");
obj.add("Java",4 );
obj.add(6,"Java");

    }
}
