package Java3;

public class task5 {
    public static void main(String[] args) {


        int day=4;

        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");//java foud the true condition here so java ignored all conditions after that
        }else if(day==5){
            System.out.println("Friday");

        }else {
            System.out.println("Wrong");
        }
    }
}
