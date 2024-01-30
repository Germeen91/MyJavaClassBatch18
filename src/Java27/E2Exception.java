package Java27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2Exception {
    public static void main(String[] args) {
// not important error >> Java wil not tell you solution
        //

        int number1=10;
        int number2=0;
        System.out.println(number1/number2);

// important error >> Java will tell you solution
        //FileInput will be read >> hover your mouse >> more actions >> surround with try/catch
        try {
            FileInputStream fis=new FileInputStream("sbjsd");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
