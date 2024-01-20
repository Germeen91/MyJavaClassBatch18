package Java25FileHandling;

import Java25Utils.ConfigReader;

import java.io.IOException;

public class E2FileHandling {
    public static void main(String[] args) throws IOException {

        String s= ConfigReader.read("browser");// Static not need obj it is belong the class

        System.out.println(s);







    }
}
