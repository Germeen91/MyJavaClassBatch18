package Java19Poly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5Poly {
    public static void main(String[] args) throws InterruptedException {


        // webDriver is the parent of all browsers and hold all

        WebDriver [] array={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};

        // create loop to pick all object one by one
for (int i=0; i< array.length; i++){

    WebDriver webDriver=array[i];
    webDriver.navigate().to("https://amazon.com");
    Thread.sleep(2000);
    webDriver.navigate().to("https://youtube.com");
    webDriver.navigate().back();
    Thread.sleep(2000);
    webDriver.close();
    webDriver.quit();
}


    }
}
