package Java27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5Exception {
    public static void main(String[] args) {


FileInputStream fis=null;
        try {
            fis =new FileInputStream("C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\Batch18.xlsx");
        }catch (FileNotFoundException f){
            System.out.println("please check the path");
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }

// use should close file after using because if you opened file you cant delete it without close it
// if you left your file opened and some one need to do any thing(copy this file, delete , share ) he can not

    }
}
