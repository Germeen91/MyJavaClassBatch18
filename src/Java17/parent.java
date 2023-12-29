package Java17;

public class parent {


    String name="isreal";  // instance in parent class          super.name

}
class  child extends parent{
     String name="Maria";    // instance                      this.name
     void  print(){

         String name="Levi";  // local var  (priority to print it )       name      if we have field same name priority to print from child class unless we use super word
         System.out.println(name);
     }
          // 1 local var    2  instance var from child      3  instance from parent

    public static void main(String[] args) {


         child c=new child();
         c.print();
    }
}