package Java19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4Poly {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chromeDriver.navigate().to("https://youtube.com");
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.close();
        chromeDriver.quit();

        FirefoxDriver firefoxDriver =new FirefoxDriver();
        firefoxDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        firefoxDriver.navigate().to("https://youtube.com");
        firefoxDriver.navigate().back();
        Thread.sleep(2000);
        firefoxDriver.close();
        firefoxDriver.quit();



    }
}
