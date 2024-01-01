package Java22InterFaces;

public class WebTester {
    public static void main(String[] args) {

        ChromeDriver c=new ChromeDriver();
        c.openBrowser();
        c.closeBrowser();
        c.maximizeWindow();
        c.findElement();

        FirefoxDriver f=new FirefoxDriver();
        f.openBrowser();
        f.closeBrowser();
        f.maximizeWindow();
        f.findElement();

        WebDriver []array={c,f};
        for (int i=0; i<array.length; i++){
            WebDriver w=array[i];
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();

        }

    }
}
