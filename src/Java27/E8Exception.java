package Java27;

import java.io.FileInputStream;
import java.io.IOException;

public class E8Exception {
    public static void main(String[] args) {


// after java 8 we not need finally (this is called try with resources)
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx")) {

        }catch (IOException e){
            System.out.println("Please check the file path");
        }




    }
}
