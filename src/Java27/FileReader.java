package Java27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

// add exception more JVM(main method) will add more exception will terminate your project
    // so add try/ catch good idea
    static void readFile() throws FileNotFoundException {// 1-throw mean throw the responsibility on someone else
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
    }

    public static void main(String[] args) {

//readFile   2- who will use this method will get error

        try{
            readFile();
        }catch (FileNotFoundException f){
            System.out.println("Please check the file path");
        }

    }
}
