package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google");


        Chrome chrome=new Chrome();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closBrowser();


        FireFox fireFox=new FireFox();
        fireFox.get("https://Amazon.com");
        fireFox.performTest();
        fireFox.closBrowser();


        Safari safari=new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        safari.closBrowser();

        Edge edge=new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closBrowser();

        System.out.println("**********************");


        Browser[] bArr1 = {new Chrome(),new FireFox(),new Edge(),new Safari()};// objects direct no need all above

        Browser[] bArr = {chrome,fireFox,edge,safari}; //create array same parent name
                                                      // because its big to hold child objects


        for (int i = 0; i < bArr.length; i++) {            // loop that picks all of objects one by one then places it inside the b var

            Browser b = bArr[i];      // polymorphism
           b.get("http://Amazon.com");
           b.performTest();
           b.closBrowser();

    }
}
}