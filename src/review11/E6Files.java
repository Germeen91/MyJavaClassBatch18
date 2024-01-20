package review11;

import Java25Utils.ConfigReader;

import java.io.IOException;

public class E6Files {
    public static void main(String[] args) throws IOException {

        // Any where we need

        String browser= ConfigReader.read("browser");
        System.out.println(browser);



    }
}
