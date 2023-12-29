package Java17;
/*Create a method to find the minimum of two numbers. Method will be passed two parameters and will
return the minimum number. Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5*/
public class HW1 {

   public int num (int n1, int n2) {

        if (n1 > n2) {

        return n2;
        }else {

            return n1;
        }

    }

    public double num(double n1, double n2){
       if (n1>n2){
           return n2;
       }else {
           return n1;
       }

    }

    public static void main(String[] args) {

       HW1 obj=new HW1();
       int mm=obj.num(3,5);
        System.out.println(mm);

        System.out.println(obj.num(6.5,8.5));
    }


}
