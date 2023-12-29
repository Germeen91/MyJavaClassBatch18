package review7;
/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed. If some String is passed to it,
 then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.*/
public class HW4Programming {
   public void print1(){
        System.out.println("I love programming languages" );
    }

   public void print2(String word){
       System.out.println("I love Java");
   }

    public static void main(String[] args) {
        HW4Programming obj=new HW4Programming();
        obj.print1();
        obj.print2("Java");
    }
}
