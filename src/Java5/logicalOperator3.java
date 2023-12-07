package Java5;

public class logicalOperator3 {
    public static void main(String[] args) {

        boolean condition1=true;
        boolean condition2=true;
        // if any condition is true and other false java take true because the condition still live
        //java take total of condition as a true first " at least one condition is true"

        if(condition1||condition2){
            System.out.println("if");
        }else {
            System.out.println("else");
        }
        if(!condition1||condition2){ //(!(condition1||condition2))
            System.out.println("if");
        }else {
            System.out.println("else");
        }
boolean n=true;
        boolean n2=false;

        if(!(n||n2)){
            System.out.println("if");
        }else {
            System.out.println("else");
        }












    }
}
