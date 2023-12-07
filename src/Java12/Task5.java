package Java12;

public class Task5 {
    public static void main(String[] args) {
/*  How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/

        String str="This is sentence i want to reverse";

        String []words=str.split(" ");

        for (String w:words){
            for (int i=w.length()-1; i>=0 ;i--) {
                System.out.print(w.charAt(i));

            }
            System.out.print (" ");


        }
        //////////////////////////////////
        System.out.println(".............................");

        String []array=str.split(" ");



        for (int i=0; i< array.length; i++) {
            for (int p=array[i].length()-1; p>=0; p--){
                System.out.print(array[i].charAt(p));
            }
            System.out.println();
        }


    }
}
