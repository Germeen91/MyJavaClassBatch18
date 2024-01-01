package Java22InterFaces;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize chrome ");
    }

    @Override
    public void findElement() {
        System.out.println("findElement in chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open fireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close fireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize firFox");
    }

    @Override
    public void findElement() {
        System.out.println("findElement in fireFox");
    }
}