package com.syntax.class27.Task;

public interface WebDriver {

    /* Create a WebBrowser Interface that will have the following unimplements behaviour:
       openBrowser(), closeBrowser(); maximizeWindow(); findElement();
       Create two classes that implements WebDriver interface; ChromeDriver and FireFoxDriver. */

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Google Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find an elements in Google Chrome");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find an elements in FireFox browser");
    }
}
