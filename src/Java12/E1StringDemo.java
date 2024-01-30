package Java12;

public class E1StringDemo {
    public static void main(String[] args) {


// To divide the sentence

        String str="Its savera Birthay today. Its sunday. Today is Java Class";


        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);

        System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());

/*Looping through the array to get all the values*/
        for (int i = 0; i< strArr.length; i++) {
            System.out.print(strArr[i]+" ");
        }
        System.out.println();

        for (int p=0; p<str.length(); p++){
            System.out.print(str.charAt(p));
        }


    }
}
