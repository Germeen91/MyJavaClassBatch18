package Java25FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1FileHandling {
    public static void main(String[] args) throws IOException {

        //A variable to hold the location of the file
        // Go config ..>> Copy/Path Reference ..>> Absolute path

        String path="C:\\Users\\Germe\\IdeaProjects\\JavaProject\\Files\\config.proporties";

        //Navigate to this location

        FileInputStream fis=new FileInputStream(path); //This class bring this file inside your computer memory

        //This is the special class that knows how to read/write data from .properties file
        Properties properties=new Properties();
properties.load(fis);

        System.out.println(properties.getProperty("userName"));







    }
}
