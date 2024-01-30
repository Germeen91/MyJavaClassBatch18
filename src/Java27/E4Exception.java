package Java27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E4Exception {
    public static void main(String[] args) {

        // here checked exception // if the file is deleted we cant avoid this error
        // hover your mouse on error then>> more actions >> surround try/ catch
//// this code depend on external factor, error here Java will not run your code

        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("Please check the file");
        }


    }
}
